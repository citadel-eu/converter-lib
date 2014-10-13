// Generated by ANTLR 4.1
package eu.citadel.converter.schema.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BasicSchemaParser}.
 */
public interface BasicSchemaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BasicSchemaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull BasicSchemaParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicSchemaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull BasicSchemaParser.ElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link BasicSchemaParser#FullObject}.
	 * @param ctx the parse tree
	 */
	void enterFullObject(@NotNull BasicSchemaParser.FullObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicSchemaParser#FullObject}.
	 * @param ctx the parse tree
	 */
	void exitFullObject(@NotNull BasicSchemaParser.FullObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link BasicSchemaParser#EmptyList}.
	 * @param ctx the parse tree
	 */
	void enterEmptyList(@NotNull BasicSchemaParser.EmptyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicSchemaParser#EmptyList}.
	 * @param ctx the parse tree
	 */
	void exitEmptyList(@NotNull BasicSchemaParser.EmptyListContext ctx);

	/**
	 * Enter a parse tree produced by {@link BasicSchemaParser#NullValue}.
	 * @param ctx the parse tree
	 */
	void enterNullValue(@NotNull BasicSchemaParser.NullValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicSchemaParser#NullValue}.
	 * @param ctx the parse tree
	 */
	void exitNullValue(@NotNull BasicSchemaParser.NullValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link BasicSchemaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull BasicSchemaParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicSchemaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull BasicSchemaParser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link BasicSchemaParser#FullList}.
	 * @param ctx the parse tree
	 */
	void enterFullList(@NotNull BasicSchemaParser.FullListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicSchemaParser#FullList}.
	 * @param ctx the parse tree
	 */
	void exitFullList(@NotNull BasicSchemaParser.FullListContext ctx);

	/**
	 * Enter a parse tree produced by {@link BasicSchemaParser#EmptyObject}.
	 * @param ctx the parse tree
	 */
	void enterEmptyObject(@NotNull BasicSchemaParser.EmptyObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicSchemaParser#EmptyObject}.
	 * @param ctx the parse tree
	 */
	void exitEmptyObject(@NotNull BasicSchemaParser.EmptyObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link BasicSchemaParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull BasicSchemaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicSchemaParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull BasicSchemaParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link BasicSchemaParser#ListValue}.
	 * @param ctx the parse tree
	 */
	void enterListValue(@NotNull BasicSchemaParser.ListValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicSchemaParser#ListValue}.
	 * @param ctx the parse tree
	 */
	void exitListValue(@NotNull BasicSchemaParser.ListValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link BasicSchemaParser#ObjectValue}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(@NotNull BasicSchemaParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicSchemaParser#ObjectValue}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(@NotNull BasicSchemaParser.ObjectValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link BasicSchemaParser#NumberValue}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(@NotNull BasicSchemaParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicSchemaParser#NumberValue}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(@NotNull BasicSchemaParser.NumberValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link BasicSchemaParser#TextValue}.
	 * @param ctx the parse tree
	 */
	void enterTextValue(@NotNull BasicSchemaParser.TextValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicSchemaParser#TextValue}.
	 * @param ctx the parse tree
	 */
	void exitTextValue(@NotNull BasicSchemaParser.TextValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link BasicSchemaParser#FullRules}.
	 * @param ctx the parse tree
	 */
	void enterFullRules(@NotNull BasicSchemaParser.FullRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicSchemaParser#FullRules}.
	 * @param ctx the parse tree
	 */
	void exitFullRules(@NotNull BasicSchemaParser.FullRulesContext ctx);

	/**
	 * Enter a parse tree produced by {@link BasicSchemaParser#BooleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(@NotNull BasicSchemaParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicSchemaParser#BooleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(@NotNull BasicSchemaParser.BooleanValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link BasicSchemaParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(@NotNull BasicSchemaParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicSchemaParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(@NotNull BasicSchemaParser.OptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link BasicSchemaParser#EmptyRules}.
	 * @param ctx the parse tree
	 */
	void enterEmptyRules(@NotNull BasicSchemaParser.EmptyRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicSchemaParser#EmptyRules}.
	 * @param ctx the parse tree
	 */
	void exitEmptyRules(@NotNull BasicSchemaParser.EmptyRulesContext ctx);
}