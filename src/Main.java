import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    public static void main(String[] args) {
        TestLexer lexer = new TestLexer(CharStreams.fromString("Hello John!"));
        TestParser parser = new TestParser(new CommonTokenStream(lexer));

        String name = parser.main().name().getText();
        System.out.println(name);
    }
}
