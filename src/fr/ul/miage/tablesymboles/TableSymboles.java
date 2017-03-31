package fr.ul.miage.tablesymboles;

import java.util.HashMap;

public class TableSymboles {
	
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
		return this.tableSymboles.get(s);
	}
	
	public HashMap<String, Symbole> getTable() {
		return this.tableSymboles;
	}
	
	// v�rifie si un symbole est deja dans la table
	public boolean rechercheSymbole(Symbole s){
		
		return this.tableSymboles.containsKey(s.getIdentifiant());
	}
	
	// Ajoute le symbole si il n'est pas deja dans la table
	
	public boolean insertionVerifValeur(String nom, int val, String type,
			String scope, String cat, int nbbloc, int nbparam,int rang, int numfonction) {
		
			Symbole symb = new Symbole(nom, type, val, rang, nbbloc,  cat,  nbparam, numfonction);
			
			if(!this.rechercheSymbole(symb)){
				this.add(symb);
				return true;
			}
			
			return false;
	}
	
	
	
	
	
	
	

}
