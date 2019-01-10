/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 04:44:44 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.ClassCache;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.JavaAdapter;
import org.mozilla.javascript.JavaMembers;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.typedarrays.NativeUint32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ClassCache_ESTest extends ClassCache_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      classCache0.setInvokerOptimizationEnabled(true);
      assertTrue(classCache0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      int int0 = classCache0.newClassSerialNumber();
      assertTrue(classCache0.isCachingEnabled());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      boolean boolean0 = classCache0.isInvokerOptimizationEnabled();
      assertTrue(classCache0.isCachingEnabled());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      boolean boolean0 = classCache0.isCachingEnabled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      Map<JavaAdapter.JavaAdapterSignature, Class<?>> map0 = classCache0.getInterfaceAdapterCacheMap();
      assertTrue(classCache0.isCachingEnabled());
      assertNotNull(map0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      Class<JavaMembers> class0 = JavaMembers.class;
      classCache0.cacheInterfaceAdapter(class0, classCache0);
      Class<Integer> class1 = Integer.class;
      classCache0.getInterfaceAdapter(class1);
      assertTrue(classCache0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      Map<Class<?>, JavaMembers> map0 = classCache0.getClassCacheMap();
      assertTrue(classCache0.isCachingEnabled());
      assertNotNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      classCache0.getAssociatedScope();
      assertTrue(classCache0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array();
      boolean boolean0 = classCache0.associate(nativeUint32Array0);
      assertTrue(boolean0);
      
      ClassCache classCache1 = ClassCache.get(nativeUint32Array0);
      assertTrue(classCache1.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array();
      // Undeclared exception!
      try { 
        ClassCache.get(nativeUint32Array0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("org.mozilla.javascript.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      assertTrue(classCache0.isCachingEnabled());
      
      classCache0.setCachingEnabled(false);
      classCache0.setCachingEnabled(false);
      assertFalse(classCache0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      TopLevel.NativeErrors topLevel_NativeErrors0 = TopLevel.NativeErrors.JavaException;
      BaseFunction baseFunction0 = importerTopLevel0.getNativeErrorCtor(topLevel_NativeErrors0);
      // Undeclared exception!
      try { 
        classCache0.associate(baseFunction0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ClassCache", e);
      }
  }
}
