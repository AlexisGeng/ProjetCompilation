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
	private String val; // ce que contient une variable
	private String categorie; //global,fonction,paramètre,local,varaible,constante
	private String nbloc; //étages
	private int nbparam; // pour une fonction
	private int numeroFonction; // numéro de la fonction 
	private int rang; // ?????

	
	///CONSTRUCTEUR///////////////////////////////////
	
	public Symbole(String id, String type, String val, int rang,String nbbloc, String categorie, int nbpara,int numfonction) {
		this.identifiant = id;
		this.type = type;
		this.val = val;
		this.nbloc= nbbloc;
		this.rang=rang;
		this.nbparam = nbpara;
		this.categorie = categorie;
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


	public String getVal() {
		return val;
	}


	public void setVal(String val) {
		this.val = val;
	}


	public String getCatégorie() {
		return categorie;
	}


	public void setCatégorie(String catégorie) {
		this.categorie = catégorie;
	}


	public String getNbloc() {
		return nbloc;
	}


	public void setNbloc(String nbloc) {
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
	
	
	/**
	 * Méthode pour savoir si le symbole est une variable globale
	 * @return Booléen: indiquant si le symbole est une variable globale
	 */
	public boolean isGlobalVariable(){
		return type.equals("int") && categorie.equals("globale");  
	}
	
	

}
