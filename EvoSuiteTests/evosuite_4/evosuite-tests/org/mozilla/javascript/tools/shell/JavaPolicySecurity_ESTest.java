/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 19:28:35 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.GeneratedClassLoader;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.tools.shell.JavaPolicySecurity;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeUint32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaPolicySecurity_ESTest extends JavaPolicySecurity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      Context context0 = Context.enter();
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(nativeArrayBuffer0, 18, (-61));
      // Undeclared exception!
      try { 
        javaPolicySecurity0.callProcessFileSecure(context0, nativeFloat32Array0, "file:");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.SourceReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        javaPolicySecurity0.callProcessFileSecure(context0, (Scriptable) null, (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can not construct file URL for 'null':null
         //
         verifyException("org.mozilla.javascript.tools.shell.JavaPolicySecurity", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      Class<?> class0 = javaPolicySecurity0.getStaticSecurityDomainClassInternal();
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      Object object0 = javaPolicySecurity0.getDynamicSecurityDomain((Object) null);
      Object object1 = javaPolicySecurity0.getDynamicSecurityDomain(object0);
      assertNotSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      GeneratedClassLoader generatedClassLoader0 = javaPolicySecurity0.createClassLoader((ClassLoader) null, (Object) null);
      assertNotNull(generatedClassLoader0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      Context context0 = Context.enter();
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(nativeArrayBuffer0, (-2317), 13);
      // Undeclared exception!
      try { 
        javaPolicySecurity0.callWithDomain((Object) null, context0, (Callable) null, nativeUint32Array0, nativeArrayBuffer0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.shell.JavaPolicySecurity$3", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      Context context0 = Context.getCurrentContext();
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      // Undeclared exception!
      try { 
        javaPolicySecurity0.callProcessFileSecure(context0, nativeInt32Array0, "error reporter");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.SourceReader", e);
      }
  }
}