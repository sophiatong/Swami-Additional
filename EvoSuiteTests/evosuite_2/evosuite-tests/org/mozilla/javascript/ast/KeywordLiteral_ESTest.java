/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 17:51:55 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.KeywordLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KeywordLiteral_ESTest extends KeywordLiteral_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KeywordLiteral keywordLiteral0 = new KeywordLiteral(42, 42, 42);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      keywordLiteral0.visit(astNode_DebugPrintVisitor0);
      assertEquals("42\tNULL 42 42\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("42", keywordLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      KeywordLiteral keywordLiteral0 = new KeywordLiteral((-1538), (-2872));
      KeywordLiteral keywordLiteral1 = keywordLiteral0.setType(44);
      String string0 = keywordLiteral1.toSource(20);
      assertTrue(keywordLiteral0.isBooleanLiteral());
      assertEquals("                                        false", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      KeywordLiteral keywordLiteral0 = new KeywordLiteral(45, 1629);
      keywordLiteral0.setType(45);
      keywordLiteral0.toSource((-2349));
      assertEquals(45, keywordLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      KeywordLiteral keywordLiteral0 = new KeywordLiteral(42, 42, 42);
      String string0 = keywordLiteral0.toSource(42);
      assertEquals("                                                                                    null", string0);
      assertEquals(42, keywordLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      KeywordLiteral keywordLiteral0 = new KeywordLiteral(45, 1629);
      // Undeclared exception!
      try { 
        keywordLiteral0.toSource((-2349));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Invalid keyword literal type: -1
         //
         verifyException("org.mozilla.javascript.ast.KeywordLiteral", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      KeywordLiteral keywordLiteral0 = new KeywordLiteral(110, 110, 161);
      String string0 = keywordLiteral0.toSource(962);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      KeywordLiteral keywordLiteral0 = null;
      try {
        keywordLiteral0 = new KeywordLiteral(110, 110, 147);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid node type: 147
         //
         verifyException("org.mozilla.javascript.ast.KeywordLiteral", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      KeywordLiteral keywordLiteral0 = new KeywordLiteral(45, 1629);
      boolean boolean0 = keywordLiteral0.isBooleanLiteral();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      KeywordLiteral keywordLiteral0 = new KeywordLiteral((-1848));
      assertEquals(1, Node.LEFT);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      KeywordLiteral keywordLiteral0 = new KeywordLiteral();
      keywordLiteral0.setType(43);
      keywordLiteral0.toSource(1139);
      assertEquals(43, keywordLiteral0.getType());
  }
}