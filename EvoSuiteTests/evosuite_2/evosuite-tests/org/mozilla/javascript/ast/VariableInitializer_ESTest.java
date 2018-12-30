/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 18:46:09 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.VariableInitializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VariableInitializer_ESTest extends VariableInitializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VariableInitializer variableInitializer0 = new VariableInitializer(0, 0);
      Scope scope0 = new Scope(25, 17);
      variableInitializer0.setInitializer(scope0);
      StringBuilder stringBuilder0 = new StringBuilder();
      variableInitializer0.setTarget(scope0);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      variableInitializer0.visit(astNode_DebugPrintVisitor0);
      assertEquals("0\tVAR 0 0\n25\t  BLOCK 25 17\n25\t  BLOCK 25 17\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("0\tVAR 0 0\n25\t  BLOCK 25 17\n25\t  BLOCK 25 17\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VariableInitializer variableInitializer0 = new VariableInitializer(0, 0);
      // Undeclared exception!
      try { 
        variableInitializer0.toSource(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.VariableInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VariableInitializer variableInitializer0 = new VariableInitializer(0, 0);
      Scope scope0 = new Scope(25, 17);
      variableInitializer0.setTarget(scope0);
      String string0 = variableInitializer0.toSource(1);
      assertEquals("123", variableInitializer0.toString());
      assertEquals("  {\n}\n", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VariableInitializer variableInitializer0 = new VariableInitializer();
      // Undeclared exception!
      try { 
        variableInitializer0.setTarget((AstNode) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid target arg
         //
         verifyException("org.mozilla.javascript.ast.VariableInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      VariableInitializer variableInitializer0 = new VariableInitializer();
      // Undeclared exception!
      try { 
        variableInitializer0.setNodeType(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid node type
         //
         verifyException("org.mozilla.javascript.ast.VariableInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      VariableInitializer variableInitializer0 = new VariableInitializer(0, 0);
      Scope scope0 = new Scope(25, 17);
      variableInitializer0.setInitializer(scope0);
      assertEquals(1, scope0.depth());
      
      variableInitializer0.setTarget(scope0);
      String string0 = variableInitializer0.toSource(1);
      assertEquals("  {\n}\n = {\n}\n", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      VariableInitializer variableInitializer0 = new VariableInitializer(0, 0);
      boolean boolean0 = variableInitializer0.isDestructuring();
      assertTrue(boolean0);
      assertEquals(123, variableInitializer0.getType());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      VariableInitializer variableInitializer0 = new VariableInitializer(154);
      variableInitializer0.getTarget();
      assertEquals(123, variableInitializer0.getType());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      VariableInitializer variableInitializer0 = new VariableInitializer(0, 0);
      variableInitializer0.getInitializer();
      assertEquals(123, variableInitializer0.getType());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      VariableInitializer variableInitializer0 = new VariableInitializer();
      variableInitializer0.setNodeType(155);
      assertEquals(155, variableInitializer0.getType());
  }
}