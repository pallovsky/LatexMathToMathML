parser grammar LatexParser;

options { tokenVocab=LatexLexer; }

// Standard for tex documents
prule: DOCUMENTCLASS OPEN_BRACE CLASS CLOSE_BRACE packages data document;
data: title? author? date?;
packages: ((PACKAGES OPEN_BRACE PACKAGE CLOSE_BRACE) | PACKAGES OPEN_BRACKET (STRING | DECIMAL_INTEGER)+ CLOSE_BRACKET OPEN_BRACE PACKAGE CLOSE_BRACE)+;
document: BEGIN OPEN_BRACE DOCUMENT CLOSE_BRACE MAKETITLE? body END OPEN_BRACE DOCUMENT CLOSE_BRACE;
body: (equation | matrix | align | text | multline | inline | centered | displaymath | section)+ ;
section: SECTION OPEN_BRACE (STRING | WS | LETTER)+ CLOSE_BRACE (equation | matrix | align | text | multline | inline | centered | displaymath)+;

// Document data
title: TITLE OPEN_BRACE (STRING | WS)+ CLOSE_BRACE;
author: AUTHOR OPEN_BRACE STRING WS? STRING? CLOSE_BRACE;
date: DATE OPEN_BRACE (STRING | DECIMAL_INTEGER)+ CLOSE_BRACE;

// Different types of mathematical notations in amsmath
equation: BEGIN OPEN_BRACE EQUATION CLOSE_BRACE label? (math_formula NEWLINE)* math_formula END OPEN_BRACE EQUATION CLOSE_BRACE;
matrix: BEGIN OPEN_BRACE MATRIX CLOSE_BRACE matrix_formula END OPEN_BRACE MATRIX CLOSE_BRACE;
align: BEGIN OPEN_BRACE ALIGN CLOSE_BRACE (math_formula | NEWLINE)*  END OPEN_BRACE ALIGN CLOSE_BRACE;
multline: BEGIN OPEN_BRACE MULTLINE CLOSE_BRACE (math_formula | NEWLINE)*  END OPEN_BRACE MULTLINE CLOSE_BRACE;
inline: (BACKSLASH OPEN_PAREN math_formula BACKSLASH CLOSE_PAREN) | (DOLLAR math_formula DOLLAR);
centered: BACKSLASH OPEN_BRACKET math_formula BACKSLASH CLOSE_BRACKET;
displaymath: BEGIN OPEN_BRACE DISPLAYMATH CLOSE_BRACE math_formula END OPEN_BRACE DISPLAYMATH CLOSE_BRACE;

// Formulas
math_formula: (DECIMAL_INTEGER | symbol | fraction | sqrt | integral | LETTER | STRING)+;
matrix_formula: DECIMAL_INTEGER | ((DECIMAL_INTEGER ANDSGN)+ DECIMAL_INTEGER NEWLINE)+ (DECIMAL_INTEGER ANDSGN)+ DECIMAL_INTEGER;
fraction: FRAC OPEN_BRACE math_formula CLOSE_BRACE OPEN_BRACE math_formula CLOSE_BRACE;
integral: INT ULINE LETTER POWER LETTER;
sqrt: SQRT OPEN_BRACE math_formula CLOSE_BRACE;

// Collections
simple_symbols: PLUS | MINUS | EQ | POWER | FACT | SLASH | MUL | L | G | OPEN_PAREN | CLOSE_PAREN | OPEN_BRACKET | CLOSE_BRACKET | ANDSGN | ULINE;
relation_symbols: LEQ | SUBSET | SUBSETEQ | GEQ | SUPSET | SUPSETEQ;
binary_operations: TIMES | DIV | AST | STAR;
logic_notation: EXISTS | NEXISTS | FORALL | NEG | IN | NIN | AND | OR | RIGHTARROW | LEFTARROW;
greek_letters: ALPHA | BETA | GAMMA | DELTA | EPSILON | OMEGA | PI;
trigonometric: SIN | COS | TAN | COT | ARCSIN| ARCCOS | ARCTAN | ARCCOT;
symbol: simple_symbols | relation_symbols | greek_letters | binary_operations | logic_notation | trigonometric;
keyword: CLASS | PACKAGE | DOCUMENT | EQUATION | ALIGN | MATRIX | MULTLINE | DISPLAYMATH;

// Other
label: LABEL OPEN_BRACE (STRING | WS | DECIMAL_INTEGER | symbol)+ CLOSE_BRACE;
text: (STRING | math_formula | ANY_CHAR | keyword)+;