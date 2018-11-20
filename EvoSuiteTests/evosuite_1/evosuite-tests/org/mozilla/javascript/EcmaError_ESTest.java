/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 05:00:23 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.EcmaError;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EcmaError_ESTest extends EcmaError_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError("", "", "", 0, "CGDz?c^_-r", 0);
      String string0 = ecmaError0.getSourceName();
      assertEquals("CGDz?c^_-r", ecmaError0.getLineSource());
      assertEquals(0, ecmaError0.columnNumber());
      assertEquals("", ecmaError0.getName());
      assertEquals("", string0);
      assertEquals(0, ecmaError0.getLineNumber());
      assertEquals("", ecmaError0.getErrorMessage());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError("ZUYIaC'|`'&ERe", "ZUYIaC'|`'&ERe", "ZUYIaC'|`'&ERe", 2913, "ZUYIaC'|`'&ERe", 2913);
      ecmaError0.getLineSource();
      assertEquals(2913, ecmaError0.lineNumber());
      assertEquals(2913, ecmaError0.columnNumber());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError("ZUYIaC'|`'&ERe", "ZUYIaC'|`'&ERe", "ZUYIaC'|`'&ERe", 2913, "ZUYIaC'|`'&ERe", 2913);
      int int0 = ecmaError0.getLineNumber();
      assertEquals(2913, ecmaError0.columnNumber());
      assertEquals(2913, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError("_^c+ZOm ;", "_^c+ZOm ;", "_^c+ZOm ;", 300, "i^bz", 300);
      String string0 = ecmaError0.getErrorMessage();
      assertEquals("_^c+ZOm ;", string0);
      assertEquals("_^c+ZOm ;", ecmaError0.getSourceName());
      assertEquals("_^c+ZOm ;", ecmaError0.getName());
      assertEquals("i^bz", ecmaError0.getLineSource());
      assertEquals(300, ecmaError0.columnNumber());
      assertEquals(300, ecmaError0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError("ZUYIaC'|`'&ERe", "ZUYIaC'|`'&ERe", "ZUYIaC'|`'&ERe", 2913, "ZUYIaC'|`'&ERe", 2913);
      int int0 = ecmaError0.getColumnNumber();
      assertEquals(2913, int0);
      assertEquals(2913, ecmaError0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError("dI", "dI", "dI", 126, "", 0);
      String string0 = ecmaError0.details();
      assertEquals("dI: dI", string0);
      assertEquals(126, ecmaError0.lineNumber());
      assertEquals(0, ecmaError0.columnNumber());
      assertEquals("dI", ecmaError0.sourceName());
      assertEquals("", ecmaError0.lineSource());
  }
}
