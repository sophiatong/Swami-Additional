/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 21:48:43 GMT 2018
 */

package org.mozilla.javascript.tools.debugger.treetable;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Rectangle;
import java.awt.event.PaintEvent;
import java.util.Vector;
import javax.swing.JTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.debugger.treetable.AbstractCellEditor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCellEditor_ESTest extends AbstractCellEditor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      boolean boolean0 = abstractCellEditor0.stopCellEditing();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      JTable jTable0 = new JTable();
      Rectangle rectangle0 = new Rectangle(0, 3261, 1252, 0);
      PaintEvent paintEvent0 = new PaintEvent(jTable0, (-1), rectangle0);
      boolean boolean0 = abstractCellEditor0.shouldSelectCell(paintEvent0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      Vector<Integer> vector0 = new Vector<Integer>();
      JTable jTable0 = new JTable(vector0, vector0);
      abstractCellEditor0.removeCellEditorListener(jTable0);
      assertFalse(jTable0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      JTable jTable0 = new JTable();
      Rectangle rectangle0 = new Rectangle(0, 3261, 1252, 0);
      PaintEvent paintEvent0 = new PaintEvent(jTable0, (-1), rectangle0);
      boolean boolean0 = abstractCellEditor0.isCellEditable(paintEvent0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      Object object0 = abstractCellEditor0.getCellEditorValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      JTable jTable0 = new JTable();
      abstractCellEditor0.addCellEditorListener(jTable0);
      abstractCellEditor0.fireEditingStopped();
      assertTrue(abstractCellEditor0.stopCellEditing());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      abstractCellEditor0.fireEditingCanceled();
      assertTrue(abstractCellEditor0.stopCellEditing());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      abstractCellEditor0.cancelCellEditing();
      assertTrue(abstractCellEditor0.stopCellEditing());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      JTable jTable0 = new JTable();
      abstractCellEditor0.addCellEditorListener(jTable0);
      abstractCellEditor0.fireEditingCanceled();
      assertTrue(abstractCellEditor0.stopCellEditing());
  }
}
