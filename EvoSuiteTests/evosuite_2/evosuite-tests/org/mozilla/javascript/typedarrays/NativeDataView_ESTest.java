/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 01:20:55 GMT 2018
 */

package org.mozilla.javascript.typedarrays;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Synchronizer;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeDataView;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeDataView_ESTest extends NativeDataView_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 8, 13);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        Context.call(contextFactory0, (Callable) idFunctionObject0, (Scriptable) nativeDataView0, (Scriptable) nativeDataView0, context0.emptyArgs);
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
      // Undeclared exception!
      try { 
        nativeDataView0.initPrototypeId(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeDataView", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      Context context0 = Context.enter();
      NativeDataView.init(context0, nativeDataView0, false);
      assertEquals("DataView", nativeDataView0.getClassName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      int int0 = nativeDataView0.findPrototypeId("setFloat64");
      assertEquals(17, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeDataView nativeDataView0 = new NativeDataView(nativeArrayBuffer0, 1, 0);
      int int0 = nativeDataView0.findPrototypeId("getFloat64");
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeDataView nativeDataView0 = new NativeDataView(nativeArrayBuffer0, 8, 1);
      int int0 = nativeDataView0.findPrototypeId("setlInt16");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      int int0 = nativeDataView0.findPrototypeId("setUint8");
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      int int0 = nativeDataView0.findPrototypeId("setUin32");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      int int0 = nativeDataView0.findPrototypeId("setInt16");
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeDataView nativeDataView0 = new NativeDataView(nativeArrayBuffer0, 8, 1);
      int int0 = nativeDataView0.findPrototypeId("setIt16");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeDataView0, "DataView", 411, "7;V2S", 1, nativeDataView0);
      Object[] objectArray0 = new Object[6];
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObjectES6_0, (Context) null, idFunctionObjectES6_0, idFunctionObjectES6_0, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 411
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeDataView", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 13, 13);
      Context context0 = Context.getCurrentContext();
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
  public void test12()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeDataView0, "DataView", 7, "DataView", 8, nativeDataView0);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObjectES6_0, context0, idFunctionObjectES6_0, idFunctionObjectES6_0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"DataView\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 2, 13);
      Context context0 = Context.getCurrentContext();
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
  public void test14()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      Context context0 = Context.enter();
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeDataView0, nativeArrayBuffer0, 1, "DataView", 18, nativeArrayBuffer0);
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObjectES6_0, context0, idFunctionObjectES6_0, idFunctionObjectES6_0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=1 MASTER=org.mozilla.javascript.typedarrays.NativeDataView@3
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 4, "ArrayBuffer", 1, nativeDataView0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = Context.getCurrentContext();
      Synchronizer synchronizer0 = new Synchronizer(idFunctionObject0, contextFactory0);
      // Undeclared exception!
      try { 
        synchronizer0.call(context0, (Scriptable) null, nativeDataView0, context0.emptyArgs);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // TypeError: missing required offset parameter
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }
}
