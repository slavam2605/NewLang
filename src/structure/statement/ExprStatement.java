package structure.statement;

import structure.Expr;
import structure.statement.CodeStatement;

/**
 * @author Moklev Vyacheslav
 */
public class ExprStatement extends CodeStatement {
    private Expr expr;

    public ExprStatement(Expr expr) {
        this.expr = expr;
    }

    public Expr getExpr() {
        return expr;
    }
}
