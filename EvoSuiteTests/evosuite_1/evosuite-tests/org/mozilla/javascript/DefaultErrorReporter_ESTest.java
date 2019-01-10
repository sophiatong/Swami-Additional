/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 05:45:04 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.DefaultErrorReporter;
import org.mozilla.javascript.ErrorReporter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DefaultErrorReporter_ESTest extends DefaultErrorReporter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      ErrorReporter errorReporter0 = DefaultErrorReporter.forEval(defaultErrorReporter0);
      // Undeclared exception!
      try { 
        errorReporter0.warning("aMK+2je", "aMK+2je", 737, "aMK+2je", 737);
       //  fail("Expecting exception: StackOverflowError");
       // Unstable assertion
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      ErrorReporter errorReporter0 = DefaultErrorReporter.forEval(defaultErrorReporter0);
      // Undeclared exception!
      try { 
        errorReporter0.runtimeError("aMK+2je", "aMK+2je", 737, "aMK+2je", 737);
       //  fail("Expecting exception: StackOverflowError");
       // Unstable assertion
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      // Undeclared exception!
      try { 
        defaultErrorReporter0.error("TypeError: TypeError(klFr", "TypeError: TypeError(klFr", (-1465), "TypeError: TypeError(klFr", (-1465));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1465
         //
         verifyException("org.mozilla.javascript.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      ErrorReporter errorReporter0 = DefaultErrorReporter.forEval(defaultErrorReporter0);
      // Undeclared exception!
      try { 
        errorReporter0.error("TypeError: TypeError(klFr", "TypeError: TypeError(klFr", (-1465), "TypeError: TypeError(klFr", (-1465));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1465
         //
         verifyException("org.mozilla.javascript.RhinoException", e);
      }
  }
}
