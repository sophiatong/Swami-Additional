/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 05:55:57 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ArrowFunction;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.JavaMembers;
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeCall;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.NativeString;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.typedarrays.NativeInt32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseFunction_ESTest extends BaseFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, 2, 1);
      // Undeclared exception!
      try { 
        idFunctionObject0.setInstanceIdValue((-59), "Function");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -59
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      baseFunction0.setInstanceIdValue(2, "join");
      assertEquals("function", baseFunction0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      Context context0 = Context.getCurrentContext();
      Class<Object> class0 = Object.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeCall0, class0);
      NativeJavaMethod nativeJavaMethod0 = javaMembers0.ctors;
      ArrowFunction arrowFunction0 = null;
      try {
        arrowFunction0 = new ArrowFunction(context0, nativeCall0, nativeJavaMethod0, nativeJavaMethod0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, 2, 1);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, idFunctionObject0);
      idFunctionObject0.setInstanceIdValue(5, nativeWith0);
      assertFalse(idFunctionObject0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeCall nativeCall0 = new NativeCall();
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(baseFunction0, nativeCall0, 8, "join", 2, nativeInt32Array0);
      idFunctionObject0.setInstanceIdValue(4, "join");
      assertEquals(2, idFunctionObject0.getLength());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Boolean;
      IdFunctionObject idFunctionObject0 = (IdFunctionObject)importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      // Undeclared exception!
      try { 
        idFunctionObject0.markAsConstructor(idFunctionObject0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.BaseFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Boolean;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      IdFunctionObject idFunctionObject0 = baseFunction0.exportAsJSClass(150, importerTopLevel0, false);
      BaseFunction.isApplyOrCall(idFunctionObject0);
      assertEquals(1, idFunctionObject0.getLength());
      assertEquals(1, idFunctionObject0.getArity());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Boolean;
      IdFunctionObject idFunctionObject0 = (IdFunctionObject)importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      boolean boolean0 = BaseFunction.isApply(idFunctionObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      TopLevel.NativeErrors topLevel_NativeErrors0 = TopLevel.NativeErrors.Error;
      BaseFunction baseFunction0 = importerTopLevel0.getNativeErrorCtor(topLevel_NativeErrors0);
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      boolean boolean0 = baseFunction0.hasInstance(nativeInt32Array0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Boolean;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      String string0 = baseFunction0.getTypeOf();
      assertEquals("function", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeJavaMethod nativeJavaMethod0 = new NativeJavaMethod((MemberBox) null, (String) null);
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeJavaMethod0, (Object) null, 1);
      nativeJavaMethod0.setImmunePrototypeProperty((Object) null);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        nativeJavaMethod0.construct(context0, scriptableObject0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      int int0 = baseFunction0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, 2, 1);
      // Undeclared exception!
      try { 
        idFunctionObject0.getInstanceIdValue(170);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 170
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeWith nativeWith0 = new NativeWith(baseFunction0, baseFunction0);
      Object object0 = nativeWith0.get("name", (Scriptable) baseFunction0);
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, 2, 1);
      Object object0 = idFunctionObject0.getInstanceIdValue(2);
      assertEquals(1, object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, 2, 1);
      Object object0 = idFunctionObject0.getInstanceIdValue(1);
      assertEquals(1, object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        baseFunction0.setInstanceIdAttributes(13, 13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = Context.enter((Context) null, contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Error;
      IdFunctionObject idFunctionObject0 = (IdFunctionObject)importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      NativeError nativeError0 = (NativeError)idFunctionObject0.getInstanceIdValue(5);
      assertNull(nativeError0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Boolean;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      baseFunction0.exportAsJSClass(13, importerTopLevel0, false);
      // Undeclared exception!
      try { 
        baseFunction0.getAllIds();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7
         //
         verifyException("org.mozilla.javascript.BaseFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeWith nativeWith0 = new NativeWith(baseFunction0, baseFunction0);
      // Undeclared exception!
      try { 
        nativeWith0.hasInstance(baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: 'prototype' property of  is not an object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      String string0 = baseFunction0.decompile(4, 0);
      assertEquals("function () {\n\t[native code, arity=0]\n}\n", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.String;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      NativeString nativeString0 = (NativeString)baseFunction0.construct(context0, importerTopLevel0, context0.emptyArgs);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Boolean;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      Object[] objectArray0 = baseFunction0.getAllIds();
      assertEquals(5, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = Context.getCurrentContext();
      NativeWith nativeWith0 = new NativeWith(baseFunction0, baseFunction0);
      NativeObject nativeObject0 = (NativeObject)baseFunction0.construct(context0, nativeWith0, context0.emptyArgs);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeCall nativeCall0 = new NativeCall();
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(baseFunction0, nativeCall0, 8, "join", 2, nativeInt32Array0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      // Undeclared exception!
      try { 
        baseFunction0.execIdCall(idFunctionObject0, context0, nativeCall0, nativeInt32Array0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=8 MASTER=org.mozilla.javascript.BaseFunction@3
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }
}
