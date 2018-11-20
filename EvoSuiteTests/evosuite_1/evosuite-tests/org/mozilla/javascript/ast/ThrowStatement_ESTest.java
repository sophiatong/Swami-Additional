/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 17:48:26 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.EmptyExpression;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.ast.ThrowStatement;
import org.mozilla.javascript.ast.WithStatement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ThrowStatement_ESTest extends ThrowStatement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ThrowStatement throwStatement0 = new ThrowStatement(2291, 2291);
      ScriptNode scriptNode0 = new ScriptNode(1147);
      throwStatement0.setExpression(scriptNode0);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      throwStatement0.visit(astNode_DebugPrintVisitor0);
      assertEquals("2291\tTHROW 2291 2291\n1147\t  SCRIPT -1144 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("50", throwStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ThrowStatement throwStatement0 = new ThrowStatement(2291, 2291);
      ScriptNode scriptNode0 = new ScriptNode(1147);
      throwStatement0.setExpression(scriptNode0);
      String string0 = throwStatement0.toSource(0);
      assertEquals("throw {\n}\n;\n", string0);
      assertEquals("50", throwStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ThrowStatement throwStatement0 = new ThrowStatement(1, 1);
      throwStatement0.getExpression();
      assertEquals("50", throwStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EmptyExpression emptyExpression0 = new EmptyExpression(0, 0);
      ThrowStatement throwStatement0 = new ThrowStatement(emptyExpression0);
      assertEquals("50", throwStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Name name0 = new Name(0, 0, "l%T%");
      ThrowStatement throwStatement0 = new ThrowStatement(0, name0);
      assertEquals(50, throwStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WithStatement withStatement0 = new WithStatement();
      ThrowStatement throwStatement0 = new ThrowStatement(2735, 0, withStatement0);
      assertEquals("50", throwStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ThrowStatement throwStatement0 = new ThrowStatement(2630);
      assertEquals("50", throwStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ThrowStatement throwStatement0 = new ThrowStatement();
      // Undeclared exception!
      try { 
        throwStatement0.debugPrint();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ThrowStatement", e);
      }
  }
}
