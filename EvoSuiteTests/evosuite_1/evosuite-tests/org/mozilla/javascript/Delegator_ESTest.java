/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 04:08:06 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.FunctionObject;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.NativeJavaTopPackage;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Synchronizer;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Delegator_ESTest extends Delegator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(3250);
      Delegator delegator0 = new Delegator(nativeFloat32Array0);
      delegator0.setPrototype(nativeFloat32Array0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(3250);
      Delegator delegator0 = new Delegator(nativeFloat32Array0);
      delegator0.setParentScope(nativeFloat32Array0);
      assertEquals("Float32Array", nativeFloat32Array0.getClassName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      Delegator delegator0 = new Delegator(nativeArrayBuffer0);
      delegator0.put("~|Za::)<DwV<.N", (Scriptable) nativeArrayBuffer0, (Object) nativeArrayBuffer0);
      assertFalse(nativeArrayBuffer0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Synchronizer synchronizer0 = new Synchronizer((Scriptable) null);
      // Undeclared exception!
      try { 
        synchronizer0.newInstance();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Wrapped java.lang.InstantiationException: org.mozilla.javascript.Synchronizer
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeWith nativeWith0 = new NativeWith(importerTopLevel0, importerTopLevel0);
      Synchronizer synchronizer0 = new Synchronizer(nativeWith0, nativeWith0);
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(nativeArrayBuffer0, 5536, 13);
      boolean boolean0 = synchronizer0.has("[;?(-F<-TZnK", (Scriptable) nativeInt32Array0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeWith nativeWith0 = new NativeWith(importerTopLevel0, importerTopLevel0);
      Synchronizer synchronizer0 = new Synchronizer(nativeWith0, nativeWith0);
      boolean boolean0 = synchronizer0.has(49, (Scriptable) importerTopLevel0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      Scriptable scriptable0 = delegator0.getDelegee();
      assertNull(scriptable0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      Object object0 = delegator0.getDefaultValue((Class<?>) null);
      assertSame(delegator0, object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeWith nativeWith0 = new NativeWith(importerTopLevel0, importerTopLevel0);
      Synchronizer synchronizer0 = new Synchronizer(nativeWith0, nativeWith0);
      String string0 = synchronizer0.getClassName();
      assertEquals("With", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Synchronizer synchronizer0 = new Synchronizer(nativeError0);
      Scriptable scriptable0 = ScriptableObject.getFunctionPrototype(synchronizer0);
      assertNull(scriptable0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray(nativeArrayBuffer0, 4, 1);
      Delegator delegator0 = new Delegator(nativeUint8ClampedArray0);
      Object object0 = delegator0.get((-1640531527), (Scriptable) nativeArrayBuffer0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(43);
      Delegator delegator0 = new Delegator(nativeInt16Array0);
      delegator0.delete(">T(Ec");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray(nativeArrayBuffer0, 4, 1);
      Delegator delegator0 = new Delegator(nativeUint8ClampedArray0);
      delegator0.delete(4);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      Context context0 = Context.enter();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(200);
      Object[] objectArray0 = new Object[6];
      // Undeclared exception!
      try { 
        delegator0.construct(context0, nativeArrayBuffer0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot convert null to an object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      Context context0 = Context.enter();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(200);
      Scriptable scriptable0 = delegator0.construct(context0, nativeArrayBuffer0, context0.emptyArgs);
      assertNotSame(scriptable0, delegator0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      Synchronizer synchronizer0 = new Synchronizer(nativeJavaTopPackage0);
      Class<FunctionObject> class0 = FunctionObject.class;
      Object object0 = synchronizer0.getDefaultValue(class0);
      assertEquals("[JavaPackage ]", object0);
  }
}
