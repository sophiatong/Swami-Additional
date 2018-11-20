/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 18:06:57 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.BreakStatement;
import org.mozilla.javascript.ast.Comment;
import org.mozilla.javascript.ast.ConditionalExpression;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.NumberLiteral;
import org.mozilla.javascript.ast.SwitchCase;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SwitchCase_ESTest extends SwitchCase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase((-1), (-1));
      BreakStatement breakStatement0 = new BreakStatement(1809);
      switchCase0.addStatement(breakStatement0);
      StringBuilder stringBuilder0 = new StringBuilder("&f$sVu\u0005{g`");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      switchCase0.visit(astNode_DebugPrintVisitor0);
      assertEquals("&f$sVu\u0005{g`-1\tCASE -1 1811\n1809\t  BREAK 1810 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals(1811, switchCase0.getLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase();
      FunctionNode functionNode0 = new FunctionNode();
      switchCase0.addStatement(functionNode0);
      StringBuilder stringBuilder0 = new StringBuilder(2);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        switchCase0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.FunctionNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase();
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(0, 384, token_CommentType0, (String) null);
      switchCase0.setExpression(comment0);
      StringBuilder stringBuilder0 = new StringBuilder(2);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      switchCase0.visit(astNode_DebugPrintVisitor0);
      assertFalse(switchCase0.isDefault());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase();
      String string0 = switchCase0.toSource(4);
      assertEquals("        default:\n", string0);
      assertEquals("116", switchCase0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase();
      LinkedList<AstNode> linkedList0 = new LinkedList<AstNode>();
      ConditionalExpression conditionalExpression0 = new ConditionalExpression(1, 0);
      linkedList0.add((AstNode) conditionalExpression0);
      switchCase0.setStatements(linkedList0);
      switchCase0.setStatements(linkedList0);
      assertEquals(3, switchCase0.getLength());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase();
      NumberLiteral numberLiteral0 = new NumberLiteral(1);
      switchCase0.setExpression(numberLiteral0);
      switchCase0.toSource(4);
      assertFalse(switchCase0.isDefault());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase(0);
      switchCase0.setExpression((AstNode) null);
      assertEquals("116", switchCase0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase(0);
      boolean boolean0 = switchCase0.isDefault();
      assertEquals("116", switchCase0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase((-221), (-221));
      switchCase0.getStatements();
      assertEquals("116", switchCase0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase();
      switchCase0.getExpression();
      assertEquals(116, switchCase0.getType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase((-1), (-1));
      BreakStatement breakStatement0 = new BreakStatement(1809);
      switchCase0.addStatement(breakStatement0);
      switchCase0.toSource(2);
      assertEquals(1811, switchCase0.getLength());
  }
}
