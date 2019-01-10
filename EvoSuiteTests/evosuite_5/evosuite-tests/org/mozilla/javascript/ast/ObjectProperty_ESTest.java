/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 17:31:05 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ObjectProperty;
import org.mozilla.javascript.ast.SwitchCase;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ObjectProperty_ESTest extends ObjectProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty();
      SwitchCase switchCase0 = new SwitchCase(0, 8);
      objectProperty0.setLeftAndRight(switchCase0, switchCase0);
      String string0 = objectProperty0.toSource(106);
      assertEquals("\n                                                                                                                                                                                                                      default:\n: default:\n", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty(7, 3144);
      SwitchCase switchCase0 = new SwitchCase(0, 8);
      objectProperty0.left = (AstNode) switchCase0;
      // Undeclared exception!
      try { 
        objectProperty0.toSource(106);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ObjectProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty(7, 3144);
      objectProperty0.setIsSetterMethod();
      // Undeclared exception!
      try { 
        objectProperty0.toSource(106);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ObjectProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty();
      objectProperty0.setNodeType(104);
      assertEquals(104, objectProperty0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty(3016);
      // Undeclared exception!
      try { 
        objectProperty0.setNodeType(3016);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid node type: 3016
         //
         verifyException("org.mozilla.javascript.ast.ObjectProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty(0, 0);
      objectProperty0.setIsNormalMethod();
      assertTrue(objectProperty0.isNormalMethod());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty(0, 0);
      objectProperty0.setIsGetterMethod();
      // Undeclared exception!
      try { 
        objectProperty0.toSource(24);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ObjectProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty();
      boolean boolean0 = objectProperty0.isMethod();
      assertFalse(boolean0);
      assertEquals(104, objectProperty0.getOperator());
  }
}
