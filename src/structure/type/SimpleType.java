package structure.type;

/**
 * @author Moklev Vyacheslav
 */
public class SimpleType extends Type {
    private String typeName;

    public SimpleType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    @Override
    public String toString() {
        return typeName;
    }

    @Override
    public boolean equals(Object obj) {
        //noinspection SimplifiableIfStatement
        if (obj == null || !(obj instanceof SimpleType))
            return false;
        return typeName.equals(((SimpleType) obj).getTypeName());
    }

    @Override
    public Type substitute(String id, Type type) {
        if (typeName.equals(id))
            return type;
        return this;
    }

    @Override
    public boolean isFree(String id) {
        return !typeName.equals(id);
    }
}
