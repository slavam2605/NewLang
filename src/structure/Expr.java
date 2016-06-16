package structure;

import java.util.Arrays;

/**
 * @author Moklev Vyacheslav
 */
public class Expr {
    private ExprMode mode;
    private Expr[] exprList;
    private Object object;

    public Expr(ExprMode mode, Object object, Expr... exprList) {
        this.mode = mode;
        this.exprList = exprList;
        this.object = object;
    }

    @Override
    public String toString() {
        return "Expr{" +
                "mode=" + mode +
                ", exprList=" + Arrays.toString(exprList) +
                ", object=" + object +
                '}';
    }
}
