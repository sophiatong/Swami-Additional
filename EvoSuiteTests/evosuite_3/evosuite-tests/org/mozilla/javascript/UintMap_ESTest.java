/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 23:43:25 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.UintMap;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class UintMap_ESTest extends UintMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      int int0 = uintMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UintMap uintMap0 = new UintMap(3);
      Object object0 = new Object();
      uintMap0.put(3, object0);
      uintMap0.put(743, 3);
      uintMap0.put(7, 3);
      uintMap0.put(23, 7);
      assertFalse(uintMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      boolean boolean0 = uintMap0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      boolean boolean0 = uintMap0.has(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      Object object0 = new Object();
      uintMap0.put(0, object0);
      uintMap0.getObject(0);
      assertFalse(uintMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      uintMap0.put(411, (Object) "brJ.2");
      uintMap0.getObject(0);
      assertEquals(1, uintMap0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      uintMap0.put(411, (Object) "brJ.2");
      uintMap0.getKeys();
      assertEquals(1, uintMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      uintMap0.put(0, 0);
      int int0 = uintMap0.getInt(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      Object object0 = new Object();
      uintMap0.put(1, object0);
      int int0 = uintMap0.getInt(1, 1);
      assertFalse(uintMap0.isEmpty());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      int int0 = uintMap0.getInt(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UintMap uintMap0 = new UintMap(3);
      uintMap0.put(23, 7);
      int int0 = uintMap0.getExistingInt(23);
      assertEquals(1, uintMap0.size());
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      Object object0 = new Object();
      uintMap0.put(0, object0);
      int int0 = uintMap0.getExistingInt(0);
      assertEquals(1, uintMap0.size());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UintMap uintMap0 = new UintMap(3);
      uintMap0.put(743, 3);
      // Undeclared exception!
      try { 
        uintMap0.getExistingInt(23);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      uintMap0.put(411, (Object) "brJ.2");
      Object object0 = new Object();
      uintMap0.put(0, object0);
      uintMap0.remove(0);
      uintMap0.put(0, 0);
      assertEquals(2, uintMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      uintMap0.put(2059, (Object) null);
      uintMap0.clear();
      assertTrue(uintMap0.isEmpty());
  }
}
