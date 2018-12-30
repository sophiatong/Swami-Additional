/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 18:38:11 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.JavaAdapter;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.tools.shell.Environment;
import org.mozilla.javascript.tools.shell.Global;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Environment_ESTest extends Environment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      Environment environment0 = new Environment(nativeArrayBuffer0);
      boolean boolean0 = environment0.has("ArrayBuffer", (Scriptable) nativeArrayBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Environment environment0 = new Environment();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) environment0, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Environment environment0 = new Environment();
      Object[] objectArray0 = environment0.getIds();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Environment environment0 = new Environment();
      Object[] objectArray0 = environment0.getAllIds();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Environment environment0 = new Environment(importerTopLevel0);
      Object[] objectArray0 = environment0.getAllIds();
      assertEquals(71, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Environment environment0 = new Environment(importerTopLevel0);
      NativeObject nativeObject0 = new NativeObject();
      Object object0 = environment0.get("Environment", (Scriptable) nativeObject0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Environment environment0 = new Environment(importerTopLevel0);
      // Undeclared exception!
      try { 
        Environment.defineClass((ScriptableObject) environment0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.tools.shell.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Environment environment0 = new Environment(importerTopLevel0);
      Object[] objectArray0 = environment0.getIds();
      assertEquals(71, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      StringReader stringReader0 = new StringReader("");
      Script script0 = context0.compileReader((Reader) stringReader0, "Uwd}O20V*(Aop", 0, (Object) null);
      Global global0 = (Global)JavaAdapter.runScript(script0);
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Environment environment0 = new Environment();
      Object object0 = ScriptableObject.getProperty((Scriptable) environment0, (String) null);
      assertNotNull(object0);
  }
}