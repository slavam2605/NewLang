import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;

/**
 * @author Moklev Vyacheslav
 */
public class Main {
    public static void main(String[] args) {
        ANTLRInputStream is = new ANTLRInputStream(
                "int -> int f = (int a, b) -> f(2)"
        );
        Lexer lexer = new LangLexer(is);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        System.out.println(new LangParser(tokens).varDef().type().t);
    }
}
