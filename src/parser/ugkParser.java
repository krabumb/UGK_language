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
public class ugkParser extends Parser {
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
		T__45=46, T__46=47, T__47=48, T__48=49, STRING=50, INTEGER=51, DOUBLE=52, 
		FLOAT=53, TYPE=54, IDF=55, FILENAME=56, WS=57;
	public static final int
		RULE_ugk = 0, RULE_imports = 1, RULE_singleimport = 2, RULE_programme = 3, 
		RULE_algorithme = 4, RULE_fonction = 5, RULE_funcdecargs = 6, RULE_algofoncblock = 7, 
		RULE_block = 8, RULE_instruction = 9, RULE_retourne = 10, RULE_assignation = 11, 
		RULE_si = 12, RULE_siblock = 13, RULE_tantque = 14, RULE_pour = 15, RULE_appelfonc = 16, 
		RULE_foncargs = 17, RULE_declaration = 18, RULE_type = 19, RULE_primitive = 20, 
		RULE_expr = 21, RULE_addsousexpr = 22, RULE_multordivexpr = 23, RULE_boolexpr = 24, 
		RULE_exprres = 25, RULE_multipleexprcomp = 26, RULE_pmo = 27, RULE_mde = 28, 
		RULE_boolop = 29, RULE_booleen = 30, RULE_idf = 31, RULE_filename = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"ugk", "imports", "singleimport", "programme", "algorithme", "fonction", 
			"funcdecargs", "algofoncblock", "block", "instruction", "retourne", "assignation", 
			"si", "siblock", "tantque", "pour", "appelfonc", "foncargs", "declaration", 
			"type", "primitive", "expr", "addsousexpr", "multordivexpr", "boolexpr", 
			"exprres", "multipleexprcomp", "pmo", "mde", "boolop", "booleen", "idf", 
			"filename"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'importer'", "'<'", "'.ugk'", "'>'", "'algorithme'", "'debut'", 
			"'fin'", "'fonction'", "'('", "')'", "','", "'retourne'", "':='", "'sinon'", 
			"'fsi'", "'si'", "'alors'", "'tant'", "'que'", "'faire'", "'ftant'", 
			"'pour'", "'allant'", "'de'", "'vers'", "'fpour'", "'entier'", "'chaine'", 
			"'caractere'", "'double'", "'booleen'", "'flottant'", "'nil'", "'non'", 
			"'-'", "'\\u00C2\\u00B0'", "'+'", "'ou'", "'*'", "'/'", "'mod'", "'quo'", 
			"'et'", "'<='", "'>='", "'!='", "'='", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "STRING", "INTEGER", "DOUBLE", "FLOAT", "TYPE", "IDF", "FILENAME", 
			"WS"
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

	public ugkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UgkContext extends ParserRuleContext {
		public ProgrammeContext programme() {
			return getRuleContext(ProgrammeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ugkParser.EOF, 0); }
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public UgkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ugk; }
	}

	public final UgkContext ugk() throws RecognitionException {
		UgkContext _localctx = new UgkContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ugk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(66);
				imports();
				}
			}

			setState(69);
			programme();
			setState(70);
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
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				singleimport();
				}
				}
				setState(75); 
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
	}

	public final SingleimportContext singleimport() throws RecognitionException {
		SingleimportContext _localctx = new SingleimportContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleimport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__0);
			setState(78);
			match(T__1);
			setState(79);
			filename();
			setState(80);
			match(T__2);
			setState(81);
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
		public List<FonctionContext> fonction() {
			return getRuleContexts(FonctionContext.class);
		}
		public FonctionContext fonction(int i) {
			return getRuleContext(FonctionContext.class,i);
		}
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_programme);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(83);
					fonction();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				algorithme();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(90);
					fonction();
					}
					}
					setState(93); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__7 );
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
	public static class AlgorithmeContext extends ParserRuleContext {
		public AlgofoncblockContext algofoncblock() {
			return getRuleContext(AlgofoncblockContext.class,0);
		}
		public AlgorithmeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithme; }
	}

	public final AlgorithmeContext algorithme() throws RecognitionException {
		AlgorithmeContext _localctx = new AlgorithmeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_algorithme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__4);
			setState(98);
			match(T__5);
			setState(99);
			algofoncblock();
			setState(100);
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
	}

	public final FonctionContext fonction() throws RecognitionException {
		FonctionContext _localctx = new FonctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fonction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__7);
			setState(103);
			type();
			setState(104);
			idf();
			setState(105);
			match(T__8);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 18014406965198848L) != 0) {
				{
				setState(106);
				funcdecargs();
				}
			}

			setState(109);
			match(T__9);
			setState(110);
			match(T__5);
			setState(111);
			algofoncblock();
			setState(112);
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
	}

	public final FuncdecargsContext funcdecargs() throws RecognitionException {
		FuncdecargsContext _localctx = new FuncdecargsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcdecargs);
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				type();
				setState(115);
				idf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				type();
				setState(118);
				idf();
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(119);
					match(T__10);
					setState(120);
					type();
					setState(121);
					idf();
					}
					}
					setState(125); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__10 );
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
	}

	public final AlgofoncblockContext algofoncblock() throws RecognitionException {
		AlgofoncblockContext _localctx = new AlgofoncblockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_algofoncblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 54043203988688896L) != 0) {
				{
				{
				setState(129);
				instruction();
				}
				}
				setState(134);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 54043203988688896L) != 0) {
				{
				{
				setState(135);
				instruction();
				}
				}
				setState(140);
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
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instruction);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				assignation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				si();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				tantque();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				appelfonc();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
				pour();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
				retourne();
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
	public static class RetourneContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetourneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retourne; }
	}

	public final RetourneContext retourne() throws RecognitionException {
		RetourneContext _localctx = new RetourneContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_retourne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__11);
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(151);
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
		public IdfContext idf() {
			return getRuleContext(IdfContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			idf();
			setState(155);
			match(T__12);
			setState(156);
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
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_si);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			siblock();
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					match(T__13);
					setState(160);
					siblock();
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(166);
				match(T__13);
				setState(167);
				block();
				}
			}

			setState(170);
			match(T__14);
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
	}

	public final SiblockContext siblock() throws RecognitionException {
		SiblockContext _localctx = new SiblockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_siblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__15);
			setState(173);
			expr();
			setState(174);
			match(T__16);
			setState(175);
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
	}

	public final TantqueContext tantque() throws RecognitionException {
		TantqueContext _localctx = new TantqueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tantque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__17);
			setState(178);
			match(T__18);
			setState(179);
			expr();
			setState(180);
			match(T__19);
			setState(181);
			block();
			setState(182);
			match(T__20);
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
		public IdfContext idf() {
			return getRuleContext(IdfContext.class,0);
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
	}

	public final PourContext pour() throws RecognitionException {
		PourContext _localctx = new PourContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pour);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__21);
			setState(185);
			idf();
			setState(186);
			match(T__22);
			setState(187);
			match(T__23);
			setState(188);
			expr();
			setState(189);
			match(T__24);
			setState(190);
			expr();
			setState(191);
			match(T__19);
			setState(192);
			block();
			setState(193);
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
	}

	public final AppelfoncContext appelfonc() throws RecognitionException {
		AppelfoncContext _localctx = new AppelfoncContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_appelfonc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			idf();
			setState(196);
			match(T__8);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 71776247910236672L) != 0) {
				{
				setState(197);
				foncargs();
				}
			}

			setState(200);
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
	}

	public final FoncargsContext foncargs() throws RecognitionException {
		FoncargsContext _localctx = new FoncargsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_foncargs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			expr();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(203);
				match(T__10);
				setState(204);
				expr();
				}
				}
				setState(209);
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
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			type();
			setState(211);
			idf();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(212);
				match(T__12);
				setState(213);
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
		public TerminalNode TYPE() { return getToken(ugkParser.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				primitive();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(TYPE);
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
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716864L) != 0) ) {
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
		public AddsousexprContext addsousexpr() {
			return getRuleContext(AddsousexprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			addsousexpr();
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
		public PmoContext pmo() {
			return getRuleContext(PmoContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AddsousexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addsousexpr; }
	}

	public final AddsousexprContext addsousexpr() throws RecognitionException {
		AddsousexprContext _localctx = new AddsousexprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_addsousexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			multordivexpr();
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(225);
				pmo();
				setState(226);
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
	public static class MultordivexprContext extends ParserRuleContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public MdeContext mde() {
			return getRuleContext(MdeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MultordivexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multordivexpr; }
	}

	public final MultordivexprContext multordivexpr() throws RecognitionException {
		MultordivexprContext _localctx = new MultordivexprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_multordivexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			boolexpr();
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(231);
				mde();
				setState(232);
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
	public static class BoolexprContext extends ParserRuleContext {
		public ExprresContext exprres() {
			return getRuleContext(ExprresContext.class,0);
		}
		public BoolopContext boolop() {
			return getRuleContext(BoolopContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		BoolexprContext _localctx = new BoolexprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_boolexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			exprres();
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(237);
				boolop();
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
		public MultipleexprcompContext multipleexprcomp() {
			return getRuleContext(MultipleexprcompContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(ugkParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(ugkParser.DOUBLE, 0); }
		public TerminalNode INTEGER() { return getToken(ugkParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(ugkParser.STRING, 0); }
		public BooleenContext booleen() {
			return getRuleContext(BooleenContext.class,0);
		}
		public IdfContext idf() {
			return getRuleContext(IdfContext.class,0);
		}
		public ExprresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprres; }
	}

	public final ExprresContext exprres() throws RecognitionException {
		ExprresContext _localctx = new ExprresContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_exprres);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				appelfonc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(T__32);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(T__8);
				setState(245);
				expr();
				setState(246);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				match(T__33);
				setState(249);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				match(T__34);
				setState(251);
				exprres();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				multipleexprcomp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				match(FLOAT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(254);
				match(DOUBLE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(255);
				match(INTEGER);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(256);
				match(STRING);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(257);
				booleen();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(258);
				idf();
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
	public static class MultipleexprcompContext extends ParserRuleContext {
		public FoncargsContext foncargs() {
			return getRuleContext(FoncargsContext.class,0);
		}
		public MultipleexprcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleexprcomp; }
	}

	public final MultipleexprcompContext multipleexprcomp() throws RecognitionException {
		MultipleexprcompContext _localctx = new MultipleexprcompContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_multipleexprcomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__35);
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(262);
				foncargs();
				}
				break;
			}
			setState(265);
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
	public static class PmoContext extends ParserRuleContext {
		public PmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pmo; }
	}

	public final PmoContext pmo() throws RecognitionException {
		PmoContext _localctx = new PmoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_pmo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 446676598784L) != 0) ) {
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
	public static class MdeContext extends ParserRuleContext {
		public MdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mde; }
	}

	public final MdeContext mde() throws RecognitionException {
		MdeContext _localctx = new MdeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_mde);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 17042430230528L) != 0) ) {
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
	public static class BoolopContext extends ParserRuleContext {
		public BoolopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolop; }
	}

	public final BoolopContext boolop() throws RecognitionException {
		BoolopContext _localctx = new BoolopContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_boolop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 263882790666260L) != 0) ) {
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
	public static class BooleenContext extends ParserRuleContext {
		public BooleenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleen; }
	}

	public final BooleenContext booleen() throws RecognitionException {
		BooleenContext _localctx = new BooleenContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_booleen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==T__47 || _la==T__48) ) {
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
	public static class IdfContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ugkParser.TYPE, 0); }
		public TerminalNode IDF() { return getToken(ugkParser.IDF, 0); }
		public IdfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idf; }
	}

	public final IdfContext idf() throws RecognitionException {
		IdfContext _localctx = new IdfContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_idf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		public TerminalNode TYPE() { return getToken(ugkParser.TYPE, 0); }
		public TerminalNode IDF() { return getToken(ugkParser.IDF, 0); }
		public TerminalNode FILENAME() { return getToken(ugkParser.FILENAME, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_filename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 126100789566373888L) != 0) ) {
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
		"\u0004\u00019\u0118\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0003\u0000D\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001J\b\u0001"+
		"\u000b\u0001\f\u0001K\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0005\u0003U\b\u0003\n\u0003\f\u0003"+
		"X\t\u0003\u0001\u0003\u0001\u0003\u0004\u0003\\\b\u0003\u000b\u0003\f"+
		"\u0003]\u0003\u0003`\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005l\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006|\b"+
		"\u0006\u000b\u0006\f\u0006}\u0003\u0006\u0080\b\u0006\u0001\u0007\u0005"+
		"\u0007\u0083\b\u0007\n\u0007\f\u0007\u0086\t\u0007\u0001\b\u0005\b\u0089"+
		"\b\b\n\b\f\b\u008c\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u0095\b\t\u0001\n\u0001\n\u0003\n\u0099\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00a2"+
		"\b\f\n\f\f\f\u00a5\t\f\u0001\f\u0001\f\u0003\f\u00a9\b\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00c7\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u00ce\b\u0011\n\u0011\f\u0011\u00d1\t\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00d7\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00db\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u00e5\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u00eb\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u00f1\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0104\b\u0019\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0108\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0000\u0000!\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@\u0000\u0007\u0001\u0000\u001b \u0002\u0000##%&\u0001\u0000\'"+
		"+\u0003\u0000\u0002\u0002\u0004\u0004,/\u0001\u000001\u0001\u000067\u0001"+
		"\u000068\u011c\u0000C\u0001\u0000\u0000\u0000\u0002I\u0001\u0000\u0000"+
		"\u0000\u0004M\u0001\u0000\u0000\u0000\u0006_\u0001\u0000\u0000\u0000\b"+
		"a\u0001\u0000\u0000\u0000\nf\u0001\u0000\u0000\u0000\f\u007f\u0001\u0000"+
		"\u0000\u0000\u000e\u0084\u0001\u0000\u0000\u0000\u0010\u008a\u0001\u0000"+
		"\u0000\u0000\u0012\u0094\u0001\u0000\u0000\u0000\u0014\u0096\u0001\u0000"+
		"\u0000\u0000\u0016\u009a\u0001\u0000\u0000\u0000\u0018\u009e\u0001\u0000"+
		"\u0000\u0000\u001a\u00ac\u0001\u0000\u0000\u0000\u001c\u00b1\u0001\u0000"+
		"\u0000\u0000\u001e\u00b8\u0001\u0000\u0000\u0000 \u00c3\u0001\u0000\u0000"+
		"\u0000\"\u00ca\u0001\u0000\u0000\u0000$\u00d2\u0001\u0000\u0000\u0000"+
		"&\u00da\u0001\u0000\u0000\u0000(\u00dc\u0001\u0000\u0000\u0000*\u00de"+
		"\u0001\u0000\u0000\u0000,\u00e0\u0001\u0000\u0000\u0000.\u00e6\u0001\u0000"+
		"\u0000\u00000\u00ec\u0001\u0000\u0000\u00002\u0103\u0001\u0000\u0000\u0000"+
		"4\u0105\u0001\u0000\u0000\u00006\u010b\u0001\u0000\u0000\u00008\u010d"+
		"\u0001\u0000\u0000\u0000:\u010f\u0001\u0000\u0000\u0000<\u0111\u0001\u0000"+
		"\u0000\u0000>\u0113\u0001\u0000\u0000\u0000@\u0115\u0001\u0000\u0000\u0000"+
		"BD\u0003\u0002\u0001\u0000CB\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000EF\u0003\u0006\u0003\u0000FG\u0005\u0000"+
		"\u0000\u0001G\u0001\u0001\u0000\u0000\u0000HJ\u0003\u0004\u0002\u0000"+
		"IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000L\u0003\u0001\u0000\u0000\u0000MN\u0005"+
		"\u0001\u0000\u0000NO\u0005\u0002\u0000\u0000OP\u0003@ \u0000PQ\u0005\u0003"+
		"\u0000\u0000QR\u0005\u0004\u0000\u0000R\u0005\u0001\u0000\u0000\u0000"+
		"SU\u0003\n\u0005\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000Y`\u0003\b\u0004\u0000Z\\\u0003\n\u0005"+
		"\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_V\u0001"+
		"\u0000\u0000\u0000_[\u0001\u0000\u0000\u0000`\u0007\u0001\u0000\u0000"+
		"\u0000ab\u0005\u0005\u0000\u0000bc\u0005\u0006\u0000\u0000cd\u0003\u000e"+
		"\u0007\u0000de\u0005\u0007\u0000\u0000e\t\u0001\u0000\u0000\u0000fg\u0005"+
		"\b\u0000\u0000gh\u0003&\u0013\u0000hi\u0003>\u001f\u0000ik\u0005\t\u0000"+
		"\u0000jl\u0003\f\u0006\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mn\u0005\n\u0000\u0000no\u0005\u0006\u0000"+
		"\u0000op\u0003\u000e\u0007\u0000pq\u0005\u0007\u0000\u0000q\u000b\u0001"+
		"\u0000\u0000\u0000rs\u0003&\u0013\u0000st\u0003>\u001f\u0000t\u0080\u0001"+
		"\u0000\u0000\u0000uv\u0003&\u0013\u0000v{\u0003>\u001f\u0000wx\u0005\u000b"+
		"\u0000\u0000xy\u0003&\u0013\u0000yz\u0003>\u001f\u0000z|\u0001\u0000\u0000"+
		"\u0000{w\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000"+
		"\u007fr\u0001\u0000\u0000\u0000\u007fu\u0001\u0000\u0000\u0000\u0080\r"+
		"\u0001\u0000\u0000\u0000\u0081\u0083\u0003\u0012\t\u0000\u0082\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u000f\u0001"+
		"\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0089\u0003"+
		"\u0012\t\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000"+
		"\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u0011\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008d\u0095\u0003$\u0012\u0000\u008e\u0095\u0003\u0016\u000b"+
		"\u0000\u008f\u0095\u0003\u0018\f\u0000\u0090\u0095\u0003\u001c\u000e\u0000"+
		"\u0091\u0095\u0003 \u0010\u0000\u0092\u0095\u0003\u001e\u000f\u0000\u0093"+
		"\u0095\u0003\u0014\n\u0000\u0094\u008d\u0001\u0000\u0000\u0000\u0094\u008e"+
		"\u0001\u0000\u0000\u0000\u0094\u008f\u0001\u0000\u0000\u0000\u0094\u0090"+
		"\u0001\u0000\u0000\u0000\u0094\u0091\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0013"+
		"\u0001\u0000\u0000\u0000\u0096\u0098\u0005\f\u0000\u0000\u0097\u0099\u0003"+
		"*\u0015\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u0015\u0001\u0000\u0000\u0000\u009a\u009b\u0003>\u001f"+
		"\u0000\u009b\u009c\u0005\r\u0000\u0000\u009c\u009d\u0003*\u0015\u0000"+
		"\u009d\u0017\u0001\u0000\u0000\u0000\u009e\u00a3\u0003\u001a\r\u0000\u009f"+
		"\u00a0\u0005\u000e\u0000\u0000\u00a0\u00a2\u0003\u001a\r\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005\u000e\u0000\u0000\u00a7\u00a9\u0003\u0010\b\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0005\u000f\u0000\u0000\u00ab\u0019\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005\u0010\u0000\u0000\u00ad\u00ae\u0003"+
		"*\u0015\u0000\u00ae\u00af\u0005\u0011\u0000\u0000\u00af\u00b0\u0003\u0010"+
		"\b\u0000\u00b0\u001b\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0012\u0000"+
		"\u0000\u00b2\u00b3\u0005\u0013\u0000\u0000\u00b3\u00b4\u0003*\u0015\u0000"+
		"\u00b4\u00b5\u0005\u0014\u0000\u0000\u00b5\u00b6\u0003\u0010\b\u0000\u00b6"+
		"\u00b7\u0005\u0015\u0000\u0000\u00b7\u001d\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0005\u0016\u0000\u0000\u00b9\u00ba\u0003>\u001f\u0000\u00ba\u00bb"+
		"\u0005\u0017\u0000\u0000\u00bb\u00bc\u0005\u0018\u0000\u0000\u00bc\u00bd"+
		"\u0003*\u0015\u0000\u00bd\u00be\u0005\u0019\u0000\u0000\u00be\u00bf\u0003"+
		"*\u0015\u0000\u00bf\u00c0\u0005\u0014\u0000\u0000\u00c0\u00c1\u0003\u0010"+
		"\b\u0000\u00c1\u00c2\u0005\u001a\u0000\u0000\u00c2\u001f\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0003>\u001f\u0000\u00c4\u00c6\u0005\t\u0000\u0000"+
		"\u00c5\u00c7\u0003\"\u0011\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0005\n\u0000\u0000\u00c9!\u0001\u0000\u0000\u0000\u00ca\u00cf"+
		"\u0003*\u0015\u0000\u00cb\u00cc\u0005\u000b\u0000\u0000\u00cc\u00ce\u0003"+
		"*\u0015\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d0#\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0003&\u0013\u0000\u00d3\u00d6\u0003>\u001f\u0000\u00d4"+
		"\u00d5\u0005\r\u0000\u0000\u00d5\u00d7\u0003*\u0015\u0000\u00d6\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7%\u0001"+
		"\u0000\u0000\u0000\u00d8\u00db\u0003(\u0014\u0000\u00d9\u00db\u00056\u0000"+
		"\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00d9\u0001\u0000\u0000"+
		"\u0000\u00db\'\u0001\u0000\u0000\u0000\u00dc\u00dd\u0007\u0000\u0000\u0000"+
		"\u00dd)\u0001\u0000\u0000\u0000\u00de\u00df\u0003,\u0016\u0000\u00df+"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e4\u0003.\u0017\u0000\u00e1\u00e2\u0003"+
		"6\u001b\u0000\u00e2\u00e3\u0003*\u0015\u0000\u00e3\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e5-\u0001\u0000\u0000\u0000\u00e6\u00ea\u00030\u0018\u0000\u00e7"+
		"\u00e8\u00038\u001c\u0000\u00e8\u00e9\u0003*\u0015\u0000\u00e9\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb/\u0001\u0000\u0000\u0000\u00ec\u00f0\u00032\u0019"+
		"\u0000\u00ed\u00ee\u0003:\u001d\u0000\u00ee\u00ef\u0003*\u0015\u0000\u00ef"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f0\u00ed\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f11\u0001\u0000\u0000\u0000\u00f2\u0104"+
		"\u0003 \u0010\u0000\u00f3\u0104\u0005!\u0000\u0000\u00f4\u00f5\u0005\t"+
		"\u0000\u0000\u00f5\u00f6\u0003*\u0015\u0000\u00f6\u00f7\u0005\n\u0000"+
		"\u0000\u00f7\u0104\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\"\u0000\u0000"+
		"\u00f9\u0104\u0003*\u0015\u0000\u00fa\u00fb\u0005#\u0000\u0000\u00fb\u0104"+
		"\u00032\u0019\u0000\u00fc\u0104\u00034\u001a\u0000\u00fd\u0104\u00055"+
		"\u0000\u0000\u00fe\u0104\u00054\u0000\u0000\u00ff\u0104\u00053\u0000\u0000"+
		"\u0100\u0104\u00052\u0000\u0000\u0101\u0104\u0003<\u001e\u0000\u0102\u0104"+
		"\u0003>\u001f\u0000\u0103\u00f2\u0001\u0000\u0000\u0000\u0103\u00f3\u0001"+
		"\u0000\u0000\u0000\u0103\u00f4\u0001\u0000\u0000\u0000\u0103\u00f8\u0001"+
		"\u0000\u0000\u0000\u0103\u00fa\u0001\u0000\u0000\u0000\u0103\u00fc\u0001"+
		"\u0000\u0000\u0000\u0103\u00fd\u0001\u0000\u0000\u0000\u0103\u00fe\u0001"+
		"\u0000\u0000\u0000\u0103\u00ff\u0001\u0000\u0000\u0000\u0103\u0100\u0001"+
		"\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0102\u0001"+
		"\u0000\u0000\u0000\u01043\u0001\u0000\u0000\u0000\u0105\u0107\u0005$\u0000"+
		"\u0000\u0106\u0108\u0003\"\u0011\u0000\u0107\u0106\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0005$\u0000\u0000\u010a5\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0007\u0001\u0000\u0000\u010c7\u0001\u0000\u0000\u0000\u010d\u010e\u0007"+
		"\u0002\u0000\u0000\u010e9\u0001\u0000\u0000\u0000\u010f\u0110\u0007\u0003"+
		"\u0000\u0000\u0110;\u0001\u0000\u0000\u0000\u0111\u0112\u0007\u0004\u0000"+
		"\u0000\u0112=\u0001\u0000\u0000\u0000\u0113\u0114\u0007\u0005\u0000\u0000"+
		"\u0114?\u0001\u0000\u0000\u0000\u0115\u0116\u0007\u0006\u0000\u0000\u0116"+
		"A\u0001\u0000\u0000\u0000\u0017CKV]_k}\u007f\u0084\u008a\u0094\u0098\u00a3"+
		"\u00a8\u00c6\u00cf\u00d6\u00da\u00e4\u00ea\u00f0\u0103\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}