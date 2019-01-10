/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 18:17:57 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NumberLiteral;
import org.mozilla.javascript.ast.ObjectLiteral;
import org.mozilla.javascript.ast.WithStatement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class WithStatement_ESTest extends WithStatement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement((-352));
      NumberLiteral numberLiteral0 = new NumberLiteral(0, (-1130));
      withStatement0.setExpression(numberLiteral0);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        withStatement0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.WithStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement();
      // Undeclared exception!
      try { 
        withStatement0.debugPrint();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.WithStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement((-352));
      // Undeclared exception!
      try { 
        withStatement0.toSource(4179);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.WithStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement(0, 0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      withStatement0.setStatement(objectLiteral0);
      assertEquals((-1), withStatement0.getRp());
      assertEquals((-1), withStatement0.getLp());
      assertEquals("124", withStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement();
      withStatement0.setRp((-1888));
      assertEquals((-1888), withStatement0.getRp());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement();
      withStatement0.setParens(0, 0);
      assertEquals(0, withStatement0.getLp());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement();
      withStatement0.setLp((-287));
      assertEquals((-287), withStatement0.getLp());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement(4901);
      withStatement0.getStatement();
      assertEquals((-1), withStatement0.getRp());
      assertEquals((-1), withStatement0.getLp());
      assertEquals(124, withStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement();
      int int0 = withStatement0.getLp();
      assertEquals((-1), withStatement0.getRp());
      assertEquals("124", withStatement0.toString());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement(0, 0);
      int int0 = withStatement0.getRp();
      assertEquals((-1), withStatement0.getLp());
      assertEquals(124, withStatement0.getType());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement((-352));
      NumberLiteral numberLiteral0 = new NumberLiteral(2);
      withStatement0.setExpression(numberLiteral0);
      // Undeclared exception!
      try { 
        withStatement0.toSource(4179);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.WithStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement();
      withStatement0.getExpression();
      assertEquals((-1), withStatement0.getLp());
      assertEquals((-1), withStatement0.getRp());
      assertEquals("124", withStatement0.toString());
  }
}
