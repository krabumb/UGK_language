// Generated from java-escape by ANTLR 4.11.1

package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UgkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UgkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UgkParser#ugk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUgk(UgkParser.UgkContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(UgkParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#singleimport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleimport(UgkParser.SingleimportContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(UgkParser.ProgrammeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#fonctionoudeclatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFonctionoudeclatype(UgkParser.FonctionoudeclatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#algorithme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithme(UgkParser.AlgorithmeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#fonction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFonction(UgkParser.FonctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#declatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclatype(UgkParser.DeclatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#declatypeargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclatypeargs(UgkParser.DeclatypeargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#superset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperset(UgkParser.SupersetContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#funcdecargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdecargs(UgkParser.FuncdecargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#algofoncblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgofoncblock(UgkParser.AlgofoncblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(UgkParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(UgkParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#selon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelon(UgkParser.SelonContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#switchblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchblock(UgkParser.SwitchblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#cas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCas(UgkParser.CasContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(UgkParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#defaut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaut(UgkParser.DefautContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#retourne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetourne(UgkParser.RetourneContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#assignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignation(UgkParser.AssignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(UgkParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#siblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSiblock(UgkParser.SiblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#tantque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTantque(UgkParser.TantqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#pour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPour(UgkParser.PourContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#appelfonc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppelfonc(UgkParser.AppelfoncContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#foncargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFoncargs(UgkParser.FoncargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(UgkParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(UgkParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(UgkParser.PrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(UgkParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#addsousexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsousexpr(UgkParser.AddsousexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#multordivexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultordivexpr(UgkParser.MultordivexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr(UgkParser.BoolexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#exprres}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprres(UgkParser.ExprresContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#multipleexprcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleexprcomp(UgkParser.MultipleexprcompContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#pmo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPmo(UgkParser.PmoContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#mde}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMde(UgkParser.MdeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#boolop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolop(UgkParser.BoolopContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#booleen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleen(UgkParser.BooleenContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#idfOrTab}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdfOrTab(UgkParser.IdfOrTabContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#idf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdf(UgkParser.IdfContext ctx);
	/**
	 * Visit a parse tree produced by {@link UgkParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(UgkParser.FilenameContext ctx);
}