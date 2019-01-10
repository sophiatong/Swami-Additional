/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 02:01:19 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.NativeMath;
import org.mozilla.javascript.typedarrays.NativeInt32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeMath_ESTest extends NativeMath_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      NativeMath.init(nativeInt32Array0, false);
      assertEquals(0, nativeInt32Array0.getByteOffset());
  }
}
