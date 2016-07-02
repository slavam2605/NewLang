import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import structure.Type;
import typesystem.TypeChecker;

import java.util.HashMap;

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
        new TypeChecker(new LangParser(
                new CommonTokenStream(
                        new LangLexer(
                                new ANTLRInputStream(
                                        "x = 3"
                                )
                        )
                )
        ).expr().e, new HashMap<String, Type>() {{
            put("@assign", Type.makeArrow(
                    Type.makeClass("#0"),
                    Type.makeArrow(
                            Type.makeClass("#0"),
                            Type.makeClass("#0")
                    )
            ));
        }}).deduce();
//        new TypeChecker(new LangParser(tokens).expr().e, new HashMap<String, Type>() {{
//            put("x", Type.makeClass("String"));
//            put("y", Type.makeClass("float"));
//            put("z", Type.makeClass("float"));
//            put("f", Type.makeArrow(
//                    Type.makeClass("float"),
//                    Type.makeArrow(
//                            Type.makeClass("int"),
//                            Type.makeClass("String")
//                    )
//            ));
//            put("@plus", Type.makeArrow(
//                    Type.makeClass("float"),
//                    Type.makeArrow(
//                            Type.makeClass("float"),
//                            Type.makeClass("float")
//                    )
//            ));
//            put("@assign", Type.makeArrow(
//                    Type.makeClass("String"),
//                    Type.makeArrow(
//                            Type.makeClass("String"),
//                            Type.makeClass("String")
//                    )
//            ));
//        }}).deduce();
//        System.out.println(new LangParser(tokens).codeStatement().s);
    }
}
