/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 14:43:16 GMT 2018
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
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeJavaArray;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.xml.XMLObject;
import org.mozilla.javascript.xmlimpl.XML;
import org.mozilla.javascript.xmlimpl.XMLCtor;
import org.mozilla.javascript.xmlimpl.XMLLibImpl;
import org.mozilla.javascript.xmlimpl.XmlNode;
import org.mozilla.javascript.xmlimpl.XmlProcessor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class XMLCtor_ESTest extends XMLCtor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      Delegator delegator0 = new Delegator();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "ArrayBuffer", "ArrayBuffer");
      XML xML0 = new XML(xMLLibImpl0, delegator0, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, nativeArrayBuffer0, 0, 8);
      xMLCtor0.setInstanceIdValue(4, nativeArrayBuffer0);
      assertEquals("object", nativeArrayBuffer0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "bind");
      XML xML0 = new XML(xMLLibImpl0, nativeFloat32Array0, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, (Object) null, 8, 1);
      XmlNode.Filter xmlNode_Filter0 = XmlNode.Filter.TEXT;
      // Undeclared exception!
      try { 
        xMLCtor0.setInstanceIdValue(9, xmlNode_Filter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLCtor", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      Context context0 = Context.enter();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      Scriptable scriptable0 = context0.newArray((Scriptable) nativeUint16Array0, 0);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "language version");
      XML xML0 = new XML(xMLLibImpl0, scriptable0, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, xmlProcessor0, 200, 8);
      // Undeclared exception!
      try { 
        xMLCtor0.setInstanceIdValue(6, context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLCtor", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      Delegator delegator0 = new Delegator();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "ArrayBuffer", "ArrayBuffer");
      XML xML0 = new XML(xMLLibImpl0, delegator0, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, nativeArrayBuffer0, 0, 8);
      // Undeclared exception!
      try { 
        xMLCtor0.initPrototypeId(8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLCtor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "msg.varjrges.cto");
      XML xML0 = new XML(xMLLibImpl0, nativeFloat32Array0, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, (Object) null, 8, 1);
      boolean boolean0 = xMLCtor0.hasInstance(xML0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      Context context0 = Context.enter();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      Scriptable scriptable0 = context0.newArray((Scriptable) nativeUint16Array0, 0);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "error reporter");
      XML xML0 = new XML(xMLLibImpl0, scriptable0, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, context0, 2, 0);
      // Undeclared exception!
      try { 
        xMLCtor0.getInstanceIdValue(10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLCtor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      Context context0 = Context.enter();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(180);
      Scriptable scriptable0 = context0.newArray((Scriptable) nativeUint16Array0, 0);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, scriptable0, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, xmlProcessor0, 5, 15);
      // Undeclared exception!
      try { 
        xMLCtor0.getInstanceIdValue(9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLCtor", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "msg.varjrges.cto");
      XML xML0 = new XML(xMLLibImpl0, nativeFloat32Array0, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, (Object) null, 8, 1);
      // Undeclared exception!
      try { 
        xMLCtor0.getInstanceIdValue(8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLCtor", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "F m)u, Y-");
      XML xML0 = new XML(xMLLibImpl0, nativeFloat32Array0, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, (Object) null, 8, 1);
      // Undeclared exception!
      try { 
        xMLCtor0.getInstanceIdValue(6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLCtor", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, nativeFloat32Array0, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, (Object) null, 8, 1);
      Class<NativeJavaArray> class0 = NativeJavaArray.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getTypedProperty((Scriptable) xMLCtor0, "ignoreProcessingInstructions", class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLCtor", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      Context context0 = Context.enter();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      Scriptable scriptable0 = context0.newArray((Scriptable) nativeUint16Array0, 0);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "language version");
      XML xML0 = new XML(xMLLibImpl0, scriptable0, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, xmlProcessor0, 200, 8);
      Object[] objectArray0 = xMLCtor0.getAllIds();
      assertEquals(12, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, nativeArray0, (XMLObject) null, xmlNode0);
      XMLCtor xMLCtor0 = new XMLCtor(xML0, xmlProcessor0, 5, 15);
      // Undeclared exception!
      try { 
        xMLCtor0.execIdCall(xMLCtor0, context0, xMLCtor0, (Scriptable) null, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=5 MASTER=
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }
}
