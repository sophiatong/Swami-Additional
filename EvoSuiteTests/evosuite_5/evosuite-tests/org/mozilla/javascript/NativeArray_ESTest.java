/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 15:32:04 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.FunctionObject;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeCall;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.NativeJavaTopPackage;
import org.mozilla.javascript.NativeMath;
import org.mozilla.javascript.NativeString;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.UniqueTag;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeUint32Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArray.StringLikeComparator nativeArray_StringLikeComparator0 = new NativeArray.StringLikeComparator();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeArray.ElementComparator nativeArray_ElementComparator0 = new NativeArray.ElementComparator();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(1897);
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeArrayBuffer0, (-1073741823));
      int int0 = nativeArray_ElementComparator0.compare(nativeArrayBuffer0, object0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray.ElementComparator nativeArray_ElementComparator0 = new NativeArray.ElementComparator();
      UniqueTag uniqueTag0 = (UniqueTag)Scriptable.NOT_FOUND;
      int int0 = nativeArray_ElementComparator0.compare(uniqueTag0, (Object) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comparator<Object> comparator0 = Comparator.nullsLast((Comparator<? super Object>) null);
      NativeArray.ElementComparator nativeArray_ElementComparator0 = new NativeArray.ElementComparator(comparator0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeArray.ElementComparator nativeArray_ElementComparator0 = new NativeArray.ElementComparator();
      // Undeclared exception!
      try { 
        nativeArray0.sort(nativeArray_ElementComparator0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Predicate<FunctionObject> predicate0 = Predicate.isEqual((Object) "7GSx-O:x Y+Rt_H");
      Predicate<FunctionObject> predicate1 = predicate0.negate();
      // Undeclared exception!
      try { 
        nativeArray0.removeIf(predicate1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getCurrentContext();
      nativeArray0.defineOwnProperty(context0, (Object) "7GSx-O:x Y+Rt_H", (ScriptableObject) nativeArray0, false);
      assertEquals(5L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      Object[] objectArray0 = nativeArray0.toArray();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.subList(0, 0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2L);
      int int0 = nativeArray0.size();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(160);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1L));
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeArray0.setInstanceIdValue(1, nativeIterator_StopIteration0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      // Undeclared exception!
      try { 
        nativeArray0.setInstanceIdValue(12, nativeArrayBuffer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 12
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4096L);
      nativeArray0.setInstanceIdAttributes(1, (-578));
      assertEquals(4096L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-198L));
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeArray0, nativeArray0, 170, "]Amns-*K{", 0, nativeArray0);
      nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) idFunctionObjectES6_0, true);
      // Undeclared exception!
      try { 
        nativeArray0.setDenseOnly(true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-505L));
      nativeArray0.setDenseOnly(true);
      assertEquals((-505L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1809L));
      Short short0 = new Short((short) (-9216));
      // Undeclared exception!
      try { 
        nativeArray0.set(0, short0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(134L);
      // Undeclared exception!
      try { 
        nativeArray0.retainAll(nativeArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(nativeArrayBuffer0, 2, 2);
      // Undeclared exception!
      try { 
        nativeArray0.removeAll(nativeUint8Array0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-4332462841530417152L));
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      // Undeclared exception!
      try { 
        nativeArray0.remove((Object) nativeJavaTopPackage0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      // Undeclared exception!
      try { 
        nativeArray0.remove(1988);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1122L));
      // Undeclared exception!
      try { 
        ScriptableObject.defineProperty((Scriptable) nativeArray0, ".\"X(+", (Object) nativeArray0, 94);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 94
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4080L);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeIterator_StopIteration0);
      nativeIterator_StopIteration0.put(739, (Scriptable) nativeArray0, (Object) nativeWith0);
      assertEquals(4080L, nativeArray0.jsGet_length());
      assertEquals(4080L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10);
      NativeString nativeString0 = new NativeString("language version");
      nativeArray0.put(130, (Scriptable) nativeArray0, (Object) nativeString0);
      assertEquals(131L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1264L));
      // Undeclared exception!
      try { 
        nativeArray0.listIterator();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      // Undeclared exception!
      try { 
        nativeArray0.listIterator(8);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeArray.ElementComparator nativeArray_ElementComparator0 = new NativeArray.ElementComparator();
      Object[] objectArray0 = new Object[4];
      objectArray0[1] = (Object) nativeArray_ElementComparator0;
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.lastIndexOf(objectArray0[1]);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeArray.ElementComparator nativeArray_ElementComparator0 = new NativeArray.ElementComparator();
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.lastIndexOf(nativeArray_ElementComparator0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10);
      int int0 = nativeArray0.lastIndexOf((Object) null);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      long long0 = nativeArray0.jsGet_length();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      NativeString nativeString0 = new NativeString("language version");
      Object[] objectArray0 = context0.getElements(nativeString0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(18, nativeString0, true);
      NativeArray nativeArray1 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, (Scriptable) null, nativeString0, objectArray0);
      assertEquals("Array", nativeArray1.getClassName());
      assertEquals(10L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10);
      boolean boolean0 = nativeArray0.isEmpty();
      assertEquals(10L, nativeArray0.getLength());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId((-300));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -300
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NativeArray.ElementComparator nativeArray_ElementComparator0 = new NativeArray.ElementComparator();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) nativeArray_ElementComparator0;
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.indexOf(objectArray0[0]);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4078L);
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      boolean boolean0 = nativeArray0.has(1976, (Scriptable) importerTopLevel0);
      assertFalse(boolean0);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeJavaMethod nativeJavaMethod0 = new NativeJavaMethod((MemberBox[]) null, "encodeURIComponent");
      boolean boolean0 = nativeArray0.has((-1073741823), (Scriptable) nativeJavaMethod0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, objectArray0[0]);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = NativeArray.getMaximumInitialCapacity();
      assertEquals(10000, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext((Context) null);
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      long long0 = NativeArray.getLengthProperty(context0, nativeUint8Array0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      NativeCall nativeCall0 = new NativeCall();
      long long0 = NativeArray.getLengthProperty(context0, nativeCall0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      long long0 = NativeArray.getLengthProperty(context0, nativeArray0);
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object object0 = nativeArray0.getInstanceIdValue(1);
      assertEquals(4.0, object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-5454L));
      // Undeclared exception!
      try { 
        nativeArray0.getInstanceIdValue((-9));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -9
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-7L));
      // Undeclared exception!
      try { 
        nativeArray0.getInstanceIdName(1988);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1988
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4096L);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      Object[] objectArray0 = nativeArray0.toArray((Object[]) integerArray0);
      assertNotSame(integerArray0, objectArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(2, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4078L);
      Class<NativeMath> class0 = NativeMath.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Invalid JavaScript value of type class org.mozilla.javascript.NativeMath
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.getAttributes(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-11L));
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Property 0 not found.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.get(4093L);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10);
      NativeString nativeString0 = new NativeString("language version");
      nativeArray0.get(154, (Scriptable) nativeString0);
      assertEquals(10L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-698L));
      SymbolKey symbolKey0 = SymbolKey.ITERATOR;
      int int0 = nativeArray0.findPrototypeId(symbolKey0);
      assertEquals((-698L), nativeArray0.getLength());
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      int int0 = nativeArray0.findPrototypeId((Symbol) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.findPrototypeId("error reporter");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.findPrototypeId("reduceRight");
      assertEquals(25, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      nativeArray0.findPrototypeId("DaZS.oFog");
      assertEquals(1L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1882L);
      int int0 = nativeArray0.findPrototypeId("Function");
      assertEquals(1882L, nativeArray0.jsGet_length());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2L);
      int int0 = nativeArray0.findPrototypeId("length");
      assertEquals(2L, nativeArray0.jsGet_length());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10);
      nativeArray0.findPrototypeId("repeat");
      assertEquals(10L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(112L);
      int int0 = nativeArray0.findPrototypeId("b\"b:");
      assertEquals(112L, nativeArray0.getLength());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10);
      int int0 = nativeArray0.findPrototypeId("join");
      assertEquals(5, int0);
      assertEquals(10L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.findPrototypeId("=> ");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      Object[] objectArray0 = ScriptableObject.getPropertyIds(nativeArray0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(77L);
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeUint32Array0, nativeUint32Array0, 2485, 4);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, importerTopLevel0, (Object[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=2485 MASTER=org.mozilla.javascript.typedarrays.NativeUint32Array@0
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.delete(1088);
      assertEquals(2L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4957L);
      nativeArray0.delete(0);
      assertEquals(4957L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(134L);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) nativeArray0;
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.containsAll(nativeArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2L);
      assertEquals(2L, nativeArray0.jsGet_length());
      
      boolean boolean0 = nativeArray0.containsAll(nativeArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4096L);
      // Undeclared exception!
      try { 
        nativeArray0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2470L);
      LinkedHashSet<NativeString> linkedHashSet0 = new LinkedHashSet<NativeString>(1791);
      // Undeclared exception!
      try { 
        nativeArray0.addAll((Collection) linkedHashSet0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      TreeSet<NativeJavaMethod> treeSet0 = new TreeSet<NativeJavaMethod>();
      // Undeclared exception!
      try { 
        nativeArray0.addAll(13, (Collection) treeSet0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      // Undeclared exception!
      try { 
        nativeArray0.add((Object) nativeArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeArray0, nativeArray0, (-65), "aS/|Sm", 13, nativeArray0);
      // Undeclared exception!
      try { 
        nativeArray0.add((-7), (Object) idFunctionObjectES6_0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Double double0 = new Double(1);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, double0);
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-471L));
      nativeArray0.findPrototypeId("done");
      assertEquals((-471L), nativeArray0.jsGet_length());
  }
}
