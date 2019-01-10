/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 20:00:43 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.IllegalCharsetNameException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.tools.shell.Global;
import org.mozilla.javascript.tools.shell.Main;
import org.mozilla.javascript.tools.shell.ShellContextFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Main_ESTest extends Main_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      Context context0 = shellContextFactory0.enterContext();
      Script script0 = context0.compileString("cD", "cD", (-755), (Object) null);
      Main.ScriptCache main_ScriptCache0 = new Main.ScriptCache(13);
      byte[] byteArray1 = new byte[8];
      main_ScriptCache0.put("language version", byteArray1, script0);
      assertFalse(main_ScriptCache0.isEmpty());
      
      main_ScriptCache0.get("language version", byteArray0);
      assertTrue(main_ScriptCache0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(13);
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
      Main.setOut(mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      Main.setIn(dataInputStream0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Global global0 = new Global();
      PrintStream printStream0 = global0.getErr();
      Main.setErr(printStream0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-require";
      stringArray0[1] = "Exceeded maximum stack depth";
      Main.processOptions(stringArray0);
      ShellContextFactory shellContextFactory0 = Main.shellContextFactory;
      Context context0 = shellContextFactory0.enterContext();
      // Undeclared exception!
      try { 
        Main.processFiles(context0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.shell.Main", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SystemInUtil.addInputLine("-");
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected end of file (<stdin>#2)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Main.main(stringArray0);
      ShellContextFactory shellContextFactory0 = Main.shellContextFactory;
      shellContextFactory0.setCharacterEncoding("org.mozilla.javascript.tools.shell.Main$ScriptReference");
      Context context0 = shellContextFactory0.enterContext();
      // Undeclared exception!
      try { 
        Main.processFiles(context0, stringArray0);
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // org.mozilla.javascript.tools.shell.Main$ScriptReference
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-3Y|%h1;z";
      String[] stringArray1 = Main.processOptions(stringArray0);
      assertNull(stringArray1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-help";
      int int0 = Main.exec(stringArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-f";
      stringArray0[1] = "";
      stringArray0[2] = "-debug";
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
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-sealedlib";
      // Undeclared exception!
      try { 
        Main.processOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-w";
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
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-modules";
      stringArray0[2] = "-modules";
      stringArray0[4] = "-modules";
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
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-sandbox";
      Main.main(stringArray0);
      // Undeclared exception!
      Main.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-fatal-warnings";
      // Undeclared exception!
      try { 
        Main.processOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[2];
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
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-encoding";
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
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-encoding";
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
      stringArray0[0] = "-O";
      String[] stringArray1 = Main.processOptions(stringArray0);
      assertNull(stringArray1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[3];
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
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[16];
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
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Main.main(stringArray0);
      Context context0 = Context.enter();
      SystemInUtil.addInputLine("language version");
      // Undeclared exception!
      try { 
        Main.processFiles(context0, stringArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // missing ; before statement (<stdin>#2)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("error reporter");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "#Z}/sZ|H[0FDg%4rE");
      ContextFactory.initGlobal(shellContextFactory0);
      Context context0 = shellContextFactory0.enterContext();
      Main.processSource(context0, "error reporter");
      assertEquals(100, Context.VERSION_1_0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("org.mozilla.javascript.ast.XmlPropRef");
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)35;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      Scriptable scriptable0 = Main.getScope("~P0N*7YgF\"EjjZd7x4");
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      Context context0 = shellContextFactory0.enterContext();
      // Undeclared exception!
      try { 
        Main.processFileNoThrow(context0, scriptable0, "org.mozilla.javascript.ast.XmlPropRef");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal character: # (org.mozilla.javascript.ast.XmlPropRef#1)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Scriptable scriptable0 = Main.getScope("~P0N*7YgF\"EjjZd7x4");
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      Context context0 = shellContextFactory0.enterContext();
      // Undeclared exception!
      try { 
        Main.processFileNoThrow(context0, scriptable0, "org.mozilla.javascript.ast.XmlPropRef");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Couldn't read source file \"org.mozilla.javascript.ast.XmlPropRef\": null.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PrintStream printStream0 = Main.getOut();
      assertNotNull(printStream0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      InputStream inputStream0 = Main.getIn();
      assertNotNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PrintStream printStream0 = Main.getErr();
      assertNotNull(printStream0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("cD.class");
      byte[] byteArray0 = new byte[3];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-f";
      stringArray0[1] = "cD.class";
      stringArray0[2] = "-f";
      stringArray0[3] = "msg.invalid.iterator";
      stringArray0[4] = "";
      // Undeclared exception!
      try { 
        Main.exec(stringArray0);
        fail("Expecting exception: ClassFormatError");
      
      } catch(ClassFormatError e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-modules";
      stringArray0[1] = "-modules";
      stringArray0[2] = "-modules";
      stringArray0[3] = "-help";
      stringArray0[4] = "-modules";
      stringArray0[5] = "-strict";
      Main.main(stringArray0);
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      Context context0 = shellContextFactory0.enterContext((Context) null);
      try { 
        Main.processSource(context0, "?'AY3");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-f";
      stringArray0[1] = "cD.class";
      stringArray0[2] = "-f";
      stringArray0[3] = "msg.invalid.iterator";
      stringArray0[4] = "";
      // Undeclared exception!
      try { 
        Main.exec(stringArray0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Couldn't read source file \"cD.class\": null.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-f";
      stringArray0[1] = "cD.class";
      stringArray0[2] = "-f";
      stringArray0[3] = "msg.invalid.iterator";
      stringArray0[4] = "-f";
      stringArray0[5] = "3R+}-j%BS/+ybL\"s\"";
      stringArray0[6] = "-f";
      int int0 = Main.exec(stringArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-e";
      stringArray0[1] = "";
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
  public void test34()  throws Throwable  {
      ShellContextFactory shellContextFactory0 = Main.shellContextFactory;
      Context context0 = shellContextFactory0.enterContext();
      // Undeclared exception!
      try { 
        Main.evalInlineScript(context0, "D");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // uncaught JavaScript runtime exception: ReferenceError: \"D\" is not defined.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Main main0 = new Main();
  }
}
