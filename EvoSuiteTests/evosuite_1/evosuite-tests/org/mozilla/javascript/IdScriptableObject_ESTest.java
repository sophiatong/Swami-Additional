/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 04:54:26 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.NativeCall;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.NativeGenerator;
import org.mozilla.javascript.NativeJSON;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.NativeString;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeUint16Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IdScriptableObject_ESTest extends IdScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(importerTopLevel0, importerTopLevel0);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeArrayIterator0, false);
      // Undeclared exception!
      try { 
        nativeGenerator0.initPrototypeMethod((Object) null, 6382, "error reporter", 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.IdScriptableObject$PrototypeValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeCall0, nativeCall0, (-26), "#G.oZ_", 1278, nativeCall0);
      // Undeclared exception!
      try { 
        idFunctionObjectES6_0.setInstanceIdValue(1278, "#G.oZ_");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1278
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(importerTopLevel0, importerTopLevel0);
      SymbolKey symbolKey0 = SymbolKey.IS_CONCAT_SPREADABLE;
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeArrayIterator0, false);
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.put((Symbol) symbolKey0, (Scriptable) nativeGenerator0, (Object) null);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(0);
      // Undeclared exception!
      try { 
        nativeArrayBuffer0.initPrototypeValue(0, (Symbol) null, (Object) "Y[\"8eUwMP$\"spWp#", 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1L));
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeValue((-2064), "exp", (Object) null, (-196));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      // Undeclared exception!
      try { 
        topLevel0.initPrototypeId(51);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 51
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      boolean boolean0 = nativeUint16Array0.hasPrototypeMap();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(importerTopLevel0, importerTopLevel0);
      SymbolKey symbolKey0 = SymbolKey.IS_CONCAT_SPREADABLE;
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeArrayIterator0, false);
      Object object0 = NativeJSON.stringify(context0, nativeGenerator0, importerTopLevel0, symbolKey0, (Object) null);
      assertEquals("{}", object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, (Object) null);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-9223372036854775808L));
      // Undeclared exception!
      try { 
        nativeArray0.getInstanceIdValue(4);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 4
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      // Undeclared exception!
      try { 
        topLevel0.setInstanceIdAttributes(0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(0);
      ScriptableObject.putProperty((Scriptable) nativeArrayBuffer0, 4, (Object) "Y[\"8eUwMP$\"spWp#");
      Object[] objectArray0 = ScriptableObject.getPropertyIds(nativeArrayBuffer0);
      assertEquals(2, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Object[] objectArray0 = nativeArray0.getAllIds();
      assertEquals(1, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-9L));
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, "error reporter");
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(importerTopLevel0, importerTopLevel0);
      SymbolKey symbolKey0 = SymbolKey.IS_CONCAT_SPREADABLE;
      Object object0 = importerTopLevel0.get((Symbol) symbolKey0, (Scriptable) nativeArrayIterator0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(importerTopLevel0, importerTopLevel0);
      SymbolKey symbolKey0 = SymbolKey.IS_CONCAT_SPREADABLE;
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeArrayIterator0, false);
      nativeGenerator0.delete((Symbol) symbolKey0);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      nativeError0.delete("");
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeJavaMethod nativeJavaMethod0 = new NativeJavaMethod((MemberBox[]) null, "ArrayBuffer");
      nativeJavaMethod0.defineOwnProperty(context0, context0, nativeArrayBuffer0);
      assertFalse(nativeJavaMethod0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeString nativeString0 = new NativeString("language version");
      nativeString0.defaultPut("", "");
      assertEquals("language version", nativeString0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Object object0 = nativeError0.defaultGet("");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(217L);
      nativeArray0.activatePrototypeMap(1065);
      NativeError nativeError0 = new NativeError();
      // Undeclared exception!
      try { 
        nativeArray0.exportAsJSClass(1065, nativeError0, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }
}
