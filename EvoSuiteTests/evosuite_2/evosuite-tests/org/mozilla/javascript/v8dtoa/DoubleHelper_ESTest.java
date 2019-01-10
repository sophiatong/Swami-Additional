/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 19:50:24 GMT 2018
 */

package org.mozilla.javascript.v8dtoa;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.v8dtoa.DiyFp;
import org.mozilla.javascript.v8dtoa.DoubleHelper;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DoubleHelper_ESTest extends DoubleHelper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = DoubleHelper.sign((-310L));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = DoubleHelper.isNan((-840L));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean boolean0 = DoubleHelper.isInfinite((-9223372036854775808L));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DiyFp diyFp0 = new DiyFp();
      DoubleHelper.normalizedBoundaries((-18014398509481984L), diyFp0, diyFp0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DiyFp diyFp0 = DoubleHelper.asNormalizedDiyFp(27L);
      DoubleHelper.normalizedBoundaries(27L, diyFp0, diyFp0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DoubleHelper doubleHelper0 = new DoubleHelper();
  }
}
