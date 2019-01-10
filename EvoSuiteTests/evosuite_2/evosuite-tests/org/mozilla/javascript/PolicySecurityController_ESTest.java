/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 04:19:04 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.GeneratedClassLoader;
import org.mozilla.javascript.PolicySecurityController;
import org.mozilla.javascript.typedarrays.NativeInt32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PolicySecurityController_ESTest extends PolicySecurityController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolicySecurityController policySecurityController0 = new PolicySecurityController();
      Class<?> class0 = policySecurityController0.getStaticSecurityDomainClassInternal();
      assertEquals(1, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PolicySecurityController policySecurityController0 = new PolicySecurityController();
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      NativeInt32Array nativeInt32Array1 = (NativeInt32Array)policySecurityController0.getDynamicSecurityDomain(nativeInt32Array0);
      assertEquals(0, nativeInt32Array1.getByteLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PolicySecurityController policySecurityController0 = new PolicySecurityController();
      Context context0 = Context.enter();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      GeneratedClassLoader generatedClassLoader0 = policySecurityController0.createClassLoader(classLoader0, (Object) null);
      assertNotNull(generatedClassLoader0);
  }
}
