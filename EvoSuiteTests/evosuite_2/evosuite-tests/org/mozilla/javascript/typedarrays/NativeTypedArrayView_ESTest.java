/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 01:08:21 GMT 2018
 */

package org.mozilla.javascript.typedarrays;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.ListIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.FunctionObject;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeCall;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeInt8Array;
import org.mozilla.javascript.typedarrays.NativeTypedArrayView;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.typedarrays.NativeUint32Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeTypedArrayView_ESTest extends NativeTypedArrayView_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(13);
      NativeCall[] nativeCallArray0 = new NativeCall[9];
      // Undeclared exception!
      try { 
        nativeInt16Array0.toArray(nativeCallArray0);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
         //
         // java.lang.Short
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeTypedArrayView", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(4);
      Integer[] integerArray0 = new Integer[7];
      Integer[] integerArray1 = nativeInt32Array0.toArray(integerArray0);
      assertEquals(4, nativeInt32Array0.size());
      assertEquals(7, integerArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(4);
      Object[] objectArray0 = nativeUint16Array0.toArray();
      assertEquals(4, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(1189);
      // Undeclared exception!
      try { 
        nativeInt16Array0.subList(0, 13);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeTypedArrayView", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(4);
      int int0 = nativeUint16Array0.size();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array();
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      nativeUint32Array0.setArrayElement(0, nativeInt16Array0);
      assertFalse(nativeInt16Array0.isSealed());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(1);
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeTypedArrayView nativeTypedArrayView0 = nativeFloat64Array0.construct(nativeArrayBuffer0, 8, 4);
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(1);
      // Undeclared exception!
      try { 
        nativeInt32Array0.retainAll(nativeTypedArrayView0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeTypedArrayView", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array();
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      // Undeclared exception!
      try { 
        nativeUint32Array0.removeAll(nativeArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeTypedArrayView", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        nativeUint8Array0.remove((Object) nativeContinuation0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeTypedArrayView", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array((NativeArrayBuffer) null, 3708, (-460));
      // Undeclared exception!
      try { 
        nativeFloat32Array0.remove((-460));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeTypedArrayView", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(11);
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(102);
      nativeArrayBuffer0.put(1135, (Scriptable) nativeUint8Array0, (Object) nativeUint8Array0);
      assertEquals(11, nativeUint8Array0.getArrayLength());
      assertEquals(11, nativeUint8Array0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array();
      // Undeclared exception!
      try { 
        nativeUint32Array0.listIterator((int) (short) (-14));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeTypedArrayView", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(8);
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(nativeArrayBuffer0, 1, 699);
      ListIterator<Long> listIterator0 = nativeUint32Array0.listIterator((int) (short)3);
      assertTrue(listIterator0.hasNext());
      assertEquals(699, nativeUint32Array0.getArrayLength());
      assertTrue(listIterator0.hasPrevious());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(8);
      boolean boolean0 = nativeInt32Array0.isEmpty();
      assertFalse(boolean0);
      assertEquals(8, nativeInt32Array0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(3445);
      // Undeclared exception!
      try { 
        nativeInt32Array0.getInstanceIdValue(762);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 762
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      Context context0 = Context.enter();
      Object[] objectArray0 = context0.getElements(nativeUint16Array0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(nativeArrayBuffer0, 13, 1);
      // Undeclared exception!
      try { 
        nativeInt8Array0.getAllIds();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 9
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(6);
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray(nativeArrayBuffer0, 135, 2);
      Object[] objectArray0 = nativeUint8ClampedArray0.getIds();
      assertEquals(2, objectArray0.length);
      assertEquals(2, nativeUint8ClampedArray0.getArrayLength());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      int int0 = nativeInt32Array0.getArrayLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(nativeArrayBuffer0, 0, 0);
      nativeUint32Array0.getArrayElement(0);
      assertEquals(0, nativeUint32Array0.getArrayLength());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      Class<FunctionObject> class0 = FunctionObject.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getTypedProperty((Scriptable) nativeInt32Array0, (-3932), class0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot convert undefined to org.mozilla.javascript.FunctionObject
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(0);
      SymbolKey symbolKey0 = SymbolKey.SPECIES;
      int int0 = nativeInt8Array0.findPrototypeId(symbolKey0);
      assertTrue(nativeInt8Array0.isEmpty());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array();
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) nativeFloat64Array0, "BYTES_PER_ELEMENT", context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: java.lang.String@0000000004 is not a function, it is object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(8);
      Byte byte0 = new Byte((byte)116);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeInt8Array0, byte0, 1, "getNameFunctionAndThis", 8, nativeInt8Array0);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        nativeInt8Array0.execIdCall(idFunctionObjectES6_0, context0, idFunctionObjectES6_0, idFunctionObjectES6_0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=1 MASTER=org.mozilla.javascript.typedarrays.NativeInt8Array@50
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array();
      boolean boolean0 = nativeUint32Array0.equals(nativeInt16Array0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(8);
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(8);
      boolean boolean0 = nativeInt32Array0.equals(nativeFloat32Array0);
      assertFalse(boolean0);
      assertEquals(8, nativeInt32Array0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(8);
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      boolean boolean0 = nativeInt32Array0.equals(nativeFloat32Array0);
      assertEquals(8, nativeFloat32Array0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(4);
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeInt32Array0, 1);
      assertEquals(4, nativeInt32Array0.getArrayLength());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(11);
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(760);
      boolean boolean0 = nativeUint16Array0.containsAll(nativeUint8Array0);
      assertTrue(boolean0);
      assertEquals(760, nativeUint16Array0.getArrayLength());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array();
      assertTrue(nativeUint32Array0.isEmpty());
      
      NativeArray nativeArray0 = new NativeArray(1);
      boolean boolean0 = nativeUint32Array0.containsAll(nativeArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      // Undeclared exception!
      try { 
        nativeInt8Array0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeTypedArrayView", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(4);
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      int int0 = nativeInt8Array0.lastIndexOf(nativeUint8Array0);
      assertEquals((-1), int0);
      assertEquals(0, nativeUint8Array0.getArrayLength());
      assertEquals(4, nativeInt8Array0.getArrayLength());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(4);
      // Undeclared exception!
      try { 
        nativeUint32Array0.addAll((Collection<? extends Long>) nativeUint32Array0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeTypedArrayView", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4);
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(2188);
      // Undeclared exception!
      try { 
        nativeUint8Array0.addAll(4, (Collection<? extends Integer>) nativeArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeTypedArrayView", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(nativeArrayBuffer0, 1366, (-113));
      // Undeclared exception!
      try { 
        nativeUint16Array0.add((Integer) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeTypedArrayView", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Float float0 = new Float((float) 4);
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(nativeArrayBuffer0, 1, 11);
      // Undeclared exception!
      try { 
        nativeFloat32Array0.add(13, float0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeTypedArrayView", e);
      }
  }
}
