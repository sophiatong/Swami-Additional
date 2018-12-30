/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 17:35:11 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ContinueStatement;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.SwitchCase;
import org.mozilla.javascript.ast.SwitchStatement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SwitchStatement_ESTest extends SwitchStatement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement(3562);
      LinkedList<SwitchCase> linkedList0 = new LinkedList<SwitchCase>();
      SwitchCase switchCase0 = new SwitchCase(1, 4);
      linkedList0.add(switchCase0);
      switchStatement0.setCases(linkedList0);
      Name name0 = new Name(19, "MUeF:0");
      ContinueStatement continueStatement0 = new ContinueStatement(name0);
      switchStatement0.setExpression(continueStatement0);
      assertEquals((-3563), continueStatement0.getPosition());
      
      StringBuilder stringBuilder0 = new StringBuilder("MUeF:0");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      switchStatement0.visit(astNode_DebugPrintVisitor0);
      assertEquals(3562, switchStatement0.getPosition());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement(3562);
      LinkedList<SwitchCase> linkedList0 = new LinkedList<SwitchCase>();
      SwitchCase switchCase0 = new SwitchCase(1, 4);
      linkedList0.add(switchCase0);
      switchStatement0.setCases(linkedList0);
      Name name0 = new Name(19, "MUeF:0");
      ContinueStatement continueStatement0 = new ContinueStatement(name0);
      switchStatement0.setExpression(continueStatement0);
      assertEquals((-3563), continueStatement0.getPosition());
      
      String string0 = switchStatement0.toSource(23);
      assertEquals("                                              switch (continue MUeF:0;\n) {\n                                                default:\n                                              }\n", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement();
      switchStatement0.setRp(22);
      assertEquals(22, switchStatement0.getRp());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement(1704, 1704);
      switchStatement0.setParens((-240), 1704);
      assertEquals(1704, switchStatement0.getRp());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement();
      assertEquals((-1), switchStatement0.getLp());
      
      switchStatement0.setLp(0);
      assertEquals(0, switchStatement0.getLp());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement();
      int int0 = switchStatement0.getRp();
      assertEquals((-1), switchStatement0.getLp());
      assertEquals(115, switchStatement0.getType());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement();
      int int0 = switchStatement0.getLp();
      assertEquals((-1), int0);
      assertEquals("115", switchStatement0.toString());
      assertEquals((-1), switchStatement0.getRp());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement();
      switchStatement0.getExpression();
      assertEquals((-1), switchStatement0.getRp());
      assertEquals((-1), switchStatement0.getLp());
      assertEquals(115, switchStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement(3562);
      LinkedList<SwitchCase> linkedList0 = new LinkedList<SwitchCase>();
      SwitchCase switchCase0 = new SwitchCase(1, 4);
      linkedList0.add(switchCase0);
      switchStatement0.setCases(linkedList0);
      switchStatement0.setCases(linkedList0);
      assertEquals((-1), switchStatement0.getLp());
      assertEquals("115", switchStatement0.toString());
      assertEquals((-1), switchStatement0.getRp());
      assertEquals(3562, switchStatement0.getAbsolutePosition());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement((-1669));
      switchStatement0.setCases((List<SwitchCase>) null);
      assertEquals((-1), switchStatement0.getRp());
      assertEquals((-1669), switchStatement0.getPosition());
      assertEquals(115, switchStatement0.getType());
      assertEquals((-1), switchStatement0.getLp());
  }
}