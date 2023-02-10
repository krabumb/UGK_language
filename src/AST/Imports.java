package AST;

import java.util.List;

public class Imports implements Ast {

    public List<String> imports;

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }
    
}
