/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 04:14:19 GMT 2018
 */

package org.mozilla.javascript.jdk18;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.jdk18.VMBridge_jdk18;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VMBridge_jdk18_ESTest extends VMBridge_jdk18_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VMBridge_jdk18 vMBridge_jdk18_0 = new VMBridge_jdk18();
      // Undeclared exception!
      try { 
        vMBridge_jdk18_0.isDefaultMethod((Method) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.jdk18.VMBridge_jdk18", e);
      }
  }
}