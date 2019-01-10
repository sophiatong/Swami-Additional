/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 04:59:27 GMT 2018
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
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.NativeJavaClass;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Synchronizer;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeUint32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Delegator_ESTest extends Delegator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      Synchronizer synchronizer0 = new Synchronizer(nativeArrayBuffer0);
      synchronizer0.setPrototype(nativeArrayBuffer0);
      assertFalse(nativeArrayBuffer0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Synchronizer synchronizer0 = new Synchronizer(nativeJavaClass0, nativeJavaClass0);
      synchronizer0.setParentScope(nativeJavaClass0);
      assertEquals("JavaClass", nativeJavaClass0.getClassName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(nativeArrayBuffer0, (-1901), 0);
      Synchronizer synchronizer0 = new Synchronizer(nativeFloat32Array0);
      synchronizer0.put("Io", (Scriptable) nativeArrayBuffer0, (Object) nativeArrayBuffer0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(0);
      Synchronizer synchronizer0 = new Synchronizer(nativeInt32Array0);
      synchronizer0.put(2, (Scriptable) nativeInt32Array0, (Object) nativeInt32Array0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        delegator0.hasInstance((Scriptable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Delegator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array();
      Delegator delegator0 = new Delegator(nativeUint32Array0);
      // Undeclared exception!
      try { 
        delegator0.has((String) null, (Scriptable) nativeUint32Array0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeTypedArrayView", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      // Undeclared exception!
      try { 
        delegator0.has(2, (Scriptable) nativeInt32Array0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Delegator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      Delegator delegator0 = (Delegator)context0.scratchScriptable;
      Synchronizer synchronizer0 = new Synchronizer(delegator0, contextFactory0);
      // Undeclared exception!
      try { 
        synchronizer0.getPrototype();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Delegator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(nativeArrayBuffer0, 8, 2);
      Synchronizer synchronizer0 = new Synchronizer(nativeFloat64Array0, nativeFloat64Array0);
      Scriptable scriptable0 = synchronizer0.getParentScope();
      assertNull(scriptable0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Synchronizer synchronizer0 = new Synchronizer((Scriptable) null, (Object) null);
      // Undeclared exception!
      try { 
        synchronizer0.getIds();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Delegator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      Scriptable scriptable0 = delegator0.getDelegee();
      assertNull(scriptable0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        delegator0.getClassName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Delegator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      Delegator delegator0 = new Delegator(nativeJavaObject0);
      // Undeclared exception!
      try { 
        delegator0.get((String) null, (Scriptable) nativeJavaObject0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Delegator delegator0 = new Delegator((Scriptable) null);
      // Undeclared exception!
      try { 
        delegator0.get(1, (Scriptable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Delegator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(nativeArrayBuffer0, (-2226), 8);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Synchronizer synchronizer0 = new Synchronizer(nativeInt16Array0, nativeContinuation0);
      synchronizer0.delete("ArrayBuffer");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      delegator0.setDelegee(nativeInt32Array0);
      delegator0.delete(2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = new Object[6];
      // Undeclared exception!
      try { 
        delegator0.construct(context0, baseFunction0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot convert null to an object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      Delegator delegator0 = new Delegator();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      // Undeclared exception!
      try { 
        delegator0.call(context0, nativeBoolean0, nativeBoolean0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Delegator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      Context context0 = Context.getCurrentContext();
      Scriptable scriptable0 = delegator0.construct(context0, delegator0, context0.emptyArgs);
      assertNotSame(scriptable0, delegator0);
  }
}
