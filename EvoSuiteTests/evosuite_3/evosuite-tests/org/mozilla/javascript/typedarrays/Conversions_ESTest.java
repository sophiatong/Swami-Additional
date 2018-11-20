/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 21:49:58 GMT 2018
 */

package org.mozilla.javascript.typedarrays;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.typedarrays.Conversions;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Conversions_ESTest extends Conversions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer(165);
      int int0 = Conversions.toUint8Clamp(integer0);
      assertEquals(165, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Conversions.toUint8Clamp("4294967135");
      assertEquals(255, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer(0);
      int int0 = Conversions.toUint8Clamp(integer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = Conversions.toUint8Clamp("org.mozilla.javascript.typedarrays.Conversions");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer(0);
      int int0 = Conversions.toUint8(integer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = Conversions.toUint8("org.mozilla.javascript.typedarrays.Conversions");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      long long0 = Conversions.toUint32((Object) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = Conversions.toUint16((-32693));
      assertEquals((-32693), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      int int0 = Conversions.toUint16(object0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer(165);
      int int0 = Conversions.toInt8(integer0);
      assertEquals((-91), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = Conversions.toInt8("org.mozilla.javascript.typedarrays.Conversions");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = Conversions.toInt32("9Kt7");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(32843);
      int int0 = Conversions.toInt16(integer0);
      assertEquals((-32693), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      int int0 = Conversions.toInt16(object0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Conversions conversions0 = new Conversions();
      assertEquals(256, Conversions.EIGHT_BIT);
  }
}
