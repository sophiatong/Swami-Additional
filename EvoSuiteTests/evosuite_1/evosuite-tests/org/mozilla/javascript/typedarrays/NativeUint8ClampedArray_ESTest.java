/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 00:03:31 GMT 2018
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
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeTypedArrayView;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeUint8ClampedArray_ESTest extends NativeUint8ClampedArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray(614);
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Number;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      // Undeclared exception!
      try { 
        nativeUint8ClampedArray0.realThis(baseFunction0, (IdFunctionObject) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeTypedArrayView nativeTypedArrayView0 = nativeUint8ClampedArray0.construct(nativeArrayBuffer0, 1, 5);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeUint8ClampedArray0, nativeArrayBuffer0, 2, "n%sFQU~34", 13, nativeArrayBuffer0);
      NativeTypedArrayView nativeTypedArrayView1 = nativeUint8ClampedArray0.realThis(nativeTypedArrayView0, idFunctionObjectES6_0);
      assertEquals(1, nativeTypedArrayView1.getByteOffset());
      assertEquals(5, nativeTypedArrayView1.getByteLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray(523);
      Integer integer0 = nativeUint8ClampedArray0.set(214, (Integer) 4);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      Object object0 = nativeUint8ClampedArray0.js_set(1985, "/ubV");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      Object object0 = nativeUint8ClampedArray0.getArrayElement(5);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      // Undeclared exception!
      try { 
        nativeUint8ClampedArray0.get(2644);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeUint8ClampedArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray(2894);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      nativeUint8ClampedArray0.forEach(consumer0);
      assertFalse(nativeUint8ClampedArray0.isSealed());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initSafeStandardObjects((ScriptableObject) null, true);
      NativeUint8ClampedArray.init(context0, scriptableObject0, true);
      assertFalse(context0.generateObserverCount);
  }
}
