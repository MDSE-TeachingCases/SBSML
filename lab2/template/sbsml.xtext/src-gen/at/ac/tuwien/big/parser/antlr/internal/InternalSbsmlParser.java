package at.ac.tuwien.big.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.services.SbsmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSbsmlParser extends AbstractInternalAntlrParser {
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

        public InternalSbsmlParser(TokenStream input, SbsmlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SmartSystem";
       	}

       	@Override
       	protected SbsmlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSmartSystem"
    // InternalSbsml.g:65:1: entryRuleSmartSystem returns [EObject current=null] : iv_ruleSmartSystem= ruleSmartSystem EOF ;
    public final EObject entryRuleSmartSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmartSystem = null;


        try {
            // InternalSbsml.g:65:52: (iv_ruleSmartSystem= ruleSmartSystem EOF )
            // InternalSbsml.g:66:2: iv_ruleSmartSystem= ruleSmartSystem EOF
            {
             newCompositeNode(grammarAccess.getSmartSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmartSystem=ruleSmartSystem();

            state._fsp--;

             current =iv_ruleSmartSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmartSystem"


    // $ANTLR start "ruleSmartSystem"
    // InternalSbsml.g:72:1: ruleSmartSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleSmartSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSbsml.g:78:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalSbsml.g:79:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalSbsml.g:79:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalSbsml.g:80:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSmartSystemAccess().getSystemKeyword_0());
            		
            // InternalSbsml.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSbsml.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSbsml.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalSbsml.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSmartSystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSmartSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSmartSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSmartSystemAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmartSystem"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});

}