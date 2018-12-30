/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 16:01:45 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Name;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Name_ESTest extends Name_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Name name0 = new Name();
      String string0 = name0.toSource(1);
      assertEquals("39", name0.toString());
      assertEquals("  <null>", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Name name0 = new Name();
      int int0 = name0.length();
      assertEquals(0, int0);
      assertEquals("39", name0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Name name0 = new Name(1254, 1254, "dTFm7^;7EQLO1g");
      name0.getScope();
      assertEquals("39", name0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Name name0 = new Name(58, "$e:{XP(");
      assertEquals("39", name0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Name name0 = new Name(0, 50);
      StringBuilder stringBuilder0 = new StringBuilder(4);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      name0.visit(astNode_DebugPrintVisitor0);
      assertEquals("0\tNAME 0 50 null\n", astNode_DebugPrintVisitor0.toString());
      assertEquals(39, name0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Name name0 = new Name(80);
      FunctionNode functionNode0 = new FunctionNode((-1));
      name0.setScope(functionNode0);
      assertEquals(39, name0.getType());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Name name0 = new Name();
      boolean boolean0 = name0.isLocalName();
      assertFalse(boolean0);
      assertEquals("39", name0.toString());
  }
}