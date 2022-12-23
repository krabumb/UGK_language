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
		T__45=46, T__46=47, T__47=48, STRING=49, INTEGER=50, DOUBLE=51, FLOAT=52, 
		FILENAME=53, IDF=54, TYPE=55, WS=56;
	public static final int
		RULE_ugk = 0, RULE_imports = 1, RULE_programme = 2, RULE_algorithme = 3, 
		RULE_fonction = 4, RULE_funcdecargs = 5, RULE_algofoncblock = 6, RULE_block = 7, 
		RULE_instruction = 8, RULE_retourne = 9, RULE_assignation = 10, RULE_si = 11, 
		RULE_tantque = 12, RULE_pour = 13, RULE_appelfonc = 14, RULE_foncargs = 15, 
		RULE_declaration = 16, RULE_type = 17, RULE_primitive = 18, RULE_expr = 19, 
		RULE_addsousexpr = 20, RULE_multordivexpr = 21, RULE_boolexpr = 22, RULE_exprres = 23, 
		RULE_multipleexprcomp = 24, RULE_pmo = 25, RULE_mde = 26, RULE_boolop = 27, 
		RULE_booleen = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"ugk", "imports", "programme", "algorithme", "fonction", "funcdecargs", 
			"algofoncblock", "block", "instruction", "retourne", "assignation", "si", 
			"tantque", "pour", "appelfonc", "foncargs", "declaration", "type", "primitive", 
			"expr", "addsousexpr", "multordivexpr", "boolexpr", "exprres", "multipleexprcomp", 
			"pmo", "mde", "boolop", "booleen"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'importer'", "'<'", "'.ugk'", "'>'", "'algorithme'", "'debut'", 
			"'fin'", "'fonction'", "'('", "')'", "','", "'retourne'", "':='", "'si'", 
			"'alors'", "'sinon'", "'fsi'", "'tant'", "'que'", "'faire'", "'ftant'", 
			"'pour'", "'de'", "'a'", "'fpour'", "'entier'", "'chaine'", "'caractere'", 
			"'double'", "'booleen'", "'flottant'", "'nil'", "'non'", "'-'", "'\\u00B0'", 
			"'+'", "'ou'", "'*'", "'/'", "'mod'", "'quo'", "'et'", "'<='", "'>='", 
			"'!='", "'='", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "STRING", "INTEGER", "DOUBLE", "FLOAT", "FILENAME", "IDF", "TYPE", 
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(58);
				imports();
				}
			}

			setState(61);
			programme();
			setState(62);
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
		public List<TerminalNode> FILENAME() { return getTokens(ugkParser.FILENAME); }
		public TerminalNode FILENAME(int i) {
			return getToken(ugkParser.FILENAME, i);
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
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				match(T__0);
				setState(65);
				match(T__1);
				setState(66);
				match(FILENAME);
				setState(67);
				match(T__2);
				setState(68);
				match(T__3);
				}
				}
				setState(71); 
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
		enterRule(_localctx, 4, RULE_programme);
		int _la;
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(73);
					fonction();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79);
				algorithme();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(80);
					fonction();
					}
					}
					setState(83); 
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
		enterRule(_localctx, 6, RULE_algorithme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__4);
			setState(88);
			match(T__5);
			setState(89);
			algofoncblock();
			setState(90);
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
		public TerminalNode IDF() { return getToken(ugkParser.IDF, 0); }
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
		enterRule(_localctx, 8, RULE_fonction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__7);
			setState(93);
			type();
			setState(94);
			match(IDF);
			setState(95);
			match(T__8);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 36028801246822400L) != 0) {
				{
				setState(96);
				funcdecargs();
				}
			}

			setState(99);
			match(T__9);
			setState(100);
			match(T__5);
			setState(101);
			algofoncblock();
			setState(102);
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
		public List<TerminalNode> IDF() { return getTokens(ugkParser.IDF); }
		public TerminalNode IDF(int i) {
			return getToken(ugkParser.IDF, i);
		}
		public FuncdecargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdecargs; }
	}

	public final FuncdecargsContext funcdecargs() throws RecognitionException {
		FuncdecargsContext _localctx = new FuncdecargsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcdecargs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			type();
			setState(105);
			match(IDF);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(106);
				match(T__10);
				setState(107);
				type();
				setState(108);
				match(IDF);
				}
				}
				setState(114);
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
	}

	public final AlgofoncblockContext algofoncblock() throws RecognitionException {
		AlgofoncblockContext _localctx = new AlgofoncblockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_algofoncblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 54043199760781312L) != 0) {
				{
				{
				setState(115);
				instruction();
				}
				}
				setState(120);
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
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 54043199760781312L) != 0) {
				{
				{
				setState(121);
				instruction();
				}
				}
				setState(126);
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
		enterRule(_localctx, 16, RULE_instruction);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				assignation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				si();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				tantque();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				appelfonc();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				pour();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(133);
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
		enterRule(_localctx, 18, RULE_retourne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__11);
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(137);
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
		public TerminalNode IDF() { return getToken(ugkParser.IDF, 0); }
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
		enterRule(_localctx, 20, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(IDF);
			setState(141);
			match(T__12);
			setState(142);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__13);
			setState(145);
			expr();
			setState(146);
			match(T__14);
			setState(147);
			block();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(148);
				match(T__15);
				setState(149);
				block();
				}
			}

			setState(152);
			match(T__16);
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
		enterRule(_localctx, 24, RULE_tantque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__17);
			setState(155);
			match(T__18);
			setState(156);
			expr();
			setState(157);
			match(T__19);
			setState(158);
			block();
			setState(159);
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
		public TerminalNode IDF() { return getToken(ugkParser.IDF, 0); }
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
		enterRule(_localctx, 26, RULE_pour);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__21);
			setState(162);
			match(IDF);
			setState(163);
			match(T__22);
			setState(164);
			expr();
			setState(165);
			match(T__23);
			setState(166);
			expr();
			setState(167);
			match(T__19);
			setState(168);
			block();
			setState(169);
			match(T__24);
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
		public TerminalNode IDF() { return getToken(ugkParser.IDF, 0); }
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
		enterRule(_localctx, 28, RULE_appelfonc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(IDF);
			setState(172);
			match(T__8);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 26880924700377600L) != 0) {
				{
				setState(173);
				foncargs();
				}
			}

			setState(176);
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
		enterRule(_localctx, 30, RULE_foncargs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			expr();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(179);
				match(T__10);
				setState(180);
				expr();
				}
				}
				setState(185);
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
		public TerminalNode IDF() { return getToken(ugkParser.IDF, 0); }
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
		enterRule(_localctx, 32, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			type();
			setState(187);
			match(IDF);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(188);
				match(T__12);
				setState(189);
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
		enterRule(_localctx, 34, RULE_type);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				primitive();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
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
		enterRule(_localctx, 36, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4227858432L) != 0) ) {
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
		enterRule(_localctx, 38, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
		enterRule(_localctx, 40, RULE_addsousexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			multordivexpr();
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(201);
				pmo();
				setState(202);
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
		enterRule(_localctx, 42, RULE_multordivexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			boolexpr();
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(207);
				mde();
				setState(208);
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
		enterRule(_localctx, 44, RULE_boolexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			exprres();
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(213);
				boolop();
				setState(214);
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
		public TerminalNode IDF() { return getToken(ugkParser.IDF, 0); }
		public ExprresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprres; }
	}

	public final ExprresContext exprres() throws RecognitionException {
		ExprresContext _localctx = new ExprresContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exprres);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				appelfonc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(T__31);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(T__8);
				setState(221);
				expr();
				setState(222);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(T__32);
				setState(225);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				match(T__33);
				setState(227);
				exprres();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(228);
				multipleexprcomp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(229);
				match(FLOAT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(230);
				match(DOUBLE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(231);
				match(INTEGER);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(232);
				match(STRING);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(233);
				booleen();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(234);
				match(IDF);
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
		enterRule(_localctx, 48, RULE_multipleexprcomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__34);
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(238);
				foncargs();
				}
				break;
			}
			setState(241);
			match(T__34);
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
		enterRule(_localctx, 50, RULE_pmo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 223338299392L) != 0) ) {
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
		enterRule(_localctx, 52, RULE_mde);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8521215115264L) != 0) ) {
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
		enterRule(_localctx, 54, RULE_boolop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333140L) != 0) ) {
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
		enterRule(_localctx, 56, RULE_booleen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !(_la==T__46 || _la==T__47) ) {
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
		"\u0004\u00018\u00fc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0003\u0000<\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001F\b\u0001\u000b\u0001\f\u0001G\u0001\u0002\u0005"+
		"\u0002K\b\u0002\n\u0002\f\u0002N\t\u0002\u0001\u0002\u0001\u0002\u0004"+
		"\u0002R\b\u0002\u000b\u0002\f\u0002S\u0003\u0002V\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004b\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005o\b\u0005"+
		"\n\u0005\f\u0005r\t\u0005\u0001\u0006\u0005\u0006u\b\u0006\n\u0006\f\u0006"+
		"x\t\u0006\u0001\u0007\u0005\u0007{\b\u0007\n\u0007\f\u0007~\t\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0087\b\b\u0001"+
		"\t\u0001\t\u0003\t\u008b\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0097\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00af\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00b6\b\u000f\n\u000f\f\u000f\u00b9\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00bf\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00c3\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00cd\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u00d3\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u00d9\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u00ec\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u00f0"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0000"+
		"\u0000\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0005\u0001\u0000\u001a\u001f"+
		"\u0002\u0000\"\"$%\u0001\u0000&*\u0003\u0000\u0002\u0002\u0004\u0004+"+
		".\u0001\u0000/0\u0102\u0000;\u0001\u0000\u0000\u0000\u0002E\u0001\u0000"+
		"\u0000\u0000\u0004U\u0001\u0000\u0000\u0000\u0006W\u0001\u0000\u0000\u0000"+
		"\b\\\u0001\u0000\u0000\u0000\nh\u0001\u0000\u0000\u0000\fv\u0001\u0000"+
		"\u0000\u0000\u000e|\u0001\u0000\u0000\u0000\u0010\u0086\u0001\u0000\u0000"+
		"\u0000\u0012\u0088\u0001\u0000\u0000\u0000\u0014\u008c\u0001\u0000\u0000"+
		"\u0000\u0016\u0090\u0001\u0000\u0000\u0000\u0018\u009a\u0001\u0000\u0000"+
		"\u0000\u001a\u00a1\u0001\u0000\u0000\u0000\u001c\u00ab\u0001\u0000\u0000"+
		"\u0000\u001e\u00b2\u0001\u0000\u0000\u0000 \u00ba\u0001\u0000\u0000\u0000"+
		"\"\u00c2\u0001\u0000\u0000\u0000$\u00c4\u0001\u0000\u0000\u0000&\u00c6"+
		"\u0001\u0000\u0000\u0000(\u00c8\u0001\u0000\u0000\u0000*\u00ce\u0001\u0000"+
		"\u0000\u0000,\u00d4\u0001\u0000\u0000\u0000.\u00eb\u0001\u0000\u0000\u0000"+
		"0\u00ed\u0001\u0000\u0000\u00002\u00f3\u0001\u0000\u0000\u00004\u00f5"+
		"\u0001\u0000\u0000\u00006\u00f7\u0001\u0000\u0000\u00008\u00f9\u0001\u0000"+
		"\u0000\u0000:<\u0003\u0002\u0001\u0000;:\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0003\u0004\u0002\u0000"+
		">?\u0005\u0000\u0000\u0001?\u0001\u0001\u0000\u0000\u0000@A\u0005\u0001"+
		"\u0000\u0000AB\u0005\u0002\u0000\u0000BC\u00055\u0000\u0000CD\u0005\u0003"+
		"\u0000\u0000DF\u0005\u0004\u0000\u0000E@\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"H\u0003\u0001\u0000\u0000\u0000IK\u0003\b\u0004\u0000JI\u0001\u0000\u0000"+
		"\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MO\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OV\u0003"+
		"\u0006\u0003\u0000PR\u0003\b\u0004\u0000QP\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TV\u0001\u0000\u0000\u0000UL\u0001\u0000\u0000\u0000UQ\u0001\u0000\u0000"+
		"\u0000V\u0005\u0001\u0000\u0000\u0000WX\u0005\u0005\u0000\u0000XY\u0005"+
		"\u0006\u0000\u0000YZ\u0003\f\u0006\u0000Z[\u0005\u0007\u0000\u0000[\u0007"+
		"\u0001\u0000\u0000\u0000\\]\u0005\b\u0000\u0000]^\u0003\"\u0011\u0000"+
		"^_\u00056\u0000\u0000_a\u0005\t\u0000\u0000`b\u0003\n\u0005\u0000a`\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"cd\u0005\n\u0000\u0000de\u0005\u0006\u0000\u0000ef\u0003\f\u0006\u0000"+
		"fg\u0005\u0007\u0000\u0000g\t\u0001\u0000\u0000\u0000hi\u0003\"\u0011"+
		"\u0000ip\u00056\u0000\u0000jk\u0005\u000b\u0000\u0000kl\u0003\"\u0011"+
		"\u0000lm\u00056\u0000\u0000mo\u0001\u0000\u0000\u0000nj\u0001\u0000\u0000"+
		"\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000q\u000b\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"su\u0003\u0010\b\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\r\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000y{\u0003\u0010\b\u0000zy\u0001\u0000\u0000"+
		"\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}\u000f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"\u007f\u0087\u0003 \u0010\u0000\u0080\u0087\u0003\u0014\n\u0000\u0081"+
		"\u0087\u0003\u0016\u000b\u0000\u0082\u0087\u0003\u0018\f\u0000\u0083\u0087"+
		"\u0003\u001c\u000e\u0000\u0084\u0087\u0003\u001a\r\u0000\u0085\u0087\u0003"+
		"\u0012\t\u0000\u0086\u007f\u0001\u0000\u0000\u0000\u0086\u0080\u0001\u0000"+
		"\u0000\u0000\u0086\u0081\u0001\u0000\u0000\u0000\u0086\u0082\u0001\u0000"+
		"\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0011\u0001\u0000"+
		"\u0000\u0000\u0088\u008a\u0005\f\u0000\u0000\u0089\u008b\u0003&\u0013"+
		"\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u0013\u0001\u0000\u0000\u0000\u008c\u008d\u00056\u0000\u0000"+
		"\u008d\u008e\u0005\r\u0000\u0000\u008e\u008f\u0003&\u0013\u0000\u008f"+
		"\u0015\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u000e\u0000\u0000\u0091"+
		"\u0092\u0003&\u0013\u0000\u0092\u0093\u0005\u000f\u0000\u0000\u0093\u0096"+
		"\u0003\u000e\u0007\u0000\u0094\u0095\u0005\u0010\u0000\u0000\u0095\u0097"+
		"\u0003\u000e\u0007\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0005\u0011\u0000\u0000\u0099\u0017\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0005\u0012\u0000\u0000\u009b\u009c\u0005\u0013\u0000\u0000\u009c\u009d"+
		"\u0003&\u0013\u0000\u009d\u009e\u0005\u0014\u0000\u0000\u009e\u009f\u0003"+
		"\u000e\u0007\u0000\u009f\u00a0\u0005\u0015\u0000\u0000\u00a0\u0019\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0005\u0016\u0000\u0000\u00a2\u00a3\u0005"+
		"6\u0000\u0000\u00a3\u00a4\u0005\u0017\u0000\u0000\u00a4\u00a5\u0003&\u0013"+
		"\u0000\u00a5\u00a6\u0005\u0018\u0000\u0000\u00a6\u00a7\u0003&\u0013\u0000"+
		"\u00a7\u00a8\u0005\u0014\u0000\u0000\u00a8\u00a9\u0003\u000e\u0007\u0000"+
		"\u00a9\u00aa\u0005\u0019\u0000\u0000\u00aa\u001b\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u00056\u0000\u0000\u00ac\u00ae\u0005\t\u0000\u0000\u00ad"+
		"\u00af\u0003\u001e\u000f\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0005\n\u0000\u0000\u00b1\u001d\u0001\u0000\u0000\u0000\u00b2\u00b7"+
		"\u0003&\u0013\u0000\u00b3\u00b4\u0005\u000b\u0000\u0000\u00b4\u00b6\u0003"+
		"&\u0013\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u001f\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0003\"\u0011\u0000\u00bb\u00be\u00056\u0000"+
		"\u0000\u00bc\u00bd\u0005\r\u0000\u0000\u00bd\u00bf\u0003&\u0013\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bf!\u0001\u0000\u0000\u0000\u00c0\u00c3\u0003$\u0012\u0000\u00c1\u00c3"+
		"\u00057\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c3#\u0001\u0000\u0000\u0000\u00c4\u00c5\u0007\u0000"+
		"\u0000\u0000\u00c5%\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003(\u0014\u0000"+
		"\u00c7\'\u0001\u0000\u0000\u0000\u00c8\u00cc\u0003*\u0015\u0000\u00c9"+
		"\u00ca\u00032\u0019\u0000\u00ca\u00cb\u0003&\u0013\u0000\u00cb\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cd)\u0001\u0000\u0000\u0000\u00ce\u00d2\u0003,\u0016"+
		"\u0000\u00cf\u00d0\u00034\u001a\u0000\u00d0\u00d1\u0003&\u0013\u0000\u00d1"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d2\u00cf\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d3+\u0001\u0000\u0000\u0000\u00d4\u00d8"+
		"\u0003.\u0017\u0000\u00d5\u00d6\u00036\u001b\u0000\u00d6\u00d7\u0003&"+
		"\u0013\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9-\u0001\u0000\u0000"+
		"\u0000\u00da\u00ec\u0003\u001c\u000e\u0000\u00db\u00ec\u0005 \u0000\u0000"+
		"\u00dc\u00dd\u0005\t\u0000\u0000\u00dd\u00de\u0003&\u0013\u0000\u00de"+
		"\u00df\u0005\n\u0000\u0000\u00df\u00ec\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0005!\u0000\u0000\u00e1\u00ec\u0003&\u0013\u0000\u00e2\u00e3\u0005\""+
		"\u0000\u0000\u00e3\u00ec\u0003.\u0017\u0000\u00e4\u00ec\u00030\u0018\u0000"+
		"\u00e5\u00ec\u00054\u0000\u0000\u00e6\u00ec\u00053\u0000\u0000\u00e7\u00ec"+
		"\u00052\u0000\u0000\u00e8\u00ec\u00051\u0000\u0000\u00e9\u00ec\u00038"+
		"\u001c\u0000\u00ea\u00ec\u00056\u0000\u0000\u00eb\u00da\u0001\u0000\u0000"+
		"\u0000\u00eb\u00db\u0001\u0000\u0000\u0000\u00eb\u00dc\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e0\u0001\u0000\u0000\u0000\u00eb\u00e2\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e4\u0001\u0000\u0000\u0000\u00eb\u00e5\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e6\u0001\u0000\u0000\u0000\u00eb\u00e7\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e8\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec/\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ef\u0005#\u0000\u0000\u00ee\u00f0\u0003\u001e\u000f\u0000\u00ef"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005#\u0000\u0000\u00f21\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0007\u0001\u0000\u0000\u00f43\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0007\u0002\u0000\u0000\u00f65\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0007\u0003\u0000\u0000\u00f87\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0007\u0004\u0000\u0000\u00fa9\u0001\u0000\u0000\u0000\u0015"+
		";GLSUapv|\u0086\u008a\u0096\u00ae\u00b7\u00be\u00c2\u00cc\u00d2\u00d8"+
		"\u00eb\u00ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}