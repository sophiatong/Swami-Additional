/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 23:18:51 GMT 2018
 */

package org.mozilla.javascript.typedarrays;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.IdFunctionCall;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeDataView;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeInt8Array;
import org.mozilla.javascript.typedarrays.NativeTypedArrayView;
import org.mozilla.javascript.typedarrays.NativeUint16Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeDataView_ESTest extends NativeDataView_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeDataView nativeDataView0 = new NativeDataView();
      Context context0 = Context.getCurrentContext();
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(3);
      NativeTypedArrayView nativeTypedArrayView0 = nativeInt8Array0.construct(nativeArrayBuffer0, 2, 14);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeTypedArrayView0, "DataView", 14, "H", 5, nativeDataView0);
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObjectES6_0, context0, nativeArrayBuffer0, nativeDataView0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: missing required offset parameter
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 4, "DataView", 13, nativeDataView0);
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      NativeDataView nativeDataView1 = new NativeDataView(nativeArrayBuffer0, 2, 13);
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, nativeArrayBuffer0, nativeDataView1, objectArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.mozilla.javascript.typedarrays.ByteIo", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      Object[] objectArray0 = new Object[4];
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeDataView0, "DataView", 8, "DataView", 1, nativeDataView0);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObjectES6_0, context0, nativeDataView0, nativeDataView0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // RangeError: offset out of range
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeDataView nativeDataView0 = new NativeDataView(nativeArrayBuffer0, 2, 13);
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      IdFunctionObject idFunctionObject0 = nativeDataView0.exportAsJSClass(160, scriptableObject0, true);
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) nativeArrayBuffer0;
      objectArray0[2] = (Object) 11;
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, nativeArrayBuffer0, idFunctionObject0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // RangeError: offset out of range
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView((NativeArrayBuffer) null, (-363), 1533);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject((IdFunctionCall) null, "DataView", (-363), 1533);
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array((NativeArrayBuffer) null, 13, 13);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, nativeUint16Array0, (Scriptable) null, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -363
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeDataView", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeDataView nativeDataView0 = new NativeDataView(nativeArrayBuffer0, 8, 0);
      Context context0 = Context.getCurrentContext();
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(170);
      NativeTypedArrayView nativeTypedArrayView0 = nativeInt8Array0.construct(nativeArrayBuffer0, 120, 2);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeTypedArrayView0, "DataView", 17, "ArrayBuffer", 5, nativeDataView0);
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObjectES6_0, context0, nativeArrayBuffer0, nativeInt16Array0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"ArrayBuffer\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeDataView nativeDataView0 = new NativeDataView();
      Context context0 = Context.enter();
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(nativeArrayBuffer0, 100, 2);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeInt16Array0, "DataView", 16, "DataView", 5, nativeDataView0);
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObjectES6_0, context0, nativeInt16Array0, idFunctionObjectES6_0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"DataView\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeDataView nativeDataView0 = new NativeDataView();
      Context context0 = Context.getCurrentContext();
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(3);
      NativeTypedArrayView nativeTypedArrayView0 = nativeInt8Array0.construct(nativeArrayBuffer0, 2, 1);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeTypedArrayView0, "DataView", 15, "error reporter", 5, nativeDataView0);
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObjectES6_0, context0, nativeTypedArrayView0, idFunctionObjectES6_0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"error reporter\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView((NativeArrayBuffer) null, 1522, 1522);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject((IdFunctionCall) null, "DataView", 13, 1522);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeDataView nativeDataView0 = new NativeDataView(nativeArrayBuffer0, 2, 8);
      Context context0 = Context.getCurrentContext();
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(8);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeInt32Array0, "DataView", 12, "language version", 5, nativeDataView0);
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObjectES6_0, context0, nativeInt32Array0, idFunctionObjectES6_0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"language version\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeDataView nativeDataView0 = new NativeDataView(nativeArrayBuffer0, 4, 0);
      Context context0 = Context.getCurrentContext();
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(nativeArrayBuffer0, 7, 110);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeInt32Array0, "DataView", 11, "language version", 5, nativeDataView0);
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObjectES6_0, context0, nativeInt32Array0, idFunctionObjectES6_0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"language version\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeDataView nativeDataView0 = new NativeDataView();
      Context context0 = Context.getCurrentContext();
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(3);
      NativeTypedArrayView nativeTypedArrayView0 = nativeInt8Array0.construct(nativeArrayBuffer0, 100, 10);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeTypedArrayView0, "DataView", 10, "error reporter", 5, nativeDataView0);
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObjectES6_0, context0, idFunctionObjectES6_0, nativeInt8Array0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"error reporter\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeDataView nativeDataView0 = new NativeDataView();
      Context context0 = Context.getCurrentContext();
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(3);
      NativeTypedArrayView nativeTypedArrayView0 = nativeInt8Array0.construct(nativeArrayBuffer0, 2, 9);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeTypedArrayView0, "DataView", 9, "error reporter", 5, nativeDataView0);
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObjectES6_0, context0, nativeTypedArrayView0, idFunctionObjectES6_0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"error reporter\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeDataView nativeDataView0 = new NativeDataView();
      Context context0 = Context.getCurrentContext();
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(3);
      NativeTypedArrayView nativeTypedArrayView0 = nativeInt8Array0.construct(nativeArrayBuffer0, 2, 16);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeTypedArrayView0, "DataView", 7, "error reporter", 5, nativeDataView0);
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObjectES6_0, context0, nativeTypedArrayView0, idFunctionObjectES6_0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"error reporter\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeDataView nativeDataView0 = new NativeDataView();
      Context context0 = Context.getCurrentContext();
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(13);
      NativeTypedArrayView nativeTypedArrayView0 = nativeInt8Array0.construct(nativeArrayBuffer0, 14, 150);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeTypedArrayView0, "DataView", 6, "DataView", 5, nativeDataView0);
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObjectES6_0, context0, nativeTypedArrayView0, idFunctionObjectES6_0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"DataView\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      Context context0 = Context.getCurrentContext();
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeInt32Array0, "DataView", 5, "language version", 5, nativeDataView0);
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObjectES6_0, context0, nativeInt32Array0, idFunctionObjectES6_0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"language version\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeDataView nativeDataView0 = new NativeDataView();
      Context context0 = Context.enter();
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(3);
      NativeTypedArrayView nativeTypedArrayView0 = nativeInt8Array0.construct(nativeArrayBuffer0, 2, 3);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeTypedArrayView0, "DataView", 3, "DataView", 5, nativeDataView0);
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObjectES6_0, context0, nativeTypedArrayView0, idFunctionObjectES6_0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"DataView\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeDataView nativeDataView0 = new NativeDataView(nativeArrayBuffer0, 2, 0);
      Context context0 = Context.getCurrentContext();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 2, "language version", 180, nativeContinuation0);
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(13);
      NativeTypedArrayView nativeTypedArrayView0 = nativeInt8Array0.construct(nativeArrayBuffer0, 13, 0);
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, nativeContinuation0, nativeTypedArrayView0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"language version\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeDataView nativeDataView0 = new NativeDataView(nativeArrayBuffer0, 2, 13);
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      IdFunctionObject idFunctionObject0 = nativeDataView0.exportAsJSClass(160, scriptableObject0, true);
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) nativeArrayBuffer0;
      NativeDataView nativeDataView1 = (NativeDataView)nativeDataView0.execIdCall(idFunctionObject0, context0, nativeArrayBuffer0, idFunctionObject0, objectArray0);
      assertEquals(0, nativeDataView1.getByteLength());
      assertEquals("DataView", nativeDataView1.getClassName());
      assertEquals(0, nativeDataView1.getByteOffset());
      assertEquals(1, idFunctionObject0.getLength());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeDataView nativeDataView0 = new NativeDataView(nativeArrayBuffer0, 2, 13);
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      IdFunctionObject idFunctionObject0 = nativeDataView0.exportAsJSClass(160, scriptableObject0, true);
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, nativeArrayBuffer0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Missing parameters
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeArrayBuffer0, nativeArrayBuffer0, 2, "ArrayBuffer", 0, nativeDataView0);
      Context context0 = Context.getCurrentContext();
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObjectES6_0, context0, nativeFloat32Array0, idFunctionObjectES6_0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=2 MASTER=org.mozilla.javascript.typedarrays.NativeArrayBuffer@3
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }
}