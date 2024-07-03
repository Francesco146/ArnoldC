// Generated from ArnoldC.g4 by ANTLR 4.13.1
package it.univr.arnoldc.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArnoldCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArnoldCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(ArnoldCParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidfunction}
	 * labeled alternative in {@link ArnoldCParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidfunction(ArnoldCParser.VoidfunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonvoidfunction}
	 * labeled alternative in {@link ArnoldCParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonvoidfunction(ArnoldCParser.NonvoidfunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareint}
	 * labeled alternative in {@link ArnoldCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareint(ArnoldCParser.DeclareintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignvariable}
	 * labeled alternative in {@link ArnoldCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignvariable(ArnoldCParser.AssignvariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printstmt}
	 * labeled alternative in {@link ArnoldCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstmt(ArnoldCParser.PrintstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionstmt}
	 * labeled alternative in {@link ArnoldCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionstmt(ArnoldCParser.ConditionstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whilestmt}
	 * labeled alternative in {@link ArnoldCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(ArnoldCParser.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readint}
	 * labeled alternative in {@link ArnoldCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadint(ArnoldCParser.ReadintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functioncall}
	 * labeled alternative in {@link ArnoldCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(ArnoldCParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printvariable}
	 * labeled alternative in {@link ArnoldCParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintvariable(ArnoldCParser.PrintvariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printstring}
	 * labeled alternative in {@link ArnoldCParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstring(ArnoldCParser.PrintstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifelseendif}
	 * labeled alternative in {@link ArnoldCParser#condition_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelseendif(ArnoldCParser.IfelseendifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifendif}
	 * labeled alternative in {@link ArnoldCParser#condition_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfendif(ArnoldCParser.IfendifContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#trueIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueIf(ArnoldCParser.TrueIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#falseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseIf(ArnoldCParser.FalseIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarexpr(ArnoldCParser.VarexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberexpr(ArnoldCParser.NumberexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueexpr(ArnoldCParser.TrueexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseexpr(ArnoldCParser.FalseexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivOp}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivOp(ArnoldCParser.MulDivOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinusOp}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusOp(ArnoldCParser.PlusMinusOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterOp}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterOp(ArnoldCParser.GreaterOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalOp}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualOp(ArnoldCParser.EqualOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orAndOp}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrAndOp(ArnoldCParser.OrAndOpContext ctx);
}