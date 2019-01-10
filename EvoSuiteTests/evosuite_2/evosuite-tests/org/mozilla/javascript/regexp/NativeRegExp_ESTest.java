/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 20:07:16 GMT 2018
 */

package org.mozilla.javascript.regexp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.regexp.NativeRegExp;
import org.mozilla.javascript.regexp.RECompiled;
import org.mozilla.javascript.regexp.RegExpImpl;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeRegExp_ESTest extends NativeRegExp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      RECompiled rECompiled0 = NativeRegExp.compileRE((Context) null, "", "", false);
      assertNotNull(rECompiled0);
      
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeUint8ClampedArray0, rECompiled0);
      String string0 = nativeRegExp0.toString();
      assertEquals("/(?:)/", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(21);
      RECompiled rECompiled0 = new RECompiled("object");
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeUint8Array0, rECompiled0);
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      nativeRegExp0.setInstanceIdValue(2, importerTopLevel0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      RECompiled rECompiled0 = NativeRegExp.compileRE((Context) null, "", (String) null, false);
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeArray0, rECompiled0);
      nativeRegExp0.setInstanceIdValue(1, "");
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(2198, (Object) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 2198
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdAttributes(1, (-32));
      assertFalse(nativeRegExp0.isSealed());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeRegExp0, "error reporter", 57, 27);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) context0;
      NativeRegExp nativeRegExp1 = (NativeRegExp)nativeRegExp0.compile(context0, idFunctionObject0, objectArray0);
      assertEquals("object", nativeRegExp1.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "L)eFRQn%Ty7-?", "", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SyntaxError: unmatched ) in regular expression.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RECompiled rECompiled0 = NativeRegExp.compileRE((Context) null, "dkW;do^b/#", "", false);
      assertNotNull(rECompiled0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = NativeRegExp.isDigit('(');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        nativeRegExp0.initPrototypeId(13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("org.mozilla.javascript.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = Context.getCurrentContext();
      RECompiled rECompiled0 = NativeRegExp.compileRE(context0, "RM-5u|rr,Ni", "", false);
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeObject0, rECompiled0);
      String string0 = nativeRegExp0.getTypeOf();
      assertEquals("object", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        nativeRegExp0.getInstanceIdValue(90);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 90
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(nativeArrayBuffer0, 3017, 0);
      RECompiled rECompiled0 = NativeRegExp.compileRE((Context) null, "ArrayBuffer", (String) null, false);
      assertNotNull(rECompiled0);
      
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeUint8Array0, rECompiled0);
      Object object0 = nativeRegExp0.getInstanceIdValue(4);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        nativeRegExp0.getInstanceIdValue(2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(nativeArrayBuffer0, 3017, 0);
      RECompiled rECompiled0 = NativeRegExp.compileRE((Context) null, "ArrayBuffer", (String) null, false);
      assertNotNull(rECompiled0);
      
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeUint8Array0, rECompiled0);
      Object object0 = nativeRegExp0.getInstanceIdValue(1);
      assertEquals(0.0, object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        nativeRegExp0.getInstanceIdValue(3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdAttributes(778, 5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 778
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        nativeRegExp0.getFlags();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(nativeArrayBuffer0, 3017, 0);
      RECompiled rECompiled0 = NativeRegExp.compileRE((Context) null, "ArrayBuffer", (String) null, false);
      assertNotNull(rECompiled0);
      
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeUint8Array0, rECompiled0);
      int int0 = nativeRegExp0.findPrototypeId("compile");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(nativeArrayBuffer0, 3017, 0);
      RECompiled rECompiled0 = NativeRegExp.compileRE((Context) null, "ArrayBuffer", (String) null, false);
      assertNotNull(rECompiled0);
      
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeUint8Array0, rECompiled0);
      int int0 = nativeRegExp0.findPrototypeId("object");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = Context.getCurrentContext();
      RECompiled rECompiled0 = NativeRegExp.compileRE(context0, "RM-5u|rr,Ni", "", false);
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeObject0, rECompiled0);
      Object[] objectArray0 = nativeRegExp0.getAllIds();
      assertEquals(5, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      RegExpImpl regExpImpl0 = new RegExpImpl();
      int[] intArray0 = new int[1];
      intArray0[0] = 100;
      // Undeclared exception!
      try { 
        nativeRegExp0.executeRegExp(context0, nativeRegExp0, regExpImpl0, "error reporter", intArray0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      RegExpImpl regExpImpl0 = new RegExpImpl();
      int[] intArray0 = new int[1];
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(nativeArrayBuffer0, 32, 8);
      RECompiled rECompiled0 = new RECompiled("object");
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)4;
      rECompiled0.program = byteArray0;
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeFloat64Array0, rECompiled0);
      // Undeclared exception!
      try { 
        nativeRegExp0.executeRegExp(context0, (Scriptable) null, regExpImpl0, "msg.invalid.re.flag", intArray0, 8);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: invalid bytecode
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = Context.getCurrentContext();
      RECompiled rECompiled0 = NativeRegExp.compileRE(context0, "RM-5u|rr,Ni", "", false);
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeObject0, rECompiled0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeObject0, nativeRegExp0, 13, 4);
      // Undeclared exception!
      try { 
        nativeRegExp0.execIdCall(idFunctionObject0, context0, nativeObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=13 MASTER=[object Object]
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Context context0 = Context.enter();
      RECompiled rECompiled0 = NativeRegExp.compileRE(context0, "hypot", "i", false);
      assertNotNull(rECompiled0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Object[] objectArray0 = new Object[7];
      // Undeclared exception!
      try { 
        nativeRegExp0.construct((Context) null, (Scriptable) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Context context0 = Context.enter();
      RECompiled rECompiled0 = NativeRegExp.compileRE(context0, "i", "i", false);
      assertNotNull(rECompiled0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Context context0 = Context.enter();
      RegExpImpl regExpImpl0 = new RegExpImpl();
      // Undeclared exception!
      try { 
        regExpImpl0.compileRegExp(context0, "language version", "msg.overlarge.backref");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE((Context) null, "object", "ignoreCase", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(nativeArrayBuffer0, 1084, 2);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) nativeRegExp0;
      NativeRegExp nativeRegExp1 = (NativeRegExp)nativeRegExp0.compile(context0, nativeInt32Array0, objectArray0);
      assertFalse(nativeRegExp1.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = Context.getCurrentContext();
      RECompiled rECompiled0 = NativeRegExp.compileRE(context0, "RM-5u|rr,Ni", "", false);
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeObject0, rECompiled0);
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) nativeRegExp0;
      // Undeclared exception!
      try { 
        nativeRegExp0.compile(context0, nativeObject0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Only one argument may be specified if the first argument to RegExp.prototype.compile is a RegExp object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }
}
