/* Generated By:JavaCC: Do not edit this line. Proyecto1TokenManager.java */
package uniandes.teolen.parserJavaCC.Proyecto1;

/** Token Manager. */
public class Proyecto1TokenManager implements Proyecto1Constants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x101f07e00L) != 0L)
            return 17;
         return -1;
      case 1:
         if ((active0 & 0x101f07c00L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 1;
            return 17;
         }
         return -1;
      case 2:
         if ((active0 & 0x101f07c00L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 2;
            return 17;
         }
         return -1;
      case 3:
         if ((active0 & 0x101f01800L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 3;
            return 17;
         }
         if ((active0 & 0x2000L) != 0L)
            return 17;
         if ((active0 & 0x4000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 31;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      case 4:
         if ((active0 & 0x800L) != 0L)
            return 17;
         if ((active0 & 0x1f01000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 4;
            return 17;
         }
         if ((active0 & 0x4000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 31;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      case 5:
         if ((active0 & 0x1f01000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 5;
            return 17;
         }
         if ((active0 & 0x4000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 31;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      case 6:
         if ((active0 & 0x1f01000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 6;
            return 17;
         }
         if ((active0 & 0x4000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 31;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0x100000L) != 0L)
            return 17;
         if ((active0 & 0x1e01000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 7;
            return 17;
         }
         return -1;
      case 8:
         if ((active0 & 0x800000L) != 0L)
            return 17;
         if ((active0 & 0x1601000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 8;
            return 17;
         }
         return -1;
      case 9:
         if ((active0 & 0x1000L) != 0L)
            return 17;
         if ((active0 & 0x1000000L) != 0L)
         {
            if (jjmatchedPos < 8)
            {
               jjmatchedKind = 31;
               jjmatchedPos = 8;
            }
            return -1;
         }
         if ((active0 & 0x600000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 9;
            return 17;
         }
         return -1;
      case 10:
         if ((active0 & 0x200000L) != 0L)
            return 17;
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 10;
            return 17;
         }
         if ((active0 & 0x1000000L) != 0L)
         {
            if (jjmatchedPos < 8)
            {
               jjmatchedKind = 31;
               jjmatchedPos = 8;
            }
            return -1;
         }
         return -1;
      case 11:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 11;
            return 17;
         }
         return -1;
      case 12:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 12;
            return 17;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 18);
      case 41:
         return jjStopAtPos(0, 19);
      case 42:
         return jjStopAtPos(0, 7);
      case 43:
         return jjStopAtPos(0, 5);
      case 44:
         return jjStopAtPos(0, 17);
      case 45:
         return jjStopAtPos(0, 6);
      case 47:
         return jjStopAtPos(0, 8);
      case 58:
         return jjStopAtPos(0, 15);
      case 61:
         return jjStopAtPos(0, 16);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 68:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 85:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 86:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 104:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 73:
         return jjMoveStringLiteralDfa2_0(active0, 0x4800L);
      case 82:
         return jjMoveStringLiteralDfa2_0(active0, 0x3000L);
      case 95:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x1800000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 67:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 78:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 82:
         return jjMoveStringLiteralDfa3_0(active0, 0x600L);
      case 84:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0xa00000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 32:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(3, 10);
         break;
      case 69:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 73:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 78:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 79:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(3, 13, 17);
         break;
      case 95:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 102:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 105:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(3, 31, 17);
         break;
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 68:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(4, 9);
         break;
      case 79:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 17);
         break;
      case 82:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 83:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      case 73:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000L);
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000L);
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000L);
      case 109:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000L);
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000L);
      case 68:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(6, 14);
         break;
      case 100:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000L);
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x1400000L);
      case 109:
         return jjMoveStringLiteralDfa7_0(active0, 0x100000L);
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000L);
      case 97:
         return jjMoveStringLiteralDfa8_0(active0, 0x800000L);
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x200000L);
      case 101:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(7, 20, 17);
         break;
      case 110:
         return jjMoveStringLiteralDfa8_0(active0, 0x400000L);
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 79:
         return jjMoveStringLiteralDfa9_0(active0, 0x1000L);
      case 100:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(8, 23, 17);
         break;
      case 105:
         return jjMoveStringLiteralDfa9_0(active0, 0x600000L);
      case 110:
         return jjMoveStringLiteralDfa9_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 78:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(9, 12, 17);
         break;
      case 95:
         return jjMoveStringLiteralDfa10_0(active0, 0x1000000L);
      case 97:
         return jjMoveStringLiteralDfa10_0(active0, 0x200000L);
      case 115:
         return jjMoveStringLiteralDfa10_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 105:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(10, 24);
         break;
      case 108:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(10, 21, 17);
         break;
      case 116:
         return jjMoveStringLiteralDfa11_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa12_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
static private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa13_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
static private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 111:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(13, 22, 17);
         break;
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 17;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 17:
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAddTwoStates(2, 3);
                  break;
               case 1:
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjCheckNAdd(0);
                  break;
               case 5:
                  if (curChar == 49 && kind > 25)
                     kind = 25;
                  break;
               case 8:
                  if (curChar == 50 && kind > 25)
                     kind = 25;
                  break;
               case 11:
                  if (curChar == 51 && kind > 25)
                     kind = 25;
                  break;
               case 14:
                  if (curChar == 52 && kind > 25)
                     kind = 25;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 17:
               case 3:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAddTwoStates(2, 3);
                  break;
               case 1:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(2, 3);
                  if (curChar == 114)
                     jjAddStates(0, 3);
                  break;
               case 4:
                  if (curChar == 114)
                     jjAddStates(0, 3);
                  break;
               case 6:
                  if (curChar == 103)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 9:
                  if (curChar == 103)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 12:
                  if (curChar == 103)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 15:
                  if (curChar == 103)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 17 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   7, 10, 13, 16, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\53", "\55", "\52", "\57", 
"\120\137\122\105\104", "\126\101\122\40", "\123\111\124\111\117", 
"\124\122\101\116\123\111\103\111\117\116", "\101\122\103\117", "\106\111\116\137\122\105\104", "\72", "\75", "\54", 
"\50", "\51", "\125\156\151\146\157\162\155\145", 
"\105\170\160\157\156\145\156\143\151\141\154", "\104\145\164\145\162\155\151\156\151\163\164\151\143\157", 
"\143\141\160\141\143\151\144\141\144", "\155\141\162\143\141\143\151\157\156\137\151", null, null, null, null, null, 
null, null, "\150\157\154\151", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x187ffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[17];
static private final int[] jjstateSet = new int[34];
static protected char curChar;
/** Constructor. */
public Proyecto1TokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public Proyecto1TokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 17; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
