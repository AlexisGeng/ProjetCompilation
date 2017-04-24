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
			MainTest test = new MainTest();
			test.test2();
			test.test3();
			test.test4();
			test.test5();
			test.test6();
			test.test7();
			//test.test8();
			test.test9();
			//test.test10();
			//test.test11();
			test.test12();
			
		} catch (Exception e) {
			System.err.println("Erreur de syntaxe");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
