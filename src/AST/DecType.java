package AST;

public class DecType implements Ast {
    
    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }
}