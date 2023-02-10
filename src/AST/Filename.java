package AST;

public class Filename implements Ast {

    public String filename;

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }
    
}
