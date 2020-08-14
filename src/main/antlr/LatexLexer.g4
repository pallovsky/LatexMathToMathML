lexer grammar LatexLexer;

tokens { INDENT, DEDENT, LINE_BREAK }

// Keywords:
DOCUMENTCLASS: '\\documentclass';
PACKAGES: '\\usepackage';
BEGIN: '\\begin';
END: '\\end';
TITLE: '\\title';
AUTHOR: '\\author';
DATE: '\\date';
FRAC: '\\frac';
INT: '\\int';
MAKETITLE: '\\maketitle';
SECTION: '\\section';
LABEL: '\\label';

// Keyword options
CLASS: 'article';
PACKAGE: 'amsmath' | 'inputenc';
DOCUMENT: 'document';
EQUATION: 'equation' | 'equation*';
ALIGN: 'align' | 'align*';
MATRIX: 'matrix';
MULTLINE: 'multline' | 'multline*';
DISPLAYMATH: 'displaymath' | 'math';

// Simple symbols
PLUS: '+';
MINUS: '-';
EQ: '=' | '&=';
FACT: '!';
SLASH: '/';
MUL: '*';
POWER: '^';
L: '<';
G: '>';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
OPEN_BRACE: '{';
CLOSE_BRACE: '}';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';
ANDSGN: '&';
NEWLINE: '\\\\';
SQRT: '\\sqrt';
ULINE: '_';

// Numbers and strings
DECIMAL_INTEGER: [1-9] [0-9]* | '0'+;
DECIMAL_FLOAT: [1-9] [0-9]* '.' [0-9]*;
LETTER: ('a'..'z' | 'A'..'Z');
STRING: ('a'..'z' | 'A'..'Z')+;

// Relation symbols:
LEQ: '\\leq';
SUBSET: '\\subset';
SUBSETEQ: '\\subseteq';
GEQ: '\\geq';
SUPSET: '\\supset';
SUPSETEQ: '\\supseteq';

// Binary operations
TIMES: '\times';
DIV: '\\div';
AST: '\\ast';
STAR: '\\star';

// Set and/or logic notation
EXISTS: '\\exists';
NEXISTS: '\\nexists';
FORALL: '\\forall';
NEG: '\\neg';
IN: '\\in';
NIN: '\\notin';
AND: '\\land';
OR: '\\lor';
RIGHTARROW: '\\rightarrow';
LEFTARROW: '\\leftarrow';

// Greek letters
ALPHA: '\\alpha';
BETA: '\\beta';
GAMMA: '\\gamma';
DELTA: '\\delta';
EPSILON: '\\epsilon';
OMEGA: '\\omega';
PI: '\\pi';

//Trigonometric functions
SIN: '\\sin';
COS: '\\cos';
TAN: '\\tan';
COT: '\\cot';
ARCSIN: '\\arcsin';
ARCCOS: '\\arccos';
ARCTAN: '\\arctan';
ARCCOT: '\\arccot';

// Ignore:
COMMENT: '%' (STRING | LETTER | WS | '-')+ EOL-> channel(HIDDEN);
EOL: '\n' -> channel(HIDDEN);
WS:   ' ' -> channel(HIDDEN);

//Other
DOLLAR: '$';
BACKSLASH: '\\';
ANY_CHAR : . ;
