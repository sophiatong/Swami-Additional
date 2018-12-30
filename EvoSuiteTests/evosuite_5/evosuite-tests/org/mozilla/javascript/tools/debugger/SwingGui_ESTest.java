/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 19:49:49 GMT 2018
 */

package org.mozilla.javascript.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.JSplitPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.debugger.SwingGui;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SwingGui_ESTest extends SwingGui_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JSplitPane jSplitPane0 = new JSplitPane(1);
      SwingGui.setResizeWeight(jSplitPane0, 1);
      assertFalse(jSplitPane0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JSplitPane jSplitPane0 = new JSplitPane();
      SwingGui.setResizeWeight(jSplitPane0, 1214.16544);
      assertFalse(jSplitPane0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = SwingGui.getShortName("*/}\n");
      assertEquals("}\n", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = SwingGui.getShortName("{>0p`s");
      assertEquals("{>0p`s", string0);
  }
}