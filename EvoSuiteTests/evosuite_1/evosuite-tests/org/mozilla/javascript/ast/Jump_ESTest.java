/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 16:38:41 GMT 2018
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
import org.mozilla.javascript.ast.BreakStatement;
import org.mozilla.javascript.ast.ContinueStatement;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.Label;
import org.mozilla.javascript.ast.LetNode;
import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.SwitchStatement;
import org.mozilla.javascript.ast.TryStatement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Jump_ESTest extends Jump_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Jump jump0 = new Jump(0);
      // Undeclared exception!
      try { 
        jump0.visit((NodeVisitor) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // 0
         //
         verifyException("org.mozilla.javascript.ast.Jump", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Jump jump0 = new Jump(1);
      // Undeclared exception!
      try { 
        jump0.toSource(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // 1
         //
         verifyException("org.mozilla.javascript.ast.Jump", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Label label0 = new Label();
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop();
      label0.setLoop(arrayComprehensionLoop0);
      assertEquals(17, Node.NAME_PROP);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement();
      Label label0 = new Label();
      breakStatement0.setJumpStatement(label0);
      assertEquals(4, Node.REGEXP_PROP);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Jump jump0 = new Jump(82, 82);
      SwitchStatement switchStatement0 = new SwitchStatement();
      // Undeclared exception!
      try { 
        jump0.setFinally(switchStatement0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement();
      Node node0 = Node.newTarget();
      switchStatement0.setDefault(node0);
      assertEquals(18, Node.CONTROL_BLOCK_PROP);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Label label0 = new Label(18);
      Jump jump0 = label0.getLoop();
      assertNull(jump0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContinueStatement continueStatement0 = new ContinueStatement(2711, 777);
      Jump jump0 = continueStatement0.getJumpStatement();
      assertNull(jump0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement((-2594));
      Node node0 = switchStatement0.getDefault();
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement(133, 133);
      Jump jump0 = new Jump(133, tryStatement0);
      Node node0 = jump0.getContinue();
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      Jump jump0 = new Jump(62, letNode0, (-3953));
      assertEquals("62", jump0.toString());
      assertEquals((-3953), jump0.getLineno());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement(133);
      Jump jump0 = new Jump(133, tryStatement0);
      // Undeclared exception!
      try { 
        jump0.setContinue(tryStatement0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Jump jump0 = new Jump(82, 82);
      assertEquals(82, jump0.getType());
      
      jump0.getFinally();
      assertEquals(82, jump0.getLineno());
  }
}
