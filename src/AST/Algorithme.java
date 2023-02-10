package AST;

import java.util.List;

public class Algorithme implements Ast {

    public List<Instruction> instructions;

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }
    
}
