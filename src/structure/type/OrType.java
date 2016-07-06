package structure.type;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Moklev Vyacheslav
 */
public class OrType extends Type {
    private List<Type> branch;

    public OrType(List<Type> branch) {
        this.branch = branch;
    }

    public int count() {
        return branch.size();
    }

    public Type get(int index) {
        return branch.get(index);
    }

    @Override
    public String toString() {
        return branch.stream()
                .map(Type::toString)
                .collect(Collectors.joining(" | "));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof OrType))
            return false;
        OrType other = (OrType) obj;
        for (Type type: branch) {
            boolean flag = false;
            for (Type otherType: other.branch) {
                if (type.equals(otherType)) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return false;
        }
        return true;
    }

    @Override
    public Type substitute(String id, Type type) {
        List<Type> newBranch = new ArrayList<>();
        branch.forEach(t -> newBranch.add(t.substitute(id, type)));
        return Type.makeOr(newBranch);
    }

    @Override
    public boolean isFree(String id) {
        for (Type type: branch) {
            if (!type.isFree(id))
                return false;
        }
        return true;
    }
}
