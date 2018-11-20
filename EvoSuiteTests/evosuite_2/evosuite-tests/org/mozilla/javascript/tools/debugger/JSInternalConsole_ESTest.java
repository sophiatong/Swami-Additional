/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 22:23:49 GMT 2018
 */

package org.mozilla.javascript.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.event.ActionEvent;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Locale;
import javax.swing.JTextPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.debugger.JSInternalConsole;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSInternalConsole_ESTest extends JSInternalConsole_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JSInternalConsole jSInternalConsole0 = new JSInternalConsole("Copy");
      PrintStream printStream0 = jSInternalConsole0.getOut();
      assertNotNull(printStream0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JSInternalConsole jSInternalConsole0 = new JSInternalConsole("_0Xl3<{m");
      InputStream inputStream0 = jSInternalConsole0.getIn();
      assertEquals(0, inputStream0.available());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JSInternalConsole jSInternalConsole0 = new JSInternalConsole("Copy");
      PrintStream printStream0 = jSInternalConsole0.getErr();
      assertNotNull(printStream0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JSInternalConsole jSInternalConsole0 = new JSInternalConsole("Paste");
      JTextPane jTextPane0 = new JTextPane();
      ActionEvent actionEvent0 = new ActionEvent(jTextPane0, 96, "Paste", 96, 96);
      jSInternalConsole0.actionPerformed(actionEvent0);
      assertFalse(jSInternalConsole0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JSInternalConsole jSInternalConsole0 = new JSInternalConsole("Cut");
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      ActionEvent actionEvent0 = new ActionEvent(locale_FilteringMode0, (-1242), "Cut");
      jSInternalConsole0.actionPerformed(actionEvent0);
      assertTrue(jSInternalConsole0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JSInternalConsole jSInternalConsole0 = new JSInternalConsole("Copy");
      ActionEvent actionEvent0 = new ActionEvent("Copy", 3747, "Copy", 3747);
      jSInternalConsole0.actionPerformed(actionEvent0);
      assertEquals(3747, actionEvent0.getID());
  }
}
