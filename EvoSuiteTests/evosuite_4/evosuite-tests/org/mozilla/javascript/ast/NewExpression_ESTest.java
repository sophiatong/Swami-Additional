/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 16:25:08 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ContinueStatement;
import org.mozilla.javascript.ast.FunctionCall;
import org.mozilla.javascript.ast.NewExpression;
import org.mozilla.javascript.ast.ObjectLiteral;
import org.mozilla.javascript.ast.StringLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NewExpression_ESTest extends NewExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(1, 11);
      newExpression0.setInitializer(objectLiteral0);
      StringBuilder stringBuilder0 = new StringBuilder(20);
      StringLiteral stringLiteral0 = new StringLiteral(7, 8);
      newExpression0.setTarget(stringLiteral0);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      newExpression0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tNEW -1 1\n7\t  STRING 8 8\n1\t  OBJECTLIT 2 11\n", astNode_DebugPrintVisitor0.toString());
      assertEquals(30, newExpression0.getType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(1, 11);
      StringBuilder stringBuilder0 = new StringBuilder(20);
      newExpression0.addArgument(objectLiteral0);
      StringLiteral stringLiteral0 = new StringLiteral(7, 8);
      newExpression0.setTarget(stringLiteral0);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      newExpression0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tNEW -1 1\n7\t  STRING 8 8\n1\t  OBJECTLIT 2 11\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("30", newExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression();
      ContinueStatement continueStatement0 = new ContinueStatement(8, 24);
      newExpression0.setTarget(continueStatement0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral((-561));
      newExpression0.setInitializer(objectLiteral0);
      assertEquals(1, objectLiteral0.depth());
      
      String string0 = newExpression0.toSource(0);
      assertEquals("new continue;\n() {}", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression();
      List<AstNode> list0 = FunctionCall.NO_ARGS;
      newExpression0.arguments = list0;
      ContinueStatement continueStatement0 = new ContinueStatement(8, 24);
      newExpression0.setTarget(continueStatement0);
      String string0 = newExpression0.toSource(0);
      assertEquals("30", newExpression0.toString());
      assertEquals("new continue;\n()", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression(12, 1);
      assertEquals("30", newExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression(122);
      assertEquals(30, newExpression0.getType());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression();
      newExpression0.getInitializer();
      assertEquals(30, newExpression0.getType());
  }
}
