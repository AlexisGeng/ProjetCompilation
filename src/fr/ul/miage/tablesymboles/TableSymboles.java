package fr.ul.miage.tablesymboles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import fr.ul.miage.structure.arbre.*;
import fr.ul.miage.tablesymboles.Symbole;

public class TableSymboles {
	
	/**************
f_n : int, null, f, param, 0, 0
f : int, null, glob, fonction, 2, 1
x : int, 3, glob, var, 0, 0
z : int, 34, glob, var, 0, 0
main : void, null, glob, fonction, 0, 1
main_x : int, 2, main, var, 0, 0
f_az : int, null, f, param, 0, 0
*/
	
	private HashMap<String, Symbole> tableSymboles;
	private ArrayList<Symbole> listeVarTemporaire;
	private ArrayList<Integer> listeParametre;
	private ArrayList<Integer> listeLoc;
	
	
	/**
	 * Constructeur de base
	 */

	public TableSymboles() {
		tableSymboles = new HashMap<String, Symbole>();
		listeVarTemporaire = new ArrayList<Symbole>();
		listeParametre = new ArrayList<Integer>();
		listeLoc = new ArrayList<Integer>();
	}
	
	public TableSymboles(HashMap<String,Symbole> t){
		this.tableSymboles = t;
	}
	
	public TableSymboles(String nom, Symbole s){
		
		tableSymboles = new HashMap<String,Symbole>();
	}

	
	public void add(Symbole s) {
		this.tableSymboles.put(s.getIdentifiant(), s);
	}
	
	public Symbole get(String s) {
		return tableSymboles.get(s);
	}
	
	public HashMap<String, Symbole> getTable() {
		return tableSymboles;
	}
	
	// vérifie si un symbole est deja dans la table
	public boolean rechercheSymbole(Symbole s){
		
		return tableSymboles.containsKey(s.getIdentifiant());
	}
	
	/**
	 * Méthode qui ajoute dans la Table des Symboles
	 * @param nom nom de l'entrée
	 * @param symb symbole à ajouter
	 * @param nomFonction pour permettre d'avoir la syntaxe suivante nomFonction_nom
	 * @throws DejaInitialiseException si l'entrée existe déjà
	 */

	public void ajouter(String nom, Symbole symb, String nomFonction)
	{

		String nomAvecFonction;

		nomAvecFonction = nomFonction + "_" + nom;
		if (!tableSymboles.containsKey(nomAvecFonction)) {
			tableSymboles.put(nomAvecFonction, symb);
		}

	}

	/**
	 * Fonction inserant une entrée dans la tds, si celle-ci n'existe pas
	 * @param nom nom du symbole
	 * @param val valeur du symbole
	 * @param type type du symbole
	 * @param scope scope du symbole
	 * @param cat catégorie du symbole
	 * @param nbLoc nombre de paramètre local (cas d'une fonction)
	 * @param nbParam nom de paramètre (argument), cas d'une fonction
	 * @return Vrai si c'est ajouté, faux sinon
	 */
	public boolean insertionVerifValeur(String nom, String val, String type,
			 String cat, int nbLoc, int nbParam) {
		boolean res = false;
		Symbole symb = new Symbole(nom, type, val , cat, nbLoc, nbParam);
		
		if(!this.rechercheSymbole(symb)){
			this.ajouter(nom, symb, null);
			res = true;
		}
		
		return res;
	}
	
	/**
	 * Permet de récupérer la valeur d'un symbole à partir de son nom
	 * @param s : nom du symbole à retrouver
	 * @return valeur recherchée
	 */

	public String getValeur(String s) {
		return tableSymboles.get(s).getVal();
	}

	public void stockTemporaire(String nom, String string, String string2, String string3, int nbLoc, int nbParam,
			int nbFonction) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Fonction inserant une entrée fonction dans la tds, si celle-ci n'existe pas
	 * @param nom nom du symbole
	 * @param val valeur du symbole
	 * @param type type du symbole
	 * @param cat catégorie du symbole
	 * @param nbLoc nombre de paramètre local (cas d'une fonction)
	 * @param nbParam nom de paramètre (argument), cas d'une fonction
	 * @return Vrai si c'est ajouté, faux sinon
	 */

	public boolean insertionVerifValeur(String nomFonction, String nom,String val, String type, String cat, int nbLoc,int nbParam) {
		boolean res = false;
		Symbole symb = new Symbole(nomFonction + "_" + nom, val, type,
				cat, nbLoc, nbParam);
		if(!this.rechercheSymbole(symb)){
			this.ajouter(nom, symb, nomFonction);
			res = true;
		}
	
		return res;
	}
	
	
	/**
	 * Méthode ajoutant les valeurs locales dans la Table des Symboles
	 * @param var liste des noms de variable
	 * @param val valeur que les variables vont prendre
	 */

	public void ajouterValeurListeTemporaire(ArrayList<Noeud> var, Integer val) {
		ArrayList<Symbole> res = new ArrayList<Symbole>();

		for (Symbole s : listeVarTemporaire) {
			for (Noeud n : var) {
				if (s.getIdentifiant().equals((String)n.getPointeur())) {
					res.add(s);
				}
			}
		}
		for (Symbole s : res) {
			listeVarTemporaire.remove(s);
			s.setVal(String.valueOf(val));
			listeVarTemporaire.add(s);
		}
	}

	
	/**
	 * Fonction de visualisation
	 */

	public void visualisation() {
		Iterator<String> iterateur = tableSymboles.keySet().iterator();
		while (iterateur.hasNext()) {
			Object key = iterateur.next();
			Symbole test = tableSymboles.get(key);

			System.out.println(test.getIdentifiant() + " : " + test.getType()
					+ ", " + test.getVal() + ", "
					+ test.getCatégorie() + ", " + test.getNbparam() + ", "
					+ test.getNbloc());
		}
	}
	
	
	
	

}
