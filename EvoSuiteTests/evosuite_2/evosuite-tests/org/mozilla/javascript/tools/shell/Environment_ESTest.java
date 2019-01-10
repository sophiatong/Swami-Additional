/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 20:25:42 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.tools.shell.Environment;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeUint16Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Environment_ESTest extends Environment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Environment environment0 = new Environment();
      ScriptableObject.putConstProperty(environment0, "cosh", "cosh");
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      Environment environment0 = new Environment(nativeUint16Array0);
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) environment0, "x{g39LJEaGCQ/S]");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Environment environment0 = new Environment();
      Object[] objectArray0 = environment0.getIds();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      Environment environment0 = new Environment(nativeUint16Array0);
      Object[] objectArray0 = environment0.getIds();
      assertEquals(71, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Environment environment0 = new Environment();
      Object[] objectArray0 = environment0.getAllIds();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      Environment environment0 = new Environment(nativeInt16Array0);
      environment0.put("rwsr_1p2v]H5o$UCPw ", (Scriptable) nativeInt16Array0, (Object) "rwsr_1p2v]H5o$UCPw ");
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) environment0, "rwsr_1p2v]H5o$UCPw ", context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: java.lang.String@0000000010 is not a function, it is object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Environment environment0 = new Environment();
      Environment.defineClass((ScriptableObject) environment0);
      assertEquals("Environment", environment0.getClassName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      Environment environment0 = new Environment(nativeInt16Array0);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) environment0, "rwsr_1p2v]H5o$UCPw ", context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: java.lang.String@0000000008 is not a function, it is object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Environment environment0 = new Environment(baseFunction0);
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
  public void test09()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Environment environment0 = new Environment(baseFunction0);
      Object[] objectArray0 = environment0.getAllIds();
      assertEquals(71, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Environment.defineClass((ScriptableObject) baseFunction0);
      Environment environment0 = new Environment(baseFunction0);
      assertEquals("Environment", environment0.getClassName());
  }
}
