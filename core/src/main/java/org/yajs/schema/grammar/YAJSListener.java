// Generated from /Users/timur/yajs/core/src/main/java/org/yajs/grammar/YAJS.g4 by ANTLR 4.5.3
package org.yajs.schema.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YAJSParser}.
 */
public interface YAJSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YAJSParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSchema(YAJSParser.SchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAJSParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSchema(YAJSParser.SchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAJSParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(YAJSParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAJSParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(YAJSParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAJSParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(YAJSParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAJSParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(YAJSParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAJSParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(YAJSParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAJSParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(YAJSParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAJSParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(YAJSParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAJSParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(YAJSParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAJSParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(YAJSParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAJSParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(YAJSParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAJSParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(YAJSParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAJSParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(YAJSParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAJSParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(YAJSParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAJSParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(YAJSParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAJSParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(YAJSParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAJSParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(YAJSParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAJSParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(YAJSParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAJSParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(YAJSParser.StringContext ctx);
}