/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 19:43:08 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.tools.shell.Environment;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeInt16Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Environment_ESTest extends Environment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(0);
      Environment environment0 = new Environment(nativeInt16Array0);
      boolean boolean0 = environment0.has("msg.is.not.defined", (Scriptable) nativeInt16Array0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Environment environment0 = new Environment();
      NativeArray nativeArray0 = new NativeArray(1);
      boolean boolean0 = environment0.has("Fz2PWt?(.G", (Scriptable) nativeArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Environment environment0 = new Environment();
      Object[] objectArray0 = environment0.getIds();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Environment environment0 = new Environment();
      Object[] objectArray0 = environment0.getAllIds();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array();
      Environment environment0 = new Environment(nativeFloat32Array0);
      Object[] objectArray0 = environment0.getAllIds();
      assertEquals(71, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array();
      Environment environment0 = new Environment(nativeFloat32Array0);
      Object object0 = environment0.get("Environment", (Scriptable) nativeFloat32Array0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array();
      Environment environment0 = new Environment(nativeFloat32Array0);
      // Undeclared exception!
      try { 
        Environment.defineClass((ScriptableObject) environment0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.tools.shell.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array();
      Environment environment0 = new Environment(nativeFloat32Array0);
      Object[] objectArray0 = environment0.getIds();
      assertEquals(71, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Environment.defineClass((ScriptableObject) importerTopLevel0);
      Environment environment0 = new Environment(importerTopLevel0);
      assertEquals("Environment", environment0.getClassName());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Environment environment0 = new Environment();
      NativeArray nativeArray0 = new NativeArray(1);
      Object object0 = environment0.get("Fz2PWt?(.G", (Scriptable) nativeArray0);
      assertNotNull(object0);
  }
}
