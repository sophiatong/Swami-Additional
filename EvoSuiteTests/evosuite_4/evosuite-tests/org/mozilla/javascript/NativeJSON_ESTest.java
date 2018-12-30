/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 15:25:58 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.IdFunctionCall;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.NativeCallSite;
import org.mozilla.javascript.NativeJSON;
import org.mozilla.javascript.NativeJavaPackage;
import org.mozilla.javascript.NativeJavaTopPackage;
import org.mozilla.javascript.NativeNumber;
import org.mozilla.javascript.NativeString;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Synchronizer;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeUint32Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeJSON_ESTest extends NativeJSON_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      NativeString nativeString0 = new NativeString(charBuffer0);
      Synchronizer synchronizer0 = new Synchronizer(nativeString0, (Object) null);
      // Undeclared exception!
      try { 
        NativeJSON.stringify((Context) null, nativeString0, synchronizer0, synchronizer0, nativeString0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      Object[] objectArray0 = new Object[10];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        NativeJSON.stringify(context0, (Scriptable) null, (Object) null, nativeArray0, context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(7);
      Double double0 = new Double(Double.POSITIVE_INFINITY);
      Float float0 = new Float((float) 12);
      Object object0 = NativeJSON.stringify(context0, nativeArrayBuffer0, double0, float0, context0);
      assertEquals("null", object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(218);
      Context context0 = Context.enter();
      Long long0 = new Long(150);
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      Object object0 = NativeJSON.stringify(context0, nativeUint8Array0, nativeBoolean0, nativeUint8Array0, long0);
      assertEquals("true", object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.NativeErrors topLevel_NativeErrors0 = TopLevel.NativeErrors.EvalError;
      BaseFunction baseFunction0 = importerTopLevel0.getNativeErrorCtor(topLevel_NativeErrors0);
      NativeArray nativeArray0 = new NativeArray(3);
      NativeNumber nativeNumber0 = new NativeNumber(13);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(baseFunction0, context0, 6, "[java.lang.String@0000000736,java.lang.String@0000000736,java.lang.String@0000000736,java.lang.String@0000000736,java.lang.String@0000000736,java.lang.String@0000000736,java.lang.String@0000000736,java.lang.String@0000000736,java.lang.String@0000000737]", 4, nativeArray0);
      // Undeclared exception!
      try { 
        NativeJSON.stringify(context0, baseFunction0, nativeNumber0, contextFactory0, idFunctionObjectES6_0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Context context0 = Context.enter();
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(2);
      Short short0 = new Short((short)921);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject((IdFunctionCall) null, short0, 998, 2118);
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      NativeJavaPackage nativeJavaPackage0 = nativeJavaTopPackage0.forcePackage("ArrayBuffer", nativeUint32Array0);
      NativeCallSite nativeCallSite0 = NativeCallSite.make(idFunctionObject0, nativeJavaPackage0);
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      NativeArray nativeArray0 = new NativeArray(259L);
      // Undeclared exception!
      NativeJSON.stringify(context0, nativeUint32Array0, nativeCallSite0, nativeBoolean0, nativeArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = Context.enter();
      BaseFunction baseFunction0 = new BaseFunction();
      Object object0 = NativeJSON.parse(context0, baseFunction0, "false", baseFunction0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = Context.enter();
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(0);
      // Undeclared exception!
      try { 
        NativeJSON.parse(context0, nativeUint8Array0, "language version", (Callable) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SyntaxError: Unexpected token: l
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(3);
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(2);
      Short short0 = new Short((short)921);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject((IdFunctionCall) null, short0, 998, 2118);
      Object object0 = NativeJSON.stringify(context0, nativeUint32Array0, nativeArrayBuffer0, nativeArrayBuffer0, idFunctionObject0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(218);
      Context context0 = Context.enter();
      Scriptable scriptable0 = context0.newArray((Scriptable) nativeUint8Array0, 6);
      Long long0 = new Long(150);
      Object object0 = NativeJSON.stringify(context0, scriptable0, nativeUint8Array0, long0, "language version");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(218);
      Context context0 = Context.enter();
      Scriptable scriptable0 = context0.newArray((Scriptable) nativeUint8Array0, 6);
      Long long0 = new Long(150);
      Object object0 = NativeJSON.stringify(context0, nativeUint8Array0, context0, "150", long0);
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      NativeWith nativeWith0 = new NativeWith(((Undefined) object0).SCRIPTABLE_UNDEFINED, nativeBoolean0);
      Object object1 = NativeJSON.stringify(context0, nativeUint8Array0, nativeWith0, scriptable0, "true");
      assertEquals("{}", object1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.NativeErrors topLevel_NativeErrors0 = TopLevel.NativeErrors.EvalError;
      BaseFunction baseFunction0 = importerTopLevel0.getNativeErrorCtor(topLevel_NativeErrors0);
      NativeArray nativeArray0 = new NativeArray(3);
      baseFunction0.put(8, (Scriptable) nativeArray0, (Object) importerTopLevel0);
      Object object0 = NativeJSON.stringify(context0, baseFunction0, nativeArray0, context0, (Object) null);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.NativeErrors topLevel_NativeErrors0 = TopLevel.NativeErrors.EvalError;
      BaseFunction baseFunction0 = importerTopLevel0.getNativeErrorCtor(topLevel_NativeErrors0);
      NativeArray nativeArray0 = new NativeArray(3);
      Object object0 = NativeJSON.stringify(context0, baseFunction0, nativeArray0, context0, "language version");
      assertNotNull(object0);
  }
}