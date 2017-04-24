package fr.ul.miage.generateur;

import fr.ul.miage.structure.arbre.Noeud;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import fr.ul.miage.structure.arbre.Arbre;
import fr.ul.miage.tablesymboles.TableSymboles;
import fr.ul.miage.tablesymboles.Symbole;
/**
 * analyseur syntaxique  d'un langage fictif:: Generateur
 *
 * @author : Laurene Cladt, Alexis Geng, Benjamin Rath, Enzo Proux
 * (c) 2017
 */ 

// Le g�n�rateur fonctionne dans ce sens :  
//Il nous faut le Data (tds) 
//Programme _ Code (Fonctions) _ Instruction (avec affectation, boucle, condition ...) _ Expression (calcul)

public class Generateur {
	public TableSymboles tds;
	public Arbre a;
	String fonction;
	int j = 0; //compteur du nombre de bloc
	int nbrSi=0; // Compteur du nombre de condition dans le programme
	int nbwhile=0; // Compteur du nombre de boucle au sein du programme
	int nbrBoucle=0; //Compteur du nombre de boucles dans le programme
	Noeud pere;
	
	/**
	 * Constructeur de base pour notre generateur 
	 * @param tds: Table des symboles
	 * @param a: Arbre
	 */
	public Generateur(TableSymboles tds, Arbre a) {
		super();
		this.tds = tds;
		this.a = a;
	}
	
	/**
	 * M�thode qui va permettre de G�n�rer le code principal en Assembleur
	 * @return StringBuffer, puisqu'on va enorm�ment concat�ner nos chaines de caractère pour cr�er le code en assembleur
	 */
	public StringBuffer genererProgramme(){
		StringBuffer res = new StringBuffer("|G�n�rer un programme de notre langage fictif\n");
		res.append(".include beta.uasm");
		if(this.genererData()!=null){
			res.append(this.genererData().append("\n\n"));
		}
		res.append("\ndebut:\n\tCMOVE(pile,SP)\n\tCALL(main)\n\tHALT()\n\n");
		res.append(this.genererCode().append("\n\n"));
		res.append("pile:");
		return res;

	}
	
	

	/**
	 * M�thodes qui doit G�n�rer les variables globales
	 * @return Le code assambleur pour G�n�rer les variables globales 
	 */
	
	private StringBuffer genererData() {
		StringBuffer res = new StringBuffer("|G�n�rer Data\n");
		// keyset retourne la cl� de notre hashmap(tds)
		for(String v: tds.getTable().keySet()){
			// on verifie que c'est une variable globale
			if(tds.get(v).isGlobalVariable()){
				String [] tab= v.split("_");
				String t = tab[1];
				// On met "long" puisque dans nos exemple nous avons seulement des entiers
				if(tds.get(v).getVal()==null){
					res.append("\t" + t + ":LONG()\n");
				}
				else{
					res.append("\t" + t + ":LONG(" + tds.get(v).getVal().toString()+ ")\n");
				}
				
			}
			
		}
		return res;
	}
	
	
	/**
	 * M�thode qui g�re le code d'un programme, qui doit donc ensuite appeler la m�thode G�n�rer_fonction
	 * @return StringBuffer: code des fonctions en assembleur 
	 */

	private StringBuffer genererCode() {
		StringBuffer res = new StringBuffer("|G�n�rer code\n");
		
		for (Noeud nf : a.getRacine().getFils()) {
			res.append(this.genererFonction(nf));
		}
		return res;
	}
	
	/**
	 *  M�thode qui g�re les fonctions
	 * @param nf: noeud de la fonction
	 * @return StringBuffer: g�re le code assembleur des fonctions
	 */
	private Object genererFonction(Noeud nf) {
		StringBuffer res = new StringBuffer("");
		
		if (nf != null) {
			res = new StringBuffer("\n|generer_fonction\n");
			
			if(nf.getPointeur()!=null){
				fonction = nf.getPointeur() + "_";
				Symbole s = tds.get(nf.getPointeur().toString());
				if (s == null) {
					s = tds.get("null_" + nf.getPointeur());
		
				} 
			}
			res.append(nf.getPointeur()
					+ ":\n\tPUSH(LP)\n\tPUSH(BP)\n\tMOVE(SP,BP)\n\tALLOCATE("
					+ 1 + ")\n");
			for (Noeud f : nf.getFils()) {
				res.append(this.genererInstruction(f));
			}
			if(nf.getPointeur()!=null){
				if (nf.getPointeur().equals("main")) {
					res.append("\n\tHALT()");
				}
			}
			res.append("\nret_" + nf.getPointeur() + ":\n\tDEALLOCATE("
					+1 + ")\n\tPOP(BP)\n\tPOP(LP)\n\tRTN()");
			fonction = "";

		}
		return res;
	}
	
	/**
	 * M�thode qui g�re les instructions
	 * @param nf: noeud des instructions
	 * @return StringBuffer: g�re le code assembleur des instructions
	 */
	private Object genererInstruction(Noeud nf) {
		StringBuffer res = new StringBuffer("|G�n�rer instruction\n");
		// Switch sur les diff�rents cas que l'on peut retrouver au sein d'un programme
		if(nf!=null){
		switch (nf.getVal()) 
		{
		// d�claration 
		case Noeud.DEC:
			for (Noeud n : nf.getFils()) {
				Symbole val = tds.get(fonction+n.getPointeur());
				res.append("\n\tCMOVE(" + val.getVal() + ",r0)");
				String[] t = fonction.split("_");
				Symbole s = tds.get("null _ " + t[0]); // on r�cupère l'�l�ment avant la variable
				int cb = (Integer.parseInt((s.getNbloc())) + 1 + j) * (4); //on comptre le nombre de bloc *4 (on compte en 4 octets)
				res.append("\n\tPUTFRAME(r0," + cb + ")");
				j++;
			}
			j = 0;
			break;
		case Noeud.EQ:
			// Cas d'une affectation
			res.append(genererAffectation(nf));
			break;
		case Noeud.IF:
			res.append(genererIf(nf));
			break;
		case Noeud.RETURN:
			res.append(genererReturn(nf));
			break;
		case Noeud.WH:
			res.append(genererBoucle(nf));
			break;
		case Noeud.ECRIRE:
			res.append(genererEcriture(nf));
			break;
		case Noeud.APPEL:
			res.append("\tALLOCATE(" + nf.getFils().size() + ")");
			for (Noeud n : nf.getFils()) {
				res.append("\n\tCMOVE(" + n.getVal() + ",r0)");
				String[] t = fonction.split("_");
				Symbole s = tds.get("null_ " + t[0]);
				int cb = (Integer.parseInt((s.getNbloc())) + 2 + j) * (-4);
				res.append("\n\tPUTFRAME(r0," + cb + ")");
				j++;
			}
			j = 0;
			res.append("\n\tCALL(" + nf.getPointeur() + ")\n\t");
		default:
			res.append(genererExpression(nf));
		}
		}
		return res;
	}
	
	/**
	 * M�thode qui g�n�re les diff�rentes expressions possibles du programme
	 * @param nf: noeud
	 * @return StringBuffer: code assembleur
	 */
	private Object genererExpression(Noeud nf) {
		StringBuffer res = new StringBuffer("|G�n�rer expression\n");
		// Switch sur les diff�rents cas que l'on peut retrouver au sein d'un programme
		switch(nf.getVal())
		{
		case Noeud.ADD:
			Noeud filsgauche = nf.getFils().get(0);
			Noeud filsdroit = nf.getFils().get(1);
			res.append("\t" + genererExpression(filsgauche));
			res.append("\t" + genererExpression(filsdroit));
			res.append("\n\tPOP(r2)\n\tPOP(r1)\n\tADD(r1,r2,r3)\n\tPUSH(r3)");
			break;
		case Noeud.CONST:
			res.append("\n\tCMOVE("+nf.getPointeur().toString()+", r0)\n\tPUSH(r0)");
			break;
		case Noeud.APPEL:
			res.append("ALLOCATE(1)\n\t");
			for (int i =0 ; i <=nf.getFils().size() - 1; i++) {
				res.append(genererExpression(nf.getFils().get(i)));
			}
			res.append("\tCALL(" + nf.getPointeur() + ")");
			break;
		case Noeud.EGAL:
			Noeud filsdroits = nf.getFils().get(1);
			Noeud filsgauches = nf.getFils().get(0);
			res.append("\t" + genererExpression(filsgauches));
			res.append("\t" + genererExpression(filsdroits));
			res.append("\n\tPOP(r2)\n\tPOP(r1)\n\tCMPEQ(r1,r2,r3)\n\tPUSH(r3)");
			break;
		case Noeud.DIFF:
			Noeud filsdroits0 = nf.getFils().get(1);
			Noeud filsgauches0 = nf.getFils().get(0);
			res.append("\t" + genererExpression(filsgauches0));
			res.append("\t" + genererExpression(filsdroits0));
			res.append("\n\tPOP(r2)\n\tPOP(r1)\n\tCMPNE(r1,r2,r3)\n\tPUSH(r3)");
			break;
			// Pas sûr de ce cas 
		case Noeud.IDF:
			res.append("\n\tLD("+nf.getVal()+", r0)\n\tPUSH(r0)");
			break;
		case Noeud.INF:
			Noeud filsdroits1 = nf.getFils().get(1);
			Noeud filsgauches1 = nf.getFils().get(0);
			res.append("\t" + genererExpression(filsgauches1));
			res.append("\t" + genererExpression(filsdroits1));
			res.append("\n\tPOP(r2)\n\tPOP(r1)\n\tCMPLT(r1,r2,r3)\n\tPUSH(r3)");
			break;
		case Noeud.SUP:
			Noeud filsgauches2 = nf.getFils().get(0);
			Noeud filsdroits2 = nf.getFils().get(1);
			res.append("\t" + genererExpression(filsgauches2));
			res.append("\t" + genererExpression(filsdroits2));
			res.append("\n\tPOP(r2)\n\tPOP(r1)\n\tCMPLT(r2,r1,r3)\n\tPUSH(r3)");
			break;
		case Noeud.SUPEGAL:
			Noeud filsgauches3 = nf.getFils().get(0);
			Noeud filsdroits3 = nf.getFils().get(1);
			res.append("\t" + genererExpression(filsgauches3));
			res.append("\t" + genererExpression(filsdroits3));
			res.append("\n\tPOP(r2)\n\tPOP(r1)\n\tCMPGE(r2,r1,r3)\n\tPUSH(r3)");
			break;
		case Noeud.INFEGAL:
			Noeud filsgauches4 = nf.getFils().get(0);
			Noeud filsdroits4 = nf.getFils().get(1);
			res.append("\t" + genererExpression(filsgauches4));
			res.append("\t" + genererExpression(filsdroits4));
			res.append("\n\tPOP(r2)\n\tPOP(r1)\n\tCMPGE(r1,r2,r3)\n\tPUSH(r3)");
			break;
		case Noeud.SUB:
			Noeud filsgauche1 = nf.getFils().get(0);
			Noeud filsdroit1 = nf.getFils().get(1);
			res.append("\t" + genererExpression(filsgauche1));
			res.append("\t" + genererExpression(filsdroit1));
			res.append("\n\tPOP(r2)\n\tPOP(r1)\n\tSUB(r1,r2,r3)\n\tPUSH(r3)");
			break;
		case Noeud.MUL:
			Noeud filsgauche2 = nf.getFils().get(0);
			Noeud filsdroit2 = nf.getFils().get(1);
			res.append("\t" + genererExpression(filsgauche2));
			res.append("\t" + genererExpression(filsdroit2));
			res.append("\n\tPOP(r2)\n\tPOP(r1)\n\tMUL(r1,r2,r3)\n\tPUSH(r3)");
			break;
		case Noeud.LEC:
			res.append("\t" + genererLecture());
			break;
		default:
			System.out.println("Ce noeud :" + nf.getVal()+" ne peut �tre trait� !");
			break;
		}
		
		return res;
	}

	
	/**
	 * M�thode pour G�n�rer les fonctions de lecture
	 * @return StringBuffer: code assembleur
	 */
	private StringBuffer genererLecture() {
		StringBuffer res = new StringBuffer("|G�n�rer lecture\n");
		res.append("\n.....\n\tPUSH()"); 
		return res;
	}

	/**
	 * M�thode pour g�nrer les fonctions d'�critue
	 * @param nf:noeud
	 * @return StringBuffer: code assemebleur
	 */
	private StringBuffer genererEcriture(Noeud nf) {
		StringBuffer res = new StringBuffer("|G�n�rer ecriture\n");
		res.append(genererExpression(nf.getFils().get(0)));
		res.append("\nPOP(r0)\n\t .......");
		return res;
	}


	

	private StringBuffer genererBoucle(Noeud nf) {
		StringBuffer res = new StringBuffer("|G�n�rer Boucle\n");
		res.append("\nWhile"+nbrBoucle+":\n\t");
		res.append("\n\t"+this.genererExpression(nf.getFils().get(0))); //pas sûre que ca soit bien expression et non condition
		res.append("\n\tPOP(r0)\n\tBF(Done"+nbrBoucle+":)");
		res.append("\n\t"+this.genererBloc(nf.getFils().get(0)));
		res.append("\n\tBR(While"+nbrBoucle+":)\nDone"+nbrBoucle+":");
		return res;
	}

	private StringBuffer genererReturn(Noeud nf) {
		StringBuffer res = new StringBuffer("|G�n�rer Return\n");
		//nf a 0 ou 1 fils ; si 1 fils alors c'est forcement une expression
		Noeud n = nf.getFils().get(0);
		if (n != null) {
			Symbole s = tds.get(n.getPointeur() + "_" + n.getPointeur());
			res.append("\n\t"+this.genererExpression(n)+"\n\tPOP(r0)");
			
			if(s!=null){
			int b=Integer.parseInt(s.getNbparam())-2*(4); 
			res.append("\n\tPUTFRAME(r0,"+b+")");
			}
		}				
		res.append("\n\tBR(ret_"+n.getPointeur()+")");
		return res;
	}
	
	/**
	 * M�thode qui permet de G�n�rer les conditions 
	 * @param nf: noeud des conditions
	 * @return StringBuffer

	 */
	private StringBuffer genererIf(Noeud nf) {
		StringBuffer res = new StringBuffer("|G�n�rer if\n");
		res.append("\nsi" + nbrSi + ":\n\t");
		res.append(genererExpression(nf.getFils().get(0)) + "\n\tPOP(r0)\n\tBF(r0,sinon" + nbrSi + ")");
		res.append(genererBloc(nf.getFils().get(1)) + "\n\tBR(si" + nbrSi + ")\nsinon" + nbrSi + ":\n");
		if (nf.getFils().size() > 2) {
			res.append(genererBloc(nf.getFils().get(2)) + "\n|FSI");
		} else {
			res.append("\n|FSI\n");
		}
		nbrSi++;
		return res;	
	}
	
	/**
	 * M�thode qui permet de G�n�rer les bloc
	 * @param nf: noeud
	 * @return StringBuffer: code assembleur
	 */
	private StringBuffer genererBloc(Noeud nf) {
		StringBuffer res = new StringBuffer("|G�n�rer bloc\n");
		for (Noeud n1 : nf.getFils()) {
			res.append(genererExpression(n1));
		}
		return res;
	}
	
	/**
	 * M�thode qui va G�n�rer les affectations
	 * @param nf: noeud
	 * @return StringBuffer: code assembleur
	 */
	private StringBuffer genererAffectation(Noeud nf) {
		StringBuffer res = new StringBuffer("|G�n�rer affectation\n");
		Noeud filsgauche = nf.getFils().get(0);
		Noeud filsdroit = nf.getFils().get(1);
		res.append(genererInstruction(filsdroit));
		res.append("\n\n\tPOP(r0)\n\tST(r0," + filsgauche.getPointeur() + ")\n");	
		return res;
	}
	
	
	/**
	 * M�thode qui permet l'�criture du StringBuffer
	 * @param sb : String qui va �tre �crit en assembleur
	 */

	public void generation(String sb, String nb) {
		try {
			BufferedWriter bw;
			bw = new BufferedWriter(new FileWriter(new File(
					"/Users/Alexis/Desktop/TestCompil/test"+nb+".asm")));
			bw.write(sb);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

