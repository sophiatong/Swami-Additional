/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 20:06:36 GMT 2018
 */

package org.mozilla.javascript.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.IllegalComponentStateException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSplitPane;
import javax.swing.KeyStroke;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.PopupMenuEvent;
import javax.swing.plaf.basic.BasicComboBoxEditor;
import javax.swing.plaf.metal.MetalDesktopIconUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.debugger.FileTextArea;
import org.mozilla.javascript.tools.debugger.FileWindow;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FileTextArea_ESTest extends FileTextArea_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      fileTextArea0.select(2);
      assertFalse(fileTextArea0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      fileTextArea0.setSize(2406, 2406);
      // Undeclared exception!
      try { 
        fileTextArea0.select(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.FileTextArea", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      fileTextArea0.select(0);
      assertFalse(fileTextArea0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      BasicComboBoxEditor.UIResource basicComboBoxEditor_UIResource0 = new BasicComboBoxEditor.UIResource();
      ActionEvent actionEvent0 = new ActionEvent(basicComboBoxEditor_UIResource0, 18, "", 1035, 2);
      PopupMenuEvent popupMenuEvent0 = new PopupMenuEvent(actionEvent0);
      fileTextArea0.popupMenuWillBecomeVisible(popupMenuEvent0);
      assertTrue(fileTextArea0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      BasicComboBoxEditor.UIResource basicComboBoxEditor_UIResource0 = new BasicComboBoxEditor.UIResource();
      PopupMenuEvent popupMenuEvent0 = new PopupMenuEvent(basicComboBoxEditor_UIResource0);
      fileTextArea0.popupMenuWillBecomeInvisible(popupMenuEvent0);
      assertTrue(fileTextArea0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      BasicComboBoxEditor.UIResource basicComboBoxEditor_UIResource0 = new BasicComboBoxEditor.UIResource();
      PopupMenuEvent popupMenuEvent0 = new PopupMenuEvent(basicComboBoxEditor_UIResource0);
      fileTextArea0.popupMenuCanceled(popupMenuEvent0);
      assertFalse(fileTextArea0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      MouseEvent mouseEvent0 = new MouseEvent(fileTextArea0, 127, 1035, 9, 179, 9, 127, false);
      fileTextArea0.mousePressed(mouseEvent0);
      assertFalse(mouseEvent0.isMetaDown());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      JSplitPane jSplitPane0 = new JSplitPane();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jSplitPane0, 127, 127, (-454), 80, 127, 80, (-454), 109, false, 0, (-454), 80, 0.0);
      fileTextArea0.mouseExited(mouseWheelEvent0);
      assertEquals(0, mouseWheelEvent0.getButton());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(fileTextArea0, (-2965), (-1L), (-2965), 2029, (-1910065438), (-3768), 2752, (-24), true, (-3768), (-1910065438), 8, (-3768));
      fileTextArea0.mouseEntered(mouseWheelEvent0);
      assertTrue(mouseWheelEvent0.isControlDown());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(fileTextArea0, 0, 0, 0, 0, 0, 0, 358, 1808, false, (-2761), 358, 1050, 1.0);
      fileTextArea0.mouseClicked(mouseWheelEvent0);
      assertEquals(1050, mouseWheelEvent0.getWheelRotation());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      MenuElement[] menuElementArray0 = new MenuElement[1];
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(fileTextArea0, (-15), 2, 53, 2, '<', menuElementArray0, (MenuSelectionManager) null);
      fileTextArea0.keyTyped(menuKeyEvent0);
      assertFalse(menuKeyEvent0.isControlDown());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      KeyEvent keyEvent0 = new KeyEvent(fileTextArea0, 1173, (-1L), (-973), 263, ':');
      fileTextArea0.keyReleased(keyEvent0);
      assertFalse(fileTextArea0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      KeyEvent keyEvent0 = new KeyEvent(fileTextArea0, 927, 3, 927, 127, '5');
      fileTextArea0.keyPressed(keyEvent0);
      assertFalse(fileTextArea0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(fileTextArea0, 1035, 4890909195324358655L, (-26), 2, (-496), (-1), 10000, 712, false, 95, (-2261), (-2018));
      fileTextArea0.mouseReleased(mouseWheelEvent0);
      assertEquals(1035, mouseWheelEvent0.getID());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(fileTextArea0, 2, 2, 2, 2, 2, 2, 2, 2, true, 2, 2, 2, 2);
      // Undeclared exception!
      try { 
        fileTextArea0.mousePressed(mouseWheelEvent0);
        fail("Expecting exception: IllegalComponentStateException");
      
      } catch(IllegalComponentStateException e) {
         //
         // component must be showing on the screen to determine its location
         //
         verifyException("java.awt.Component", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem();
      ActionEvent actionEvent0 = new ActionEvent(jRadioButtonMenuItem0, 'H', "Run", 'H', 2);
      // Undeclared exception!
      try { 
        fileTextArea0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.FileTextArea", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MetalDesktopIconUI metalDesktopIconUI0 = new MetalDesktopIconUI();
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      ActionEvent actionEvent0 = new ActionEvent(metalDesktopIconUI0, 1887, "Clear Breakpoint");
      // Undeclared exception!
      try { 
        fileTextArea0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.FileTextArea", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      KeyStroke keyStroke0 = KeyStroke.getKeyStroke(1, (-268));
      ActionEvent actionEvent0 = new ActionEvent(keyStroke0, 2, "H`^;R<mL-P[");
      Dimension dimension0 = fileTextArea0.getMaximumSize();
      fileTextArea0.setSize(dimension0);
      fileTextArea0.actionPerformed(actionEvent0);
      assertEquals(0L, actionEvent0.getWhen());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      ActionEvent actionEvent0 = new ActionEvent(fileTextArea0, 2304, "Set Breakpoint", 2304, 2304);
      // Undeclared exception!
      try { 
        fileTextArea0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.FileTextArea", e);
      }
  }
}
