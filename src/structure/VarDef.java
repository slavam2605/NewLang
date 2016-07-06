package structure;

import structure.type.Type;

/**
 * @author Moklev Vyacheslav
 */
public class VarDef {
    private Type type;
    private String varName;
    private Expr initExpr;

    public VarDef(Type type, String varName, Expr initExpr) {
        this.type = type;
        this.varName = varName;
        this.initExpr = initExpr;
    }

    public Type getType() {
        return type;
    }

    public String getVarName() {
        return varName;
    }

    public Expr getInitExpr() {
        return initExpr;
    }

    @Override
    public String toString() {
        return (type == null ? "auto " : type + " ") + varName + (initExpr == null ? "" : " = " + initExpr);
    }
}
