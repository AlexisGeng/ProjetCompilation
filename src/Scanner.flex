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
SEP     =   [ \t]
DECAL   =   ("+"|"-")[0-9]+
NUM     =   [0-9]+
FIN     =   "\n"|"\r\n"

%%

/* regles */
"Jan"		{ return new Symbol(sym.JAN);}
"Feb"		{ return new Symbol(sym.FEV);}
"Mar"		{ return new Symbol(sym.MAR);}
"Apr"		{ return new Symbol(sym.AVR);}
"May"		{ return new Symbol(sym.MAI);}
"Jun"		{ return new Symbol(sym.JUIN);}
"Jul"		{ return new Symbol(sym.JUIL);}
"Aug"		{ return new Symbol(sym.AOU);}
"Sep"		{ return new Symbol(sym.SEP);}
"Oct"		{ return new Symbol(sym.OCT);}
"Nov"		{ return new Symbol(sym.NOV);}
"Dec"		{ return new Symbol(sym.DEC);}
":"         { return new Symbol(sym.DP);}
"/"         { return new Symbol(sym.SL);}
"["         { return new Symbol(sym.CO);}
"]"         { return new Symbol(sym.CF);}
{DECAL}     { return new Symbol(sym.DECAL);}
{NUM}       { return new Symbol(sym.NUM);}
{SEP}       { ; }
{FIN}		{ return new Symbol(sym.EOF);}
.			{ return null;}

