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
        // Unification rules
        // A. type1 = type2
        //    1. if (type1.equals(type2)) ⇒ {}
        //    2. if (type1 == a → b, type2 == c → d) ⇒ {a = c, b = d}
        //    3. if (type1 == a @ b, type2 == c @ d)
        //       3.1. if (a.equals(b)) ⇒ {b = d}
        //       3.2. else ⇒ ⊥
    }
}
