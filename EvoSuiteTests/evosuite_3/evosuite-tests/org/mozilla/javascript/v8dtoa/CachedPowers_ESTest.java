/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 18:04:02 GMT 2018
 */

package org.mozilla.javascript.v8dtoa;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.v8dtoa.CachedPowers;
import org.mozilla.javascript.v8dtoa.DiyFp;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CachedPowers_ESTest extends CachedPowers_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CachedPowers.CachedPower cachedPowers_CachedPower0 = new CachedPowers.CachedPower((-18014398509481984L), (short)0, (short)0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DiyFp diyFp0 = new DiyFp();
      int int0 = CachedPowers.getCachedPower(687, (-28), (-28), diyFp0);
      assertEquals((-196), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CachedPowers cachedPowers0 = new CachedPowers();
  }
}
