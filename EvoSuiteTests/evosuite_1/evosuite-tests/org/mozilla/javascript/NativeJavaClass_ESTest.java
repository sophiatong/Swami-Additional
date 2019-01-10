/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 00:49:06 GMT 2018
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
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.NativeCallSite;
import org.mozilla.javascript.NativeJSON;
import org.mozilla.javascript.NativeJavaClass;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeInt8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeJavaClass_ESTest extends NativeJavaClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        nativeJavaClass0.put("Jgpt5YPfNT0", (Scriptable) nativeJavaClass0, (Object) "Jgpt5YPfNT0");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      // Undeclared exception!
      try { 
        nativeJavaClass0.hasInstance(nativeJavaObject0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      boolean boolean0 = nativeJavaClass0.hasInstance((Scriptable) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        nativeJavaClass0.has("", (Scriptable) nativeJavaClass0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        nativeJavaClass0.getIds();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        nativeJavaClass0.getDefaultValue(class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Class<NativeJSON> class0 = NativeJSON.class;
      NativeJavaClass nativeJavaClass1 = (NativeJavaClass)nativeJavaClass0.getDefaultValue(class0);
      assertEquals("JavaClass", nativeJavaClass1.getClassName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      // Undeclared exception!
      try { 
        context0.initStandardObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeCallSite nativeCallSite0 = NativeCallSite.make(nativeJavaClass0, nativeJavaClass0);
      assertEquals("object", nativeCallSite0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      // Undeclared exception!
      try { 
        context0.initSafeStandardObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      // Undeclared exception!
      try { 
        NativeJavaClass.constructSpecific(context0, (Scriptable) null, (Object[]) null, (MemberBox) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Class<NativeJSON> class0 = NativeJSON.class;
      nativeJavaClass0.javaObject = (Object) class0;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) nativeJavaClass0;
      // Undeclared exception!
      try { 
        nativeJavaClass0.call((Context) null, nativeJavaClass0, nativeJavaClass0, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(nativeArrayBuffer0, 120, 150);
      // Undeclared exception!
      try { 
        context0.initStandardObjects((ScriptableObject) nativeInt8Array0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }
}
