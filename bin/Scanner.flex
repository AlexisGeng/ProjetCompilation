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
NOM		= 	([A-Z]*[a-z]*)+
TYPE 	=	([A-Z]*[a-z]*)+
SYM		=	[+*\/\-%]+
NBR     =   [0-9]+
COMP 	= 	[(<=)(>=)(!=)<>=]+
FIN     =   "\n"|"\r\n"

%%

/* regles */
";"			{ return new Symbol(sym.PV);}
","			{ return new Symbol(sym.VIRGULE);}
"<-"		{ return new Symbol(sym.FLECHE);}
"("			{ return new Symbol(sym.PO);}
")"			{ return new Symbol(sym.PF);}
":"         { return new Symbol(sym.DP);}
"def"		{ return new Symbol(sym.DEF);}
"enddef"	{ return new Symbol(sym.ENDDEF);}
"while"		{ return new Symbol(sym.WHILE);}
"endwhile"	{ return new Symbol(sym.ENDWHILE);}
"if"		{ return new Symbol(sym.IF);}
"elseif"	{ return new Symbol(sym.ELSEIF);}
"else"		{ return new Symbol(sym.ELSE);}
"endif"		{ return new Symbol(sym.ENDIF);}
"for"		{ return new Symbol(sym.FOR);}
"endfor"	{ return new Symbol(sym.ENDFOR);}
"main"		{ return new Symbol(sym.MAIN);}
{NOM}     	{ return new Symbol(sym.NOM);}
{TYPE}     	{ return new Symbol(sym.TYPE);}
{SYM}     	{ return new Symbol(sym.SYM);}
{COMP}     	{ return new Symbol(sym.COMP);}
{NBR}       { return new Symbol(sym.NBR);}
{FIN}		{ return new Symbol(sym.EOF);}

