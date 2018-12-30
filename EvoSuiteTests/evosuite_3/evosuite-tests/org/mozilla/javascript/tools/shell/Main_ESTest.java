/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 19:16:22 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.tools.shell.Main;
import org.mozilla.javascript.tools.shell.ShellContextFactory;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Main_ESTest extends Main_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Main.ScriptCache main_ScriptCache0 = new Main.ScriptCache(0);
      assertEquals(0, main_ScriptCache0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Main.setOut((PrintStream) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Main.setIn((InputStream) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      SystemInUtil.addInputLine("msg.shell.invalid");
      // Undeclared exception!
      try { 
        Main.processSource(context0, (String) null);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // uncaught JavaScript runtime exception: ReferenceError: \"msg\" is not defined.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SystemInUtil.addInputLine("Xv?7?s");
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // missing : in conditional expression (<stdin>#2)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "--e";
      String[] stringArray1 = Main.processOptions(stringArray0);
      assertNull(stringArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-f";
      stringArray0[1] = "--e";
      String[] stringArray1 = Main.processOptions(stringArray0);
      assertEquals(0, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-f";
      stringArray0[1] = "-";
      String[] stringArray1 = Main.processOptions(stringArray0);
      assertEquals(0, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-w";
      // Undeclared exception!
      try { 
        Main.exec(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-modules";
      stringArray0[2] = "-modules";
      String[] stringArray1 = Main.processOptions(stringArray0);
      assertNull(stringArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-e";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-e";
      // Undeclared exception!
      try { 
        Main.processOptions(stringArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-fatal-warnings";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-strict";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-encoding";
      stringArray0[2] = "-encoding";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-O";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[14];
      stringArray0[0] = "-sealedlib";
      stringArray0[1] = "-opt";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-version";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-version";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      Context context0 = shellContextFactory0.enterContext();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(nativeArrayBuffer0, 8, 5);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeFloat64Array0, context0, 0, "X-TI,A=r iqs$&'^a", 0, nativeFloat64Array0);
      // Undeclared exception!
      try { 
        Main.processFileNoThrow(context0, idFunctionObjectES6_0, "language version");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Couldn't read source file \"language version\": null.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-sandbox";
      stringArray0[1] = "-sandbox";
      stringArray0[2] = "2BzLfg";
      Main.main(stringArray0);
      Context context0 = Context.enter();
      try { 
        Main.processSource(context0, "");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-require";
      stringArray0[1] = "-require";
      Main.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrintStream printStream0 = Main.getOut();
      assertNotNull(printStream0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      InputStream inputStream0 = Main.getIn();
      assertNotNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PrintStream printStream0 = Main.getErr();
      Main.setErr(printStream0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-debug";
      stringArray0[1] = "-?";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "createObject";
      // Undeclared exception!
      try { 
        Main.exec(stringArray0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Couldn't read source file \"createObject\": null.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      Context context0 = shellContextFactory0.enterContext();
      // Undeclared exception!
      try { 
        Main.evalInlineScript(context0, "dkSU|DW6Y");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // uncaught JavaScript runtime exception: ReferenceError: \"dkSU\" is not defined.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Main main0 = new Main();
  }
}