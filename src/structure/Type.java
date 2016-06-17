package structure;

import util.Pair;

import java.util.ArrayList;
import java.util.List;

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
}
