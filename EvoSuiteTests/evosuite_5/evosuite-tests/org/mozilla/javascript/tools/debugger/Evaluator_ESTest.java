/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 20:48:40 GMT 2018
 */

package org.mozilla.javascript.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.debugger.Evaluator;
import org.mozilla.javascript.tools.debugger.SwingGui;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Evaluator_ESTest extends Evaluator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Evaluator evaluator0 = new Evaluator((SwingGui) null);
      assertTrue(evaluator0.getFocusTraversalKeysEnabled());
  }
}
