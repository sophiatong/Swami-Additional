/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 17:07:12 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.EmptyStatement;
import org.mozilla.javascript.ast.ExpressionStatement;
import org.mozilla.javascript.ast.RegExpLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ExpressionStatement_ESTest extends ExpressionStatement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegExpLiteral regExpLiteral0 = new RegExpLiteral();
      ExpressionStatement expressionStatement0 = new ExpressionStatement(regExpLiteral0);
      StringBuffer stringBuffer0 = new StringBuffer();
      StringBuilder stringBuilder0 = new StringBuilder(stringBuffer0);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      expressionStatement0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tEXPR_VOID -1 1\n-1\t  REGEXP 0 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals(134, expressionStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RegExpLiteral regExpLiteral0 = new RegExpLiteral();
      ExpressionStatement expressionStatement0 = new ExpressionStatement(regExpLiteral0);
      String string0 = expressionStatement0.toSource(5);
      assertEquals("          /null/;\n", string0);
      assertEquals("134", expressionStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmptyStatement emptyStatement0 = new EmptyStatement(1, 134);
      ExpressionStatement expressionStatement0 = new ExpressionStatement(emptyStatement0, true);
      assertEquals("135", expressionStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EmptyStatement emptyStatement0 = new EmptyStatement(0, 134);
      ExpressionStatement expressionStatement0 = new ExpressionStatement(emptyStatement0, false);
      boolean boolean0 = expressionStatement0.hasSideEffects();
      assertFalse(boolean0);
      assertEquals("134", expressionStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ExpressionStatement expressionStatement0 = new ExpressionStatement((-298), 1420);
      assertEquals(134, expressionStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ExpressionStatement expressionStatement0 = new ExpressionStatement();
      assertEquals("134", expressionStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EmptyStatement emptyStatement0 = new EmptyStatement(0, 134);
      ExpressionStatement expressionStatement0 = new ExpressionStatement(emptyStatement0, false);
      AstNode astNode0 = expressionStatement0.getExpression();
      assertNotNull(astNode0);
      assertEquals("134", expressionStatement0.toString());
  }
}
