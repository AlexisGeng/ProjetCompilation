package fr.ul.miage.generateur;

import fr.ul.miage.structure.arbre.Arbre;
import fr.ul.miage.tablesymboles.TableSymboles;

/**
 * analyseur syntaxique  d'un langage fictif:: Generateur
 *
 * @author : Laurene Cladt, Alexis Geng, Benjamin Rath, Enzo Proux
 * (c) 2017
 */ 

// Le générateur fonctionne dans ce sens :  
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
	 * Méthode qui va permettre de générer le code principal en Assembleur
	 * @return StringBuffer, puisqu'on va enormément concaténer nos chaines de caractère pour créer le code en assembleur
	 */
	public StringBuffer generer_programme(){
		StringBuffer res = new StringBuffer("|Générer un programme de notre langage fictif\n");
		res.append(".include beta.uasm");
		res.append(this.generer_data().append("\n\n"));
		res.append("\ndebut:\n\tCMOVE(pile,SP)\n\tCALL(main)\n\tHALT()\n\n");
		res.append(this.generer_code().append("\n\n"));
		//res.append("pile:");
		return res;

	}
	
	

	/**
	 * Méthodes qui doit générer les variables globales
	 * @return
	 */
	
	private StringBuffer generer_data() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/**
	 * Méthode qui génère le code d'un programme, qui doit donc ensuite appeler la méthode générer_fonction
	 * @return
	 */

	private StringBuffer generer_code() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

