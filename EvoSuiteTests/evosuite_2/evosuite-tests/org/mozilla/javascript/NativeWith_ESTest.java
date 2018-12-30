/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 06:55:37 GMT 2018
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
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.NativeNumber;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeInt8Array;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeWith_ESTest extends NativeWith_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeWith nativeWith0 = new NativeWith((Scriptable) null, (Scriptable) null);
      // Undeclared exception!
      try { 
        nativeWith0.updateDotQuery(true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeWith", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeWith nativeWith0 = new NativeWith((Scriptable) null, baseFunction0);
      nativeWith0.put(15, (Scriptable) nativeWith0, (Object) nativeWith0);
      assertEquals("With", nativeWith0.getClassName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = NativeWith.isWithFunction((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeUint8ClampedArray0, (Object) null, 4, 8);
      boolean boolean0 = NativeWith.isWithFunction(idFunctionObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      NativeWith nativeWith0 = new NativeWith(nativeInt8Array0, nativeInt8Array0);
      NativeWith.init(nativeWith0, true);
      assertEquals("With", nativeWith0.getClassName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeWith nativeWith0 = new NativeWith((Scriptable) null, (Scriptable) null);
      // Undeclared exception!
      try { 
        nativeWith0.hasInstance((Scriptable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeWith", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(0);
      NativeWith nativeWith0 = new NativeWith(nativeInt16Array0, nativeInt16Array0);
      boolean boolean0 = nativeWith0.has("org.mozilla.javascript.NativeWith", (Scriptable) nativeInt16Array0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeWith nativeWith0 = new NativeWith((Scriptable) null, (Scriptable) null);
      // Undeclared exception!
      try { 
        nativeWith0.has((-1968), (Scriptable) nativeError0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeWith", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeWith nativeWith0 = new NativeWith((Scriptable) null, (Scriptable) null);
      // Undeclared exception!
      try { 
        nativeWith0.getIds();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeWith", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Array;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(8);
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(nativeArrayBuffer0, 0, 1);
      NativeWith nativeWith0 = new NativeWith(baseFunction0, nativeFloat32Array0);
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        nativeWith0.getDefaultValue(class0);
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
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      NativeWith nativeWith0 = new NativeWith(nativeInt8Array0, nativeInt8Array0);
      String string0 = nativeWith0.getClassName();
      assertEquals("With", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      NativeWith nativeWith0 = new NativeWith(nativeInt8Array0, nativeInt8Array0);
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeWith0, 100);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      NativeWith nativeWith0 = new NativeWith(nativeInt8Array0, nativeInt8Array0);
      Context context0 = Context.enter();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeWith0, "With", 1, 4);
      // Undeclared exception!
      try { 
        nativeWith0.execIdCall(idFunctionObject0, context0, nativeInt8Array0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Function \"With\" must be called directly, and not by way of a function of another name.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      NativeWith nativeWith0 = new NativeWith(nativeInt8Array0, nativeInt8Array0);
      nativeWith0.delete("Sm<_x");
      assertEquals("With", nativeWith0.getClassName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber(0.0);
      NativeWith nativeWith0 = new NativeWith(nativeNumber0, nativeNumber0);
      nativeWith0.delete(0);
      assertEquals("With", nativeWith0.getClassName());
  }
}