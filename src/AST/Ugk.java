package AST;

import java.util.List;

public class Ugk implements Ast {

    public List<String> imports;
    public Programme programme;

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }
    
}
