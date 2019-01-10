/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 02:44:33 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.NativeGlobal;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeGlobal_ESTest extends NativeGlobal_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Short short0 = new Short((short)16);
      Object[] objectArray0 = new Object[6];
      objectArray0[1] = (Object) short0;
      Object object0 = NativeGlobal.js_parseInt(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      objectArray0[1] = (Object) "4294966302";
      Object object0 = NativeGlobal.js_parseInt(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[22];
      objectArray0[0] = (Object) "-)qf0vca1hm";
      Object object0 = NativeGlobal.js_parseInt(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[18];
      objectArray0[0] = (Object) " {";
      Object object0 = NativeGlobal.js_parseInt(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) "";
      Object object0 = NativeGlobal.js_parseInt(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Byte byte0 = new Byte((byte)14);
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) byte0;
      Object object0 = NativeGlobal.js_parseFloat(objectArray0);
      assertEquals(14.0, object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "ec";
      Object object0 = NativeGlobal.js_parseFloat(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "e";
      Object object0 = NativeGlobal.js_parseFloat(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) ".#a{";
      Object object0 = NativeGlobal.js_parseFloat(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "IS?FEQ";
      Object object0 = NativeGlobal.js_parseFloat(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "+";
      Object object0 = NativeGlobal.js_parseFloat(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[22];
      objectArray0[0] = (Object) "-)qf0vca1hm";
      Object object0 = NativeGlobal.js_parseFloat(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[18];
      objectArray0[0] = (Object) " {";
      Object object0 = NativeGlobal.js_parseFloat(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "";
      Object object0 = NativeGlobal.js_parseFloat(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Object object0 = NativeGlobal.js_parseFloat(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeGlobal nativeGlobal0 = new NativeGlobal();
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray(nativeArrayBuffer0, (-808), 8);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeGlobal0, "IS?FEQ", (-808), "IS?FEQ", 117, nativeUint8ClampedArray0);
      boolean boolean0 = NativeGlobal.isEvalFunction(idFunctionObjectES6_0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeGlobal nativeGlobal0 = new NativeGlobal();
      Object[] objectArray0 = new Object[2];
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray(nativeArrayBuffer0, (-808), 8);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeGlobal0, "IS?FEQ", (-808), "IS?FEQ", 117, nativeUint8ClampedArray0);
      // Undeclared exception!
      try { 
        nativeGlobal0.execIdCall(idFunctionObjectES6_0, (Context) null, idFunctionObjectES6_0, idFunctionObjectES6_0, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=-808 MASTER=org.mozilla.javascript.NativeGlobal@1
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      // Undeclared exception!
      try { 
        context0.initSafeStandardObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }
}
