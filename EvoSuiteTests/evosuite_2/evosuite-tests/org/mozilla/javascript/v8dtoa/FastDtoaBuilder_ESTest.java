/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 19:35:07 GMT 2018
 */

package org.mozilla.javascript.v8dtoa;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.v8dtoa.FastDtoaBuilder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FastDtoaBuilder_ESTest extends FastDtoaBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FastDtoaBuilder fastDtoaBuilder0 = new FastDtoaBuilder();
      String string0 = fastDtoaBuilder0.toString();
      assertEquals("[chars:, point:0]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FastDtoaBuilder fastDtoaBuilder0 = new FastDtoaBuilder();
      fastDtoaBuilder0.point = 1;
      String string0 = fastDtoaBuilder0.format();
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FastDtoaBuilder fastDtoaBuilder0 = new FastDtoaBuilder();
      fastDtoaBuilder0.point = (-2);
      String string0 = fastDtoaBuilder0.format();
      assertEquals("0.00", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FastDtoaBuilder fastDtoaBuilder0 = new FastDtoaBuilder();
      fastDtoaBuilder0.point = 1;
      fastDtoaBuilder0.append('g');
      fastDtoaBuilder0.append('g');
      String string0 = fastDtoaBuilder0.format();
      assertEquals("g.g", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FastDtoaBuilder fastDtoaBuilder0 = new FastDtoaBuilder();
      fastDtoaBuilder0.point = (-8);
      fastDtoaBuilder0.append('-');
      String string0 = fastDtoaBuilder0.format();
      //  // Unstable assertion: assertEquals("-e-1}", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FastDtoaBuilder fastDtoaBuilder0 = new FastDtoaBuilder();
      fastDtoaBuilder0.point = (-8);
      fastDtoaBuilder0.formatted = false;
      fastDtoaBuilder0.formatted = false;
      fastDtoaBuilder0.format();
      fastDtoaBuilder0.formatted = false;
      String string0 = fastDtoaBuilder0.format();
      assertEquals("e.-9e-9", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FastDtoaBuilder fastDtoaBuilder0 = new FastDtoaBuilder();
      fastDtoaBuilder0.reset();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FastDtoaBuilder fastDtoaBuilder0 = new FastDtoaBuilder();
      fastDtoaBuilder0.append('~');
      fastDtoaBuilder0.decreaseLast();
  }
}
