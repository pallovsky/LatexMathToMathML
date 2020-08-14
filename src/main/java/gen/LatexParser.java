package gen;// Generated from /home/krzysztof/Dokumenty/Kompilatory/LatexToHtml/src/main/antlr/LatexParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LatexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, LINE_BREAK=3, DOCUMENTCLASS=4, PACKAGES=5, BEGIN=6, 
		END=7, TITLE=8, AUTHOR=9, DATE=10, FRAC=11, INT=12, MAKETITLE=13, SECTION=14, 
		LABEL=15, CLASS=16, PACKAGE=17, DOCUMENT=18, EQUATION=19, ALIGN=20, MATRIX=21, 
		MULTLINE=22, DISPLAYMATH=23, PLUS=24, MINUS=25, EQ=26, FACT=27, SLASH=28, 
		MUL=29, POWER=30, L=31, G=32, OPEN_PAREN=33, CLOSE_PAREN=34, OPEN_BRACE=35, 
		CLOSE_BRACE=36, OPEN_BRACKET=37, CLOSE_BRACKET=38, ANDSGN=39, NEWLINE=40, 
		SQRT=41, ULINE=42, DECIMAL_INTEGER=43, DECIMAL_FLOAT=44, LETTER=45, STRING=46, 
		LEQ=47, SUBSET=48, SUBSETEQ=49, GEQ=50, SUPSET=51, SUPSETEQ=52, TIMES=53, 
		DIV=54, AST=55, STAR=56, EXISTS=57, NEXISTS=58, FORALL=59, NEG=60, IN=61, 
		NIN=62, AND=63, OR=64, RIGHTARROW=65, LEFTARROW=66, ALPHA=67, BETA=68, 
		GAMMA=69, DELTA=70, EPSILON=71, OMEGA=72, PI=73, SIN=74, COS=75, TAN=76, 
		COT=77, ARCSIN=78, ARCCOS=79, ARCTAN=80, ARCCOT=81, COMMENT=82, EOL=83, 
		WS=84, DOLLAR=85, BACKSLASH=86, ANY_CHAR=87;
	public static final int
		RULE_prule = 0, RULE_data = 1, RULE_packages = 2, RULE_document = 3, RULE_body = 4, 
		RULE_section = 5, RULE_title = 6, RULE_author = 7, RULE_date = 8, RULE_equation = 9, 
		RULE_matrix = 10, RULE_align = 11, RULE_multline = 12, RULE_inline = 13, 
		RULE_centered = 14, RULE_displaymath = 15, RULE_math_formula = 16, RULE_matrix_formula = 17, 
		RULE_fraction = 18, RULE_integral = 19, RULE_sqrt = 20, RULE_simple_symbols = 21, 
		RULE_relation_symbols = 22, RULE_binary_operations = 23, RULE_logic_notation = 24, 
		RULE_greek_letters = 25, RULE_trigonometric = 26, RULE_symbol = 27, RULE_keyword = 28, 
		RULE_label = 29, RULE_text = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"prule", "data", "packages", "document", "body", "section", "title", 
			"author", "date", "equation", "matrix", "align", "multline", "inline", 
			"centered", "displaymath", "math_formula", "matrix_formula", "fraction", 
			"integral", "sqrt", "simple_symbols", "relation_symbols", "binary_operations", 
			"logic_notation", "greek_letters", "trigonometric", "symbol", "keyword", 
			"label", "text"
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
			"MATRIX", "MULTLINE", "DISPLAYMATH", "PLUS", "MINUS", "EQ", "FACT", "SLASH", 
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

	@Override
	public String getGrammarFileName() { return "LatexParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LatexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PruleContext extends ParserRuleContext {
		public TerminalNode DOCUMENTCLASS() { return getToken(LatexParser.DOCUMENTCLASS, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(LatexParser.OPEN_BRACE, 0); }
		public TerminalNode CLASS() { return getToken(LatexParser.CLASS, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(LatexParser.CLOSE_BRACE, 0); }
		public PackagesContext packages() {
			return getRuleContext(PackagesContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public DocumentContext document() {
			return getRuleContext(DocumentContext.class,0);
		}
		public PruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterPrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitPrule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitPrule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PruleContext prule() throws RecognitionException {
		PruleContext _localctx = new PruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(DOCUMENTCLASS);
			setState(63);
			match(OPEN_BRACE);
			setState(64);
			match(CLASS);
			setState(65);
			match(CLOSE_BRACE);
			setState(66);
			packages();
			setState(67);
			data();
			setState(68);
			document();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataContext extends ParserRuleContext {
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public AuthorContext author() {
			return getRuleContext(AuthorContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TITLE) {
				{
				setState(70);
				title();
				}
			}

			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTHOR) {
				{
				setState(73);
				author();
				}
			}

			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATE) {
				{
				setState(76);
				date();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackagesContext extends ParserRuleContext {
		public List<TerminalNode> PACKAGES() { return getTokens(LatexParser.PACKAGES); }
		public TerminalNode PACKAGES(int i) {
			return getToken(LatexParser.PACKAGES, i);
		}
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(LatexParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(LatexParser.OPEN_BRACKET, i);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(LatexParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(LatexParser.CLOSE_BRACKET, i);
		}
		public List<TerminalNode> OPEN_BRACE() { return getTokens(LatexParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(LatexParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> PACKAGE() { return getTokens(LatexParser.PACKAGE); }
		public TerminalNode PACKAGE(int i) {
			return getToken(LatexParser.PACKAGE, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(LatexParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(LatexParser.CLOSE_BRACE, i);
		}
		public List<TerminalNode> STRING() { return getTokens(LatexParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LatexParser.STRING, i);
		}
		public List<TerminalNode> DECIMAL_INTEGER() { return getTokens(LatexParser.DECIMAL_INTEGER); }
		public TerminalNode DECIMAL_INTEGER(int i) {
			return getToken(LatexParser.DECIMAL_INTEGER, i);
		}
		public PackagesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packages; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterPackages(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitPackages(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitPackages(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackagesContext packages() throws RecognitionException {
		PackagesContext _localctx = new PackagesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packages);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					{
					setState(79);
					match(PACKAGES);
					setState(80);
					match(OPEN_BRACE);
					setState(81);
					match(PACKAGE);
					setState(82);
					match(CLOSE_BRACE);
					}
					}
					break;
				case 2:
					{
					setState(83);
					match(PACKAGES);
					setState(84);
					match(OPEN_BRACKET);
					setState(86); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(85);
						_la = _input.LA(1);
						if ( !(_la==DECIMAL_INTEGER || _la==STRING) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(88); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==DECIMAL_INTEGER || _la==STRING );
					setState(90);
					match(CLOSE_BRACKET);
					setState(91);
					match(OPEN_BRACE);
					setState(92);
					match(PACKAGE);
					setState(93);
					match(CLOSE_BRACE);
					}
					break;
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PACKAGES );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(LatexParser.BEGIN, 0); }
		public List<TerminalNode> OPEN_BRACE() { return getTokens(LatexParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(LatexParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> DOCUMENT() { return getTokens(LatexParser.DOCUMENT); }
		public TerminalNode DOCUMENT(int i) {
			return getToken(LatexParser.DOCUMENT, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(LatexParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(LatexParser.CLOSE_BRACE, i);
		}
		public TerminalNode END() { return getToken(LatexParser.END, 0); }
		public TerminalNode MAKETITLE() { return getToken(LatexParser.MAKETITLE, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(BEGIN);
			setState(99);
			match(OPEN_BRACE);
			setState(100);
			match(DOCUMENT);
			setState(101);
			match(CLOSE_BRACE);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAKETITLE) {
				{
				setState(102);
				match(MAKETITLE);
				}
			}

			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(107);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BEGIN:
				case FRAC:
				case INT:
				case CLASS:
				case PACKAGE:
				case DOCUMENT:
				case EQUATION:
				case ALIGN:
				case MATRIX:
				case MULTLINE:
				case DISPLAYMATH:
				case PLUS:
				case MINUS:
				case EQ:
				case FACT:
				case SLASH:
				case MUL:
				case POWER:
				case L:
				case G:
				case OPEN_PAREN:
				case CLOSE_PAREN:
				case OPEN_BRACKET:
				case CLOSE_BRACKET:
				case ANDSGN:
				case SQRT:
				case ULINE:
				case DECIMAL_INTEGER:
				case LETTER:
				case STRING:
				case LEQ:
				case SUBSET:
				case SUBSETEQ:
				case GEQ:
				case SUPSET:
				case SUPSETEQ:
				case TIMES:
				case DIV:
				case AST:
				case STAR:
				case EXISTS:
				case NEXISTS:
				case FORALL:
				case NEG:
				case IN:
				case NIN:
				case AND:
				case OR:
				case RIGHTARROW:
				case LEFTARROW:
				case ALPHA:
				case BETA:
				case GAMMA:
				case DELTA:
				case EPSILON:
				case OMEGA:
				case PI:
				case SIN:
				case COS:
				case TAN:
				case COT:
				case ARCSIN:
				case ARCCOS:
				case ARCTAN:
				case ARCCOT:
				case DOLLAR:
				case BACKSLASH:
				case ANY_CHAR:
					{
					setState(105);
					body();
					}
					break;
				case SECTION:
					{
					setState(106);
					section();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << FRAC) | (1L << INT) | (1L << SECTION) | (1L << CLASS) | (1L << PACKAGE) | (1L << DOCUMENT) | (1L << EQUATION) | (1L << ALIGN) | (1L << MATRIX) | (1L << MULTLINE) | (1L << DISPLAYMATH) | (1L << PLUS) | (1L << MINUS) | (1L << EQ) | (1L << FACT) | (1L << SLASH) | (1L << MUL) | (1L << POWER) | (1L << L) | (1L << G) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_BRACKET) | (1L << CLOSE_BRACKET) | (1L << ANDSGN) | (1L << SQRT) | (1L << ULINE) | (1L << DECIMAL_INTEGER) | (1L << LETTER) | (1L << STRING) | (1L << LEQ) | (1L << SUBSET) | (1L << SUBSETEQ) | (1L << GEQ) | (1L << SUPSET) | (1L << SUPSETEQ) | (1L << TIMES) | (1L << DIV) | (1L << AST) | (1L << STAR) | (1L << EXISTS) | (1L << NEXISTS) | (1L << FORALL) | (1L << NEG) | (1L << IN) | (1L << NIN) | (1L << AND))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR - 64)) | (1L << (RIGHTARROW - 64)) | (1L << (LEFTARROW - 64)) | (1L << (ALPHA - 64)) | (1L << (BETA - 64)) | (1L << (GAMMA - 64)) | (1L << (DELTA - 64)) | (1L << (EPSILON - 64)) | (1L << (OMEGA - 64)) | (1L << (PI - 64)) | (1L << (SIN - 64)) | (1L << (COS - 64)) | (1L << (TAN - 64)) | (1L << (COT - 64)) | (1L << (ARCSIN - 64)) | (1L << (ARCCOS - 64)) | (1L << (ARCTAN - 64)) | (1L << (ARCCOT - 64)) | (1L << (DOLLAR - 64)) | (1L << (BACKSLASH - 64)) | (1L << (ANY_CHAR - 64)))) != 0) );
			setState(111);
			match(END);
			setState(112);
			match(OPEN_BRACE);
			setState(113);
			match(DOCUMENT);
			setState(114);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public List<MatrixContext> matrix() {
			return getRuleContexts(MatrixContext.class);
		}
		public MatrixContext matrix(int i) {
			return getRuleContext(MatrixContext.class,i);
		}
		public List<AlignContext> align() {
			return getRuleContexts(AlignContext.class);
		}
		public AlignContext align(int i) {
			return getRuleContext(AlignContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<MultlineContext> multline() {
			return getRuleContexts(MultlineContext.class);
		}
		public MultlineContext multline(int i) {
			return getRuleContext(MultlineContext.class,i);
		}
		public List<InlineContext> inline() {
			return getRuleContexts(InlineContext.class);
		}
		public InlineContext inline(int i) {
			return getRuleContext(InlineContext.class,i);
		}
		public List<CenteredContext> centered() {
			return getRuleContexts(CenteredContext.class);
		}
		public CenteredContext centered(int i) {
			return getRuleContext(CenteredContext.class,i);
		}
		public List<DisplaymathContext> displaymath() {
			return getRuleContexts(DisplaymathContext.class);
		}
		public DisplaymathContext displaymath(int i) {
			return getRuleContext(DisplaymathContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(124);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(116);
						equation();
						}
						break;
					case 2:
						{
						setState(117);
						matrix();
						}
						break;
					case 3:
						{
						setState(118);
						align();
						}
						break;
					case 4:
						{
						setState(119);
						text();
						}
						break;
					case 5:
						{
						setState(120);
						multline();
						}
						break;
					case 6:
						{
						setState(121);
						inline();
						}
						break;
					case 7:
						{
						setState(122);
						centered();
						}
						break;
					case 8:
						{
						setState(123);
						displaymath();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(126); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SectionContext extends ParserRuleContext {
		public TerminalNode SECTION() { return getToken(LatexParser.SECTION, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(LatexParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(LatexParser.CLOSE_BRACE, 0); }
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public List<MatrixContext> matrix() {
			return getRuleContexts(MatrixContext.class);
		}
		public MatrixContext matrix(int i) {
			return getRuleContext(MatrixContext.class,i);
		}
		public List<AlignContext> align() {
			return getRuleContexts(AlignContext.class);
		}
		public AlignContext align(int i) {
			return getRuleContext(AlignContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<MultlineContext> multline() {
			return getRuleContexts(MultlineContext.class);
		}
		public MultlineContext multline(int i) {
			return getRuleContext(MultlineContext.class,i);
		}
		public List<InlineContext> inline() {
			return getRuleContexts(InlineContext.class);
		}
		public InlineContext inline(int i) {
			return getRuleContext(InlineContext.class,i);
		}
		public List<CenteredContext> centered() {
			return getRuleContexts(CenteredContext.class);
		}
		public CenteredContext centered(int i) {
			return getRuleContext(CenteredContext.class,i);
		}
		public List<DisplaymathContext> displaymath() {
			return getRuleContexts(DisplaymathContext.class);
		}
		public DisplaymathContext displaymath(int i) {
			return getRuleContext(DisplaymathContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(LatexParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LatexParser.STRING, i);
		}
		public List<TerminalNode> WS() { return getTokens(LatexParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(LatexParser.WS, i);
		}
		public List<TerminalNode> LETTER() { return getTokens(LatexParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(LatexParser.LETTER, i);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(SECTION);
			setState(129);
			match(OPEN_BRACE);
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				_la = _input.LA(1);
				if ( !(((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (LETTER - 45)) | (1L << (STRING - 45)) | (1L << (WS - 45)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (LETTER - 45)) | (1L << (STRING - 45)) | (1L << (WS - 45)))) != 0) );
			setState(135);
			match(CLOSE_BRACE);
			setState(144); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(136);
						equation();
						}
						break;
					case 2:
						{
						setState(137);
						matrix();
						}
						break;
					case 3:
						{
						setState(138);
						align();
						}
						break;
					case 4:
						{
						setState(139);
						text();
						}
						break;
					case 5:
						{
						setState(140);
						multline();
						}
						break;
					case 6:
						{
						setState(141);
						inline();
						}
						break;
					case 7:
						{
						setState(142);
						centered();
						}
						break;
					case 8:
						{
						setState(143);
						displaymath();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(146); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(LatexParser.TITLE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(LatexParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(LatexParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> STRING() { return getTokens(LatexParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LatexParser.STRING, i);
		}
		public List<TerminalNode> WS() { return getTokens(LatexParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(LatexParser.WS, i);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(TITLE);
			setState(149);
			match(OPEN_BRACE);
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING || _la==WS );
			setState(155);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AuthorContext extends ParserRuleContext {
		public TerminalNode AUTHOR() { return getToken(LatexParser.AUTHOR, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(LatexParser.OPEN_BRACE, 0); }
		public List<TerminalNode> STRING() { return getTokens(LatexParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LatexParser.STRING, i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(LatexParser.CLOSE_BRACE, 0); }
		public TerminalNode WS() { return getToken(LatexParser.WS, 0); }
		public AuthorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_author; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterAuthor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitAuthor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitAuthor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthorContext author() throws RecognitionException {
		AuthorContext _localctx = new AuthorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_author);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(AUTHOR);
			setState(158);
			match(OPEN_BRACE);
			setState(159);
			match(STRING);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(160);
				match(WS);
				}
			}

			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(163);
				match(STRING);
				}
			}

			setState(166);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(LatexParser.DATE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(LatexParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(LatexParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> STRING() { return getTokens(LatexParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LatexParser.STRING, i);
		}
		public List<TerminalNode> DECIMAL_INTEGER() { return getTokens(LatexParser.DECIMAL_INTEGER); }
		public TerminalNode DECIMAL_INTEGER(int i) {
			return getToken(LatexParser.DECIMAL_INTEGER, i);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_date);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(DATE);
			setState(169);
			match(OPEN_BRACE);
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL_INTEGER || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DECIMAL_INTEGER || _la==STRING );
			setState(175);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquationContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(LatexParser.BEGIN, 0); }
		public List<TerminalNode> OPEN_BRACE() { return getTokens(LatexParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(LatexParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> EQUATION() { return getTokens(LatexParser.EQUATION); }
		public TerminalNode EQUATION(int i) {
			return getToken(LatexParser.EQUATION, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(LatexParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(LatexParser.CLOSE_BRACE, i);
		}
		public List<Math_formulaContext> math_formula() {
			return getRuleContexts(Math_formulaContext.class);
		}
		public Math_formulaContext math_formula(int i) {
			return getRuleContext(Math_formulaContext.class,i);
		}
		public TerminalNode END() { return getToken(LatexParser.END, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LatexParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LatexParser.NEWLINE, i);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_equation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(BEGIN);
			setState(178);
			match(OPEN_BRACE);
			setState(179);
			match(EQUATION);
			setState(180);
			match(CLOSE_BRACE);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL) {
				{
				setState(181);
				label();
				}
			}

			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184);
					math_formula();
					setState(185);
					match(NEWLINE);
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(192);
			math_formula();
			setState(193);
			match(END);
			setState(194);
			match(OPEN_BRACE);
			setState(195);
			match(EQUATION);
			setState(196);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatrixContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(LatexParser.BEGIN, 0); }
		public List<TerminalNode> OPEN_BRACE() { return getTokens(LatexParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(LatexParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> MATRIX() { return getTokens(LatexParser.MATRIX); }
		public TerminalNode MATRIX(int i) {
			return getToken(LatexParser.MATRIX, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(LatexParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(LatexParser.CLOSE_BRACE, i);
		}
		public Matrix_formulaContext matrix_formula() {
			return getRuleContext(Matrix_formulaContext.class,0);
		}
		public TerminalNode END() { return getToken(LatexParser.END, 0); }
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitMatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_matrix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(BEGIN);
			setState(199);
			match(OPEN_BRACE);
			setState(200);
			match(MATRIX);
			setState(201);
			match(CLOSE_BRACE);
			setState(202);
			matrix_formula();
			setState(203);
			match(END);
			setState(204);
			match(OPEN_BRACE);
			setState(205);
			match(MATRIX);
			setState(206);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(LatexParser.BEGIN, 0); }
		public List<TerminalNode> OPEN_BRACE() { return getTokens(LatexParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(LatexParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> ALIGN() { return getTokens(LatexParser.ALIGN); }
		public TerminalNode ALIGN(int i) {
			return getToken(LatexParser.ALIGN, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(LatexParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(LatexParser.CLOSE_BRACE, i);
		}
		public TerminalNode END() { return getToken(LatexParser.END, 0); }
		public List<Math_formulaContext> math_formula() {
			return getRuleContexts(Math_formulaContext.class);
		}
		public Math_formulaContext math_formula(int i) {
			return getRuleContext(Math_formulaContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LatexParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LatexParser.NEWLINE, i);
		}
		public AlignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_align; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterAlign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitAlign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitAlign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignContext align() throws RecognitionException {
		AlignContext _localctx = new AlignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_align);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(BEGIN);
			setState(209);
			match(OPEN_BRACE);
			setState(210);
			match(ALIGN);
			setState(211);
			match(CLOSE_BRACE);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAC) | (1L << INT) | (1L << PLUS) | (1L << MINUS) | (1L << EQ) | (1L << FACT) | (1L << SLASH) | (1L << MUL) | (1L << POWER) | (1L << L) | (1L << G) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_BRACKET) | (1L << CLOSE_BRACKET) | (1L << ANDSGN) | (1L << NEWLINE) | (1L << SQRT) | (1L << ULINE) | (1L << DECIMAL_INTEGER) | (1L << LETTER) | (1L << STRING) | (1L << LEQ) | (1L << SUBSET) | (1L << SUBSETEQ) | (1L << GEQ) | (1L << SUPSET) | (1L << SUPSETEQ) | (1L << TIMES) | (1L << DIV) | (1L << AST) | (1L << STAR) | (1L << EXISTS) | (1L << NEXISTS) | (1L << FORALL) | (1L << NEG) | (1L << IN) | (1L << NIN) | (1L << AND))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR - 64)) | (1L << (RIGHTARROW - 64)) | (1L << (LEFTARROW - 64)) | (1L << (ALPHA - 64)) | (1L << (BETA - 64)) | (1L << (GAMMA - 64)) | (1L << (DELTA - 64)) | (1L << (EPSILON - 64)) | (1L << (OMEGA - 64)) | (1L << (PI - 64)) | (1L << (SIN - 64)) | (1L << (COS - 64)) | (1L << (TAN - 64)) | (1L << (COT - 64)) | (1L << (ARCSIN - 64)) | (1L << (ARCCOS - 64)) | (1L << (ARCTAN - 64)) | (1L << (ARCCOT - 64)))) != 0)) {
				{
				setState(214);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FRAC:
				case INT:
				case PLUS:
				case MINUS:
				case EQ:
				case FACT:
				case SLASH:
				case MUL:
				case POWER:
				case L:
				case G:
				case OPEN_PAREN:
				case CLOSE_PAREN:
				case OPEN_BRACKET:
				case CLOSE_BRACKET:
				case ANDSGN:
				case SQRT:
				case ULINE:
				case DECIMAL_INTEGER:
				case LETTER:
				case STRING:
				case LEQ:
				case SUBSET:
				case SUBSETEQ:
				case GEQ:
				case SUPSET:
				case SUPSETEQ:
				case TIMES:
				case DIV:
				case AST:
				case STAR:
				case EXISTS:
				case NEXISTS:
				case FORALL:
				case NEG:
				case IN:
				case NIN:
				case AND:
				case OR:
				case RIGHTARROW:
				case LEFTARROW:
				case ALPHA:
				case BETA:
				case GAMMA:
				case DELTA:
				case EPSILON:
				case OMEGA:
				case PI:
				case SIN:
				case COS:
				case TAN:
				case COT:
				case ARCSIN:
				case ARCCOS:
				case ARCTAN:
				case ARCCOT:
					{
					setState(212);
					math_formula();
					}
					break;
				case NEWLINE:
					{
					setState(213);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(END);
			setState(220);
			match(OPEN_BRACE);
			setState(221);
			match(ALIGN);
			setState(222);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultlineContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(LatexParser.BEGIN, 0); }
		public List<TerminalNode> OPEN_BRACE() { return getTokens(LatexParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(LatexParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> MULTLINE() { return getTokens(LatexParser.MULTLINE); }
		public TerminalNode MULTLINE(int i) {
			return getToken(LatexParser.MULTLINE, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(LatexParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(LatexParser.CLOSE_BRACE, i);
		}
		public TerminalNode END() { return getToken(LatexParser.END, 0); }
		public List<Math_formulaContext> math_formula() {
			return getRuleContexts(Math_formulaContext.class);
		}
		public Math_formulaContext math_formula(int i) {
			return getRuleContext(Math_formulaContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LatexParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LatexParser.NEWLINE, i);
		}
		public MultlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterMultline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitMultline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitMultline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultlineContext multline() throws RecognitionException {
		MultlineContext _localctx = new MultlineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(BEGIN);
			setState(225);
			match(OPEN_BRACE);
			setState(226);
			match(MULTLINE);
			setState(227);
			match(CLOSE_BRACE);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAC) | (1L << INT) | (1L << PLUS) | (1L << MINUS) | (1L << EQ) | (1L << FACT) | (1L << SLASH) | (1L << MUL) | (1L << POWER) | (1L << L) | (1L << G) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_BRACKET) | (1L << CLOSE_BRACKET) | (1L << ANDSGN) | (1L << NEWLINE) | (1L << SQRT) | (1L << ULINE) | (1L << DECIMAL_INTEGER) | (1L << LETTER) | (1L << STRING) | (1L << LEQ) | (1L << SUBSET) | (1L << SUBSETEQ) | (1L << GEQ) | (1L << SUPSET) | (1L << SUPSETEQ) | (1L << TIMES) | (1L << DIV) | (1L << AST) | (1L << STAR) | (1L << EXISTS) | (1L << NEXISTS) | (1L << FORALL) | (1L << NEG) | (1L << IN) | (1L << NIN) | (1L << AND))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OR - 64)) | (1L << (RIGHTARROW - 64)) | (1L << (LEFTARROW - 64)) | (1L << (ALPHA - 64)) | (1L << (BETA - 64)) | (1L << (GAMMA - 64)) | (1L << (DELTA - 64)) | (1L << (EPSILON - 64)) | (1L << (OMEGA - 64)) | (1L << (PI - 64)) | (1L << (SIN - 64)) | (1L << (COS - 64)) | (1L << (TAN - 64)) | (1L << (COT - 64)) | (1L << (ARCSIN - 64)) | (1L << (ARCCOS - 64)) | (1L << (ARCTAN - 64)) | (1L << (ARCCOT - 64)))) != 0)) {
				{
				setState(230);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FRAC:
				case INT:
				case PLUS:
				case MINUS:
				case EQ:
				case FACT:
				case SLASH:
				case MUL:
				case POWER:
				case L:
				case G:
				case OPEN_PAREN:
				case CLOSE_PAREN:
				case OPEN_BRACKET:
				case CLOSE_BRACKET:
				case ANDSGN:
				case SQRT:
				case ULINE:
				case DECIMAL_INTEGER:
				case LETTER:
				case STRING:
				case LEQ:
				case SUBSET:
				case SUBSETEQ:
				case GEQ:
				case SUPSET:
				case SUPSETEQ:
				case TIMES:
				case DIV:
				case AST:
				case STAR:
				case EXISTS:
				case NEXISTS:
				case FORALL:
				case NEG:
				case IN:
				case NIN:
				case AND:
				case OR:
				case RIGHTARROW:
				case LEFTARROW:
				case ALPHA:
				case BETA:
				case GAMMA:
				case DELTA:
				case EPSILON:
				case OMEGA:
				case PI:
				case SIN:
				case COS:
				case TAN:
				case COT:
				case ARCSIN:
				case ARCCOS:
				case ARCTAN:
				case ARCCOT:
					{
					setState(228);
					math_formula();
					}
					break;
				case NEWLINE:
					{
					setState(229);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(END);
			setState(236);
			match(OPEN_BRACE);
			setState(237);
			match(MULTLINE);
			setState(238);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineContext extends ParserRuleContext {
		public List<TerminalNode> BACKSLASH() { return getTokens(LatexParser.BACKSLASH); }
		public TerminalNode BACKSLASH(int i) {
			return getToken(LatexParser.BACKSLASH, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(LatexParser.OPEN_PAREN, 0); }
		public Math_formulaContext math_formula() {
			return getRuleContext(Math_formulaContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(LatexParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> DOLLAR() { return getTokens(LatexParser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(LatexParser.DOLLAR, i);
		}
		public InlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterInline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitInline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitInline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineContext inline() throws RecognitionException {
		InlineContext _localctx = new InlineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_inline);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKSLASH:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(240);
				match(BACKSLASH);
				setState(241);
				match(OPEN_PAREN);
				setState(242);
				math_formula();
				setState(243);
				match(BACKSLASH);
				setState(244);
				match(CLOSE_PAREN);
				}
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(246);
				match(DOLLAR);
				setState(247);
				math_formula();
				setState(248);
				match(DOLLAR);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CenteredContext extends ParserRuleContext {
		public List<TerminalNode> BACKSLASH() { return getTokens(LatexParser.BACKSLASH); }
		public TerminalNode BACKSLASH(int i) {
			return getToken(LatexParser.BACKSLASH, i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(LatexParser.OPEN_BRACKET, 0); }
		public Math_formulaContext math_formula() {
			return getRuleContext(Math_formulaContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(LatexParser.CLOSE_BRACKET, 0); }
		public CenteredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_centered; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterCentered(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitCentered(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitCentered(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenteredContext centered() throws RecognitionException {
		CenteredContext _localctx = new CenteredContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_centered);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(BACKSLASH);
			setState(253);
			match(OPEN_BRACKET);
			setState(254);
			math_formula();
			setState(255);
			match(BACKSLASH);
			setState(256);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisplaymathContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(LatexParser.BEGIN, 0); }
		public List<TerminalNode> OPEN_BRACE() { return getTokens(LatexParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(LatexParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> DISPLAYMATH() { return getTokens(LatexParser.DISPLAYMATH); }
		public TerminalNode DISPLAYMATH(int i) {
			return getToken(LatexParser.DISPLAYMATH, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(LatexParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(LatexParser.CLOSE_BRACE, i);
		}
		public Math_formulaContext math_formula() {
			return getRuleContext(Math_formulaContext.class,0);
		}
		public TerminalNode END() { return getToken(LatexParser.END, 0); }
		public DisplaymathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displaymath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterDisplaymath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitDisplaymath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitDisplaymath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplaymathContext displaymath() throws RecognitionException {
		DisplaymathContext _localctx = new DisplaymathContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_displaymath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(BEGIN);
			setState(259);
			match(OPEN_BRACE);
			setState(260);
			match(DISPLAYMATH);
			setState(261);
			match(CLOSE_BRACE);
			setState(262);
			math_formula();
			setState(263);
			match(END);
			setState(264);
			match(OPEN_BRACE);
			setState(265);
			match(DISPLAYMATH);
			setState(266);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_formulaContext extends ParserRuleContext {
		public List<TerminalNode> DECIMAL_INTEGER() { return getTokens(LatexParser.DECIMAL_INTEGER); }
		public TerminalNode DECIMAL_INTEGER(int i) {
			return getToken(LatexParser.DECIMAL_INTEGER, i);
		}
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public List<FractionContext> fraction() {
			return getRuleContexts(FractionContext.class);
		}
		public FractionContext fraction(int i) {
			return getRuleContext(FractionContext.class,i);
		}
		public List<SqrtContext> sqrt() {
			return getRuleContexts(SqrtContext.class);
		}
		public SqrtContext sqrt(int i) {
			return getRuleContext(SqrtContext.class,i);
		}
		public List<IntegralContext> integral() {
			return getRuleContexts(IntegralContext.class);
		}
		public IntegralContext integral(int i) {
			return getRuleContext(IntegralContext.class,i);
		}
		public List<TerminalNode> LETTER() { return getTokens(LatexParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(LatexParser.LETTER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(LatexParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LatexParser.STRING, i);
		}
		public Math_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterMath_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitMath_formula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitMath_formula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_formulaContext math_formula() throws RecognitionException {
		Math_formulaContext _localctx = new Math_formulaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_math_formula);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(275);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DECIMAL_INTEGER:
						{
						setState(268);
						match(DECIMAL_INTEGER);
						}
						break;
					case PLUS:
					case MINUS:
					case EQ:
					case FACT:
					case SLASH:
					case MUL:
					case POWER:
					case L:
					case G:
					case OPEN_PAREN:
					case CLOSE_PAREN:
					case OPEN_BRACKET:
					case CLOSE_BRACKET:
					case ANDSGN:
					case ULINE:
					case LEQ:
					case SUBSET:
					case SUBSETEQ:
					case GEQ:
					case SUPSET:
					case SUPSETEQ:
					case TIMES:
					case DIV:
					case AST:
					case STAR:
					case EXISTS:
					case NEXISTS:
					case FORALL:
					case NEG:
					case IN:
					case NIN:
					case AND:
					case OR:
					case RIGHTARROW:
					case LEFTARROW:
					case ALPHA:
					case BETA:
					case GAMMA:
					case DELTA:
					case EPSILON:
					case OMEGA:
					case PI:
					case SIN:
					case COS:
					case TAN:
					case COT:
					case ARCSIN:
					case ARCCOS:
					case ARCTAN:
					case ARCCOT:
						{
						setState(269);
						symbol();
						}
						break;
					case FRAC:
						{
						setState(270);
						fraction();
						}
						break;
					case SQRT:
						{
						setState(271);
						sqrt();
						}
						break;
					case INT:
						{
						setState(272);
						integral();
						}
						break;
					case LETTER:
						{
						setState(273);
						match(LETTER);
						}
						break;
					case STRING:
						{
						setState(274);
						match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(277); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Matrix_formulaContext extends ParserRuleContext {
		public List<TerminalNode> DECIMAL_INTEGER() { return getTokens(LatexParser.DECIMAL_INTEGER); }
		public TerminalNode DECIMAL_INTEGER(int i) {
			return getToken(LatexParser.DECIMAL_INTEGER, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LatexParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LatexParser.NEWLINE, i);
		}
		public List<TerminalNode> ANDSGN() { return getTokens(LatexParser.ANDSGN); }
		public TerminalNode ANDSGN(int i) {
			return getToken(LatexParser.ANDSGN, i);
		}
		public Matrix_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterMatrix_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitMatrix_formula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitMatrix_formula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matrix_formulaContext matrix_formula() throws RecognitionException {
		Matrix_formulaContext _localctx = new Matrix_formulaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_matrix_formula);
		try {
			int _alt;
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(DECIMAL_INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(282); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(280);
								match(DECIMAL_INTEGER);
								setState(281);
								match(ANDSGN);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(284); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(286);
						match(DECIMAL_INTEGER);
						setState(287);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(290); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(294); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(292);
						match(DECIMAL_INTEGER);
						setState(293);
						match(ANDSGN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(296); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(298);
				match(DECIMAL_INTEGER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FractionContext extends ParserRuleContext {
		public TerminalNode FRAC() { return getToken(LatexParser.FRAC, 0); }
		public List<TerminalNode> OPEN_BRACE() { return getTokens(LatexParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(LatexParser.OPEN_BRACE, i);
		}
		public List<Math_formulaContext> math_formula() {
			return getRuleContexts(Math_formulaContext.class);
		}
		public Math_formulaContext math_formula(int i) {
			return getRuleContext(Math_formulaContext.class,i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(LatexParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(LatexParser.CLOSE_BRACE, i);
		}
		public FractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterFraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitFraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitFraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FractionContext fraction() throws RecognitionException {
		FractionContext _localctx = new FractionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(FRAC);
			setState(302);
			match(OPEN_BRACE);
			setState(303);
			math_formula();
			setState(304);
			match(CLOSE_BRACE);
			setState(305);
			match(OPEN_BRACE);
			setState(306);
			math_formula();
			setState(307);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LatexParser.INT, 0); }
		public TerminalNode ULINE() { return getToken(LatexParser.ULINE, 0); }
		public List<TerminalNode> LETTER() { return getTokens(LatexParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(LatexParser.LETTER, i);
		}
		public TerminalNode POWER() { return getToken(LatexParser.POWER, 0); }
		public IntegralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterIntegral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitIntegral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitIntegral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralContext integral() throws RecognitionException {
		IntegralContext _localctx = new IntegralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_integral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(INT);
			setState(310);
			match(ULINE);
			setState(311);
			match(LETTER);
			setState(312);
			match(POWER);
			setState(313);
			match(LETTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqrtContext extends ParserRuleContext {
		public TerminalNode SQRT() { return getToken(LatexParser.SQRT, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(LatexParser.OPEN_BRACE, 0); }
		public Math_formulaContext math_formula() {
			return getRuleContext(Math_formulaContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(LatexParser.CLOSE_BRACE, 0); }
		public SqrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterSqrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitSqrt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitSqrt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqrtContext sqrt() throws RecognitionException {
		SqrtContext _localctx = new SqrtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sqrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(SQRT);
			setState(316);
			match(OPEN_BRACE);
			setState(317);
			math_formula();
			setState(318);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_symbolsContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(LatexParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LatexParser.MINUS, 0); }
		public TerminalNode EQ() { return getToken(LatexParser.EQ, 0); }
		public TerminalNode POWER() { return getToken(LatexParser.POWER, 0); }
		public TerminalNode FACT() { return getToken(LatexParser.FACT, 0); }
		public TerminalNode SLASH() { return getToken(LatexParser.SLASH, 0); }
		public TerminalNode MUL() { return getToken(LatexParser.MUL, 0); }
		public TerminalNode L() { return getToken(LatexParser.L, 0); }
		public TerminalNode G() { return getToken(LatexParser.G, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(LatexParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(LatexParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(LatexParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(LatexParser.CLOSE_BRACKET, 0); }
		public TerminalNode ANDSGN() { return getToken(LatexParser.ANDSGN, 0); }
		public TerminalNode ULINE() { return getToken(LatexParser.ULINE, 0); }
		public Simple_symbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_symbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterSimple_symbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitSimple_symbols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitSimple_symbols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_symbolsContext simple_symbols() throws RecognitionException {
		Simple_symbolsContext _localctx = new Simple_symbolsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_simple_symbols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << EQ) | (1L << FACT) | (1L << SLASH) | (1L << MUL) | (1L << POWER) | (1L << L) | (1L << G) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_BRACKET) | (1L << CLOSE_BRACKET) | (1L << ANDSGN) | (1L << ULINE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relation_symbolsContext extends ParserRuleContext {
		public TerminalNode LEQ() { return getToken(LatexParser.LEQ, 0); }
		public TerminalNode SUBSET() { return getToken(LatexParser.SUBSET, 0); }
		public TerminalNode SUBSETEQ() { return getToken(LatexParser.SUBSETEQ, 0); }
		public TerminalNode GEQ() { return getToken(LatexParser.GEQ, 0); }
		public TerminalNode SUPSET() { return getToken(LatexParser.SUPSET, 0); }
		public TerminalNode SUPSETEQ() { return getToken(LatexParser.SUPSETEQ, 0); }
		public Relation_symbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_symbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterRelation_symbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitRelation_symbols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitRelation_symbols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_symbolsContext relation_symbols() throws RecognitionException {
		Relation_symbolsContext _localctx = new Relation_symbolsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relation_symbols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEQ) | (1L << SUBSET) | (1L << SUBSETEQ) | (1L << GEQ) | (1L << SUPSET) | (1L << SUPSETEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_operationsContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(LatexParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(LatexParser.DIV, 0); }
		public TerminalNode AST() { return getToken(LatexParser.AST, 0); }
		public TerminalNode STAR() { return getToken(LatexParser.STAR, 0); }
		public Binary_operationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterBinary_operations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitBinary_operations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitBinary_operations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operationsContext binary_operations() throws RecognitionException {
		Binary_operationsContext _localctx = new Binary_operationsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_binary_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIV) | (1L << AST) | (1L << STAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_notationContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(LatexParser.EXISTS, 0); }
		public TerminalNode NEXISTS() { return getToken(LatexParser.NEXISTS, 0); }
		public TerminalNode FORALL() { return getToken(LatexParser.FORALL, 0); }
		public TerminalNode NEG() { return getToken(LatexParser.NEG, 0); }
		public TerminalNode IN() { return getToken(LatexParser.IN, 0); }
		public TerminalNode NIN() { return getToken(LatexParser.NIN, 0); }
		public TerminalNode AND() { return getToken(LatexParser.AND, 0); }
		public TerminalNode OR() { return getToken(LatexParser.OR, 0); }
		public TerminalNode RIGHTARROW() { return getToken(LatexParser.RIGHTARROW, 0); }
		public TerminalNode LEFTARROW() { return getToken(LatexParser.LEFTARROW, 0); }
		public Logic_notationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_notation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterLogic_notation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitLogic_notation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitLogic_notation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_notationContext logic_notation() throws RecognitionException {
		Logic_notationContext _localctx = new Logic_notationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logic_notation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (EXISTS - 57)) | (1L << (NEXISTS - 57)) | (1L << (FORALL - 57)) | (1L << (NEG - 57)) | (1L << (IN - 57)) | (1L << (NIN - 57)) | (1L << (AND - 57)) | (1L << (OR - 57)) | (1L << (RIGHTARROW - 57)) | (1L << (LEFTARROW - 57)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Greek_lettersContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(LatexParser.ALPHA, 0); }
		public TerminalNode BETA() { return getToken(LatexParser.BETA, 0); }
		public TerminalNode GAMMA() { return getToken(LatexParser.GAMMA, 0); }
		public TerminalNode DELTA() { return getToken(LatexParser.DELTA, 0); }
		public TerminalNode EPSILON() { return getToken(LatexParser.EPSILON, 0); }
		public TerminalNode OMEGA() { return getToken(LatexParser.OMEGA, 0); }
		public TerminalNode PI() { return getToken(LatexParser.PI, 0); }
		public Greek_lettersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greek_letters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterGreek_letters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitGreek_letters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitGreek_letters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Greek_lettersContext greek_letters() throws RecognitionException {
		Greek_lettersContext _localctx = new Greek_lettersContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_greek_letters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ALPHA - 67)) | (1L << (BETA - 67)) | (1L << (GAMMA - 67)) | (1L << (DELTA - 67)) | (1L << (EPSILON - 67)) | (1L << (OMEGA - 67)) | (1L << (PI - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrigonometricContext extends ParserRuleContext {
		public TerminalNode SIN() { return getToken(LatexParser.SIN, 0); }
		public TerminalNode COS() { return getToken(LatexParser.COS, 0); }
		public TerminalNode TAN() { return getToken(LatexParser.TAN, 0); }
		public TerminalNode COT() { return getToken(LatexParser.COT, 0); }
		public TerminalNode ARCSIN() { return getToken(LatexParser.ARCSIN, 0); }
		public TerminalNode ARCCOS() { return getToken(LatexParser.ARCCOS, 0); }
		public TerminalNode ARCTAN() { return getToken(LatexParser.ARCTAN, 0); }
		public TerminalNode ARCCOT() { return getToken(LatexParser.ARCCOT, 0); }
		public TrigonometricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigonometric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterTrigonometric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitTrigonometric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitTrigonometric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrigonometricContext trigonometric() throws RecognitionException {
		TrigonometricContext _localctx = new TrigonometricContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_trigonometric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SIN - 74)) | (1L << (COS - 74)) | (1L << (TAN - 74)) | (1L << (COT - 74)) | (1L << (ARCSIN - 74)) | (1L << (ARCCOS - 74)) | (1L << (ARCTAN - 74)) | (1L << (ARCCOT - 74)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolContext extends ParserRuleContext {
		public Simple_symbolsContext simple_symbols() {
			return getRuleContext(Simple_symbolsContext.class,0);
		}
		public Relation_symbolsContext relation_symbols() {
			return getRuleContext(Relation_symbolsContext.class,0);
		}
		public Greek_lettersContext greek_letters() {
			return getRuleContext(Greek_lettersContext.class,0);
		}
		public Binary_operationsContext binary_operations() {
			return getRuleContext(Binary_operationsContext.class,0);
		}
		public Logic_notationContext logic_notation() {
			return getRuleContext(Logic_notationContext.class,0);
		}
		public TrigonometricContext trigonometric() {
			return getRuleContext(TrigonometricContext.class,0);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_symbol);
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case EQ:
			case FACT:
			case SLASH:
			case MUL:
			case POWER:
			case L:
			case G:
			case OPEN_PAREN:
			case CLOSE_PAREN:
			case OPEN_BRACKET:
			case CLOSE_BRACKET:
			case ANDSGN:
			case ULINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				simple_symbols();
				}
				break;
			case LEQ:
			case SUBSET:
			case SUBSETEQ:
			case GEQ:
			case SUPSET:
			case SUPSETEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				relation_symbols();
				}
				break;
			case ALPHA:
			case BETA:
			case GAMMA:
			case DELTA:
			case EPSILON:
			case OMEGA:
			case PI:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				greek_letters();
				}
				break;
			case TIMES:
			case DIV:
			case AST:
			case STAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				binary_operations();
				}
				break;
			case EXISTS:
			case NEXISTS:
			case FORALL:
			case NEG:
			case IN:
			case NIN:
			case AND:
			case OR:
			case RIGHTARROW:
			case LEFTARROW:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				logic_notation();
				}
				break;
			case SIN:
			case COS:
			case TAN:
			case COT:
			case ARCSIN:
			case ARCCOS:
			case ARCTAN:
			case ARCCOT:
				enterOuterAlt(_localctx, 6);
				{
				setState(337);
				trigonometric();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(LatexParser.CLASS, 0); }
		public TerminalNode PACKAGE() { return getToken(LatexParser.PACKAGE, 0); }
		public TerminalNode DOCUMENT() { return getToken(LatexParser.DOCUMENT, 0); }
		public TerminalNode EQUATION() { return getToken(LatexParser.EQUATION, 0); }
		public TerminalNode ALIGN() { return getToken(LatexParser.ALIGN, 0); }
		public TerminalNode MATRIX() { return getToken(LatexParser.MATRIX, 0); }
		public TerminalNode MULTLINE() { return getToken(LatexParser.MULTLINE, 0); }
		public TerminalNode DISPLAYMATH() { return getToken(LatexParser.DISPLAYMATH, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PACKAGE) | (1L << DOCUMENT) | (1L << EQUATION) | (1L << ALIGN) | (1L << MATRIX) | (1L << MULTLINE) | (1L << DISPLAYMATH))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(LatexParser.LABEL, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(LatexParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(LatexParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> STRING() { return getTokens(LatexParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LatexParser.STRING, i);
		}
		public List<TerminalNode> WS() { return getTokens(LatexParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(LatexParser.WS, i);
		}
		public List<TerminalNode> DECIMAL_INTEGER() { return getTokens(LatexParser.DECIMAL_INTEGER); }
		public TerminalNode DECIMAL_INTEGER(int i) {
			return getToken(LatexParser.DECIMAL_INTEGER, i);
		}
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(LABEL);
			setState(343);
			match(OPEN_BRACE);
			setState(348); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(348);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(344);
					match(STRING);
					}
					break;
				case WS:
					{
					setState(345);
					match(WS);
					}
					break;
				case DECIMAL_INTEGER:
					{
					setState(346);
					match(DECIMAL_INTEGER);
					}
					break;
				case PLUS:
				case MINUS:
				case EQ:
				case FACT:
				case SLASH:
				case MUL:
				case POWER:
				case L:
				case G:
				case OPEN_PAREN:
				case CLOSE_PAREN:
				case OPEN_BRACKET:
				case CLOSE_BRACKET:
				case ANDSGN:
				case ULINE:
				case LEQ:
				case SUBSET:
				case SUBSETEQ:
				case GEQ:
				case SUPSET:
				case SUPSETEQ:
				case TIMES:
				case DIV:
				case AST:
				case STAR:
				case EXISTS:
				case NEXISTS:
				case FORALL:
				case NEG:
				case IN:
				case NIN:
				case AND:
				case OR:
				case RIGHTARROW:
				case LEFTARROW:
				case ALPHA:
				case BETA:
				case GAMMA:
				case DELTA:
				case EPSILON:
				case OMEGA:
				case PI:
				case SIN:
				case COS:
				case TAN:
				case COT:
				case ARCSIN:
				case ARCCOS:
				case ARCTAN:
				case ARCCOT:
					{
					setState(347);
					symbol();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(350); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (PLUS - 24)) | (1L << (MINUS - 24)) | (1L << (EQ - 24)) | (1L << (FACT - 24)) | (1L << (SLASH - 24)) | (1L << (MUL - 24)) | (1L << (POWER - 24)) | (1L << (L - 24)) | (1L << (G - 24)) | (1L << (OPEN_PAREN - 24)) | (1L << (CLOSE_PAREN - 24)) | (1L << (OPEN_BRACKET - 24)) | (1L << (CLOSE_BRACKET - 24)) | (1L << (ANDSGN - 24)) | (1L << (ULINE - 24)) | (1L << (DECIMAL_INTEGER - 24)) | (1L << (STRING - 24)) | (1L << (LEQ - 24)) | (1L << (SUBSET - 24)) | (1L << (SUBSETEQ - 24)) | (1L << (GEQ - 24)) | (1L << (SUPSET - 24)) | (1L << (SUPSETEQ - 24)) | (1L << (TIMES - 24)) | (1L << (DIV - 24)) | (1L << (AST - 24)) | (1L << (STAR - 24)) | (1L << (EXISTS - 24)) | (1L << (NEXISTS - 24)) | (1L << (FORALL - 24)) | (1L << (NEG - 24)) | (1L << (IN - 24)) | (1L << (NIN - 24)) | (1L << (AND - 24)) | (1L << (OR - 24)) | (1L << (RIGHTARROW - 24)) | (1L << (LEFTARROW - 24)) | (1L << (ALPHA - 24)) | (1L << (BETA - 24)) | (1L << (GAMMA - 24)) | (1L << (DELTA - 24)) | (1L << (EPSILON - 24)) | (1L << (OMEGA - 24)) | (1L << (PI - 24)) | (1L << (SIN - 24)) | (1L << (COS - 24)) | (1L << (TAN - 24)) | (1L << (COT - 24)) | (1L << (ARCSIN - 24)) | (1L << (ARCCOS - 24)) | (1L << (ARCTAN - 24)) | (1L << (ARCCOT - 24)) | (1L << (WS - 24)))) != 0) );
			setState(352);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(LatexParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LatexParser.STRING, i);
		}
		public List<Math_formulaContext> math_formula() {
			return getRuleContexts(Math_formulaContext.class);
		}
		public Math_formulaContext math_formula(int i) {
			return getRuleContext(Math_formulaContext.class,i);
		}
		public List<TerminalNode> ANY_CHAR() { return getTokens(LatexParser.ANY_CHAR); }
		public TerminalNode ANY_CHAR(int i) {
			return getToken(LatexParser.ANY_CHAR, i);
		}
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexParserListener ) ((LatexParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexParserVisitor ) return ((LatexParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(358); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(358);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(354);
						match(STRING);
						}
						break;
					case 2:
						{
						setState(355);
						math_formula();
						}
						break;
					case 3:
						{
						setState(356);
						match(ANY_CHAR);
						}
						break;
					case 4:
						{
						setState(357);
						keyword();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(360); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Y\u016d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\5\3J\n\3\3\3\5\3M\n\3\3\3\5\3P\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4Y\n\4\r\4\16\4Z\3\4\3\4\3\4\3\4\6\4a\n\4"+
		"\r\4\16\4b\3\5\3\5\3\5\3\5\3\5\5\5j\n\5\3\5\3\5\6\5n\n\5\r\5\16\5o\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\177\n\6\r\6\16\6"+
		"\u0080\3\7\3\7\3\7\6\7\u0086\n\7\r\7\16\7\u0087\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\6\7\u0093\n\7\r\7\16\7\u0094\3\b\3\b\3\b\6\b\u009a\n\b"+
		"\r\b\16\b\u009b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00a4\n\t\3\t\5\t\u00a7\n"+
		"\t\3\t\3\t\3\n\3\n\3\n\6\n\u00ae\n\n\r\n\16\n\u00af\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00b9\n\13\3\13\3\13\3\13\7\13\u00be\n\13\f\13\16"+
		"\13\u00c1\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d9\n\r\f\r\16\r\u00dc"+
		"\13\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00e9\n\16"+
		"\f\16\16\16\u00ec\13\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u00fd\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\6\22\u0116\n\22\r\22\16\22\u0117\3\23\3\23\3\23\6"+
		"\23\u011d\n\23\r\23\16\23\u011e\3\23\3\23\6\23\u0123\n\23\r\23\16\23\u0124"+
		"\3\23\3\23\6\23\u0129\n\23\r\23\16\23\u012a\3\23\5\23\u012e\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0155\n\35\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\6\37\u015f\n\37\r\37\16\37\u0160\3\37\3\37\3"+
		" \3 \3 \3 \6 \u0169\n \r \16 \u016a\3 \2\2!\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\f\4\2--\60\60\4\2/\60VV\4\2\60"+
		"\60VV\5\2\32$\'),,\3\2\61\66\3\2\67:\3\2;D\3\2EK\3\2LS\3\2\22\31\2\u018a"+
		"\2@\3\2\2\2\4I\3\2\2\2\6`\3\2\2\2\bd\3\2\2\2\n~\3\2\2\2\f\u0082\3\2\2"+
		"\2\16\u0096\3\2\2\2\20\u009f\3\2\2\2\22\u00aa\3\2\2\2\24\u00b3\3\2\2\2"+
		"\26\u00c8\3\2\2\2\30\u00d2\3\2\2\2\32\u00e2\3\2\2\2\34\u00fc\3\2\2\2\36"+
		"\u00fe\3\2\2\2 \u0104\3\2\2\2\"\u0115\3\2\2\2$\u012d\3\2\2\2&\u012f\3"+
		"\2\2\2(\u0137\3\2\2\2*\u013d\3\2\2\2,\u0142\3\2\2\2.\u0144\3\2\2\2\60"+
		"\u0146\3\2\2\2\62\u0148\3\2\2\2\64\u014a\3\2\2\2\66\u014c\3\2\2\28\u0154"+
		"\3\2\2\2:\u0156\3\2\2\2<\u0158\3\2\2\2>\u0168\3\2\2\2@A\7\6\2\2AB\7%\2"+
		"\2BC\7\22\2\2CD\7&\2\2DE\5\6\4\2EF\5\4\3\2FG\5\b\5\2G\3\3\2\2\2HJ\5\16"+
		"\b\2IH\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KM\5\20\t\2LK\3\2\2\2LM\3\2\2\2MO\3"+
		"\2\2\2NP\5\22\n\2ON\3\2\2\2OP\3\2\2\2P\5\3\2\2\2QR\7\7\2\2RS\7%\2\2ST"+
		"\7\23\2\2Ta\7&\2\2UV\7\7\2\2VX\7\'\2\2WY\t\2\2\2XW\3\2\2\2YZ\3\2\2\2Z"+
		"X\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7(\2\2]^\7%\2\2^_\7\23\2\2_a\7&\2\2"+
		"`Q\3\2\2\2`U\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\7\3\2\2\2de\7\b\2"+
		"\2ef\7%\2\2fg\7\24\2\2gi\7&\2\2hj\7\17\2\2ih\3\2\2\2ij\3\2\2\2jm\3\2\2"+
		"\2kn\5\n\6\2ln\5\f\7\2mk\3\2\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2"+
		"\2pq\3\2\2\2qr\7\t\2\2rs\7%\2\2st\7\24\2\2tu\7&\2\2u\t\3\2\2\2v\177\5"+
		"\24\13\2w\177\5\26\f\2x\177\5\30\r\2y\177\5> \2z\177\5\32\16\2{\177\5"+
		"\34\17\2|\177\5\36\20\2}\177\5 \21\2~v\3\2\2\2~w\3\2\2\2~x\3\2\2\2~y\3"+
		"\2\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\13\3\2\2\2\u0082\u0083\7\20\2\2\u0083"+
		"\u0085\7%\2\2\u0084\u0086\t\3\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u0092\7&\2\2\u008a\u0093\5\24\13\2\u008b\u0093\5\26\f\2\u008c\u0093\5"+
		"\30\r\2\u008d\u0093\5> \2\u008e\u0093\5\32\16\2\u008f\u0093\5\34\17\2"+
		"\u0090\u0093\5\36\20\2\u0091\u0093\5 \21\2\u0092\u008a\3\2\2\2\u0092\u008b"+
		"\3\2\2\2\u0092\u008c\3\2\2\2\u0092\u008d\3\2\2\2\u0092\u008e\3\2\2\2\u0092"+
		"\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\r\3\2\2\2\u0096\u0097"+
		"\7\n\2\2\u0097\u0099\7%\2\2\u0098\u009a\t\4\2\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\7&\2\2\u009e\17\3\2\2\2\u009f\u00a0\7\13\2\2\u00a0\u00a1"+
		"\7%\2\2\u00a1\u00a3\7\60\2\2\u00a2\u00a4\7V\2\2\u00a3\u00a2\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a7\7\60\2\2\u00a6\u00a5\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7&\2\2\u00a9"+
		"\21\3\2\2\2\u00aa\u00ab\7\f\2\2\u00ab\u00ad\7%\2\2\u00ac\u00ae\t\2\2\2"+
		"\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7&\2\2\u00b2\23\3\2\2\2\u00b3"+
		"\u00b4\7\b\2\2\u00b4\u00b5\7%\2\2\u00b5\u00b6\7\25\2\2\u00b6\u00b8\7&"+
		"\2\2\u00b7\u00b9\5<\37\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bf\3\2\2\2\u00ba\u00bb\5\"\22\2\u00bb\u00bc\7*\2\2\u00bc\u00be\3\2"+
		"\2\2\u00bd\u00ba\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\5\""+
		"\22\2\u00c3\u00c4\7\t\2\2\u00c4\u00c5\7%\2\2\u00c5\u00c6\7\25\2\2\u00c6"+
		"\u00c7\7&\2\2\u00c7\25\3\2\2\2\u00c8\u00c9\7\b\2\2\u00c9\u00ca\7%\2\2"+
		"\u00ca\u00cb\7\27\2\2\u00cb\u00cc\7&\2\2\u00cc\u00cd\5$\23\2\u00cd\u00ce"+
		"\7\t\2\2\u00ce\u00cf\7%\2\2\u00cf\u00d0\7\27\2\2\u00d0\u00d1\7&\2\2\u00d1"+
		"\27\3\2\2\2\u00d2\u00d3\7\b\2\2\u00d3\u00d4\7%\2\2\u00d4\u00d5\7\26\2"+
		"\2\u00d5\u00da\7&\2\2\u00d6\u00d9\5\"\22\2\u00d7\u00d9\7*\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7\t"+
		"\2\2\u00de\u00df\7%\2\2\u00df\u00e0\7\26\2\2\u00e0\u00e1\7&\2\2\u00e1"+
		"\31\3\2\2\2\u00e2\u00e3\7\b\2\2\u00e3\u00e4\7%\2\2\u00e4\u00e5\7\30\2"+
		"\2\u00e5\u00ea\7&\2\2\u00e6\u00e9\5\"\22\2\u00e7\u00e9\7*\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\t"+
		"\2\2\u00ee\u00ef\7%\2\2\u00ef\u00f0\7\30\2\2\u00f0\u00f1\7&\2\2\u00f1"+
		"\33\3\2\2\2\u00f2\u00f3\7X\2\2\u00f3\u00f4\7#\2\2\u00f4\u00f5\5\"\22\2"+
		"\u00f5\u00f6\7X\2\2\u00f6\u00f7\7$\2\2\u00f7\u00fd\3\2\2\2\u00f8\u00f9"+
		"\7W\2\2\u00f9\u00fa\5\"\22\2\u00fa\u00fb\7W\2\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00f2\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fd\35\3\2\2\2\u00fe\u00ff\7X\2\2"+
		"\u00ff\u0100\7\'\2\2\u0100\u0101\5\"\22\2\u0101\u0102\7X\2\2\u0102\u0103"+
		"\7(\2\2\u0103\37\3\2\2\2\u0104\u0105\7\b\2\2\u0105\u0106\7%\2\2\u0106"+
		"\u0107\7\31\2\2\u0107\u0108\7&\2\2\u0108\u0109\5\"\22\2\u0109\u010a\7"+
		"\t\2\2\u010a\u010b\7%\2\2\u010b\u010c\7\31\2\2\u010c\u010d\7&\2\2\u010d"+
		"!\3\2\2\2\u010e\u0116\7-\2\2\u010f\u0116\58\35\2\u0110\u0116\5&\24\2\u0111"+
		"\u0116\5*\26\2\u0112\u0116\5(\25\2\u0113\u0116\7/\2\2\u0114\u0116\7\60"+
		"\2\2\u0115\u010e\3\2\2\2\u0115\u010f\3\2\2\2\u0115\u0110\3\2\2\2\u0115"+
		"\u0111\3\2\2\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"#\3\2\2\2\u0119\u012e\7-\2\2\u011a\u011b\7-\2\2\u011b\u011d\7)\2\2\u011c"+
		"\u011a\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7-\2\2\u0121\u0123\7*\2\2\u0122\u011c"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0128\3\2\2\2\u0126\u0127\7-\2\2\u0127\u0129\7)\2\2\u0128\u0126\3\2\2"+
		"\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u012e\7-\2\2\u012d\u0119\3\2\2\2\u012d\u0122\3\2\2\2\u012e"+
		"%\3\2\2\2\u012f\u0130\7\r\2\2\u0130\u0131\7%\2\2\u0131\u0132\5\"\22\2"+
		"\u0132\u0133\7&\2\2\u0133\u0134\7%\2\2\u0134\u0135\5\"\22\2\u0135\u0136"+
		"\7&\2\2\u0136\'\3\2\2\2\u0137\u0138\7\16\2\2\u0138\u0139\7,\2\2\u0139"+
		"\u013a\7/\2\2\u013a\u013b\7 \2\2\u013b\u013c\7/\2\2\u013c)\3\2\2\2\u013d"+
		"\u013e\7+\2\2\u013e\u013f\7%\2\2\u013f\u0140\5\"\22\2\u0140\u0141\7&\2"+
		"\2\u0141+\3\2\2\2\u0142\u0143\t\5\2\2\u0143-\3\2\2\2\u0144\u0145\t\6\2"+
		"\2\u0145/\3\2\2\2\u0146\u0147\t\7\2\2\u0147\61\3\2\2\2\u0148\u0149\t\b"+
		"\2\2\u0149\63\3\2\2\2\u014a\u014b\t\t\2\2\u014b\65\3\2\2\2\u014c\u014d"+
		"\t\n\2\2\u014d\67\3\2\2\2\u014e\u0155\5,\27\2\u014f\u0155\5.\30\2\u0150"+
		"\u0155\5\64\33\2\u0151\u0155\5\60\31\2\u0152\u0155\5\62\32\2\u0153\u0155"+
		"\5\66\34\2\u0154\u014e\3\2\2\2\u0154\u014f\3\2\2\2\u0154\u0150\3\2\2\2"+
		"\u0154\u0151\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u01559\3"+
		"\2\2\2\u0156\u0157\t\13\2\2\u0157;\3\2\2\2\u0158\u0159\7\21\2\2\u0159"+
		"\u015e\7%\2\2\u015a\u015f\7\60\2\2\u015b\u015f\7V\2\2\u015c\u015f\7-\2"+
		"\2\u015d\u015f\58\35\2\u015e\u015a\3\2\2\2\u015e\u015b\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\7&\2\2\u0163=\3\2\2\2\u0164"+
		"\u0169\7\60\2\2\u0165\u0169\5\"\22\2\u0166\u0169\7Y\2\2\u0167\u0169\5"+
		":\36\2\u0168\u0164\3\2\2\2\u0168\u0165\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b?\3\2\2\2&ILOZ`bimo~\u0080\u0087\u0092\u0094\u009b\u00a3\u00a6"+
		"\u00af\u00b8\u00bf\u00d8\u00da\u00e8\u00ea\u00fc\u0115\u0117\u011e\u0124"+
		"\u012a\u012d\u0154\u015e\u0160\u0168\u016a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}