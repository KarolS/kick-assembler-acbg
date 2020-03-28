/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package de.achimonline.kickassembler.acbg.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import de.achimonline.kickassembler.acbg.psi.KickAssemblerTypes;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>KickAssembler.flex</tt>
 */
class KickAssemblerLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [8, 6, 7]
   * Total runtime size is 1040 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>13]|((ch>>7)&0x3f)]|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 136 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\207\100");

  /* The ZZ_CMAP_Y table has 128 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\177\200");

  /* The ZZ_CMAP_A table has 256 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\1\1\1\0\1\2\1\1\22\0\1\2\1\13\1\17\1\32\1\6\1\10\1\116\1\0\1\103"+
    "\1\104\1\16\1\122\1\112\1\14\1\5\1\15\2\11\1\31\7\3\1\54\1\113\1\114\1\111"+
    "\1\115\1\123\1\0\1\55\1\20\1\57\1\56\1\67\1\7\1\12\1\60\1\71\1\102\1\75\1"+
    "\62\1\73\1\64\1\100\1\74\1\70\1\63\1\65\1\72\1\25\1\76\1\12\1\61\1\77\1\12"+
    "\1\107\1\0\1\110\1\120\1\4\1\0\1\21\1\44\1\24\1\33\1\34\1\35\1\43\1\51\1\23"+
    "\1\101\1\45\1\37\1\40\1\36\1\41\1\26\1\66\1\30\1\22\1\27\1\42\1\50\1\47\1"+
    "\52\1\46\1\53\1\105\1\117\1\106\1\121\201\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\2\1\1\5"+
    "\1\6\1\7\1\10\11\1\1\11\10\1\1\12\17\1"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\3\0\1\34\21\0\2\3\1\0\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\0\1\45"+
    "\100\0\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\3\4\0\1\57\6\0\1\57\3\0"+
    "\1\57\15\0\2\57\5\0\2\60\1\0\1\61\46\0"+
    "\1\42\1\0\1\3\22\0\2\57\15\0\2\57\12\0"+
    "\1\57\1\0\1\57\11\0\1\61\1\0\1\57\25\0"+
    "\1\62";

  private static int [] zzUnpackAction() {
    int [] result = new int[334];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\124\0\250\0\374\0\u0150\0\u01a4\0\u01f8\0\u024c"+
    "\0\u02a0\0\u02f4\0\u0348\0\u039c\0\u03f0\0\u0444\0\u0498\0\u04ec"+
    "\0\u0540\0\u0594\0\u05e8\0\u063c\0\u0690\0\u06e4\0\u0738\0\u078c"+
    "\0\u07e0\0\u0834\0\u0888\0\u08dc\0\u0930\0\u0984\0\124\0\u09d8"+
    "\0\u0a2c\0\u0a80\0\u0ad4\0\u0b28\0\u0b7c\0\u0bd0\0\u0c24\0\u0c78"+
    "\0\u0ccc\0\u0d20\0\u0d74\0\u0dc8\0\u0e1c\0\u0e70\0\124\0\124"+
    "\0\124\0\124\0\124\0\124\0\u0ec4\0\124\0\124\0\u0f18"+
    "\0\u0f6c\0\u0fc0\0\u1014\0\124\0\124\0\u1068\0\124\0\u10bc"+
    "\0\u1110\0\u0150\0\124\0\u1164\0\u11b8\0\u120c\0\u1260\0\u12b4"+
    "\0\u1308\0\u135c\0\u13b0\0\u1404\0\u1458\0\u14ac\0\u1500\0\u1554"+
    "\0\u15a8\0\u15fc\0\u1650\0\u16a4\0\u16f8\0\u174c\0\u17a0\0\124"+
    "\0\124\0\124\0\124\0\u17f4\0\u1848\0\124\0\124\0\u03f0"+
    "\0\124\0\u189c\0\u18f0\0\u1944\0\u1998\0\u19ec\0\u1a40\0\u1a94"+
    "\0\u1ae8\0\u1b3c\0\u1b90\0\u1be4\0\u1c38\0\u1c8c\0\u1ce0\0\u1d34"+
    "\0\u1d88\0\u1ddc\0\u1e30\0\u1e84\0\u1ed8\0\u1f2c\0\u1f80\0\u1fd4"+
    "\0\u2028\0\u207c\0\u20d0\0\u2124\0\u2178\0\u21cc\0\u2220\0\u2274"+
    "\0\u22c8\0\u231c\0\u2370\0\u23c4\0\u2418\0\u246c\0\u24c0\0\u2514"+
    "\0\u2568\0\u25bc\0\u2610\0\u2664\0\u26b8\0\u270c\0\u2760\0\u27b4"+
    "\0\u2808\0\u285c\0\u28b0\0\u2904\0\u2958\0\u29ac\0\u2a00\0\u2a54"+
    "\0\u2aa8\0\u2afc\0\u2b50\0\u2ba4\0\u2bf8\0\u2c4c\0\u2ca0\0\u2cf4"+
    "\0\u2d48\0\124\0\124\0\124\0\124\0\124\0\124\0\124"+
    "\0\124\0\124\0\u2d9c\0\u2df0\0\u2e44\0\u2e98\0\u2eec\0\124"+
    "\0\u2f40\0\u2f94\0\u2fe8\0\u303c\0\u3090\0\u30e4\0\u3138\0\u318c"+
    "\0\u31e0\0\u3234\0\u3288\0\u32dc\0\u3330\0\u3384\0\u33d8\0\u342c"+
    "\0\u3480\0\u34d4\0\u3528\0\u357c\0\u35d0\0\u3624\0\u3678\0\u36cc"+
    "\0\u3720\0\u3774\0\u37c8\0\u16f8\0\u174c\0\u381c\0\u3870\0\u0150"+
    "\0\u38c4\0\u3918\0\124\0\u396c\0\u39c0\0\u3a14\0\u3a68\0\u3abc"+
    "\0\u3b10\0\u3b64\0\u2d9c\0\u3bb8\0\u3c0c\0\u3c60\0\u3cb4\0\u3d08"+
    "\0\u3d5c\0\u3db0\0\u3e04\0\u3e58\0\u3eac\0\u3f00\0\u3f54\0\u3fa8"+
    "\0\u3774\0\u3ffc\0\u4050\0\u40a4\0\u40f8\0\u414c\0\u41a0\0\u41f4"+
    "\0\u4248\0\u429c\0\u42f0\0\u4344\0\u4398\0\u43ec\0\u4440\0\u4494"+
    "\0\u44e8\0\124\0\u453c\0\u0150\0\u4590\0\u45e4\0\u4638\0\u468c"+
    "\0\u46e0\0\u4734\0\u4788\0\u47dc\0\u4830\0\u4884\0\u48d8\0\u492c"+
    "\0\u4980\0\u49d4\0\u4a28\0\u4a7c\0\u4ad0\0\u4b24\0\u4b78\0\u4bcc"+
    "\0\u4c20\0\u4c74\0\u4cc8\0\u4d1c\0\u4d70\0\u4dc4\0\u4e18\0\u4e6c"+
    "\0\u4ec0\0\u4f14\0\u4f68\0\u4fbc\0\u5010\0\u5064\0\u50b8\0\u510c"+
    "\0\u5160\0\u3288\0\u51b4\0\u5208\0\u525c\0\u52b0\0\u5304\0\u5358"+
    "\0\u53ac\0\u5400\0\u5454\0\u54a8\0\u54fc\0\u5550\0\u55a4\0\u55f8"+
    "\0\u564c\0\u56a0\0\u56f4\0\u5748\0\u579c\0\u57f0\0\u5844\0\u5898"+
    "\0\u58ec\0\u5940\0\u5994\0\u59e8\0\u5a3c\0\u5a90\0\u5ae4\0\u5b38"+
    "\0\u5b8c\0\u5be0\0\u5c34\0\u5c88\0\u5cdc\0\u5d30\0\u5d84\0\u5dd8"+
    "\0\u5e2c\0\u5e80\0\u5ed4\0\u5f28\0\u5f7c\0\u0150";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[334];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\5\1\10"+
    "\1\4\1\5\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\5\1\23\1\24\1\25"+
    "\1\4\1\26\1\27\1\30\1\31\1\32\1\33\1\5"+
    "\1\34\2\5\1\35\5\5\1\36\1\5\1\37\1\40"+
    "\1\41\1\42\1\5\1\43\1\44\1\45\1\46\1\47"+
    "\1\5\1\50\1\5\1\51\1\52\1\5\1\53\3\5"+
    "\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63"+
    "\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
    "\1\74\1\75\1\76\1\77\125\0\2\3\124\0\1\4"+
    "\1\100\1\101\3\0\1\4\17\0\1\4\75\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\12\102\1\0\21\102"+
    "\1\103\26\102\42\0\1\104\1\105\1\106\1\107\1\0"+
    "\1\110\1\111\1\112\2\0\1\113\1\114\1\115\1\116"+
    "\1\117\1\120\3\0\1\121\2\0\1\122\1\123\2\0"+
    "\1\124\53\0\1\125\3\0\1\125\1\0\1\125\6\0"+
    "\2\125\2\0\1\125\4\0\1\125\1\0\3\125\6\0"+
    "\1\125\10\0\3\125\7\0\1\125\45\0\1\126\116\0"+
    "\1\127\2\0\1\127\2\0\1\127\1\0\1\130\3\0"+
    "\11\127\2\0\21\127\1\0\26\127\6\0\1\131\10\0"+
    "\1\130\15\0\1\132\74\0\1\133\27\0\1\134\1\135"+
    "\72\0\1\136\123\0\1\137\12\0\1\140\1\0\15\140"+
    "\1\141\104\140\3\0\2\102\2\0\1\102\1\0\2\102"+
    "\5\0\1\102\1\142\10\102\1\0\21\102\1\103\2\102"+
    "\1\143\3\102\1\144\1\145\2\102\1\146\1\102\1\147"+
    "\1\102\1\150\1\151\1\102\1\143\4\102\24\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\2\102\1\152\5\102"+
    "\1\153\1\102\1\0\1\154\2\102\1\155\1\153\11\102"+
    "\1\156\1\157\1\102\1\103\26\102\24\0\2\102\2\0"+
    "\1\102\1\0\2\102\5\0\1\102\1\160\1\102\1\153"+
    "\3\102\1\161\1\162\1\102\1\0\1\102\1\163\2\102"+
    "\1\164\4\102\1\165\4\102\1\166\2\102\1\103\26\102"+
    "\24\0\2\102\2\0\1\102\1\0\2\102\5\0\2\102"+
    "\1\154\7\102\1\0\3\102\1\167\15\102\1\103\26\102"+
    "\24\0\2\102\2\0\1\102\1\0\2\102\5\0\6\102"+
    "\1\166\3\102\1\0\4\102\1\170\1\171\13\102\1\103"+
    "\26\102\24\0\2\102\2\0\1\102\1\0\2\102\5\0"+
    "\12\102\1\0\4\102\1\172\11\102\1\172\2\102\1\103"+
    "\26\102\24\0\2\102\2\0\1\102\1\0\2\102\5\0"+
    "\1\102\1\173\1\156\5\102\1\174\1\102\1\0\13\102"+
    "\1\175\3\102\1\176\1\102\1\103\26\102\24\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\7\102\1\177\1\175"+
    "\1\102\1\0\4\102\1\175\1\102\1\200\12\102\1\103"+
    "\26\102\44\0\1\201\7\0\1\202\1\203\5\0\1\204"+
    "\64\0\2\102\2\0\1\102\1\0\2\102\5\0\4\102"+
    "\1\171\5\102\1\0\1\102\1\167\17\102\1\103\26\102"+
    "\24\0\2\102\2\0\1\102\1\0\2\102\5\0\12\102"+
    "\1\0\6\102\1\153\12\102\1\103\26\102\24\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\1\102\1\205\10\102"+
    "\1\0\21\102\1\103\26\102\24\0\2\102\2\0\1\102"+
    "\1\0\2\102\5\0\12\102\1\0\6\102\1\171\1\206"+
    "\11\102\1\103\26\102\24\0\2\102\2\0\1\102\1\0"+
    "\2\102\5\0\1\102\1\207\1\153\7\102\1\0\1\161"+
    "\20\102\1\103\26\102\24\0\2\102\2\0\1\102\1\0"+
    "\2\102\5\0\10\102\1\175\1\102\1\0\21\102\1\103"+
    "\26\102\24\0\2\102\2\0\1\102\1\0\2\102\5\0"+
    "\3\102\1\210\1\211\1\102\1\152\1\102\1\212\1\102"+
    "\1\0\1\102\1\213\1\102\1\162\1\102\1\214\7\102"+
    "\1\211\3\102\1\103\26\102\24\0\2\102\2\0\1\102"+
    "\1\0\2\102\5\0\1\102\1\175\10\102\1\0\21\102"+
    "\1\103\26\102\24\0\2\102\2\0\1\102\1\0\2\102"+
    "\5\0\12\102\1\0\21\102\1\103\1\102\1\215\1\102"+
    "\1\216\1\217\2\220\1\221\1\151\15\102\24\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\12\102\1\0\21\102"+
    "\1\103\2\102\1\222\7\102\1\223\13\102\24\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\12\102\1\0\21\102"+
    "\1\103\5\102\1\224\10\102\1\222\1\225\6\102\24\0"+
    "\2\102\2\0\1\102\1\0\2\102\5\0\12\102\1\0"+
    "\21\102\1\103\1\226\25\102\24\0\2\102\2\0\1\102"+
    "\1\0\2\102\5\0\12\102\1\0\21\102\1\103\1\227"+
    "\1\230\6\102\1\220\15\102\24\0\2\102\2\0\1\102"+
    "\1\0\2\102\5\0\12\102\1\0\21\102\1\103\5\102"+
    "\2\226\6\102\1\231\5\102\1\232\2\102\24\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\12\102\1\0\21\102"+
    "\1\103\23\102\1\222\2\102\24\0\2\102\2\0\1\102"+
    "\1\0\2\102\5\0\1\233\11\102\1\0\21\102\1\103"+
    "\1\234\2\102\1\225\1\102\1\235\1\145\3\102\1\236"+
    "\1\102\1\220\1\230\10\102\24\0\2\102\2\0\1\102"+
    "\1\0\2\102\5\0\12\102\1\0\21\102\1\103\23\102"+
    "\1\220\2\102\24\0\2\102\2\0\1\102\1\0\2\102"+
    "\5\0\12\102\1\0\21\102\1\103\7\102\1\223\1\215"+
    "\15\102\24\0\2\102\2\0\1\102\1\0\2\102\5\0"+
    "\12\102\1\0\21\102\1\103\1\237\3\102\1\240\3\102"+
    "\1\216\11\102\1\226\3\102\24\0\2\102\2\0\1\102"+
    "\1\0\2\102\5\0\12\102\1\0\21\102\1\103\3\102"+
    "\1\241\1\102\1\241\20\102\24\0\2\102\2\0\1\102"+
    "\1\0\2\102\5\0\12\102\1\0\21\102\1\103\6\102"+
    "\1\226\17\102\24\0\2\102\2\0\1\102\1\0\2\102"+
    "\5\0\2\102\1\153\7\102\1\0\5\102\1\171\13\102"+
    "\1\103\26\102\24\0\2\102\2\0\1\102\1\0\2\102"+
    "\5\0\12\102\1\0\21\102\1\103\10\102\1\220\5\102"+
    "\1\222\7\102\132\0\1\242\123\0\1\243\2\0\1\244"+
    "\120\0\1\245\3\0\1\246\124\0\1\247\124\0\1\250"+
    "\115\0\1\251\10\0\1\252\4\0\1\4\1\100\4\0"+
    "\1\4\17\0\1\4\75\0\1\253\5\0\1\253\17\0"+
    "\1\253\114\0\1\254\14\0\1\255\113\0\1\256\4\0"+
    "\1\257\124\0\1\260\2\0\1\261\111\0\1\262\12\0"+
    "\1\263\104\0\1\264\1\0\1\260\3\0\1\265\6\0"+
    "\1\266\120\0\1\267\123\0\1\270\112\0\1\271\10\0"+
    "\1\272\12\0\1\273\104\0\1\274\5\0\1\275\11\0"+
    "\1\276\76\0\1\277\15\0\1\300\1\301\102\0\1\302"+
    "\123\0\1\303\17\0\1\304\103\0\1\305\12\0\1\306"+
    "\4\0\1\307\112\0\1\310\15\0\1\311\116\0\1\312"+
    "\7\0\1\313\73\0\1\300\130\0\1\260\100\0\1\125"+
    "\1\314\2\0\1\125\1\0\1\125\6\0\2\125\2\0"+
    "\1\125\4\0\1\125\1\0\3\125\6\0\1\125\10\0"+
    "\3\125\7\0\1\125\40\0\1\315\4\0\1\126\115\0"+
    "\2\127\2\0\1\127\1\0\2\127\1\0\1\130\3\0"+
    "\12\127\1\0\21\127\1\0\26\127\17\0\1\130\1\0"+
    "\1\134\1\0\122\134\16\135\1\316\105\135\3\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\2\102\1\317\7\102"+
    "\1\0\21\102\1\103\26\102\24\0\2\102\2\0\1\102"+
    "\1\0\2\102\5\0\12\102\1\0\21\102\1\103\2\102"+
    "\1\320\5\102\1\320\15\102\24\0\2\102\2\0\1\102"+
    "\1\0\2\102\5\0\12\102\1\0\21\102\1\103\1\320"+
    "\17\102\1\320\5\102\24\0\2\102\2\0\1\102\1\0"+
    "\2\102\5\0\12\102\1\0\21\102\1\103\12\102\1\320"+
    "\13\102\24\0\2\102\2\0\1\102\1\0\2\102\5\0"+
    "\12\102\1\0\21\102\1\103\13\102\1\320\12\102\24\0"+
    "\2\102\2\0\1\102\1\0\2\102\5\0\12\102\1\0"+
    "\21\102\1\103\15\102\1\320\10\102\24\0\2\102\2\0"+
    "\1\102\1\0\2\102\5\0\12\102\1\0\21\102\1\103"+
    "\14\102\1\320\11\102\24\0\2\102\2\0\1\102\1\0"+
    "\2\102\5\0\12\102\1\0\21\102\1\103\5\102\1\320"+
    "\20\102\24\0\2\102\2\0\1\102\1\0\2\102\5\0"+
    "\12\102\1\0\4\102\1\320\14\102\1\103\26\102\24\0"+
    "\2\102\2\0\1\102\1\0\2\102\5\0\10\102\1\320"+
    "\1\102\1\0\21\102\1\103\26\102\24\0\2\102\2\0"+
    "\1\102\1\0\2\102\5\0\4\102\1\320\5\102\1\0"+
    "\21\102\1\103\26\102\24\0\2\102\2\0\1\102\1\0"+
    "\2\102\5\0\4\102\1\321\5\102\1\0\1\320\20\102"+
    "\1\103\26\102\24\0\2\102\2\0\1\102\1\0\2\102"+
    "\5\0\12\102\1\0\17\102\1\320\1\102\1\103\26\102"+
    "\24\0\2\102\2\0\1\102\1\0\2\102\5\0\2\102"+
    "\1\320\7\102\1\0\21\102\1\103\26\102\24\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\4\102\1\320\5\102"+
    "\1\0\17\102\1\320\1\102\1\103\26\102\24\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\1\102\1\320\10\102"+
    "\1\0\13\102\1\320\3\102\1\320\1\102\1\103\26\102"+
    "\24\0\2\102\2\0\1\102\1\0\2\102\5\0\12\102"+
    "\1\0\1\102\1\320\17\102\1\103\26\102\24\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\3\102\2\320\5\102"+
    "\1\0\1\320\20\102\1\103\26\102\24\0\2\102\2\0"+
    "\1\102\1\0\2\102\5\0\12\102\1\0\6\102\1\320"+
    "\12\102\1\103\26\102\24\0\2\102\2\0\1\102\1\0"+
    "\2\102\5\0\4\102\1\321\5\102\1\0\21\102\1\103"+
    "\26\102\24\0\2\102\2\0\1\102\1\0\2\102\5\0"+
    "\12\102\1\0\13\102\1\320\3\102\1\320\1\102\1\103"+
    "\26\102\24\0\2\102\2\0\1\102\1\0\2\102\5\0"+
    "\4\102\1\320\5\102\1\0\13\102\1\320\3\102\1\320"+
    "\1\102\1\103\26\102\24\0\2\102\2\0\1\102\1\0"+
    "\2\102\5\0\3\102\2\320\5\102\1\0\1\320\14\102"+
    "\1\320\3\102\1\103\26\102\24\0\2\102\2\0\1\102"+
    "\1\0\2\102\5\0\6\102\1\320\3\102\1\0\21\102"+
    "\1\103\26\102\24\0\2\102\2\0\1\102\1\0\2\102"+
    "\5\0\1\102\1\320\4\102\1\320\3\102\1\0\21\102"+
    "\1\103\26\102\24\0\2\102\2\0\1\102\1\0\2\102"+
    "\5\0\2\102\1\320\7\102\1\0\13\102\1\320\3\102"+
    "\1\320\1\102\1\103\26\102\24\0\2\102\2\0\1\102"+
    "\1\0\2\102\5\0\12\102\1\0\7\102\1\322\11\102"+
    "\1\103\26\102\24\0\2\102\2\0\1\102\1\0\2\102"+
    "\5\0\1\102\1\320\10\102\1\0\21\102\1\103\26\102"+
    "\24\0\2\102\2\0\1\102\1\0\2\102\5\0\1\102"+
    "\2\320\7\102\1\0\21\102\1\103\26\102\24\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\2\102\2\320\6\102"+
    "\1\0\21\102\1\103\26\102\24\0\2\102\2\0\1\102"+
    "\1\0\2\102\5\0\10\102\1\320\1\102\1\0\4\102"+
    "\1\320\14\102\1\103\26\102\56\0\1\323\2\0\1\324"+
    "\117\0\1\325\125\0\1\326\1\327\122\0\1\330\70\0"+
    "\2\102\2\0\1\102\1\0\2\102\5\0\12\102\1\0"+
    "\4\102\1\331\14\102\1\103\26\102\24\0\2\102\2\0"+
    "\1\102\1\0\2\102\5\0\12\102\1\0\4\102\1\332"+
    "\14\102\1\103\26\102\24\0\2\102\2\0\1\102\1\0"+
    "\2\102\5\0\2\102\1\320\7\102\1\0\17\102\1\320"+
    "\1\102\1\103\26\102\24\0\2\102\2\0\1\102\1\0"+
    "\2\102\5\0\7\102\1\320\2\102\1\0\21\102\1\103"+
    "\26\102\24\0\2\102\2\0\1\102\1\0\2\102\5\0"+
    "\2\102\1\320\1\102\1\320\5\102\1\0\21\102\1\103"+
    "\26\102\24\0\2\102\2\0\1\102\1\0\2\102\5\0"+
    "\1\102\1\320\10\102\1\0\12\102\1\320\6\102\1\103"+
    "\26\102\24\0\2\102\2\0\1\102\1\0\2\102\5\0"+
    "\12\102\1\0\21\102\1\103\11\102\1\320\14\102\24\0"+
    "\2\102\2\0\1\102\1\0\2\102\5\0\3\102\1\320"+
    "\6\102\1\0\21\102\1\103\26\102\24\0\2\102\2\0"+
    "\1\102\1\0\2\102\5\0\12\102\1\0\21\102\1\103"+
    "\2\102\1\320\23\102\24\0\2\102\2\0\1\102\1\0"+
    "\2\102\5\0\12\102\1\0\21\102\1\103\4\102\1\320"+
    "\21\102\24\0\2\102\2\0\1\102\1\0\2\102\5\0"+
    "\12\102\1\0\21\102\1\103\10\102\1\320\15\102\24\0"+
    "\2\102\2\0\1\102\1\0\2\102\5\0\12\102\1\0"+
    "\21\102\1\103\6\102\1\320\17\102\24\0\2\102\2\0"+
    "\1\102\1\0\2\102\5\0\12\102\1\0\21\102\1\103"+
    "\1\102\1\320\1\321\23\102\24\0\2\102\2\0\1\102"+
    "\1\0\2\102\5\0\12\102\1\0\21\102\1\103\17\102"+
    "\1\320\6\102\24\0\2\102\2\0\1\102\1\0\2\102"+
    "\5\0\12\102\1\0\21\102\1\103\2\102\1\320\1\102"+
    "\1\320\15\102\1\320\3\102\24\0\2\102\2\0\1\102"+
    "\1\0\2\102\5\0\12\102\1\0\21\102\1\103\1\102"+
    "\2\320\11\102\1\320\4\102\1\320\4\102\24\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\12\102\1\0\21\102"+
    "\1\103\4\102\1\320\15\102\1\320\3\102\24\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\12\102\1\0\21\102"+
    "\1\103\1\320\25\102\24\0\2\102\2\0\1\102\1\0"+
    "\2\102\5\0\12\102\1\0\21\102\1\103\4\102\1\320"+
    "\3\102\1\320\15\102\24\0\2\102\2\0\1\102\1\0"+
    "\2\102\5\0\12\102\1\0\21\102\1\103\1\320\3\102"+
    "\1\320\15\102\1\320\3\102\24\0\2\102\2\0\1\102"+
    "\1\0\2\102\5\0\12\102\1\0\21\102\1\103\10\102"+
    "\1\320\3\102\1\320\11\102\24\0\2\102\2\0\1\102"+
    "\1\0\2\102\5\0\12\102\1\0\21\102\1\103\5\102"+
    "\2\320\17\102\24\0\2\102\2\0\1\102\1\0\2\102"+
    "\5\0\12\102\1\0\21\102\1\103\2\102\1\321\23\102"+
    "\24\0\2\102\2\0\1\102\1\0\2\102\5\0\12\102"+
    "\1\0\21\102\1\103\2\102\1\320\1\102\1\320\21\102"+
    "\24\0\2\102\2\0\1\102\1\0\2\102\5\0\12\102"+
    "\1\0\21\102\1\103\23\102\1\320\2\102\24\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\12\102\1\0\21\102"+
    "\1\103\1\102\2\320\11\102\1\320\11\102\24\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\12\102\1\0\21\102"+
    "\1\103\4\102\1\320\3\102\1\320\11\102\1\320\3\102"+
    "\24\0\2\102\2\0\1\102\1\0\2\102\5\0\12\102"+
    "\1\0\21\102\1\103\1\320\7\102\1\320\15\102\24\0"+
    "\2\102\2\0\1\102\1\0\2\102\5\0\12\102\1\0"+
    "\21\102\1\103\1\320\16\102\1\320\6\102\24\0\1\253"+
    "\1\333\4\0\1\253\17\0\1\253\114\0\1\334\124\0"+
    "\1\335\130\0\1\336\136\0\1\337\106\0\1\340\137\0"+
    "\1\260\117\0\1\341\121\0\1\342\112\0\1\343\142\0"+
    "\1\344\133\0\1\345\100\0\1\346\116\0\1\347\136\0"+
    "\1\350\127\0\1\351\112\0\1\352\117\0\1\353\15\0"+
    "\1\354\102\0\1\355\141\0\1\356\114\0\1\260\131\0"+
    "\1\357\125\0\1\360\127\0\1\361\130\0\1\362\76\0"+
    "\1\363\137\0\1\364\116\0\1\365\124\0\1\366\116\0"+
    "\1\367\124\0\1\370\116\0\1\371\100\0\15\135\1\372"+
    "\1\316\105\135\3\0\2\102\2\0\1\102\1\0\2\102"+
    "\5\0\3\102\1\373\6\102\1\0\21\102\1\103\26\102"+
    "\24\0\2\102\2\0\1\102\1\0\2\102\5\0\11\102"+
    "\1\320\1\0\21\102\1\103\26\102\24\0\2\102\2\0"+
    "\1\102\1\0\2\102\5\0\12\102\1\0\1\102\1\374"+
    "\17\102\1\103\26\102\47\0\1\375\132\0\1\376\121\0"+
    "\1\377\112\0\1\u0100\1\u0101\133\0\1\u0102\73\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\2\102\1\322\7\102"+
    "\1\0\21\102\1\103\26\102\24\0\2\102\2\0\1\102"+
    "\1\0\2\102\5\0\12\102\1\0\4\102\1\374\14\102"+
    "\1\103\26\102\55\0\1\u0103\132\0\1\u0104\122\0\1\u0105"+
    "\121\0\1\u0106\124\0\1\u0107\104\0\1\345\143\0\1\u0108"+
    "\117\0\1\u0109\130\0\1\u010a\107\0\1\260\136\0\1\u010b"+
    "\126\0\1\260\101\0\1\u010c\141\0\1\u010d\123\0\1\u010e"+
    "\122\0\1\260\122\0\1\260\120\0\1\u010f\2\0\1\u0110"+
    "\110\0\1\u0111\133\0\1\u0112\123\0\1\355\112\0\1\u0113"+
    "\130\0\1\u0114\137\0\1\u0115\102\0\1\u0116\121\0\1\347"+
    "\136\0\1\260\122\0\1\260\127\0\1\367\67\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\4\102\1\u0117\5\102"+
    "\1\0\21\102\1\103\26\102\62\0\1\u0118\105\0\1\u0119"+
    "\123\0\1\u0101\134\0\1\323\124\0\1\323\122\0\1\u0101"+
    "\117\0\1\u011a\131\0\1\260\111\0\1\345\133\0\1\u011b"+
    "\117\0\1\u011c\126\0\1\u011d\117\0\1\u011e\117\0\1\u0104"+
    "\130\0\1\u0104\131\0\1\367\115\0\1\u011f\126\0\1\u0120"+
    "\126\0\1\116\1\0\1\u0121\132\0\1\u0122\103\0\1\u0123"+
    "\116\0\1\u0124\136\0\1\u0125\127\0\1\260\121\0\1\u0126"+
    "\121\0\1\u0127\71\0\2\102\2\0\1\102\1\0\2\102"+
    "\5\0\5\102\1\u0128\4\102\1\0\21\102\1\103\26\102"+
    "\51\0\1\u0129\131\0\1\u0100\114\0\1\u012a\132\0\1\u012b"+
    "\114\0\1\u012c\135\0\1\u012d\120\0\1\u012e\110\0\1\u012f"+
    "\123\0\1\u0130\141\0\1\307\105\0\1\u0131\126\0\1\u0132"+
    "\120\0\1\u0133\141\0\1\u0134\130\0\1\260\60\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\6\102\1\u0135\3\102"+
    "\1\0\21\102\1\103\26\102\50\0\1\u0136\130\0\1\u0137"+
    "\116\0\1\u0138\135\0\1\u0139\106\0\1\u013a\1\0\1\u013b"+
    "\136\0\1\u013c\117\0\1\260\124\0\1\u013d\126\0\1\u0104"+
    "\103\0\1\u013e\141\0\1\355\110\0\1\347\102\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\2\102\1\u013f\7\102"+
    "\1\0\21\102\1\103\26\102\44\0\1\u0101\15\0\1\u0140"+
    "\112\0\1\u0141\126\0\1\u0142\5\0\1\u0143\120\0\1\u013e"+
    "\126\0\1\u0144\106\0\1\260\146\0\1\260\117\0\1\260"+
    "\104\0\1\367\102\0\2\102\2\0\1\102\1\0\2\102"+
    "\5\0\7\102\1\u0145\2\102\1\0\21\102\1\103\26\102"+
    "\57\0\1\u0146\115\0\1\u0147\127\0\1\u012f\131\0\1\345"+
    "\121\0\1\u0148\66\0\2\102\2\0\1\102\1\0\2\102"+
    "\5\0\1\102\1\u0149\10\102\1\0\21\102\1\103\26\102"+
    "\45\0\1\u0100\140\0\1\300\122\0\1\u014a\66\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\10\102\1\u014b\1\102"+
    "\1\0\21\102\1\103\26\102\42\0\1\u014c\105\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\7\102\1\u014d\2\102"+
    "\1\0\21\102\1\103\26\102\57\0\1\370\70\0\2\102"+
    "\2\0\1\102\1\0\2\102\5\0\11\102\1\u014e\1\0"+
    "\21\102\1\103\26\102\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[24528];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\34\1\1\11\17\1\6\11\1\1\2\11"+
    "\4\1\2\11\1\1\1\11\3\0\1\11\21\0\2\1"+
    "\1\0\4\11\2\1\2\11\1\0\1\11\100\0\11\11"+
    "\1\1\4\0\1\11\6\0\1\1\3\0\1\1\15\0"+
    "\2\1\5\0\2\1\1\0\1\11\46\0\1\11\1\0"+
    "\1\1\22\0\2\1\15\0\2\1\12\0\1\1\1\0"+
    "\1\1\11\0\1\1\1\0\1\1\25\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[334];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  KickAssemblerLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
        return;

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return KickAssemblerTypes.DUMMY;
            } 
            // fall through
          case 51: break;
          case 2: 
            { return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 52: break;
          case 3: 
            { return KickAssemblerTypes.NUMBER;
            } 
            // fall through
          case 53: break;
          case 4: 
            { return KickAssemblerTypes.DOT;
            } 
            // fall through
          case 54: break;
          case 5: 
            { return KickAssemblerTypes.NOT;
            } 
            // fall through
          case 55: break;
          case 6: 
            { return KickAssemblerTypes.MINUS;
            } 
            // fall through
          case 56: break;
          case 7: 
            { return KickAssemblerTypes.DIVIDE;
            } 
            // fall through
          case 57: break;
          case 8: 
            { return KickAssemblerTypes.TIMES;
            } 
            // fall through
          case 58: break;
          case 9: 
            { return KickAssemblerTypes.HASH;
            } 
            // fall through
          case 59: break;
          case 10: 
            { return KickAssemblerTypes.COLON;
            } 
            // fall through
          case 60: break;
          case 11: 
            { return KickAssemblerTypes.LEFT_PARENTHESES;
            } 
            // fall through
          case 61: break;
          case 12: 
            { return KickAssemblerTypes.RIGHT_PARENTHESES;
            } 
            // fall through
          case 62: break;
          case 13: 
            { return KickAssemblerTypes.LEFT_BRACE;
            } 
            // fall through
          case 63: break;
          case 14: 
            { return KickAssemblerTypes.RIGHT_BRACE;
            } 
            // fall through
          case 64: break;
          case 15: 
            { return KickAssemblerTypes.LEFT_BRACKET;
            } 
            // fall through
          case 65: break;
          case 16: 
            { return KickAssemblerTypes.RIGHT_BRACKET;
            } 
            // fall through
          case 66: break;
          case 17: 
            { return KickAssemblerTypes.ASSIGN;
            } 
            // fall through
          case 67: break;
          case 18: 
            { return KickAssemblerTypes.COMMA;
            } 
            // fall through
          case 68: break;
          case 19: 
            { return KickAssemblerTypes.SEMICOLON;
            } 
            // fall through
          case 69: break;
          case 20: 
            { return KickAssemblerTypes.LESS;
            } 
            // fall through
          case 70: break;
          case 21: 
            { return KickAssemblerTypes.GREATER;
            } 
            // fall through
          case 71: break;
          case 22: 
            { return KickAssemblerTypes.BIT_AND;
            } 
            // fall through
          case 72: break;
          case 23: 
            { return KickAssemblerTypes.BIT_OR;
            } 
            // fall through
          case 73: break;
          case 24: 
            { return KickAssemblerTypes.BIT_XOR;
            } 
            // fall through
          case 74: break;
          case 25: 
            { return KickAssemblerTypes.BIT_NOT;
            } 
            // fall through
          case 75: break;
          case 26: 
            { return KickAssemblerTypes.PLUS;
            } 
            // fall through
          case 76: break;
          case 27: 
            { return KickAssemblerTypes.QUESTION_MARK;
            } 
            // fall through
          case 77: break;
          case 28: 
            { return KickAssemblerTypes.LABEL;
            } 
            // fall through
          case 78: break;
          case 29: 
            { return KickAssemblerTypes.LOCAL_LABEL;
            } 
            // fall through
          case 79: break;
          case 30: 
            { return KickAssemblerTypes.NOT_EQUAL;
            } 
            // fall through
          case 80: break;
          case 31: 
            { return KickAssemblerTypes.MINUS_MINUS;
            } 
            // fall through
          case 81: break;
          case 32: 
            { return KickAssemblerTypes.MINUS_EQUAL;
            } 
            // fall through
          case 82: break;
          case 33: 
            { return KickAssemblerTypes.COMMENT_LINE;
            } 
            // fall through
          case 83: break;
          case 34: 
            { return KickAssemblerTypes.COMMENT_BLOCK;
            } 
            // fall through
          case 84: break;
          case 35: 
            { return KickAssemblerTypes.DIVIDE_EQUAL;
            } 
            // fall through
          case 85: break;
          case 36: 
            { return KickAssemblerTypes.TIMES_EQUAL;
            } 
            // fall through
          case 86: break;
          case 37: 
            { return KickAssemblerTypes.STRING;
            } 
            // fall through
          case 87: break;
          case 38: 
            { return KickAssemblerTypes.EQUAL;
            } 
            // fall through
          case 88: break;
          case 39: 
            { return KickAssemblerTypes.LESS_EQUALS;
            } 
            // fall through
          case 89: break;
          case 40: 
            { return KickAssemblerTypes.SHIFT_LEFT;
            } 
            // fall through
          case 90: break;
          case 41: 
            { return KickAssemblerTypes.GREATER_EQUALS;
            } 
            // fall through
          case 91: break;
          case 42: 
            { return KickAssemblerTypes.SHIFT_RIGHT;
            } 
            // fall through
          case 92: break;
          case 43: 
            { return KickAssemblerTypes.AND;
            } 
            // fall through
          case 93: break;
          case 44: 
            { return KickAssemblerTypes.OR;
            } 
            // fall through
          case 94: break;
          case 45: 
            { return KickAssemblerTypes.PLUS_EQUAL;
            } 
            // fall through
          case 95: break;
          case 46: 
            { return KickAssemblerTypes.PLUS_PLUS;
            } 
            // fall through
          case 96: break;
          case 47: 
            { return KickAssemblerTypes.DIRECTIVE;
            } 
            // fall through
          case 97: break;
          case 48: 
            { return KickAssemblerTypes.MNEMONIC;
            } 
            // fall through
          case 98: break;
          case 49: 
            { return KickAssemblerTypes.PREPROCESSOR;
            } 
            // fall through
          case 99: break;
          case 50: 
            { return KickAssemblerTypes.BASIC_UPSTART;
            } 
            // fall through
          case 100: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
