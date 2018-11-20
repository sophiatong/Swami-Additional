/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 18:09:32 GMT 2018
 */

package org.mozilla.javascript.v8dtoa;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.v8dtoa.DoubleConversion;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DoubleConversion_ESTest extends DoubleConversion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = DoubleConversion.doubleToInt32((-8710.711245457975));
      assertEquals((-8710), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = DoubleConversion.doubleToInt32(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = DoubleConversion.doubleToInt32((-0.6900547719441361));
      assertEquals(0, int0);
  }
}
