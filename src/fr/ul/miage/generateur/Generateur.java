package fr.ul.miage.generateur;

import fr.ul.miage.structure.arbre.Noeud;
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
//Programme -> Code (Fonctions) -> Instruction (avec affectation, boucle, condition ...) -> Expression (calcul)

public class Generateur {
	public TableSymboles tds;
	public Arbre a;
	
	
	
	
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
	 * M�thode qui va permettre de g�n�rer le code principal en Assembleur
	 * @return StringBuffer, puisqu'on va enorm�ment concat�ner nos chaines de caract�re pour cr�er le code en assembleur
	 */
	public StringBuffer generer_programme(){
		StringBuffer res = new StringBuffer("|G�n�rer un programme de notre langage fictif\n");
		res.append(".include beta.uasm");
		res.append(this.generer_data().append("\n\n"));
		res.append("\ndebut:\n\tCMOVE(pile,SP)\n\tCALL(main)\n\tHALT()\n\n");
		res.append(this.generer_code().append("\n\n"));
		//res.append("pile:");
		return res;

	}
	
	

	/**
	 * M�thodes qui doit g�n�rer les variables globales
	 * @return Le code assambleur pour g�n�rer les variables globales 
	 */
	
	private StringBuffer generer_data() {
		StringBuffer res = new StringBuffer("|G�n�rer Data\n");
		// keyset retourne la cl� de notre hashmap(tds)
		for(String v: tds.getTable().keySet()){
			// on verifie que c'est une variable globale
			if(tds.get(v).isGlobalVariable()){
				String [] tab= v.split(" ");
				String t = tab[1];
				// On met "long" puisque dans nos exemple nous avons seulement des entiers
				res.append("\t" + t + ":LONG(" + tds.get(v).getVal().toString()
						+ ")\n");
			}
		}
		return null;
	}
	
	
	/**
	 * M�thode qui g�n�re le code d'un programme, qui doit donc ensuite appeler la m�thode g�n�rer_fonction
	 * @return StringBuffer: code des fonctions en assembleur 
	 */

	private StringBuffer generer_code() {
		StringBuffer res = new StringBuffer("|G�n�rer code\n");
		for (Noeud nf : a.getRacine().getFils()) {
			res.append(this.generer_fonction(nf));
		}
		return res;
	}
	
	/**
	 *  M�thode qui g�n�re les fonctions
	 * @param nf: noeud de la fonction
	 * @return StringBuffer: g�n�re le code assembleur des fonctions
	 */
	private Object generer_fonction(Noeud nf) {
		StringBuffer res = new StringBuffer("");
		//si le noeud n'est pas null
		if (nf != null) {
			res = new StringBuffer("|G�n�rer fonction\n");
			// on r�cupere notre fonction
			String fonction = nf.getPointeur() + "_";
			Symbole s = tds.get(fonction + nf.getPointeur() );
			// si par exemple notre fonction "f" n'a pas d'ant�c�dent comme "main_f" alors c'est �gale � null
			if (s == null) {
				// on r�cup�re le symbole
				s = tds.get("null_" + nf.getPointeur());
			}
			res.append(nf.getPointeur()
					+ ":\n\tPUSH(LP)\n\tPUSH(BP)\n\tMOVE(SP,BP)\n\tALLOCATE("
					+ s.getNbloc() + ")\n");
			// on parcours ensuite les fonctions pour y g�n�rer les diff�rentes instructions 
			for (Noeud n : nf.getFils()) {
				res.append(this.generer_instruction(n));
			}
			if (nf.getPointeur().equals("main")) {
				res.append("\n\tHALT()");
			}
			res.append("\nret_" + nf.getPointeur() + ":\n\tDEALLOCATE("
					+ s.getNbloc() + ")\n\tPOP(BP)\n\tPOP(LP)\n\tRTN()");
		}
		return res;
	}

	private Object generer_instruction(Noeud f) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

