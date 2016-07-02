package structure.statement;

import structure.statement.CodeStatement;

import java.util.List;

/**
 * @author Moklev Vyacheslav
 */
public class CodeBlockStatement extends CodeStatement {
    private List<CodeStatement> sList;

    public CodeBlockStatement(List<CodeStatement> sList) {
        this.sList = sList;
    }

    public List<CodeStatement> getsList() {
        return sList;
    }
}
