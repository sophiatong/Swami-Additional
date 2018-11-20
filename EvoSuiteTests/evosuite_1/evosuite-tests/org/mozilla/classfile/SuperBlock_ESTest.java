/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 08:20:23 GMT 2018
 */

package org.mozilla.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.classfile.ConstantPool;
import org.mozilla.classfile.SuperBlock;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SuperBlock_ESTest extends SuperBlock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[8];
      SuperBlock superBlock0 = new SuperBlock(800, 800, 0, intArray0);
      String string0 = superBlock0.toString();
      assertEquals("sb 800", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[8];
      SuperBlock superBlock0 = new SuperBlock(800, 800, 0, intArray0);
      superBlock0.setInQueue(true);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[3];
      SuperBlock superBlock0 = new SuperBlock(3, 3, 3, intArray0);
      int[] intArray1 = new int[4];
      intArray1[0] = 3;
      ConstantPool constantPool0 = new ConstantPool((ClassFileWriter) null);
      boolean boolean0 = superBlock0.merge(intArray1, 3, intArray0, 0, constantPool0);
      boolean boolean1 = superBlock0.merge(intArray0, 3, intArray1, 0, constantPool0);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[6];
      SuperBlock superBlock0 = new SuperBlock(3906, 3906, 3906, intArray0);
      superBlock0.setInitialized(true);
      ClassFileWriter classFileWriter0 = new ClassFileWriter("sb 3906", "sb 3906", "sb 3906");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      // Undeclared exception!
      try { 
        superBlock0.merge(intArray0, 0, intArray0, 0, constantPool0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad merge attempt
         //
         verifyException("org.mozilla.classfile.SuperBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[0];
      SuperBlock superBlock0 = new SuperBlock((-1103), 0, (-1103), intArray0);
      boolean boolean0 = superBlock0.isInitialized();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[0];
      SuperBlock superBlock0 = new SuperBlock(1, 15, 1, intArray0);
      boolean boolean0 = superBlock0.isInQueue();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[3];
      SuperBlock superBlock0 = new SuperBlock(3, 3, 3, intArray0);
      int[] intArray1 = new int[4];
      intArray1[0] = 3;
      ConstantPool constantPool0 = new ConstantPool((ClassFileWriter) null);
      boolean boolean0 = superBlock0.merge(intArray1, 3, intArray0, 0, constantPool0);
      assertTrue(boolean0);
      
      int[] intArray2 = superBlock0.getTrimmedLocals();
      assertArrayEquals(new int[] {3}, intArray2);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[8];
      SuperBlock superBlock0 = new SuperBlock(800, 800, 0, intArray0);
      int int0 = superBlock0.getStart();
      assertEquals(800, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[4];
      SuperBlock superBlock0 = new SuperBlock((-3555), (-3555), (-3555), intArray0);
      int[] intArray1 = superBlock0.getStack();
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[0];
      SuperBlock superBlock0 = new SuperBlock(1, 15, 1, intArray0);
      int[] intArray1 = superBlock0.getLocals();
      assertNotSame(intArray0, intArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[5];
      SuperBlock superBlock0 = new SuperBlock(3, 47, 794, intArray0);
      int int0 = superBlock0.getIndex();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[5];
      SuperBlock superBlock0 = new SuperBlock(3, 47, 794, intArray0);
      int int0 = superBlock0.getEnd();
      assertEquals(794, int0);
  }
}
