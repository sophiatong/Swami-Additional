/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 03:29:42 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.PolicySecurityController;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PolicySecurityController_ESTest extends PolicySecurityController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolicySecurityController policySecurityController0 = new PolicySecurityController();
      Class<?> class0 = policySecurityController0.getStaticSecurityDomainClassInternal();
      Class class1 = (Class)policySecurityController0.getDynamicSecurityDomain(class0);
      assertFalse(class1.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PolicySecurityController policySecurityController0 = new PolicySecurityController();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      // Undeclared exception!
      try { 
        policySecurityController0.createClassLoader(classLoader0, classLoader0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // sun.misc.Launcher$AppClassLoader cannot be cast to java.security.CodeSource
         //
         verifyException("org.mozilla.javascript.PolicySecurityController$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PolicySecurityController policySecurityController0 = new PolicySecurityController();
      Delegator delegator0 = new Delegator();
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        policySecurityController0.callWithDomain((Object) null, context0, delegator0, delegator0, delegator0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.PolicySecurityController$2", e);
      }
  }
}
