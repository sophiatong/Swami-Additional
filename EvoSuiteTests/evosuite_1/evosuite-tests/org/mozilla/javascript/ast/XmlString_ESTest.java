/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 17:48:36 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.XmlString;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlString_ESTest extends XmlString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlString xmlString0 = new XmlString(0, "t`x%{GhSj");
      String string0 = xmlString0.toSource(0);
      assertEquals("t`x%{GhSj", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlString xmlString0 = new XmlString(29);
      String string0 = xmlString0.debugPrint();
      assertEquals("29\tXML 29 1\n", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XmlString xmlString0 = new XmlString();
      String string0 = xmlString0.getXml();
      assertNull(string0);
  }
}
