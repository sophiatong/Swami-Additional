/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 21:57:45 GMT 2018
 */

package org.mozilla.javascript.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Component;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JTree;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.plaf.metal.MetalTreeUI;
import javax.swing.tree.TreePath;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.tools.debugger.Dim;
import org.mozilla.javascript.tools.debugger.VariableModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class VariableModel_ESTest extends VariableModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, dim0);
      Object object0 = new Object();
      variableModel0.valueForPathChanged((TreePath) null, object0);
      assertEquals(2, variableModel0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      variableModel0.setValueAt((Object) null, (Object) null, (-214748364));
      assertEquals(2, variableModel0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, "");
      BasicTreeUI basicTreeUI0 = new BasicTreeUI();
      BasicTreeUI.TreeModelHandler basicTreeUI_TreeModelHandler0 = basicTreeUI0.new TreeModelHandler();
      variableModel0.removeTreeModelListener(basicTreeUI_TreeModelHandler0);
      assertEquals(2, variableModel0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      boolean boolean0 = variableModel0.isLeaf(variableModel0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      boolean boolean0 = variableModel0.isCellEditable(integer0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, (Object) null);
      Object object0 = variableModel0.getValueAt((Object) null, 20);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      VariableModel variableModel0 = new VariableModel(dim0, (Object) null);
      Object object0 = variableModel0.getValueAt((Object) null, 1);
      assertEquals("undefined", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, (Object) null);
      // Undeclared exception!
      try { 
        variableModel0.getValueAt((Object) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.VariableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, dim0);
      Object object0 = variableModel0.getRoot();
      assertNotNull(object0);
      
      Object object1 = variableModel0.getValueAt(object0, 0);
      assertNotNull(object1);
      assertEquals("this", object1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      Object object0 = variableModel0.getRoot();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, dim0);
      Object object0 = variableModel0.getRoot();
      // Undeclared exception!
      try { 
        variableModel0.getIndexOfChild(object0, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.Dim$DimIProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      int int0 = variableModel0.getIndexOfChild("org.mozilla.javascript.tools.debugger.VariableModel$VariableNode", "org.mozilla.javascript.tools.debugger.VariableModel$VariableNode");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      String string0 = variableModel0.getColumnName(0);
      assertEquals(" Name", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      int int0 = variableModel0.getColumnCount();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, dim0);
      // Undeclared exception!
      try { 
        variableModel0.getChildCount((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.VariableModel$VariableNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      int int0 = variableModel0.getChildCount((Object) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, "msg.overlarge.backref");
      Class<?> class0 = variableModel0.getColumnClass(1);
      // Undeclared exception!
      try { 
        variableModel0.getChildCount(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Class cannot be cast to org.mozilla.javascript.tools.debugger.VariableModel$VariableNode
         //
         verifyException("org.mozilla.javascript.tools.debugger.VariableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, dim0);
      Object object0 = variableModel0.getRoot();
      // Undeclared exception!
      try { 
        variableModel0.getChild(object0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.Dim$DimIProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      VariableModel variableModel0 = new VariableModel(dim0, "msg.overlarge.backref");
      JTree jTree0 = new JTree(variableModel0);
      assertFalse(jTree0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      MetalTreeUI metalTreeUI0 = new MetalTreeUI();
      JTabbedPane jTabbedPane0 = new JTabbedPane();
      Component.BaselineResizeBehavior component_BaselineResizeBehavior0 = metalTreeUI0.getBaselineResizeBehavior(jTabbedPane0);
      Object object0 = variableModel0.getChild(component_BaselineResizeBehavior0, (-1));
      assertNull(object0);
  }
}
