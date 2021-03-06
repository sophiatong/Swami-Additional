/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 18:12:08 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ForInLoop;
import org.mozilla.javascript.ast.ForLoop;
import org.mozilla.javascript.ast.NumberLiteral;
import org.mozilla.javascript.ast.StringLiteral;
import org.mozilla.javascript.ast.SwitchCase;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ForLoop_ESTest extends ForLoop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ForLoop forLoop0 = new ForLoop();
      // Undeclared exception!
      try { 
        forLoop0.debugPrint();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ForLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ForLoop forLoop0 = new ForLoop();
      SwitchCase switchCase0 = new SwitchCase(0);
      forLoop0.setInitializer(switchCase0);
      // Undeclared exception!
      try { 
        forLoop0.toSource(21);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ForLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ForLoop forLoop0 = new ForLoop();
      StringLiteral stringLiteral0 = new StringLiteral(356, 753);
      forLoop0.setInitializer(stringLiteral0);
      StringBuilder stringBuilder0 = new StringBuilder(23);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        forLoop0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ForLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ForLoop forLoop0 = new ForLoop();
      NumberLiteral numberLiteral0 = new NumberLiteral(0, "");
      forLoop0.setIncrement(numberLiteral0);
      assertEquals("120", forLoop0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ForLoop forLoop0 = new ForLoop(116, 116);
      forLoop0.getIncrement();
      assertEquals("120", forLoop0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ForLoop forLoop0 = new ForLoop(92, 92);
      ForInLoop forInLoop0 = new ForInLoop(1, 0);
      forLoop0.setCondition(forInLoop0);
      assertEquals(120, forLoop0.getType());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ForLoop forLoop0 = new ForLoop(0);
      forLoop0.getInitializer();
      assertEquals("120", forLoop0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ForLoop forLoop0 = new ForLoop();
      forLoop0.getCondition();
      assertEquals(120, forLoop0.getType());
  }
}
