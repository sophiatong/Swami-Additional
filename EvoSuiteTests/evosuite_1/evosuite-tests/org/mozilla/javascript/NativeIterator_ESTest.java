/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 22:53:49 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.typedarrays.NativeUint16Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeIterator_ESTest extends NativeIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Integer integer0 = new Integer(0);
      linkedHashSet0.add(integer0);
      Iterator<Integer> iterator0 = linkedHashSet0.iterator();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(0);
      NativeIterator.WrappedJavaIterator nativeIterator_WrappedJavaIterator0 = new NativeIterator.WrappedJavaIterator(iterator0, nativeUint16Array0);
      Object object0 = nativeIterator_WrappedJavaIterator0.next();
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TreeSet<Object> treeSet0 = new TreeSet<Object>();
      Iterator<Object> iterator0 = treeSet0.descendingIterator();
      NativeIterator.WrappedJavaIterator nativeIterator_WrappedJavaIterator0 = new NativeIterator.WrappedJavaIterator(iterator0, (Scriptable) null);
      Object object0 = nativeIterator_WrappedJavaIterator0.__iterator__(false);
      assertSame(nativeIterator_WrappedJavaIterator0, object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(2);
      boolean boolean0 = nativeIterator_StopIteration0.hasInstance(nativeFloat64Array0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      String string0 = nativeIterator_StopIteration0.getClassName();
      assertEquals("StopIteration", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Iterator<Integer> iterator0 = linkedHashSet0.iterator();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(0);
      NativeIterator.WrappedJavaIterator nativeIterator_WrappedJavaIterator0 = new NativeIterator.WrappedJavaIterator(iterator0, nativeUint16Array0);
      // Undeclared exception!
      try { 
        nativeIterator_WrappedJavaIterator0.next();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // null
         //
         verifyException("org.mozilla.javascript.NativeIterator$WrappedJavaIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        NativeIterator.init((ScriptableObject) null, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      // Undeclared exception!
      try { 
        NativeIterator.init(nativeError0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }
}
