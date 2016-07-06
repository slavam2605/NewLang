import structure.Expr;
import structure.type.Type;
import structure.statement.CodeStatement;
import util.Pair;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Moklev Vyacheslav
 */
public class ExprCompiler {
    private JavaCompiler compiler;

    public ExprCompiler(JavaCompiler compiler) {
        this.compiler = compiler;
    }

    private void sbCompile(Expr expr, StringBuilder sb) {
        switch (expr.getMode()) {
            case BRACKETS:
                sb.append('(').append(expr.getExprList()[0]).append(')');
                break;
            case INT_LITERAL:
                sb.append(expr.getObject());
                break;
            case FLOAT_LITERAL:
                sb.append(expr.getObject());
                break;
            case CHAR_LITERAL:
                sb.append(expr.getObject());
                break;
            case STRING_LITERAL:
                sb.append(expr.getObject());
                break;
            case BOOLEAN_LITERAL:
                sb.append(expr.getObject());
                break;
            case NULL_LITERAL:
                sb.append("null");
                break;
            case FUNCTIONAL_LITERAL:
                @SuppressWarnings("unchecked")
                Pair<List<Pair<Type, String>>, CodeStatement> pair1 =
                        ((Pair<List<Pair<Type, String>>, CodeStatement>) expr.getObject());
                List<Pair<Type, String>> list = pair1.a;
                CodeStatement s = pair1.b;
                String className = getClassName(list);
                sb.append("new ").append(className).append("((")
                        .append(list.stream().map(p -> p.b).collect(Collectors.joining(","))).append(") -> {")
                        .append(compiler.compileCodeStatement(s, new StringBuilder())).append("}").append(")");
                break;
            case ID:
                sb.append(expr.getObject());
                break;
            case ARRAY_ELEMENT:
                break;
            case FUNCTION_CALL:
                break;
            case TYPE_CAST:
                break;
            case POST_INCREMENT:
                break;
            case POST_DECREMENT:
                break;
            case PRE_INCREMENT:
                break;
            case PRE_DECREMENT:
                break;
            case UNARY_PLUS:
                break;
            case UNARY_MINUS:
                break;
            case BITWISE_NOT:
                break;
            case LOGICAL_NOT:
                break;
            case TIMES:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" * ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case DIV:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" / ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case MOD:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" % ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case PLUS:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" + ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case MINUS:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" - ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case LSHIFT:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" << ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case RSHIFT:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" >> ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case LESS_EQ:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" <= ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case GREATER_EQ:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" >= ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case LESS:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" < ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case GREATER:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" > ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case EQUALS:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" == ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case NOT_EQUALS:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" != ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case BITWISE_AND:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" & ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case BITWISE_OR:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" | ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case BITWISE_XOR:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" ^ ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case LOGICAL_OR:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" || ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case LOGICAL_AND:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" && ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case TERNARY:
                break;
            case ASSIGN:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" = ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case PLUS_ASSIGN:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" += ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case MINUS_ASSIGN:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" -= ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case TIMES_ASSIGN:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" *= ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case DIV_ASSIGN:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" /= ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case MOD_ASSIGN:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" %= ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case AND_ASSIGN:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" &= ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case OR_ASSIGN:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" |= ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case XOR_ASSIGN:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" ^= ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case RSHIFT_ASSIGN:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" >>= ")
                        .append(compile(expr.getExprList()[1]));
                break;
            case LSHIFT_ASSIGN:
                sb
                        .append(compile(expr.getExprList()[0]))
                        .append(" <<= ")
                        .append(compile(expr.getExprList()[1]));
                break;
        }
    }

    private String getClassName(List<Pair<Type, String>> list) {
        return list.stream().map(p -> p.b).collect(Collectors.joining("_"));
    }

    public String compile(Expr expr) {
        StringBuilder sb = new StringBuilder();
        sbCompile(expr, sb);
        return sb.toString();
    }
}
