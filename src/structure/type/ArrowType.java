package structure.type;

/**
 * @author Moklev Vyacheslav
 */
public class ArrowType extends Type{
    private Type paramType;
    private Type resultType;

    public ArrowType(Type paramType, Type resultType) {
        this.paramType = paramType;
        this.resultType = resultType;
    }

    public Type getParamType() {
        return paramType;
    }

    public Type getResultType() {
        return resultType;
    }

    @Override
    public String toString() {
        return paramType + " -> (" + resultType + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ArrowType))
            return false;
        ArrowType other = (ArrowType) obj;
        return paramType.equals(other.paramType) && resultType.equals(other.resultType);
    }

    @Override
    public Type substitute(String id, Type type) {
        return Type.makeArrow(
                paramType.substitute(id, type),
                resultType.substitute(id, type)
        );
    }

    @Override
    public boolean isFree(String id) {
        return paramType.isFree(id) && resultType.isFree(id);
    }
}
