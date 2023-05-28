
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun May 28 01:36:55 PDT 2023
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sun May 28 01:36:55 PDT 2023
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\063\000\002\002\006\000\002\002\004\000\002\003" +
    "\004\000\002\004\006\000\002\004\002\000\002\005\003" +
    "\000\002\005\003\000\002\005\003\000\002\005\003\000" +
    "\002\005\003\000\002\005\003\000\002\005\003\000\002" +
    "\005\003\000\002\005\003\000\002\005\003\000\002\012" +
    "\004\000\002\020\006\000\002\006\004\000\002\006\002" +
    "\000\002\007\013\000\002\024\003\000\002\024\003\000" +
    "\002\024\003\000\002\024\003\000\002\024\003\000\002" +
    "\024\003\000\002\025\003\000\002\025\003\000\002\016" +
    "\004\000\002\016\002\000\002\017\012\000\002\014\003" +
    "\000\002\014\004\000\002\026\003\000\002\026\003\000" +
    "\002\026\003\000\002\027\003\000\002\027\003\000\002" +
    "\021\005\000\002\021\005\000\002\010\006\000\002\011" +
    "\003\000\002\011\003\000\002\011\005\000\002\011\005" +
    "\000\002\022\011\000\002\023\004\000\002\023\002\000" +
    "\002\015\006\000\002\013\004\000\002\013\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\135\000\004\020\006\001\002\000\004\022\030\001" +
    "\002\000\004\002\026\001\002\000\006\021\007\022\ufffd" +
    "\001\002\000\004\076\011\001\002\000\004\022\uffff\001" +
    "\002\000\026\006\014\007\013\010\016\011\015\012\022" +
    "\013\020\014\017\015\023\016\012\017\021\001\002\000" +
    "\006\021\ufff4\022\ufff4\001\002\000\006\021\ufffb\022\ufffb" +
    "\001\002\000\006\021\ufffc\022\ufffc\001\002\000\006\021" +
    "\ufff9\022\ufff9\001\002\000\006\021\ufffa\022\ufffa\001\002" +
    "\000\006\021\ufff6\022\ufff6\001\002\000\006\021\ufff7\022" +
    "\ufff7\001\002\000\006\021\ufff3\022\ufff3\001\002\000\006" +
    "\021\ufff8\022\ufff8\001\002\000\006\021\ufff5\022\ufff5\001" +
    "\002\000\006\021\007\022\ufffd\001\002\000\004\022\ufffe" +
    "\001\002\000\004\002\000\001\002\000\010\002\uffef\023" +
    "\067\024\uffef\001\002\000\004\030\032\001\002\000\010" +
    "\002\ufff2\023\ufff2\024\ufff2\001\002\000\006\040\033\076" +
    "\040\001\002\000\004\066\055\001\002\000\014\026\uffde" +
    "\031\uffde\034\uffde\040\uffde\076\uffde\001\002\000\014\026" +
    "\uffe0\031\uffe0\034\uffe0\040\uffe0\076\uffe0\001\002\000\006" +
    "\040\033\076\040\001\002\000\014\026\uffdf\031\uffdf\034" +
    "\uffdf\040\uffdf\076\uffdf\001\002\000\006\041\043\066\042" +
    "\001\002\000\014\026\uffe2\031\uffe2\034\uffe2\040\uffe2\076" +
    "\uffe2\001\002\000\004\076\047\001\002\000\006\075\045" +
    "\077\044\001\002\000\014\026\uffda\031\uffda\034\uffda\040" +
    "\uffda\076\uffda\001\002\000\014\026\uffdb\031\uffdb\034\uffdb" +
    "\040\uffdb\076\uffdb\001\002\000\004\067\051\001\002\000" +
    "\006\067\uffcf\076\047\001\002\000\004\067\uffd0\001\002" +
    "\000\014\026\uffd1\031\uffd1\034\uffd1\040\uffd1\076\uffd1\001" +
    "\002\000\010\031\054\040\uffde\076\uffde\001\002\000\014" +
    "\026\uffe1\031\uffe1\034\uffe1\040\uffe1\076\uffe1\001\002\000" +
    "\010\002\ufff1\023\ufff1\024\ufff1\001\002\000\006\075\060" +
    "\076\057\001\002\000\004\067\065\001\002\000\006\042" +
    "\063\067\uffd7\001\002\000\006\042\061\067\uffd8\001\002" +
    "\000\006\075\060\076\057\001\002\000\004\067\uffd6\001" +
    "\002\000\006\075\060\076\057\001\002\000\004\067\uffd5" +
    "\001\002\000\014\026\uffd9\031\uffd9\034\uffd9\040\uffd9\076" +
    "\uffd9\001\002\000\006\002\uffe4\024\102\001\002\000\004" +
    "\025\071\001\002\000\006\002\ufff0\024\ufff0\001\002\000" +
    "\004\076\072\001\002\000\004\066\073\001\002\000\004" +
    "\076\047\001\002\000\004\067\075\001\002\000\004\030" +
    "\076\001\002\000\006\040\033\076\040\001\002\000\010" +
    "\026\100\040\033\076\040\001\002\000\004\031\101\001" +
    "\002\000\006\002\uffee\024\uffee\001\002\000\004\027\105" +
    "\001\002\000\004\002\001\001\002\000\004\002\uffe5\001" +
    "\002\000\004\076\106\001\002\000\004\066\107\001\002" +
    "\000\004\076\047\001\002\000\004\067\111\001\002\000" +
    "\004\030\112\001\002\000\010\032\113\040\033\076\040" +
    "\001\002\000\006\076\122\077\120\001\002\000\010\031" +
    "\uffdd\040\033\076\040\001\002\000\004\031\117\001\002" +
    "\000\004\031\uffdc\001\002\000\004\002\uffe3\001\002\000" +
    "\020\033\uffe7\053\uffe7\054\uffe7\055\uffe7\056\uffe7\057\uffe7" +
    "\060\uffe7\001\002\000\016\053\125\054\124\055\123\056" +
    "\130\057\127\060\131\001\002\000\020\033\uffe6\053\uffe6" +
    "\054\uffe6\055\uffe6\056\uffe6\057\uffe6\060\uffe6\001\002\000" +
    "\006\076\uffed\077\uffed\001\002\000\006\076\uffea\077\uffea" +
    "\001\002\000\006\076\uffeb\077\uffeb\001\002\000\006\076" +
    "\122\077\120\001\002\000\006\076\uffe9\077\uffe9\001\002" +
    "\000\006\076\uffec\077\uffec\001\002\000\006\076\uffe8\077" +
    "\uffe8\001\002\000\004\033\133\001\002\000\006\040\033" +
    "\076\040\001\002\000\012\031\uffd2\034\135\040\033\076" +
    "\040\001\002\000\006\040\033\076\040\001\002\000\004" +
    "\031\uffd4\001\002\000\010\031\uffd3\040\033\076\040\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\135\000\006\002\004\003\003\001\001\000\004\012" +
    "\026\001\001\000\002\001\001\000\004\004\007\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\005\023\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\004\024\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\006\065\001\001\000\004\020\030" +
    "\001\001\000\002\001\001\000\014\010\036\014\035\015" +
    "\033\021\034\026\040\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\010\036\015\051\021" +
    "\034\026\052\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\013\045\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\013\047\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\011\055\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\011\061\001\001\000\002" +
    "\001\001\000\004\011\063\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\016\102\001\001\000\004\007\067" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\013\073\001\001\000\002\001\001\000\002" +
    "\001\001\000\014\010\036\014\076\015\033\021\034\026" +
    "\040\001\001\000\012\010\036\015\033\021\034\026\052" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\017" +
    "\103\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\013\107\001\001\000" +
    "\002\001\001\000\002\001\001\000\020\010\036\014\113" +
    "\015\033\021\034\022\115\026\040\027\114\001\001\000" +
    "\004\025\120\001\001\000\012\010\036\015\033\021\034" +
    "\026\052\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\024\125\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\025\131\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\014\010\036\014\133\015\033\021\034\026\040\001\001" +
    "\000\014\010\036\015\033\021\034\023\135\026\052\001" +
    "\001\000\014\010\036\014\136\015\033\021\034\026\040" +
    "\001\001\000\002\001\001\000\012\010\036\015\033\021" +
    "\034\026\052\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
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
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // PARAMETROS ::= Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAMETROS",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // PARAMETROS ::= Identificador PARAMETROS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAMETROS",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // LLAMADOPROCEFUN ::= Identificador Parentesis_a PARAMETROS Parentesis_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LLAMADOPROCEFUN",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // SINO ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SINO",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // SINO ::= Sino SENTENCIA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SINO",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // SI ::= Si NUMEID COMPARACION NUMEID Entonces SENTENCIA SINO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SI",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // EXPRESION ::= Identificador Suma EXPRESION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // EXPRESION ::= Cadena Suma EXPRESION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // EXPRESION ::= Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // EXPRESION ::= Cadena 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // DIMPRIMIR ::= Imprimir Parentesis_a EXPRESION Parentesis_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DIMPRIMIR",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // ASIGNACION ::= Identificador Igual Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ASIGNACION",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // ASIGNACION ::= Identificador Igual Cadena 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ASIGNACION",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // SISENTENCIA ::= SI 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SISENTENCIA",21, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // SISENTENCIA ::= SENTENCIA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SISENTENCIA",21, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // SINGLE_SENTENCIA ::= LLAMADOPROCEFUN 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SINGLE_SENTENCIA",20, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // SINGLE_SENTENCIA ::= DIMPRIMIR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SINGLE_SENTENCIA",20, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // SINGLE_SENTENCIA ::= ASIGNACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SINGLE_SENTENCIA",20, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // SENTENCIA ::= SENTENCIA SINGLE_SENTENCIA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // SENTENCIA ::= SINGLE_SENTENCIA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // DPROCEDIMIENTOS ::= Procedimiento Identificador Parentesis_a PARAMETROS Parentesis_c Inicio SISENTENCIA Fin 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DPROCEDIMIENTOS",13, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // BLOQUEPROCEDIMIENTOS ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("BLOQUEPROCEDIMIENTOS",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // BLOQUEPROCEDIMIENTOS ::= Procedimientos DPROCEDIMIENTOS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("BLOQUEPROCEDIMIENTOS",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // NUMEID ::= Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("NUMEID",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // NUMEID ::= Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("NUMEID",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // COMPARACION ::= MenorIgual 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPARACION",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // COMPARACION ::= MayorIgual 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPARACION",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // COMPARACION ::= MenorQue 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPARACION",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // COMPARACION ::= MayorQue 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPARACION",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // COMPARACION ::= Diferente 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPARACION",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // COMPARACION ::= Igualdad 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPARACION",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // DFUNCION ::= Funcion Identificador Parentesis_a PARAMETROS Parentesis_c Inicio SENTENCIA Devolver Fin 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DFUNCION",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // BLOQUEFUNCION ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("BLOQUEFUNCION",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // BLOQUEFUNCION ::= Funciones DFUNCION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("BLOQUEFUNCION",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // DCODIGOPRINCIPAL ::= Inicio SENTENCIA LLAMADOPROCEFUN Fin 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DCODIGOPRINCIPAL",14, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // BLOQUECODIGOPRINCIPAL ::= CodigoPrincipal DCODIGOPRINCIPAL 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("BLOQUECODIGOPRINCIPAL",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // TIPODATO ::= Tcurp 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPODATO",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // TIPODATO ::= Trfc 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPODATO",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // TIPODATO ::= Thora 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPODATO",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // TIPODATO ::= Tfecha 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPODATO",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // TIPODATO ::= Tfechahora 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPODATO",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // TIPODATO ::= TLogico 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPODATO",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // TIPODATO ::= Ttexto 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPODATO",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // TIPODATO ::= Tsimbolo 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPODATO",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // TIPODATO ::= Tdecimal 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPODATO",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // TIPODATO ::= Tentero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPODATO",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // DVARIABLE ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DVARIABLE",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // DVARIABLE ::= Variable Identificador TIPODATO DVARIABLE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DVARIABLE",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // BLOQUEVARIABLE ::= Variables DVARIABLE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("BLOQUEVARIABLE",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= PROGRAMA EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // PROGRAMA ::= BLOQUEVARIABLE BLOQUECODIGOPRINCIPAL BLOQUEFUNCION BLOQUEPROCEDIMIENTOS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PROGRAMA",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

