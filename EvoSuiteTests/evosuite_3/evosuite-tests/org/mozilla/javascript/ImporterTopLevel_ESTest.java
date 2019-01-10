/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 01:35:16 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ImporterTopLevel_ESTest extends ImporterTopLevel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      Object[] objectArray0 = new Object[6];
      TopLevel.NativeErrors topLevel_NativeErrors0 = TopLevel.NativeErrors.URIError;
      BaseFunction baseFunction0 = importerTopLevel0.getNativeErrorCtor(topLevel_NativeErrors0);
      // Undeclared exception!
      try { 
        importerTopLevel0.importPackage(context0, nativeArrayBuffer0, objectArray0, baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Function importPackage must be called with a package; had \"null\" instead.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      // Undeclared exception!
      try { 
        importerTopLevel0.initPrototypeId(170);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 170
         //
         verifyException("org.mozilla.javascript.ImporterTopLevel", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      TopLevel.NativeErrors topLevel_NativeErrors0 = TopLevel.NativeErrors.URIError;
      BaseFunction baseFunction0 = importerTopLevel0.getNativeErrorCtor(topLevel_NativeErrors0);
      importerTopLevel0.importPackage(context0, nativeArrayBuffer0, context0.emptyArgs, baseFunction0);
      assertEquals("global", importerTopLevel0.getClassName());
      assertFalse(baseFunction0.isSealed());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(importerTopLevel0, "Importer", 4, "Importer", 0, importerTopLevel0);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        importerTopLevel0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4
         //
         verifyException("org.mozilla.javascript.ImporterTopLevel", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(importerTopLevel0, "Importer", 2, 12);
      // Undeclared exception!
      try { 
        importerTopLevel0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(importerTopLevel0, "Importer", 3, 12);
      importerTopLevel0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
      assertEquals("global", importerTopLevel0.getClassName());
  }
}
