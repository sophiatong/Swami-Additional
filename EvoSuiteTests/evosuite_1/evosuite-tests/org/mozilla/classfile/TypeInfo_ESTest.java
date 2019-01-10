/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 08:02:23 GMT 2018
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
import org.mozilla.classfile.TypeInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TypeInfo_ESTest extends TypeInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      // Undeclared exception!
      try { 
        TypeInfo.merge(16391, (short)128, constantPool0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad type
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("D", "D", "D");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      // Undeclared exception!
      try { 
        TypeInfo.merge(6, (short)1, constantPool0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad merge attempt between uninitialized_this and int
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("en", "en", "en");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      // Undeclared exception!
      try { 
        TypeInfo.merge(5, (short)1, constantPool0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad merge attempt between null and int
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeInfo.merge(4, 83, (ConstantPool) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad type
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("init#", "init#", "init#");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      // Undeclared exception!
      try { 
        TypeInfo.merge((short)2, 3, constantPool0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad merge attempt between float and double
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[3];
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", ">t2w}~iT", "");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      TypeInfo.print(intArray0, intArray0, constantPool0);
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("pRU9j{M-!", "pRU9j{M-!", "java/lang/Object");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      // Undeclared exception!
      try { 
        TypeInfo.merge((short)8, (short)1, constantPool0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad merge attempt between uninitialized and int
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("in>", "in>", "org.mozilla.classfile.ClassFileWriter$ClassFileFormatException");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      TypeInfo.fromType("in>", constantPool0);
      ClassFileWriter.MHandle classFileWriter_MHandle0 = new ClassFileWriter.MHandle((byte)2, "org.mozilla.classfile.ClassFileWriter$ClassFileFormatException", "org.mozilla.classfile.ClassFileWriter$ClassFileFormatException", "org.mozilla.classfile.ClassFileField");
      constantPool0.addMethodHandle(classFileWriter_MHandle0);
      int int0 = TypeInfo.merge(519, 1799, constantPool0);
      assertEquals(2823, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("pRU9j{M-!", "pRU9j{M-!", "java/lang/Object");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.fromType("pRU9j{M-!", constantPool0);
      assertEquals(519, int0);
      
      ClassFileWriter.MHandle classFileWriter_MHandle0 = new ClassFileWriter.MHandle((byte)80, "java/lang/Object", "java/lang/Object", "org.mozilla.classfile.ClassFileField");
      constantPool0.addMethodHandle(classFileWriter_MHandle0);
      int int1 = TypeInfo.merge(519, 1543, constantPool0);
      assertEquals(1543, int1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("BootstrapMethods", "BootstrapMethods", "java/lang/Object");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.fromType("BootstrapMethods", constantPool0);
      int int1 = TypeInfo.fromType("java/lang/Object", constantPool0);
      assertEquals(1031, int1);
      
      int int2 = TypeInfo.merge(519, 1031, constantPool0);
      assertTrue(int2 == int0);
      assertEquals(519, int2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("init>", "init>", "java/lang/Object");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      constantPool0.addInterfaceMethodRef("U", "No method to add to", "java/lang/Object");
      TypeInfo.fromType("init>", constantPool0);
      TypeInfo.fromType("init>", constantPool0);
      // Undeclared exception!
      try { 
        TypeInfo.merge(2055, 2311, constantPool0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class 'init>.class' should be in target project, but could not be found!
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("SA?Pqq`k*t4!>K", "SA?Pqq`k*t4!>K", "SA?Pqq`k*t4!>K");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.merge(5, 40711, constantPool0);
      assertEquals(40711, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("C", "C", "C");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.merge((short)256, (short)1, constantPool0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("BootstrapMethods", "BootstrapMethods", "java/lang/Object");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.merge((short)32, (short)32, constantPool0);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = TypeInfo.isTwoWords((short)128);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("expecting object type", "expecting object type", "expecting object type");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      // Undeclared exception!
      try { 
        TypeInfo.getPayloadAsType((short)4, constantPool0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // expecting object type
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeInfo.fromType("E", (ConstantPool) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad type
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = TypeInfo.fromType("J", (ConstantPool) null);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("D", "D", "D");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.fromType("D", constantPool0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("C", "C", "C");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.fromType("C", constantPool0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("3", "3", "F");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.fromType("F", constantPool0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = TypeInfo.UNINITIALIZED_VARIABLE(762);
      assertEquals(195080, int0);
  }
}
