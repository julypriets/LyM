/* Generated By:JavaCC: Do not edit this line. Proyecto1.java */
package uniandes.teolen.parserJavaCC.Proyecto1;
import java.util.*;
public class Proyecto1 implements Proyecto1Constants {
        ArrayList < String > variables = new ArrayList<String>();
        ArrayList < String > sitios = new ArrayList<String>();
        ArrayList < String > transiciones = new ArrayList<String>();

  final public void pRed() throws ParseException, Error {
    jj_consume_token(P_RED);
    jj_consume_token(NOMBRE);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VAR:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      var();
    }
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SITIO:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_2;
      }
      sitio();
    }
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case TRANSICION:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_3;
      }
      transicion();
    }
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ARCO:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_4;
      }
      arco();
    }
    jj_consume_token(FIN_RED);
  }

  final public void var() throws ParseException, Error {
 Token t1;
    jj_consume_token(VAR);
    t1 = jj_consume_token(NOMBRE);
    jj_consume_token(IGUAL);
    jj_consume_token(num);
   boolean encontrado = false;
   for(int i = 0; i<variables.size() && !encontrado; i++) {
     if(variables.get(i).equals(t1.image)) {
      encontrado = true;
 }
   if(encontrado) { {if (true) throw new Error("La variable ya se encontraba declarada previamente :c");} }
   else {  variables.add(t1.image); }
   }
  }

  final public void sitio() throws ParseException {
 Token t1; Token v; String variable;
    jj_consume_token(SITIO);
    jj_consume_token(DOS_PUNTOS);
    t1 = jj_consume_token(NOMBRE);
   boolean encontrado = false;
   for(int i = 0; i<sitios.size() && !encontrado; i++) {
     if(sitios.get(i).equals(t1.image)) {
       encontrado = true;
   }
   if(encontrado) { {if (true) throw new Error("El sitio ya se encontraba declarada previamente :c");} }
   else { sitios.add(t1.image); }
   }
    jj_consume_token(CAPACIDAD);
    jj_consume_token(DOS_PUNTOS);
    jj_consume_token(IGUAL);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case num:
      jj_consume_token(num);
      break;
    case NOMBRE:
      verificarVar();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
      case MINUS:
      case MULTIPLY:
      case DIVIDE:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PLUS:
          jj_consume_token(PLUS);
          break;
        case MINUS:
          jj_consume_token(MINUS);
          break;
        case MULTIPLY:
          jj_consume_token(MULTIPLY);
          break;
        case DIVIDE:
          jj_consume_token(DIVIDE);
          break;
        default:
          jj_la1[4] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        verificarVar();
        break;
      default:
        jj_la1[5] = jj_gen;
        ;
      }
      break;
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(MARCACION);
    jj_consume_token(DOS_PUNTOS);
    jj_consume_token(IGUAL);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case num:
      jj_consume_token(num);
      break;
    case CAPACIDAD:
      jj_consume_token(CAPACIDAD);
      break;
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void transicion() throws ParseException {
 Token t; Token t1;
    jj_consume_token(TRANSICION);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NOMBRE:
      t = jj_consume_token(NOMBRE);
    //Solo crea transiciones si no existen antes. 
   boolean encontrado1 = false;
   for(int i = 0; i<transiciones.size() && !encontrado1; i++) {
     if(transiciones.get(i).equals(t.image)) {
       encontrado1 = true;
   }
   if(encontrado1) { {if (true) throw new Error("La transicion ya se encontraba declarada previamente :c");} }
   else { transiciones.add(t.image); }
   }
      break;
    case AP:
      jj_consume_token(AP);
      t1 = jj_consume_token(NOMBRE);
   //Solo crea transiciones si no existen antes. 
   boolean encontrado = false;
   for(int i = 0; i<transiciones.size() && !encontrado; i++) {
     if(transiciones.get(i).equals(t1.image)) {
       encontrado = true;
   }
   if(encontrado) { {if (true) throw new Error("La transicion ya se encontraba declarada previamente :c");} }
   else { transiciones.add(t1.image); }
   }
      jj_consume_token(COMA);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case EXPONENCIAL:
        jj_consume_token(EXPONENCIAL);
        jj_consume_token(COMA);
        dobleParametro();
        break;
      case DETERMINISTICO:
        jj_consume_token(DETERMINISTICO);
        jj_consume_token(COMA);
        parametro();
        break;
      case UNIFORME:
        jj_consume_token(UNIFORME);
        jj_consume_token(COMA);
        dobleParametro();
        break;
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(CP);
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void dobleParametro() throws ParseException {
    parametro();
    jj_consume_token(COMA);
    parametro();
  }

  final public void parametro() throws ParseException {
    exp();
  }

  final public void arco() throws ParseException {
    jj_consume_token(ARCO);
    jj_consume_token(AP);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NOMBRE:
      arcoEntrando();
      break;
      arco2();
      break;
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(CP);
  }

  final public void arcoEntrando() throws ParseException {
 Token t1; Token t2; Token t3;
    t3 = jj_consume_token(NOMBRE);
    jj_consume_token(DOS_PUNTOS);
    t1 = jj_consume_token(NOMBRE);
    jj_consume_token(COMA);
    t2 = jj_consume_token(NOMBRE);
    Boolean sitio1 = false;
    Boolean sitio2 = false;
    Boolean transicion1 = false;
    Boolean transicion2 = false;

      boolean encontrado1 = false;
   for(int i = 0; i<transiciones.size() && !encontrado1; i++) {
     if(transiciones.get(i).equals(t1.image)) {
       encontrado1 = true;
       transicion1=true;
   }
   if(!encontrado1) { {if (true) throw new Error("La variable no existe :'v");} }
   }

   for(int i = 0; i<sitios.size() && !encontrado1; i++) {
     if(sitios.get(i).equals(t1.image)) {
       encontrado1 = true;
       sitio1=true;
   }
   if(!encontrado1) { {if (true) throw new Error("La variable no existe :'v");} }
 }

 boolean encontrado2 = false;
   for(int i = 0; i<transiciones.size() && !encontrado2; i++) {
     if(transiciones.get(i).equals(t2.image)) {
       encontrado2 = true;
       transicion2=true;
   }
   if(!encontrado2) { {if (true) throw new Error("La variable no existe :'v");} }
   }

   for(int i = 0; i<sitios.size() && !encontrado2; i++) {
     if(sitios.get(i).equals(t2.image)) {
       encontrado2 = true;
       sitio2=true;
   }
   if(!encontrado2) { {if (true) throw new Error("La variable no existe :'v");} }
 }


 if((sitio1&&sitio2)||(transicion1&&transicion2))
 {
{if (true) throw new Error("No puede haber arcos entre dos elementos del mismo tipo.");}
 }
  }

  final public void arco2() throws ParseException {
 Token t1; Token t2;
    t1 = jj_consume_token(NOMBRE);
    jj_consume_token(COMA);
    t2 = jj_consume_token(NOMBRE);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case COMA:
      jj_consume_token(COMA);
      parametro();
      break;
    default:
      jj_la1[11] = jj_gen;
      ;
    }
    Boolean sitio1 = false;
    Boolean sitio2 = false;
    Boolean transicion1 = false;
    Boolean transicion2 = false;

      boolean encontrado1 = false;
   for(int i = 0; i<transiciones.size() && !encontrado1; i++) {
     if(transiciones.get(i).equals(t1.image)) {
       encontrado1 = true;
       transicion1=true;
   }
   if(!encontrado1) { {if (true) throw new Error("La variable no existe :'v");} }
   }

   for(int i = 0; i<sitios.size() && !encontrado1; i++) {
     if(sitios.get(i).equals(t1.image)) {
       encontrado1 = true;
       sitio1=true;
   }
   if(!encontrado1) { {if (true) throw new Error("La variable no existe :'v");} }
 }

 boolean encontrado2 = false;
   for(int i = 0; i<transiciones.size() && !encontrado2; i++) {
     if(transiciones.get(i).equals(t2.image)) {
       encontrado2 = true;
       transicion2=true;
   }
   if(!encontrado2) { {if (true) throw new Error("La variable no existe :'v");} }
   }

   for(int i = 0; i<sitios.size() && !encontrado2; i++) {
     if(sitios.get(i).equals(t2.image)) {
       encontrado2 = true;
       sitio2=true;
   }
   if(!encontrado2) { {if (true) throw new Error("La variable no existe :'v");} }
 }


 if((sitio1&&sitio2)||(transicion1&&transicion2))
 {
{if (true) throw new Error("No puede haber arcos entre dos elementos del mismo tipo.");}
 }
  }

  final public void verificarVar() throws ParseException {
 Token t;
    t = jj_consume_token(NOMBRE);
    //Si la variable no existe, sale un error
  boolean encontrado = false;
   for(int i = 0; i<variables.size() && !encontrado; i++) {
     if(variables.get(i).equals(t.image)) {
       encontrado = true;
   }
   if(!encontrado) { {if (true) throw new Error("La variable no existe :'v");} }
   }
  }

  final public void exp() throws ParseException {
    term();
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
      case MINUS:
        ;
        break;
      default:
        jj_la1[12] = jj_gen;
        break label_5;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
        jj_consume_token(PLUS);
        term();
        break;
      case MINUS:
        jj_consume_token(MINUS);
        term();
        break;
      default:
        jj_la1[13] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  final public void term() throws ParseException {
    fact();
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MULTIPLY:
      case DIVIDE:
        ;
        break;
      default:
        jj_la1[14] = jj_gen;
        break label_6;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MULTIPLY:
        jj_consume_token(MULTIPLY);
        fact();
        break;
      case DIVIDE:
        jj_consume_token(DIVIDE);
        fact();
        break;
      default:
        jj_la1[15] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  final public void fact() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MINUS:
      jj_consume_token(MINUS);
      break;
    default:
      jj_la1[16] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case num:
    case NOMBRE:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case num:
        jj_consume_token(num);
        break;
      case NOMBRE:
        verificarVar();
        break;
      default:
        jj_la1[17] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    case AP:
      jj_consume_token(AP);
      exp();
      jj_consume_token(CP);
      break;
    default:
      jj_la1[18] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  /** Generated Token Manager. */
  public Proyecto1TokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[19];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x4000,0x1000000,0x800000,0x400000,0x1e0,0x1e0,0x10000000,0x10040000,0x38000,0x1000,0x0,0x800,0x60,0x60,0x180,0x180,0x40,0x10000000,0x10001000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x1,0x0,0x0,0x1,0x1,0x0,0x0,0x0,0x0,0x0,0x0,0x1,0x1,};
   }

  /** Constructor with InputStream. */
  public Proyecto1(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Proyecto1(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new Proyecto1TokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Proyecto1(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new Proyecto1TokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Proyecto1(Proyecto1TokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(Proyecto1TokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[33];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 19; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 33; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
