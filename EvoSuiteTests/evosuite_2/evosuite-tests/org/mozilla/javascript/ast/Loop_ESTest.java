/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 17:11:52 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.ArrayComprehensionLoop;
import org.mozilla.javascript.ast.Assignment;
import org.mozilla.javascript.ast.ForInLoop;
import org.mozilla.javascript.ast.GeneratorExpressionLoop;
import org.mozilla.javascript.ast.WhileLoop;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Loop_ESTest extends Loop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GeneratorExpressionLoop generatorExpressionLoop0 = new GeneratorExpressionLoop();
      generatorExpressionLoop0.setParens(229, 1);
      assertEquals(229, generatorExpressionLoop0.getLp());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ForInLoop forInLoop0 = new ForInLoop();
      forInLoop0.setLp(99);
      assertEquals(99, forInLoop0.getLp());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop(100, 1283);
      int int0 = arrayComprehensionLoop0.getRp();
      assertEquals((-1), arrayComprehensionLoop0.getLp());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ForInLoop forInLoop0 = new ForInLoop();
      int int0 = forInLoop0.getLp();
      assertEquals((-1), int0);
      assertEquals((-1), forInLoop0.getRp());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ForInLoop forInLoop0 = new ForInLoop();
      forInLoop0.getBody();
      assertEquals((-1), forInLoop0.getRp());
      assertEquals((-1), forInLoop0.getLp());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WhileLoop whileLoop0 = new WhileLoop(1, 1);
      Assignment assignment0 = new Assignment(4, 127);
      whileLoop0.setBody(assignment0);
      assertEquals(130, whileLoop0.getLength());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      WhileLoop whileLoop0 = new WhileLoop(1);
      assertEquals((-1), whileLoop0.getRp());
      assertEquals((-1), whileLoop0.getLp());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop();
      arrayComprehensionLoop0.setRp(857);
      assertEquals(857, arrayComprehensionLoop0.getRp());
  }
}