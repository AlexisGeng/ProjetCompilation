package fr.ul.miage.generateur;

import fr.ul.miage.structure.arbre.Arbre;
import fr.ul.miage.tablesymboles.TableSymboles;

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
	 * @return
	 */
	
	private StringBuffer generer_data() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/**
	 * M�thode qui g�n�re le code d'un programme, qui doit donc ensuite appeler la m�thode g�n�rer_fonction
	 * @return
	 */

	private StringBuffer generer_code() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

