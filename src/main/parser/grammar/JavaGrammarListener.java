package main.parser.grammar;// Generated from C:/code/Java-Interpreter/grammar\JavaGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaGrammarParser}.
 */
public interface JavaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methode}.
	 * @param ctx the parse tree
	 */
	void enterMethode(JavaGrammarParser.MethodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methode}.
	 * @param ctx the parse tree
	 */
	void exitMethode(JavaGrammarParser.MethodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#anwfolg}.
	 * @param ctx the parse tree
	 */
	void enterAnwfolg(JavaGrammarParser.AnwfolgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#anwfolg}.
	 * @param ctx the parse tree
	 */
	void exitAnwfolg(JavaGrammarParser.AnwfolgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#anweisung}.
	 * @param ctx the parse tree
	 */
	void enterAnweisung(JavaGrammarParser.AnweisungContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#anweisung}.
	 * @param ctx the parse tree
	 */
	void exitAnweisung(JavaGrammarParser.AnweisungContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#zuweisung}.
	 * @param ctx the parse tree
	 */
	void enterZuweisung(JavaGrammarParser.ZuweisungContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#zuweisung}.
	 * @param ctx the parse tree
	 */
	void exitZuweisung(JavaGrammarParser.ZuweisungContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#bedanw}.
	 * @param ctx the parse tree
	 */
	void enterBedanw(JavaGrammarParser.BedanwContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#bedanw}.
	 * @param ctx the parse tree
	 */
	void exitBedanw(JavaGrammarParser.BedanwContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#solangeanw}.
	 * @param ctx the parse tree
	 */
	void enterSolangeanw(JavaGrammarParser.SolangeanwContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#solangeanw}.
	 * @param ctx the parse tree
	 */
	void exitSolangeanw(JavaGrammarParser.SolangeanwContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#vergleich}.
	 * @param ctx the parse tree
	 */
	void enterVergleich(JavaGrammarParser.VergleichContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#vergleich}.
	 * @param ctx the parse tree
	 */
	void exitVergleich(JavaGrammarParser.VergleichContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#ausdruck}.
	 * @param ctx the parse tree
	 */
	void enterAusdruck(JavaGrammarParser.AusdruckContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#ausdruck}.
	 * @param ctx the parse tree
	 */
	void exitAusdruck(JavaGrammarParser.AusdruckContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(JavaGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(JavaGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#faktor}.
	 * @param ctx the parse tree
	 */
	void enterFaktor(JavaGrammarParser.FaktorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#faktor}.
	 * @param ctx the parse tree
	 */
	void exitFaktor(JavaGrammarParser.FaktorContext ctx);
}