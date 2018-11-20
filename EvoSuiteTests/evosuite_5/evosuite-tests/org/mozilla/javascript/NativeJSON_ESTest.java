/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 15:37:28 GMT 2018
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
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.NativeCall;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.NativeGenerator;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.NativeJSON;
import org.mozilla.javascript.NativeJavaClass;
import org.mozilla.javascript.NativeNumber;
import org.mozilla.javascript.NativeString;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Synchronizer;
import org.mozilla.javascript.regexp.RegExpImpl;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.typedarrays.NativeUint32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeJSON_ESTest extends NativeJSON_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(52);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      CharBuffer charBuffer0 = CharBuffer.allocate(4);
      NativeString nativeString0 = new NativeString(charBuffer0);
      // Undeclared exception!
      try { 
        NativeJSON.stringify((Context) null, nativeUint32Array0, nativeUint32Array0, nativeIterator_StopIteration0, nativeString0);
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
      Context context0 = Context.enter();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(11);
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(nativeArrayBuffer0, 7, 130);
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Object object0 = NativeJSON.stringify(context0, nativeUint32Array0, nativeBoolean0, nativeIterator_StopIteration0, importerTopLevel0);
      assertEquals("false", object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = Context.enter();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeNumber nativeNumber0 = new NativeNumber(9);
      // Undeclared exception!
      try { 
        NativeJSON.stringify(context0, nativeContinuation0, nativeNumber0, nativeNumber0, "language version");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Synchronizer synchronizer0 = new Synchronizer(baseFunction0);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Double double0 = new Double(2);
      // Undeclared exception!
      try { 
        NativeJSON.stringify((Context) null, synchronizer0, nativeContinuation0, nativeContinuation0, double0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeCall nativeCall0 = new NativeCall();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        NativeJSON.parse(context0, nativeCall0, "error reporter", nativeJavaClass0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SyntaxError: Unexpected token: e
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(4);
      Object object0 = NativeJSON.stringify(context0, nativeUint16Array0, nativeUint16Array0, nativeUint16Array0, "language version");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = Context.enter();
      RegExpImpl regExpImpl0 = new RegExpImpl();
      NativeError nativeError0 = new NativeError();
      NativeWith nativeWith0 = new NativeWith(nativeError0, nativeError0);
      ScriptableObject.defineProperty((Scriptable) nativeWith0, "language version", (Object) null, 0);
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Object object0 = NativeJSON.stringify(context0, nativeWith0, nativeWith0, regExpImpl0, nativeArray0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.put("error reporter", (Scriptable) importerTopLevel0, (Object) importerTopLevel0);
      // Undeclared exception!
      try { 
        NativeJSON.stringify(context0, importerTopLevel0, importerTopLevel0, importerTopLevel0, nativeIterator_StopIteration0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cyclic {0} value not allowed.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = Context.enter();
      NativeError nativeError0 = new NativeError();
      NativeWith nativeWith0 = new NativeWith(nativeError0, nativeError0);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeError0, false);
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0);
      Object object0 = NativeJSON.stringify(context0, nativeGenerator0, nativeWith0, nativeArray0, synchronizer0);
      assertEquals("{}", object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Long long0 = new Long(130);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 8, (Object) long0);
      Object object0 = NativeJSON.stringify(context0, nativeArray0, nativeArray0, nativeArray0, long0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Long long0 = new Long(0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 16, (Object) context0);
      Object object0 = NativeJSON.stringify(context0, nativeArray0, nativeArray0, nativeArray0, long0);
      assertNotNull(object0);
  }
}
