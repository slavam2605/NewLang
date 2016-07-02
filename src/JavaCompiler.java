import structure.VarDef;
import structure.statement.CodeBlockStatement;
import structure.statement.CodeStatement;
import structure.statement.ExprStatement;
import structure.statement.VarDefStatement;

import java.io.PrintStream;
import java.util.function.Consumer;

/**
 * @author Moklev Vyacheslav
 */
public class JavaCompiler {
    public StringBuilder compileCodeStatement(CodeStatement statement, StringBuilder sb) {
        if (statement instanceof CodeBlockStatement) {
            CodeBlockStatement cbStatement = ((CodeBlockStatement) statement);
            cbStatement.getsList().forEach(((Consumer<CodeStatement>) (s -> compileCodeStatement(s, sb))).andThen(
                    s -> sb.append(';')
            ));
        } else if (statement instanceof VarDefStatement) {
            VarDefStatement vdStatement = ((VarDefStatement) statement);
            for (VarDef vd: vdStatement.getVdList()) {

            }
        } else if (statement instanceof ExprStatement) {
            ExprStatement exprStatement = ((ExprStatement) statement);
            sb.append(new ExprCompiler(this).compile(exprStatement.getExpr()));
        } else {
            throw new IllegalArgumentException("Unknown statement type: " + statement.getClass());
        }
        return sb;
    }
}
