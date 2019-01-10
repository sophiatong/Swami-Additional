/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 05:24:03 GMT 2018
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SuperBlock_ESTest extends SuperBlock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[0];
      SuperBlock superBlock0 = new SuperBlock(0, 0, 0, intArray0);
      String string0 = superBlock0.toString();
      assertEquals("sb 0", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[0];
      SuperBlock superBlock0 = new SuperBlock(0, (-411), 0, intArray0);
      superBlock0.setInQueue(true);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[4];
      SuperBlock superBlock0 = new SuperBlock(205, 205, 205, intArray0);
      int[] intArray1 = new int[4];
      intArray1[1] = 4;
      ClassFileWriter classFileWriter0 = new ClassFileWriter("dTQMn=Wb|m@};", "dTQMn=Wb|m@};", "");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      boolean boolean0 = superBlock0.merge(intArray0, 4, intArray1, 4, constantPool0);
      boolean boolean1 = superBlock0.merge(intArray0, 4, intArray0, 4, (ConstantPool) null);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[0];
      SuperBlock superBlock0 = new SuperBlock(0, (-411), 0, intArray0);
      boolean boolean0 = superBlock0.isInitialized();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[0];
      SuperBlock superBlock0 = new SuperBlock(0, (-411), 0, intArray0);
      boolean boolean0 = superBlock0.isInQueue();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 4;
      SuperBlock superBlock0 = new SuperBlock(205, 205, 205, intArray0);
      int[] intArray1 = superBlock0.getTrimmedLocals();
      assertArrayEquals(new int[] {4}, intArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[0];
      SuperBlock superBlock0 = new SuperBlock(0, 0, 0, intArray0);
      int[] intArray1 = superBlock0.getTrimmedLocals();
      superBlock0.setInitialized(true);
      ClassFileWriter classFileWriter0 = new ClassFileWriter("sb 0", "sb 0", "sb 0");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      // Undeclared exception!
      try { 
        superBlock0.merge(intArray1, 0, intArray0, (byte) (-66), constantPool0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad merge attempt
         //
         verifyException("org.mozilla.classfile.SuperBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[21];
      SuperBlock superBlock0 = new SuperBlock(153, 0, 0, intArray0);
      int int0 = superBlock0.getStart();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[0];
      SuperBlock superBlock0 = new SuperBlock(0, 0, 0, intArray0);
      int[] intArray1 = superBlock0.getStack();
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[0];
      SuperBlock superBlock0 = new SuperBlock(0, (-411), 0, intArray0);
      int[] intArray1 = superBlock0.getLocals();
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[4];
      SuperBlock superBlock0 = new SuperBlock((-445), 1140, 66, intArray0);
      int int0 = superBlock0.getIndex();
      assertEquals((-445), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[0];
      SuperBlock superBlock0 = new SuperBlock(0, 0, 0, intArray0);
      int int0 = superBlock0.getEnd();
      assertEquals(0, int0);
  }
}
