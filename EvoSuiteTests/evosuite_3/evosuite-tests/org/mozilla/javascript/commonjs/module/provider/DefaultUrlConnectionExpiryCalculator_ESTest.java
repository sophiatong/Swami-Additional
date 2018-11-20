/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 22:39:01 GMT 2018
 */

package org.mozilla.javascript.commonjs.module.provider;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URLConnection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.commonjs.module.provider.DefaultUrlConnectionExpiryCalculator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultUrlConnectionExpiryCalculator_ESTest extends DefaultUrlConnectionExpiryCalculator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultUrlConnectionExpiryCalculator defaultUrlConnectionExpiryCalculator0 = null;
      try {
        defaultUrlConnectionExpiryCalculator0 = new DefaultUrlConnectionExpiryCalculator((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // relativeExpiry < 0
         //
         verifyException("org.mozilla.javascript.commonjs.module.provider.DefaultUrlConnectionExpiryCalculator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultUrlConnectionExpiryCalculator defaultUrlConnectionExpiryCalculator0 = new DefaultUrlConnectionExpiryCalculator();
      URLConnection uRLConnection0 = mock(URLConnection.class, new ViolatedAssumptionAnswer());
      long long0 = defaultUrlConnectionExpiryCalculator0.calculateExpiry(uRLConnection0);
      assertEquals(1392409341320L, long0);
  }
}
