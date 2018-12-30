/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 15:31:50 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.XmlFragment;
import org.mozilla.javascript.ast.XmlLiteral;
import org.mozilla.javascript.ast.XmlString;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlLiteral_ESTest extends XmlLiteral_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlLiteral xmlLiteral0 = new XmlLiteral(0);
      XmlString xmlString0 = new XmlString(0);
      xmlLiteral0.addFragment(xmlString0);
      StringBuilder stringBuilder0 = new StringBuilder(1866);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      xmlLiteral0.visit(astNode_DebugPrintVisitor0);
      assertEquals("0\tXML 0 1\n0\t  XML 0 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("0\tXML 0 1\n0\t  XML 0 1\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlLiteral xmlLiteral0 = new XmlLiteral(0);
      XmlString xmlString0 = new XmlString(0);
      xmlLiteral0.addFragment(xmlString0);
      String string0 = xmlLiteral0.toSource(8);
      assertEquals("null", string0);
      assertEquals(146, xmlLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XmlLiteral xmlLiteral0 = new XmlLiteral(0, (-2080));
      LinkedList<XmlFragment> linkedList0 = new LinkedList<XmlFragment>();
      XmlString xmlString0 = new XmlString((-2080));
      linkedList0.add((XmlFragment) xmlString0);
      xmlLiteral0.setFragments(linkedList0);
      assertEquals("146", xmlLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XmlLiteral xmlLiteral0 = new XmlLiteral();
      assertEquals(146, xmlLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      XmlLiteral xmlLiteral0 = new XmlLiteral(0);
      xmlLiteral0.getFragments();
      assertEquals(146, xmlLiteral0.getType());
  }
}