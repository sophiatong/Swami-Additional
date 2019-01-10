/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 15:29:31 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.ReturnStatement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ReturnStatement_ESTest extends ReturnStatement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Name name0 = new Name(0, 0);
      ReturnStatement returnStatement0 = new ReturnStatement(0, 0, name0);
      StringBuilder stringBuilder0 = new StringBuilder(0);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      returnStatement0.visit(astNode_DebugPrintVisitor0);
      assertEquals(1, name0.depth());
      assertEquals("0\tRETURN 0 0\n0\t  NAME 0 0 null\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReturnStatement returnStatement0 = new ReturnStatement(710);
      String string0 = returnStatement0.toSource(78);
      assertEquals("                                                                                                                                                            return;\n", string0);
      assertEquals("4", returnStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ReturnStatement returnStatement0 = new ReturnStatement(2190, 2190);
      returnStatement0.getReturnValue();
      assertEquals("4", returnStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReturnStatement returnStatement0 = new ReturnStatement();
      assertEquals(4, returnStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Name name0 = new Name(0, 0);
      ReturnStatement returnStatement0 = new ReturnStatement(0, 0, name0);
      returnStatement0.toSource(3415);
      assertEquals(1, name0.depth());
  }
}
