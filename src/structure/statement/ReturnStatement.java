package structure.statement;

import structure.Expr;

/**
 * @author Moklev Vyacheslav
 */
public class ReturnStatement extends CodeStatement {
    private Expr expr;

    public ReturnStatement(Expr expr) {
        this.expr = expr;
    }

    public Expr getExpr() {
        return expr;
    }
}
