/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 04:41:08 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionCall;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.JavaMembers;
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.NativeJavaClass;
import org.mozilla.javascript.NativeJavaConstructor;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.NativeJavaPackage;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeInt8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseFunction_ESTest extends BaseFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage(false, "length", (ClassLoader) null);
      // Undeclared exception!
      try { 
        baseFunction0.setInstanceIdValue(0, nativeJavaPackage0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 0
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(3076);
      Class<Object> class0 = Object.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeInt8Array0, class0, true);
      NativeJavaMethod nativeJavaMethod0 = javaMembers0.ctors;
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      nativeJavaMethod0.setInstanceIdValue(1, nativeJavaClass0);
      assertEquals("Function", nativeJavaMethod0.getClassName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeJavaConstructor nativeJavaConstructor0 = new NativeJavaConstructor((MemberBox) null);
      nativeJavaConstructor0.setInstanceIdAttributes(5, 5);
      assertTrue(nativeJavaConstructor0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6((IdFunctionCall) null, nativeBoolean0, 4, "DmnS)`W.u]", 4, nativeBoolean0);
      // Undeclared exception!
      try { 
        idFunctionObjectES6_0.hasInstance(nativeBoolean0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: 'prototype' property of DmnS)`W.u] is not an object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) baseFunction0, "language version", context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: java.lang.String@0000000004 is not a function, it is function.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(3076);
      Class<Object> class0 = Object.class;
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      JavaMembers javaMembers0 = new JavaMembers(nativeInt8Array0, class0, true);
      NativeJavaMethod nativeJavaMethod0 = javaMembers0.ctors;
      nativeJavaMethod0.setInstanceIdValue(4, (Object) null);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeJavaMethod0.construct(context0, nativeArrayBuffer0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      int int0 = baseFunction0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(3076);
      Class<Object> class0 = Object.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeInt8Array0, class0, true);
      NativeJavaMethod nativeJavaMethod0 = javaMembers0.ctors;
      Object object0 = nativeJavaMethod0.getInstanceIdValue(2);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        baseFunction0.setInstanceIdAttributes(120, 110);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 120
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeWith nativeWith0 = new NativeWith(baseFunction0, baseFunction0);
      baseFunction0.setInstanceIdValue(5, nativeWith0);
      NativeWith nativeWith1 = (NativeWith)baseFunction0.getInstanceIdValue(5);
      assertEquals("With", nativeWith1.getClassName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6((IdFunctionCall) null, nativeBoolean0, 4, "DmnS)`W.u]", 4, nativeBoolean0);
      Object[] objectArray0 = idFunctionObjectES6_0.getIds();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      String string0 = baseFunction0.decompile(1, 2);
      assertEquals("function () {\n\t[native code, arity=0]\n}\n", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = Context.enter();
      NativeError nativeError0 = new NativeError();
      NativeObject nativeObject0 = (NativeObject)baseFunction0.construct(context0, nativeError0, context0.emptyArgs);
      assertEquals(1, ScriptableObject.READONLY);
  }
}
