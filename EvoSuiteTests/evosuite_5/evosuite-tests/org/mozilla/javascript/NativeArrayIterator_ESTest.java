/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 02:12:07 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeInt8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArrayIterator_ESTest extends NativeArrayIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(193);
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(nativeArrayBuffer0, 4, 8);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeInt8Array0, nativeArrayBuffer0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = Context.enter((Context) null, contextFactory0);
      Object object0 = nativeArrayIterator0.nextValue(context0, nativeInt8Array0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(193);
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(nativeArrayBuffer0, 4, 8);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeInt8Array0, nativeArrayBuffer0);
      boolean boolean0 = nativeArrayIterator0.isDone((Context) null, nativeArrayBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(193);
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(nativeArrayBuffer0, 4, 8);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeInt8Array0, nativeArrayBuffer0);
      String string0 = nativeArrayIterator0.getClassName();
      assertEquals("Array Iterator", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1291L);
      NativeArrayIterator.init(nativeArray0, true);
      assertEquals(1291L, nativeArray0.jsGet_length());
  }
}
