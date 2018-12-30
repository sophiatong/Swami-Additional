/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 07:17:29 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FilenameFilter;
import java.io.PrintStream;
import java.io.PrintWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.DefaultErrorReporter;
import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.ScriptStackElement;
import org.mozilla.javascript.StackStyle;
import org.mozilla.javascript.WrappedException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RhinoException_ESTest extends RhinoException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = RhinoException.usesMozillaStackStyle();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RhinoException.useMozillaStackStyle(true);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      EvaluatorException evaluatorException0 = defaultErrorReporter0.runtimeError("prefix", "sup", 0, (String) null, 0);
      String string0 = evaluatorException0.sourceName();
      assertEquals(0, evaluatorException0.getColumnNumber());
      assertEquals(0, evaluatorException0.lineNumber());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvaluatorException evaluatorException0 = new EvaluatorException("_");
      // Undeclared exception!
      try { 
        evaluatorException0.recordErrorOrigin("_", (-1), "_", (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1
         //
         verifyException("org.mozilla.javascript.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvaluatorException evaluatorException0 = new EvaluatorException("", "", 35);
      MockFile mockFile0 = new MockFile("6N<O", "LETEXPR");
      evaluatorException0.interpreterStackInfo = (Object) "M-5n*x{^gI{'%M#";
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      // Undeclared exception!
      try { 
        evaluatorException0.printStackTrace((PrintWriter) mockPrintWriter0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to [Lorg.mozilla.javascript.Interpreter$CallFrame;
         //
         verifyException("org.mozilla.javascript.Interpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvaluatorException evaluatorException0 = new EvaluatorException("", "", 35);
      MockFile mockFile0 = new MockFile("6N<O", "LETEXPR");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      evaluatorException0.printStackTrace((PrintWriter) mockPrintWriter0);
      assertEquals(35, evaluatorException0.getLineNumber());
      assertEquals(0, evaluatorException0.getColumnNumber());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvaluatorException evaluatorException0 = new EvaluatorException("", "", 35);
      MockFile mockFile0 = new MockFile("6N<O", "LETEXPR");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      evaluatorException0.printStackTrace((PrintStream) mockPrintStream0);
      assertEquals(35, evaluatorException0.getLineNumber());
      assertEquals(0, evaluatorException0.columnNumber());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvaluatorException evaluatorException0 = new EvaluatorException("TZqr z{#%.uoU&p", "TZqr z{#%.uoU&p", 1, "", 0);
      String string0 = evaluatorException0.lineSource();
      assertEquals("", string0);
      assertEquals(1, evaluatorException0.getLineNumber());
      assertEquals(0, evaluatorException0.getColumnNumber());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvaluatorException evaluatorException0 = new EvaluatorException("", "", 35);
      int int0 = evaluatorException0.lineNumber();
      assertEquals(0, evaluatorException0.getColumnNumber());
      assertEquals(35, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StackStyle stackStyle0 = RhinoException.getStackStyle();
      assertEquals(StackStyle.RHINO, stackStyle0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvaluatorException evaluatorException0 = new EvaluatorException("", "", 35);
      FilenameFilter filenameFilter0 = mock(FilenameFilter.class, new ViolatedAssumptionAnswer());
      String string0 = evaluatorException0.getScriptStackTrace(filenameFilter0);
      assertEquals("", string0);
      assertEquals(35, evaluatorException0.getLineNumber());
      assertEquals(0, evaluatorException0.getColumnNumber());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Context.reportRuntimeError("{[FfT1r/");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // {[FfT1r/
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError("l>:`My=T7f;aW", "l>:`My=T7f;aW", "java.lang.Object@0000000003", 984, "l>:`My=T7f;aW", 984);
      StackTraceElement[] stackTraceElementArray0 = new StackTraceElement[6];
      StackTraceElement stackTraceElement0 = new StackTraceElement("java.lang.Object@0000000003", "_c_sc$ip3t_0", "java.lang.Object@0000000003", 984);
      stackTraceElementArray0[0] = stackTraceElement0;
      stackTraceElementArray0[1] = stackTraceElement0;
      stackTraceElementArray0[2] = stackTraceElement0;
      stackTraceElementArray0[3] = stackTraceElement0;
      stackTraceElementArray0[4] = stackTraceElement0;
      stackTraceElementArray0[5] = stackTraceElement0;
      ecmaError0.setStackTrace(stackTraceElementArray0);
      ScriptStackElement[] scriptStackElementArray0 = ecmaError0.getScriptStack(984, "sc$ip3t");
      assertEquals(984, ecmaError0.lineNumber());
      assertEquals(984, ecmaError0.getColumnNumber());
      assertEquals(5, scriptStackElementArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      JavaScriptException javaScriptException0 = new JavaScriptException(object0, "", 1127);
      javaScriptException0.interpreterStackInfo = (Object) "";
      Integer integer0 = new Integer(1127);
      // Undeclared exception!
      try { 
        javaScriptException0.getScriptStack((int) integer0, "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to [Lorg.mozilla.javascript.Interpreter$CallFrame;
         //
         verifyException("org.mozilla.javascript.Interpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvaluatorException evaluatorException0 = new EvaluatorException("feJ8Kt21IFy?");
      WrappedException wrappedException0 = new WrappedException(evaluatorException0);
      ScriptStackElement[] scriptStackElementArray0 = wrappedException0.getScriptStack();
      assertEquals(0, scriptStackElementArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      JavaScriptException javaScriptException0 = new JavaScriptException(object0, "", 1127);
      javaScriptException0.getMessage();
      assertEquals(1127, javaScriptException0.lineNumber());
      assertEquals(0, javaScriptException0.columnNumber());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Context.reportRuntimeError("feJ8Kt21IFy?");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // feJ8Kt21IFy?
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StackStyle stackStyle0 = StackStyle.V8;
      RhinoException.setStackStyle(stackStyle0);
      ScriptStackElement[] scriptStackElementArray0 = new ScriptStackElement[1];
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("feJ8Kt21IFy?", "$i{/`s", (-57));
      scriptStackElementArray0[0] = scriptStackElement0;
      String string0 = RhinoException.formatStackTrace(scriptStackElementArray0, "feJ8Kt21IFy?");
      assertEquals("feJ8Kt21IFy?\n    at $i{/`s (feJ8Kt21IFy?:0:0)\n", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StackStyle stackStyle0 = StackStyle.MOZILLA;
      RhinoException.setStackStyle(stackStyle0);
      ScriptStackElement[] scriptStackElementArray0 = new ScriptStackElement[1];
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("feJ8Kt21IFy?", "feJ8Kt21IFy?", (-57));
      scriptStackElementArray0[0] = scriptStackElement0;
      String string0 = RhinoException.formatStackTrace(scriptStackElementArray0, "feJ8Kt21IFy?");
      assertEquals("feJ8Kt21IFy?()@feJ8Kt21IFy?\n", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ScriptStackElement[] scriptStackElementArray0 = new ScriptStackElement[1];
      // Undeclared exception!
      try { 
        RhinoException.formatStackTrace(scriptStackElementArray0, "feJ8Kt21IFy?");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvaluatorException evaluatorException0 = new EvaluatorException("Gp~(z{}dgH", "msg.overlarge.backref", 35, "h`gJ89(B)(;Y", 35);
      int int0 = evaluatorException0.columnNumber();
      assertEquals(35, evaluatorException0.getLineNumber());
      assertEquals("msg.overlarge.backref", evaluatorException0.sourceName());
      assertEquals(35, int0);
      assertEquals("h`gJ89(B)(;Y", evaluatorException0.getLineSource());
  }
}