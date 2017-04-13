package fr.ul.miage.structure.arbre;

import java.util.ArrayList;

public class Noeud {
	
	private ArrayList<Noeud> fils;
	private int val;
	// pointeur = ref�rence a la table des symboles
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
		public final static int AFFECT = 7; 
		//Noeud principal
		public final static int PRINCIPAL_NOD = 8;
		//COndition si
		public final static int IF = 9;
		//Supp�rieur
		public final static int SUP = 10;
		//Inf�rieur
		public final static int INF = 11;
		// Egale
		public final static int EQQ= 12;
		//Sup�rieur ou �gale
		public final static int SUPE = 13;
		// Inf�rieur ou �gale
		public final static int INFE = 14;
		//while
		public final static int WH = 15;
		//sinon
		public final static int ELSE = 16;
		//puis
		public final static int THEN = 17;
		//retourne
		public final static int RET = 18;

		public final static int ECRIRE = 20;
		//equation
		public final static int EQ = 21;
		// nom
		public final static int NOM = 22;
		//fonction
		public final static int FCT = 23;
		

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
		 * Seconde m�thode d'affichage
		 */
		public String toString1() {
			String res=" -- "+ this.getValEcrite()+" -- ";
			return res;
		}
		
	
		/**
		 * M�thode d'affichage complete
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
	 * M�thode d'ajout d'un noeud
	 */

	public void addFils(Noeud n ){
		this.fils.add(n);
	}
	
	/**
	 * M�thode renvoyant la liste des fils d'un noeud
	 */

	public ArrayList<Noeud> getFils() {
		return fils;
	}
	
	/**
	 * M�thode qui retourne la valeur d'un Noeud
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
	 * M�thode renvoyant la valeur �crite du Noeud (ce qui permet de d�terminer le cas du noeud)
	 */
	
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
		}
		return res;
	}
	
}
