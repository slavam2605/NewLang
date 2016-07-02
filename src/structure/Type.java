package structure;

import util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Moklev Vyacheslav
 */
public class Type {
    private Kind kind;
    private String primitiveName;
    private Type baseType;
    private Type resultType;
    private List<Pair<Boolean, Type>> typeParameters;

    private Type(Kind kind, String primitiveName, Type baseType, Type resultType, List<Pair<Boolean, Type>> typeParameters) {
        this.kind = kind;
        this.primitiveName = primitiveName;
        this.baseType = baseType;
        this.resultType = resultType;
        this.typeParameters = typeParameters;
    }

    public static Type makeClass(String typeName) {
        return new Type(Kind.CLASS, typeName, null, null, null);
    }

    public static Type makeArray(Type baseType) {
        return new Type(Kind.ARRAY, null, baseType, null, null);
    }

    public static Type makeGeneric(Type baseType, Object... list) {
        if (list.length % 2 == 1)
            throw new IllegalArgumentException("Odd list.length!");
        List<Pair<Boolean, Type>> genericList = new ArrayList<>();
        for (int i = 0; i < list.length / 2; i++) {
            if (!(list[2 * i] instanceof Boolean)) {
                throw new IllegalArgumentException("list[" + 2 * i + "] is not boolean!");
            }
            if (!(list[2 * i + 1] instanceof Type)) {
                throw new IllegalArgumentException("list[" + (2 * i + 1) + "] is not Type!");
            }
            genericList.add(new Pair<>((Boolean) list[2 * i], (Type) list[2 * i + 1]));
        }
        return new Type(Kind.GENERIC_OR_TEMPLATE, null, baseType, null, genericList);
    }

    public static Type makeArrow(Type baseType, Type resultType) {
        return new Type(Kind.ARROW, null, baseType, resultType, null);
    }

    public Kind getKind() {
        return kind;
    }

    public String getPrimitiveName() {
        return primitiveName;
    }

    public Type getBaseType() {
        return baseType;
    }

    public Type getResultType() {
        return resultType;
    }

    public List<Pair<Boolean, Type>> getTypeParameters() {
        return typeParameters;
    }

    @Override
    public String toString() {
        switch (kind) {
            case CLASS: return primitiveName;
            case ARRAY: return baseType + "[]";
            case GENERIC_OR_TEMPLATE: return baseType + "<" +
                    typeParameters.stream().map(bt -> (bt.a ? "template " : "") + bt.b).collect(Collectors.joining(", "))
                    + ">";
            case ARROW: return baseType + " -> " + resultType;
            default: throw new IllegalStateException("Unknown kind: " + kind);
        }
    }

    @Override
    public boolean equals(Object o) {
        return !(o == null || !(o instanceof Type)) && toString().equals(o.toString());
    }
}
