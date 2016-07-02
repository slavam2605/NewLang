package typesystem;

import com.sun.istack.internal.Nullable;
import com.sun.javaws.exceptions.InvalidArgumentException;
import structure.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Moklev Vyacheslav
 */
public class Equation {
    String leftF;
    String rightF;
    List<Element> left;
    List<Element> right;

    public static Equation makeVV(Object a, Object b) {
        Element ea;
        Element eb;
        if (a instanceof String) {
            ea = new Element((String) a);
        } else if (a instanceof Type) {
            ea = new Element((Type) a);
        } else {
            throw new IllegalArgumentException("Unexpected class: " + a.getClass());
        }
        if (b instanceof String) {
            eb = new Element((String) b);
        } else if (b instanceof Type) {
            eb = new Element((Type) b);
        } else {
            throw new IllegalArgumentException("Unexpected class: " + b.getClass());
        }
        return new Equation(null, makeList(ea),
                            null, makeList(eb));
    }

//    public static Equation makeEV(String b, String f, String... la) {
//        return new Equation(f, Arrays.asList(la),
//                            null, Collections.singletonList(b));
//    }

    public static Equation makeVE(String a, String g, Object... lb) {
        List<Element> lbe = new ArrayList<>();
        for (Object element : lb) {
            if (element instanceof String) {
                lbe.add(new Element(((String) element)));
            } else if (element instanceof Type) {
                lbe.add(new Element(((Type) element)));
            } else {
                throw new IllegalArgumentException("Unexpected class: " + element.getClass());
            }
        }
        return new Equation(null, makeList(new Element(a)),
                            g, lbe);
    }

    @SafeVarargs
    private static <T> List<T> makeList(T... ts) {
        return new ArrayList<>(Arrays.asList(ts));
    }

//    public static Equation makeEE(String f, List<Element> la, String g, List<Element> lb) {
//        return new Equation(f, la, g, lb);
//    }

    public boolean isTaut() {
        if (leftF != null || rightF != null)
            return false;
        if (left.get(0).var != null && right.get(0).var != null) {
            return left.get(0).var.equals(right.get(0).var);
        }
        if (left.get(0).type != null && right.get(0).type != null) {
            return left.get(0).type.equals(right.get(0).type);
        }
        return false;
    }

    public void swapIfNeeded() {
        if (rightF == null && right.get(0).var != null) {
            String temp1 = rightF;
            List<Element> temp2 = right;
            rightF = leftF;
            right = left;
            leftF = temp1;
            left = temp2;
        }
    }

    public boolean isAssignment() {
        return leftF == null && left.get(0).var != null && rightF == null;
    }

    public void substitute(String id, Element value) {
        for (int i = 0; i < left.size(); i++) {
            if (id.equals(left.get(i).var)) {
                left.set(i, new Element(value));
            }
        }
        for (int i = 0; i < right.size(); i++) {
            if (id.equals(right.get(i).var)) {
                right.set(i, new Element(value));
            }
        }
    }

    private Equation(@Nullable String leftF, List<Element> left, @Nullable String rightF, List<Element> right) {
        this.leftF = leftF;
        this.rightF = rightF;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (leftF == null) {
            sb.append(left.get(0));
        } else {
            sb.append(leftF).append(left);
        }
        sb.append(" = ");
        if (rightF == null) {
            sb.append(right.get(0));
        } else {
            sb.append(rightF).append(right);
        }
        return sb.toString();
    }

    static class Element {
        String var;
        Type type;

        public Element(String var) {
            this.var = var;
            type = null;
        }

        public Element(Type type) {
            this.type = type;
            var = null;
        }

        public Element(Element element) {
            this.var = element.var;
            this.type = element.type;
        }

        @Override
        public String toString() {
            return var == null ? type.toString() : var;
        }
    }
}
