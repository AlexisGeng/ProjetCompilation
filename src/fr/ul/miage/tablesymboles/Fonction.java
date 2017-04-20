package fr.ul.miage.tablesymboles;

/**
 * Classe permettant de stocker les fonctions 
 * @author auteurs : Laurene Cladt, Alexis Geng, Benjamin Rath, Enzo Proux
 * (c) 2017
 * 
 *
 */

public class Fonction {

	private String nom;
	private String retour;
	private int nbParam;
	/**
	 * Constructeur
	 * @param nom : nom de la fonction
	 * @param retour : retour de la fonction (int ou void)
	 * @param nbParam : nombre de paramètres
	 */

	public Fonction(String nom, String retour, int nbParam) {
		super();
		this.nom = nom;
		this.retour = retour;
		this.nbParam = nbParam;
	}
	
	/**
	 * Accesseur pour le nom
	 * @return le nom
	 */

	public String getNom() {
		return nom;
	}
	
	/**
	 * Modification du nom
	 * @param nom
	 */

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Accesseur pour le retour (int ou void)
	 * @return le retour
	 */

	public String getRetour() {
		return retour;
	}
	
	/**
	 * Modification du retour
	 * @param retour
	 */

	public void setRetour(String retour) {
		this.retour = retour;
	}

	/**
	 * Accesseur pour le nombre de paramètre
	 * @return le nombre de paramètre
	 */
	
	public int getNbParam() {
		return nbParam;
	}
	
	/**
	 * Modification du nombre de Paramètre
	 * @param nombre de paramètre
	 */

	public void setNbParam(int nbParam) {
		this.nbParam = nbParam;
	}

	public boolean equals(Fonction fonction) {
		return this.nom.equals(fonction.nom)
				&& this.retour.equals(fonction.retour)
				&& this.nbParam == fonction.nbParam;
	}
	
	/**
	 * Méthode D'affichage
	 */

	public String toString() {
		return "nom : " + this.nom + " retour : " + this.retour + " nbParam : "
				+ this.nbParam;
	}
	
	
}
