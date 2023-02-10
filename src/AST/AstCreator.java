package AST;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import parser.UgkBaseVisitor;
import parser.UgkParser.AddsousexprContext;
import parser.UgkParser.AlgofoncblockContext;
import parser.UgkParser.AlgorithmeContext;
import parser.UgkParser.AppelfoncContext;
import parser.UgkParser.AssignationContext;
import parser.UgkParser.BlockContext;
import parser.UgkParser.BooleenContext;
import parser.UgkParser.BoolexprContext;
import parser.UgkParser.CasContext;
import parser.UgkParser.DeclarationContext;
import parser.UgkParser.DeclatypeContext;
import parser.UgkParser.DeclatypeargsContext;
import parser.UgkParser.DefautContext;
import parser.UgkParser.EtexprContext;
import parser.UgkParser.ExprContext;
import parser.UgkParser.ExprresContext;
import parser.UgkParser.FilenameContext;
import parser.UgkParser.FoncargsContext;
import parser.UgkParser.FonctionContext;
import parser.UgkParser.FonctionoudeclatypeContext;
import parser.UgkParser.FuncdecargsContext;
import parser.UgkParser.IdfContext;
import parser.UgkParser.IdfOrTabContext;
import parser.UgkParser.ImportsContext;
import parser.UgkParser.InstructionContext;
import parser.UgkParser.MultordivexprContext;
import parser.UgkParser.OuexprContext;
import parser.UgkParser.PourContext;
import parser.UgkParser.PrimitiveContext;
import parser.UgkParser.ProgrammeContext;
import parser.UgkParser.RangeContext;
import parser.UgkParser.RetourneContext;
import parser.UgkParser.SelonContext;
import parser.UgkParser.SiContext;
import parser.UgkParser.SiblockContext;
import parser.UgkParser.SingleimportContext;
import parser.UgkParser.SupersetContext;
import parser.UgkParser.SwitchblockContext;
import parser.UgkParser.TantqueContext;
import parser.UgkParser.TypeContext;
import parser.UgkParser.UgkContext;

public class AstCreator extends UgkBaseVisitor<Ast> {

    @Override
    public Ugk visitUgk(UgkContext ctx) {
        Ugk ugk = new Ugk();
        if (ctx.getChildCount() > 2) {
            ugk.imports = ((Imports) visit(ctx.getChild(0))).imports;
            ugk.programme = (Programme) visit(ctx.getChild(1));
        } else {
            ugk.imports = Collections.emptyList();
            ugk.programme = (Programme) visit(ctx.getChild(0));
        }
        return ugk;
    }

    @Override
    public Imports visitImports(ImportsContext ctx) {
        Imports imports = new Imports();
        imports.imports = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            imports.imports.add(((Import) visit(ctx.getChild(i))).filename);
        }
        return imports;
    }

    @Override
    public Import visitSingleimport(SingleimportContext ctx) {
        Import imp = new Import();
        imp.filename = ((Filename) visit(ctx.getChild(2))).filename + ".ugk";
        return imp;
    }

    @Override
    public Programme visitProgramme(ProgrammeContext ctx) {
        Programme programme = new Programme();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            Ast ast = visit(ctx.getChild(i));
            if (ast instanceof DecType) {
                if (programme.decTypes == null) {
                    programme.decTypes = new ArrayList<>();
                }
                programme.decTypes.add((DecType) ast);
            } else if (ast instanceof DecFonction) {
                if (programme.decFonctions == null) {
                    programme.decFonctions = new ArrayList<>();
                }
                programme.decFonctions.add((DecFonction) ast);
            } else if (ast instanceof Algorithme) {
                programme.algorithme = Optional.of((Algorithme) ast);
            } else {
                throw new RuntimeException("Unexpected child type");
            }
        }
        if (programme.decTypes == null) {
            programme.decTypes = Collections.emptyList();
        }
        if (programme.decFonctions == null) {
            programme.decFonctions = Collections.emptyList();
        }
        if (programme.algorithme == null) {
            programme.algorithme = Optional.empty();
        }
        return programme;
    }

    @Override
    public Ast visitFonctionoudeclatype(FonctionoudeclatypeContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Algorithme visitAlgorithme(AlgorithmeContext ctx) {
        Algorithme algorithme = new Algorithme();
        algorithme.instructions = visit(ctx.getChild(0)).instructions;
        return algorithme;
    }

    @Override
    public T visitFonction(FonctionContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitDeclatype(DeclatypeContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitDeclatypeargs(DeclatypeargsContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitSuperset(SupersetContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitFuncdecargs(FuncdecargsContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitAlgofoncblock(AlgofoncblockContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitBlock(BlockContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitInstruction(InstructionContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitSelon(SelonContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitSwitchblock(SwitchblockContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitCas(CasContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitRange(RangeContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitDefaut(DefautContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitRetourne(RetourneContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitAssignation(AssignationContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitSi(SiContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitSiblock(SiblockContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitTantque(TantqueContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitPour(PourContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitAppelfonc(AppelfoncContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitFoncargs(FoncargsContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitDeclaration(DeclarationContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitType(TypeContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitPrimitive(PrimitiveContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitExpr(ExprContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitOuexpr(OuexprContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitEtexpr(EtexprContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitBoolexpr(BoolexprContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitAddsousexpr(AddsousexprContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitMultordivexpr(MultordivexprContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitExprres(ExprresContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitBooleen(BooleenContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitIdfOrTab(IdfOrTabContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T visitIdf(IdfContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Filename visitFilename(FilenameContext ctx) {
        Filename filename = new Filename();
        filename.filename = ctx.getChild(0).getText();
        return filename;
    }   
}