/**
 * 
 */
package fr.ul.miage.compilation;

import java.io.File;
import java.io.FileReader;
import java.util.Date;

import fr.ul.miage.compilation.generated.*;
import fr.ul.miage.structure.*;
import fr.ul.miage.structure.arbre.*;
import fr.ul.miage.tablesymboles.*;
import fr.ul.miage.compilation.generated.ParserCup;
import fr.ul.miage.compilation.generated.Yylex;
import fr.ul.miage.generateur.Generateur;



/**
 * @author Laurene Cladt, Alexis Geng, Benjamin Rath, Enzo Proux
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			ParserCup parser = new ParserCup(new Yylex(new FileReader(
			new File("samples/03-expression.miage"))));
		
			parser.parse();
			System.out.println("Analyse terminée avec succès");
			Arbre a = parser.getArbre();				
			TableSymboles tds = parser.getTDS();				
			Generateur generateur = new Generateur(tds,a);
			StringBuffer sb = generateur.genererProgramme();
			generateur.generation(sb.toString());
			System.out.println("Syntaxe acceptée ! Fichier généré.");
		} catch (Exception e) {
			System.err.println("Erreur de syntaxe");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
