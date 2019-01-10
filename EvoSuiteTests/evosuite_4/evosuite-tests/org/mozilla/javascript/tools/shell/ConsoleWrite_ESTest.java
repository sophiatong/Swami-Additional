/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 19:23:21 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.shell.ConsoleTextArea;
import org.mozilla.javascript.tools.shell.ConsoleWrite;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ConsoleWrite_ESTest extends ConsoleWrite_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[5];
      ConsoleTextArea consoleTextArea0 = new ConsoleTextArea(stringArray0);
      ConsoleWrite consoleWrite0 = new ConsoleWrite(consoleTextArea0, "");
      consoleWrite0.run();
  }
}
