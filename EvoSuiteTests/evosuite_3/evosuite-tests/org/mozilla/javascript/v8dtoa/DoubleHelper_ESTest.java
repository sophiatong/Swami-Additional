/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 18:14:15 GMT 2018
 */

package org.mozilla.javascript.v8dtoa;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.v8dtoa.DiyFp;
import org.mozilla.javascript.v8dtoa.DoubleHelper;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DoubleHelper_ESTest extends DoubleHelper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = DoubleHelper.sign((-2690L));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DiyFp diyFp0 = new DiyFp(1821L, (-1));
      DoubleHelper.normalizedBoundaries((-18014398509481984L), diyFp0, diyFp0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean boolean0 = DoubleHelper.isNan(9218868437227405312L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      boolean boolean0 = DoubleHelper.isInfinite(9218868437227405312L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DiyFp diyFp0 = DoubleHelper.asNormalizedDiyFp(2147483561L);
      DoubleHelper.normalizedBoundaries(4503599627370496L, diyFp0, diyFp0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DoubleHelper doubleHelper0 = new DoubleHelper();
  }
}