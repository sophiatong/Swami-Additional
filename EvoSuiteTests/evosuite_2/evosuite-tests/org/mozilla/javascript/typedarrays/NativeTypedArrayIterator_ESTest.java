/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 00:55:44 GMT 2018
 */

package org.mozilla.javascript.typedarrays;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeTypedArrayIterator;
import org.mozilla.javascript.typedarrays.NativeTypedArrayView;
import org.mozilla.javascript.typedarrays.NativeUint8Array;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeTypedArrayIterator_ESTest extends NativeTypedArrayIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      NativeTypedArrayIterator<Object> nativeTypedArrayIterator0 = new NativeTypedArrayIterator<Object>((NativeTypedArrayView<Object>) null, 14);
      // Undeclared exception!
      try { 
        nativeTypedArrayIterator0.set(nativeInt32Array0.READONLY);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeTypedArrayIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      NativeTypedArrayIterator<Integer> nativeTypedArrayIterator0 = new NativeTypedArrayIterator<Integer>(nativeUint8ClampedArray0, (-4563));
      // Undeclared exception!
      try { 
        nativeTypedArrayIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeTypedArrayIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      NativeTypedArrayIterator<Integer> nativeTypedArrayIterator0 = new NativeTypedArrayIterator<Integer>(nativeUint8Array0, 0);
      int int0 = nativeTypedArrayIterator0.previousIndex();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeTypedArrayIterator<Object> nativeTypedArrayIterator0 = new NativeTypedArrayIterator<Object>((NativeTypedArrayView<Object>) null, (-1));
      // Undeclared exception!
      try { 
        nativeTypedArrayIterator0.previous();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeTypedArrayIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(548);
      NativeTypedArrayIterator<Integer> nativeTypedArrayIterator0 = new NativeTypedArrayIterator<Integer>(nativeInt32Array0, 54);
      nativeTypedArrayIterator0.previous();
      assertEquals(53, nativeTypedArrayIterator0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(548);
      NativeTypedArrayIterator<Integer> nativeTypedArrayIterator0 = new NativeTypedArrayIterator<Integer>(nativeInt32Array0, 54);
      int int0 = nativeTypedArrayIterator0.nextIndex();
      assertEquals(54, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray(nativeArrayBuffer0, 13, (-673));
      NativeTypedArrayIterator<Integer> nativeTypedArrayIterator0 = new NativeTypedArrayIterator<Integer>(nativeUint8ClampedArray0, 0);
      // Undeclared exception!
      try { 
        nativeTypedArrayIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeTypedArrayIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      NativeTypedArrayIterator<Integer> nativeTypedArrayIterator0 = new NativeTypedArrayIterator<Integer>(nativeUint8ClampedArray0, 1);
      // Undeclared exception!
      try { 
        nativeTypedArrayIterator0.add((Integer) 13);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeTypedArrayIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(11);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(any() , any());
      nativeFloat32Array0.sort(comparator0);
      assertFalse(nativeFloat32Array0.avoidObjectDetection());
  }
}
