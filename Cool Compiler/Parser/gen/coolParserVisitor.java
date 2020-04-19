// Generated from D:/Havana Oh Na Na/CoolParser/src\coolParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link coolParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface coolParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link coolParserParser#vals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVals(coolParserParser.ValsContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParserParser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance(coolParserParser.InstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParserParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(coolParserParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParserParser#var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_dec(coolParserParser.Var_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParserParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(coolParserParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParserParser#math_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr(coolParserParser.Math_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParserParser#cond_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_stmt(coolParserParser.Cond_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParserParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(coolParserParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParserParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(coolParserParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParserParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(coolParserParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParserParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(coolParserParser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParserParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(coolParserParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParserParser#ourcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOurcase(coolParserParser.OurcaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParserParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(coolParserParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParserParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(coolParserParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParserParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(coolParserParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParserParser#our_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOur_class(coolParserParser.Our_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParserParser#our_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOur_program(coolParserParser.Our_programContext ctx);
}