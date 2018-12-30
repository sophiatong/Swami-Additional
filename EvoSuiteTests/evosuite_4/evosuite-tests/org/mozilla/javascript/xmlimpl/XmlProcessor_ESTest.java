/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 15:02:05 GMT 2018
 */

package org.mozilla.javascript.xmlimpl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.imageio.metadata.IIOMetadataNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.xml.XMLObject;
import org.mozilla.javascript.xmlimpl.XML;
import org.mozilla.javascript.xmlimpl.XMLLibImpl;
import org.mozilla.javascript.xmlimpl.XMLList;
import org.mozilla.javascript.xmlimpl.XmlNode;
import org.mozilla.javascript.xmlimpl.XmlProcessor;
import org.w3c.dom.Node;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlProcessor_ESTest extends XmlProcessor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      // Undeclared exception!
      try { 
        xmlProcessor0.toXml("<null><null/></null>", "Unreachable.");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: The value of attribute \"xmlns\" associated with an element type \"parent\" must not contain the '<' character.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      // Undeclared exception!
      try { 
        xmlProcessor0.toXml("\">", "<null/>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SyntaxError: XML objects may contain at most one node.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      boolean boolean0 = xmlProcessor0.isPrettyPrinting();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      boolean boolean0 = xmlProcessor0.isIgnoreWhitespace();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      boolean boolean0 = xmlProcessor0.isIgnoreProcessingInstructions();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      boolean boolean0 = xmlProcessor0.isIgnoreComments();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      int int0 = xmlProcessor0.getPrettyIndent();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "d", "d");
      XMLList xMLList0 = new XMLList(xMLLibImpl0, nativeFloat64Array0, (XMLObject) null);
      XML xML0 = new XML(xMLLibImpl0, nativeFloat64Array0, xMLList0, xmlNode0);
      // Undeclared exception!
      try { 
        xmlProcessor0.escapeTextValue(xML0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      String string0 = xmlProcessor0.escapeAttributeValue(xmlProcessor0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode();
      iIOMetadataNode0.appendChild(iIOMetadataNode1);
      // Undeclared exception!
      try { 
        xmlProcessor0.ecmaToXmlString(iIOMetadataNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      String string0 = xmlProcessor0.ecmaToXmlString(iIOMetadataNode0);
      assertEquals("<null/>", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      Node node0 = xmlProcessor0.toXml(" ", " ");
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      Node node0 = xmlProcessor0.toXml("d", "d");
      String string0 = xmlProcessor0.ecmaToXmlString(node0);
      assertEquals("d", string0);
  }
}