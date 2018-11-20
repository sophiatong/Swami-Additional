/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 02:15:30 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.NativeGenerator;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.NativeJavaTopPackage;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.NativeScript;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeUint8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeObject_ESTest extends NativeObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeObject.ValueCollection nativeObject_ValueCollection0 = nativeIterator_StopIteration0.new ValueCollection();
      int int0 = nativeObject_ValueCollection0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeObject.KeySet nativeObject_KeySet0 = nativeIterator_StopIteration0.new KeySet();
      int int0 = nativeObject_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeObject.KeySet nativeObject_KeySet0 = nativeObject0.new KeySet();
      boolean boolean0 = nativeObject_KeySet0.contains(nativeObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ScriptableObject.putConstProperty(nativeObject0, "", nativeObject0);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      BiFunction<NativeGenerator, NativeGenerator, NativeJavaTopPackage> biFunction0 = (BiFunction<NativeGenerator, NativeGenerator, NativeJavaTopPackage>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(nativeJavaTopPackage0).when(biFunction0).apply(any(org.mozilla.javascript.NativeGenerator.class) , any(org.mozilla.javascript.NativeGenerator.class));
      // Undeclared exception!
      try { 
        nativeObject0.replaceAll(biFunction0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeObject$EntrySet$1$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeObject.EntrySet nativeObject_EntrySet0 = nativeObject0.new EntrySet();
      int int0 = nativeObject_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeObject.KeySet nativeObject_KeySet0 = nativeObject0.new KeySet();
      NativeArray nativeArray0 = new NativeArray(8);
      Iterator<Object> iterator0 = nativeObject_KeySet0.iterator();
      nativeArray0.put(1, (Scriptable) nativeObject0, (Object) iterator0);
      Predicate<Object> predicate0 = Predicate.isEqual((Object) "~-HFJBS}9qT^wKRk");
      Predicate<Object> predicate1 = predicate0.negate();
      boolean boolean0 = nativeObject_KeySet0.removeIf(predicate1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object object0 = nativeIterator_StopIteration0.remove((Object) "kT[");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.putAll((Map) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeIterator_StopIteration0, nativeIterator_StopIteration0);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.put((Object) nativeArrayIterator0, (Object) nativeArrayIterator0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Set<Object> set0 = nativeObject0.keySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(1);
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeObject.EntrySet nativeObject_EntrySet0 = nativeObject0.new EntrySet();
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeObject0, nativeObject_EntrySet0, 0, "2-B#}1qQ,b@p_2-Qc", 1430, nativeObject0);
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeIterator.StopIteration nativeIterator_StopIteration1 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration1.exportAsJSClass(13, nativeIterator_StopIteration0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeIterator.StopIteration nativeIterator_StopIteration1 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration1.exportAsJSClass(359, nativeIterator_StopIteration0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.exportAsJSClass(55296, (Scriptable) null, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeIterator.StopIteration nativeIterator_StopIteration1 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration1.exportAsJSClass(8, nativeIterator_StopIteration0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      importerTopLevel0.defineConst("DN#-.l0B?ju", nativeIterator_StopIteration0);
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      boolean boolean0 = nativeIterator_StopIteration0.containsValue(nativeBoolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      importerTopLevel0.defineConst("DN#-.l0B?ju", nativeIterator_StopIteration0);
      boolean boolean0 = nativeIterator_StopIteration0.containsValue((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Delegator delegator0 = new Delegator(nativeObject0);
      BiFunction<Integer, NativeScript, Delegator> biFunction0 = (BiFunction<Integer, NativeScript, Delegator>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(delegator0).when(biFunction0).apply(anyInt() , any(org.mozilla.javascript.NativeScript.class));
      Object object0 = nativeObject0.compute("~-HFJBS}9qT^wKRk", biFunction0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Float float0 = new Float((double) 8);
      boolean boolean0 = nativeIterator_StopIteration0.containsKey(float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeObject", e);
      }
  }
}
