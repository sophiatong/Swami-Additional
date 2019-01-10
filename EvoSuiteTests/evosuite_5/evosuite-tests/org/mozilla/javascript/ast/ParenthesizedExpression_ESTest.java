/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 17:31:36 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.BreakStatement;
import org.mozilla.javascript.ast.ParenthesizedExpression;
import org.mozilla.javascript.ast.SwitchCase;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ParenthesizedExpression_ESTest extends ParenthesizedExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase();
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression((-2370), 0, switchCase0);
      String string0 = parenthesizedExpression0.debugPrint();
      assertEquals("-2370\tLP -2370 0\n-1\t  CASE 2369 1\n", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(367, 367);
      parenthesizedExpression0.getExpression();
      assertEquals(88, parenthesizedExpression0.getType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement();
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(breakStatement0);
      assertEquals("88", parenthesizedExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression((-3415));
      // Undeclared exception!
      try { 
        parenthesizedExpression0.toSource(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ParenthesizedExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression();
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        parenthesizedExpression0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ParenthesizedExpression", e);
      }
  }
}
