/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 01:02:32 GMT 2018
 */

package org.mozilla.javascript.typedarrays;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.typedarrays.NativeTypedArrayView;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeFloat64Array_ESTest extends NativeFloat64Array_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array();
      // Undeclared exception!
      try { 
        nativeFloat64Array0.set((-355), (Double) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeFloat64Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeFloat64Array0, nativeFloat64Array0, 0, 431);
      // Undeclared exception!
      try { 
        nativeFloat64Array0.realThis((Scriptable) null, idFunctionObject0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(0);
      Object object0 = nativeFloat64Array0.js_set((-4389), (Object) null);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(1992);
      Double double0 = new Double(1992);
      Double double1 = nativeFloat64Array0.set(0, double0);
      assertNull(double1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array();
      Class<Object> class0 = Object.class;
      Object object0 = ScriptableObject.getTypedProperty((Scriptable) nativeFloat64Array0, 137, class0);
      assertEquals("undefined", object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(nativeArrayBuffer0, 13, 0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      NativeFloat64Array.init(context0, nativeFloat64Array0, false);
      assertEquals(8, nativeFloat64Array0.getBytesPerElement());
      assertEquals("Float64Array", nativeFloat64Array0.getClassName());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(1992);
      Consumer<Double> consumer0 = (Consumer<Double>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      nativeFloat64Array0.forEach(consumer0);
      assertFalse(nativeFloat64Array0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(0);
      // Undeclared exception!
      try { 
        nativeFloat64Array0.get(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeFloat64Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeTypedArrayView nativeTypedArrayView0 = nativeFloat64Array0.construct(nativeArrayBuffer0, 8, 1819);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeTypedArrayView0, "undefined", 13, "", 2052, nativeFloat64Array0);
      NativeTypedArrayView nativeTypedArrayView1 = nativeFloat64Array0.realThis(nativeTypedArrayView0, idFunctionObjectES6_0);
      assertEquals(8, nativeTypedArrayView1.getByteOffset());
      assertEquals(1819, nativeTypedArrayView1.size());
  }
}
