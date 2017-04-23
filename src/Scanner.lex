             /*
 * analyseur lexical d'un langage de programmation fictif:
 *
 * auteurs :  Laurene Cladt, Alexis Geng, Benjamin Rath, Enzo Proux
 * (c) 2017
 */

package fr.ul.miage.compilation.generated;
import java_cup.runtime.Symbol;

%%

/* options */
%line
%public
%cup
%debug

/* macros */
SEP 	=   [ \t]
RETOUR  = 	\n|\r
NOM		= 	[A-Za-z][A-Za-z0-9]*
TYPE 	=	int|double|string|char|boolean|void
NBR     =   [0-9]+

%%

/* regles */
{SEP}		{ ; }
{RETOUR}	{ ; }
";"			{ return new Symbol(ParserSym.PV);}
","			{ return new Symbol(ParserSym.VIRGULE);}
"<-"		{ return new Symbol(ParserSym.FLECHE);}
"("			{ return new Symbol(ParserSym.PO);}
")"			{ return new Symbol(ParserSym.PF);}
":"         { return new Symbol(ParserSym.DP);}
"<"			{ return new Symbol(ParserSym.INF);}
">"			{ return new Symbol(ParserSym.SUP);}
"=="			{ return new Symbol(ParserSym.EQQ);}
"<="		{ return new Symbol(ParserSym.INFEGAL);}
">="		{ return new Symbol(ParserSym.SUPEGAL);}
"def"		{ return new Symbol(ParserSym.DEF);}
"enddef"	{ return new Symbol(ParserSym.ENDDEF);}
"while"		{ return new Symbol(ParserSym.WHILE);}
"endwhile"	{ return new Symbol(ParserSym.ENDWHILE);}
"if"		{ return new Symbol(ParserSym.IF);}
"else"		{ return new Symbol(ParserSym.ELSE);}
"endif"		{ return new Symbol(ParserSym.ENDIF);}
"main"		{ return new Symbol(ParserSym.MAIN);}
"return"	{ return new Symbol(ParserSym.RETURN);}
{TYPE}     	{ return new Symbol(ParserSym.TYPE, new String(yytext()));}
{NOM}     	{return new Symbol(ParserSym.NOM, new String(yytext()));}
"+"	{return new Symbol(ParserSym.ADD, new String(yytext()));}
"-"	{return new Symbol(ParserSym.SUB, new String(yytext()));}
"*"	{return new Symbol(ParserSym.MUL, new String(yytext()));}
"/"	{return new Symbol(ParserSym.DIV, new String(yytext()));}
{NBR}       {return new Symbol(ParserSym.NBR, new Integer(yytext()));}
