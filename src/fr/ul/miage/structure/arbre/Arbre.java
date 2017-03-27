package fr.ul.miage.structure.arbre;

public class Arbre {
	private Noeud racine;
	private Noeud apres;
	/**
	 * Constructeur
	 * @param a Noeud racine
	 */
	public Arbre(Noeud a){
		racine = a;
	}
	
	/**
	 * Accesseur de la racine
	 * @return le Noeud racine
	 */

	public Noeud getRacine() {
		return racine;
	}
/**
 * Modification de la racine
 * @param racine Nouvelle racine
 */
	public void setRacine(Noeud racine) {
		this.racine = racine;
	}
	
	/**
	 * Méthode d'affichage
	 */
	
	public String toString(){
		String res = null;
		res = this.getRacine().toString();
		return res;
	}
	
	/**
	 * Méthode d'affichage complet de l'arbre
	 */
	
	public void affichage(){
	
		System.out.println(this);
	}
}
