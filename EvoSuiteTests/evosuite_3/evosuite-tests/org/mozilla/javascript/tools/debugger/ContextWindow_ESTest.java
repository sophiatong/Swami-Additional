/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 20:10:14 GMT 2018
 */

package org.mozilla.javascript.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.debugger.ContextWindow;
import org.mozilla.javascript.tools.debugger.SwingGui;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ContextWindow_ESTest extends ContextWindow_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContextWindow contextWindow0 = new ContextWindow((SwingGui) null);
      contextWindow0.disableUpdate();
      assertTrue(contextWindow0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContextWindow contextWindow0 = new ContextWindow((SwingGui) null);
      contextWindow0.enableUpdate();
      ActionEvent actionEvent0 = new ActionEvent("ContextSwitch", (-875), "ContextSwitch");
      // Undeclared exception!
      try { 
        contextWindow0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.ContextWindow", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ContextWindow contextWindow0 = new ContextWindow((SwingGui) null);
      ActionEvent actionEvent0 = new ActionEvent(contextWindow0, 1431655764, "Cz.t$xt:");
      contextWindow0.enableUpdate();
      contextWindow0.actionPerformed(actionEvent0);
      assertEquals("Cz.t$xt:", actionEvent0.getActionCommand());
  }
}
