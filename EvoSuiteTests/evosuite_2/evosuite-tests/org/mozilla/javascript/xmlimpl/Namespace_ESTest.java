/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 15:54:52 GMT 2018
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
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.xml.XMLObject;
import org.mozilla.javascript.xmlimpl.Namespace;
import org.mozilla.javascript.xmlimpl.QName;
import org.mozilla.javascript.xmlimpl.XML;
import org.mozilla.javascript.xmlimpl.XMLLibImpl;
import org.mozilla.javascript.xmlimpl.XMLList;
import org.mozilla.javascript.xmlimpl.XmlNode;
import org.mozilla.javascript.xmlimpl.XmlProcessor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Namespace_ESTest extends Namespace_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Namespace.toSourceImpl("R:MyF2].%", "R:MyF2].%", stringBuilder0);
      assertEquals("new Namespace('R:MyF2].%', 'R:MyF2].%')", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("");
      Namespace.toSourceImpl("", "", stringBuilder0);
      assertEquals("new Namespace()", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("IMg");
      Namespace namespace0 = Namespace.create(nativeInt16Array0, (Namespace) null, xmlNode_Namespace0);
      String string0 = namespace0.toLocaleString();
      assertEquals("IMg", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("");
      Namespace namespace0 = Namespace.create(baseFunction0, (Namespace) null, xmlNode_Namespace0);
      namespace0.hashCode();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "ArrayBuffer", "ArrayBuffer");
      XmlNode.QName xmlNode_QName0 = xmlNode0.getQname();
      XmlNode.Namespace xmlNode_Namespace0 = xmlNode_QName0.getNamespace();
      Namespace namespace0 = Namespace.create(nativeArrayBuffer0, (Namespace) null, xmlNode_Namespace0);
      // Undeclared exception!
      try { 
        namespace0.getInstanceIdValue(4);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 4
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      Namespace namespace0 = Namespace.create(baseFunction0, (Namespace) null, xmlNode_Namespace0);
      Object object0 = namespace0.getInstanceIdValue(1);
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      Namespace namespace0 = Namespace.create((Scriptable) null, (Namespace) null, xmlNode_Namespace0);
      // Undeclared exception!
      try { 
        namespace0.getInstanceIdName(13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(197);
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      Namespace namespace0 = Namespace.create(nativeUint16Array0, (Namespace) null, xmlNode_Namespace0);
      XmlNode.Namespace xmlNode_Namespace1 = namespace0.getDelegate();
      assertSame(xmlNode_Namespace1, xmlNode_Namespace0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("4&Y26!K", "4&Y26!K");
      Namespace namespace0 = Namespace.create(baseFunction0, (Namespace) null, xmlNode_Namespace0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(baseFunction0, namespace0, 13, "4&Y26!K", 13, namespace0);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        namespace0.execIdCall(idFunctionObject0, context0, namespace0, namespace0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=13 MASTER=org.mozilla.javascript.BaseFunction@3
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "ArrayBuffer", "ArrayBuffer");
      XmlNode.QName xmlNode_QName0 = xmlNode0.getQname();
      XmlNode.Namespace xmlNode_Namespace0 = xmlNode_QName0.getNamespace();
      Namespace namespace0 = Namespace.create(nativeArrayBuffer0, (Namespace) null, xmlNode_Namespace0);
      Object object0 = namespace0.equivalentValues(namespace0);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      Namespace namespace0 = Namespace.create((Scriptable) null, (Namespace) null, xmlNode_Namespace0);
      boolean boolean0 = namespace0.equals(namespace0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("ZGB&zQ457xDxz!tLk[s", "");
      Namespace namespace0 = Namespace.create(nativeJavaObject0, (Namespace) null, xmlNode_Namespace0);
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XMLList xMLList0 = new XMLList(xMLLibImpl0, (Scriptable) null, (XMLObject) null);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, (String) null, "");
      XML xML0 = new XML(xMLLibImpl0, nativeJavaObject0, xMLList0, xmlNode0);
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, (String) null);
      QName qName0 = xML0.newQName(xmlNode_QName0);
      Namespace namespace1 = namespace0.castToNamespace(qName0);
      assertTrue(namespace1.equals((Object)namespace0));
      assertEquals("ZGB&zQ457xDxz!tLk[s", namespace1.prefix());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("ZGB&zQ457xDxz!tLk[s", "");
      Namespace namespace0 = Namespace.create(nativeJavaObject0, (Namespace) null, xmlNode_Namespace0);
      assertNotNull(namespace0);
      
      Namespace namespace1 = namespace0.constructNamespace(namespace0);
      assertEquals("ZGB&zQ457xDxz!tLk[s", namespace1.prefix());
      assertEquals("", namespace1.toLocaleString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      Namespace namespace0 = Namespace.create(baseFunction0, (Namespace) null, xmlNode_Namespace0);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        namespace0.defineOwnProperties(context0, namespace0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Expected argument of type object, but instead had type string
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }
}
