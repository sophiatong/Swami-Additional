/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 19:18:15 GMT 2018
 */

package org.mozilla.javascript.regexp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.regexp.REBackTrackData;
import org.mozilla.javascript.regexp.REGlobalData;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class REGlobalData_ESTest extends REGlobalData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      REGlobalData rEGlobalData0 = new REGlobalData();
      REBackTrackData rEBackTrackData0 = new REBackTrackData(rEGlobalData0, (-563), (-563), (-563), (-563), (-563));
      rEGlobalData0.backTrackStackTop = rEBackTrackData0;
      // Undeclared exception!
      try { 
        rEGlobalData0.setParens((-563), (-563), (-563));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.regexp.REGlobalData", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      REGlobalData rEGlobalData0 = new REGlobalData();
      // Undeclared exception!
      try { 
        rEGlobalData0.setParens((-563), (-563), (-563));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.regexp.REGlobalData", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      REGlobalData rEGlobalData0 = new REGlobalData();
      // Undeclared exception!
      try { 
        rEGlobalData0.parensLength(1575);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.regexp.REGlobalData", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      REGlobalData rEGlobalData0 = new REGlobalData();
      // Undeclared exception!
      try { 
        rEGlobalData0.parensIndex(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.regexp.REGlobalData", e);
      }
  }
}
