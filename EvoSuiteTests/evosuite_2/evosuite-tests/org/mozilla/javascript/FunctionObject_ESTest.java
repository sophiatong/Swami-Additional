/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 08:23:44 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ConsString;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.FunctionObject;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeCall;
import org.mozilla.javascript.NativeGenerator;
import org.mozilla.javascript.NativeJSON;
import org.mozilla.javascript.NativeSymbol;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeUint32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FunctionObject_ESTest extends FunctionObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<NativeJSON> class0 = NativeJSON.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      Method method0 = FunctionObject.findSingleMethod(methodArray0, "getClassName");
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      FunctionObject functionObject0 = new FunctionObject("getFunctionName", method0, nativeArrayBuffer0);
      functionObject0.isVarArgsConstructor();
      assertEquals(4, methodArray0.length);
      assertEquals("getFunctionName", functionObject0.getFunctionName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      int int0 = FunctionObject.getTypeTag(class0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<NativeJSON> class0 = NativeJSON.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      Method method0 = FunctionObject.findSingleMethod(methodArray0, "getClassName");
      assertNotNull(method0);
      
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      FunctionObject functionObject0 = new FunctionObject("getFunctionName", method0, nativeArrayBuffer0);
      functionObject0.getMethodOrConstructor();
      assertEquals(4, methodArray0.length);
      assertEquals(0, functionObject0.getLength());
      assertEquals("getFunctionName", functionObject0.getFunctionName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<NativeJSON> class0 = NativeJSON.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      Method method0 = FunctionObject.findSingleMethod(methodArray0, "getClassName");
      assertNotNull(method0);
      
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      FunctionObject functionObject0 = new FunctionObject("getFunctionName", method0, nativeArrayBuffer0);
      int int0 = functionObject0.getLength();
      assertEquals(4, methodArray0.length);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<NativeJSON> class0 = NativeJSON.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      Method method0 = FunctionObject.findSingleMethod(methodArray0, "getClassName");
      assertNotNull(method0);
      
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      FunctionObject functionObject0 = new FunctionObject("getFunctionName", method0, nativeArrayBuffer0);
      String string0 = functionObject0.getFunctionName();
      assertEquals(4, methodArray0.length);
      assertEquals("getFunctionName", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<NativeSymbol> class0 = NativeSymbol.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      // Undeclared exception!
      try { 
        FunctionObject.findSingleMethod(methodArray0, "put");
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Method \"put\" occurs multiple times in class \"org.mozilla.javascript.NativeSymbol\".
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<NativeJSON> class0 = NativeJSON.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      Method method0 = FunctionObject.findSingleMethod(methodArray0, "getClassName");
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      FunctionObject functionObject0 = new FunctionObject("getFunctionName", method0, nativeArrayBuffer0);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        functionObject0.createObject(context0, nativeArrayBuffer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Wrapped java.lang.IllegalAccessException: Class org.mozilla.javascript.FunctionObject can not access a member of class org.mozilla.javascript.NativeJSON with modifiers \"private\"
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Class<ConsString> class0 = ConsString.class;
      // Undeclared exception!
      try { 
        FunctionObject.convertArg(context0, (Scriptable) nativeArray0, (Object) context0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't convert to type \"org.mozilla.javascript.ConsString\".
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      NativeWith nativeWith0 = new NativeWith(nativeInt16Array0, nativeInt16Array0);
      // Undeclared exception!
      try { 
        FunctionObject.convertArg(context0, (Scriptable) nativeWith0, (Object) context0, 200);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.FunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      Context context1 = (Context)FunctionObject.convertArg(context0, (Scriptable) nativeInt32Array0, (Object) context0, 6);
      assertFalse(context1.isSealed());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = FunctionObject.convertArg((Context) null, (Scriptable) null, (Object) null, 4);
      Object object1 = FunctionObject.convertArg((Context) null, (Scriptable) null, object0, 4);
      assertEquals(0.0, object1);
      assertNotNull(object1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = FunctionObject.convertArg((Context) null, (Scriptable) null, (Object) null, 3);
      Object object1 = FunctionObject.convertArg((Context) null, (Scriptable) null, object0, 3);
      assertEquals(false, object1);
      assertNotNull(object1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(2);
      Object object0 = FunctionObject.convertArg((Context) null, (Scriptable) null, (Object) integer0, 2);
      assertEquals(2, object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = FunctionObject.convertArg((Context) null, (Scriptable) null, (Object) "null", 1);
      assertEquals("null", object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = FunctionObject.convertArg((Context) null, (Scriptable) null, (Object) null, 1);
      assertEquals("null", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(nativeArrayBuffer0, 2, 4);
      Class<NativeGenerator> class0 = NativeGenerator.class;
      Object object0 = FunctionObject.convertArg((Context) null, (Scriptable) nativeUint32Array0, (Object) nativeArrayBuffer0, (Class<?>) class0);
      assertSame(object0, nativeArrayBuffer0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<NativeJSON> class0 = NativeJSON.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      Method method0 = FunctionObject.findSingleMethod(methodArray0, "getClassName");
      assertNotNull(method0);
      
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      FunctionObject functionObject0 = new FunctionObject("getFunctionName", method0, nativeArrayBuffer0);
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(4);
      functionObject0.addAsConstructor(nativeArrayBuffer0, nativeFloat32Array0);
      assertEquals(4, methodArray0.length);
      assertEquals("getFunctionName", functionObject0.getFunctionName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<NativeCall> class0 = NativeCall.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(0);
      Method method0 = FunctionObject.findSingleMethod(methodArray0, "execIdCall");
      FunctionObject functionObject0 = null;
      try {
        functionObject0 = new FunctionObject("execIdCall", method0, nativeFloat64Array0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Unsupported parameter type \"org.mozilla.javascript.Context\" in method \"execIdCall\".
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }
}
