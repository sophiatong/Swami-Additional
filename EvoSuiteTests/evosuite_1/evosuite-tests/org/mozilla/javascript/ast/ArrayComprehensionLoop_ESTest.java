/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 17:12:56 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.ArrayComprehensionLoop;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ContinueStatement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArrayComprehensionLoop_ESTest extends ArrayComprehensionLoop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop();
      ContinueStatement continueStatement0 = new ContinueStatement(18, 1);
      arrayComprehensionLoop0.setIterator(continueStatement0);
      arrayComprehensionLoop0.setIteratedObject(continueStatement0);
      StringBuilder stringBuilder0 = new StringBuilder(7);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      arrayComprehensionLoop0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tFOR -1 1\n18\t  CONTINUE 19 1\n18\t  CONTINUE 19 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("-1\tFOR -1 1\n18\t  CONTINUE 19 1\n18\t  CONTINUE 19 1\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop();
      ContinueStatement continueStatement0 = new ContinueStatement(5, 2);
      arrayComprehensionLoop0.setIterator(continueStatement0);
      // Undeclared exception!
      try { 
        arrayComprehensionLoop0.toSource();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ArrayComprehensionLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop();
      // Undeclared exception!
      try { 
        arrayComprehensionLoop0.setBody((AstNode) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // this node type has no body
         //
         verifyException("org.mozilla.javascript.ast.ArrayComprehensionLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop(477, 477);
      assertEquals(17, Node.NAME_PROP);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop(72);
      assertEquals(72, arrayComprehensionLoop0.getPosition());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop();
      AstNode astNode0 = arrayComprehensionLoop0.getBody();
      assertNull(astNode0);
  }
}
