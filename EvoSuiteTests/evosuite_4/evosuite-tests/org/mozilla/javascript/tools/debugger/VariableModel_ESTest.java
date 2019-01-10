/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 20:28:06 GMT 2018
 */

package org.mozilla.javascript.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.DayOfWeek;
import java.time.chrono.ThaiBuddhistDate;
import javax.swing.JLayeredPane;
import javax.swing.JTree;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.plaf.synth.SynthTreeUI;
import javax.swing.tree.TreePath;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.tools.debugger.Dim;
import org.mozilla.javascript.tools.debugger.VariableModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class VariableModel_ESTest extends VariableModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      JTree jTree0 = new JTree();
      variableModel0.valueForPathChanged((TreePath) null, jTree0);
      assertFalse(jTree0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      Object object0 = new Object();
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      variableModel0.setValueAt(object0, integer0, 0);
      assertEquals(2, variableModel0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      SynthTreeUI synthTreeUI0 = new SynthTreeUI();
      BasicTreeUI.TreeModelHandler basicTreeUI_TreeModelHandler0 = synthTreeUI0.new TreeModelHandler();
      variableModel0.removeTreeModelListener(basicTreeUI_TreeModelHandler0);
      assertEquals(2, variableModel0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      Object object0 = new Object();
      boolean boolean0 = variableModel0.isLeaf(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      DayOfWeek dayOfWeek0 = DayOfWeek.SUNDAY;
      boolean boolean0 = variableModel0.isCellEditable(dayOfWeek0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, dim0);
      Object object0 = variableModel0.getRoot();
      Object object1 = variableModel0.getValueAt(object0, 3);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      VariableModel variableModel0 = new VariableModel(dim0, dim0);
      Object object0 = variableModel0.getRoot();
      Object object1 = variableModel0.getValueAt(object0, 1);
      assertNotNull(object1);
      assertEquals("undefined", object1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, dim0);
      Object object0 = variableModel0.getRoot();
      Object object1 = variableModel0.getValueAt(object0, 0);
      assertEquals("this", object1);
      assertNotNull(object1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, dim0);
      Object object0 = variableModel0.getRoot();
      // Undeclared exception!
      try { 
        variableModel0.getValueAt(object0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.VariableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      Object object0 = variableModel0.getRoot();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      ThaiBuddhistDate thaiBuddhistDate0 = MockThaiBuddhistDate.now();
      Object object0 = new Object();
      int int0 = variableModel0.getIndexOfChild(thaiBuddhistDate0, object0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      // Undeclared exception!
      try { 
        variableModel0.getColumnName(719);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 719
         //
         verifyException("org.mozilla.javascript.tools.debugger.VariableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel((Dim) null, (Object) null);
      int int0 = variableModel0.getColumnCount();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      // Undeclared exception!
      try { 
        variableModel0.getColumnClass(634);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 634
         //
         verifyException("org.mozilla.javascript.tools.debugger.VariableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, (Object) null);
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
      VariableModel variableModel0 = new VariableModel();
      Object object0 = variableModel0.getChild(variableModel0, 42);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, dim0);
      Object object0 = variableModel0.getRoot();
      // Undeclared exception!
      try { 
        variableModel0.getChild(object0, 5);
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
      VariableModel variableModel0 = new VariableModel(dim0, dim0);
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      Object object0 = variableModel0.getRoot();
      assertNotNull(object0);
      
      boolean boolean0 = variableModel0.isLeaf(object0);
      assertTrue(boolean0);
      
      int int0 = variableModel0.getIndexOfChild(object0, object0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      BasicTreeUI basicTreeUI0 = new BasicTreeUI();
      BasicTreeUI.TreeModelHandler basicTreeUI_TreeModelHandler0 = basicTreeUI0.new TreeModelHandler();
      variableModel0.addTreeModelListener(basicTreeUI_TreeModelHandler0);
      assertEquals(2, variableModel0.getColumnCount());
  }
}
