/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 19:30:29 GMT 2018
 */

package org.mozilla.javascript.regexp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Arrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.regexp.NativeRegExp;
import org.mozilla.javascript.regexp.RECompiled;
import org.mozilla.javascript.regexp.RegExpImpl;
import org.mozilla.javascript.regexp.SubString;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeUint16Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegExpImpl_ESTest extends RegExpImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      Context context0 = Context.getCurrentContext();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      // Undeclared exception!
      try { 
        regExpImpl0.wrapRegExp(context0, nativeUint16Array0, context0);
       //  fail("Expecting exception: ClassCastException");
       // Unstable assertion
      } catch(ClassCastException e) {
         //
         // org.mozilla.javascript.Context cannot be cast to org.mozilla.javascript.regexp.RECompiled
         //
         verifyException("org.mozilla.javascript.regexp.RegExpImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      Context context0 = Context.getCurrentContext();
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(8);
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) nativeFloat32Array0;
      // Undeclared exception!
      try { 
        regExpImpl0.js_split(context0, nativeFloat32Array0, "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;Z)Lorg/mozilla/javascript/Scriptable;", objectArray0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      SubString[] subStringArray0 = new SubString[5];
      SubString subString0 = regExpImpl0.getParenSubString(92);
      subStringArray0[2] = subString0;
      subStringArray0[3] = subStringArray0[2];
      subStringArray0[4] = subStringArray0[3];
      regExpImpl0.parens = subStringArray0;
      SubString subString1 = regExpImpl0.getParenSubString(4);
      assertSame(subString1, subString0);
      assertNotNull(subString1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      Context context0 = Context.enter();
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(3);
      RECompiled rECompiled0 = NativeRegExp.compileRE(context0, "", "", true);
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeInt32Array0, rECompiled0);
      rECompiled0.parenCount = 3;
      int[] intArray0 = new int[11];
      boolean[] booleanArray0 = new boolean[9];
      String[][] stringArray0 = new String[1][1];
      int int0 = regExpImpl0.find_split(context0, nativeInt32Array0, "", "getPrototypeOf", nativeRegExp0, intArray0, intArray0, booleanArray0, stringArray0);
      assertEquals((-1), int0);
      assertTrue(Arrays.equals(new boolean[] {true, false, false, false, false, false, false, false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      Context context0 = Context.enter();
      int[] intArray0 = new int[3];
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array((NativeArrayBuffer) null, 28, 1992);
      RECompiled rECompiled0 = NativeRegExp.compileRE(context0, "dc", "", true);
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeInt32Array0, rECompiled0);
      boolean[] booleanArray0 = new boolean[9];
      String[][] stringArray0 = new String[0][1];
      int int0 = regExpImpl0.find_split(context0, nativeInt32Array0, "error reporter", "error reporter", nativeRegExp0, intArray0, intArray0, booleanArray0, stringArray0);
      assertEquals(14, int0);
      assertArrayEquals(new int[] {1, 0, 0}, intArray0);
      assertTrue(Arrays.equals(new boolean[] {false, false, false, false, false, false, false, false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      Context context0 = Context.enter();
      Object[] objectArray0 = new Object[1];
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array((NativeArrayBuffer) null, 17, 1992);
      NativeArray nativeArray0 = (NativeArray)regExpImpl0.js_split(context0, nativeInt32Array0, "", objectArray0);
      assertEquals(1L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      Context context0 = Context.enter();
      Object[] objectArray0 = new Object[1];
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array((NativeArrayBuffer) null, 17, 1992);
      RECompiled rECompiled0 = NativeRegExp.compileRE(context0, "", "", false);
      NativeRegExp nativeRegExp0 = new NativeRegExp(nativeInt32Array0, rECompiled0);
      NativeArray nativeArray0 = (NativeArray)regExpImpl0.action(context0, nativeRegExp0, (Scriptable) null, objectArray0, 1);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        regExpImpl0.compileRegExp(context0, "language version", "error reporter");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      NativeObject nativeObject0 = new NativeObject();
      context0.initStandardObjects((ScriptableObject) nativeObject0);
      // Undeclared exception!
      try { 
        regExpImpl0.action(context0, nativeObject0, nativeObject0, context0.emptyArgs, 11);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      Context context0 = Context.enter();
      Object[] objectArray0 = new Object[1];
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array((NativeArrayBuffer) null, 17, 1992);
      context0.initSafeStandardObjects((ScriptableObject) nativeInt32Array0, false);
      objectArray0[0] = (Object) 3;
      Object object0 = regExpImpl0.action(context0, (Scriptable) null, nativeInt32Array0, objectArray0, 2);
      assertEquals("[object Intundefined2Array]", object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      Object[] objectArray0 = new Object[7];
      // Undeclared exception!
      try { 
        regExpImpl0.action(context0, scriptableObject0, scriptableObject0, objectArray0, 2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      Context context0 = Context.enter();
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(5);
      Scriptable scriptable0 = context0.initSafeStandardObjects((ScriptableObject) nativeInt16Array0);
      Object object0 = regExpImpl0.action(context0, scriptable0, scriptable0, context0.emptyArgs, 3);
      assertEquals(0, object0);
  }
}
