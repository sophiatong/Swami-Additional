/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 01:53:57 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ScriptStackElement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScriptStackElement_ESTest extends ScriptStackElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("6*c5Gmr", "6*c5Gmr", 1);
      StringBuilder stringBuilder0 = new StringBuilder(1);
      scriptStackElement0.renderV8Style(stringBuilder0);
      assertEquals("    at 6*c5Gmr (6*c5Gmr:1:0)", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("6*c5Gmr", "6*c5Gmr", 1);
      String string0 = scriptStackElement0.toString();
      assertEquals("6*c5Gmr()@6*c5Gmr:1", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("6*c5Gmr", "6*c5Gmr", 1);
      StringBuilder stringBuilder0 = new StringBuilder(1);
      scriptStackElement0.renderJavaStyle(stringBuilder0);
      assertEquals("\tat 6*c5Gmr:1 (6*c5Gmr)", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("", "undefined", 1540);
      StringBuilder stringBuilder0 = new StringBuilder(1540);
      scriptStackElement0.renderV8Style(stringBuilder0);
      assertEquals("    at :1540:0", stringBuilder0.toString());
  }
}
