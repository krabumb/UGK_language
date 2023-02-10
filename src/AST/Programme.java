package AST;

import java.util.List;
import java.util.Optional;

public class Programme implements Ast {

    public List<DecType> decTypes;
    public List<DecFonction> decFonctions;
    public Optional<Algorithme> algorithme;

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
