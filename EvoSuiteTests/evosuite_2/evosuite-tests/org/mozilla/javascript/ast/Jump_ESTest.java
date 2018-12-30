/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 17:11:19 GMT 2018
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
import org.mozilla.javascript.ast.ContinueStatement;
import org.mozilla.javascript.ast.EmptyExpression;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.Label;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.SwitchStatement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Jump_ESTest extends Jump_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Jump jump0 = new Jump(63);
      // Undeclared exception!
      try { 
        jump0.debugPrint();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // 63
         //
         verifyException("org.mozilla.javascript.ast.Jump", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Jump jump0 = new Jump();
      // Undeclared exception!
      try { 
        jump0.toSource(3223);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // -1
         //
         verifyException("org.mozilla.javascript.ast.Jump", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContinueStatement continueStatement0 = new ContinueStatement();
      continueStatement0.setJumpStatement(continueStatement0);
      assertEquals(14, Node.CATCH_SCOPE_PROP);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement(167, 167);
      Node node0 = Node.newTarget();
      switchStatement0.setDefault(node0);
      assertEquals(4, Node.REGEXP_PROP);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Label label0 = new Label();
      Jump jump0 = label0.getLoop();
      assertNull(jump0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ContinueStatement continueStatement0 = new ContinueStatement();
      Jump jump0 = continueStatement0.getJumpStatement();
      assertNull(jump0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop((-1138), (-1138));
      arrayComprehensionLoop0.setType(82);
      Node node0 = arrayComprehensionLoop0.getFinally();
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement((-1715), (-2549));
      Node node0 = switchStatement0.getDefault();
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Jump jump0 = new Jump(133);
      Node node0 = jump0.getContinue();
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EmptyExpression emptyExpression0 = new EmptyExpression((-1857));
      Jump jump0 = new Jump((-1857), emptyExpression0, (-548));
      assertEquals((-548), jump0.getLineno());
      assertEquals("-1857", jump0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Name name0 = new Name(82, "");
      Jump jump0 = new Jump(82, name0);
      // Undeclared exception!
      try { 
        jump0.setFinally(name0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Jump jump0 = new Jump(133, 133);
      // Undeclared exception!
      try { 
        jump0.setContinue(jump0);
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
      Jump jump0 = new Jump(131);
      Scope scope0 = new Scope(131);
      jump0.setLoop(scope0);
      assertEquals(16, Node.MEMBER_TYPE_PROP);
  }
}