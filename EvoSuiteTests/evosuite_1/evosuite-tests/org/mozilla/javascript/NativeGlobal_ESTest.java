/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 05:29:18 GMT 2018
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
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.NativeGlobal;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeGlobal_ESTest extends NativeGlobal_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) "0mKU+$tQ8;!T#l0-8";
      Object object0 = NativeGlobal.js_parseInt(objectArray0);
      assertEquals(0.0, object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Float float0 = new Float(16.09278799039682);
      Object[] objectArray0 = new Object[3];
      objectArray0[1] = (Object) float0;
      Object object0 = NativeGlobal.js_parseInt(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Float float0 = new Float((-3.8685855315621236));
      Object[] objectArray0 = new Object[2];
      objectArray0[1] = (Object) float0;
      Object object0 = NativeGlobal.js_parseInt(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Float float0 = new Float((-4.545395439293696));
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) float0;
      Object object0 = NativeGlobal.js_parseInt(objectArray0);
      assertEquals((-4.0), object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[16];
      objectArray0[0] = (Object) " E-fC3bA";
      Object object0 = NativeGlobal.js_parseInt(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) "";
      Object object0 = NativeGlobal.js_parseInt(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Float float0 = new Float(1.0E21);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) float0;
      Object object0 = NativeGlobal.js_parseFloat(objectArray0);
      assertEquals(1.0000000200408773E21, object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) "Invalid ";
      Object object0 = NativeGlobal.js_parseFloat(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) "Infinityoken: ";
      Object object0 = NativeGlobal.js_parseFloat(objectArray0);
      assertEquals(Double.POSITIVE_INFINITY, object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Float float0 = new Float((-4.545395439293696));
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) float0;
      Object object0 = NativeGlobal.js_parseFloat(objectArray0);
      assertEquals((-4.545395374298096), object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[16];
      objectArray0[0] = (Object) " E-fC3bA";
      Object object0 = NativeGlobal.js_parseFloat(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) "";
      Object object0 = NativeGlobal.js_parseFloat(objectArray0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      Object object0 = NativeGlobal.js_parseFloat(context0.emptyArgs);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeGlobal nativeGlobal0 = new NativeGlobal();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(9);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeGlobal0, nativeGlobal0, 13, "error reporter", 53, nativeArrayBuffer0);
      boolean boolean0 = NativeGlobal.isEvalFunction(idFunctionObjectES6_0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeGlobal nativeGlobal0 = new NativeGlobal();
      Context context0 = Context.getCurrentContext();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(9);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeGlobal0, nativeGlobal0, 13, "error reporter", 53, nativeArrayBuffer0);
      // Undeclared exception!
      try { 
        nativeGlobal0.execIdCall(idFunctionObjectES6_0, context0, nativeArrayBuffer0, nativeArrayBuffer0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=13 MASTER=org.mozilla.javascript.NativeGlobal@1
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Context context0 = Context.enter();
      NativeObject nativeObject0 = new NativeObject();
      EcmaError ecmaError0 = NativeGlobal.constructError(context0, "error reporter", "g#;KQkvR^eFn'B<(", (Scriptable) nativeObject0, "error reporter", 0, 0, "error reporter");
      assertEquals(0, ecmaError0.lineNumber());
      assertEquals("g#;KQkvR^eFn'B<(", ecmaError0.getErrorMessage());
      assertEquals("error reporter", ecmaError0.sourceName());
      assertEquals(0, ecmaError0.getColumnNumber());
      assertEquals("error reporter", ecmaError0.getName());
      assertEquals("error reporter", ecmaError0.getLineSource());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      Delegator delegator0 = new Delegator();
      EcmaError ecmaError0 = NativeGlobal.constructError(context0, "fY/$", "fY/$", (Scriptable) delegator0);
      assertFalse(ecmaError0.usesMozillaStackStyle());
  }
}
