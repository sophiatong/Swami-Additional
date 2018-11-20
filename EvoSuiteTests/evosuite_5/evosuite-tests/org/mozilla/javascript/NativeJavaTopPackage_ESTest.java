/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 04:03:56 GMT 2018
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
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.NativeJavaPackage;
import org.mozilla.javascript.NativeJavaTopPackage;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeJavaTopPackage_ESTest extends NativeJavaTopPackage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        NativeJavaTopPackage.init(context0, nativeIterator_StopIteration0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(13);
      Object[] objectArray0 = new Object[17];
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeArrayBuffer0, classLoader0, 0, "ArrayBuffer", 0, nativeJavaTopPackage0);
      // Undeclared exception!
      try { 
        nativeJavaTopPackage0.execIdCall(idFunctionObjectES6_0, (Context) null, nativeJavaTopPackage0, nativeJavaTopPackage0, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=0 MASTER=org.mozilla.javascript.typedarrays.NativeArrayBuffer@6
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(13);
      Object[] objectArray0 = new Object[17];
      objectArray0[0] = (Object) classLoader0;
      NativeJavaPackage nativeJavaPackage0 = (NativeJavaPackage)nativeJavaTopPackage0.construct((Context) null, nativeArrayBuffer0, objectArray0);
      assertTrue(nativeJavaPackage0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Context.getCurrentContext();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      // Undeclared exception!
      try { 
        nativeJavaTopPackage0.call(context0, (Scriptable) null, (Scriptable) null, context0.emptyArgs);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Constructor for \"Packages\" expects argument of type java.lang.Classloader
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }
}
