/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 02:16:42 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.Scriptable;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EcmaError_ESTest extends EcmaError_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError((Scriptable) null, "GU'=Sy#$(z2Pd(!NI", 1, 1000000000, "GU'=Sy#$(z2Pd(!NI");
      String string0 = ecmaError0.getSourceName();
      assertEquals(1, ecmaError0.lineNumber());
      assertEquals("null", ecmaError0.getErrorMessage());
      assertEquals("InternalError", ecmaError0.getName());
      assertEquals("GU'=Sy#$(z2Pd(!NI", string0);
      assertEquals("GU'=Sy#$(z2Pd(!NI", ecmaError0.lineSource());
      assertEquals(1000000000, ecmaError0.columnNumber());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError((Scriptable) null, "GU'=Sy#$(z2Pd(!NI", 1, 1000000000, "GU'=Sy#$(z2Pd(!NI");
      String string0 = ecmaError0.getName();
      assertEquals("InternalError", string0);
      assertEquals("GU'=Sy#$(z2Pd(!NI", ecmaError0.sourceName());
      assertEquals("null", ecmaError0.getErrorMessage());
      assertEquals(1000000000, ecmaError0.columnNumber());
      assertEquals(1, ecmaError0.getLineNumber());
      assertEquals("GU'=Sy#$(z2Pd(!NI", ecmaError0.lineSource());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError((Scriptable) null, "GU'=Sy#$(z2Pd(!NI", 1, 1000000000, "GU'=Sy#$(z2Pd(!NI");
      String string0 = ecmaError0.getLineSource();
      assertEquals("InternalError", ecmaError0.getName());
      assertEquals("GU'=Sy#$(z2Pd(!NI", string0);
      assertEquals(1, ecmaError0.lineNumber());
      assertEquals(1000000000, ecmaError0.getColumnNumber());
      assertEquals("null", ecmaError0.getErrorMessage());
      assertEquals("GU'=Sy#$(z2Pd(!NI", ecmaError0.getSourceName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError((Scriptable) null, "GU'=Sy#$(z2Pd(!NI", 1, 1000000000, "GU'=Sy#$(z2Pd(!NI");
      int int0 = ecmaError0.getLineNumber();
      assertEquals("null", ecmaError0.getErrorMessage());
      assertEquals(1000000000, ecmaError0.columnNumber());
      assertEquals("InternalError", ecmaError0.getName());
      assertEquals("GU'=Sy#$(z2Pd(!NI", ecmaError0.sourceName());
      assertEquals(1, int0);
      assertEquals("GU'=Sy#$(z2Pd(!NI", ecmaError0.getLineSource());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError((Scriptable) null, "GU'=Sy#$(z2Pd(!NI", 1, 1000000000, "GU'=Sy#$(z2Pd(!NI");
      ecmaError0.getErrorObject();
      assertEquals("GU'=Sy#$(z2Pd(!NI", ecmaError0.lineSource());
      assertEquals(1, ecmaError0.getLineNumber());
      assertEquals("GU'=Sy#$(z2Pd(!NI", ecmaError0.getSourceName());
      assertEquals("null", ecmaError0.getErrorMessage());
      assertEquals(1000000000, ecmaError0.columnNumber());
      assertEquals("InternalError", ecmaError0.getName());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError((Scriptable) null, "GU'=Sy#$(z2Pd(!NI", 1, 1000000000, "GU'=Sy#$(z2Pd(!NI");
      String string0 = ecmaError0.getErrorMessage();
      assertEquals("null", string0);
      assertEquals("InternalError", ecmaError0.getName());
      assertEquals(1, ecmaError0.lineNumber());
      assertEquals(1000000000, ecmaError0.getColumnNumber());
      assertEquals("GU'=Sy#$(z2Pd(!NI", ecmaError0.getSourceName());
      assertEquals("GU'=Sy#$(z2Pd(!NI", ecmaError0.lineSource());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError((Scriptable) null, "GU'=Sy#$(z2Pd(!NI", 1, 1000000000, "GU'=Sy#$(z2Pd(!NI");
      int int0 = ecmaError0.getColumnNumber();
      assertEquals("InternalError", ecmaError0.getName());
      assertEquals("GU'=Sy#$(z2Pd(!NI", ecmaError0.lineSource());
      assertEquals("null", ecmaError0.getErrorMessage());
      assertEquals(1000000000, int0);
      assertEquals("GU'=Sy#$(z2Pd(!NI", ecmaError0.getSourceName());
      assertEquals(1, ecmaError0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError((Scriptable) null, "GU'=Sy#$(z2Pd(!NI", 1, 1000000000, "GU'=Sy#$(z2Pd(!NI");
      String string0 = ecmaError0.details();
      assertEquals("GU'=Sy#$(z2Pd(!NI", ecmaError0.lineSource());
      assertEquals("GU'=Sy#$(z2Pd(!NI", ecmaError0.sourceName());
      assertEquals("InternalError: null", string0);
      assertEquals(1, ecmaError0.lineNumber());
      assertEquals(1000000000, ecmaError0.getColumnNumber());
  }
}
