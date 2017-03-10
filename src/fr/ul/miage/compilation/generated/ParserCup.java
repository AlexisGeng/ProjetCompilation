
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141204 (SVN rev 60)
//----------------------------------------------------

package fr.ul.miage.compilation.generated;

import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141204 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class ParserCup extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public ParserCup() {super();}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\063\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\004\000\002\003\002\000\002\004\006" +
    "\000\002\004\004\000\002\005\006\000\002\006\005\000" +
    "\002\006\002\000\002\007\010\000\002\007\013\000\002" +
    "\010\007\000\002\012\005\000\002\012\002\000\002\013" +
    "\006\000\002\013\002\000\002\014\004\000\002\014\003" +
    "\000\002\015\004\000\002\015\004\000\002\015\004\000" +
    "\002\015\005\000\002\015\004\000\002\015\002\000\002" +
    "\016\005\000\002\017\006\000\002\020\004\000\002\020" +
    "\002\000\002\022\005\000\002\022\002\000\002\021\004" +
    "\000\002\023\005\000\002\023\002\000\002\024\003\000" +
    "\002\024\003\000\002\024\003\000\002\024\005\000\002" +
    "\025\012\000\002\026\014\000\002\027\011\000\002\027" +
    "\002\000\002\030\005\000\002\030\002\000\002\031\005" +
    "\000\002\032\003\000\002\032\003\000\002\032\003\000" +
    "\002\032\003\000\002\032\003\000\002\032\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\165\000\010\002\ufffd\023\011\024\007\001\002\000" +
    "\004\002\167\001\002\000\010\002\ufffd\023\011\024\007" +
    "\001\002\000\010\002\ufffd\023\011\024\007\001\002\000" +
    "\004\023\050\001\002\000\004\002\000\001\002\000\004" +
    "\012\013\001\002\000\032\002\ufffb\012\ufffb\023\ufffb\024" +
    "\ufffb\025\ufffb\027\ufffb\030\ufffb\031\ufffb\032\ufffb\033\ufffb" +
    "\034\ufffb\035\ufffb\001\002\000\010\004\ufff8\005\014\006" +
    "\015\001\002\000\004\012\045\001\002\000\010\007\021" +
    "\012\025\014\020\001\002\000\004\004\017\001\002\000" +
    "\032\002\ufffc\012\ufffc\023\ufffc\024\ufffc\025\ufffc\027\ufffc" +
    "\030\ufffc\031\ufffc\032\ufffc\033\ufffc\034\ufffc\035\ufffc\001" +
    "\002\000\026\004\uffdd\005\uffdd\010\uffdd\013\uffdd\015\uffdd" +
    "\016\uffdd\017\uffdd\020\uffdd\021\uffdd\022\uffdd\001\002\000" +
    "\010\007\021\012\025\014\020\001\002\000\026\004\uffe0" +
    "\005\uffe0\010\uffe0\013\040\015\uffe0\016\uffe0\017\uffe0\020" +
    "\uffe0\021\uffe0\022\uffe0\001\002\000\026\004\uffde\005\uffde" +
    "\010\uffde\013\uffde\015\uffde\016\uffde\017\uffde\020\uffde\021" +
    "\uffde\022\uffde\001\002\000\004\004\036\001\002\000\030" +
    "\004\uffdf\005\uffdf\007\026\010\uffdf\013\uffdf\015\uffdf\016" +
    "\uffdf\017\uffdf\020\uffdf\021\uffdf\022\uffdf\001\002\000\012" +
    "\007\021\010\uffe5\012\025\014\020\001\002\000\004\010" +
    "\035\001\002\000\006\005\032\010\uffe3\001\002\000\004" +
    "\010\uffe6\001\002\000\010\007\021\012\025\014\020\001" +
    "\002\000\006\005\032\010\uffe3\001\002\000\004\010\uffe4" +
    "\001\002\000\026\004\uffe7\005\uffe7\010\uffe7\013\uffe7\015" +
    "\uffe7\016\uffe7\017\uffe7\020\uffe7\021\uffe7\022\uffe7\001\002" +
    "\000\032\002\ufffa\012\ufffa\023\ufffa\024\ufffa\025\ufffa\027" +
    "\ufffa\030\ufffa\031\ufffa\032\ufffa\033\ufffa\034\ufffa\035\ufffa" +
    "\001\002\000\024\004\uffe2\005\uffe2\010\uffe2\015\uffe2\016" +
    "\uffe2\017\uffe2\020\uffe2\021\uffe2\022\uffe2\001\002\000\010" +
    "\007\021\012\025\014\020\001\002\000\026\004\uffe0\005" +
    "\uffe0\010\uffe0\013\040\015\uffe0\016\uffe0\017\uffe0\020\uffe0" +
    "\021\uffe0\022\uffe0\001\002\000\024\004\uffe1\005\uffe1\010" +
    "\uffe1\015\uffe1\016\uffe1\017\uffe1\020\uffe1\021\uffe1\022\uffe1" +
    "\001\002\000\004\010\044\001\002\000\026\004\uffdc\005" +
    "\uffdc\010\uffdc\013\uffdc\015\uffdc\016\uffdc\017\uffdc\020\uffdc" +
    "\021\uffdc\022\uffdc\001\002\000\006\004\ufff8\005\014\001" +
    "\002\000\004\004\ufff9\001\002\000\004\011\161\001\002" +
    "\000\006\012\052\026\051\001\002\000\004\007\065\001" +
    "\002\000\004\007\053\001\002\000\006\010\ufff3\023\055" +
    "\001\002\000\004\010\064\001\002\000\004\012\056\001" +
    "\002\000\006\005\060\010\ufff1\001\002\000\004\010\ufff4" +
    "\001\002\000\004\023\061\001\002\000\004\012\062\001" +
    "\002\000\006\005\060\010\ufff1\001\002\000\004\010\ufff2" +
    "\001\002\000\004\011\ufff5\001\002\000\004\010\066\001" +
    "\002\000\004\011\067\001\002\000\016\012\072\023\011" +
    "\025\uffe9\027\uffe9\030\070\032\077\001\002\000\004\007" +
    "\152\001\002\000\026\012\072\023\011\025\uffe9\027\uffe9" +
    "\030\070\031\uffe9\032\077\033\uffe9\034\uffe9\035\uffe9\001" +
    "\002\000\006\006\015\007\026\001\002\000\026\012\072" +
    "\023\011\025\uffe9\027\uffe9\030\070\031\uffe9\032\077\033" +
    "\uffe9\034\uffe9\035\uffe9\001\002\000\004\004\146\001\002" +
    "\000\026\012\072\023\011\025\uffe9\027\uffe9\030\070\031" +
    "\uffe9\032\077\033\uffe9\034\uffe9\035\uffe9\001\002\000\026" +
    "\012\072\023\011\025\uffe9\027\uffe9\030\070\031\uffe9\032" +
    "\077\033\uffe9\034\uffe9\035\uffe9\001\002\000\004\007\110" +
    "\001\002\000\016\025\uffef\027\104\031\uffef\033\uffef\034" +
    "\uffef\035\uffef\001\002\000\004\025\102\001\002\000\004" +
    "\004\103\001\002\000\010\002\ufff6\023\ufff6\024\ufff6\001" +
    "\002\000\010\007\021\012\025\014\020\001\002\000\016" +
    "\025\ufff0\027\ufff0\031\ufff0\033\ufff0\034\ufff0\035\ufff0\001" +
    "\002\000\004\004\107\001\002\000\016\025\uffe8\027\uffe8" +
    "\031\uffe8\033\uffe8\034\uffe8\035\uffe8\001\002\000\010\007" +
    "\021\012\025\014\020\001\002\000\016\015\137\016\142" +
    "\017\135\020\140\021\141\022\136\001\002\000\004\010" +
    "\113\001\002\000\004\011\114\001\002\000\022\012\072" +
    "\023\011\027\uffe9\030\070\032\077\033\uffe9\034\uffe9\035" +
    "\uffe9\001\002\000\010\033\uffd8\034\117\035\uffd8\001\002" +
    "\000\006\033\uffd6\035\127\001\002\000\004\007\120\001" +
    "\002\000\010\007\021\012\025\014\020\001\002\000\004" +
    "\010\122\001\002\000\004\011\123\001\002\000\022\012" +
    "\072\023\011\027\uffe9\030\070\032\077\033\uffe9\034\uffe9" +
    "\035\uffe9\001\002\000\010\033\uffd8\034\117\035\uffd8\001" +
    "\002\000\006\033\uffd9\035\uffd9\001\002\000\004\033\132" +
    "\001\002\000\004\011\130\001\002\000\016\012\072\023" +
    "\011\027\uffe9\030\070\032\077\033\uffe9\001\002\000\004" +
    "\033\uffd7\001\002\000\004\004\133\001\002\000\026\012" +
    "\uffda\023\uffda\025\uffda\027\uffda\030\uffda\031\uffda\032\uffda" +
    "\033\uffda\034\uffda\035\uffda\001\002\000\010\007\021\012" +
    "\025\014\020\001\002\000\010\007\uffd2\012\uffd2\014\uffd2" +
    "\001\002\000\010\007\uffcf\012\uffcf\014\uffcf\001\002\000" +
    "\010\007\uffd4\012\uffd4\014\uffd4\001\002\000\010\007\uffd0" +
    "\012\uffd0\014\uffd0\001\002\000\010\007\uffd1\012\uffd1\014" +
    "\uffd1\001\002\000\010\007\uffd3\012\uffd3\014\uffd3\001\002" +
    "\000\004\010\uffd5\001\002\000\016\025\uffed\027\uffed\031" +
    "\uffed\033\uffed\034\uffed\035\uffed\001\002\000\016\025\uffec" +
    "\027\uffec\031\uffec\033\uffec\034\uffec\035\uffec\001\002\000" +
    "\026\012\072\023\011\025\uffe9\027\uffe9\030\070\031\uffe9" +
    "\032\077\033\uffe9\034\uffe9\035\uffe9\001\002\000\016\025" +
    "\uffeb\027\uffeb\031\uffeb\033\uffeb\034\uffeb\035\uffeb\001\002" +
    "\000\016\025\uffea\027\uffea\031\uffea\033\uffea\034\uffea\035" +
    "\uffea\001\002\000\016\025\uffee\027\uffee\031\uffee\033\uffee" +
    "\034\uffee\035\uffee\001\002\000\010\007\021\012\025\014" +
    "\020\001\002\000\004\010\154\001\002\000\004\011\155" +
    "\001\002\000\016\012\072\023\011\027\uffe9\030\070\031" +
    "\uffe9\032\077\001\002\000\004\031\157\001\002\000\004" +
    "\004\160\001\002\000\026\012\uffdb\023\uffdb\025\uffdb\027" +
    "\uffdb\030\uffdb\031\uffdb\032\uffdb\033\uffdb\034\uffdb\035\uffdb" +
    "\001\002\000\016\012\072\023\011\025\uffe9\027\uffe9\030" +
    "\070\032\077\001\002\000\004\025\163\001\002\000\004" +
    "\004\164\001\002\000\010\002\ufff7\023\ufff7\024\ufff7\001" +
    "\002\000\004\002\uffff\001\002\000\004\002\ufffe\001\002" +
    "\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\165\000\012\002\003\003\007\004\005\007\004\001" +
    "\001\000\002\001\001\000\010\003\165\004\005\007\004" +
    "\001\001\000\010\003\164\004\005\007\004\001\001\000" +
    "\004\010\046\001\001\000\002\001\001\000\004\005\011" +
    "\001\001\000\002\001\001\000\004\006\015\001\001\000" +
    "\002\001\001\000\010\017\022\021\023\024\021\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\017\022\021\042\024\021\001\001\000\004\023\036" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\012\017\022\020\026\021\027\024\021\001\001" +
    "\000\002\001\001\000\004\022\030\001\001\000\002\001" +
    "\001\000\010\017\022\021\032\024\021\001\001\000\004" +
    "\022\033\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\017\022\024\040" +
    "\001\001\000\004\023\041\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\006\045\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\012\053\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\013\056\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\013\062\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\020\004\070" +
    "\005\072\014\100\015\077\017\073\025\075\026\074\001" +
    "\001\000\002\001\001\000\020\004\070\005\072\014\150" +
    "\015\077\017\073\025\075\026\074\001\001\000\002\001" +
    "\001\000\020\004\070\005\072\014\147\015\077\017\073" +
    "\025\075\026\074\001\001\000\002\001\001\000\020\004" +
    "\070\005\072\014\144\015\077\017\073\025\075\026\074" +
    "\001\001\000\020\004\070\005\072\014\143\015\077\017" +
    "\073\025\075\026\074\001\001\000\002\001\001\000\004" +
    "\016\104\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\017\022\021\105\024\021\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\012\017\022\021\110\024\021\031\111\001\001\000\004" +
    "\032\133\001\001\000\002\001\001\000\002\001\001\000" +
    "\020\004\070\005\072\014\114\015\077\017\073\025\075" +
    "\026\074\001\001\000\004\027\115\001\001\000\004\030" +
    "\125\001\001\000\002\001\001\000\012\017\022\021\110" +
    "\024\021\031\120\001\001\000\002\001\001\000\002\001" +
    "\001\000\020\004\070\005\072\014\123\015\077\017\073" +
    "\025\075\026\074\001\001\000\004\027\124\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\020" +
    "\004\070\005\072\014\130\015\077\017\073\025\075\026" +
    "\074\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\017\022\021\142\024\021\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\020\004\070" +
    "\005\072\014\146\015\077\017\073\025\075\026\074\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\012\017\022\021\110\024\021\031\152\001\001\000" +
    "\002\001\001\000\002\001\001\000\020\004\070\005\072" +
    "\014\155\015\077\017\073\025\075\026\074\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\020" +
    "\004\070\005\072\014\161\015\077\017\073\025\075\026" +
    "\074\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserCup$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserCup$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserCup$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$ParserCup$actions {
  private final ParserCup parser;

  /** Constructor */
  CUP$ParserCup$actions(ParserCup parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$ParserCup$do_action_part00000000(
    int                        CUP$ParserCup$act_num,
    java_cup.runtime.lr_parser CUP$ParserCup$parser,
    java.util.Stack            CUP$ParserCup$stack,
    int                        CUP$ParserCup$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserCup$result;

      /* select the action based on the action number */
      switch (CUP$ParserCup$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= programme EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		RESULT = start_val;
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserCup$parser.done_parsing();
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // programme ::= declaration 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("programme",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // declaration ::= decVar declaration 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("declaration",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // declaration ::= decFonc declaration 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("declaration",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // declaration ::= 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("declaration",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // decVar ::= TYPE NOM autreVar PV 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("decVar",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-3)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // decVar ::= TYPE defVar 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("decVar",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // defVar ::= NOM FLECHE expr PV 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("defVar",3, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-3)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // autreVar ::= VIRGULE NOM autreVar 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("autreVar",4, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // autreVar ::= 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("autreVar",4, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // decFonc ::= DEF nomFonc DP bloc ENDDEF PV 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("decFonc",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-5)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // decFonc ::= DEF TYPE MAIN PO PF DP bloc ENDDEF PV 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("decFonc",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-8)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // nomFonc ::= TYPE NOM PO arguments PF 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("nomFonc",6, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-4)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // arguments ::= TYPE NOM autreArgument 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("arguments",8, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // arguments ::= 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("arguments",8, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // autreArgument ::= VIRGULE TYPE NOM autreArgument 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("autreArgument",9, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-3)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // autreArgument ::= 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("autreArgument",9, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // bloc ::= blocFonc return 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("bloc",10, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // bloc ::= blocFonc 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("bloc",10, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // blocFonc ::= decVar bloc 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("blocFonc",11, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // blocFonc ::= boucle bloc 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("blocFonc",11, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // blocFonc ::= si bloc 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("blocFonc",11, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // blocFonc ::= fonction PV bloc 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("blocFonc",11, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // blocFonc ::= defVar bloc 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("blocFonc",11, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // blocFonc ::= 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("blocFonc",11, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // return ::= RETURN expr PV 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("return",12, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // fonction ::= NOM PO argFonc PF 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("fonction",13, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-3)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // argFonc ::= expr autreExpr 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("argFonc",14, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // argFonc ::= 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("argFonc",14, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // autreExpr ::= VIRGULE expr autreExpr 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("autreExpr",16, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // autreExpr ::= 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("autreExpr",16, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // expr ::= varExpr operation 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expr",15, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // operation ::= SYM varExpr operation 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("operation",17, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // operation ::= 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("operation",17, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // varExpr ::= NOM 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("varExpr",18, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // varExpr ::= fonction 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("varExpr",18, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // varExpr ::= NBR 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("varExpr",18, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // varExpr ::= PO expr PF 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("varExpr",18, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // boucle ::= WHILE PO condition PF DP bloc ENDWHILE PV 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("boucle",19, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-7)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // si ::= IF PO condition PF DP bloc sinonsi sinon ENDIF PV 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("si",20, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-9)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // sinonsi ::= ELSEIF PO condition PF DP bloc sinonsi 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("sinonsi",21, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-6)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // sinonsi ::= 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("sinonsi",21, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // sinon ::= ELSE DP bloc 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("sinon",22, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // sinon ::= 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("sinon",22, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // condition ::= expr comp expr 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("condition",23, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // comp ::= INF 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("comp",24, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // comp ::= SUP 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("comp",24, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // comp ::= EGAL 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("comp",24, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // comp ::= SUPEGAL 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("comp",24, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // comp ::= INFEGAL 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("comp",24, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // comp ::= DIFF 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("comp",24, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$ParserCup$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$ParserCup$do_action(
    int                        CUP$ParserCup$act_num,
    java_cup.runtime.lr_parser CUP$ParserCup$parser,
    java.util.Stack            CUP$ParserCup$stack,
    int                        CUP$ParserCup$top)
    throws java.lang.Exception
    {
              return CUP$ParserCup$do_action_part00000000(
                               CUP$ParserCup$act_num,
                               CUP$ParserCup$parser,
                               CUP$ParserCup$stack,
                               CUP$ParserCup$top);
    }
}

}
