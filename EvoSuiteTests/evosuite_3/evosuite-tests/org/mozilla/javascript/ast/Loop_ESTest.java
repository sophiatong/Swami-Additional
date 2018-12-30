/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 15:35:23 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.ArrayComprehensionLoop;
import org.mozilla.javascript.ast.DoLoop;
import org.mozilla.javascript.ast.ForLoop;
import org.mozilla.javascript.ast.GeneratorExpressionLoop;
import org.mozilla.javascript.ast.IfStatement;
import org.mozilla.javascript.ast.WhileLoop;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Loop_ESTest extends Loop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ForLoop forLoop0 = new ForLoop();
      assertEquals((-1), forLoop0.getRp());
      
      forLoop0.setRp(1);
      assertEquals(1, forLoop0.getRp());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop((-3288), (-3288));
      arrayComprehensionLoop0.setParens(0, 0);
      assertEquals(0, arrayComprehensionLoop0.getLp());
      assertEquals(0, arrayComprehensionLoop0.getRp());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ForLoop forLoop0 = new ForLoop((-2141));
      forLoop0.setLp((-63));
      assertEquals((-63), forLoop0.getLp());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ForLoop forLoop0 = new ForLoop((-2141));
      int int0 = forLoop0.getRp();
      assertEquals((-1), forLoop0.getLp());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WhileLoop whileLoop0 = new WhileLoop(0, 0);
      int int0 = whileLoop0.getLp();
      assertEquals((-1), whileLoop0.getRp());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GeneratorExpressionLoop generatorExpressionLoop0 = new GeneratorExpressionLoop();
      generatorExpressionLoop0.getBody();
      assertEquals((-1), generatorExpressionLoop0.getRp());
      assertEquals((-1), generatorExpressionLoop0.getLp());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop((-987), 0);
      IfStatement ifStatement0 = new IfStatement(0, 13);
      doLoop0.setBody(ifStatement0);
      assertEquals(1000, doLoop0.getLength());
  }
}