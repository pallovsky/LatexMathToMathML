// Generated from /home/krzysztof/Dokumenty/Kompilatory/LatexToHtml/src/main/antlr/LatexParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LatexParser}.
 */
public interface LatexParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LatexParser#prule}.
	 * @param ctx the parse tree
	 */
	void enterPrule(LatexParser.PruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#prule}.
	 * @param ctx the parse tree
	 */
	void exitPrule(LatexParser.PruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(LatexParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(LatexParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#packages}.
	 * @param ctx the parse tree
	 */
	void enterPackages(LatexParser.PackagesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#packages}.
	 * @param ctx the parse tree
	 */
	void exitPackages(LatexParser.PackagesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(LatexParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(LatexParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(LatexParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(LatexParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(LatexParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(LatexParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(LatexParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(LatexParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#author}.
	 * @param ctx the parse tree
	 */
	void enterAuthor(LatexParser.AuthorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#author}.
	 * @param ctx the parse tree
	 */
	void exitAuthor(LatexParser.AuthorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(LatexParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(LatexParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(LatexParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(LatexParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#matrix}.
	 * @param ctx the parse tree
	 */
	void enterMatrix(LatexParser.MatrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#matrix}.
	 * @param ctx the parse tree
	 */
	void exitMatrix(LatexParser.MatrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#align}.
	 * @param ctx the parse tree
	 */
	void enterAlign(LatexParser.AlignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#align}.
	 * @param ctx the parse tree
	 */
	void exitAlign(LatexParser.AlignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#multline}.
	 * @param ctx the parse tree
	 */
	void enterMultline(LatexParser.MultlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#multline}.
	 * @param ctx the parse tree
	 */
	void exitMultline(LatexParser.MultlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#inline}.
	 * @param ctx the parse tree
	 */
	void enterInline(LatexParser.InlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#inline}.
	 * @param ctx the parse tree
	 */
	void exitInline(LatexParser.InlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#centered}.
	 * @param ctx the parse tree
	 */
	void enterCentered(LatexParser.CenteredContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#centered}.
	 * @param ctx the parse tree
	 */
	void exitCentered(LatexParser.CenteredContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#displaymath}.
	 * @param ctx the parse tree
	 */
	void enterDisplaymath(LatexParser.DisplaymathContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#displaymath}.
	 * @param ctx the parse tree
	 */
	void exitDisplaymath(LatexParser.DisplaymathContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#math_formula}.
	 * @param ctx the parse tree
	 */
	void enterMath_formula(LatexParser.Math_formulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#math_formula}.
	 * @param ctx the parse tree
	 */
	void exitMath_formula(LatexParser.Math_formulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#matrix_formula}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_formula(LatexParser.Matrix_formulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#matrix_formula}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_formula(LatexParser.Matrix_formulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#fraction}.
	 * @param ctx the parse tree
	 */
	void enterFraction(LatexParser.FractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#fraction}.
	 * @param ctx the parse tree
	 */
	void exitFraction(LatexParser.FractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#integral}.
	 * @param ctx the parse tree
	 */
	void enterIntegral(LatexParser.IntegralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#integral}.
	 * @param ctx the parse tree
	 */
	void exitIntegral(LatexParser.IntegralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#sqrt}.
	 * @param ctx the parse tree
	 */
	void enterSqrt(LatexParser.SqrtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#sqrt}.
	 * @param ctx the parse tree
	 */
	void exitSqrt(LatexParser.SqrtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#simple_symbols}.
	 * @param ctx the parse tree
	 */
	void enterSimple_symbols(LatexParser.Simple_symbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#simple_symbols}.
	 * @param ctx the parse tree
	 */
	void exitSimple_symbols(LatexParser.Simple_symbolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#relation_symbols}.
	 * @param ctx the parse tree
	 */
	void enterRelation_symbols(LatexParser.Relation_symbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#relation_symbols}.
	 * @param ctx the parse tree
	 */
	void exitRelation_symbols(LatexParser.Relation_symbolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#binary_operations}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operations(LatexParser.Binary_operationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#binary_operations}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operations(LatexParser.Binary_operationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#logic_notation}.
	 * @param ctx the parse tree
	 */
	void enterLogic_notation(LatexParser.Logic_notationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#logic_notation}.
	 * @param ctx the parse tree
	 */
	void exitLogic_notation(LatexParser.Logic_notationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#greek_letters}.
	 * @param ctx the parse tree
	 */
	void enterGreek_letters(LatexParser.Greek_lettersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#greek_letters}.
	 * @param ctx the parse tree
	 */
	void exitGreek_letters(LatexParser.Greek_lettersContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#trigonometric}.
	 * @param ctx the parse tree
	 */
	void enterTrigonometric(LatexParser.TrigonometricContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#trigonometric}.
	 * @param ctx the parse tree
	 */
	void exitTrigonometric(LatexParser.TrigonometricContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(LatexParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(LatexParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(LatexParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(LatexParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(LatexParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(LatexParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(LatexParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(LatexParser.TextContext ctx);
}