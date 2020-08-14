package gen;// Generated from /home/krzysztof/Dokumenty/Kompilatory/LatexToHtml/src/main/antlr/LatexParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LatexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LatexParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LatexParser#prule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrule(LatexParser.PruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(LatexParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#packages}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackages(LatexParser.PackagesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(LatexParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(LatexParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(LatexParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(LatexParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#author}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthor(LatexParser.AuthorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(LatexParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(LatexParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#matrix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix(LatexParser.MatrixContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#align}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlign(LatexParser.AlignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#multline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultline(LatexParser.MultlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#inline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInline(LatexParser.InlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#centered}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCentered(LatexParser.CenteredContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#displaymath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplaymath(LatexParser.DisplaymathContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#math_formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_formula(LatexParser.Math_formulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#matrix_formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix_formula(LatexParser.Matrix_formulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#fraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFraction(LatexParser.FractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#integral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegral(LatexParser.IntegralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#sqrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrt(LatexParser.SqrtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#simple_symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_symbols(LatexParser.Simple_symbolsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#relation_symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_symbols(LatexParser.Relation_symbolsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#binary_operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operations(LatexParser.Binary_operationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#logic_notation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_notation(LatexParser.Logic_notationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#greek_letters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreek_letters(LatexParser.Greek_lettersContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#trigonometric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigonometric(LatexParser.TrigonometricContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(LatexParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(LatexParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(LatexParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(LatexParser.TextContext ctx);
}