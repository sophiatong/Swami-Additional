/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 06:23:05 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.TopLevel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TopLevel_ESTest extends TopLevel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      TopLevel.NativeErrors topLevel_NativeErrors0 = TopLevel.NativeErrors.ReferenceError;
      // Undeclared exception!
      try { 
        TopLevel.getNativeErrorCtor((Context) null, importerTopLevel0, topLevel_NativeErrors0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Constructor for \"ReferenceError\" not found.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      String string0 = topLevel0.getClassName();
      assertEquals("global", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      TopLevel.NativeErrors topLevel_NativeErrors0 = TopLevel.NativeErrors.URIError;
      IdFunctionObject idFunctionObject0 = (IdFunctionObject)TopLevel.getNativeErrorCtor(context0, importerTopLevel0, topLevel_NativeErrors0);
      assertEquals(1, idFunctionObject0.getLength());
  }
}
