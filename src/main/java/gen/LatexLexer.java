package gen;// Generated from /home/krzysztof/Dokumenty/Kompilatory/LatexToHtml/src/main/antlr/LatexLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LatexLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, LINE_BREAK=3, DOCUMENTCLASS=4, PACKAGES=5, BEGIN=6, 
		END=7, TITLE=8, AUTHOR=9, DATE=10, FRAC=11, INT=12, MAKETITLE=13, SECTION=14, 
		LABEL=15, CLASS=16, PACKAGE=17, DOCUMENT=18, EQUATION=19, ALIGN=20, MATRIX=21, 
		MULTINE=22, DISPLAYMATH=23, PLUS=24, MINUS=25, EQ=26, FACT=27, SLASH=28, 
		MUL=29, POWER=30, L=31, G=32, OPEN_PAREN=33, CLOSE_PAREN=34, OPEN_BRACE=35, 
		CLOSE_BRACE=36, OPEN_BRACKET=37, CLOSE_BRACKET=38, ANDSGN=39, NEWLINE=40, 
		SQRT=41, ULINE=42, DECIMAL_INTEGER=43, DECIMAL_FLOAT=44, LETTER=45, STRING=46, 
		LEQ=47, SUBSET=48, SUBSETEQ=49, GEQ=50, SUPSET=51, SUPSETEQ=52, TIMES=53, 
		DIV=54, AST=55, STAR=56, EXISTS=57, NEXISTS=58, FORALL=59, NEG=60, IN=61, 
		NIN=62, AND=63, OR=64, RIGHTARROW=65, LEFTARROW=66, ALPHA=67, BETA=68, 
		GAMMA=69, DELTA=70, EPSILON=71, OMEGA=72, PI=73, SIN=74, COS=75, TAN=76, 
		COT=77, ARCSIN=78, ARCCOS=79, ARCTAN=80, ARCCOT=81, COMMENT=82, EOL=83, 
		WS=84, DOLLAR=85, BACKSLASH=86, ANY_CHAR=87;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DOCUMENTCLASS", "PACKAGES", "BEGIN", "END", "TITLE", "AUTHOR", "DATE", 
			"FRAC", "INT", "MAKETITLE", "SECTION", "LABEL", "CLASS", "PACKAGE", "DOCUMENT", 
			"EQUATION", "ALIGN", "MATRIX", "MULTINE", "DISPLAYMATH", "PLUS", "MINUS", 
			"EQ", "FACT", "SLASH", "MUL", "POWER", "L", "G", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "ANDSGN", 
			"NEWLINE", "SQRT", "ULINE", "DECIMAL_INTEGER", "DECIMAL_FLOAT", "LETTER", 
			"STRING", "LEQ", "SUBSET", "SUBSETEQ", "GEQ", "SUPSET", "SUPSETEQ", "TIMES", 
			"DIV", "AST", "STAR", "EXISTS", "NEXISTS", "FORALL", "NEG", "IN", "NIN", 
			"AND", "OR", "RIGHTARROW", "LEFTARROW", "ALPHA", "BETA", "GAMMA", "DELTA", 
			"EPSILON", "OMEGA", "PI", "SIN", "COS", "TAN", "COT", "ARCSIN", "ARCCOS", 
			"ARCTAN", "ARCCOT", "COMMENT", "EOL", "WS", "DOLLAR", "BACKSLASH", "ANY_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'\\documentclass'", "'\\usepackage'", "'\\begin'", 
			"'\\end'", "'\\title'", "'\\author'", "'\\date'", "'\\frac'", "'\\int'", 
			"'\\maketitle'", "'\\section'", "'\\label'", "'article'", null, "'document'", 
			null, null, "'matrix'", null, null, "'+'", "'-'", null, "'!'", "'/'", 
			"'*'", "'^'", "'<'", "'>'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'&'", "'\\\\'", "'\\sqrt'", "'_'", null, null, null, null, "'\\leq'", 
			"'\\subset'", "'\\subseteq'", "'\\geq'", "'\\supset'", "'\\supseteq'", 
			"'\times'", "'\\div'", "'\\ast'", "'\\star'", "'\\exists'", "'\\nexists'", 
			"'\\forall'", "'\\neg'", "'\\in'", "'\\notin'", "'\\land'", "'\\lor'", 
			"'\\rightarrow'", "'\\leftarrow'", "'\\alpha'", "'\\beta'", "'\\gamma'", 
			"'\\delta'", "'\\epsilon'", "'\\omega'", "'\\pi'", "'\\sin'", "'\\cos'", 
			"'\\tan'", "'\\cot'", "'\\arcsin'", "'\\arccos'", "'\\arctan'", "'\\arccot'", 
			null, "'\n'", "' '", "'$'", "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "LINE_BREAK", "DOCUMENTCLASS", "PACKAGES", 
			"BEGIN", "END", "TITLE", "AUTHOR", "DATE", "FRAC", "INT", "MAKETITLE", 
			"SECTION", "LABEL", "CLASS", "PACKAGE", "DOCUMENT", "EQUATION", "ALIGN", 
			"MATRIX", "MULTINE", "DISPLAYMATH", "PLUS", "MINUS", "EQ", "FACT", "SLASH", 
			"MUL", "POWER", "L", "G", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACE", 
			"CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "ANDSGN", "NEWLINE", 
			"SQRT", "ULINE", "DECIMAL_INTEGER", "DECIMAL_FLOAT", "LETTER", "STRING", 
			"LEQ", "SUBSET", "SUBSETEQ", "GEQ", "SUPSET", "SUPSETEQ", "TIMES", "DIV", 
			"AST", "STAR", "EXISTS", "NEXISTS", "FORALL", "NEG", "IN", "NIN", "AND", 
			"OR", "RIGHTARROW", "LEFTARROW", "ALPHA", "BETA", "GAMMA", "DELTA", "EPSILON", 
			"OMEGA", "PI", "SIN", "COS", "TAN", "COT", "ARCSIN", "ARCCOS", "ARCTAN", 
			"ARCCOT", "COMMENT", "EOL", "WS", "DOLLAR", "BACKSLASH", "ANY_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LatexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LatexLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Y\u02d8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0125\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0141\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u014e\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0168\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0179\n\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\5\30\u0182\n\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\7)\u01ab"+
		"\n)\f)\16)\u01ae\13)\3)\6)\u01b1\n)\r)\16)\u01b2\5)\u01b5\n)\3*\3*\7*"+
		"\u01b9\n*\f*\16*\u01bc\13*\3*\3*\7*\u01c0\n*\f*\16*\u01c3\13*\3+\3+\3"+
		",\6,\u01c8\n,\r,\16,\u01c9\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\3:\3:\3"+
		":\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3"+
		">\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\3"+
		"D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3G\3"+
		"G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3"+
		"N\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\6P\u02c3\nP\rP\16P\u02c4\3P\3"+
		"P\3P\3P\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3S\3S\3T\3T\3U\3U\2\2V\3\6\5\7\7\b\t\t"+
		"\13\n\r\13\17\f\21\r\23\16\25\17\27\20\31\21\33\22\35\23\37\24!\25#\26"+
		"%\27\'\30)\31+\32-\33/\34\61\35\63\36\65\37\67 9!;\"=#?$A%C&E\'G(I)K*"+
		"M+O,Q-S.U/W\60Y\61[\62]\63_\64a\65c\66e\67g8i9k:m;o<q=s>u?w@yA{B}C\177"+
		"D\u0081E\u0083F\u0085G\u0087H\u0089I\u008bJ\u008dK\u008fL\u0091M\u0093"+
		"N\u0095O\u0097P\u0099Q\u009bR\u009dS\u009fT\u00a1U\u00a3V\u00a5W\u00a7"+
		"X\u00a9Y\3\2\5\3\2\63;\3\2\62;\4\2C\\c|\2\u02e7\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\3\u00ab"+
		"\3\2\2\2\5\u00ba\3\2\2\2\7\u00c6\3\2\2\2\t\u00cd\3\2\2\2\13\u00d2\3\2"+
		"\2\2\r\u00d9\3\2\2\2\17\u00e1\3\2\2\2\21\u00e7\3\2\2\2\23\u00ed\3\2\2"+
		"\2\25\u00f2\3\2\2\2\27\u00fd\3\2\2\2\31\u0106\3\2\2\2\33\u010d\3\2\2\2"+
		"\35\u0124\3\2\2\2\37\u0126\3\2\2\2!\u0140\3\2\2\2#\u014d\3\2\2\2%\u014f"+
		"\3\2\2\2\'\u0167\3\2\2\2)\u0178\3\2\2\2+\u017a\3\2\2\2-\u017c\3\2\2\2"+
		"/\u0181\3\2\2\2\61\u0183\3\2\2\2\63\u0185\3\2\2\2\65\u0187\3\2\2\2\67"+
		"\u0189\3\2\2\29\u018b\3\2\2\2;\u018d\3\2\2\2=\u018f\3\2\2\2?\u0191\3\2"+
		"\2\2A\u0193\3\2\2\2C\u0195\3\2\2\2E\u0197\3\2\2\2G\u0199\3\2\2\2I\u019b"+
		"\3\2\2\2K\u019d\3\2\2\2M\u01a0\3\2\2\2O\u01a6\3\2\2\2Q\u01b4\3\2\2\2S"+
		"\u01b6\3\2\2\2U\u01c4\3\2\2\2W\u01c7\3\2\2\2Y\u01cb\3\2\2\2[\u01d0\3\2"+
		"\2\2]\u01d8\3\2\2\2_\u01e2\3\2\2\2a\u01e7\3\2\2\2c\u01ef\3\2\2\2e\u01f9"+
		"\3\2\2\2g\u01ff\3\2\2\2i\u0204\3\2\2\2k\u0209\3\2\2\2m\u020f\3\2\2\2o"+
		"\u0217\3\2\2\2q\u0220\3\2\2\2s\u0228\3\2\2\2u\u022d\3\2\2\2w\u0231\3\2"+
		"\2\2y\u0238\3\2\2\2{\u023e\3\2\2\2}\u0243\3\2\2\2\177\u024f\3\2\2\2\u0081"+
		"\u025a\3\2\2\2\u0083\u0261\3\2\2\2\u0085\u0267\3\2\2\2\u0087\u026e\3\2"+
		"\2\2\u0089\u0275\3\2\2\2\u008b\u027e\3\2\2\2\u008d\u0285\3\2\2\2\u008f"+
		"\u0289\3\2\2\2\u0091\u028e\3\2\2\2\u0093\u0293\3\2\2\2\u0095\u0298\3\2"+
		"\2\2\u0097\u029d\3\2\2\2\u0099\u02a5\3\2\2\2\u009b\u02ad\3\2\2\2\u009d"+
		"\u02b5\3\2\2\2\u009f\u02bd\3\2\2\2\u00a1\u02ca\3\2\2\2\u00a3\u02ce\3\2"+
		"\2\2\u00a5\u02d2\3\2\2\2\u00a7\u02d4\3\2\2\2\u00a9\u02d6\3\2\2\2\u00ab"+
		"\u00ac\7^\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7e\2\2"+
		"\u00af\u00b0\7w\2\2\u00b0\u00b1\7o\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3"+
		"\7p\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7n\2\2\u00b6"+
		"\u00b7\7c\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7u\2\2\u00b9\4\3\2\2\2\u00ba"+
		"\u00bb\7^\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7g\2\2"+
		"\u00be\u00bf\7r\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2"+
		"\7m\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7i\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		"\6\3\2\2\2\u00c6\u00c7\7^\2\2\u00c7\u00c8\7d\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		"\u00ca\7i\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc\b\3\2\2\2\u00cd"+
		"\u00ce\7^\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7f\2\2"+
		"\u00d1\n\3\2\2\2\u00d2\u00d3\7^\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7k"+
		"\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7g\2\2\u00d8\f"+
		"\3\2\2\2\u00d9\u00da\7^\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7w\2\2\u00dc"+
		"\u00dd\7v\2\2\u00dd\u00de\7j\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7t\2\2"+
		"\u00e0\16\3\2\2\2\u00e1\u00e2\7^\2\2\u00e2\u00e3\7f\2\2\u00e3\u00e4\7"+
		"c\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7g\2\2\u00e6\20\3\2\2\2\u00e7\u00e8"+
		"\7^\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7c\2\2\u00eb"+
		"\u00ec\7e\2\2\u00ec\22\3\2\2\2\u00ed\u00ee\7^\2\2\u00ee\u00ef\7k\2\2\u00ef"+
		"\u00f0\7p\2\2\u00f0\u00f1\7v\2\2\u00f1\24\3\2\2\2\u00f2\u00f3\7^\2\2\u00f3"+
		"\u00f4\7o\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7m\2\2\u00f6\u00f7\7g\2\2"+
		"\u00f7\u00f8\7v\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb"+
		"\7n\2\2\u00fb\u00fc\7g\2\2\u00fc\26\3\2\2\2\u00fd\u00fe\7^\2\2\u00fe\u00ff"+
		"\7u\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7e\2\2\u0101\u0102\7v\2\2\u0102"+
		"\u0103\7k\2\2\u0103\u0104\7q\2\2\u0104\u0105\7p\2\2\u0105\30\3\2\2\2\u0106"+
		"\u0107\7^\2\2\u0107\u0108\7n\2\2\u0108\u0109\7c\2\2\u0109\u010a\7d\2\2"+
		"\u010a\u010b\7g\2\2\u010b\u010c\7n\2\2\u010c\32\3\2\2\2\u010d\u010e\7"+
		"c\2\2\u010e\u010f\7t\2\2\u010f\u0110\7v\2\2\u0110\u0111\7k\2\2\u0111\u0112"+
		"\7e\2\2\u0112\u0113\7n\2\2\u0113\u0114\7g\2\2\u0114\34\3\2\2\2\u0115\u0116"+
		"\7c\2\2\u0116\u0117\7o\2\2\u0117\u0118\7u\2\2\u0118\u0119\7o\2\2\u0119"+
		"\u011a\7c\2\2\u011a\u011b\7v\2\2\u011b\u0125\7j\2\2\u011c\u011d\7k\2\2"+
		"\u011d\u011e\7p\2\2\u011e\u011f\7r\2\2\u011f\u0120\7w\2\2\u0120\u0121"+
		"\7v\2\2\u0121\u0122\7g\2\2\u0122\u0123\7p\2\2\u0123\u0125\7e\2\2\u0124"+
		"\u0115\3\2\2\2\u0124\u011c\3\2\2\2\u0125\36\3\2\2\2\u0126\u0127\7f\2\2"+
		"\u0127\u0128\7q\2\2\u0128\u0129\7e\2\2\u0129\u012a\7w\2\2\u012a\u012b"+
		"\7o\2\2\u012b\u012c\7g\2\2\u012c\u012d\7p\2\2\u012d\u012e\7v\2\2\u012e"+
		" \3\2\2\2\u012f\u0130\7g\2\2\u0130\u0131\7s\2\2\u0131\u0132\7w\2\2\u0132"+
		"\u0133\7c\2\2\u0133\u0134\7v\2\2\u0134\u0135\7k\2\2\u0135\u0136\7q\2\2"+
		"\u0136\u0141\7p\2\2\u0137\u0138\7g\2\2\u0138\u0139\7s\2\2\u0139\u013a"+
		"\7w\2\2\u013a\u013b\7c\2\2\u013b\u013c\7v\2\2\u013c\u013d\7k\2\2\u013d"+
		"\u013e\7q\2\2\u013e\u013f\7p\2\2\u013f\u0141\7,\2\2\u0140\u012f\3\2\2"+
		"\2\u0140\u0137\3\2\2\2\u0141\"\3\2\2\2\u0142\u0143\7c\2\2\u0143\u0144"+
		"\7n\2\2\u0144\u0145\7k\2\2\u0145\u0146\7i\2\2\u0146\u014e\7p\2\2\u0147"+
		"\u0148\7c\2\2\u0148\u0149\7n\2\2\u0149\u014a\7k\2\2\u014a\u014b\7i\2\2"+
		"\u014b\u014c\7p\2\2\u014c\u014e\7,\2\2\u014d\u0142\3\2\2\2\u014d\u0147"+
		"\3\2\2\2\u014e$\3\2\2\2\u014f\u0150\7o\2\2\u0150\u0151\7c\2\2\u0151\u0152"+
		"\7v\2\2\u0152\u0153\7t\2\2\u0153\u0154\7k\2\2\u0154\u0155\7z\2\2\u0155"+
		"&\3\2\2\2\u0156\u0157\7o\2\2\u0157\u0158\7w\2\2\u0158\u0159\7n\2\2\u0159"+
		"\u015a\7v\2\2\u015a\u015b\7n\2\2\u015b\u015c\7k\2\2\u015c\u015d\7p\2\2"+
		"\u015d\u0168\7g\2\2\u015e\u015f\7o\2\2\u015f\u0160\7w\2\2\u0160\u0161"+
		"\7n\2\2\u0161\u0162\7v\2\2\u0162\u0163\7n\2\2\u0163\u0164\7k\2\2\u0164"+
		"\u0165\7p\2\2\u0165\u0166\7g\2\2\u0166\u0168\7,\2\2\u0167\u0156\3\2\2"+
		"\2\u0167\u015e\3\2\2\2\u0168(\3\2\2\2\u0169\u016a\7f\2\2\u016a\u016b\7"+
		"k\2\2\u016b\u016c\7u\2\2\u016c\u016d\7r\2\2\u016d\u016e\7n\2\2\u016e\u016f"+
		"\7c\2\2\u016f\u0170\7{\2\2\u0170\u0171\7o\2\2\u0171\u0172\7c\2\2\u0172"+
		"\u0173\7v\2\2\u0173\u0179\7j\2\2\u0174\u0175\7o\2\2\u0175\u0176\7c\2\2"+
		"\u0176\u0177\7v\2\2\u0177\u0179\7j\2\2\u0178\u0169\3\2\2\2\u0178\u0174"+
		"\3\2\2\2\u0179*\3\2\2\2\u017a\u017b\7-\2\2\u017b,\3\2\2\2\u017c\u017d"+
		"\7/\2\2\u017d.\3\2\2\2\u017e\u0182\7?\2\2\u017f\u0180\7(\2\2\u0180\u0182"+
		"\7?\2\2\u0181\u017e\3\2\2\2\u0181\u017f\3\2\2\2\u0182\60\3\2\2\2\u0183"+
		"\u0184\7#\2\2\u0184\62\3\2\2\2\u0185\u0186\7\61\2\2\u0186\64\3\2\2\2\u0187"+
		"\u0188\7,\2\2\u0188\66\3\2\2\2\u0189\u018a\7`\2\2\u018a8\3\2\2\2\u018b"+
		"\u018c\7>\2\2\u018c:\3\2\2\2\u018d\u018e\7@\2\2\u018e<\3\2\2\2\u018f\u0190"+
		"\7*\2\2\u0190>\3\2\2\2\u0191\u0192\7+\2\2\u0192@\3\2\2\2\u0193\u0194\7"+
		"}\2\2\u0194B\3\2\2\2\u0195\u0196\7\177\2\2\u0196D\3\2\2\2\u0197\u0198"+
		"\7]\2\2\u0198F\3\2\2\2\u0199\u019a\7_\2\2\u019aH\3\2\2\2\u019b\u019c\7"+
		"(\2\2\u019cJ\3\2\2\2\u019d\u019e\7^\2\2\u019e\u019f\7^\2\2\u019fL\3\2"+
		"\2\2\u01a0\u01a1\7^\2\2\u01a1\u01a2\7u\2\2\u01a2\u01a3\7s\2\2\u01a3\u01a4"+
		"\7t\2\2\u01a4\u01a5\7v\2\2\u01a5N\3\2\2\2\u01a6\u01a7\7a\2\2\u01a7P\3"+
		"\2\2\2\u01a8\u01ac\t\2\2\2\u01a9\u01ab\t\3\2\2\u01aa\u01a9\3\2\2\2\u01ab"+
		"\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b5\3\2"+
		"\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b1\7\62\2\2\u01b0\u01af\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2"+
		"\2\2\u01b4\u01a8\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b5R\3\2\2\2\u01b6\u01ba"+
		"\t\2\2\2\u01b7\u01b9\t\3\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2"+
		"\2\2\u01bd\u01c1\7\60\2\2\u01be\u01c0\t\3\2\2\u01bf\u01be\3\2\2\2\u01c0"+
		"\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2T\3\2\2\2"+
		"\u01c3\u01c1\3\2\2\2\u01c4\u01c5\t\4\2\2\u01c5V\3\2\2\2\u01c6\u01c8\t"+
		"\4\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01caX\3\2\2\2\u01cb\u01cc\7^\2\2\u01cc\u01cd\7n\2\2\u01cd"+
		"\u01ce\7g\2\2\u01ce\u01cf\7s\2\2\u01cfZ\3\2\2\2\u01d0\u01d1\7^\2\2\u01d1"+
		"\u01d2\7u\2\2\u01d2\u01d3\7w\2\2\u01d3\u01d4\7d\2\2\u01d4\u01d5\7u\2\2"+
		"\u01d5\u01d6\7g\2\2\u01d6\u01d7\7v\2\2\u01d7\\\3\2\2\2\u01d8\u01d9\7^"+
		"\2\2\u01d9\u01da\7u\2\2\u01da\u01db\7w\2\2\u01db\u01dc\7d\2\2\u01dc\u01dd"+
		"\7u\2\2\u01dd\u01de\7g\2\2\u01de\u01df\7v\2\2\u01df\u01e0\7g\2\2\u01e0"+
		"\u01e1\7s\2\2\u01e1^\3\2\2\2\u01e2\u01e3\7^\2\2\u01e3\u01e4\7i\2\2\u01e4"+
		"\u01e5\7g\2\2\u01e5\u01e6\7s\2\2\u01e6`\3\2\2\2\u01e7\u01e8\7^\2\2\u01e8"+
		"\u01e9\7u\2\2\u01e9\u01ea\7w\2\2\u01ea\u01eb\7r\2\2\u01eb\u01ec\7u\2\2"+
		"\u01ec\u01ed\7g\2\2\u01ed\u01ee\7v\2\2\u01eeb\3\2\2\2\u01ef\u01f0\7^\2"+
		"\2\u01f0\u01f1\7u\2\2\u01f1\u01f2\7w\2\2\u01f2\u01f3\7r\2\2\u01f3\u01f4"+
		"\7u\2\2\u01f4\u01f5\7g\2\2\u01f5\u01f6\7v\2\2\u01f6\u01f7\7g\2\2\u01f7"+
		"\u01f8\7s\2\2\u01f8d\3\2\2\2\u01f9\u01fa\7\13\2\2\u01fa\u01fb\7k\2\2\u01fb"+
		"\u01fc\7o\2\2\u01fc\u01fd\7g\2\2\u01fd\u01fe\7u\2\2\u01fef\3\2\2\2\u01ff"+
		"\u0200\7^\2\2\u0200\u0201\7f\2\2\u0201\u0202\7k\2\2\u0202\u0203\7x\2\2"+
		"\u0203h\3\2\2\2\u0204\u0205\7^\2\2\u0205\u0206\7c\2\2\u0206\u0207\7u\2"+
		"\2\u0207\u0208\7v\2\2\u0208j\3\2\2\2\u0209\u020a\7^\2\2\u020a\u020b\7"+
		"u\2\2\u020b\u020c\7v\2\2\u020c\u020d\7c\2\2\u020d\u020e\7t\2\2\u020el"+
		"\3\2\2\2\u020f\u0210\7^\2\2\u0210\u0211\7g\2\2\u0211\u0212\7z\2\2\u0212"+
		"\u0213\7k\2\2\u0213\u0214\7u\2\2\u0214\u0215\7v\2\2\u0215\u0216\7u\2\2"+
		"\u0216n\3\2\2\2\u0217\u0218\7^\2\2\u0218\u0219\7p\2\2\u0219\u021a\7g\2"+
		"\2\u021a\u021b\7z\2\2\u021b\u021c\7k\2\2\u021c\u021d\7u\2\2\u021d\u021e"+
		"\7v\2\2\u021e\u021f\7u\2\2\u021fp\3\2\2\2\u0220\u0221\7^\2\2\u0221\u0222"+
		"\7h\2\2\u0222\u0223\7q\2\2\u0223\u0224\7t\2\2\u0224\u0225\7c\2\2\u0225"+
		"\u0226\7n\2\2\u0226\u0227\7n\2\2\u0227r\3\2\2\2\u0228\u0229\7^\2\2\u0229"+
		"\u022a\7p\2\2\u022a\u022b\7g\2\2\u022b\u022c\7i\2\2\u022ct\3\2\2\2\u022d"+
		"\u022e\7^\2\2\u022e\u022f\7k\2\2\u022f\u0230\7p\2\2\u0230v\3\2\2\2\u0231"+
		"\u0232\7^\2\2\u0232\u0233\7p\2\2\u0233\u0234\7q\2\2\u0234\u0235\7v\2\2"+
		"\u0235\u0236\7k\2\2\u0236\u0237\7p\2\2\u0237x\3\2\2\2\u0238\u0239\7^\2"+
		"\2\u0239\u023a\7n\2\2\u023a\u023b\7c\2\2\u023b\u023c\7p\2\2\u023c\u023d"+
		"\7f\2\2\u023dz\3\2\2\2\u023e\u023f\7^\2\2\u023f\u0240\7n\2\2\u0240\u0241"+
		"\7q\2\2\u0241\u0242\7t\2\2\u0242|\3\2\2\2\u0243\u0244\7^\2\2\u0244\u0245"+
		"\7t\2\2\u0245\u0246\7k\2\2\u0246\u0247\7i\2\2\u0247\u0248\7j\2\2\u0248"+
		"\u0249\7v\2\2\u0249\u024a\7c\2\2\u024a\u024b\7t\2\2\u024b\u024c\7t\2\2"+
		"\u024c\u024d\7q\2\2\u024d\u024e\7y\2\2\u024e~\3\2\2\2\u024f\u0250\7^\2"+
		"\2\u0250\u0251\7n\2\2\u0251\u0252\7g\2\2\u0252\u0253\7h\2\2\u0253\u0254"+
		"\7v\2\2\u0254\u0255\7c\2\2\u0255\u0256\7t\2\2\u0256\u0257\7t\2\2\u0257"+
		"\u0258\7q\2\2\u0258\u0259\7y\2\2\u0259\u0080\3\2\2\2\u025a\u025b\7^\2"+
		"\2\u025b\u025c\7c\2\2\u025c\u025d\7n\2\2\u025d\u025e\7r\2\2\u025e\u025f"+
		"\7j\2\2\u025f\u0260\7c\2\2\u0260\u0082\3\2\2\2\u0261\u0262\7^\2\2\u0262"+
		"\u0263\7d\2\2\u0263\u0264\7g\2\2\u0264\u0265\7v\2\2\u0265\u0266\7c\2\2"+
		"\u0266\u0084\3\2\2\2\u0267\u0268\7^\2\2\u0268\u0269\7i\2\2\u0269\u026a"+
		"\7c\2\2\u026a\u026b\7o\2\2\u026b\u026c\7o\2\2\u026c\u026d\7c\2\2\u026d"+
		"\u0086\3\2\2\2\u026e\u026f\7^\2\2\u026f\u0270\7f\2\2\u0270\u0271\7g\2"+
		"\2\u0271\u0272\7n\2\2\u0272\u0273\7v\2\2\u0273\u0274\7c\2\2\u0274\u0088"+
		"\3\2\2\2\u0275\u0276\7^\2\2\u0276\u0277\7g\2\2\u0277\u0278\7r\2\2\u0278"+
		"\u0279\7u\2\2\u0279\u027a\7k\2\2\u027a\u027b\7n\2\2\u027b\u027c\7q\2\2"+
		"\u027c\u027d\7p\2\2\u027d\u008a\3\2\2\2\u027e\u027f\7^\2\2\u027f\u0280"+
		"\7q\2\2\u0280\u0281\7o\2\2\u0281\u0282\7g\2\2\u0282\u0283\7i\2\2\u0283"+
		"\u0284\7c\2\2\u0284\u008c\3\2\2\2\u0285\u0286\7^\2\2\u0286\u0287\7r\2"+
		"\2\u0287\u0288\7k\2\2\u0288\u008e\3\2\2\2\u0289\u028a\7^\2\2\u028a\u028b"+
		"\7u\2\2\u028b\u028c\7k\2\2\u028c\u028d\7p\2\2\u028d\u0090\3\2\2\2\u028e"+
		"\u028f\7^\2\2\u028f\u0290\7e\2\2\u0290\u0291\7q\2\2\u0291\u0292\7u\2\2"+
		"\u0292\u0092\3\2\2\2\u0293\u0294\7^\2\2\u0294\u0295\7v\2\2\u0295\u0296"+
		"\7c\2\2\u0296\u0297\7p\2\2\u0297\u0094\3\2\2\2\u0298\u0299\7^\2\2\u0299"+
		"\u029a\7e\2\2\u029a\u029b\7q\2\2\u029b\u029c\7v\2\2\u029c\u0096\3\2\2"+
		"\2\u029d\u029e\7^\2\2\u029e\u029f\7c\2\2\u029f\u02a0\7t\2\2\u02a0\u02a1"+
		"\7e\2\2\u02a1\u02a2\7u\2\2\u02a2\u02a3\7k\2\2\u02a3\u02a4\7p\2\2\u02a4"+
		"\u0098\3\2\2\2\u02a5\u02a6\7^\2\2\u02a6\u02a7\7c\2\2\u02a7\u02a8\7t\2"+
		"\2\u02a8\u02a9\7e\2\2\u02a9\u02aa\7e\2\2\u02aa\u02ab\7q\2\2\u02ab\u02ac"+
		"\7u\2\2\u02ac\u009a\3\2\2\2\u02ad\u02ae\7^\2\2\u02ae\u02af\7c\2\2\u02af"+
		"\u02b0\7t\2\2\u02b0\u02b1\7e\2\2\u02b1\u02b2\7v\2\2\u02b2\u02b3\7c\2\2"+
		"\u02b3\u02b4\7p\2\2\u02b4\u009c\3\2\2\2\u02b5\u02b6\7^\2\2\u02b6\u02b7"+
		"\7c\2\2\u02b7\u02b8\7t\2\2\u02b8\u02b9\7e\2\2\u02b9\u02ba\7e\2\2\u02ba"+
		"\u02bb\7q\2\2\u02bb\u02bc\7v\2\2\u02bc\u009e\3\2\2\2\u02bd\u02c2\7\'\2"+
		"\2\u02be\u02c3\5W,\2\u02bf\u02c3\5U+\2\u02c0\u02c3\5\u00a3R\2\u02c1\u02c3"+
		"\7/\2\2\u02c2\u02be\3\2\2\2\u02c2\u02bf\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2"+
		"\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2"+
		"\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\5\u00a1Q\2\u02c7\u02c8\3\2\2\2\u02c8"+
		"\u02c9\bP\2\2\u02c9\u00a0\3\2\2\2\u02ca\u02cb\7\f\2\2\u02cb\u02cc\3\2"+
		"\2\2\u02cc\u02cd\bQ\2\2\u02cd\u00a2\3\2\2\2\u02ce\u02cf\7\"\2\2\u02cf"+
		"\u02d0\3\2\2\2\u02d0\u02d1\bR\2\2\u02d1\u00a4\3\2\2\2\u02d2\u02d3\7&\2"+
		"\2\u02d3\u00a6\3\2\2\2\u02d4\u02d5\7^\2\2\u02d5\u00a8\3\2\2\2\u02d6\u02d7"+
		"\13\2\2\2\u02d7\u00aa\3\2\2\2\21\2\u0124\u0140\u014d\u0167\u0178\u0181"+
		"\u01ac\u01b2\u01b4\u01ba\u01c1\u01c9\u02c2\u02c4\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}