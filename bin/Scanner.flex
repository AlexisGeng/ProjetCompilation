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

/* macros */
SEP 	=   [ \t]
RETOUR  = 	\n|\r
NOM		= 	[A-Za-z][A-Za-z0-9]*
TYPE 	=	int|double|string|char|boolean|void
SYM		=	[+*\/\-%]+
NBR     =   [0-9]+

%%

/* regles */
{SEP}		{ ; }
{RETOUR}	{ ; }
";"			{ return new Symbol(sym.PV);}
","			{ return new Symbol(sym.VIRGULE);}
"<-"		{ return new Symbol(sym.FLECHE);}
"("			{ return new Symbol(sym.PO);}
")"			{ return new Symbol(sym.PF);}
":"         { return new Symbol(sym.DP);}
"<"			{ return new Symbol(sym.INF);}
">"			{ return new Symbol(sym.SUP);}
"="			{ return new Symbol(sym.EGAL);}
"<="		{ return new Symbol(sym.INFEGAL);}
">="		{ return new Symbol(sym.SUPEGAL);}
"!="		{ return new Symbol(sym.DIFF);}
"def"		{ return new Symbol(sym.DEF);}
"enddef"	{ return new Symbol(sym.ENDDEF);}
"while"		{ return new Symbol(sym.WHILE);}
"endwhile"	{ return new Symbol(sym.ENDWHILE);}
"if"		{ return new Symbol(sym.IF);}
"elseif"	{ return new Symbol(sym.ELSEIF);}
"else"		{ return new Symbol(sym.ELSE);}
"endif"		{ return new Symbol(sym.ENDIF);}
"main"		{ return new Symbol(sym.MAIN);}
"return"	{ return new Symbol(sym.RETURN);}
{TYPE}     	{ return new Symbol(sym.TYPE);}
{NOM}     	{ return new Symbol(sym.NOM);}
{SYM}     	{ return new Symbol(sym.SYM);}
{NBR}       { return new Symbol(sym.NBR);}
