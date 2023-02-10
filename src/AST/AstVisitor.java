package AST;

public interface AstVisitor<T> {
    T visit(Ugk ugk);
    T visit(Imports imports);
    T visit(Import imp);
    T visit(Programme programme);
    T visit(Filename filename);
    T visit(DecType decType);
    T visit(DecFonction decFonction);
    T visit(Algorithme algorithme);
    T visit(Instruction instruction);
}
