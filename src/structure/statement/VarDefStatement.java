package structure.statement;

import structure.VarDef;
import structure.statement.CodeStatement;

import java.util.List;

/**
 * @author Moklev Vyacheslav
 */
public class VarDefStatement extends CodeStatement {
    private List<VarDef> vdList;

    public VarDefStatement(List<VarDef> vdList) {
        this.vdList = vdList;
    }

    public List<VarDef> getVdList() {
        return vdList;
    }
}
