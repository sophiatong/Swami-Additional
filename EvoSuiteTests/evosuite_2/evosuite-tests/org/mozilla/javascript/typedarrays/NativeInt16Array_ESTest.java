/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 00:55:17 GMT 2018
 */

package org.mozilla.javascript.typedarrays;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeTypedArrayView;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeInt16Array_ESTest extends NativeInt16Array_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      Short short0 = new Short((short)5);
      // Undeclared exception!
      try { 
        nativeInt16Array0.set(735, short0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeInt16Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(527);
      Short short0 = nativeInt16Array0.set(0, (Short) null);
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      Float float0 = new Float(Float.NEGATIVE_INFINITY);
      Object object0 = nativeInt16Array0.js_set(0, float0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      Object object0 = nativeInt16Array0.js_get(214);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      TopLevel topLevel0 = new TopLevel();
      NativeInt16Array.init(context0, topLevel0, false);
      assertEquals(0, Context.VERSION_DEFAULT);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(527);
      UnaryOperator<Short> unaryOperator0 = UnaryOperator.identity();
      nativeInt16Array0.replaceAll(unaryOperator0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      // Undeclared exception!
      try { 
        nativeInt16Array0.get(4);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeInt16Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      NativeTypedArrayView nativeTypedArrayView0 = nativeInt16Array0.construct((NativeArrayBuffer) null, 2124, 2124);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeInt16Array0, (Object) null, 0, 2124);
      NativeTypedArrayView nativeTypedArrayView1 = nativeInt16Array0.realThis(nativeTypedArrayView0, idFunctionObject0);
      assertEquals(2124, nativeTypedArrayView1.getByteOffset());
      assertEquals(2124, nativeTypedArrayView1.size());
  }
}