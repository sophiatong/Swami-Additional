/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 08:26:10 GMT 2018
 */

package org.mozilla.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.classfile.FieldOrMethodRef;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldOrMethodRef_ESTest extends FieldOrMethodRef_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FieldOrMethodRef fieldOrMethodRef0 = new FieldOrMethodRef("", "", "");
      fieldOrMethodRef0.hashCode();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FieldOrMethodRef fieldOrMethodRef0 = new FieldOrMethodRef("", "", "");
      String string0 = fieldOrMethodRef0.getType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FieldOrMethodRef fieldOrMethodRef0 = new FieldOrMethodRef("", "", "");
      String string0 = fieldOrMethodRef0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FieldOrMethodRef fieldOrMethodRef0 = new FieldOrMethodRef("", "", "");
      String string0 = fieldOrMethodRef0.getClassName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FieldOrMethodRef fieldOrMethodRef0 = new FieldOrMethodRef("", "", "");
      boolean boolean0 = fieldOrMethodRef0.equals(fieldOrMethodRef0);
      assertTrue(boolean0);
  }
}
