/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 14:37:08 GMT 2018
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
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.xml.XMLObject;
import org.mozilla.javascript.xmlimpl.XML;
import org.mozilla.javascript.xmlimpl.XMLLibImpl;
import org.mozilla.javascript.xmlimpl.XMLList;
import org.mozilla.javascript.xmlimpl.XMLName;
import org.mozilla.javascript.xmlimpl.XMLObjectImpl;
import org.mozilla.javascript.xmlimpl.XmlNode;
import org.mozilla.javascript.xmlimpl.XmlProcessor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XMLList_ESTest extends XMLList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XMLName xMLName0 = XMLName.create((XmlNode.QName) null, false, false);
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      XMLList xMLList1 = (XMLList)xMLList0.valueOf();
      assertEquals("xml", xMLList1.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XMLName xMLName0 = XMLName.formStar();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.elements(xMLName0);
      xMLList0.replace((-1), xML0);
      // Undeclared exception!
      try { 
        xMLList0.toXMLString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      String string0 = xMLList0.toSource(4);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      xMLList0.replace((-1), xML0);
      XMLList xMLList1 = xMLList0.text();
      assertNotSame(xMLList1, xMLList0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XMLName xMLName0 = XMLName.create((XmlNode.QName) null, true, true);
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      xMLList0.replace((-1), xML0);
      // Undeclared exception!
      try { 
        xMLList0.putXMLProperty(xMLName0, xMLList0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can only set attributes on elements.
         //
         verifyException("org.mozilla.javascript.xmlimpl.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      xMLList0.replace((-1), xML0);
      xMLList0.putXMLProperty(xMLName0, xMLList0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, importerTopLevel0, (XMLObject) null, xmlNode0);
      XMLName xMLName0 = XMLName.create("msg.not.ctor", "msg.not.ctor");
      XMLList xMLList0 = xML0.child(xMLName0);
      Object object0 = ScriptableObject.getProperty((Scriptable) importerTopLevel0, 228);
      // Undeclared exception!
      try { 
        xMLList0.putXMLProperty(xMLName0, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, importerTopLevel0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      // Undeclared exception!
      try { 
        xMLList0.putXMLProperty(xMLName0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Assignment to empty XMLList without targets not supported
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      xMLList0.replace((-1), xML0);
      xMLList0.put(2, (Scriptable) xMLList0, (Object) xMLList0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(8);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, nativeUint16Array0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      xMLList0.replace((-1), xML0);
      xMLList0.put(0, (Scriptable) nativeUint16Array0, (Object) xML0);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "x.JvDSp[ezu*GUT)PUl");
      XML xML0 = new XML(xMLLibImpl0, nativeArrayBuffer0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.text();
      Object object0 = xMLList0.parent();
      // Undeclared exception!
      try { 
        xMLList0.put(0, (Scriptable) xMLList0, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(8);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, nativeUint16Array0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      xMLList0.put(0, (Scriptable) nativeUint16Array0, (Object) xML0);
      assertTrue(xML0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      boolean boolean0 = xMLList0.propertyIsEnumerable((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      Double double0 = new Double((-4196.133991256));
      boolean boolean0 = xMLList0.propertyIsEnumerable(double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, importerTopLevel0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      Short short0 = new Short((short)3791);
      boolean boolean0 = xMLList0.propertyIsEnumerable(short0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      xMLList0.replace((-1), xML0);
      XMLList xMLList1 = xMLList0.processingInstructions(xMLName0);
      assertNotSame(xMLList1, xMLList0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      xMLList0.replace((-1), xML0);
      xMLList0.normalize();
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      Context context0 = Context.getCurrentContext();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) xMLList0;
      Object object0 = xMLList0.jsConstructor(context0, false, objectArray0);
      assertSame(object0, xMLList0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      Object[] objectArray0 = xMLList0.getIds();
      Context context0 = Context.getCurrentContext();
      xMLList0.jsConstructor(context0, false, objectArray0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.child(4);
      Object[] objectArray0 = new Object[3];
      XMLList xMLList1 = (XMLList)xMLList0.jsConstructor((Context) null, false, objectArray0);
      assertTrue(xMLList1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(8);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, nativeUint16Array0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      xMLList0.replace((-1), xML0);
      xMLList0.remove();
      assertFalse(xMLList0.isSealed());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      xMLList0.replace((-1), xML0);
      String string0 = xMLList0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      String string0 = xMLList0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      boolean boolean0 = xMLList0.hasOwnProperty(xMLName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      xMLList0.replace((-1), xML0);
      boolean boolean0 = xMLList0.hasComplexContent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      boolean boolean0 = xMLList0.hasComplexContent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) xMLList0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      Object object0 = xMLList0.getXMLProperty(xMLName0);
      assertNotSame(object0, xMLList0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      // Undeclared exception!
      try { 
        xMLList0.put((-46), (Scriptable) xMLList0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "x.JvDSp[ezu*GUT)PUl");
      XML xML0 = new XML(xMLLibImpl0, nativeArrayBuffer0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.text();
      XML xML1 = xMLList0.getXML();
      assertNull(xML1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, importerTopLevel0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      xMLList0.replace((-1), xML0);
      boolean boolean0 = xMLList0.hasXMLProperty(xMLName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      XMLName xMLName0 = XMLName.create((XmlNode.QName) null, false, false);
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      XmlNode.InternalList xmlNode_InternalList0 = xMLList0.getNodeList();
      assertNotNull(xmlNode_InternalList0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      XMLName xMLName0 = XMLName.create((XmlNode.QName) null, false, false);
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      Object[] objectArray0 = xMLList0.getIdsForDebug();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      XMLLibImpl xMLLibImpl1 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      xMLList0.initialize(xMLLibImpl1, xML0, xML0);
      xMLList0.replace((-1), xML0);
      Object[] objectArray0 = xMLList0.getIds();
      assertEquals(1, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      XMLName xMLName0 = XMLName.create((XmlNode.QName) null, false, false);
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      xMLList0.replace((-1), xML0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      Scriptable scriptable0 = xMLList0.getExtraMethodSource(context0);
      assertSame(scriptable0, xML0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "x.JvDSp[ezu*GUT)PUl");
      XML xML0 = new XML(xMLLibImpl0, nativeArrayBuffer0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.text();
      Context context0 = Context.enter();
      Scriptable scriptable0 = xMLList0.getExtraMethodSource(context0);
      assertNull(scriptable0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, importerTopLevel0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      String string0 = xMLList0.getClassName();
      assertEquals("XMLList", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      xMLList0.replace((-1), xML0);
      NativeWith nativeWith0 = xMLList0.enterDotQuery((Scriptable) null);
      assertEquals("With", nativeWith0.getClassName());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "x.JvDSp[ezu*GUT)PUl");
      XML xML0 = new XML(xMLLibImpl0, nativeArrayBuffer0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.text();
      Object object0 = xMLList0.get(0, (Scriptable) xML0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      xMLList0.replace((-1), xML0);
      // Undeclared exception!
      try { 
        xMLList0.equivalentXml(xMLList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      boolean boolean0 = xMLList0.equivalentXml(xMLList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      xMLList0.replace((-1), xML0);
      XMLList xMLList1 = xMLList0.elements(xMLName0);
      assertNotSame(xMLList1, xMLList0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      xMLList0.replace((-1), xML0);
      xMLList0.deleteXMLProperty(xMLName0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(8);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, nativeUint16Array0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      xMLList0.delete(1);
      assertEquals("xml", xMLList0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      xMLList0.replace((-1), xML0);
      XMLObjectImpl xMLObjectImpl0 = xMLList0.copy();
      assertNotSame(xMLObjectImpl0, xMLList0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      xMLList0.replace((-1), xML0);
      boolean boolean0 = xMLList0.contains("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      XMLName xMLName0 = XMLName.create((XmlNode.QName) null, false, false);
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        xMLList0.construct(context0, xMLList0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: \"XMLList\" is not a constructor.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      xMLList0.replace((-1), xML0);
      XMLList xMLList1 = xMLList0.children();
      assertFalse(xMLList1.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      xMLList0.replace((-1), xML0);
      XMLList xMLList1 = xMLList0.child(xMLName0);
      assertNotSame(xMLList1, xMLList0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, importerTopLevel0, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      xMLList0.replace((-1), xML0);
      XMLList xMLList1 = xMLList0.child((-2834));
      assertNotSame(xMLList1, xMLList0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      Context context0 = Context.getCurrentContext();
      XMLName xMLName0 = XMLName.create("msg.not.ctor", "msg.not.ctor");
      XMLList xMLList0 = xML0.child(xMLName0);
      // Undeclared exception!
      try { 
        xMLList0.call(context0, xML0, importerTopLevel0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"msg.not.ctor\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      Context context0 = Context.getCurrentContext();
      XMLName xMLName0 = XMLName.create("call", "call");
      XMLList xMLList0 = xML0.child(xMLName0);
      // Undeclared exception!
      try { 
        xMLList0.call(context0, xML0, importerTopLevel0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: apply is not a function, it is {1}.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XMLName xMLName0 = XMLName.formStar();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.elements(xMLName0);
      xMLList0.replace((-1), xML0);
      XMLList xMLList1 = xMLList0.comments();
      assertNotSame(xMLList1, xMLList0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      XMLName xMLName0 = XMLName.create((XmlNode.QName) null, false, false);
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      xMLList0.replace((-1), xML0);
      xMLList0.addMatches(xMLList0, xMLName0);
      assertFalse(xMLList0.isSealed());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.child(4);
      // Undeclared exception!
      try { 
        xMLList0.call((Context) null, (Scriptable) null, xMLList0, (Object[]) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: org.mozilla.javascript.xmlimpl.XMLList@0000000010 is not a function, it is xml.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }
}
