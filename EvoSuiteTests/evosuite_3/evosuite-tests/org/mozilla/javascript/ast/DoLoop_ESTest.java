/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 16:49:34 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ConditionalExpression;
import org.mozilla.javascript.ast.DoLoop;
import org.mozilla.javascript.ast.ErrorNode;
import org.mozilla.javascript.ast.StringLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DoLoop_ESTest extends DoLoop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("^J(uPE!FHVw");
      DoLoop doLoop0 = new DoLoop();
      StringLiteral stringLiteral0 = new StringLiteral(24);
      doLoop0.body = (AstNode) stringLiteral0;
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        doLoop0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.DoLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop();
      ErrorNode errorNode0 = new ErrorNode();
      doLoop0.setBody(errorNode0);
      // Undeclared exception!
      try { 
        doLoop0.toSource(8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.DoLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop();
      assertEquals((-1), doLoop0.getWhilePosition());
      
      doLoop0.setWhilePosition(0);
      assertEquals(0, doLoop0.getWhilePosition());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop();
      ConditionalExpression conditionalExpression0 = new ConditionalExpression(14);
      doLoop0.setCondition(conditionalExpression0);
      assertEquals((-1), doLoop0.getWhilePosition());
      assertEquals(119, doLoop0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop();
      int int0 = doLoop0.getWhilePosition();
      assertEquals((-1), int0);
      assertEquals(119, doLoop0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop(0, 94);
      assertEquals(119, doLoop0.getType());
      assertEquals((-1), doLoop0.getWhilePosition());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop(137);
      assertEquals("119", doLoop0.toString());
      assertEquals((-1), doLoop0.getWhilePosition());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop();
      doLoop0.getCondition();
      assertEquals((-1), doLoop0.getWhilePosition());
      assertEquals(119, doLoop0.getType());
  }
}
