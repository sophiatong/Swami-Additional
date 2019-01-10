/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 22:04:53 GMT 2018
 */

package org.mozilla.javascript.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.debugger.EvalWindow;
import org.mozilla.javascript.tools.debugger.SwingGui;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EvalWindow_ESTest extends EvalWindow_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EvalWindow evalWindow0 = new EvalWindow("Paste", (SwingGui) null);
      evalWindow0.setEnabled(true);
      assertTrue(evalWindow0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ActionEvent actionEvent0 = new ActionEvent("Paste", 2027, "Paste");
      EvalWindow evalWindow0 = new EvalWindow("Paste", (SwingGui) null);
      evalWindow0.actionPerformed(actionEvent0);
      assertFalse(evalWindow0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EvalWindow evalWindow0 = new EvalWindow("Paste", (SwingGui) null);
      Object object0 = new Object();
      ActionEvent actionEvent0 = new ActionEvent(object0, (-559), "Cut");
      evalWindow0.actionPerformed(actionEvent0);
      assertEquals("Cut", actionEvent0.getActionCommand());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EvalWindow evalWindow0 = new EvalWindow("Paste", (SwingGui) null);
      Object object0 = new Object();
      ActionEvent actionEvent0 = new ActionEvent(object0, (-559), "Copy");
      evalWindow0.actionPerformed(actionEvent0);
      assertFalse(evalWindow0.isFocusTraversalPolicyProvider());
  }
}
