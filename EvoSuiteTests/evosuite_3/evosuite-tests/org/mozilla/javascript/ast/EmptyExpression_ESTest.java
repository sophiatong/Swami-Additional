/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 16:12:40 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.EmptyExpression;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EmptyExpression_ESTest extends EmptyExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmptyExpression emptyExpression0 = new EmptyExpression(0, 0);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      emptyExpression0.visit(astNode_DebugPrintVisitor0);
      assertEquals("0\tEMPTY 0 0\n", astNode_DebugPrintVisitor0.toString());
      assertEquals(129, emptyExpression0.getType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmptyExpression emptyExpression0 = new EmptyExpression(0, 0);
      String string0 = emptyExpression0.toSource(0);
      assertEquals("", string0);
      assertEquals("129", emptyExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmptyExpression emptyExpression0 = new EmptyExpression(6354);
      assertEquals("129", emptyExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EmptyExpression emptyExpression0 = new EmptyExpression();
      assertEquals("129", emptyExpression0.toString());
  }
}
