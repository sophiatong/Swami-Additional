/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 17:58:58 GMT 2018
 */

package org.mozilla.javascript.v8dtoa;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.v8dtoa.DoubleConversion;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DoubleConversion_ESTest extends DoubleConversion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = DoubleConversion.doubleToInt32(0.7878596785980181);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = DoubleConversion.doubleToInt32(5857);
      assertEquals(5857, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = DoubleConversion.doubleToInt32((-1148.414442144317));
      assertEquals((-1148), int0);
  }
}
