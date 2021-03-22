// Generated from Calculette.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculetteParser}.
 */
public interface CalculetteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CalculetteParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CalculetteParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#calcul}.
	 * @param ctx the parse tree
	 */
	void enterCalcul(CalculetteParser.CalculContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#calcul}.
	 * @param ctx the parse tree
	 */
	void exitCalcul(CalculetteParser.CalculContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CalculetteParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CalculetteParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(CalculetteParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(CalculetteParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(CalculetteParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(CalculetteParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalculetteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalculetteParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(CalculetteParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(CalculetteParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CalculetteParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CalculetteParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CalculetteParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CalculetteParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#tantque}.
	 * @param ctx the parse tree
	 */
	void enterTantque(CalculetteParser.TantqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#tantque}.
	 * @param ctx the parse tree
	 */
	void exitTantque(CalculetteParser.TantqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFinInstruction(CalculetteParser.FinInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFinInstruction(CalculetteParser.FinInstructionContext ctx);
}