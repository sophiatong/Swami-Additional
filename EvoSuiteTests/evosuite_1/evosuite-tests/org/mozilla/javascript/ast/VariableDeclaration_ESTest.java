/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 16:40:42 GMT 2018
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
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.VariableDeclaration;
import org.mozilla.javascript.ast.VariableInitializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class VariableDeclaration_ESTest extends VariableDeclaration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration((-568), (-568));
      LinkedList<VariableInitializer> linkedList0 = new LinkedList<VariableInitializer>();
      VariableInitializer variableInitializer0 = new VariableInitializer(2);
      Name name0 = new Name(7, "");
      variableInitializer0.setTarget(name0);
      linkedList0.add(variableInitializer0);
      variableDeclaration0.setVariables(linkedList0);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      variableDeclaration0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-568\tVAR -568 -568\n2\t  VAR 570 1\n7\t    NAME 5 0 \n", astNode_DebugPrintVisitor0.toString());
      assertEquals("-568\tVAR -568 -568\n2\t  VAR 570 1\n7\t    NAME 5 0 \n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      // Undeclared exception!
      try { 
        variableDeclaration0.setType(8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid decl type: 8
         //
         verifyException("org.mozilla.javascript.ast.VariableDeclaration", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
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
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      boolean boolean0 = variableDeclaration0.isVar();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      boolean boolean0 = variableDeclaration0.isLet();
      assertFalse(boolean0);
      assertTrue(variableDeclaration0.isVar());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      boolean boolean0 = variableDeclaration0.isConst();
      assertFalse(boolean0);
      assertEquals(123, variableDeclaration0.getType());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(2284, 2284);
      variableDeclaration0.getVariables();
      assertTrue(variableDeclaration0.isVar());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(154);
      assertEquals(123, variableDeclaration0.getType());
  }
}
