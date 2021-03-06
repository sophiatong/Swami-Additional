/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 23:51:37 GMT 2018
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
import org.mozilla.javascript.NativeCallSite;
import org.mozilla.javascript.NativeJavaClass;
import org.mozilla.javascript.ScriptStackElement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeCallSite_ESTest extends NativeCallSite_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeCallSite nativeCallSite0 = NativeCallSite.make(nativeJavaClass0, nativeJavaClass0);
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("", "", 13);
      nativeCallSite0.setElement(scriptStackElement0);
      String string0 = nativeCallSite0.toString();
      assertEquals("()@:13", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeCallSite nativeCallSite0 = NativeCallSite.make(nativeJavaClass0, nativeJavaClass0);
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("2e", (String) null, 0);
      nativeCallSite0.setElement(scriptStackElement0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeCallSite0, "CallSite", 15, "", 4, nativeJavaClass0);
      Context context0 = Context.enter();
      Object object0 = nativeCallSite0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeCallSite0, context0.emptyArgs);
      assertEquals("\tat 2e:0", object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      assertFalse(importerTopLevel0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeCallSite nativeCallSite0 = NativeCallSite.make(nativeJavaClass0, nativeJavaClass0);
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("", "", 1);
      nativeCallSite0.setElement(scriptStackElement0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeCallSite0, "CallSite", 8, "", 4, nativeJavaClass0);
      Context context0 = Context.enter();
      Object object0 = nativeCallSite0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeCallSite0, context0.emptyArgs);
      assertEquals(1, object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeCallSite nativeCallSite0 = NativeCallSite.make(nativeJavaClass0, nativeJavaClass0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeCallSite0, "CallSite", 8, "", 4, nativeJavaClass0);
      Context context0 = Context.enter();
      Object object0 = nativeCallSite0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeCallSite0, context0.emptyArgs);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeCallSite nativeCallSite0 = NativeCallSite.make(nativeJavaClass0, nativeJavaClass0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeCallSite0, "CallSite", 5, "CallSite", 4, nativeJavaClass0);
      Context context0 = Context.enter();
      Object object0 = nativeCallSite0.execIdCall(idFunctionObject0, context0, nativeJavaClass0, nativeJavaClass0, context0.emptyArgs);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeCallSite nativeCallSite0 = NativeCallSite.make(nativeJavaClass0, nativeJavaClass0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeCallSite0, "CallSite", 7, "CallSite", 4, nativeJavaClass0);
      Context context0 = Context.enter();
      Object object0 = nativeCallSite0.execIdCall(idFunctionObject0, context0, nativeCallSite0, nativeCallSite0, context0.emptyArgs);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeCallSite nativeCallSite0 = NativeCallSite.make(nativeJavaClass0, nativeJavaClass0);
      int int0 = nativeCallSite0.findPrototypeId("Nl2?z2;W g#");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeCallSite nativeCallSite0 = NativeCallSite.make(nativeJavaClass0, nativeJavaClass0);
      int int0 = nativeCallSite0.findPrototypeId("P8G6SP?a?9x3K");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeCallSite nativeCallSite0 = NativeCallSite.make(nativeJavaClass0, nativeJavaClass0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeCallSite0, "CallSite", 15, "CallSite", 4, nativeJavaClass0);
      Context context0 = Context.enter();
      Object object0 = nativeCallSite0.execIdCall(idFunctionObject0, context0, nativeJavaClass0, nativeJavaClass0, context0.emptyArgs);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeCallSite nativeCallSite0 = NativeCallSite.make(nativeJavaClass0, nativeJavaClass0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeCallSite0, "CallSite", 6, "CallSite", 4, nativeJavaClass0);
      Context context0 = Context.getCurrentContext();
      Object object0 = nativeCallSite0.execIdCall(idFunctionObject0, context0, nativeCallSite0, idFunctionObject0, context0.emptyArgs);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeCallSite nativeCallSite0 = NativeCallSite.make(nativeJavaClass0, nativeJavaClass0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeCallSite0, "CallSite", 2, "CallSite", 4, nativeJavaClass0);
      Context context0 = Context.getCurrentContext();
      Object object0 = nativeCallSite0.execIdCall(idFunctionObject0, context0, nativeCallSite0, idFunctionObject0, context0.emptyArgs);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeCallSite nativeCallSite0 = NativeCallSite.make(nativeJavaClass0, nativeJavaClass0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeCallSite0, "CallSite", 8, "CallSite", 4, nativeJavaClass0);
      Context context0 = Context.enter();
      Object object0 = nativeCallSite0.execIdCall(idFunctionObject0, context0, nativeJavaClass0, nativeJavaClass0, context0.emptyArgs);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeCallSite nativeCallSite0 = NativeCallSite.make(nativeJavaClass0, nativeJavaClass0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeCallSite0, "CallSite", 5, "CallSite", 4, nativeJavaClass0);
      Context context0 = Context.enter();
      Object object0 = nativeCallSite0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeCallSite0, context0.emptyArgs);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeCallSite nativeCallSite0 = NativeCallSite.make(nativeJavaClass0, nativeJavaClass0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeCallSite0, "", 8, "", 4, nativeJavaClass0);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeCallSite0.execIdCall(idFunctionObject0, context0, nativeJavaClass0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=8 MASTER=
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeCallSite nativeCallSite0 = NativeCallSite.make(nativeJavaClass0, nativeJavaClass0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeCallSite0, "CallSite", 1, "CallSite", 4, nativeJavaClass0);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        nativeCallSite0.execIdCall(idFunctionObject0, context0, nativeCallSite0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mozilla.javascript.UniqueTag cannot be cast to org.mozilla.javascript.Scriptable
         //
         verifyException("org.mozilla.javascript.NativeCallSite", e);
      }
  }
}
