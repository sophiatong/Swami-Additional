/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 19:33:54 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.nio.charset.Charset;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.tools.shell.ShellConsole;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ShellConsole_ESTest extends ShellConsole_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      MockFile mockFile0 = new MockFile("hypot");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) pipedInputStream0, (PrintStream) mockPrintStream0, charset0);
      try { 
        shellConsole0.readLine("jline.ConsoleReader");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      MockFile mockFile0 = new MockFile("hypot");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) pipedInputStream0, (PrintStream) mockPrintStream0, charset0);
      try { 
        shellConsole0.readLine();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      MockFile mockFile0 = new MockFile("hypot");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) pipedInputStream0, (PrintStream) mockPrintStream0, charset0);
      shellConsole0.println("x$Dq(|^!9\"Vze7W{J-?");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("(Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) byteArrayInputStream0, (PrintStream) mockPrintStream0, charset0);
      shellConsole0.println();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      MockFile mockFile0 = new MockFile("jfIKr@\"b?I&cqko");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) sequenceInputStream0, (PrintStream) mockPrintStream0, charset0);
      shellConsole0.print("printNewline");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, true);
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) pipedInputStream0, (PrintStream) mockPrintStream0, charset0);
      InputStream inputStream0 = shellConsole0.getIn();
      assertSame(inputStream0, pipedInputStream0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("(Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) byteArrayInputStream0, (PrintStream) mockPrintStream0, charset0);
      shellConsole0.flush();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((Scriptable) null, charset0);
      assertNull(shellConsole0);
  }
}
