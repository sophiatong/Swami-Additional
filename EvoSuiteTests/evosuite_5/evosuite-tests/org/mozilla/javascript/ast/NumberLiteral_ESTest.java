/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 16:22:23 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.NumberLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumberLiteral_ESTest extends NumberLiteral_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberLiteral numberLiteral0 = new NumberLiteral((-1254));
      numberLiteral0.debugPrint();
      assertEquals("40", numberLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NumberLiteral numberLiteral0 = new NumberLiteral(0, "U:W*Pm\"zX^MYt.;}$", 3890.892852866016);
      assertEquals(3890.892852866016, numberLiteral0.getDouble(), 0.01);
      assertEquals(40, numberLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NumberLiteral numberLiteral0 = new NumberLiteral(0, 0);
      numberLiteral0.getValue();
      assertEquals(40, numberLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NumberLiteral numberLiteral0 = new NumberLiteral(0.0);
      double double0 = numberLiteral0.getNumber();
      assertEquals(0.0, double0, 0.01);
      assertEquals("0.0", numberLiteral0.getValue());
      assertEquals(40, numberLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NumberLiteral numberLiteral0 = new NumberLiteral();
      assertEquals("40", numberLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NumberLiteral numberLiteral0 = new NumberLiteral((-1254));
      String string0 = numberLiteral0.toSource();
      assertEquals("<null>", string0);
      assertEquals(40, numberLiteral0.getType());
  }
}