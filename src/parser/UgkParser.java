// Generated from java-escape by ANTLR 4.11.1

package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class UgkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, STRING=64, INTEGER=65, DOUBLE=66, 
		FLOAT=67, TYPE=68, IDF=69, FILENAME=70, COMMENT=71, WS=72;
	public static final int
		RULE_ugk = 0, RULE_imports = 1, RULE_singleimport = 2, RULE_programme = 3, 
		RULE_fonctionoudeclatype = 4, RULE_algorithme = 5, RULE_fonction = 6, 
		RULE_declatype = 7, RULE_declatypeargs = 8, RULE_superset = 9, RULE_funcdecargs = 10, 
		RULE_algofoncblock = 11, RULE_block = 12, RULE_instruction = 13, RULE_selon = 14, 
		RULE_switchblock = 15, RULE_cas = 16, RULE_range = 17, RULE_defaut = 18, 
		RULE_retourne = 19, RULE_assignation = 20, RULE_si = 21, RULE_siblock = 22, 
		RULE_tantque = 23, RULE_pour = 24, RULE_appelfonc = 25, RULE_foncargs = 26, 
		RULE_declaration = 27, RULE_type = 28, RULE_primitive = 29, RULE_expr = 30, 
		RULE_ouexpr = 31, RULE_etexpr = 32, RULE_boolexpr = 33, RULE_addsousexpr = 34, 
		RULE_multordivexpr = 35, RULE_exprres = 36, RULE_booleen = 37, RULE_idfOrTab = 38, 
		RULE_idf = 39, RULE_filename = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"ugk", "imports", "singleimport", "programme", "fonctionoudeclatype", 
			"algorithme", "fonction", "declatype", "declatypeargs", "superset", "funcdecargs", 
			"algofoncblock", "block", "instruction", "selon", "switchblock", "cas", 
			"range", "defaut", "retourne", "assignation", "si", "siblock", "tantque", 
			"pour", "appelfonc", "foncargs", "declaration", "type", "primitive", 
			"expr", "ouexpr", "etexpr", "boolexpr", "addsousexpr", "multordivexpr", 
			"exprres", "booleen", "idfOrTab", "idf", "filename"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'importer'", "'<'", "'.ugk'", "'>'", "'algorithme'", "'debut'", 
			"'fin'", "'fonction'", "'('", "')'", "'nouveau'", "'type'", "'herite'", 
			"','", "'=>'", "'briser'", "'selon'", "'faire'", "'fselon'", "'cas'", 
			"'..'", "'defaut'", "'retourne'", "':='", "'sinon'", "'fsi'", "'si'", 
			"'alors'", "'tant'", "'que'", "'ftant'", "'pour'", "'allant'", "'de'", 
			"'vers'", "'fpour'", "'tableau'", "'['", "']'", "'entier'", "'chaine'", 
			"'caractere'", "'double'", "'booleen'", "'flottant'", "'vide'", "'ou'", 
			"'et'", "'<='", "'>='", "'!='", "'='", "'-'", "'+'", "'*'", "'/'", "'mod'", 
			"'quo'", "'NIL'", "'non'", "'vrai'", "'faux'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "STRING", "INTEGER", "DOUBLE", "FLOAT", "TYPE", 
			"IDF", "FILENAME", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UgkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UgkContext extends ParserRuleContext {
		public ProgrammeContext programme() {
			return getRuleContext(ProgrammeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(UgkParser.EOF, 0); }
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public UgkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ugk; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitUgk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UgkContext ugk() throws RecognitionException {
		UgkContext _localctx = new UgkContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ugk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(82);
				imports();
				}
			}

			setState(85);
			programme();
			setState(86);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsContext extends ParserRuleContext {
		public List<SingleimportContext> singleimport() {
			return getRuleContexts(SingleimportContext.class);
		}
		public SingleimportContext singleimport(int i) {
			return getRuleContext(SingleimportContext.class,i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				singleimport();
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleimportContext extends ParserRuleContext {
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public SingleimportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleimport; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitSingleimport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleimportContext singleimport() throws RecognitionException {
		SingleimportContext _localctx = new SingleimportContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleimport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__0);
			setState(94);
			match(T__1);
			setState(95);
			filename();
			setState(96);
			match(T__2);
			setState(97);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgrammeContext extends ParserRuleContext {
		public AlgorithmeContext algorithme() {
			return getRuleContext(AlgorithmeContext.class,0);
		}
		public List<FonctionoudeclatypeContext> fonctionoudeclatype() {
			return getRuleContexts(FonctionoudeclatypeContext.class);
		}
		public FonctionoudeclatypeContext fonctionoudeclatype(int i) {
			return getRuleContext(FonctionoudeclatypeContext.class,i);
		}
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitProgramme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_programme);
		int _la;
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7 || _la==T__10) {
					{
					{
					setState(99);
					fonctionoudeclatype();
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				algorithme();
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7 || _la==T__10) {
					{
					{
					setState(106);
					fonctionoudeclatype();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(112);
					fonctionoudeclatype();
					}
					}
					setState(115); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__7 || _la==T__10 );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FonctionoudeclatypeContext extends ParserRuleContext {
		public FonctionContext fonction() {
			return getRuleContext(FonctionContext.class,0);
		}
		public DeclatypeContext declatype() {
			return getRuleContext(DeclatypeContext.class,0);
		}
		public FonctionoudeclatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fonctionoudeclatype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitFonctionoudeclatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FonctionoudeclatypeContext fonctionoudeclatype() throws RecognitionException {
		FonctionoudeclatypeContext _localctx = new FonctionoudeclatypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fonctionoudeclatype);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				fonction();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				declatype();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlgorithmeContext extends ParserRuleContext {
		public AlgofoncblockContext algofoncblock() {
			return getRuleContext(AlgofoncblockContext.class,0);
		}
		public AlgorithmeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithme; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitAlgorithme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmeContext algorithme() throws RecognitionException {
		AlgorithmeContext _localctx = new AlgorithmeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_algorithme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__4);
			setState(124);
			match(T__5);
			setState(125);
			algofoncblock();
			setState(126);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FonctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdfContext idf() {
			return getRuleContext(IdfContext.class,0);
		}
		public AlgofoncblockContext algofoncblock() {
			return getRuleContext(AlgofoncblockContext.class,0);
		}
		public FuncdecargsContext funcdecargs() {
			return getRuleContext(FuncdecargsContext.class,0);
		}
		public FonctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fonction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitFonction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FonctionContext fonction() throws RecognitionException {
		FonctionContext _localctx = new FonctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fonction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__7);
			setState(129);
			type();
			setState(130);
			idf();
			setState(131);
			match(T__8);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 2147484665L) != 0) {
				{
				setState(132);
				funcdecargs();
				}
			}

			setState(135);
			match(T__9);
			setState(136);
			match(T__5);
			setState(137);
			algofoncblock();
			setState(138);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclatypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(UgkParser.TYPE, 0); }
		public DeclatypeargsContext declatypeargs() {
			return getRuleContext(DeclatypeargsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declatype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitDeclatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclatypeContext declatype() throws RecognitionException {
		DeclatypeContext _localctx = new DeclatypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__10);
			setState(141);
			match(T__11);
			setState(142);
			match(TYPE);
			setState(143);
			match(T__8);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 2147484665L) != 0) {
				{
				setState(144);
				declatypeargs();
				}
			}

			setState(147);
			match(T__9);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(148);
				match(T__12);
				setState(149);
				type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclatypeargsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdfContext> idf() {
			return getRuleContexts(IdfContext.class);
		}
		public IdfContext idf(int i) {
			return getRuleContext(IdfContext.class,i);
		}
		public List<SupersetContext> superset() {
			return getRuleContexts(SupersetContext.class);
		}
		public SupersetContext superset(int i) {
			return getRuleContext(SupersetContext.class,i);
		}
		public DeclatypeargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declatypeargs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitDeclatypeargs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclatypeargsContext declatypeargs() throws RecognitionException {
		DeclatypeargsContext _localctx = new DeclatypeargsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declatypeargs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			type();
			setState(153);
			idf();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(154);
				superset();
				}
			}

			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(157);
				match(T__13);
				setState(158);
				type();
				setState(159);
				idf();
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(160);
					superset();
					}
				}

				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SupersetContext extends ParserRuleContext {
		public AlgofoncblockContext algofoncblock() {
			return getRuleContext(AlgofoncblockContext.class,0);
		}
		public SupersetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superset; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitSuperset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupersetContext superset() throws RecognitionException {
		SupersetContext _localctx = new SupersetContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_superset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__14);
			setState(169);
			match(T__5);
			setState(170);
			algofoncblock();
			setState(171);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncdecargsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdfContext> idf() {
			return getRuleContexts(IdfContext.class);
		}
		public IdfContext idf(int i) {
			return getRuleContext(IdfContext.class,i);
		}
		public FuncdecargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdecargs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitFuncdecargs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdecargsContext funcdecargs() throws RecognitionException {
		FuncdecargsContext _localctx = new FuncdecargsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcdecargs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			type();
			setState(174);
			idf();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(175);
				match(T__13);
				setState(176);
				type();
				setState(177);
				idf();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlgofoncblockContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public AlgofoncblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algofoncblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitAlgofoncblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgofoncblockContext algofoncblock() throws RecognitionException {
		AlgofoncblockContext _localctx = new AlgofoncblockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_algofoncblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 13510801014990979L) != 0) {
				{
				{
				setState(184);
				instruction();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 13510801014990979L) != 0) {
				{
				{
				setState(190);
				instruction();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public TantqueContext tantque() {
			return getRuleContext(TantqueContext.class,0);
		}
		public AppelfoncContext appelfonc() {
			return getRuleContext(AppelfoncContext.class,0);
		}
		public PourContext pour() {
			return getRuleContext(PourContext.class,0);
		}
		public RetourneContext retourne() {
			return getRuleContext(RetourneContext.class,0);
		}
		public SelonContext selon() {
			return getRuleContext(SelonContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_instruction);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				assignation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				si();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				tantque();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				appelfonc();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				pour();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(202);
				retourne();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(203);
				selon();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(204);
				match(T__15);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelonContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SwitchblockContext switchblock() {
			return getRuleContext(SwitchblockContext.class,0);
		}
		public SelonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selon; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitSelon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelonContext selon() throws RecognitionException {
		SelonContext _localctx = new SelonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_selon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__16);
			setState(208);
			expr();
			setState(209);
			match(T__17);
			setState(210);
			switchblock();
			setState(211);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchblockContext extends ParserRuleContext {
		public List<CasContext> cas() {
			return getRuleContexts(CasContext.class);
		}
		public CasContext cas(int i) {
			return getRuleContext(CasContext.class,i);
		}
		public DefautContext defaut() {
			return getRuleContext(DefautContext.class,0);
		}
		public SwitchblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitSwitchblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchblockContext switchblock() throws RecognitionException {
		SwitchblockContext _localctx = new SwitchblockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_switchblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(213);
				cas();
				}
				}
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__19 );
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(218);
				defaut();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CasContext extends ParserRuleContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cas; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitCas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasContext cas() throws RecognitionException {
		CasContext _localctx = new CasContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__19);
			setState(222);
			range();
			setState(223);
			match(T__17);
			setState(224);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RangeContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_range);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				expr();
				setState(227);
				match(T__20);
				setState(228);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefautContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefautContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaut; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitDefaut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefautContext defaut() throws RecognitionException {
		DefautContext _localctx = new DefautContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_defaut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__21);
			setState(234);
			match(T__17);
			setState(235);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RetourneContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetourneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retourne; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitRetourne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetourneContext retourne() throws RecognitionException {
		RetourneContext _localctx = new RetourneContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_retourne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__22);
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(238);
				expr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignationContext extends ParserRuleContext {
		public IdfOrTabContext idfOrTab() {
			return getRuleContext(IdfOrTabContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitAssignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			idfOrTab();
			setState(242);
			match(T__23);
			setState(243);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SiContext extends ParserRuleContext {
		public List<SiblockContext> siblock() {
			return getRuleContexts(SiblockContext.class);
		}
		public SiblockContext siblock(int i) {
			return getRuleContext(SiblockContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_si);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			siblock();
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(246);
					match(T__24);
					setState(247);
					siblock();
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(253);
				match(T__24);
				setState(254);
				block();
				}
			}

			setState(257);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SiblockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SiblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitSiblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiblockContext siblock() throws RecognitionException {
		SiblockContext _localctx = new SiblockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_siblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__26);
			setState(260);
			expr();
			setState(261);
			match(T__27);
			setState(262);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TantqueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TantqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tantque; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitTantque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TantqueContext tantque() throws RecognitionException {
		TantqueContext _localctx = new TantqueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tantque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__28);
			setState(265);
			match(T__29);
			setState(266);
			expr();
			setState(267);
			match(T__17);
			setState(268);
			block();
			setState(269);
			match(T__30);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PourContext extends ParserRuleContext {
		public IdfOrTabContext idfOrTab() {
			return getRuleContext(IdfOrTabContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pour; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitPour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PourContext pour() throws RecognitionException {
		PourContext _localctx = new PourContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pour);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__31);
			setState(272);
			idfOrTab();
			setState(273);
			match(T__32);
			setState(274);
			match(T__33);
			setState(275);
			expr();
			setState(276);
			match(T__34);
			setState(277);
			expr();
			setState(278);
			match(T__17);
			setState(279);
			block();
			setState(280);
			match(T__35);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppelfoncContext extends ParserRuleContext {
		public IdfContext idf() {
			return getRuleContext(IdfContext.class,0);
		}
		public FoncargsContext foncargs() {
			return getRuleContext(FoncargsContext.class,0);
		}
		public AppelfoncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appelfonc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitAppelfonc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppelfoncContext appelfonc() throws RecognitionException {
		AppelfoncContext _localctx = new AppelfoncContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_appelfonc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			idf();
			setState(283);
			match(T__8);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 2286720302983413761L) != 0) {
				{
				setState(284);
				foncargs();
				}
			}

			setState(287);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FoncargsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FoncargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foncargs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitFoncargs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FoncargsContext foncargs() throws RecognitionException {
		FoncargsContext _localctx = new FoncargsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_foncargs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			expr();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(290);
				match(T__13);
				setState(291);
				expr();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdfContext idf() {
			return getRuleContext(IdfContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			type();
			setState(298);
			idf();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(299);
				match(T__23);
				setState(300);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(UgkParser.TYPE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_type);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				primitive();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(TYPE);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(T__36);
				setState(306);
				match(T__37);
				setState(307);
				type();
				setState(308);
				match(T__38);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveContext extends ParserRuleContext {
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 139637976727552L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public OuexprContext ouexpr() {
			return getRuleContext(OuexprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			ouexpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OuexprContext extends ParserRuleContext {
		public EtexprContext etexpr() {
			return getRuleContext(EtexprContext.class,0);
		}
		public OuexprContext ouexpr() {
			return getRuleContext(OuexprContext.class,0);
		}
		public OuexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ouexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitOuexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OuexprContext ouexpr() throws RecognitionException {
		OuexprContext _localctx = new OuexprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ouexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			etexpr();
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(317);
				match(T__46);
				setState(318);
				ouexpr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EtexprContext extends ParserRuleContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public EtexprContext etexpr() {
			return getRuleContext(EtexprContext.class,0);
		}
		public EtexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitEtexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EtexprContext etexpr() throws RecognitionException {
		EtexprContext _localctx = new EtexprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_etexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			boolexpr();
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(322);
				match(T__47);
				setState(323);
				etexpr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolexprContext extends ParserRuleContext {
		public AddsousexprContext addsousexpr() {
			return getRuleContext(AddsousexprContext.class,0);
		}
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitBoolexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		BoolexprContext _localctx = new BoolexprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_boolexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			addsousexpr();
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(327);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8444249301319700L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(328);
				boolexpr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddsousexprContext extends ParserRuleContext {
		public MultordivexprContext multordivexpr() {
			return getRuleContext(MultordivexprContext.class,0);
		}
		public AddsousexprContext addsousexpr() {
			return getRuleContext(AddsousexprContext.class,0);
		}
		public AddsousexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addsousexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitAddsousexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddsousexprContext addsousexpr() throws RecognitionException {
		AddsousexprContext _localctx = new AddsousexprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_addsousexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			multordivexpr();
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(332);
				_la = _input.LA(1);
				if ( !(_la==T__52 || _la==T__53) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(333);
				addsousexpr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultordivexprContext extends ParserRuleContext {
		public ExprresContext exprres() {
			return getRuleContext(ExprresContext.class,0);
		}
		public MultordivexprContext multordivexpr() {
			return getRuleContext(MultordivexprContext.class,0);
		}
		public MultordivexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multordivexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitMultordivexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultordivexprContext multordivexpr() throws RecognitionException {
		MultordivexprContext _localctx = new MultordivexprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_multordivexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			exprres();
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(337);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 540431955284459520L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(338);
				multordivexpr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprresContext extends ParserRuleContext {
		public AppelfoncContext appelfonc() {
			return getRuleContext(AppelfoncContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprresContext exprres() {
			return getRuleContext(ExprresContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(UgkParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(UgkParser.DOUBLE, 0); }
		public TerminalNode INTEGER() { return getToken(UgkParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(UgkParser.STRING, 0); }
		public BooleenContext booleen() {
			return getRuleContext(BooleenContext.class,0);
		}
		public IdfOrTabContext idfOrTab() {
			return getRuleContext(IdfOrTabContext.class,0);
		}
		public ExprresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprres; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitExprres(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprresContext exprres() throws RecognitionException {
		ExprresContext _localctx = new ExprresContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_exprres);
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				appelfonc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(T__58);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				match(T__8);
				setState(344);
				expr();
				setState(345);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				match(T__59);
				setState(348);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(349);
				match(T__52);
				setState(350);
				exprres();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(351);
				match(FLOAT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(352);
				match(DOUBLE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(353);
				match(INTEGER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(354);
				match(STRING);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(355);
				booleen();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(356);
				idfOrTab();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleenContext extends ParserRuleContext {
		public BooleenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitBooleen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleenContext booleen() throws RecognitionException {
		BooleenContext _localctx = new BooleenContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_booleen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !(_la==T__60 || _la==T__61) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdfOrTabContext extends ParserRuleContext {
		public IdfContext idf() {
			return getRuleContext(IdfContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IdfOrTabContext idfOrTab() {
			return getRuleContext(IdfOrTabContext.class,0);
		}
		public IdfOrTabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idfOrTab; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitIdfOrTab(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdfOrTabContext idfOrTab() throws RecognitionException {
		IdfOrTabContext _localctx = new IdfOrTabContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_idfOrTab);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			idf();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(362);
				match(T__37);
				setState(363);
				expr();
				setState(364);
				match(T__38);
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__62) {
				{
				setState(371);
				match(T__62);
				setState(372);
				idfOrTab();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdfContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(UgkParser.TYPE, 0); }
		public TerminalNode IDF() { return getToken(UgkParser.IDF, 0); }
		public IdfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitIdf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdfContext idf() throws RecognitionException {
		IdfContext _localctx = new IdfContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_idf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==IDF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilenameContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(UgkParser.TYPE, 0); }
		public TerminalNode IDF() { return getToken(UgkParser.IDF, 0); }
		public TerminalNode FILENAME() { return getToken(UgkParser.FILENAME, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UgkVisitor ) return ((UgkVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_filename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 7L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001H\u017c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0001\u0000\u0003\u0000T\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0004\u0001Z\b\u0001\u000b\u0001\f\u0001[\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0005\u0003e\b\u0003\n\u0003\f\u0003h\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003l\b\u0003\n\u0003\f\u0003o\t\u0003\u0001\u0003\u0004\u0003"+
		"r\b\u0003\u000b\u0003\f\u0003s\u0003\u0003v\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0003\u0004z\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0086\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0092\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0097\b\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u009c\b\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u00a2\b\b\u0005\b\u00a4\b\b\n\b\f\b\u00a7"+
		"\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00b4\b\n\n\n\f\n\u00b7\t\n\u0001\u000b\u0005"+
		"\u000b\u00ba\b\u000b\n\u000b\f\u000b\u00bd\t\u000b\u0001\f\u0005\f\u00c0"+
		"\b\f\n\f\f\f\u00c3\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u00ce\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f\u00d7"+
		"\b\u000f\u000b\u000f\f\u000f\u00d8\u0001\u000f\u0003\u000f\u00dc\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00e8\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00f0\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00f9\b\u0015\n\u0015"+
		"\f\u0015\u00fc\t\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0100\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u011e\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u0125\b\u001a\n\u001a\f\u001a\u0128\t\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u012e\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0137"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0140\b\u001f\u0001 \u0001 \u0001 \u0003"+
		" \u0145\b \u0001!\u0001!\u0001!\u0003!\u014a\b!\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u014f\b\"\u0001#\u0001#\u0001#\u0003#\u0154\b#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0003$\u0166\b$\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0005&\u016f\b&\n&\f&\u0172\t&\u0001&\u0001&\u0003"+
		"&\u0176\b&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0000\u0000)\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNP\u0000\u0007\u0001\u0000(.\u0003\u0000\u0002"+
		"\u0002\u0004\u000414\u0001\u000056\u0001\u00007:\u0001\u0000=>\u0001\u0000"+
		"DE\u0001\u0000DF\u0186\u0000S\u0001\u0000\u0000\u0000\u0002Y\u0001\u0000"+
		"\u0000\u0000\u0004]\u0001\u0000\u0000\u0000\u0006u\u0001\u0000\u0000\u0000"+
		"\by\u0001\u0000\u0000\u0000\n{\u0001\u0000\u0000\u0000\f\u0080\u0001\u0000"+
		"\u0000\u0000\u000e\u008c\u0001\u0000\u0000\u0000\u0010\u0098\u0001\u0000"+
		"\u0000\u0000\u0012\u00a8\u0001\u0000\u0000\u0000\u0014\u00ad\u0001\u0000"+
		"\u0000\u0000\u0016\u00bb\u0001\u0000\u0000\u0000\u0018\u00c1\u0001\u0000"+
		"\u0000\u0000\u001a\u00cd\u0001\u0000\u0000\u0000\u001c\u00cf\u0001\u0000"+
		"\u0000\u0000\u001e\u00d6\u0001\u0000\u0000\u0000 \u00dd\u0001\u0000\u0000"+
		"\u0000\"\u00e7\u0001\u0000\u0000\u0000$\u00e9\u0001\u0000\u0000\u0000"+
		"&\u00ed\u0001\u0000\u0000\u0000(\u00f1\u0001\u0000\u0000\u0000*\u00f5"+
		"\u0001\u0000\u0000\u0000,\u0103\u0001\u0000\u0000\u0000.\u0108\u0001\u0000"+
		"\u0000\u00000\u010f\u0001\u0000\u0000\u00002\u011a\u0001\u0000\u0000\u0000"+
		"4\u0121\u0001\u0000\u0000\u00006\u0129\u0001\u0000\u0000\u00008\u0136"+
		"\u0001\u0000\u0000\u0000:\u0138\u0001\u0000\u0000\u0000<\u013a\u0001\u0000"+
		"\u0000\u0000>\u013c\u0001\u0000\u0000\u0000@\u0141\u0001\u0000\u0000\u0000"+
		"B\u0146\u0001\u0000\u0000\u0000D\u014b\u0001\u0000\u0000\u0000F\u0150"+
		"\u0001\u0000\u0000\u0000H\u0165\u0001\u0000\u0000\u0000J\u0167\u0001\u0000"+
		"\u0000\u0000L\u0169\u0001\u0000\u0000\u0000N\u0177\u0001\u0000\u0000\u0000"+
		"P\u0179\u0001\u0000\u0000\u0000RT\u0003\u0002\u0001\u0000SR\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0003"+
		"\u0006\u0003\u0000VW\u0005\u0000\u0000\u0001W\u0001\u0001\u0000\u0000"+
		"\u0000XZ\u0003\u0004\u0002\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0003"+
		"\u0001\u0000\u0000\u0000]^\u0005\u0001\u0000\u0000^_\u0005\u0002\u0000"+
		"\u0000_`\u0003P(\u0000`a\u0005\u0003\u0000\u0000ab\u0005\u0004\u0000\u0000"+
		"b\u0005\u0001\u0000\u0000\u0000ce\u0003\b\u0004\u0000dc\u0001\u0000\u0000"+
		"\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000im\u0003"+
		"\n\u0005\u0000jl\u0003\b\u0004\u0000kj\u0001\u0000\u0000\u0000lo\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"nv\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pr\u0003\b\u0004\u0000"+
		"qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000uf\u0001\u0000"+
		"\u0000\u0000uq\u0001\u0000\u0000\u0000v\u0007\u0001\u0000\u0000\u0000"+
		"wz\u0003\f\u0006\u0000xz\u0003\u000e\u0007\u0000yw\u0001\u0000\u0000\u0000"+
		"yx\u0001\u0000\u0000\u0000z\t\u0001\u0000\u0000\u0000{|\u0005\u0005\u0000"+
		"\u0000|}\u0005\u0006\u0000\u0000}~\u0003\u0016\u000b\u0000~\u007f\u0005"+
		"\u0007\u0000\u0000\u007f\u000b\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"\b\u0000\u0000\u0081\u0082\u00038\u001c\u0000\u0082\u0083\u0003N\'\u0000"+
		"\u0083\u0085\u0005\t\u0000\u0000\u0084\u0086\u0003\u0014\n\u0000\u0085"+
		"\u0084\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0005\n\u0000\u0000\u0088\u0089"+
		"\u0005\u0006\u0000\u0000\u0089\u008a\u0003\u0016\u000b\u0000\u008a\u008b"+
		"\u0005\u0007\u0000\u0000\u008b\r\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"\u000b\u0000\u0000\u008d\u008e\u0005\f\u0000\u0000\u008e\u008f\u0005D"+
		"\u0000\u0000\u008f\u0091\u0005\t\u0000\u0000\u0090\u0092\u0003\u0010\b"+
		"\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0096\u0005\n\u0000\u0000"+
		"\u0094\u0095\u0005\r\u0000\u0000\u0095\u0097\u00038\u001c\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\u000f\u0001\u0000\u0000\u0000\u0098\u0099\u00038\u001c\u0000\u0099\u009b"+
		"\u0003N\'\u0000\u009a\u009c\u0003\u0012\t\u0000\u009b\u009a\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u00a5\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005\u000e\u0000\u0000\u009e\u009f\u00038\u001c"+
		"\u0000\u009f\u00a1\u0003N\'\u0000\u00a0\u00a2\u0003\u0012\t\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a3\u009d\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u0011\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u000f\u0000\u0000\u00a9"+
		"\u00aa\u0005\u0006\u0000\u0000\u00aa\u00ab\u0003\u0016\u000b\u0000\u00ab"+
		"\u00ac\u0005\u0007\u0000\u0000\u00ac\u0013\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u00038\u001c\u0000\u00ae\u00b5\u0003N\'\u0000\u00af\u00b0\u0005"+
		"\u000e\u0000\u0000\u00b0\u00b1\u00038\u001c\u0000\u00b1\u00b2\u0003N\'"+
		"\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00af\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u0015\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00ba\u0003\u001a\r\u0000"+
		"\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u0017\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u00be\u00c0\u0003\u001a\r\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c2\u0019\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c4\u00ce\u00036\u001b\u0000\u00c5\u00ce"+
		"\u0003(\u0014\u0000\u00c6\u00ce\u0003*\u0015\u0000\u00c7\u00ce\u0003."+
		"\u0017\u0000\u00c8\u00ce\u00032\u0019\u0000\u00c9\u00ce\u00030\u0018\u0000"+
		"\u00ca\u00ce\u0003&\u0013\u0000\u00cb\u00ce\u0003\u001c\u000e\u0000\u00cc"+
		"\u00ce\u0005\u0010\u0000\u0000\u00cd\u00c4\u0001\u0000\u0000\u0000\u00cd"+
		"\u00c5\u0001\u0000\u0000\u0000\u00cd\u00c6\u0001\u0000\u0000\u0000\u00cd"+
		"\u00c7\u0001\u0000\u0000\u0000\u00cd\u00c8\u0001\u0000\u0000\u0000\u00cd"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"\u001b\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u0011\u0000\u0000\u00d0"+
		"\u00d1\u0003<\u001e\u0000\u00d1\u00d2\u0005\u0012\u0000\u0000\u00d2\u00d3"+
		"\u0003\u001e\u000f\u0000\u00d3\u00d4\u0005\u0013\u0000\u0000\u00d4\u001d"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d7\u0003 \u0010\u0000\u00d6\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00db\u0001"+
		"\u0000\u0000\u0000\u00da\u00dc\u0003$\u0012\u0000\u00db\u00da\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u001f\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0005\u0014\u0000\u0000\u00de\u00df\u0003\"\u0011"+
		"\u0000\u00df\u00e0\u0005\u0012\u0000\u0000\u00e0\u00e1\u0003\u0018\f\u0000"+
		"\u00e1!\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003<\u001e\u0000\u00e3\u00e4"+
		"\u0005\u0015\u0000\u0000\u00e4\u00e5\u0003<\u001e\u0000\u00e5\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e8\u0003<\u001e\u0000\u00e7\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8#\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0005\u0016\u0000\u0000\u00ea\u00eb\u0005\u0012\u0000"+
		"\u0000\u00eb\u00ec\u0003\u0018\f\u0000\u00ec%\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ef\u0005\u0017\u0000\u0000\u00ee\u00f0\u0003<\u001e\u0000\u00ef"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"\'\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003L&\u0000\u00f2\u00f3\u0005"+
		"\u0018\u0000\u0000\u00f3\u00f4\u0003<\u001e\u0000\u00f4)\u0001\u0000\u0000"+
		"\u0000\u00f5\u00fa\u0003,\u0016\u0000\u00f6\u00f7\u0005\u0019\u0000\u0000"+
		"\u00f7\u00f9\u0003,\u0016\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u00ff\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u0019\u0000\u0000\u00fe"+
		"\u0100\u0003\u0018\f\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0005\u001a\u0000\u0000\u0102+\u0001\u0000\u0000\u0000\u0103\u0104\u0005"+
		"\u001b\u0000\u0000\u0104\u0105\u0003<\u001e\u0000\u0105\u0106\u0005\u001c"+
		"\u0000\u0000\u0106\u0107\u0003\u0018\f\u0000\u0107-\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0005\u001d\u0000\u0000\u0109\u010a\u0005\u001e\u0000"+
		"\u0000\u010a\u010b\u0003<\u001e\u0000\u010b\u010c\u0005\u0012\u0000\u0000"+
		"\u010c\u010d\u0003\u0018\f\u0000\u010d\u010e\u0005\u001f\u0000\u0000\u010e"+
		"/\u0001\u0000\u0000\u0000\u010f\u0110\u0005 \u0000\u0000\u0110\u0111\u0003"+
		"L&\u0000\u0111\u0112\u0005!\u0000\u0000\u0112\u0113\u0005\"\u0000\u0000"+
		"\u0113\u0114\u0003<\u001e\u0000\u0114\u0115\u0005#\u0000\u0000\u0115\u0116"+
		"\u0003<\u001e\u0000\u0116\u0117\u0005\u0012\u0000\u0000\u0117\u0118\u0003"+
		"\u0018\f\u0000\u0118\u0119\u0005$\u0000\u0000\u01191\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0003N\'\u0000\u011b\u011d\u0005\t\u0000\u0000\u011c"+
		"\u011e\u00034\u001a\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e"+
		"\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0005\n\u0000\u0000\u01203\u0001\u0000\u0000\u0000\u0121\u0126\u0003"+
		"<\u001e\u0000\u0122\u0123\u0005\u000e\u0000\u0000\u0123\u0125\u0003<\u001e"+
		"\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000"+
		"\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000"+
		"\u0000\u01275\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u00038\u001c\u0000\u012a\u012d\u0003N\'\u0000\u012b\u012c"+
		"\u0005\u0018\u0000\u0000\u012c\u012e\u0003<\u001e\u0000\u012d\u012b\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e7\u0001\u0000"+
		"\u0000\u0000\u012f\u0137\u0003:\u001d\u0000\u0130\u0137\u0005D\u0000\u0000"+
		"\u0131\u0132\u0005%\u0000\u0000\u0132\u0133\u0005&\u0000\u0000\u0133\u0134"+
		"\u00038\u001c\u0000\u0134\u0135\u0005\'\u0000\u0000\u0135\u0137\u0001"+
		"\u0000\u0000\u0000\u0136\u012f\u0001\u0000\u0000\u0000\u0136\u0130\u0001"+
		"\u0000\u0000\u0000\u0136\u0131\u0001\u0000\u0000\u0000\u01379\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0007\u0000\u0000\u0000\u0139;\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0003>\u001f\u0000\u013b=\u0001\u0000\u0000\u0000\u013c"+
		"\u013f\u0003@ \u0000\u013d\u013e\u0005/\u0000\u0000\u013e\u0140\u0003"+
		">\u001f\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000"+
		"\u0000\u0000\u0140?\u0001\u0000\u0000\u0000\u0141\u0144\u0003B!\u0000"+
		"\u0142\u0143\u00050\u0000\u0000\u0143\u0145\u0003@ \u0000\u0144\u0142"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145A\u0001"+
		"\u0000\u0000\u0000\u0146\u0149\u0003D\"\u0000\u0147\u0148\u0007\u0001"+
		"\u0000\u0000\u0148\u014a\u0003B!\u0000\u0149\u0147\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u0001\u0000\u0000\u0000\u014aC\u0001\u0000\u0000\u0000\u014b"+
		"\u014e\u0003F#\u0000\u014c\u014d\u0007\u0002\u0000\u0000\u014d\u014f\u0003"+
		"D\"\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000"+
		"\u0000\u0000\u014fE\u0001\u0000\u0000\u0000\u0150\u0153\u0003H$\u0000"+
		"\u0151\u0152\u0007\u0003\u0000\u0000\u0152\u0154\u0003F#\u0000\u0153\u0151"+
		"\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154G\u0001"+
		"\u0000\u0000\u0000\u0155\u0166\u00032\u0019\u0000\u0156\u0166\u0005;\u0000"+
		"\u0000\u0157\u0158\u0005\t\u0000\u0000\u0158\u0159\u0003<\u001e\u0000"+
		"\u0159\u015a\u0005\n\u0000\u0000\u015a\u0166\u0001\u0000\u0000\u0000\u015b"+
		"\u015c\u0005<\u0000\u0000\u015c\u0166\u0003<\u001e\u0000\u015d\u015e\u0005"+
		"5\u0000\u0000\u015e\u0166\u0003H$\u0000\u015f\u0166\u0005C\u0000\u0000"+
		"\u0160\u0166\u0005B\u0000\u0000\u0161\u0166\u0005A\u0000\u0000\u0162\u0166"+
		"\u0005@\u0000\u0000\u0163\u0166\u0003J%\u0000\u0164\u0166\u0003L&\u0000"+
		"\u0165\u0155\u0001\u0000\u0000\u0000\u0165\u0156\u0001\u0000\u0000\u0000"+
		"\u0165\u0157\u0001\u0000\u0000\u0000\u0165\u015b\u0001\u0000\u0000\u0000"+
		"\u0165\u015d\u0001\u0000\u0000\u0000\u0165\u015f\u0001\u0000\u0000\u0000"+
		"\u0165\u0160\u0001\u0000\u0000\u0000\u0165\u0161\u0001\u0000\u0000\u0000"+
		"\u0165\u0162\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000"+
		"\u0165\u0164\u0001\u0000\u0000\u0000\u0166I\u0001\u0000\u0000\u0000\u0167"+
		"\u0168\u0007\u0004\u0000\u0000\u0168K\u0001\u0000\u0000\u0000\u0169\u0170"+
		"\u0003N\'\u0000\u016a\u016b\u0005&\u0000\u0000\u016b\u016c\u0003<\u001e"+
		"\u0000\u016c\u016d\u0005\'\u0000\u0000\u016d\u016f\u0001\u0000\u0000\u0000"+
		"\u016e\u016a\u0001\u0000\u0000\u0000\u016f\u0172\u0001\u0000\u0000\u0000"+
		"\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000"+
		"\u0171\u0175\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0005?\u0000\u0000\u0174\u0176\u0003L&\u0000\u0175\u0173"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176M\u0001"+
		"\u0000\u0000\u0000\u0177\u0178\u0007\u0005\u0000\u0000\u0178O\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0007\u0006\u0000\u0000\u017aQ\u0001\u0000\u0000"+
		"\u0000#S[fmsuy\u0085\u0091\u0096\u009b\u00a1\u00a5\u00b5\u00bb\u00c1\u00cd"+
		"\u00d8\u00db\u00e7\u00ef\u00fa\u00ff\u011d\u0126\u012d\u0136\u013f\u0144"+
		"\u0149\u014e\u0153\u0165\u0170\u0175";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}