package typesystem;

import structure.Kind;
import structure.Type;
import util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Moklev Vyacheslav
 */
public class UnificationSolver {
    private List<Equation> system;
    private Map<String, Type> base;
    private Map<String, Type> type;
    private int lastTemp;

    public UnificationSolver(List<Equation> system, Map<String, Type> base) {
        this.system = system;
        this.base = new HashMap<>(base);
        type = new HashMap<>();
        lastTemp = 0;
    }

    // t = f(t0, t1)
    // t1 = int
    // f = a -> a -> a
    // ---------------
    // t = f(t0, int)
    // f = a -> a -> a
    // ---------------
    // t = (a -> a -> a) t0 int
    // ---------------
    // t = (a -> a) int
    // a = t0
    // ---------------
    // t = a
    // a = t0
    // a = int

    public Map<String, Type> solve() {
        Map<String, Type> templateBase = base.entrySet().stream()
                .filter(e -> isTemplate(e.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        templateBase.forEach(base::remove);
        templateBase.forEach((s, t) -> addTemplate(s, t, system));
        system.forEach(System.out::println);
        system.forEach(equation -> base.forEach((id, value) -> equation.substitute(id, new Equation.Element(value))));
        boolean changed = true;
        while (changed) {
            changed = false;
            int size = system.size();
            int hsize = type.size();
            // 1. Delete
            system = system.stream()
                        .filter(equation -> !equation.isTaut())
                        .collect(Collectors.toList());
            // 2. Swap
            system.forEach(Equation::swapIfNeeded);
            // 3. Substitute
            system.stream().filter(Equation::isAssignment).forEach(equation -> {
                String id = equation.left.get(0).var;
                Equation.Element value = equation.right.get(0);
                system.stream().forEach(equation1 -> equation1.substitute(id, value));
                if (value.type != null)
                    type.put(id, value.type);
            });
            // 4. Functions
            for (Equation equation: system) {
                Type inferredLeft = funcType(equation.leftF, equation.left);
                Type inferredRight = funcType(equation.rightF, equation.right);
                if (inferredLeft != null) {
                    equation.left = new ArrayList<>();
                    equation.left.add(new Equation.Element(inferredLeft));
                    equation.leftF = null;
                    changed = true;
                }
                if (inferredRight != null) {
                    equation.right = new ArrayList<>();
                    equation.right.add(new Equation.Element(inferredRight));
                    equation.rightF = null;
                    changed = true;
                }
            }
            // 5. Delete again
            system = system.stream()
                    .filter(equation -> !equation.isTaut())
                    .collect(Collectors.toList());
            changed |= system.size() != size || type.size() != hsize;
        }
        System.out.println("========");
        system.forEach(System.out::println);
        System.out.println("========");
        type.forEach((k, v) -> System.out.println(k + " = " + v));
        return null;
    }

    private void addTemplate(String id, Type t, List<Equation> system) {
        Pair<Type, Integer> result = renameType(t);
        lastTemp += result.b + 1;
        system.add(Equation.makeVV(id, result.a));
    }

    private Pair<Type, Integer> renameType(Type t) {
        switch (t.getKind()) {
            case CLASS:
                if (t.getPrimitiveName().startsWith("#")) {
                    int id = Integer.parseInt(t.getPrimitiveName().substring(1));
                    return new Pair<>(Type.makeClass("s" + (lastTemp + id)), id);
                } else {
                    return new Pair<>(Type.makeClass(t.getPrimitiveName()), -1);
                }
            case ARROW:
                Pair<Type, Integer> left = renameType(t.getBaseType());
                Pair<Type, Integer> right = renameType(t.getResultType());
                return new Pair<>(Type.makeArrow(left.a, right.a), Math.max(left.b, right.b));
            default:
                throw new UnsupportedOperationException("Unsupported kind: " + t.getKind());
        }
    }

    private boolean isTemplate(Type value) {
        switch (value.getKind()) {
            case CLASS:
                return value.getPrimitiveName().startsWith("#");
            case ARROW:
                return isTemplate(value.getBaseType()) || isTemplate(value.getResultType());
            default:
                throw new UnsupportedOperationException("Unsupported kind: " + value.getKind());
        }
    }

    private Type globalGet(String key) {
        Type result = type.get(key);
        if (result == null)
            result = base.get(key);
        return result;
    }

    private Type apply(Type f, Type x) {
        if (f.getKind() != Kind.ARROW)
            throw new TypeDeductionException("Function has less arguments than presented: type[f] = " + f + ", type[x] = " + x);
        if (!f.getBaseType().equals(x))
            throw new TypeDeductionException("Illegal argument type: type[f] = " + f + ", " + "type[x] = " + x);
        return f.getResultType();
    }

    private Type funcType(String func, List<Equation.Element> params) {
        if (func == null)
            return null;
        Type result = globalGet(func);
        if (result == null)
            return null;
        for (Equation.Element param: params) {
            Type paramType = param.type != null ? param.type : globalGet(param.var);
            if (paramType == null)
                return null;
            result = apply(result, paramType);
        }
        return result;
    }
}


