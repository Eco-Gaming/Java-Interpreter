package main.parser.grammar;// Generated from C:/Users/Erik/IdeaProjects/Java-Interpreter/grammar\JavaGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethode(JavaGrammarParser.MethodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#anwfolg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnwfolg(JavaGrammarParser.AnwfolgContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#anweisung}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnweisung(JavaGrammarParser.AnweisungContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#zuweisung}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZuweisung(JavaGrammarParser.ZuweisungContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#bedanw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBedanw(JavaGrammarParser.BedanwContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#solangeanw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolangeanw(JavaGrammarParser.SolangeanwContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#vergleich}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVergleich(JavaGrammarParser.VergleichContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#ausdruck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAusdruck(JavaGrammarParser.AusdruckContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(JavaGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#faktor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaktor(JavaGrammarParser.FaktorContext ctx);
}