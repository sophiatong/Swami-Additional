/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 14:40:30 GMT 2018
 */

package org.mozilla.javascript.xmlimpl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.xml.XMLObject;
import org.mozilla.javascript.xmlimpl.XML;
import org.mozilla.javascript.xmlimpl.XMLLibImpl;
import org.mozilla.javascript.xmlimpl.XMLList;
import org.mozilla.javascript.xmlimpl.XMLName;
import org.mozilla.javascript.xmlimpl.XmlNode;
import org.mozilla.javascript.xmlimpl.XmlProcessor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class XMLName_ESTest extends XMLName_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XMLName xMLName0 = XMLName.formProperty("GQHr46Z! &", "GQHr46Z! &");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, (String) null);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      xMLName0.setMyValueOn(xML0, xML0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XMLName xMLName0 = XMLName.create("*", "*");
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "*");
      XML xML0 = new XML((XMLLibImpl) null, nativeContinuation0, (XMLObject) null, xmlNode0);
      xMLName0.setMyValueOn(xML0, (Object) null);
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "");
      XmlNode.Namespace xmlNode_Namespace0 = xmlNode0.getNamespaceDeclaration();
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "");
      XMLName xMLName0 = XMLName.create(xmlNode_QName0, true, false);
      // Undeclared exception!
      try { 
        xMLName0.setMyValueOn((XML) null, xmlNode_Namespace0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLName", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XMLName xMLName0 = XMLName.create("Np}l", "Np}l");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("Np}l");
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "enumNext");
      XmlNode xmlNode0 = XmlNode.newElementWithText(xmlProcessor0, (XmlNode) null, xmlNode_QName0, (String) null);
      XML xML0 = new XML(xMLLibImpl0, nativeInt16Array0, (XMLObject) null, xmlNode0);
      // Undeclared exception!
      try { 
        xMLName0.setMyValueOn(xML0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: INVALID_CHARACTER_ERR: An invalid or illegal XML character is specified. 
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XMLName xMLName0 = XMLName.create("*", "*");
      xMLName0.setIsDescendants();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XMLName xMLName0 = XMLName.formProperty("XmlNode.Namespace [{d}]", "<>\"yosM");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(nativeArrayBuffer0, 2, 13);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, nativeFloat64Array0, (XMLObject) null, xmlNode0);
      xMLName0.initXMLObject(xML0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext((Context) null);
      NativeArrayBuffer nativeArrayBuffer1 = (NativeArrayBuffer)xMLName0.set(context0, (Object) nativeArrayBuffer0);
      assertEquals(0, nativeArrayBuffer1.getLength());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XMLName xMLName0 = XMLName.create("@", "");
      boolean boolean0 = xMLName0.matchesLocalName("@");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      XMLName xMLName0 = XMLName.formProperty("5~B*DI )", (String) null);
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "XmlNode.Namespace [{}]");
      boolean boolean0 = xMLName0.matchesElement(xmlNode_QName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XMLName xMLName0 = XMLName.create("Np}l", "Np}l");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("Np}l");
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "enumNext");
      XmlNode xmlNode0 = XmlNode.newElementWithText(xmlProcessor0, (XmlNode) null, xmlNode_QName0, (String) null);
      XML xML0 = new XML(xMLLibImpl0, nativeInt16Array0, (XMLObject) null, xmlNode0);
      boolean boolean0 = xMLName0.matches(xML0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("..");
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "\"j");
      XMLName xMLName0 = XMLName.create(xmlNode_QName0, true, false);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "Xpu8m");
      XML xML0 = new XML((XMLLibImpl) null, nativeContinuation0, (XMLObject) null, xmlNode0);
      boolean boolean0 = xMLName0.matches(xML0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = XMLName.accept("_'=-9X1#4mk,=RbH");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = XMLName.accept("X^gDR");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XMLName xMLName0 = XMLName.formProperty("XmlNode.Namespace [{d}]", "<>\"yosM");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(nativeArrayBuffer0, 2, 13);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, nativeFloat64Array0, (XMLObject) null, xmlNode0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext((Context) null);
      XMLList xMLList0 = xML0.getPropertyList(xMLName0);
      xMLName0.initXMLObject(xMLList0);
      boolean boolean0 = xMLName0.has(context0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XMLName xMLName0 = XMLName.create("@", "");
      Context context0 = Context.enter();
      boolean boolean0 = xMLName0.has(context0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XMLName xMLName0 = XMLName.formProperty("XmlNode.Namespace [{d}]", "<>\"yosM");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(nativeArrayBuffer0, 2, 13);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, nativeFloat64Array0, (XMLObject) null, xmlNode0);
      xMLName0.initXMLObject(xML0);
      XMLList xMLList0 = (XMLList)xMLName0.get((Context) null);
      assertTrue(xMLList0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XMLName xMLName0 = XMLName.formProperty("", "5@");
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        xMLName0.get(context0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot read property \"\"\":5@\" from undefined
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XMLName xMLName0 = XMLName.formProperty("XmlNode.Namespace [{d}]", "<>\"yosM");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(nativeArrayBuffer0, 2, 13);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, nativeFloat64Array0, (XMLObject) null, xmlNode0);
      xMLName0.initXMLObject(xML0);
      boolean boolean0 = xMLName0.delete((Context) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XMLName xMLName0 = XMLName.formProperty("XmlNode.Namespace [{d}]", "<>\"yosM");
      boolean boolean0 = xMLName0.delete((Context) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XMLName xMLName0 = XMLName.create("*", "language version");
      XmlNode.QName xmlNode_QName0 = xMLName0.toQname();
      XMLName xMLName1 = XMLName.create(xmlNode_QName0);
      assertFalse(xMLName1.equals((Object)xMLName0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XMLName xMLName0 = XMLName.create("propertyIsEnumerable", "@Np`o");
      assertNotNull(xMLName0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XMLName xMLName0 = XMLName.create("*", "*");
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        xMLName0.set(context0, (Object) "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot set property \"*\" of undefined to \"\"
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        XMLName.create("undefined", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLName", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XMLName xMLName0 = XMLName.create("}", "}");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "enumNext");
      XmlNode xmlNode0 = XmlNode.newElementWithText(xmlProcessor0, (XmlNode) null, xmlNode_QName0, "enumNext");
      XML xML0 = new XML(xMLLibImpl0, nativeInt16Array0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.child(xMLName0);
      xMLName0.addMatchingAttributes(xMLList0, xML0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XMLName xMLName0 = XMLName.create("}", "}");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "enumNext");
      XmlNode xmlNode0 = XmlNode.newElementWithText(xmlProcessor0, (XmlNode) null, xmlNode_QName0, "enumNext");
      XML xML0 = new XML(xMLLibImpl0, nativeInt16Array0, (XMLObject) null, xmlNode0);
      xML0.deleteXMLProperty(xMLName0);
      assertFalse(xML0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XMLName xMLName0 = XMLName.create("@", "");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "org.mozilla.javascript.xmlimpl.XMLName");
      XML xML0 = new XML(xMLLibImpl0, nativeArrayBuffer0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      xMLName0.setMyValueOn(xML0, xMLList0);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XMLName xMLName0 = XMLName.formProperty("*", "*");
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.children();
      xMLName0.addDescendants(xMLList0, xML0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("TypeError", "TypeError");
      XMLName xMLName0 = XMLName.formProperty(xmlNode_Namespace0, "vf1r");
      XmlNode.QName xmlNode_QName0 = xMLName0.toQname();
      XMLName xMLName1 = XMLName.create(xmlNode_QName0, true, true);
      // Undeclared exception!
      try { 
        xMLName1.addMatches((XMLList) null, (XML) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLName", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XMLName xMLName0 = XMLName.create("}", "}");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "enumNext");
      XmlNode xmlNode0 = XmlNode.newElementWithText(xmlProcessor0, (XmlNode) null, xmlNode_QName0, "enumNext");
      XML xML0 = new XML(xMLLibImpl0, nativeInt16Array0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.child(xMLName0);
      XMLList xMLList1 = xMLName0.matchDescendantChildren(xMLList0, xML0);
      assertFalse(xMLList1.isSealed());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XMLName xMLName0 = XMLName.create("@", "");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "org.mozilla.javascript.xmlimpl.XMLName");
      XML xML0 = new XML(xMLLibImpl0, nativeArrayBuffer0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      XMLList xMLList1 = xMLName0.matchDescendantAttributes(xMLList0, xML0);
      assertTrue(xMLList1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("..");
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "\"j");
      XMLName xMLName0 = XMLName.create(xmlNode_QName0, true, false);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "Xpu8m");
      XML xML0 = new XML((XMLLibImpl) null, nativeContinuation0, (XMLObject) null, xmlNode0);
      xMLName0.addMatches((XMLList) null, xML0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = XMLName.accept("@");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = XMLName.accept((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      boolean boolean0 = XMLName.accept(nativeArrayBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = XMLName.accept(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      boolean boolean0 = xMLName0.matchesElement((XmlNode.QName) null);
      assertTrue(boolean0);
  }
}
