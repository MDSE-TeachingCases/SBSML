package at.ac.tuwien.big.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSbsmlLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_BOOL=8;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalSbsmlLexer() {;} 
    public InternalSbsmlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSbsmlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSbsml.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:11:7: ( 'system' )
            // InternalSbsml.g:11:9: 'system'
            {
            match("system"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:12:7: ( '{' )
            // InternalSbsml.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:13:7: ( 'units' )
            // InternalSbsml.g:13:9: 'units'
            {
            match("units"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:14:7: ( ',' )
            // InternalSbsml.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:15:7: ( '}' )
            // InternalSbsml.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:16:7: ( '(' )
            // InternalSbsml.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:17:7: ( ')' )
            // InternalSbsml.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:18:7: ( ':' )
            // InternalSbsml.g:18:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:19:7: ( 'single' )
            // InternalSbsml.g:19:9: 'single'
            {
            match("single"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:20:7: ( 'port' )
            // InternalSbsml.g:20:9: 'port'
            {
            match("port"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:21:7: ( 'sensor' )
            // InternalSbsml.g:21:9: 'sensor'
            {
            match("sensor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:22:7: ( 'param' )
            // InternalSbsml.g:22:9: 'param'
            {
            match("param"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:23:7: ( 'actuator' )
            // InternalSbsml.g:23:9: 'actuator'
            {
            match("actuator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:24:7: ( 'service' )
            // InternalSbsml.g:24:9: 'service'
            {
            match("service"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:25:7: ( '--' )
            // InternalSbsml.g:25:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:26:7: ( 'fogdevice' )
            // InternalSbsml.g:26:9: 'fogdevice'
            {
            match("fogdevice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:27:7: ( 'mips' )
            // InternalSbsml.g:27:9: 'mips'
            {
            match("mips"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:28:7: ( 'config' )
            // InternalSbsml.g:28:9: 'config'
            {
            match("config"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:29:7: ( 'connections' )
            // InternalSbsml.g:29:9: 'connections'
            {
            match("connections"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:30:7: ( 'node' )
            // InternalSbsml.g:30:9: 'node'
            {
            match("node"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:31:7: ( '.' )
            // InternalSbsml.g:31:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:32:7: ( '>-<' )
            // InternalSbsml.g:32:9: '>-<'
            {
            match(">-<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:33:7: ( 'controller' )
            // InternalSbsml.g:33:9: 'controller'
            {
            match("controller"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:34:7: ( 'computed' )
            // InternalSbsml.g:34:9: 'computed'
            {
            match("computed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:35:7: ( 'on' )
            // InternalSbsml.g:35:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:36:7: ( 'call' )
            // InternalSbsml.g:36:9: 'call'
            {
            match("call"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:37:7: ( ';' )
            // InternalSbsml.g:37:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:38:7: ( 'IntThreshold' )
            // InternalSbsml.g:38:9: 'IntThreshold'
            {
            match("IntThreshold"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:39:7: ( 'FloatThreshold' )
            // InternalSbsml.g:39:9: 'FloatThreshold'
            {
            match("FloatThreshold"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:40:7: ( 'BoolThreshold' )
            // InternalSbsml.g:40:9: 'BoolThreshold'
            {
            match("BoolThreshold"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:41:7: ( '=' )
            // InternalSbsml.g:41:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:42:7: ( 'int' )
            // InternalSbsml.g:42:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:43:7: ( 'float' )
            // InternalSbsml.g:43:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:44:7: ( 'bool' )
            // InternalSbsml.g:44:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:45:7: ( '>' )
            // InternalSbsml.g:45:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:46:7: ( '<' )
            // InternalSbsml.g:46:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:2059:12: ( ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )+ ( ( 'E' | 'e' ) ( '-' )? ( '0' .. '9' )+ )? )
            // InternalSbsml.g:2059:14: ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )+ ( ( 'E' | 'e' ) ( '-' )? ( '0' .. '9' )+ )?
            {
            // InternalSbsml.g:2059:14: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSbsml.g:2059:14: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalSbsml.g:2059:19: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSbsml.g:2059:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('.'); 
            // InternalSbsml.g:2059:35: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSbsml.g:2059:36: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalSbsml.g:2059:47: ( ( 'E' | 'e' ) ( '-' )? ( '0' .. '9' )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='E'||LA6_0=='e') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSbsml.g:2059:48: ( 'E' | 'e' ) ( '-' )? ( '0' .. '9' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalSbsml.g:2059:58: ( '-' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='-') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalSbsml.g:2059:58: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // InternalSbsml.g:2059:63: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSbsml.g:2059:64: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:2061:11: ( ( 'true' | 'false' ) )
            // InternalSbsml.g:2061:13: ( 'true' | 'false' )
            {
            // InternalSbsml.g:2061:13: ( 'true' | 'false' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='t') ) {
                alt7=1;
            }
            else if ( (LA7_0=='f') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSbsml.g:2061:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalSbsml.g:2061:21: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:2063:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSbsml.g:2063:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSbsml.g:2063:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSbsml.g:2063:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSbsml.g:2063:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSbsml.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:2065:10: ( ( '0' .. '9' )+ )
            // InternalSbsml.g:2065:12: ( '0' .. '9' )+
            {
            // InternalSbsml.g:2065:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSbsml.g:2065:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:2067:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSbsml.g:2067:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSbsml.g:2067:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSbsml.g:2067:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSbsml.g:2067:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSbsml.g:2067:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSbsml.g:2067:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSbsml.g:2067:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSbsml.g:2067:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSbsml.g:2067:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSbsml.g:2067:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:2069:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSbsml.g:2069:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSbsml.g:2069:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSbsml.g:2069:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:2071:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSbsml.g:2071:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSbsml.g:2071:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSbsml.g:2071:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalSbsml.g:2071:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSbsml.g:2071:41: ( '\\r' )? '\\n'
                    {
                    // InternalSbsml.g:2071:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalSbsml.g:2071:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:2073:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSbsml.g:2073:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSbsml.g:2073:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSbsml.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:2075:16: ( . )
            // InternalSbsml.g:2075:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSbsml.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | RULE_FLOAT | RULE_BOOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=45;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalSbsml.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalSbsml.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalSbsml.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalSbsml.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalSbsml.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalSbsml.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalSbsml.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalSbsml.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalSbsml.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalSbsml.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalSbsml.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalSbsml.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalSbsml.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalSbsml.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalSbsml.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalSbsml.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalSbsml.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalSbsml.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalSbsml.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalSbsml.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalSbsml.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalSbsml.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalSbsml.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalSbsml.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalSbsml.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalSbsml.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalSbsml.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalSbsml.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalSbsml.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalSbsml.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalSbsml.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalSbsml.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalSbsml.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalSbsml.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalSbsml.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalSbsml.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalSbsml.g:1:226: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 38 :
                // InternalSbsml.g:1:237: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 39 :
                // InternalSbsml.g:1:247: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 40 :
                // InternalSbsml.g:1:255: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 41 :
                // InternalSbsml.g:1:264: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 42 :
                // InternalSbsml.g:1:276: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 43 :
                // InternalSbsml.g:1:292: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 44 :
                // InternalSbsml.g:1:308: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 45 :
                // InternalSbsml.g:1:316: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\1\47\1\uffff\1\47\5\uffff\2\47\1\43\4\47\1\73\1\75\1\47\1\uffff\3\47\1\uffff\2\47\1\uffff\1\107\1\47\1\43\1\uffff\3\43\2\uffff\3\47\2\uffff\1\47\5\uffff\3\47\2\uffff\7\47\3\uffff\1\136\1\uffff\3\47\1\uffff\2\47\2\uffff\1\107\1\47\4\uffff\20\47\1\uffff\3\47\1\172\7\47\1\u0082\5\47\1\u0088\4\47\1\u008d\1\u008e\3\47\1\uffff\1\u0092\1\u0093\4\47\1\u0098\1\uffff\1\u0099\2\47\1\u009c\1\u0093\1\uffff\4\47\2\uffff\3\47\2\uffff\1\u00a4\1\u00a5\1\u00a6\1\47\2\uffff\2\47\1\uffff\1\u00aa\6\47\3\uffff\1\u00b1\2\47\1\uffff\6\47\1\uffff\1\u00ba\3\47\1\u00be\3\47\1\uffff\1\u00c2\2\47\1\uffff\3\47\1\uffff\1\47\1\u00c9\3\47\1\u00cd\1\uffff\3\47\1\uffff\1\u00d1\2\47\1\uffff\1\47\1\u00d5\1\u00d6\2\uffff";
    static final String DFA19_eofS =
        "\u00d7\uffff";
    static final String DFA19_minS =
        "\1\0\1\145\1\uffff\1\156\5\uffff\1\141\1\143\1\55\1\141\1\151\1\141\1\157\1\60\1\55\1\156\1\uffff\1\156\1\154\1\157\1\uffff\1\156\1\157\1\uffff\1\56\1\162\1\101\1\uffff\2\0\1\52\2\uffff\1\163\2\156\2\uffff\1\151\5\uffff\2\162\1\164\2\uffff\1\147\1\157\1\154\1\160\1\155\1\154\1\144\3\uffff\1\60\1\uffff\1\164\2\157\1\uffff\1\164\1\157\2\uffff\1\56\1\165\4\uffff\1\164\1\147\1\163\1\166\2\164\1\141\1\165\1\144\1\141\2\163\1\146\1\160\1\154\1\145\1\uffff\1\124\1\141\1\154\1\60\1\154\2\145\1\154\1\157\1\151\1\163\1\60\1\155\1\141\1\145\1\164\1\145\1\60\1\151\1\145\1\162\1\165\2\60\1\150\1\164\1\124\1\uffff\2\60\1\155\1\145\1\162\1\143\1\60\1\uffff\1\60\1\164\1\166\2\60\1\uffff\1\147\1\143\1\157\1\164\2\uffff\1\162\1\124\1\150\2\uffff\3\60\1\145\2\uffff\1\157\1\151\1\uffff\1\60\1\164\1\154\2\145\1\150\1\162\3\uffff\1\60\1\162\1\143\1\uffff\1\151\1\154\1\144\1\163\1\162\1\145\1\uffff\1\60\1\145\1\157\1\145\1\60\1\150\1\145\1\163\1\uffff\1\60\1\156\1\162\1\uffff\1\157\1\163\1\150\1\uffff\1\163\1\60\1\154\1\150\1\157\1\60\1\uffff\1\144\1\157\1\154\1\uffff\1\60\1\154\1\144\1\uffff\1\144\2\60\2\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\171\1\uffff\1\156\5\uffff\1\157\1\143\1\71\1\157\1\151\2\157\1\71\1\55\1\156\1\uffff\1\156\1\154\1\157\1\uffff\1\156\1\157\1\uffff\1\71\1\162\1\172\1\uffff\2\uffff\1\57\2\uffff\1\163\1\156\1\162\2\uffff\1\151\5\uffff\2\162\1\164\2\uffff\1\147\1\157\1\154\1\160\1\156\1\154\1\144\3\uffff\1\172\1\uffff\1\164\2\157\1\uffff\1\164\1\157\2\uffff\1\71\1\165\4\uffff\1\164\1\147\1\163\1\166\2\164\1\141\1\165\1\144\1\141\2\163\1\164\1\160\1\154\1\145\1\uffff\1\124\1\141\1\154\1\172\1\154\2\145\1\154\1\157\1\151\1\163\1\172\1\155\1\141\1\145\1\164\1\145\1\172\1\151\1\145\1\162\1\165\2\172\1\150\1\164\1\124\1\uffff\2\172\1\155\1\145\1\162\1\143\1\172\1\uffff\1\172\1\164\1\166\2\172\1\uffff\1\147\1\143\1\157\1\164\2\uffff\1\162\1\124\1\150\2\uffff\3\172\1\145\2\uffff\1\157\1\151\1\uffff\1\172\1\164\1\154\2\145\1\150\1\162\3\uffff\1\172\1\162\1\143\1\uffff\1\151\1\154\1\144\1\163\1\162\1\145\1\uffff\1\172\1\145\1\157\1\145\1\172\1\150\1\145\1\163\1\uffff\1\172\1\156\1\162\1\uffff\1\157\1\163\1\150\1\uffff\1\163\1\172\1\154\1\150\1\157\1\172\1\uffff\1\144\1\157\1\154\1\uffff\1\172\1\154\1\144\1\uffff\1\144\2\172\2\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\12\uffff\1\33\3\uffff\1\37\2\uffff\1\44\3\uffff\1\47\3\uffff\1\54\1\55\3\uffff\1\47\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\3\uffff\1\17\1\45\7\uffff\1\25\1\26\1\43\1\uffff\1\33\3\uffff\1\37\2\uffff\1\44\1\50\2\uffff\1\51\1\52\1\53\1\54\20\uffff\1\31\33\uffff\1\40\7\uffff\1\12\5\uffff\1\21\4\uffff\1\32\1\24\3\uffff\1\42\1\46\4\uffff\1\3\1\14\2\uffff\1\41\7\uffff\1\1\1\11\1\13\3\uffff\1\22\6\uffff\1\16\10\uffff\1\15\3\uffff\1\30\3\uffff\1\20\6\uffff\1\27\3\uffff\1\23\3\uffff\1\34\3\uffff\1\36\1\35";
    static final String DFA19_specialS =
        "\1\2\36\uffff\1\0\1\1\u00b6\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\43\1\37\4\43\1\40\1\6\1\7\2\43\1\4\1\13\1\20\1\41\12\33\1\10\1\23\1\32\1\27\1\21\2\43\1\36\1\26\3\36\1\25\2\36\1\24\21\36\3\43\1\35\1\36\1\43\1\12\1\31\1\16\2\36\1\14\2\36\1\30\3\36\1\15\1\17\1\22\1\11\2\36\1\1\1\34\1\3\5\36\1\2\1\43\1\5\uff82\43",
            "\1\46\3\uffff\1\45\17\uffff\1\44",
            "",
            "\1\51",
            "",
            "",
            "",
            "",
            "",
            "\1\60\15\uffff\1\57",
            "\1\61",
            "\1\62\1\63\1\uffff\12\63",
            "\1\66\12\uffff\1\65\2\uffff\1\64",
            "\1\67",
            "\1\71\15\uffff\1\70",
            "\1\72",
            "\12\63",
            "\1\74",
            "\1\76",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "\1\104",
            "\1\105",
            "",
            "\1\63\1\uffff\12\110",
            "\1\111",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\0\112",
            "\0\112",
            "\1\113\4\uffff\1\114",
            "",
            "",
            "\1\116",
            "\1\117",
            "\1\120\3\uffff\1\121",
            "",
            "",
            "\1\122",
            "",
            "",
            "",
            "",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\133\1\132",
            "\1\134",
            "\1\135",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "",
            "",
            "\1\63\1\uffff\12\110",
            "\1\144",
            "",
            "",
            "",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161\7\uffff\1\162\5\uffff\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u009a",
            "\1\u009b",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00a7",
            "",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "\1\u00c8",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\1\u00d4",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | RULE_FLOAT | RULE_BOOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_31 = input.LA(1);

                        s = -1;
                        if ( ((LA19_31>='\u0000' && LA19_31<='\uFFFF')) ) {s = 74;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_32 = input.LA(1);

                        s = -1;
                        if ( ((LA19_32>='\u0000' && LA19_32<='\uFFFF')) ) {s = 74;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='s') ) {s = 1;}

                        else if ( (LA19_0=='{') ) {s = 2;}

                        else if ( (LA19_0=='u') ) {s = 3;}

                        else if ( (LA19_0==',') ) {s = 4;}

                        else if ( (LA19_0=='}') ) {s = 5;}

                        else if ( (LA19_0=='(') ) {s = 6;}

                        else if ( (LA19_0==')') ) {s = 7;}

                        else if ( (LA19_0==':') ) {s = 8;}

                        else if ( (LA19_0=='p') ) {s = 9;}

                        else if ( (LA19_0=='a') ) {s = 10;}

                        else if ( (LA19_0=='-') ) {s = 11;}

                        else if ( (LA19_0=='f') ) {s = 12;}

                        else if ( (LA19_0=='m') ) {s = 13;}

                        else if ( (LA19_0=='c') ) {s = 14;}

                        else if ( (LA19_0=='n') ) {s = 15;}

                        else if ( (LA19_0=='.') ) {s = 16;}

                        else if ( (LA19_0=='>') ) {s = 17;}

                        else if ( (LA19_0=='o') ) {s = 18;}

                        else if ( (LA19_0==';') ) {s = 19;}

                        else if ( (LA19_0=='I') ) {s = 20;}

                        else if ( (LA19_0=='F') ) {s = 21;}

                        else if ( (LA19_0=='B') ) {s = 22;}

                        else if ( (LA19_0=='=') ) {s = 23;}

                        else if ( (LA19_0=='i') ) {s = 24;}

                        else if ( (LA19_0=='b') ) {s = 25;}

                        else if ( (LA19_0=='<') ) {s = 26;}

                        else if ( ((LA19_0>='0' && LA19_0<='9')) ) {s = 27;}

                        else if ( (LA19_0=='t') ) {s = 28;}

                        else if ( (LA19_0=='^') ) {s = 29;}

                        else if ( (LA19_0=='A'||(LA19_0>='C' && LA19_0<='E')||(LA19_0>='G' && LA19_0<='H')||(LA19_0>='J' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='d' && LA19_0<='e')||(LA19_0>='g' && LA19_0<='h')||(LA19_0>='j' && LA19_0<='l')||(LA19_0>='q' && LA19_0<='r')||(LA19_0>='v' && LA19_0<='z')) ) {s = 30;}

                        else if ( (LA19_0=='\"') ) {s = 31;}

                        else if ( (LA19_0=='\'') ) {s = 32;}

                        else if ( (LA19_0=='/') ) {s = 33;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 34;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='!'||(LA19_0>='#' && LA19_0<='&')||(LA19_0>='*' && LA19_0<='+')||(LA19_0>='?' && LA19_0<='@')||(LA19_0>='[' && LA19_0<=']')||LA19_0=='`'||LA19_0=='|'||(LA19_0>='~' && LA19_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}