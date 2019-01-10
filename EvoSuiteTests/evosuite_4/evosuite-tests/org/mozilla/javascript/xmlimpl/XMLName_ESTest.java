/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 14:42:54 GMT 2018
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
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
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
      XMLName xMLName0 = XMLName.create("YH.{(Ek36u2{v,Z", "YH.{(Ek36u2{v,Z");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, " LD");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.elements(xMLName0);
      // Undeclared exception!
      try { 
        xMLName0.setMyValueOn((XML) null, xMLList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLName", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = xmlNode0.getXml();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        xMLName0.setMyValueOn(xML0, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLName", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("F#'%w9[A=pF2%", "");
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "F#'%w9[A=pF2%");
      XMLName xMLName0 = XMLName.create(xmlNode_QName0, true, true);
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(937L);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "");
      XML xML0 = new XML(xMLLibImpl0, nativeArray0, (XMLObject) null, xmlNode0);
      // Undeclared exception!
      try { 
        xMLName0.setMyValueOn(xML0, xmlProcessor0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can only set attributes on elements.
         //
         verifyException("org.mozilla.javascript.xmlimpl.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XMLName xMLName0 = XMLName.formProperty("create", "create");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(16);
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(nativeArrayBuffer0, 6, 12);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "ArrayBuffer");
      XML xML0 = new XML(xMLLibImpl0, nativeUint16Array0, (XMLObject) null, xmlNode0);
      // Undeclared exception!
      try { 
        xMLName0.setMyValueOn(xML0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: com.sun.org.apache.xerces.internal.dom.TextImpl cannot be cast to org.w3c.dom.Element
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XMLName xMLName0 = XMLName.formProperty("error reporter", "language version");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "error reporter");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      xMLName0.setMyValueOn(xML0, xML0);
      assertFalse(xML0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      xMLName0.setIsDescendants();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("F#'%w9[A=pF2%", "");
      XMLName xMLName0 = XMLName.formProperty(xmlNode_Namespace0, "F#'%w9[A=pF2%");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(937L);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "");
      XML xML0 = new XML(xMLLibImpl0, nativeArray0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.child(0);
      xMLName0.initXMLObject(xMLList0);
      // Undeclared exception!
      try { 
        xMLName0.set((Context) null, (Object) xML0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Assignment to empty XMLList without targets not supported
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        xMLName0.set(context0, (Object) "vTgW-_O/$+?rT");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot set property \"*\" of undefined to \"vTgW-_O/$+?rT\"
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "");
      XMLName xMLName0 = XMLName.create(xmlNode_QName0);
      boolean boolean0 = xMLName0.matchesLocalName("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XmlNode.QName xmlNode_QName0 = xMLName0.toQname();
      boolean boolean0 = xMLName0.matchesElement(xmlNode_QName0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      XMLName xMLName0 = XMLName.create("isToplevel", "() { ");
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "isToplevel");
      boolean boolean0 = xMLName0.matchesElement(xmlNode_QName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "2~Gi", "() { ");
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create((XmlNode.Namespace) null, "org.mozilla.javascript.xmlimpl.XMLName");
      XmlNode xmlNode1 = XmlNode.newElementWithText(xmlProcessor0, xmlNode0, xmlNode_QName0, "language version");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode1);
      XMLName xMLName0 = XMLName.formProperty((XmlNode.Namespace) null, "() { ");
      boolean boolean0 = xMLName0.matches(xML0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "4H");
      XmlNode.QName xmlNode_QName0 = xmlNode0.getQname();
      XMLName xMLName0 = XMLName.create(xmlNode_QName0, true, true);
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      XML xML0 = new XML(xMLLibImpl0, nativeArrayBuffer0, (XMLObject) null, xmlNode0);
      boolean boolean0 = xMLName0.matches(xML0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = XMLName.accept("`GK:ah:$");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("F#'%w9[A=pF2%", "");
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "F#'%w9[A=pF2%");
      XMLName xMLName0 = XMLName.create(xmlNode_QName0, true, true);
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(937L);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "");
      XML xML0 = new XML(xMLLibImpl0, nativeArray0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.child(2);
      xMLName0.initXMLObject(xMLList0);
      Context context0 = Context.enter();
      boolean boolean0 = xMLName0.has(context0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XMLName xMLName0 = XMLName.formProperty("create", "*");
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      boolean boolean0 = xMLName0.has(context0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("F#'%w9[A=pF2%", "F#'%w9[A=pF2%");
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "D#1#");
      XMLName xMLName0 = XMLName.create(xmlNode_QName0, false, false);
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(937L);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "F#'%w9[A=pF2%");
      XML xML0 = new XML(xMLLibImpl0, nativeArray0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.child(8);
      xMLName0.initXMLObject(xMLList0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      XMLList xMLList1 = (XMLList)xMLName0.get(context0);
      assertFalse(xMLList1.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XMLName xMLName0 = XMLName.formProperty("create", "*");
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      // Undeclared exception!
      try { 
        xMLName0.get(context0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot read property \"\"create\":*\" from undefined
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("F#'%w9[A=pF2%", "");
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "F#'%w9[A=pF2%");
      XMLName xMLName0 = XMLName.create(xmlNode_QName0, true, true);
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(937L);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "");
      XML xML0 = new XML(xMLLibImpl0, nativeArray0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.child((-128));
      xMLName0.initXMLObject(xMLList0);
      Context context0 = Context.enter();
      boolean boolean0 = xMLName0.delete(context0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("F#'%w9[A=pF2%", "");
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "F#'%w9[A=pF2%");
      XMLName xMLName0 = XMLName.create(xmlNode_QName0, true, true);
      Context context0 = Context.enter();
      boolean boolean0 = xMLName0.delete(context0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XMLName xMLName0 = XMLName.create("@3U", "@3U");
      assertNotNull(xMLName0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XMLName xMLName0 = XMLName.create("*", "*");
      assertNotNull(xMLName0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        XMLName.create("b#", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLName", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XMLName xMLName0 = XMLName.formProperty("error reporter", "y37)Gw9MZM");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "2~Gi", "() { ");
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create((XmlNode.Namespace) null, "org.mozilla.javascript.xmlimpl.XMLName");
      XmlNode xmlNode1 = XmlNode.newElementWithText(xmlProcessor0, xmlNode0, xmlNode_QName0, "language version");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode1);
      xMLName0.addMatchingAttributes((XMLList) null, xML0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XMLName xMLName0 = XMLName.formProperty("error reporter", "y37)Gw9MZM");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "2~Gi", "() { ");
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create((XmlNode.Namespace) null, "org.mozilla.javascript.xmlimpl.XMLName");
      XmlNode xmlNode1 = XmlNode.newElementWithText(xmlProcessor0, xmlNode0, xmlNode_QName0, "language version");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode1);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "4H");
      XmlNode.QName xmlNode_QName0 = xmlNode0.getQname();
      XMLName xMLName0 = XMLName.create(xmlNode_QName0, true, true);
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      XML xML0 = new XML(xMLLibImpl0, nativeArrayBuffer0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.child(xMLName0);
      xMLName0.addMatches(xMLList0, xML0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XMLName xMLName0 = XMLName.create("YH.{(Ek36u2{v,Z", "YH.{(Ek36u2{v,Z");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, " LD");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.elements(xMLName0);
      xMLName0.addDescendants(xMLList0, xML0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(937L);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "");
      XML xML0 = new XML(xMLLibImpl0, nativeArray0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.child((-128));
      XMLName xMLName0 = XMLName.formStar();
      XmlNode.QName xmlNode_QName0 = xMLName0.toQname();
      XMLName xMLName1 = XMLName.create(xmlNode_QName0, true, false);
      xMLName1.addMatches(xMLList0, xML0);
      assertNotSame(xMLName0, xMLName1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = XMLName.accept("@3U");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = XMLName.accept("LY_In9");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(8615);
      boolean boolean0 = XMLName.accept(nativeInt32Array0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      XMLName xMLName0 = XMLName.formProperty("error reporter", "language version");
      boolean boolean0 = XMLName.accept(xMLName0);
      assertFalse(boolean0);
  }
}
