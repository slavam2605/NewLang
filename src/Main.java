import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import structure.type.Type;

/**
 * @author Moklev Vyacheslav
 */
public class Main {
    public static void main(String[] args) {
        ANTLRInputStream is = new ANTLRInputStream(
                "{" +
                    "auto f = (a, b, c) -> return a + b + c;" + // f :: a -> b -> c -> @plus[@plus[a, b], c]
                    "auto g = f(2, 3);" + // g :: c -> @plus[int, c]
                    "auto x = g(5);" + // x :: int
                "}"
        );
        Lexer lexer = new LangLexer(is);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
    }
}
