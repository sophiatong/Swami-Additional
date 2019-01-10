/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 17:40:48 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.BreakStatement;
import org.mozilla.javascript.ast.Label;
import org.mozilla.javascript.ast.Name;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BreakStatement_ESTest extends BreakStatement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement(0, 0);
      Name name0 = new Name(7);
      breakStatement0.setBreakLabel(name0);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      breakStatement0.visit(astNode_DebugPrintVisitor0);
      assertEquals("0\tBREAK 0 0\n7\t  NAME 7 1 null\n", astNode_DebugPrintVisitor0.toString());
      assertEquals(0, breakStatement0.getAbsolutePosition());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement(0, 0);
      String string0 = breakStatement0.toSource(25);
      assertEquals(0, breakStatement0.getLength());
      assertEquals("                                                  break;\n", string0);
      assertEquals(121, breakStatement0.getType());
      assertEquals(0, breakStatement0.getAbsolutePosition());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement(88, 88);
      breakStatement0.getBreakTarget();
      assertEquals(88, breakStatement0.getLength());
      assertEquals(88, breakStatement0.getAbsolutePosition());
      assertEquals("121", breakStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement(121);
      breakStatement0.getBreakLabel();
      assertEquals(121, breakStatement0.getAbsolutePosition());
      assertEquals("121", breakStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement(0, 0);
      Name name0 = new Name(7);
      breakStatement0.setBreakLabel(name0);
      assertEquals(1, name0.depth());
      
      String string0 = breakStatement0.toSource(25);
      assertEquals("                                                  break <null>;\n", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement((-5085));
      Label label0 = new Label(0);
      breakStatement0.setBreakTarget(label0);
      assertEquals(121, breakStatement0.getType());
      assertEquals((-5085), breakStatement0.getPosition());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement();
      assertEquals(121, breakStatement0.getType());
  }
}
