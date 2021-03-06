/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 16:43:56 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.ErrorNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ErrorNode_ESTest extends ErrorNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ErrorNode errorNode0 = new ErrorNode(802);
      errorNode0.debugPrint();
      assertEquals((-1), errorNode0.getType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ErrorNode errorNode0 = new ErrorNode(802);
      errorNode0.toSource(802);
      assertEquals((-1), errorNode0.getType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ErrorNode errorNode0 = new ErrorNode(802);
      errorNode0.getMessage();
      assertEquals((-1), errorNode0.getType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ErrorNode errorNode0 = new ErrorNode(78, 78);
      assertEquals((-1), errorNode0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ErrorNode errorNode0 = new ErrorNode();
      errorNode0.setMessage((String) null);
      assertEquals((-1), errorNode0.getType());
  }
}
