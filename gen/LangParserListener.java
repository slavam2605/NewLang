// Generated from C:/Users/slava/IdeaProjects/NewLang/src\LangParser.g4 by ANTLR 4.5.3

import structure.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(LangParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(LangParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(LangParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(LangParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(LangParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(LangParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LangParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(LangParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(LangParser.ExprListContext ctx);
}