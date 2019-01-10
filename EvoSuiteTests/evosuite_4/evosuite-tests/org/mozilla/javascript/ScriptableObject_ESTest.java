/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 02:24:03 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.ExternalArrayData;
import org.mozilla.javascript.IdFunctionCall;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.InterpretedFunction;
import org.mozilla.javascript.LazilyLoadedCtor;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.NativeCall;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.NativeGenerator;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.NativeJavaClass;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.NativeJavaTopPackage;
import org.mozilla.javascript.NativeMath;
import org.mozilla.javascript.NativeNumber;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.NativeScript;
import org.mozilla.javascript.NativeString;
import org.mozilla.javascript.NativeStringIterator;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Synchronizer;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeInt8Array;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.typedarrays.NativeUint32Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ScriptableObject_ESTest extends ScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ScriptableObject.GetterSlot scriptableObject_GetterSlot0 = new ScriptableObject.GetterSlot((Object) null, (-1881161550), (-1881161550));
      StringBuilder stringBuilder0 = new StringBuilder();
      NativeString nativeString0 = new NativeString(stringBuilder0);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      scriptableObject_GetterSlot0.setValue(nativeJavaTopPackage0, nativeString0, nativeJavaTopPackage0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeBoolean0, (String) null, "FM*Mab^8hX2gZ=", true, true);
      nativeBoolean0.addLazilyInitializedValue("FM*Mab^8hX2gZ=", 0, lazilyLoadedCtor0, 0);
      Object[] objectArray0 = nativeBoolean0.getAllIds();
      assertEquals(2, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeBoolean0, "FM*Mab^8hX2gZ=", "FM*Mab^8hX2gZ=", true, true);
      nativeBoolean0.addLazilyInitializedValue("FM*Mab^8hX2gZ=", 0, lazilyLoadedCtor0, 0);
      Object[] objectArray0 = nativeBoolean0.getAllIds();
      //  // Unstable assertion: assertEquals(2, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ScriptableObject.KeyComparator scriptableObject_KeyComparator0 = new ScriptableObject.KeyComparator();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ScriptableObject.GetterSlot scriptableObject_GetterSlot0 = new ScriptableObject.GetterSlot((Object) null, (-1881161550), (-1881161550));
      Short short0 = new Short((short) (-31072));
      scriptableObject_GetterSlot0.setter = (Object) short0;
      Context context0 = Context.enter();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(nativeArrayBuffer0, 1528, 468);
      ScriptableObject scriptableObject0 = scriptableObject_GetterSlot0.getPropertyDescriptor(context0, nativeUint8Array0);
      assertFalse(scriptableObject0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      int int0 = nativeBoolean0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      // Undeclared exception!
      try { 
        nativeBoolean0.setGetterOrSetter("", 1034, (Callable) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      nativeJavaTopPackage0.setExternalArrayData((ExternalArrayData) null);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array();
      nativeUint32Array0.setAttributes(0, (Scriptable) null, 0);
      assertTrue(nativeUint32Array0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeNumber nativeNumber0 = new NativeNumber(1198.553449035);
      boolean boolean0 = nativeNumber0.sameValue(nativeContinuation0, nativeContinuation0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      Short short0 = new Short((short) (-84));
      nativeJavaTopPackage0.putConst("ENUM_ID", nativeBoolean0, short0);
      assertTrue(nativeBoolean0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber((-422.79752293091));
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      // Undeclared exception!
      try { 
        nativeNumber0.putConst((String) null, (Scriptable) null, context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeArray0, "");
      ScriptableObject.putConstProperty(nativeArray0, "l&N", object0);
      assertFalse(nativeArray0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      SymbolKey symbolKey0 = SymbolKey.TO_STRING_TAG;
      StringBuilder stringBuilder0 = new StringBuilder("org/mozilla/javascript/optimizer/OptRuntime");
      NativeString nativeString0 = new NativeString(stringBuilder0);
      nativeIterator_StopIteration0.put((Symbol) symbolKey0, (Scriptable) nativeArray0, (Object) nativeString0);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(nativeArrayBuffer0, 0, 13);
      nativeIterator_StopIteration0.put("Hm~&$@)=;5gF6", (Scriptable) nativeInt16Array0, (Object) nativeInt16Array0);
      assertEquals(0, nativeInt16Array0.getByteOffset());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      nativeIterator_StopIteration0.put(2701, (Scriptable) nativeArrayBuffer0, (Object) "Hm~&$@)=;5gF6");
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeContinuation0.preventExtensions();
      assertFalse(nativeContinuation0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 13, (Object) null);
      nativeArray0.get(10000, (Scriptable) nativeContinuation0);
      assertEquals(14L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      // Undeclared exception!
      try { 
        topLevel0.isGenericDescriptor((ScriptableObject) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber((-422.79752293091));
      boolean boolean0 = nativeNumber0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      SymbolKey symbolKey0 = SymbolKey.HAS_INSTANCE;
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) nativeUint8ClampedArray0, (Symbol) symbolKey0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(nativeArrayBuffer0, 8, 8);
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) nativeInt8Array0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(0);
      TopLevel topLevel0 = new TopLevel();
      boolean boolean0 = nativeUint8Array0.hasInstance(topLevel0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      Class<Byte> class0 = Byte.class;
      Byte byte0 = ScriptableObject.getTypedProperty((Scriptable) nativeBoolean0, "ArrayBuffer", class0);
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      Class<Object> class0 = Object.class;
      Object object0 = ScriptableObject.getTypedProperty((Scriptable) nativeArrayBuffer0, (-1034), class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(18);
      Class<NativeScript> class0 = NativeScript.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getTypedProperty((Scriptable) nativeInt16Array0, 45, class0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot convert undefined to org.mozilla.javascript.NativeScript
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      Context context0 = Context.getCurrentContext();
      ScriptableObject scriptableObject0 = nativeBoolean0.getOwnPropertyDescriptor(context0, context0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      ScriptableObject.defineConstProperty(nativeBoolean0, "done");
      nativeBoolean0.defineProperty("getTypeOf", (Object) "getTypeOf", 2);
      Object[] objectArray0 = nativeBoolean0.getIds();
      assertEquals(1, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object object0 = nativeContinuation0.getGetterOrSetter((String) null, (-982), true);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      // Undeclared exception!
      try { 
        nativeBoolean0.getGetterOrSetter("hasInstance", (-2), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // hasInstance
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      Object object0 = nativeUint16Array0.getExternalArrayLength();
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ExternalArrayData externalArrayData0 = nativeObject0.getExternalArrayData();
      assertNull(externalArrayData0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      // Undeclared exception!
      try { 
        nativeCall0.getDefaultValue((Class<?>) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber((-422.79752293091));
      NativeError nativeError0 = new NativeError();
      NativeStringIterator nativeStringIterator0 = null;
      try {
        nativeStringIterator0 = new NativeStringIterator(nativeNumber0, nativeError0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      // Undeclared exception!
      try { 
        NativeNumber.isFinite(nativeBoolean0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(2559);
      SymbolKey symbolKey0 = new SymbolKey("*");
      ScriptableObject.putProperty((Scriptable) nativeUint16Array0, (Symbol) symbolKey0, (Object) nativeUint16Array0);
      assertFalse(nativeUint16Array0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject.redefineProperty(nativeIterator_StopIteration0, "error reporter", true);
      assertEquals("StopIteration", nativeIterator_StopIteration0.getClassName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(topLevel0, topLevel0, 3, 2);
      // Undeclared exception!
      try { 
        topLevel0.getAttributes((-3), (Scriptable) idFunctionObject0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Property -3 not found.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      Scriptable scriptable0 = ScriptableObject.getArrayPrototype(nativeBoolean0);
      assertNull(scriptable0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      Object[] objectArray0 = nativeBoolean0.getAllIds();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Double double0 = new Double(0.0);
      BiFunction<BaseFunction, Byte, InterpretedFunction> biFunction0 = (BiFunction<BaseFunction, Byte, InterpretedFunction>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any(org.mozilla.javascript.BaseFunction.class) , any(java.lang.Byte.class));
      Object object0 = nativeIterator_StopIteration0.compute(double0, biFunction0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber((-422.79752293091));
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeNumber0, nativeNumber0, 777, "3-U'UbLUpZ*]P", 777, nativeNumber0);
      Object object0 = nativeNumber0.get((Object) idFunctionObjectES6_0);
      assertFalse(idFunctionObjectES6_0.isSealed());
      assertTrue(idFunctionObjectES6_0.isExtensible());
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      SymbolKey symbolKey0 = SymbolKey.TO_PRIMITIVE;
      // Undeclared exception!
      try { 
        nativeJavaTopPackage0.getAttributes((Symbol) symbolKey0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Property Symbol(Symbol.toPrimitive) not found.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(nativeArrayBuffer0, 101, 13);
      SymbolKey symbolKey0 = SymbolKey.IS_REGEXP;
      NativeWith nativeWith0 = new NativeWith(nativeArrayBuffer0, nativeArrayBuffer0);
      // Undeclared exception!
      try { 
        nativeUint16Array0.put((Symbol) symbolKey0, (Scriptable) null, (Object) nativeWith0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Object object does not support Symbol keys
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      SymbolKey symbolKey0 = SymbolKey.HAS_INSTANCE;
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeArrayBuffer0, (Symbol) symbolKey0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      ScriptableObject scriptableObject0 = ScriptableObject.ensureScriptableObject(nativeJavaTopPackage0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeContinuation nativeContinuation1 = (NativeContinuation)ScriptableObject.ensureScriptable(nativeContinuation0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptable(contextFactory0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Invalid JavaScript value of type org.mozilla.javascript.ContextFactory
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber((-422.79752293091));
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeNumber0, 135);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(1279);
      SymbolKey symbolKey0 = new SymbolKey("b>W9$GN'MNcK~?");
      nativeInt32Array0.delete((Symbol) symbolKey0);
      assertFalse(nativeInt32Array0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object object0 = nativeIterator_StopIteration0.remove((Object) "l&N");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      SymbolKey symbolKey0 = SymbolKey.MATCH;
      nativeBoolean0.defineProperty((Symbol) symbolKey0, (Object) symbolKey0, 5);
      assertFalse(nativeBoolean0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray((NativeArrayBuffer) null, 0, 12);
      Synchronizer synchronizer0 = new Synchronizer(nativeUint8ClampedArray0);
      // Undeclared exception!
      try { 
        ScriptableObject.defineProperty((Scriptable) null, "{^", (Object) synchronizer0, 1431655764);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(173);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeUint16Array0, true);
      Class<InterpretedFunction> class0 = InterpretedFunction.class;
      nativeGenerator0.defineProperty("cd6m@!z~.c #'Q2MFhA", class0, 4);
      assertTrue(nativeGenerator0.isSealed());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(nativeArrayBuffer0, 0, 7);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      // Undeclared exception!
      try { 
        nativeFloat64Array0.defineOwnProperties(context0, nativeArrayBuffer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Expected argument of type object, but instead had type number
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      Context context0 = Context.enter();
      nativeCall0.defineOwnProperties(context0, nativeCall0);
      assertTrue(nativeCall0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage((ClassLoader) null);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "3-UPUbL1UpZ*]P";
      Class<NativeScript> class0 = NativeScript.class;
      // Undeclared exception!
      try { 
        nativeJavaTopPackage0.defineFunctionProperties(stringArray0, class0, 4);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Method \"3-UPUbL1UpZ*]P\" not found in \"org.mozilla.javascript.NativeScript\".
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      ScriptableObject.GetterSlot scriptableObject_GetterSlot0 = new ScriptableObject.GetterSlot(nativeArrayBuffer0, 4, 4);
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = scriptableObject_GetterSlot0.getPropertyDescriptor(context0, nativeArrayBuffer0);
      nativeArrayBuffer0.defineConst("msg.var.redecl", scriptableObject0);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      Class<BaseFunction> class0 = BaseFunction.class;
      ScriptableObject.defineClass((Scriptable) nativeArrayBuffer0, class0, false);
      assertFalse(nativeArrayBuffer0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      Class<BaseFunction> class0 = BaseFunction.class;
      ScriptableObject.defineClass((Scriptable) nativeBoolean0, class0);
      assertFalse(nativeBoolean0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeBoolean0, nativeBoolean0);
      nativeBoolean0.checkPropertyChange(nativeArrayIterator0, nativeArrayIterator0, nativeArrayIterator0);
      assertFalse(nativeArrayIterator0.isSealed());
      assertFalse(nativeBoolean0.isSealed());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      nativeArrayBuffer0.defineOwnProperty(context0, "ArrayBuffer", nativeUint16Array0);
      assertFalse(nativeUint16Array0.isSealed());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber((-422.79752293091));
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) nativeNumber0, "number", context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: java.lang.String@0000000006 is not a function, it is object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeBoolean0, nativeBoolean0);
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeArrayIterator0, nativeArrayIterator0, 1);
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(nativeArrayBuffer0, 3404, 13);
      Class<NativeJavaClass> class0 = NativeJavaClass.class;
      // Undeclared exception!
      try { 
        ScriptableObject.defineClass((Scriptable) nativeFloat64Array0, class0, true, true);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Can't define constructor or class org.mozilla.javascript.NativeJavaObject since more than one constructor has multiple parameters.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      Class<NativeMath> class0 = NativeMath.class;
      // Undeclared exception!
      try { 
        ScriptableObject.defineClass((Scriptable) nativeArrayBuffer0, class0, false);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot load class \"org.mozilla.javascript.NativeMath\" which has no zero-parameter constructor.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(importerTopLevel0, "", "u<}sf1Td", true, true);
      // Undeclared exception!
      try { 
        importerTopLevel0.addLazilyInitializedValue("u<}sf1Td", (-10), lazilyLoadedCtor0, 1879);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // u<}sf1Td
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      IdFunctionObject idFunctionObject0 = null;
      try {
        idFunctionObject0 = new IdFunctionObject((IdFunctionCall) null, (Object) null, (-1009), "{QM~*tx", (-1009), (Scriptable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Class<BaseFunction> class0 = BaseFunction.class;
      BaseFunction baseFunction1 = ScriptableObject.buildClassCtor((Scriptable) baseFunction0, class0, true, true);
      Class<NativeJavaObject> class1 = NativeJavaObject.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) baseFunction1, (Class<?>) class1);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Invalid JavaScript value of type class org.mozilla.javascript.NativeJavaObject
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }
}
