/**
 * 
 */
package fr.ul.miage.compilation;

import java.io.FileReader;

import fr.ul.miage.compilation.generated.ParserCup;
import fr.ul.miage.compilation.generated.Yylex;



/**
 * @author Laurene Cladt, Alexis Geng, Benjamin Rath, Enzo Proux
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 1){
			System.err.println("il manque un argument");
			System.exit(1);
		}
		try {
			ParserCup parser = new ParserCup(new Yylex(new FileReader(args[0])));
			parser.parse();
			System.out.println("Analyse terminée avec succès");
		} catch (Exception e) {
			System.err.println("Erreur de syntaxe");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
