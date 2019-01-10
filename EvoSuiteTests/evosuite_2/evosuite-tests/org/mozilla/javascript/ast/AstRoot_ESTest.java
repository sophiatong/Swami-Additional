/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 18:22:14 GMT 2018
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
import org.mozilla.javascript.ast.Label;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AstRoot_ESTest extends AstRoot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      astRoot0.setType(919);
      // Undeclared exception!
      try { 
        astRoot0.checkParentLinks();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No parent for node: 919
         //
         verifyException("org.mozilla.javascript.ast.AstRoot$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      TreeSet<Comment> treeSet0 = new TreeSet<Comment>();
      Token.CommentType token_CommentType0 = Token.CommentType.LINE;
      Comment comment0 = new Comment(19, (-1130), token_CommentType0, "org.mozilla.javascript.ast.FunctionNode$Form");
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      treeSet0.add(comment0);
      astRoot0.setComments(treeSet0);
      astRoot0.visitComments(astNode_DebugPrintVisitor0);
      assertEquals("19\t  COMMENT 20 -1130\n", astNode_DebugPrintVisitor0.toString());
      assertEquals(137, astRoot0.getType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Label label0 = new Label(8, 1);
      astRoot0.addChildrenToFront(label0);
      astRoot0.toSource(3730);
      assertEquals(137, astRoot0.getType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(561);
      String string0 = astRoot0.toSource((-1));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(561);
      astRoot0.setComments((SortedSet<Comment>) null);
      assertEquals(11, Node.SKIP_INDEXES_PROP);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(561);
      SortedSet<Comment> sortedSet0 = astRoot0.getComments();
      assertNull(sortedSet0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(561);
      String string0 = astRoot0.debugPrint();
      assertEquals("561\tSCRIPT 561 1\n", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(561);
      astRoot0.checkParentLinks();
      assertEquals(4, Node.DESCENDANTS_FLAG);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      TreeSet<Comment> treeSet0 = new TreeSet<Comment>();
      Token.CommentType token_CommentType0 = Token.CommentType.LINE;
      Comment comment0 = new Comment(19, (-1130), token_CommentType0, "org.mozilla.javascript.ast.FunctionNode$Form");
      treeSet0.add(comment0);
      astRoot0.setComments(treeSet0);
      astRoot0.setComments(treeSet0);
      assertEquals("137", astRoot0.toString());
  }
}
