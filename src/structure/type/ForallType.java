package structure.type;

/**
 * @author Moklev Vyacheslav
 */
public class ForallType extends Type {
    private String bindVar;
    private Type innerType;

    public ForallType(String bindVar, Type innerType) {
        this.bindVar = bindVar;
        this.innerType = innerType;
    }

    public String getBindVar() {
        return bindVar;
    }

    public Type getInnerType() {
        return innerType;
    }

    @Override
    public String toString() {
        return "\\" + bindVar + ". " + innerType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ForallType))
            return false;
        ForallType other = (ForallType) obj;
        Type otherInner = other.getInnerType();
        for (int i = 0; ; i++) {
            if (innerType.isFree("#" + i) && otherInner.isFree("#" + i)) {
                Type assignment = Type.makeSimple("#" + i);
                return innerType.substitute(bindVar, assignment).equals(
                        otherInner.substitute(other.bindVar, assignment)
                );
            }
        }
    }

    @Override
    public Type substitute(String id, Type type) {
        if (bindVar.equals(id))
            return this;
        return Type.makeForall(bindVar, innerType.substitute(id, type));
    }

    @Override
    public boolean isFree(String id) {
        return bindVar.equals(id) || innerType.isFree(id);
    }
}
