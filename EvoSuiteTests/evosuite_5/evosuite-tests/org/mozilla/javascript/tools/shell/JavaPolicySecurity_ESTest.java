/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 19:17:42 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.ProtectionDomain;
import java.security.UnresolvedPermission;
import java.security.cert.Certificate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.SecurityController;
import org.mozilla.javascript.tools.shell.JavaPolicySecurity;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeUint16Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class JavaPolicySecurity_ESTest extends JavaPolicySecurity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      SecurityController.initGlobal(javaPolicySecurity0);
      Context.getCurrentContext();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      ProtectionDomain protectionDomain0 = new ProtectionDomain((CodeSource) null, (PermissionCollection) null);
      Object object0 = javaPolicySecurity0.getDynamicSecurityDomain(protectionDomain0);
      Class<NativeFloat64Array> class0 = NativeFloat64Array.class;
      try { 
        Context.jsToJava(object0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot convert ProtectionDomain  null
         //  null
         //  <no principals>
         //  org.mozilla.javascript.tools.shell.JavaPolicySecurity$ContextPermissions@2 (context=java.security.AccessControlContext@11b700df, static_permitions=null)
         //  to org.mozilla.javascript.typedarrays.NativeFloat64Array
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      ProtectionDomain protectionDomain0 = (ProtectionDomain)javaPolicySecurity0.getDynamicSecurityDomain((Object) null);
      Certificate[] certificateArray0 = new Certificate[15];
      UnresolvedPermission unresolvedPermission0 = new UnresolvedPermission("org.mozilla.javascript.tools.shell.JavaPolicySecurity$ContextPermissions", "org.mozilla.javascript.tools.shell.JavaPolicySecurity$ContextPermissions", "org.mozilla.javascript.tools.shell.JavaPolicySecurity$ContextPermissions", certificateArray0);
      boolean boolean0 = protectionDomain0.implies(unresolvedPermission0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      Context context0 = Context.getCurrentContext();
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        javaPolicySecurity0.callProcessFileSecure(context0, delegator0, "http://www.w3.org/2000/xmlns/");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Could not find: www.w3.org
         //
         verifyException("org.mozilla.javascript.tools.shell.JavaPolicySecurity$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      Context context0 = Context.getCurrentContext();
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      // Undeclared exception!
      try { 
        javaPolicySecurity0.callProcessFileSecure(context0, nativeInt16Array0, (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can not construct file URL for 'null':null
         //
         verifyException("org.mozilla.javascript.tools.shell.JavaPolicySecurity", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      SecurityController.initGlobal(javaPolicySecurity0);
      // Undeclared exception!
      try { 
        SecurityController.getStaticSecurityDomainClass();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      Object object0 = javaPolicySecurity0.getDynamicSecurityDomain((Object) null);
      ProtectionDomain protectionDomain0 = (ProtectionDomain)javaPolicySecurity0.getDynamicSecurityDomain(object0);
      assertNotNull(protectionDomain0);
      
      Certificate[] certificateArray0 = new Certificate[15];
      UnresolvedPermission unresolvedPermission0 = new UnresolvedPermission("org.mozilla.javascript.tools.shell.JavaPolicySecurity$ContextPermissions", "org.mozilla.javascript.tools.shell.JavaPolicySecurity$ContextPermissions", "org.mozilla.javascript.tools.shell.JavaPolicySecurity$ContextPermissions", certificateArray0);
      boolean boolean0 = protectionDomain0.implies(unresolvedPermission0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      Context context0 = Context.getCurrentContext();
      BaseFunction baseFunction0 = new BaseFunction();
      Object object0 = javaPolicySecurity0.callWithDomain((Object) null, context0, baseFunction0, baseFunction0, baseFunction0, context0.emptyArgs);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      Context context0 = Context.getCurrentContext();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      // Undeclared exception!
      try { 
        javaPolicySecurity0.callProcessFileSecure(context0, nativeUint16Array0, "error reporter");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.SourceReader", e);
      }
  }
}
