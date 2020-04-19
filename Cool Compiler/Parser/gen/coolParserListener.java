// Generated from D:/Havana Oh Na Na/CoolParser/src\coolParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link coolParserParser}.
 */
public interface coolParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link coolParserParser#vals}.
	 * @param ctx the parse tree
	 */
	void enterVals(coolParserParser.ValsContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParserParser#vals}.
	 * @param ctx the parse tree
	 */
	void exitVals(coolParserParser.ValsContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParserParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstance(coolParserParser.InstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParserParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstance(coolParserParser.InstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParserParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(coolParserParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParserParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(coolParserParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParserParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void enterVar_dec(coolParserParser.Var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParserParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void exitVar_dec(coolParserParser.Var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParserParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(coolParserParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParserParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(coolParserParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParserParser#math_expr}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr(coolParserParser.Math_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParserParser#math_expr}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr(coolParserParser.Math_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParserParser#cond_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCond_stmt(coolParserParser.Cond_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParserParser#cond_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCond_stmt(coolParserParser.Cond_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParserParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(coolParserParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParserParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(coolParserParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParserParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(coolParserParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParserParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(coolParserParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParserParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(coolParserParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParserParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(coolParserParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParserParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(coolParserParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParserParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(coolParserParser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParserParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(coolParserParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParserParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(coolParserParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParserParser#ourcase}.
	 * @param ctx the parse tree
	 */
	void enterOurcase(coolParserParser.OurcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParserParser#ourcase}.
	 * @param ctx the parse tree
	 */
	void exitOurcase(coolParserParser.OurcaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParserParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(coolParserParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParserParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(coolParserParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParserParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(coolParserParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParserParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(coolParserParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParserParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(coolParserParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParserParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(coolParserParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParserParser#our_class}.
	 * @param ctx the parse tree
	 */
	void enterOur_class(coolParserParser.Our_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParserParser#our_class}.
	 * @param ctx the parse tree
	 */
	void exitOur_class(coolParserParser.Our_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParserParser#our_program}.
	 * @param ctx the parse tree
	 */
	void enterOur_program(coolParserParser.Our_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParserParser#our_program}.
	 * @param ctx the parse tree
	 */
	void exitOur_program(coolParserParser.Our_programContext ctx);
}