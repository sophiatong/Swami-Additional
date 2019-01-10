/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 15:08:04 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Synchronizer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Synchronizer_ESTest extends Synchronizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context context0 = Context.enter();
      Synchronizer synchronizer0 = new Synchronizer((Scriptable) null, "");
      // Undeclared exception!
      try { 
        synchronizer0.call(context0, (Scriptable) null, (Scriptable) null, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Synchronizer", e);
      }
  }
}
