import gen.LatexLexer;
import gen.LatexParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MainApp {
    public static void main(String[] args) {
        String file = "LatexToHtml/examples/fullexample.tex";

        Listener listener = new Listener();

        CharStream stream = null;

        try {
            stream = CharStreams.fromFileName(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        LatexLexer lexer = new LatexLexer(stream);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        LatexParser parser2 = new LatexParser(tokenStream);
        LatexParser.PruleContext startRuleContext = parser2.prule();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, startRuleContext);
        System.out.println(listener.getHtml());

        try (PrintWriter out = new PrintWriter("output.html")) {
            out.println(listener.getHtml());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
