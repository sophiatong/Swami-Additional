/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 19:41:52 GMT 2018
 */

package org.mozilla.javascript.tools.jsc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.jsc.Main;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Main_ESTest extends Main_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Main main0 = new Main();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "com.js";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("com.js");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "lastIndexOf");
      main0.processSource(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "com.js";
      main0.processSource(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[22];
      stringArray0[0] = ">bOYVF.js";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(">bOYVF.js");
      FileSystemHandling.createFolder(evoSuiteFile0);
      Main main0 = new Main();
      main0.processSource(stringArray0);
      assertEquals(22, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[0];
      main0.processSource(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("com.class");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      Main main0 = new Main();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "com.js";
      main0.processOptions(stringArray0);
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("com.js");
      FileSystemHandling.appendLineToFile(evoSuiteFile1, "lastIndexOf");
      // Undeclared exception!
      try { 
        main0.processSource(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-implements";
      stringArray0[1] = "org.mozilla.classfile.FieldOrMethodRef";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-implements";
      stringArray0[1] = "-implements";
      Main main0 = new Main();
      // Undeclared exception!
      try { 
        main0.processOptions(stringArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // java.lang.ClassNotFoundException: Class '-implements.class' should be in target project, but could not be found!
         //
         verifyException("org.mozilla.javascript.tools.jsc.Main", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-d";
      stringArray0[2] = "-extends";
      stringArray0[3] = "org.mozilla.javascript.ast.UnaryExpression";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-extends";
      stringArray0[1] = "msg.primitive.expected";
      // Undeclared exception!
      try { 
        main0.processOptions(stringArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // java.lang.ClassNotFoundException: Class 'msg/primitive/expected.class' should be in target project, but could not be found!
         //
         verifyException("org.mozilla.javascript.tools.jsc.Main", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-package";
      stringArray0[1] = "Bfli0.js";
      Main main0 = new Main();
      // Undeclared exception!
      try { 
        main0.processOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-observe-instruction-count";
      String[] stringArray1 = main0.processOptions(stringArray0);
      assertNull(stringArray1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-o";
      stringArray0[1] = "__o";
      stringArray0[2] = "-o";
      stringArray0[3] = "Kavaefang.bect";
      // Undeclared exception!
      try { 
        main0.processOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-o";
      stringArray0[1] = "";
      // Undeclared exception!
      try { 
        main0.processOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-nosource";
      stringArray0[1] = "-nosource";
      stringArray0[2] = "-nosource";
      stringArray0[3] = "-encoding";
      // Undeclared exception!
      try { 
        main0.processOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-main-method-class";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-O";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-version";
      stringArray0[1] = "5";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad language version: 5
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-o";
      stringArray0[1] = "Pto!qlh";
      stringArray0[2] = "";
      String[] stringArray1 = main0.processOptions(stringArray0);
      assertNull(stringArray1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-g";
      String[] stringArray1 = main0.processOptions(stringArray0);
      assertNull(stringArray1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-help";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-package";
      stringArray0[1] = "Z=";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Kavaefang.bect";
      Main.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "com.js";
      String[] stringArray1 = main0.processOptions(stringArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("com.js");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "com.js");
      // Undeclared exception!
      try { 
        main0.processSource(stringArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Main main0 = new Main();
      String string0 = main0.getClassName("-o");
      assertEquals("__o", string0);
  }
}
