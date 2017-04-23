package fr.ul.miage.structure.arbre;

import java.util.ArrayList;



public class Noeud {
	
	private ArrayList<Noeud> fils;
	private int val;
	// pointeur = reférence a la table des symboles
	private Object pointeur;
	
	    //constante
		public final static int CONST = 0;
		//variable
		public final static int IDF = 1;
		// addition
		public final static int ADD = 2;
		//soustraction
		public final static int SUB = 3;
		//Multiplication
		public final static int MUL = 4;
		//Division
		public final static int DIV = 5;
		//Appel fct
		public final static int APPEL = 6;
		//Affectation
		public final static int DEC = 7; 
		//Noeud principal
		public final static int PRINCIPAL_NOD = 8;
		//COndition si
		public final static int IF = 9;
		//Suppérieur
		public final static int SUP = 10;
		//Inférieur
		public final static int INF = 11;
		// Egale
		public final static int EGAL= 12;
		//Supérieur ou égale
		public final static int SUPEGAL = 13;
		// Inférieur ou égale
		public final static int INFEGAL = 14;
		//while
		public final static int WH = 15;
		//sinon
		public final static int ELSE = 16;
		//puis
		public final static int THEN = 17;
		//retourne
		public final static int RETURN = 18;

		public final static int ECRIRE = 20;
		//equation
		public final static int EQ = 21;
		// nom
		public final static int NOM = 22;
		//fonction
		public final static int FCT = 23;
		
		public final static int LEC = 24;
		
		public final static int DIFF = 25;
		public final static int CORPSWH = 26;
		public final static int AFFECT = 27;
		public final static int EQQ = 27;
		public final static int BOOL = 27;
		
		/**
		 * Constructeur avec Valeur et Pointeur. Cas typique des symboles ( "=" ...) et de la racine ("programme")
		 * @param val
		 * @param pointeur:  est une reference vers la Table Des Symboles 
		 */
		public Noeud(int val , Object pointeur){
			this.fils = new ArrayList<Noeud>();
			this.val = val;
			this.pointeur = pointeur;
		}
		
		/**
		 * Constructeur avec seulement la valeur 
		 */
		public Noeud(int val){
			this.fils = new ArrayList<Noeud>();
			this.val = val;
		}
		
		
		/**
		 * Seconde méthode d'affichage
		 
		public String toString1() {
			String res=" -- "+ this.getValEcrite()+" -- ";
			return res;
		}
		
	
		/**
		 * Méthode d'affichage complete
		
		public String toString() {
			String res ="";
			

			if(this.getFils().size()>0){
				 res = "\n"+"Noeud parent avec fils: "+"  "+this.getValEcrite()+" "+"\n";
				
					for(Noeud n: this.getFils()){
						
						res += n.toString1();
					}
					
				
			}
			
			
			for(Noeud n: this.getFils()){
				
				res += n.toString();
			}
			return res;
		}
		
		 */
	
	/**
	 * Méthode d'ajout d'un noeud
	 */

	public void addFils(Noeud n ){
		this.fils.add(n);
	}
	
	/**
	 * Méthode renvoyant la liste des fils d'un noeud
	 */

	public ArrayList<Noeud> getFils() {
		return fils;
	}
	
	/**
	 * Méthode qui retourne la valeur d'un Noeud
	 */

	public int getVal() {
		
		return val;
	}
	
	/**
	 * Permet d'avoir le pointeur du Noeud
	 */

	public Object getPointeur() {
		return pointeur;
	}	
	
	
	/**
	 * Méthode renvoyant la valeur écrite du Noeud (ce qui permet de déterminer le cas du noeud)
	 
	public String getValEcrite()
	{
		String res="";
		switch(this.getVal()){
		
		case 0 :res="CONST";break;
		case 1:res="IDF ";break;
		case 2: res="ADD";break;
		case 3: res="SUB ";break;
		case 4: res="MUL ";break;
		case 5: res="DIV ";break;
		case 6: res="APPEL ";break;
		case 7: res="AFFECT "; break;
		case 8: res="PRINCIPAL_NOD ";break;
		case 9: res="IF ";break;
		case 10:res="SUP";break;
		case 11:res="INF ";break;
		case 12:res="EQQ";break;
		case 13:res="SUPE ";break;
		case 14:res="INFE ";break;
		case 15:res="WH ";break;
		case 16:res="ELSE ";break;
		case 17:res="THEN ";break;
		case 18:res="RET ";break;
		case 19:res="BOOL ";break;
		case 20:res="ECRIRE";break;
		case 21:res="EQ ";break;
		case 22:res="NOM ";break;
		case 23:res="FCT "+this.getPointeur();break;
		case 24:res="LEC ";break;
		}
		return res;
	}
	*/
	
	/**
	 * Méthode d'affichage
	 */
	public String toString() {
		String res ="";
		

		if(this.getFils().size()>0){
			 res = "\n"+"Noeud parent avec fils: "+"  "+this.getValEcrite()+" "+"\n";
			
				for(Noeud n: this.getFils()){
					
					res += n.toString1();
				}
				
			
		}
		
		
		for(Noeud n: this.getFils()){
			
			res += n.toString();
		}
		return res;
	}
	
	/**
	 * Seconde méthode d'affichage
	 * @return String à afficher
	 */
	public String toString1() {
		String res=" -- "+ this.getValEcrite()+" -- ";
		return res;
	}
	
	/**
	 * Méthode renvoyant la valeur écrite du Noeud (ce qui permet de déterminer le cas du noeud)
	 * @return la valeur écrite du Noeud
	 */
	
	public String getValEcrite()
	{
		String res="";
		switch(this.getVal()){
		
		case 0 :res="CONST";break;
		case 1:res="IDF ";break;
		case 2: res="READ";break;
		case 3: res="ADD";break;
		case 4: res="SUB ";break;
		case 5: res="MUL ";break;
		case 6: res="DIV ";break;
		case 7: res="APPEL ";break;
		case 8: res="AFFECT "; break;
		case 9: res="PRINCIPAL_NOD ";break;
		case 10: res="IF ";break;
		case 11:res="SUP";break;
		case 12:res="INF ";break;
		case 13:res="EQQ";break;
		case 14:res="SUPE ";break;
		case 15:res="INFE ";break;
		case 16:res="WH ";break;
		case 17:res="ELSE ";break;
		case 18:res="THEN ";break;
		case 19:res="CORPSWH";break;
		case 20:res="RET ";break;
		case 21:res="ECRIRE";break;
		case 22:res="EQ ";break;
		case 23:res="AFFECT";break;
		case 25:res="NOM ";break;
		case 26:res="FCT "+this.getPointeur();break;
		case 27:res="EGAL";break;
		case 28:res="RETURN";break;
		case 29:res="BOOL";break;
		}
		return res;
	}
	
	
}
