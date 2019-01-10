/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 15:40:34 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.VariableDeclaration;
import org.mozilla.javascript.ast.VariableInitializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class VariableDeclaration_ESTest extends VariableDeclaration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      StringBuilder stringBuilder0 = new StringBuilder();
      LinkedList<VariableInitializer> linkedList0 = new LinkedList<VariableInitializer>();
      VariableInitializer variableInitializer0 = new VariableInitializer(8);
      linkedList0.add(variableInitializer0);
      variableDeclaration0.setVariables(linkedList0);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        variableDeclaration0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.VariableInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      variableDeclaration0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tVAR -1 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("123", variableDeclaration0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      variableDeclaration0.setType(155);
      assertEquals("155", variableDeclaration0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      // Undeclared exception!
      try { 
        variableDeclaration0.setType(4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid decl type: 4
         //
         verifyException("org.mozilla.javascript.ast.VariableDeclaration", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      variableDeclaration0.setIsStatement(true);
      variableDeclaration0.toSource(13);
      assertTrue(variableDeclaration0.isStatement());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      boolean boolean0 = variableDeclaration0.isVar();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      boolean boolean0 = variableDeclaration0.isLet();
      assertEquals("123", variableDeclaration0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      boolean boolean0 = variableDeclaration0.isConst();
      assertFalse(boolean0);
      assertEquals(123, variableDeclaration0.getType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      variableDeclaration0.getVariables();
      assertEquals(123, variableDeclaration0.getType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(23, 0);
      assertEquals("123", variableDeclaration0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration((-3));
      assertTrue(variableDeclaration0.isVar());
  }
}
