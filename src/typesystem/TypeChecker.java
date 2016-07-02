package typesystem;

import structure.Expr;
import structure.Type;
import structure.statement.CodeStatement;
import util.Pair;

import java.util.*;

/**
 * @author Moklev Vyacheslav
 */
public class TypeChecker {
    private Expr expr;
    private Map<String, Type> base;
    private List<Equation> system;
    private int tempCount;

    public TypeChecker(Expr expr, Map<String, Type> base) {
        this.expr = expr;
        this.base = base;
        system = new ArrayList<>();
        tempCount = 0;
    }

    public Map<String, Type> deduce() {
        deduce1("t", expr);
        return new UnificationSolver(system, base).solve();
    }

    @SuppressWarnings("unchecked")
    private void deduce1(String t, Expr expr) {
        switch (expr.getMode()) {
            case ASSIGN:
                system.add(Equation.makeVE(t, "@assign", t + "0", t + "1"));
                deduce1(t + "0", expr.getExprList()[0]);
                deduce1(t + "1", expr.getExprList()[1]);
                break;
            case FUNCTION_CALL:
                List<Expr> list = (List<Expr>) expr.getObject();
                int n = list.size();
                String[] params = new String[n];
                for (int i = 0; i < n; i++) {
                    params[i] = t + (i + 1);
                    deduce1(t + (i + 1), list.get(i));
                }
                deduce1(t + "0", expr.getExprList()[0]);
                system.add(Equation.makeVE(t, t + "0", (Object[]) params));
                break;
            case PLUS:
                system.add(Equation.makeVE(t, "@plus", t + "0", t + "1"));
                deduce1(t + "0", expr.getExprList()[0]);
                deduce1(t + "1", expr.getExprList()[1]);
                break;
            case ID:
                //noinspection SuspiciousMethodCalls
                Type type = base.get(expr.getObject());
                if (type != null)
                    system.add(Equation.makeVV(t, type));
                break;
            case INT_LITERAL:
                system.add(Equation.makeVV(t, Type.makeClass("int")));
                break;
            case FLOAT_LITERAL:
                system.add(Equation.makeVV(t, Type.makeClass("float")));
                break;
            case CHAR_LITERAL:
                system.add(Equation.makeVV(t, Type.makeClass("char")));
                break;
            case STRING_LITERAL:
                system.add(Equation.makeVV(t, Type.makeClass("String")));
                break;
            case BOOLEAN_LITERAL:
                system.add(Equation.makeVV(t, Type.makeClass("boolean")));
                break;
            case NULL_LITERAL:
                system.add(Equation.makeVV(t, Type.makeClass("Object")));
                break;
            case FUNCTIONAL_LITERAL:
//                Pair<List<Pair<Type, String>>, CodeStatement> pair =
//                        ((Pair<List<Pair<Type, String>>, CodeStatement>) expr.getObject());
//                List<Pair<Type, String>>
//                system.add(Equation.makeVV(t, "#int"));
                // TODO
                // 1. Find declared param typed and define type vars for undeclared
                // 2. Define bunch of type vars of carry-like slices of function
                // 3. Build equation system like "t = @arrow(t_param_1, t_without_1)" e.t.c.
                throw new UnsupportedOperationException("No func literals for now");
        }
    }

    private String nextTemp() {
        return "w" + tempCount++;
    }

}
