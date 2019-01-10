/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 20:48:16 GMT 2018
 */

package org.mozilla.javascript.tools.debugger.treetable;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import java.math.RoundingMode;
import javax.swing.JLayeredPane;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.debugger.treetable.JTreeTable;
import org.mozilla.javascript.tools.debugger.treetable.TreeTableModel;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class JTreeTable_ESTest extends JTreeTable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TreeTableModel treeTableModel0 = mock(TreeTableModel.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null).when(treeTableModel0).getRoot();
      doReturn(0).when(treeTableModel0).getColumnCount();
      JTreeTable jTreeTable0 = new JTreeTable(treeTableModel0);
      JTreeTable.TreeTableCellRenderer jTreeTable_TreeTableCellRenderer0 = jTreeTable0.tree;
      jTreeTable_TreeTableCellRenderer0.setBounds(0, (-1293), 1624, (-1293));
      assertFalse(jTreeTable_TreeTableCellRenderer0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      KeyStroke keyStroke0 = KeyStroke.getKeyStroke(3028, 3028, true);
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      TreeTableModel treeTableModel0 = mock(TreeTableModel.class, new ViolatedAssumptionAnswer());
      doReturn(keyStroke0, (String) null, integer0, integer0).when(treeTableModel0).getRoot();
      doReturn(true).when(treeTableModel0).isLeaf(any());
      doReturn(3028, 3028, 3028, 3028, 3028).when(treeTableModel0).getColumnCount();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(treeTableModel0).getColumnName(anyInt());
      JTreeTable jTreeTable0 = new JTreeTable(treeTableModel0);
      DefaultTreeModel defaultTreeModel0 = new DefaultTreeModel((TreeNode) null);
      JTreeTable.TreeTableCellRenderer jTreeTable_TreeTableCellRenderer0 = jTreeTable0.new TreeTableCellRenderer(defaultTreeModel0);
      BufferedImage bufferedImage0 = new BufferedImage(12, 3028, 7);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      jTreeTable_TreeTableCellRenderer0.paint(sunGraphics2D0);
      assertEquals(0, sunGraphics2D0.transformState);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TreeTableModel treeTableModel0 = mock(TreeTableModel.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null).when(treeTableModel0).getRoot();
      doReturn(0).when(treeTableModel0).getColumnCount();
      JTreeTable jTreeTable0 = new JTreeTable(treeTableModel0);
      JTreeTable.TreeTableCellRenderer jTreeTable_TreeTableCellRenderer0 = jTreeTable0.tree;
      Component component0 = jTreeTable_TreeTableCellRenderer0.getTableCellRendererComponent(jTreeTable0, jTreeTable0, false, false, 0, 0);
      assertFalse(component0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.UP;
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      TreeTableModel treeTableModel0 = mock(TreeTableModel.class, new ViolatedAssumptionAnswer());
      doReturn(roundingMode0, integer0, integer0, integer0).when(treeTableModel0).getRoot();
      doReturn(true, true, true).when(treeTableModel0).isLeaf(any());
      doReturn((-4642)).when(treeTableModel0).getColumnCount();
      JTreeTable jTreeTable0 = new JTreeTable(treeTableModel0);
      JTreeTable.TreeTableCellRenderer jTreeTable_TreeTableCellRenderer0 = jTreeTable0.tree;
      Object object0 = new Object();
      JTreeTable.TreeTableCellRenderer jTreeTable_TreeTableCellRenderer1 = (JTreeTable.TreeTableCellRenderer)jTreeTable_TreeTableCellRenderer0.getTableCellRendererComponent(jTreeTable0, object0, true, true, (-4642), (-4642));
      assertFalse(jTreeTable_TreeTableCellRenderer1.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TreeTableModel treeTableModel0 = mock(TreeTableModel.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null).when(treeTableModel0).getRoot();
      doReturn((Class) null).when(treeTableModel0).getColumnClass(anyInt());
      doReturn(10, 0).when(treeTableModel0).getColumnCount();
      doReturn((String) null).when(treeTableModel0).getColumnName(anyInt());
      JTreeTable jTreeTable0 = new JTreeTable(treeTableModel0);
      JTreeTable.TreeTableCellEditor jTreeTable_TreeTableCellEditor0 = jTreeTable0.new TreeTableCellEditor();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jTreeTable0, 1071, 1071, 1071, 1071, (-3664), 635, 1071, 2571, true, 635, 635, 2571, 1543.1686);
      boolean boolean0 = jTreeTable_TreeTableCellEditor0.isCellEditable(mouseWheelEvent0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TreeTableModel treeTableModel0 = mock(TreeTableModel.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null).when(treeTableModel0).getRoot();
      doReturn(0).when(treeTableModel0).getColumnCount();
      JTreeTable jTreeTable0 = new JTreeTable(treeTableModel0);
      JTreeTable.TreeTableCellEditor jTreeTable_TreeTableCellEditor0 = jTreeTable0.new TreeTableCellEditor();
      Component component0 = jTreeTable_TreeTableCellEditor0.getTableCellEditorComponent(jTreeTable0, jTreeTable0, false, 839, (-1571));
      assertFalse(component0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      TreeTableModel treeTableModel0 = mock(TreeTableModel.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(treeTableModel0).getChildCount(any());
      doReturn((Object) null, integer0, integer0, integer0).when(treeTableModel0).getRoot();
      doReturn(false, false, false, false).when(treeTableModel0).isLeaf(any());
      doReturn(2948, 0).when(treeTableModel0).getColumnCount();
      doReturn((String) null).when(treeTableModel0).getColumnName(anyInt());
      JTreeTable jTreeTable0 = new JTreeTable(treeTableModel0);
      jTreeTable0.changeSelection(0, 142, true, false);
      assertFalse(jTreeTable0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.UP;
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      TreeTableModel treeTableModel0 = mock(TreeTableModel.class, new ViolatedAssumptionAnswer());
      doReturn(roundingMode0, integer0, integer0, integer0, integer0).when(treeTableModel0).getRoot();
      doReturn(true, true, true, true, true).when(treeTableModel0).isLeaf(any());
      doReturn((-4642)).when(treeTableModel0).getColumnCount();
      JTreeTable jTreeTable0 = new JTreeTable(treeTableModel0);
      jTreeTable0.updateUI();
      assertFalse(jTreeTable0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KeyStroke keyStroke0 = KeyStroke.getKeyStroke(24, 24, false);
      TreeTableModel treeTableModel0 = mock(TreeTableModel.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(treeTableModel0).getChildCount(any());
      doReturn(keyStroke0, keyStroke0, "}mBh{]Fu5i6", keyStroke0, keyStroke0).when(treeTableModel0).getRoot();
      doReturn(false, false, false, false, false).when(treeTableModel0).isLeaf(any());
      doReturn(24, 24, 0).when(treeTableModel0).getColumnCount();
      doReturn("}mBh{]Fu5i6", (String) null).when(treeTableModel0).getColumnName(anyInt());
      JTreeTable jTreeTable0 = new JTreeTable(treeTableModel0);
      DefaultTreeModel defaultTreeModel0 = new DefaultTreeModel((TreeNode) null, false);
      JTreeTable.TreeTableCellRenderer jTreeTable_TreeTableCellRenderer0 = jTreeTable0.new TreeTableCellRenderer(defaultTreeModel0);
      jTreeTable_TreeTableCellRenderer0.setRowHeight(24);
      assertFalse(jTreeTable_TreeTableCellRenderer0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TreeTableModel treeTableModel0 = mock(TreeTableModel.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null).when(treeTableModel0).getRoot();
      doReturn(0).when(treeTableModel0).getColumnCount();
      JTreeTable jTreeTable0 = new JTreeTable(treeTableModel0);
      JTree jTree0 = jTreeTable0.getTree();
      assertTrue(jTree0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TreeTableModel treeTableModel0 = mock(TreeTableModel.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null).when(treeTableModel0).getRoot();
      doReturn((Class) null).when(treeTableModel0).getColumnClass(anyInt());
      doReturn(0).when(treeTableModel0).getColumnCount();
      JTreeTable jTreeTable0 = new JTreeTable(treeTableModel0);
      int int0 = jTreeTable0.getEditingRow();
      assertEquals((-1), int0);
  }
}
