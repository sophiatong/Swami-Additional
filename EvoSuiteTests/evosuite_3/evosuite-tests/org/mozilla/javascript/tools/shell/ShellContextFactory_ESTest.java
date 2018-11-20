/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 18:53:34 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.tools.ToolErrorReporter;
import org.mozilla.javascript.tools.shell.ShellContextFactory;
import org.mozilla.javascript.typedarrays.NativeInt16Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShellContextFactory_ESTest extends ShellContextFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      shellContextFactory0.setWarningAsError(false);
      assertFalse(shellContextFactory0.hasExplicitGlobal());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      shellContextFactory0.setStrictMode(false);
      assertNull(shellContextFactory0.getCharacterEncoding());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      shellContextFactory0.setOptimizationLevel(0);
      assertFalse(shellContextFactory0.hasExplicitGlobal());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      shellContextFactory0.setLanguageVersion(0);
      assertFalse(shellContextFactory0.hasExplicitGlobal());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      shellContextFactory0.setErrorReporter(toolErrorReporter0);
      assertNull(shellContextFactory0.getCharacterEncoding());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      shellContextFactory0.setCharacterEncoding("");
      assertFalse(shellContextFactory0.isSealed());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      shellContextFactory0.setAllowReservedKeywords(true);
      assertNull(shellContextFactory0.getCharacterEncoding());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(9);
      // Undeclared exception!
      try { 
        context0.evaluateString(nativeInt16Array0, "error reporter", "language version", 4, (Object) null);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // missing ; before statement (language version#4)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      Context context0 = shellContextFactory0.enterContext();
      boolean boolean0 = shellContextFactory0.hasFeature(context0, 10);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      String string0 = shellContextFactory0.getCharacterEncoding();
      assertNull(string0);
  }
}
