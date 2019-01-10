/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 23:55:35 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.NativeJavaPackage;
import org.mozilla.javascript.NativeJavaTopPackage;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeInt8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeJavaPackage_ESTest extends NativeJavaPackage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      BaseFunction baseFunction0 = new BaseFunction();
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      // Undeclared exception!
      try { 
        baseFunction0.addIdFunctionProperty(nativeJavaTopPackage0, nativeInt8Array0, 0, "org.mozilla.javascit.regexp.RECompiled", 8);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("M_H*U<xD!$`Vd;k]|", classLoader0);
      // Undeclared exception!
      try { 
        nativeJavaPackage0.put((-1356), (Scriptable) null, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Java package names may not be numbers.
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = null;
      try {
        nativeJavaPackage0 = new NativeJavaPackage("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaPackage", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      ScriptableObject.putConstProperty(nativeJavaTopPackage0, "", "");
      assertTrue(nativeJavaTopPackage0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("[JavaPackage ]", (ClassLoader) null);
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(0);
      // Undeclared exception!
      try { 
        nativeJavaPackage0.getPkgProperty("[JavaPackage ]", nativeInt16Array0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      BaseFunction baseFunction0 = new BaseFunction();
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      // Undeclared exception!
      try { 
        nativeJavaTopPackage0.getPkgProperty("lrg.mozilla.javaucrxp.tools.shelm.Hobal", nativeInt8Array0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeJavaTopPackage0, nativeJavaTopPackage0);
      // Undeclared exception!
      try { 
        nativeJavaTopPackage0.get("", (Scriptable) nativeArrayIterator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      BaseFunction baseFunction0 = new BaseFunction();
      NativeJavaPackage nativeJavaPackage0 = nativeJavaTopPackage0.forcePackage("]s`7mi(5]SDq", baseFunction0);
      assertEquals("JavaPackage", nativeJavaPackage0.getClassName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      boolean boolean0 = nativeJavaTopPackage0.equals(classLoader0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = null;
      try {
        nativeJavaPackage0 = new NativeJavaPackage("B^H4ncUy\"BSfG3NN");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaPackage", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("[JavaPackage ]", (ClassLoader) null);
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(0);
      NativeJavaPackage nativeJavaPackage1 = nativeJavaPackage0.forcePackage("[JavaPackage ]", nativeInt16Array0);
      // Undeclared exception!
      try { 
        nativeJavaPackage1.getPkgProperty("[JavaPackage ]", nativeInt16Array0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }
}
