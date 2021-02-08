package at.ac.tuwien.big.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import at.ac.tuwien.big.services.SbsmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSbsmlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_BOOL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'{'", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_BOOL=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__15=15;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_FLOAT=5;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSbsmlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSbsmlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSbsmlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSbsml.g"; }


    	private SbsmlGrammarAccess grammarAccess;

    	public void setGrammarAccess(SbsmlGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSmartSystem"
    // InternalSbsml.g:53:1: entryRuleSmartSystem : ruleSmartSystem EOF ;
    public final void entryRuleSmartSystem() throws RecognitionException {
        try {
            // InternalSbsml.g:54:1: ( ruleSmartSystem EOF )
            // InternalSbsml.g:55:1: ruleSmartSystem EOF
            {
             before(grammarAccess.getSmartSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSmartSystem();

            state._fsp--;

             after(grammarAccess.getSmartSystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSmartSystem"


    // $ANTLR start "ruleSmartSystem"
    // InternalSbsml.g:62:1: ruleSmartSystem : ( ( rule__SmartSystem__Group__0 ) ) ;
    public final void ruleSmartSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSbsml.g:66:2: ( ( ( rule__SmartSystem__Group__0 ) ) )
            // InternalSbsml.g:67:2: ( ( rule__SmartSystem__Group__0 ) )
            {
            // InternalSbsml.g:67:2: ( ( rule__SmartSystem__Group__0 ) )
            // InternalSbsml.g:68:3: ( rule__SmartSystem__Group__0 )
            {
             before(grammarAccess.getSmartSystemAccess().getGroup()); 
            // InternalSbsml.g:69:3: ( rule__SmartSystem__Group__0 )
            // InternalSbsml.g:69:4: rule__SmartSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SmartSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmartSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSmartSystem"


    // $ANTLR start "rule__SmartSystem__Group__0"
    // InternalSbsml.g:77:1: rule__SmartSystem__Group__0 : rule__SmartSystem__Group__0__Impl rule__SmartSystem__Group__1 ;
    public final void rule__SmartSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSbsml.g:81:1: ( rule__SmartSystem__Group__0__Impl rule__SmartSystem__Group__1 )
            // InternalSbsml.g:82:2: rule__SmartSystem__Group__0__Impl rule__SmartSystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SmartSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartSystem__Group__0"


    // $ANTLR start "rule__SmartSystem__Group__0__Impl"
    // InternalSbsml.g:89:1: rule__SmartSystem__Group__0__Impl : ( 'system' ) ;
    public final void rule__SmartSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSbsml.g:93:1: ( ( 'system' ) )
            // InternalSbsml.g:94:1: ( 'system' )
            {
            // InternalSbsml.g:94:1: ( 'system' )
            // InternalSbsml.g:95:2: 'system'
            {
             before(grammarAccess.getSmartSystemAccess().getSystemKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSmartSystemAccess().getSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartSystem__Group__0__Impl"


    // $ANTLR start "rule__SmartSystem__Group__1"
    // InternalSbsml.g:104:1: rule__SmartSystem__Group__1 : rule__SmartSystem__Group__1__Impl rule__SmartSystem__Group__2 ;
    public final void rule__SmartSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSbsml.g:108:1: ( rule__SmartSystem__Group__1__Impl rule__SmartSystem__Group__2 )
            // InternalSbsml.g:109:2: rule__SmartSystem__Group__1__Impl rule__SmartSystem__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SmartSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartSystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartSystem__Group__1"


    // $ANTLR start "rule__SmartSystem__Group__1__Impl"
    // InternalSbsml.g:116:1: rule__SmartSystem__Group__1__Impl : ( ( rule__SmartSystem__NameAssignment_1 ) ) ;
    public final void rule__SmartSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSbsml.g:120:1: ( ( ( rule__SmartSystem__NameAssignment_1 ) ) )
            // InternalSbsml.g:121:1: ( ( rule__SmartSystem__NameAssignment_1 ) )
            {
            // InternalSbsml.g:121:1: ( ( rule__SmartSystem__NameAssignment_1 ) )
            // InternalSbsml.g:122:2: ( rule__SmartSystem__NameAssignment_1 )
            {
             before(grammarAccess.getSmartSystemAccess().getNameAssignment_1()); 
            // InternalSbsml.g:123:2: ( rule__SmartSystem__NameAssignment_1 )
            // InternalSbsml.g:123:3: rule__SmartSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SmartSystem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSmartSystemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartSystem__Group__1__Impl"


    // $ANTLR start "rule__SmartSystem__Group__2"
    // InternalSbsml.g:131:1: rule__SmartSystem__Group__2 : rule__SmartSystem__Group__2__Impl rule__SmartSystem__Group__3 ;
    public final void rule__SmartSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSbsml.g:135:1: ( rule__SmartSystem__Group__2__Impl rule__SmartSystem__Group__3 )
            // InternalSbsml.g:136:2: rule__SmartSystem__Group__2__Impl rule__SmartSystem__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SmartSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartSystem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartSystem__Group__2"


    // $ANTLR start "rule__SmartSystem__Group__2__Impl"
    // InternalSbsml.g:143:1: rule__SmartSystem__Group__2__Impl : ( '{' ) ;
    public final void rule__SmartSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSbsml.g:147:1: ( ( '{' ) )
            // InternalSbsml.g:148:1: ( '{' )
            {
            // InternalSbsml.g:148:1: ( '{' )
            // InternalSbsml.g:149:2: '{'
            {
             before(grammarAccess.getSmartSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSmartSystemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartSystem__Group__2__Impl"


    // $ANTLR start "rule__SmartSystem__Group__3"
    // InternalSbsml.g:158:1: rule__SmartSystem__Group__3 : rule__SmartSystem__Group__3__Impl ;
    public final void rule__SmartSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSbsml.g:162:1: ( rule__SmartSystem__Group__3__Impl )
            // InternalSbsml.g:163:2: rule__SmartSystem__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartSystem__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartSystem__Group__3"


    // $ANTLR start "rule__SmartSystem__Group__3__Impl"
    // InternalSbsml.g:169:1: rule__SmartSystem__Group__3__Impl : ( '}' ) ;
    public final void rule__SmartSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSbsml.g:173:1: ( ( '}' ) )
            // InternalSbsml.g:174:1: ( '}' )
            {
            // InternalSbsml.g:174:1: ( '}' )
            // InternalSbsml.g:175:2: '}'
            {
             before(grammarAccess.getSmartSystemAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSmartSystemAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartSystem__Group__3__Impl"


    // $ANTLR start "rule__SmartSystem__NameAssignment_1"
    // InternalSbsml.g:185:1: rule__SmartSystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SmartSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSbsml.g:189:1: ( ( RULE_ID ) )
            // InternalSbsml.g:190:2: ( RULE_ID )
            {
            // InternalSbsml.g:190:2: ( RULE_ID )
            // InternalSbsml.g:191:3: RULE_ID
            {
             before(grammarAccess.getSmartSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSmartSystemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartSystem__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});

}