/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 16:32:37 GMT 2018
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
import org.mozilla.javascript.ast.Label;
import org.mozilla.javascript.ast.LabeledStatement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LabeledStatement_ESTest extends LabeledStatement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LabeledStatement labeledStatement0 = new LabeledStatement(0, 0);
      Label label0 = new Label(0, 21, ".7: 1'^/");
      labeledStatement0.setStatement(label0);
      StringBuilder stringBuilder0 = new StringBuilder("::");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      labeledStatement0.visit(astNode_DebugPrintVisitor0);
      assertEquals("::0\tEXPR_VOID 0 0\n0\t  LABEL 0 21\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("134", labeledStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LabeledStatement labeledStatement0 = new LabeledStatement(0, 0);
      Label label0 = new Label(0, 21, ".7: 1'^/");
      labeledStatement0.addLabel(label0);
      StringBuilder stringBuilder0 = new StringBuilder("::");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        labeledStatement0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.LabeledStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LabeledStatement labeledStatement0 = new LabeledStatement(0, 0);
      Label label0 = new Label(0, 21, ".7: 1'^/");
      labeledStatement0.addLabel(label0);
      // Undeclared exception!
      try { 
        labeledStatement0.toSource(95);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.LabeledStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LabeledStatement labeledStatement0 = new LabeledStatement(0, 0);
      Label label0 = new Label(0, 21, ".7: 1'^/");
      labeledStatement0.setStatement(label0);
      String string0 = labeledStatement0.toSource(95);
      assertEquals("                                                                                                                                                                                                .7: 1'^/:\n", string0);
      assertEquals(134, labeledStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LabeledStatement labeledStatement0 = new LabeledStatement(100, 100);
      LinkedList<Label> linkedList0 = new LinkedList<Label>();
      Label label0 = new Label();
      linkedList0.add(label0);
      labeledStatement0.setLabels(linkedList0);
      assertEquals("134", labeledStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LabeledStatement labeledStatement0 = new LabeledStatement(0, 0);
      boolean boolean0 = labeledStatement0.hasSideEffects();
      assertTrue(boolean0);
      assertEquals("134", labeledStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LabeledStatement labeledStatement0 = new LabeledStatement(100, 100);
      labeledStatement0.getStatement();
      assertEquals(134, labeledStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LabeledStatement labeledStatement0 = new LabeledStatement(0, 0);
      Label label0 = new Label(0, 21, ".7: 1'^/");
      labeledStatement0.addLabel(label0);
      Label label1 = labeledStatement0.getLabelByName(".7: 1'^/");
      assertEquals("134", labeledStatement0.toString());
      assertNotNull(label1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LabeledStatement labeledStatement0 = new LabeledStatement(0, 0);
      labeledStatement0.getLabelByName("");
      assertEquals("134", labeledStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LabeledStatement labeledStatement0 = new LabeledStatement(0, 0);
      // Undeclared exception!
      try { 
        labeledStatement0.getFirstLabel();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LabeledStatement labeledStatement0 = new LabeledStatement(134);
      assertEquals(134, labeledStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LabeledStatement labeledStatement0 = new LabeledStatement();
      labeledStatement0.getLabels();
      assertEquals("134", labeledStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LabeledStatement labeledStatement0 = new LabeledStatement(0, 0);
      Label label0 = new Label(0, 21, ".7: 1'^/");
      labeledStatement0.addLabel(label0);
      Label label1 = labeledStatement0.getLabelByName("");
      assertNull(label1);
      assertEquals(134, labeledStatement0.getType());
  }
}
