package structure.statement;

import structure.Expr;

/**
 * @author Moklev Vyacheslav
 */
public class WhileStatement extends CodeStatement {
    private Expr cond;
    private CodeStatement statement;

    public WhileStatement(Expr cond, CodeStatement statement) {
        this.cond = cond;
        this.statement = statement;
    }

    public Expr getCond() {
        return cond;
    }

    public CodeStatement getStatement() {
        return statement;
    }
}
