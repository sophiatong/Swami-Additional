/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 16:36:30 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.SortedSet;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.Comment;
import org.mozilla.javascript.ast.NumberLiteral;
import org.mozilla.javascript.ast.ParenthesizedExpression;
import org.mozilla.javascript.ast.XmlString;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AstRoot_ESTest extends AstRoot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      XmlString xmlString0 = new XmlString(137);
      astRoot0.addChildrenToFront(xmlString0);
      // Undeclared exception!
      try { 
        astRoot0.checkParentLinks();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No parent for node: 146
         // null
         //
         verifyException("org.mozilla.javascript.ast.AstRoot$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(17, 1895);
      astRoot0.addChild(parenthesizedExpression0);
      // Undeclared exception!
      try { 
        astRoot0.checkParentLinks();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ParenthesizedExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(17, 1, token_CommentType0, "nrg.ozill.javascript.astAstRoot$1");
      astRoot0.addComment(comment0);
      StringBuilder stringBuilder0 = new StringBuilder("org.mozilla.javascript.ast.FunctionNode$Form");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      astRoot0.visitComments(astNode_DebugPrintVisitor0);
      assertEquals("org.mozilla.javascript.ast.FunctionNode$Form17\t  COMMENT 18 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("org.mozilla.javascript.ast.FunctionNode$Form17\t  COMMENT 18 1\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(0);
      NumberLiteral numberLiteral0 = new NumberLiteral(109, 8);
      astRoot0.addChildToFront(numberLiteral0);
      String string0 = astRoot0.toSource(0);
      assertEquals("<null>", string0);
      assertEquals("137", astRoot0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      TreeSet<Comment> treeSet0 = new TreeSet<Comment>();
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
      Comment comment0 = new Comment(163, 17, token_CommentType0, "e4b.%B*VP");
      treeSet0.add(comment0);
      astRoot0.setComments(treeSet0);
      assertEquals(0, Node.BOTH);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      SortedSet<Comment> sortedSet0 = astRoot0.getComments();
      astRoot0.setComments(sortedSet0);
      assertEquals(19, Node.PARENTHESIZED_PROP);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(0);
      String string0 = astRoot0.debugPrint();
      assertEquals("0\tSCRIPT 0 1\n", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      astRoot0.checkParentLinks();
      assertEquals(0, Node.BOTH);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(2, 564, token_CommentType0, "");
      astRoot0.addComment(comment0);
      SortedSet<Comment> sortedSet0 = astRoot0.getComments();
      astRoot0.setComments(sortedSet0);
      assertFalse(sortedSet0.contains(comment0));
      assertEquals(0, sortedSet0.size());
  }
}
