/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 03:08:41 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Token;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Token_ESTest extends Token_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      // Undeclared exception!
      try { 
        Token.typeToName((-1783));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -1783
         //
         verifyException("org.mozilla.javascript.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      String string0 = Token.typeToName(165);
      assertEquals("ARROW", string0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      String string0 = Token.typeToName(164);
      assertEquals("METHOD", string0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = Token.typeToName(163);
      assertEquals("GENEXPR", string0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = Token.typeToName(162);
      assertEquals("COMMENT", string0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      String string0 = Token.typeToName(161);
      assertEquals("DEBUGGER", string0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = Token.typeToName(159);
      assertEquals("LETEXPR", string0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = Token.typeToName(160);
      assertEquals("WITHEXPR", string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = Token.typeToName(158);
      assertEquals("ARRAYCOMP", string0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = Token.typeToName(156);
      assertEquals("SETCONST", string0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = Token.typeToName(155);
      assertEquals("CONST", string0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = Token.typeToName(73);
      assertEquals("YIELD", string0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      String string0 = Token.typeToName(154);
      assertEquals("LET", string0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String string0 = Token.typeToName(153);
      assertEquals("SET", string0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      String string0 = Token.typeToName(152);
      assertEquals("GET", string0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      String string0 = Token.typeToName(151);
      assertEquals("TO_DOUBLE", string0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      String string0 = Token.typeToName(150);
      assertEquals("TO_OBJECT", string0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      String string0 = Token.typeToName(149);
      assertEquals("XMLEND", string0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      String string0 = Token.typeToName(148);
      assertEquals("XMLATTR", string0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      String string0 = Token.typeToName(147);
      assertEquals("DOTQUERY", string0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      String string0 = Token.typeToName(146);
      assertEquals("XML", string0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      String string0 = Token.typeToName(145);
      assertEquals("COLONCOLON", string0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      String string0 = Token.typeToName(144);
      assertEquals("DOTDOT", string0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      String string0 = Token.typeToName(143);
      assertEquals("SET_REF_OP", string0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      String string0 = Token.typeToName(142);
      assertEquals("LOCAL_BLOCK", string0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      String string0 = Token.typeToName(141);
      assertEquals("SETELEM_OP", string0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      String string0 = Token.typeToName(140);
      assertEquals("SETPROP_OP", string0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      String string0 = Token.typeToName(139);
      assertEquals("USE_STACK", string0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      String string0 = Token.typeToName(138);
      assertEquals("TYPEOFNAME", string0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      String string0 = Token.typeToName(137);
      assertEquals("SCRIPT", string0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      String string0 = Token.typeToName(136);
      assertEquals("JSR", string0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      String string0 = Token.typeToName(135);
      assertEquals("EXPR_RESULT", string0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      String string0 = Token.typeToName(134);
      assertEquals("EXPR_VOID", string0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      String string0 = Token.typeToName(133);
      assertEquals("LOOP", string0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      String string0 = Token.typeToName(132);
      assertEquals("TARGET", string0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      String string0 = Token.typeToName(131);
      assertEquals("LABEL", string0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      String string0 = Token.typeToName(130);
      assertEquals("BLOCK", string0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      String string0 = Token.typeToName(129);
      assertEquals("EMPTY", string0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      String string0 = Token.typeToName(128);
      assertEquals("RESERVED", string0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      String string0 = Token.typeToName(127);
      assertEquals("VOID", string0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      String string0 = Token.typeToName(126);
      assertEquals("FINALLY", string0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      String string0 = Token.typeToName(125);
      assertEquals("CATCH", string0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      String string0 = Token.typeToName(124);
      assertEquals("WITH", string0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      String string0 = Token.typeToName(123);
      assertEquals("VAR", string0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      String string0 = Token.typeToName(122);
      assertEquals("CONTINUE", string0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      String string0 = Token.typeToName(121);
      assertEquals("BREAK", string0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      String string0 = Token.typeToName(120);
      assertEquals("FOR", string0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      String string0 = Token.typeToName(119);
      assertEquals("DO", string0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      String string0 = Token.typeToName(118);
      assertEquals("WHILE", string0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      String string0 = Token.typeToName(117);
      assertEquals("DEFAULT", string0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      String string0 = Token.typeToName(116);
      assertEquals("CASE", string0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      String string0 = Token.typeToName(115);
      assertEquals("SWITCH", string0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      String string0 = Token.typeToName(114);
      assertEquals("ELSE", string0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      String string0 = Token.typeToName(113);
      assertEquals("IF", string0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      String string0 = Token.typeToName(112);
      assertEquals("IMPORT", string0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      String string0 = Token.typeToName(111);
      assertEquals("EXPORT", string0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      String string0 = Token.typeToName(110);
      assertEquals("FUNCTION", string0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      String string0 = Token.typeToName(109);
      assertEquals("DOT", string0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      String string0 = Token.typeToName(108);
      assertEquals("DEC", string0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      String string0 = Token.typeToName(107);
      assertEquals("INC", string0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      String string0 = Token.typeToName(106);
      assertEquals("AND", string0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      String string0 = Token.typeToName(105);
      assertEquals("OR", string0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      String string0 = Token.typeToName(104);
      assertEquals("COLON", string0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      String string0 = Token.typeToName(103);
      assertEquals("HOOK", string0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      String string0 = Token.typeToName(102);
      assertEquals("ASSIGN_MOD", string0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      String string0 = Token.typeToName(101);
      assertEquals("ASSIGN_DIV", string0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      String string0 = Token.typeToName(100);
      assertEquals("ASSIGN_MUL", string0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      String string0 = Token.typeToName(99);
      assertEquals("ASSIGN_SUB", string0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      String string0 = Token.typeToName(98);
      assertEquals("ASSIGN_ADD", string0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      String string0 = Token.typeToName(97);
      assertEquals("ASSIGN_URSH", string0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      String string0 = Token.typeToName(96);
      assertEquals("ASSIGN_RSH", string0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      String string0 = Token.typeToName(95);
      assertEquals("ASSIGN_LSH", string0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      String string0 = Token.typeToName(94);
      assertEquals("ASSIGN_BITAND", string0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      String string0 = Token.typeToName(93);
      assertEquals("ASSIGN_BITXOR", string0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      String string0 = Token.typeToName(92);
      assertEquals("ASSIGN_BITOR", string0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      String string0 = Token.typeToName(91);
      assertEquals("ASSIGN", string0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      String string0 = Token.typeToName(90);
      assertEquals("COMMA", string0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      String string0 = Token.typeToName(89);
      assertEquals("RP", string0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      String string0 = Token.typeToName(88);
      assertEquals("LP", string0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      String string0 = Token.typeToName(87);
      assertEquals("RC", string0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      String string0 = Token.typeToName(86);
      assertEquals("LC", string0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      String string0 = Token.typeToName(85);
      assertEquals("RB", string0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      String string0 = Token.typeToName(84);
      assertEquals("LB", string0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      String string0 = Token.typeToName(83);
      assertEquals("SEMI", string0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      String string0 = Token.typeToName(82);
      assertEquals("TRY", string0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      String string0 = Token.typeToName(81);
      assertEquals("REF_NS_NAME", string0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      String string0 = Token.typeToName(80);
      assertEquals("REF_NAME", string0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      String string0 = Token.typeToName(79);
      assertEquals("REF_NS_MEMBER", string0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = Token.typeToName(78);
      assertEquals("REF_MEMBER", string0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      String string0 = Token.typeToName(76);
      assertEquals("ESCXMLATTR", string0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = Token.typeToName(77);
      assertEquals("ESCXMLTEXT", string0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      String string0 = Token.typeToName(75);
      assertEquals("DEFAULTNAMESPACE", string0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      String string0 = Token.typeToName(72);
      assertEquals("REF_SPECIAL", string0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      String string0 = Token.typeToName(71);
      assertEquals("REF_CALL", string0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      String string0 = Token.typeToName(70);
      assertEquals("DEL_REF", string0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      String string0 = Token.typeToName(69);
      assertEquals("SET_REF", string0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      String string0 = Token.typeToName(68);
      assertEquals("GET_REF", string0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = Token.typeToName(67);
      assertEquals("OBJECTLIT", string0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      String string0 = Token.typeToName(66);
      assertEquals("ARRAYLIT", string0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      String string0 = Token.typeToName(65);
      assertEquals("RETURN_RESULT", string0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      String string0 = Token.typeToName(64);
      assertEquals("THISFN", string0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      String string0 = Token.typeToName(63);
      assertEquals("ENUM_ID", string0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      String string0 = Token.typeToName(62);
      assertEquals("ENUM_NEXT", string0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      String string0 = Token.typeToName(61);
      assertEquals("ENUM_INIT_VALUES_IN_ORDER", string0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      String string0 = Token.typeToName(60);
      assertEquals("ENUM_INIT_ARRAY", string0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      String string0 = Token.typeToName(59);
      assertEquals("ENUM_INIT_VALUES", string0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      String string0 = Token.typeToName(58);
      assertEquals("ENUM_INIT_KEYS", string0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      String string0 = Token.typeToName(57);
      assertEquals("CATCH_SCOPE", string0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      String string0 = Token.typeToName(56);
      assertEquals("SETVAR", string0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      String string0 = Token.typeToName(55);
      assertEquals("GETVAR", string0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      String string0 = Token.typeToName(54);
      assertEquals("LOCAL_LOAD", string0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      String string0 = Token.typeToName(53);
      assertEquals("INSTANCEOF", string0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      String string0 = Token.typeToName(52);
      assertEquals("IN", string0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      String string0 = Token.typeToName(51);
      assertEquals("RETHROW", string0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      String string0 = Token.typeToName(50);
      assertEquals("THROW", string0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      String string0 = Token.typeToName(49);
      assertEquals("BINDNAME", string0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      String string0 = Token.typeToName(48);
      assertEquals("REGEXP", string0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      String string0 = Token.typeToName(47);
      assertEquals("SHNE", string0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      String string0 = Token.typeToName(46);
      assertEquals("SHEQ", string0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      String string0 = Token.typeToName(45);
      assertEquals("TRUE", string0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      String string0 = Token.typeToName(44);
      assertEquals("FALSE", string0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      String string0 = Token.typeToName(43);
      assertEquals("THIS", string0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      String string0 = Token.typeToName(42);
      assertEquals("NULL", string0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      String string0 = Token.typeToName(41);
      assertEquals("STRING", string0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      String string0 = Token.typeToName(40);
      assertEquals("NUMBER", string0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      String string0 = Token.typeToName(39);
      assertEquals("NAME", string0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      String string0 = Token.typeToName(38);
      assertEquals("CALL", string0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      String string0 = Token.typeToName(37);
      assertEquals("SETELEM", string0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      String string0 = Token.typeToName(36);
      assertEquals("GETELEM", string0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      String string0 = Token.typeToName(35);
      assertEquals("SETPROP", string0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      String string0 = Token.typeToName(34);
      assertEquals("GETPROPNOWARN", string0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      String string0 = Token.typeToName(33);
      assertEquals("GETPROP", string0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      String string0 = Token.typeToName(32);
      assertEquals("TYPEOF", string0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      String string0 = Token.typeToName(31);
      assertEquals("DELPROP", string0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      String string0 = Token.typeToName(30);
      assertEquals("NEW", string0);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      String string0 = Token.typeToName(29);
      assertEquals("NEG", string0);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      String string0 = Token.typeToName(28);
      assertEquals("POS", string0);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      String string0 = Token.typeToName(27);
      assertEquals("BITNOT", string0);
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      String string0 = Token.typeToName(26);
      assertEquals("NOT", string0);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      String string0 = Token.typeToName(25);
      assertEquals("MOD", string0);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      String string0 = Token.typeToName(24);
      assertEquals("DIV", string0);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      String string0 = Token.typeToName(23);
      assertEquals("MUL", string0);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      String string0 = Token.typeToName(22);
      assertEquals("SUB", string0);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      String string0 = Token.typeToName(20);
      assertEquals("URSH", string0);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      String string0 = Token.typeToName(19);
      assertEquals("RSH", string0);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      String string0 = Token.typeToName(18);
      assertEquals("LSH", string0);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      String string0 = Token.typeToName(17);
      assertEquals("GE", string0);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      String string0 = Token.typeToName(16);
      assertEquals("GT", string0);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      String string0 = Token.typeToName(15);
      assertEquals("LE", string0);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      String string0 = Token.typeToName(14);
      assertEquals("LT", string0);
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      String string0 = Token.typeToName(13);
      assertEquals("NE", string0);
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      String string0 = Token.typeToName(12);
      assertEquals("EQ", string0);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      String string0 = Token.typeToName(11);
      assertEquals("BITAND", string0);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      String string0 = Token.typeToName(10);
      assertEquals("BITXOR", string0);
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      String string0 = Token.typeToName(9);
      assertEquals("BITOR", string0);
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      String string0 = Token.typeToName(8);
      assertEquals("SETNAME", string0);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      String string0 = Token.typeToName(7);
      assertEquals("IFNE", string0);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      String string0 = Token.typeToName(6);
      assertEquals("IFEQ", string0);
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      String string0 = Token.typeToName(5);
      assertEquals("GOTO", string0);
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      String string0 = Token.typeToName(4);
      assertEquals("RETURN", string0);
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      String string0 = Token.typeToName(3);
      assertEquals("LEAVEWITH", string0);
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      String string0 = Token.typeToName(2);
      assertEquals("ENTERWITH", string0);
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      String string0 = Token.typeToName(1);
      assertEquals("EOL", string0);
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      String string0 = Token.typeToName(0);
      assertEquals("EOF", string0);
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      String string0 = Token.typeToName((-1));
      assertEquals("ERROR", string0);
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      String string0 = Token.typeToName(21);
      assertEquals("ADD", string0);
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      String string0 = Token.name(906);
      assertEquals("906", string0);
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      String string0 = Token.keywordToName(156);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      String string0 = Token.keywordToName(82);
      assertNotNull(string0);
      assertEquals("try", string0);
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      String string0 = Token.keywordToName(50);
      assertEquals("throw", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test170()  throws Throwable  {
      String string0 = Token.keywordToName(53);
      assertEquals("instanceof", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test171()  throws Throwable  {
      String string0 = Token.keywordToName(126);
      assertEquals("finally", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test172()  throws Throwable  {
      String string0 = Token.keywordToName(161);
      assertNotNull(string0);
      assertEquals("debugger", string0);
  }

  @Test(timeout = 4000)
  public void test173()  throws Throwable  {
      String string0 = Token.keywordToName(155);
      assertNotNull(string0);
      assertEquals("const", string0);
  }

  @Test(timeout = 4000)
  public void test174()  throws Throwable  {
      String string0 = Token.keywordToName(125);
      assertNotNull(string0);
      assertEquals("catch", string0);
  }

  @Test(timeout = 4000)
  public void test175()  throws Throwable  {
      String string0 = Token.keywordToName(73);
      assertNotNull(string0);
      assertEquals("yield", string0);
  }

  @Test(timeout = 4000)
  public void test176()  throws Throwable  {
      String string0 = Token.keywordToName(124);
      assertEquals("with", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test177()  throws Throwable  {
      String string0 = Token.keywordToName(118);
      assertNotNull(string0);
      assertEquals("while", string0);
  }

  @Test(timeout = 4000)
  public void test178()  throws Throwable  {
      String string0 = Token.keywordToName(127);
      assertEquals("void", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test179()  throws Throwable  {
      String string0 = Token.keywordToName(123);
      assertNotNull(string0);
      assertEquals("var", string0);
  }

  @Test(timeout = 4000)
  public void test180()  throws Throwable  {
      String string0 = Token.keywordToName(32);
      assertEquals("typeof", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test181()  throws Throwable  {
      String string0 = Token.keywordToName(45);
      assertNotNull(string0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test182()  throws Throwable  {
      String string0 = Token.keywordToName(115);
      assertNotNull(string0);
      assertEquals("switch", string0);
  }

  @Test(timeout = 4000)
  public void test183()  throws Throwable  {
      String string0 = Token.keywordToName(4);
      assertEquals("return", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test184()  throws Throwable  {
      String string0 = Token.keywordToName(42);
      assertEquals("null", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test185()  throws Throwable  {
      String string0 = Token.keywordToName(30);
      assertEquals("new", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test186()  throws Throwable  {
      String string0 = Token.keywordToName(154);
      assertEquals("let", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test187()  throws Throwable  {
      String string0 = Token.keywordToName(52);
      assertNotNull(string0);
      assertEquals("in", string0);
  }

  @Test(timeout = 4000)
  public void test188()  throws Throwable  {
      String string0 = Token.keywordToName(113);
      assertNotNull(string0);
      assertEquals("if", string0);
  }

  @Test(timeout = 4000)
  public void test189()  throws Throwable  {
      String string0 = Token.keywordToName(110);
      assertEquals("function", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test190()  throws Throwable  {
      String string0 = Token.keywordToName(120);
      assertEquals("for", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test191()  throws Throwable  {
      String string0 = Token.keywordToName(44);
      assertNotNull(string0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test192()  throws Throwable  {
      String string0 = Token.keywordToName(114);
      assertEquals("else", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test193()  throws Throwable  {
      String string0 = Token.keywordToName(119);
      assertEquals("do", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test194()  throws Throwable  {
      String string0 = Token.keywordToName(31);
      assertEquals("delete", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test195()  throws Throwable  {
      String string0 = Token.keywordToName(117);
      assertNotNull(string0);
      assertEquals("default", string0);
  }

  @Test(timeout = 4000)
  public void test196()  throws Throwable  {
      String string0 = Token.keywordToName(122);
      assertNotNull(string0);
      assertEquals("continue", string0);
  }

  @Test(timeout = 4000)
  public void test197()  throws Throwable  {
      String string0 = Token.keywordToName(116);
      assertEquals("case", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test198()  throws Throwable  {
      String string0 = Token.keywordToName(121);
      assertEquals("break", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test199()  throws Throwable  {
      String string0 = Token.keywordToName(43);
      assertNotNull(string0);
      assertEquals("this", string0);
  }

  @Test(timeout = 4000)
  public void test200()  throws Throwable  {
      boolean boolean0 = Token.isValidToken((-1228));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test201()  throws Throwable  {
      Token token0 = new Token();
      assertEquals(107, Token.INC);
  }
}
