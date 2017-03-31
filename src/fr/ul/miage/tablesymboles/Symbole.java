package fr.ul.miage.tablesymboles;

public class Symbole {
	
	/*
	 Exemple :
	 
	  		int i =1;
			int j;

			int f (int a) {
				int x;
				x=a+1;
				return x;
			}
			main(){
    			j=f(i);
			}
			
			-----------
			
			TBS:
				i-> type int, cat=global, val=1
				j -> tyoe int, cat=global,val=0
				f -> type=int, cat=fct, nbdeparam=1,nbloc=1
				a -> type=int, cat=param,rang=0
				x -> tyoe=int, cat =local,rang=0
				main -> type=void, cat fct, nbp=0
	 */
	
	private String identifiant;// id du symbole
	private String type; // void ou int
	private int val; // ce que contient une variable
	private String catégorie; //global,fonction,paramètre,local,varaible,constante
	private int nbloc; //étages
	private int nbparam; // pour une fonction
	private int numeroFonction; // numéro de la fonction 
	private int rang; // ?????

	
	///CONSTRUCTEUR///////////////////////////////////
	
	public Symbole(String id, String type, int val, int rang,int nbbloc, String categorie, int nbpara,int numfonction) {
		this.identifiant = id;
		this.type = type;
		this.val = val;
		this.nbloc= nbbloc;
		this.rang=rang;
		this.nbparam = nbpara;
		this.catégorie = categorie;
		this.numeroFonction = numfonction;
		
	}
	
	/////////////////////////////////////////////////////


	public String getIdentifiant() {
		return identifiant;
	}


	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getVal() {
		return val;
	}


	public void setVal(int val) {
		this.val = val;
	}


	public String getCatégorie() {
		return catégorie;
	}


	public void setCatégorie(String catégorie) {
		this.catégorie = catégorie;
	}


	public int getNbloc() {
		return nbloc;
	}


	public void setNbloc(int nbloc) {
		this.nbloc = nbloc;
	}


	public int getNbparam() {
		return nbparam;
	}


	public void setNbparam(int nbparam) {
		this.nbparam = nbparam;
	}


	public int getNumeroFonction() {
		return numeroFonction;
	}


	public void setNumeroFonction(int numeroFonction) {
		this.numeroFonction = numeroFonction;
	}


	public int getRang() {
		return rang;
	}


	public void setRang(int rang) {
		this.rang = rang;
	}
	
	
	
	

}
