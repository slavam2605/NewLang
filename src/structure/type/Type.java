package structure.type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Moklev Vyacheslav
 */
public abstract class Type {
    public static Type makeSimple(String typeName) {
        return new SimpleType(typeName);
    }

    public static Type makeArrow(Type param, Type result) {
        return new ArrowType(param, result);
    }

    public static Type makeForall(String bind, Type inner) {
        return new ForallType(bind, inner);
    }

    public static Type makeOr(List<Type> list) {
        return new OrType(list);
    }

    public static Type makeOr(Type... list) {
        return new OrType(new ArrayList<>(Arrays.asList(list)));
    }

    public abstract Type substitute(String id, Type type);

    public abstract boolean isFree(String id);
}
