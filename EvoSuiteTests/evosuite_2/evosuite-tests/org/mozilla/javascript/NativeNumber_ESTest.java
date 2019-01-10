/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 04:35:50 GMT 2018
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
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.NativeNumber;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeNumber_ESTest extends NativeNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Object object0 = NativeNumber.isFinite(contextFactory0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber(0.0);
      // Undeclared exception!
      try { 
        nativeNumber0.initPrototypeId(1438);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1438
         //
         verifyException("org.mozilla.javascript.NativeNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber(2816.3);
      int int0 = nativeNumber0.findPrototypeId("|WFg(L9_] R?_");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber(401.8166408708786);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeNumber0, "Number", 13, 1);
      ContextFactory contextFactory0 = new ContextFactory();
      Object[] objectArray0 = new Object[9];
      // Undeclared exception!
      try { 
        contextFactory0.doTopCall(idFunctionObject0, (Context) null, nativeNumber0, nativeNumber0, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("org.mozilla.javascript.NativeNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(2055);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = Context.enter((Context) null, contextFactory0);
      NativeNumber nativeNumber0 = new NativeNumber(150);
      IdFunctionObject idFunctionObject0 = nativeNumber0.exportAsJSClass(10, nativeArrayBuffer0, true);
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) nativeNumber0;
      Object object0 = nativeNumber0.execIdCall(idFunctionObject0, context0, nativeArrayBuffer0, idFunctionObject0, objectArray0);
      assertEquals(150.0, object0);
      assertEquals("Number", idFunctionObject0.getFunctionName());
      assertEquals(1, idFunctionObject0.getArity());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber(1.7976931348623157E308);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeNumber0, "Number", 4, 1);
      ContextFactory contextFactory0 = new ContextFactory();
      Object[] objectArray0 = new Object[8];
      Object object0 = contextFactory0.doTopCall(idFunctionObject0, (Context) null, nativeNumber0, nativeNumber0, objectArray0);
      assertEquals("(new Number(1.7976931348623157e+308))", object0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber(1.7976931348623157E308);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeNumber0, "Number", 4, 1);
      Object[] objectArray0 = new Object[8];
      // Undeclared exception!
      try { 
        nativeNumber0.execIdCall(idFunctionObject0, (Context) null, idFunctionObject0, idFunctionObject0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }
}
