/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 16:40:43 GMT 2018
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
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.Comment;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AstRoot_ESTest extends AstRoot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      astRoot0.setType((-1706));
      // Undeclared exception!
      try { 
        astRoot0.checkParentLinks();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No parent for node: -1706
         //
         verifyException("org.mozilla.javascript.ast.AstRoot$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(1700);
      TreeSet<Comment> treeSet0 = new TreeSet<Comment>();
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
      Comment comment0 = new Comment(1, 2, token_CommentType0, (String) null);
      treeSet0.add(comment0);
      astRoot0.setComments(treeSet0);
      String string0 = astRoot0.debugPrint();
      assertEquals("1700\tSCRIPT 1700 1\n1\t  COMMENT -1699 2\n", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(1700);
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(1, 2, token_CommentType0, (String) null);
      astRoot0.addChild(comment0);
      String string0 = astRoot0.toSource(26);
      assertEquals("                                                    null", string0);
      assertEquals("137", astRoot0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(285);
      astRoot0.setComments((SortedSet<Comment>) null);
      assertEquals(137, astRoot0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(1700);
      astRoot0.getComments();
      assertEquals(137, astRoot0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(1700);
      TreeSet<Comment> treeSet0 = new TreeSet<Comment>();
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
      Comment comment0 = new Comment(1, 2, token_CommentType0, (String) null);
      treeSet0.add(comment0);
      astRoot0.setComments(treeSet0);
      astRoot0.setComments(treeSet0);
      assertEquals("137", astRoot0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      astRoot0.checkParentLinks();
      assertEquals(19, Node.PARENTHESIZED_PROP);
  }
}
