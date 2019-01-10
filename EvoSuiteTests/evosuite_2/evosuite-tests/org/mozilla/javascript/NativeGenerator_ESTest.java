/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 06:27:03 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.NativeGenerator;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.TopLevel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeGenerator_ESTest extends NativeGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(importerTopLevel0, false);
      // Undeclared exception!
      try { 
        nativeGenerator0.initPrototypeId(200);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 200
         //
         verifyException("org.mozilla.javascript.NativeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeBoolean0, false);
      Object[] objectArray0 = Context.emptyArgs;
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeGenerator0, "Generator", 13, "Generator", 0, nativeBoolean0);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        nativeGenerator0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeGenerator0, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("org.mozilla.javascript.NativeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(topLevel0, true);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) topLevel0;
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) nativeGenerator0, "send", objectArray0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // TypeError: Attempt to send value to newborn generator
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeBoolean0, true);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) nativeGenerator0, "send", context0.emptyArgs);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // null
         //
         verifyException("org.mozilla.javascript.NativeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(topLevel0, true);
      Object[] objectArray0 = new Object[8];
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) nativeGenerator0, "next", objectArray0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // null
         //
         verifyException("org.mozilla.javascript.NativeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeBoolean0, false);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeGenerator0, "Generator", 13, "Generator", 0, nativeBoolean0);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        nativeGenerator0.execIdCall(idFunctionObject0, context0, nativeBoolean0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"Generator\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }
}
