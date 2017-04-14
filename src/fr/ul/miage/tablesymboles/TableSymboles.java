package fr.ul.miage.tablesymboles;

import java.util.HashMap;

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
	
	// Ajoute le symbole si il n'est pas deja dans la table
	
	public boolean insertionVerifValeur(String nom, String val, String type,
			String scope, String cat, String nbbloc, int nbparam,int rang, int numfonction) {
		
			Symbole symb = new Symbole(nom, type, val, rang, nbbloc,  cat,  nbparam, numfonction);
			
			if(!this.rechercheSymbole(symb)){
				this.add(symb);
				return true;
			}
			
			return false;
	}
	
	/**
	 * Permet de récupérer la valeur d'un symbole à partir de son nom
	 * @param s : nom du symbole à retrouver
	 * @return valeur recherchée
	 */

	public String getValeur(String s) {
		return tableSymboles.get(s).getVal();
	}
	
	
	
	
	
	
	

}
