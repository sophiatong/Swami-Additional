/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 00:24:41 GMT 2018
 */

package org.mozilla.javascript.typedarrays;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeTypedArrayView;
import org.mozilla.javascript.typedarrays.NativeUint32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeUint32Array_ESTest extends NativeUint32Array_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(4);
      Long long0 = new Long(8);
      // Undeclared exception!
      try { 
        nativeUint32Array0.set(4, long0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeUint32Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(5);
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(nativeArrayBuffer0, 1, 13);
      // Undeclared exception!
      try { 
        nativeUint32Array0.realThis(nativeInt32Array0, (IdFunctionObject) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeUint32Array0, (Object) null, 4, 13);
      NativeTypedArrayView nativeTypedArrayView0 = nativeUint32Array0.realThis(nativeUint32Array0, idFunctionObject0);
      assertFalse(nativeTypedArrayView0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array((NativeArrayBuffer) null, 317, 317);
      Object object0 = nativeUint32Array0.js_set((-4164), nativeUint32Array0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(1199);
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(nativeArrayBuffer0, 0, 13);
      Object object0 = nativeUint32Array0.js_get(1214);
      Object object1 = nativeUint32Array0.js_set(8, object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Context context0 = Context.enter();
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(7);
      NativeUint32Array.init(context0, nativeUint32Array0, false);
      assertEquals(4, nativeUint32Array0.getBytesPerElement());
      assertEquals("Uint32Array", nativeUint32Array0.getClassName());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(1199);
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(nativeArrayBuffer0, 0, 13);
      Long long0 = nativeUint32Array0.get(1);
      Long long1 = nativeUint32Array0.set(8, long0);
      assertNull(long1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(nativeArrayBuffer0, (-1465), 1);
      // Undeclared exception!
      try { 
        nativeUint32Array0.get(8);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeUint32Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array();
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeTypedArrayView nativeTypedArrayView0 = nativeUint32Array0.construct(nativeArrayBuffer0, 62, (-1347));
      assertEquals((-1347), nativeTypedArrayView0.getArrayLength());
      assertEquals(62, nativeTypedArrayView0.getByteOffset());
  }
}
