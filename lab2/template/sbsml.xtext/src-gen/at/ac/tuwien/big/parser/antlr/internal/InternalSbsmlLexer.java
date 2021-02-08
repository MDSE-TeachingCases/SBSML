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
            // InternalSbsml.g:13:7: ( '}' )
            // InternalSbsml.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSbsml.g:113:12: ( ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )+ ( ( 'E' | 'e' ) ( '-' )? ( '0' .. '9' )+ )? )
            // InternalSbsml.g:113:14: ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )+ ( ( 'E' | 'e' ) ( '-' )? ( '0' .. '9' )+ )?
            {
            // InternalSbsml.g:113:14: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSbsml.g:113:14: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalSbsml.g:113:19: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSbsml.g:113:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('.'); 
            // InternalSbsml.g:113:35: ( '0' .. '9' )+
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
            	    // InternalSbsml.g:113:36: '0' .. '9'
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

            // InternalSbsml.g:113:47: ( ( 'E' | 'e' ) ( '-' )? ( '0' .. '9' )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='E'||LA6_0=='e') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSbsml.g:113:48: ( 'E' | 'e' ) ( '-' )? ( '0' .. '9' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalSbsml.g:113:58: ( '-' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='-') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalSbsml.g:113:58: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // InternalSbsml.g:113:63: ( '0' .. '9' )+
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
                    	    // InternalSbsml.g:113:64: '0' .. '9'
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
            // InternalSbsml.g:115:11: ( ( 'true' | 'false' ) )
            // InternalSbsml.g:115:13: ( 'true' | 'false' )
            {
            // InternalSbsml.g:115:13: ( 'true' | 'false' )
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
                    // InternalSbsml.g:115:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalSbsml.g:115:21: 'false'
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
            // InternalSbsml.g:117:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSbsml.g:117:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSbsml.g:117:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSbsml.g:117:11: '^'
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

            // InternalSbsml.g:117:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalSbsml.g:119:10: ( ( '0' .. '9' )+ )
            // InternalSbsml.g:119:12: ( '0' .. '9' )+
            {
            // InternalSbsml.g:119:12: ( '0' .. '9' )+
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
            	    // InternalSbsml.g:119:13: '0' .. '9'
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
            // InternalSbsml.g:121:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSbsml.g:121:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSbsml.g:121:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalSbsml.g:121:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSbsml.g:121:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalSbsml.g:121:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSbsml.g:121:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalSbsml.g:121:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSbsml.g:121:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalSbsml.g:121:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSbsml.g:121:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalSbsml.g:123:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSbsml.g:123:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSbsml.g:123:24: ( options {greedy=false; } : . )*
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
            	    // InternalSbsml.g:123:52: .
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
            // InternalSbsml.g:125:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSbsml.g:125:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSbsml.g:125:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSbsml.g:125:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalSbsml.g:125:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSbsml.g:125:41: ( '\\r' )? '\\n'
                    {
                    // InternalSbsml.g:125:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalSbsml.g:125:41: '\\r'
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
            // InternalSbsml.g:127:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSbsml.g:127:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSbsml.g:127:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalSbsml.g:129:16: ( . )
            // InternalSbsml.g:129:18: .
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
        // InternalSbsml.g:1:8: ( T__13 | T__14 | T__15 | RULE_FLOAT | RULE_BOOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=12;
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
                // InternalSbsml.g:1:28: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 5 :
                // InternalSbsml.g:1:39: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 6 :
                // InternalSbsml.g:1:49: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 7 :
                // InternalSbsml.g:1:57: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 8 :
                // InternalSbsml.g:1:66: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 9 :
                // InternalSbsml.g:1:78: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 10 :
                // InternalSbsml.g:1:94: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 11 :
                // InternalSbsml.g:1:110: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 12 :
                // InternalSbsml.g:1:118: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\1\21\2\uffff\1\17\1\25\1\17\2\21\1\17\1\uffff\3\17\2\uffff\1\21\5\uffff\1\25\2\21\4\uffff\4\21\1\44\2\21\1\uffff\1\44\1\47\1\uffff";
    static final String DFA19_eofS =
        "\50\uffff";
    static final String DFA19_minS =
        "\1\0\1\171\2\uffff\2\56\1\60\1\162\1\141\1\101\1\uffff\2\0\1\52\2\uffff\1\163\5\uffff\1\56\1\165\1\154\4\uffff\1\164\1\145\1\163\1\145\1\60\1\145\1\155\1\uffff\2\60\1\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\171\2\uffff\3\71\1\162\1\141\1\172\1\uffff\2\uffff\1\57\2\uffff\1\163\5\uffff\1\71\1\165\1\154\4\uffff\1\164\1\145\1\163\1\145\1\172\1\145\1\155\1\uffff\2\172\1\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\1\3\6\uffff\1\6\3\uffff\1\13\1\14\1\uffff\1\6\1\2\1\3\1\4\1\7\3\uffff\1\10\1\11\1\12\1\13\7\uffff\1\5\2\uffff\1\1";
    static final String DFA19_specialS =
        "\1\2\12\uffff\1\1\1\0\33\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\17\2\16\2\17\1\16\22\17\1\16\1\17\1\13\4\17\1\14\5\17\1\4\1\6\1\15\12\5\7\17\32\12\3\17\1\11\1\12\1\17\5\12\1\10\14\12\1\1\1\7\6\12\1\2\1\17\1\3\uff82\17",
            "\1\20",
            "",
            "",
            "\1\24\1\uffff\12\24",
            "\1\24\1\uffff\12\26",
            "\12\24",
            "\1\27",
            "\1\30",
            "\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "\0\31",
            "\0\31",
            "\1\32\4\uffff\1\33",
            "",
            "",
            "\1\35",
            "",
            "",
            "",
            "",
            "",
            "\1\24\1\uffff\12\26",
            "\1\36",
            "\1\37",
            "",
            "",
            "",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\45",
            "\1\46",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | RULE_FLOAT | RULE_BOOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_12 = input.LA(1);

                        s = -1;
                        if ( ((LA19_12>='\u0000' && LA19_12<='\uFFFF')) ) {s = 25;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_11 = input.LA(1);

                        s = -1;
                        if ( ((LA19_11>='\u0000' && LA19_11<='\uFFFF')) ) {s = 25;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='s') ) {s = 1;}

                        else if ( (LA19_0=='{') ) {s = 2;}

                        else if ( (LA19_0=='}') ) {s = 3;}

                        else if ( (LA19_0=='-') ) {s = 4;}

                        else if ( ((LA19_0>='0' && LA19_0<='9')) ) {s = 5;}

                        else if ( (LA19_0=='.') ) {s = 6;}

                        else if ( (LA19_0=='t') ) {s = 7;}

                        else if ( (LA19_0=='f') ) {s = 8;}

                        else if ( (LA19_0=='^') ) {s = 9;}

                        else if ( ((LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='e')||(LA19_0>='g' && LA19_0<='r')||(LA19_0>='u' && LA19_0<='z')) ) {s = 10;}

                        else if ( (LA19_0=='\"') ) {s = 11;}

                        else if ( (LA19_0=='\'') ) {s = 12;}

                        else if ( (LA19_0=='/') ) {s = 13;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 14;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='!'||(LA19_0>='#' && LA19_0<='&')||(LA19_0>='(' && LA19_0<=',')||(LA19_0>=':' && LA19_0<='@')||(LA19_0>='[' && LA19_0<=']')||LA19_0=='`'||LA19_0=='|'||(LA19_0>='~' && LA19_0<='\uFFFF')) ) {s = 15;}

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