/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 19:07:04 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.ArrayLiteral;
import org.mozilla.javascript.ast.ParenthesizedExpression;
import org.mozilla.javascript.ast.XmlDotQuery;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class XmlDotQuery_ESTest extends XmlDotQuery_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlDotQuery xmlDotQuery0 = new XmlDotQuery(0, 0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(149, 13);
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(arrayLiteral0);
      xmlDotQuery0.setLeftAndRight(parenthesizedExpression0, arrayLiteral0);
      String string0 = xmlDotQuery0.toSource(0);
      assertEquals((-1), xmlDotQuery0.getRp());
      assertEquals("([]).([])", string0);
      assertEquals(147, xmlDotQuery0.getType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlDotQuery xmlDotQuery0 = new XmlDotQuery();
      xmlDotQuery0.setRp((-1540));
      assertEquals((-1540), xmlDotQuery0.getRp());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XmlDotQuery xmlDotQuery0 = new XmlDotQuery((-1550));
      assertEquals(147, xmlDotQuery0.getOperator());
      assertEquals((-1), xmlDotQuery0.getRp());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XmlDotQuery xmlDotQuery0 = new XmlDotQuery();
      int int0 = xmlDotQuery0.getRp();
      assertEquals("147", xmlDotQuery0.toString());
      assertEquals((-1), int0);
  }
}
