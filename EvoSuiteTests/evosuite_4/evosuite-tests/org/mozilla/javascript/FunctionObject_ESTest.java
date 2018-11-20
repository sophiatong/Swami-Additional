/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 04:50:27 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ArrowFunction;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.FunctionObject;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.JavaAdapter;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.NativeJavaArray;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.NativeJavaTopPackage;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeInt8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FunctionObject_ESTest extends FunctionObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<NativeJavaObject> class0 = NativeJavaObject.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      Method method0 = FunctionObject.findSingleMethod(methodArray0, "getPrototype");
      assertNotNull(method0);
      
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(4);
      FunctionObject functionObject0 = new FunctionObject("8Rb]'2T2fSb0E", method0, nativeInt8Array0);
      boolean boolean0 = functionObject0.isVarArgsConstructor();
      assertEquals(21, methodArray0.length);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      int int0 = FunctionObject.getTypeTag(class0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<NativeJavaObject> class0 = NativeJavaObject.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      Method method0 = FunctionObject.findSingleMethod(methodArray0, "getPrototype");
      assertNotNull(method0);
      
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      FunctionObject functionObject0 = new FunctionObject("8Rb]'2T2fSb0E", method0, nativeInt8Array0);
      functionObject0.getMethodOrConstructor();
      assertEquals("8Rb]'2T2fSb0E", functionObject0.getFunctionName());
      assertEquals(21, methodArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<NativeJavaObject> class0 = NativeJavaObject.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      Method method0 = FunctionObject.findSingleMethod(methodArray0, "getPrototype");
      assertNotNull(method0);
      
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      FunctionObject functionObject0 = new FunctionObject("b]'2T23fSb0E", method0, nativeInt8Array0);
      String string0 = functionObject0.getFunctionName();
      assertEquals("b]'2T23fSb0E", string0);
      assertEquals(21, methodArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<NativeJavaObject> class0 = NativeJavaObject.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      Method method0 = FunctionObject.findSingleMethod(methodArray0, "getPrototype");
      assertNotNull(method0);
      
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(4);
      FunctionObject functionObject0 = new FunctionObject("wrap", method0, nativeInt8Array0);
      int int0 = functionObject0.getLength();
      assertEquals(21, methodArray0.length);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<NativeJavaObject> class0 = NativeJavaObject.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      // Undeclared exception!
      try { 
        FunctionObject.findSingleMethod(methodArray0, "put");
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Method \"put\" occurs multiple times in class \"org.mozilla.javascript.NativeJavaObject\".
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<ArrowFunction> class0 = ArrowFunction.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      Method method0 = FunctionObject.findSingleMethod(methodArray0, "getLength");
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(nativeArrayBuffer0, (-2), (-1600));
      FunctionObject functionObject0 = new FunctionObject("getLength", method0, nativeInt32Array0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      // Undeclared exception!
      try { 
        functionObject0.createObject(context0, nativeInt32Array0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Wrapped java.lang.InstantiationException: org.mozilla.javascript.ArrowFunction
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      Object object0 = FunctionObject.convertArg(context0, (Scriptable) null, (Object) null, 6);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage((ClassLoader) null);
      Class<NativeJavaArray> class0 = NativeJavaArray.class;
      Object object0 = FunctionObject.convertArg((Context) null, (Scriptable) nativeJavaTopPackage0, (Object) null, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      // Undeclared exception!
      try { 
        FunctionObject.convertArg((Context) null, (Scriptable) importerTopLevel0, (Object) importerTopLevel0, 4);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      Object object0 = FunctionObject.convertArg(context0, (Scriptable) nativeArrayBuffer0, (Object) nativeArrayBuffer0, 3);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object object0 = FunctionObject.convertArg((Context) null, (Scriptable) nativeContinuation0, (Object) "msg.bad.ctor.return", 1);
      assertEquals("msg.bad.ctor.return", object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = Context.enter();
      Class<String> class0 = String.class;
      Object object0 = FunctionObject.convertArg(context0, (Scriptable) null, (Object) null, (Class<?>) class0);
      assertNotNull(object0);
      assertEquals("null", object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      Object object0 = FunctionObject.convertArg(context0, (Scriptable) null, (Object) context0.generateObserverCount, 3);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<NativeJavaObject> class0 = NativeJavaObject.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      Method method0 = FunctionObject.findSingleMethod(methodArray0, "getPrototype");
      assertNotNull(method0);
      
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      FunctionObject functionObject0 = new FunctionObject("8Rb]'2T2fSb0E", method0, nativeInt8Array0);
      assertEquals(0, functionObject0.getLength());
      
      Scriptable scriptable0 = functionObject0.construct((Context) null, (Scriptable) null, methodArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      functionObject0.call((Context) null, scriptable0, scriptable0, context0.emptyArgs);
      assertEquals(21, methodArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<NativeJavaObject> class0 = NativeJavaObject.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      Method method0 = FunctionObject.findSingleMethod(methodArray0, "getPrototype");
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(4);
      FunctionObject functionObject0 = new FunctionObject("wrap", method0, nativeInt8Array0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      // Undeclared exception!
      try { 
        functionObject0.call(context0, (Scriptable) null, (Scriptable) null, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"wrap\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<NativeJavaObject> class0 = NativeJavaObject.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      Method method0 = FunctionObject.findSingleMethod(methodArray0, "getPrototype");
      assertNotNull(method0);
      
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(4);
      FunctionObject functionObject0 = new FunctionObject("8Rb]'2T2fSb0E", method0, nativeInt8Array0);
      functionObject0.addAsConstructor(nativeInt8Array0, nativeInt8Array0);
      assertEquals("8Rb]'2T2fSb0E", functionObject0.getFunctionName());
      assertEquals(21, methodArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<BaseFunction> class0 = BaseFunction.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      Method method0 = FunctionObject.findSingleMethod(methodArray0, "call");
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(nativeArrayBuffer0, 3, 0);
      FunctionObject functionObject0 = null;
      try {
        functionObject0 = new FunctionObject("call", method0, nativeInt8Array0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Unsupported parameter type \"org.mozilla.javascript.Context\" in method \"call\".
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        JavaAdapter.runScript((Script) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.JavaAdapter$2", e);
      }
  }
}
