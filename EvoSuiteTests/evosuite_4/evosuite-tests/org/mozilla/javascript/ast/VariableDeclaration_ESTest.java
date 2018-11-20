/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 15:37:26 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.VariableDeclaration;
import org.mozilla.javascript.ast.VariableInitializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VariableDeclaration_ESTest extends VariableDeclaration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      String string0 = variableDeclaration0.debugPrint();
      assertEquals("-1\tVAR -1 1\n", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      // Undeclared exception!
      try { 
        variableDeclaration0.setType(23);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid decl type: 23
         //
         verifyException("org.mozilla.javascript.ast.VariableDeclaration", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(155, 155);
      variableDeclaration0.setType(155);
      assertEquals(155, variableDeclaration0.getType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      variableDeclaration0.setIsStatement(true);
      variableDeclaration0.toSource();
      assertTrue(variableDeclaration0.isStatement());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(155, 155);
      boolean boolean0 = variableDeclaration0.isVar();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(155, 155);
      boolean boolean0 = variableDeclaration0.isLet();
      assertFalse(boolean0);
      assertEquals(123, variableDeclaration0.getType());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(731);
      variableDeclaration0.getVariables();
      assertEquals("123", variableDeclaration0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(155, 155);
      boolean boolean0 = variableDeclaration0.isConst();
      assertFalse(boolean0);
      assertEquals(123, variableDeclaration0.getType());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      LinkedList<VariableInitializer> linkedList0 = new LinkedList<VariableInitializer>();
      VariableInitializer variableInitializer0 = new VariableInitializer();
      linkedList0.add(variableInitializer0);
      variableDeclaration0.setVariables(linkedList0);
      // Undeclared exception!
      try { 
        variableDeclaration0.debugPrint();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.VariableInitializer", e);
      }
  }
}
