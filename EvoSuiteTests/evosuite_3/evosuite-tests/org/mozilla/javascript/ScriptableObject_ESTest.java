/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 02:23:21 GMT 2018
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
import org.mozilla.javascript.ArrowFunction;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.ExternalArrayData;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.JavaMembers;
import org.mozilla.javascript.LazilyLoadedCtor;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.NativeGenerator;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.NativeJavaClass;
import org.mozilla.javascript.NativeJavaConstructor;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.NativeJavaPackage;
import org.mozilla.javascript.NativeJavaTopPackage;
import org.mozilla.javascript.NativeNumber;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.NativeString;
import org.mozilla.javascript.NativeStringIterator;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Synchronizer;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeInt8Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScriptableObject_ESTest extends ScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ScriptableObject.KeyComparator scriptableObject_KeyComparator0 = new ScriptableObject.KeyComparator();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject.GetterSlot scriptableObject_GetterSlot0 = new ScriptableObject.GetterSlot((Object) null, 5, 800);
      ScriptableObject scriptableObject0 = scriptableObject_GetterSlot0.getPropertyDescriptor(context0, nativeIterator_StopIteration0);
      assertTrue(scriptableObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      int int0 = nativeBoolean0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber(1.0);
      nativeNumber0.setGetterOrSetter((String) null, 115, (Callable) null, true);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeContinuation0, nativeContinuation0);
      nativeArrayIterator0.setGetterOrSetter("removeAll", 0, nativeContinuation0, false);
      assertTrue(nativeContinuation0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(8);
      nativeArray0.setAttributes(0, 2);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.setAttributes(10, (Scriptable) null, 90);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 90
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      importerTopLevel0.sealObject();
      assertTrue(importerTopLevel0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeBoolean0, true);
      boolean boolean0 = nativeBoolean0.sameValue(nativeGenerator0, nativeGenerator0);
      assertTrue(nativeGenerator0.isSealed());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject.redefineProperty(nativeIterator_StopIteration0, "_jH3C^gCB", true);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        nativeArrayBuffer0.putConst("^[k4oEW", nativeJavaClass0, context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(nativeArrayBuffer0, 0, (-460));
      importerTopLevel0.putConst("^z2@Sm_", nativeInt8Array0, nativeInt8Array0);
      assertEquals("object", nativeInt8Array0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      SymbolKey symbolKey0 = SymbolKey.MATCH;
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      nativeIterator_StopIteration0.put((Symbol) symbolKey0, (Scriptable) nativeObject0, (Object) importerTopLevel0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Double double0 = new Double(0.0);
      ScriptableObject.putProperty((Scriptable) nativeObject0, 2, (Object) double0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber((-1971.84392638));
      boolean boolean0 = nativeNumber0.isGetterOrSetter("?^uq[\"CO24\"'lwP2`lZ", 2175, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(8);
      Class<NativeArray> class0 = NativeArray.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeUint8Array0, class0, true);
      NativeJavaMethod nativeJavaMethod0 = javaMembers0.ctors;
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) nativeJavaMethod0, 2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<Object> class0 = Object.class;
      Object object0 = ScriptableObject.getTypedProperty((Scriptable) nativeObject0, "language version", class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = ScriptableObject.getPropertyIds((Scriptable) null);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      SymbolKey symbolKey0 = SymbolKey.HAS_INSTANCE;
      Object object0 = ScriptableObject.getProperty((Scriptable) importerTopLevel0, (Symbol) symbolKey0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.NativeErrors topLevel_NativeErrors0 = TopLevel.NativeErrors.EvalError;
      BaseFunction baseFunction0 = importerTopLevel0.getNativeErrorCtor(topLevel_NativeErrors0);
      Object[] objectArray0 = ScriptableObject.getPropertyIds(baseFunction0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(801);
      // Undeclared exception!
      try { 
        nativeArrayBuffer0.getGetterOrSetter("ArrayBuffer", 1, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ArrayBuffer
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(387);
      Object object0 = nativeInt8Array0.getGetterOrSetter("", 0, true);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Object object0 = nativeError0.getExternalArrayLength();
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ExternalArrayData externalArrayData0 = nativeContinuation0.getExternalArrayData();
      assertNull(externalArrayData0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      Class<NativeBoolean> class0 = NativeBoolean.class;
      // Undeclared exception!
      try { 
        nativeBoolean0.getDefaultValue(class0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Invalid JavaScript value of type class org.mozilla.javascript.NativeBoolean
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = Context.enter();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.NativeErrors topLevel_NativeErrors0 = TopLevel.NativeErrors.EvalError;
      BaseFunction baseFunction0 = importerTopLevel0.getNativeErrorCtor(topLevel_NativeErrors0);
      Object[] objectArray0 = new Object[5];
      objectArray0[2] = (Object) importerTopLevel0;
      NativeError nativeError0 = (NativeError)contextFactory0.doTopCall(baseFunction0, context0, (Scriptable) null, nativeArrayBuffer0, objectArray0);
      assertFalse(nativeError0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      NativeStringIterator nativeStringIterator0 = null;
      try {
        nativeStringIterator0 = new NativeStringIterator(nativeUint8ClampedArray0, nativeUint8ClampedArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1L));
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(433, (Scriptable) nativeArray0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Property 433 not found.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      Scriptable scriptable0 = ScriptableObject.getArrayPrototype(nativeArrayBuffer0);
      assertNull(scriptable0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      Object[] objectArray0 = nativeArrayBuffer0.getAllIds();
      assertEquals(1, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object object0 = nativeIterator_StopIteration0.remove((Object) nativeIterator_StopIteration0.READONLY);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      SymbolKey symbolKey0 = SymbolKey.SPECIES;
      Object object0 = nativeBoolean0.get((Object) symbolKey0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NativeString nativeString0 = new NativeString("");
      Object object0 = nativeString0.get((Object) "");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      BiFunction<Short, IdFunctionObject, ArrowFunction> biFunction0 = (BiFunction<Short, IdFunctionObject, ArrowFunction>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      Object object0 = nativeIterator_StopIteration0.computeIfPresent(nativeObject0, biFunction0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      SymbolKey symbolKey0 = SymbolKey.SEARCH;
      // Undeclared exception!
      try { 
        importerTopLevel0.getAttributes((Symbol) symbolKey0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Property Symbol(Symbol.search) not found.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.ensureSymbolScriptable((Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Object object does not support Symbol keys
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeInt8Array0, importerTopLevel0);
      SymbolKey symbolKey0 = SymbolKey.TO_STRING_TAG;
      ScriptableObject.putProperty((Scriptable) nativeInt8Array0, (Symbol) symbolKey0, (Object) nativeArrayIterator0);
      assertEquals("Int8Array", nativeInt8Array0.getClassName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(nativeArrayBuffer0, (-2043), (-2880));
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      // Undeclared exception!
      try { 
        nativeInt8Array0.defineOwnProperties(context0, nativeArrayBuffer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Expected argument of type object, but instead had type number
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptable((Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Expected argument of type object, but instead had type object
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(8);
      Class<NativeArray> class0 = NativeArray.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeUint8Array0, class0, true);
      NativeJavaMethod nativeJavaMethod0 = javaMembers0.ctors;
      Scriptable scriptable0 = ScriptableObject.ensureScriptable(nativeJavaMethod0);
      assertSame(nativeJavaMethod0, scriptable0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2011L);
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeArray0, "(new Boolean(false))");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeError0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      SymbolKey symbolKey0 = SymbolKey.TO_PRIMITIVE;
      nativeError0.delete((Symbol) symbolKey0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(11);
      nativeArrayBuffer0.delete("2ML");
      assertFalse(nativeArrayBuffer0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      nativeError0.defaultPut((String) null, (Object) null);
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeError0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber((-1971.84392638));
      SymbolKey symbolKey0 = SymbolKey.MATCH;
      nativeNumber0.defineProperty((Symbol) symbolKey0, (Object) null, 1);
      assertTrue(nativeNumber0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(47);
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(nativeArrayBuffer0, 2, 67);
      importerTopLevel0.setExternalArrayData(nativeFloat32Array0);
      Object object0 = ScriptableObject.getProperty((Scriptable) importerTopLevel0, 1);
      assertEquals(0.0F, object0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Class<ArrowFunction> class0 = ArrowFunction.class;
      nativeArray0.defineProperty("C `}`dUN_A`wBeK; ", class0, 13);
      assertEquals("object", nativeArray0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage(true, ")U8_uV:T'u;8SAWf)s", (ClassLoader) null);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      Class<NativeJavaTopPackage> class0 = NativeJavaTopPackage.class;
      // Undeclared exception!
      try { 
        nativeJavaPackage0.defineFunctionProperties(stringArray0, class0, 13);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Method \"\" not found in \"org.mozilla.javascript.NativeJavaTopPackage\".
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      String[] stringArray0 = new String[0];
      Class<NativeArrayIterator> class0 = NativeArrayIterator.class;
      importerTopLevel0.defineFunctionProperties(stringArray0, class0, 758);
      assertEquals("JavaImporter", importerTopLevel0.getClassName());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Synchronizer synchronizer0 = new Synchronizer((Scriptable) null);
      // Undeclared exception!
      try { 
        ScriptableObject.defineConstProperty(synchronizer0, "\"PiBG!}3");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Delegator", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      nativeError0.defineConst("Error", nativeBoolean0);
      assertFalse(nativeBoolean0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray(nativeArrayBuffer0, (-2358), 475);
      importerTopLevel0.defineOwnProperty((Context) null, (Object) null, nativeUint8ClampedArray0);
      assertFalse(importerTopLevel0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.checkPropertyChange(nativeObject0, nativeObject0, nativeObject0);
      assertFalse(nativeArray0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      nativeJavaTopPackage0.sealObject();
      NativeArray nativeArray0 = new NativeArray(13);
      // Undeclared exception!
      try { 
        nativeJavaTopPackage0.forcePackage("", nativeArray0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot modify a property of a sealed object: java.lang.String@0000000012.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) null, "v2$h<?hc@", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) nativeObject0, ")?~b~15dco,YuG<,[s", context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: java.lang.String@0000000006 is not a function, it is object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(importerTopLevel0, context0, 0);
      assertTrue(scriptableObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber(706.36);
      Class<NativeJavaObject> class0 = NativeJavaObject.class;
      // Undeclared exception!
      try { 
        ScriptableObject.defineClass((Scriptable) nativeNumber0, class0);
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
  public void test59()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Class<NativeJavaConstructor> class0 = NativeJavaConstructor.class;
      // Undeclared exception!
      try { 
        ScriptableObject.defineClass((Scriptable) importerTopLevel0, class0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot load class \"org.mozilla.javascript.NativeJavaConstructor\" which has no zero-parameter constructor.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Class<BaseFunction> class0 = BaseFunction.class;
      String string0 = ScriptableObject.defineClass((Scriptable) importerTopLevel0, class0, true, true);
      assertEquals("Function", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ArrowFunction arrowFunction0 = null;
      try {
        arrowFunction0 = new ArrowFunction((Context) null, nativeContinuation0, nativeContinuation0, nativeContinuation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeIterator_StopIteration0, "error reporter", "language version", false, false);
      // Undeclared exception!
      try { 
        nativeObject0.addLazilyInitializedValue("IF`p_", (-466), lazilyLoadedCtor0, 12271);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // IF`p_
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      BaseFunction baseFunction0 = null;
      try {
        baseFunction0 = new BaseFunction((Scriptable) null, (Scriptable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initSafeStandardObjects();
      NativeObject nativeObject0 = (NativeObject)context0.initSafeStandardObjects(scriptableObject0);
      assertEquals(4, ScriptableObject.PERMANENT);
  }
}