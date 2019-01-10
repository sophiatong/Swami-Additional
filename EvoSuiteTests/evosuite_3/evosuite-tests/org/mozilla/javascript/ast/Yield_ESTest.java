/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 17:00:50 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.ArrayLiteral;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Yield;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Yield_ESTest extends Yield_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral((-167));
      Yield yield0 = new Yield((-167), (-167), arrayLiteral0);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      yield0.visit(astNode_DebugPrintVisitor0);
      assertEquals(0, arrayLiteral0.getPosition());
      assertEquals(73, yield0.getType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Yield yield0 = new Yield((-1684), (-1684));
      yield0.getValue();
      assertEquals("73", yield0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Yield yield0 = new Yield((-1369));
      assertEquals("73", yield0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Yield yield0 = new Yield();
      String string0 = yield0.toSource(69);
      assertEquals("73", yield0.toString());
      assertEquals("yield", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral((-167));
      Yield yield0 = new Yield((-167), (-167), arrayLiteral0);
      String string0 = yield0.toSource(0);
      assertEquals(0, arrayLiteral0.getPosition());
      assertEquals("yield []", string0);
  }
}
