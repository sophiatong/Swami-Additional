/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 19:24:29 GMT 2018
 */

package org.mozilla.javascript.regexp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.regexp.NativeRegExp;
import org.mozilla.javascript.regexp.RECompiled;
import org.mozilla.javascript.regexp.RegExpImpl;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeRegExp_ESTest extends NativeRegExp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(nativeArrayBuffer0, 1, (-2991));
      RECompiled rECompiled0 = NativeRegExp.compileRE((Context) null, "ArrayBuffer", "", false);
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeInt32Array0, rECompiled0);
      rECompiled0.flags = 2723;
      String string0 = nativeRegExp0.toString();
      assertEquals("/ArrayBuffer/gi", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(1042);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      RECompiled rECompiled0 = NativeRegExp.compileRE(context0, "language version", "", false);
      assertNotNull(rECompiled0);
      
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeFloat32Array0, rECompiled0);
      NativeRegExp nativeRegExp1 = (NativeRegExp)nativeRegExp0.compile(context0, nativeFloat32Array0, context0.emptyArgs);
      String string0 = nativeRegExp1.toString();
      assertEquals("/(?:)/", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RECompiled rECompiled0 = new RECompiled("msg.bad.quant");
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, rECompiled0);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      nativeRegExp0.setInstanceIdValue(1, importerTopLevel0);
      assertEquals(2, NativeRegExp.JSREG_FOLD);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(nativeArrayBuffer0, 1, (-2991));
      RECompiled rECompiled0 = NativeRegExp.compileRE((Context) null, "ArrayBuffer", "", false);
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeInt32Array0, rECompiled0);
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(27, importerTopLevel0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 27
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdAttributes(1, 1);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(1042);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      RECompiled rECompiled0 = NativeRegExp.compileRE(context0, "language version", "", false);
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeFloat32Array0, rECompiled0);
      // Undeclared exception!
      try { 
        nativeRegExp0.initPrototypeId(5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      RECompiled rECompiled0 = new RECompiled("msg.change.setter.with.configurable.false");
      NativeRegExp nativeRegExp0 = new NativeRegExp(scriptableObject0, rECompiled0);
      // Undeclared exception!
      try { 
        nativeRegExp0.initPrototypeId(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(1042);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      RECompiled rECompiled0 = NativeRegExp.compileRE(context0, "language version", "", false);
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeFloat32Array0, rECompiled0);
      String string0 = nativeRegExp0.getTypeOf();
      assertEquals("object", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        nativeRegExp0.getInstanceIdValue(5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        nativeRegExp0.getInstanceIdValue(4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        nativeRegExp0.getInstanceIdValue(109);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 109
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      RECompiled rECompiled0 = NativeRegExp.compileRE((Context) null, ",/paZn:GAp|", (String) null, false);
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeInt16Array0, rECompiled0);
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdAttributes(2844, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2844
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(nativeArrayBuffer0, 1, (-2991));
      RECompiled rECompiled0 = NativeRegExp.compileRE((Context) null, "ArrayBuffer", "", false);
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeInt32Array0, rECompiled0);
      Context context0 = Context.enter();
      RegExpImpl regExpImpl0 = new RegExpImpl();
      int[] intArray0 = new int[4];
      intArray0[0] = 2;
      rECompiled0.flags = 2723;
      Object object0 = nativeRegExp0.executeRegExp(context0, nativeInt32Array0, regExpImpl0, "ArrayBuffer", intArray0, (-5669));
      assertNull(object0);
      assertArrayEquals(new int[] {2, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      int int0 = nativeRegExp0.findPrototypeId("e3oh.I0Y");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      int int0 = nativeRegExp0.findPrototypeId("+40EW=o");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      RECompiled rECompiled0 = NativeRegExp.compileRE((Context) null, ",/paZn:GAp|", (String) null, false);
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeInt16Array0, rECompiled0);
      int int0 = nativeRegExp0.findPrototypeId("object");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Object[] objectArray0 = nativeRegExp0.getAllIds();
      assertEquals(5, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      RECompiled rECompiled0 = NativeRegExp.compileRE((Context) null, ",paZn:GAp|H", (String) null, false);
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeInt16Array0, rECompiled0);
      RegExpImpl regExpImpl0 = new RegExpImpl();
      int[] intArray0 = new int[6];
      intArray0[0] = (int) (byte)102;
      Object object0 = nativeRegExp0.executeRegExp((Context) null, nativeInt16Array0, regExpImpl0, ",paZn:GAp|H", intArray0, 2);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(nativeArrayBuffer0, 1, (-2991));
      RECompiled rECompiled0 = new RECompiled("ArrayBuffer");
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeInt32Array0, rECompiled0);
      Context context0 = Context.enter();
      byte[] byteArray0 = new byte[3];
      rECompiled0.program = byteArray0;
      RegExpImpl regExpImpl0 = new RegExpImpl();
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        nativeRegExp0.executeRegExp(context0, nativeInt32Array0, regExpImpl0, "4:H0qZ,", intArray0, (-5669));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: invalid bytecode
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      RECompiled rECompiled0 = NativeRegExp.compileRE((Context) null, ",paZn:GAp|H", (String) null, false);
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeInt16Array0, rECompiled0);
      RegExpImpl regExpImpl0 = new RegExpImpl();
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        nativeRegExp0.executeRegExp((Context) null, nativeInt16Array0, regExpImpl0, ",paZn:GAp|H", intArray0, (-2190));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      RECompiled rECompiled0 = NativeRegExp.compileRE((Context) null, ",paZn:GAp|H", (String) null, false);
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeInt16Array0, rECompiled0);
      RegExpImpl regExpImpl0 = new RegExpImpl();
      int[] intArray0 = new int[6];
      Object object0 = nativeRegExp0.executeRegExp((Context) null, nativeInt16Array0, regExpImpl0, "constructor", intArray0, 13);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      RECompiled rECompiled0 = new RECompiled("error reporter");
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeFloat32Array0, rECompiled0);
      RegExpImpl regExpImpl0 = new RegExpImpl();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)21;
      rECompiled0.program = byteArray0;
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        nativeRegExp0.executeRegExp(context0, nativeFloat32Array0, regExpImpl0, "", intArray0, 9);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(nativeArrayBuffer0, 1, (-2991));
      RECompiled rECompiled0 = NativeRegExp.compileRE((Context) null, "ArrayBuffer", "", false);
      assertNotNull(rECompiled0);
      
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeInt32Array0, rECompiled0);
      Context context0 = Context.enter();
      RegExpImpl regExpImpl0 = new RegExpImpl();
      int[] intArray0 = new int[4];
      nativeRegExp0.executeRegExp(context0, nativeInt32Array0, regExpImpl0, "ArrayBuffer", intArray0, (-5669));
      assertArrayEquals(new int[] {11, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(nativeArrayBuffer0, 0, 1570);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeInt32Array0, nativeRegExp0, 1594, 1842);
      // Undeclared exception!
      try { 
        nativeRegExp0.execIdCall(idFunctionObject0, (Context) null, idFunctionObject0, nativeInt32Array0, context0.emptyArgs);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.mozilla.javascript.typedarrays.ByteIo", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      RECompiled rECompiled0 = NativeRegExp.compileRE(context0, "Yn?zT11I&Rl{Bu", (String) null, false);
      assertNotNull(rECompiled0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeRegExp0.construct(context0, nativeRegExp0, context0.emptyArgs);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Context context0 = Context.enter();
      RECompiled rECompiled0 = NativeRegExp.compileRE(context0, "error reporter", "", true);
      assertNotNull(rECompiled0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "language version", "msg.bad.quant", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Context context0 = Context.enter();
      RECompiled rECompiled0 = NativeRegExp.compileRE(context0, "parseFloat", "i", false);
      assertNotNull(rECompiled0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE((Context) null, "getEncodedSource", "getEncodedSource", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      Object[] objectArray0 = new Object[7];
      Scriptable scriptable0 = context0.newArray((Scriptable) nativeRegExp0, objectArray0);
      // Undeclared exception!
      try { 
        nativeRegExp0.compile(context0, scriptable0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) nativeRegExp0;
      NativeRegExp nativeRegExp1 = (NativeRegExp)nativeRegExp0.compile((Context) null, (Scriptable) null, objectArray0);
      assertEquals(2, NativeRegExp.JSREG_FOLD);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) nativeRegExp0;
      Scriptable scriptable0 = context0.newArray((Scriptable) nativeRegExp0, objectArray0);
      // Undeclared exception!
      try { 
        nativeRegExp0.compile(context0, scriptable0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Only one argument may be specified if the first argument to RegExp.prototype.compile is a RegExp object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      // Undeclared exception!
      try { 
        nativeRegExp0.call(context0, importerTopLevel0, importerTopLevel0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      RECompiled rECompiled0 = NativeRegExp.compileRE(context0, "@:^K1zjMBX'#x", (String) null, false);
      assertNotNull(rECompiled0);
  }
}