/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 20:43:37 GMT 2018
 */

package org.mozilla.javascript.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Component;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.debugger.MessageDialogWrapper;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MessageDialogWrapper_ESTest extends MessageDialogWrapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        MessageDialogWrapper.showMessageDialog((Component) null, "(aorg/mozilla/javascript/ScrKptable cjava/lang/Object;)Lorgmozilla/ avascript/ScriptalL;", "(aorg/mozilla/javascript/ScrKptable cjava/lang/Object;)Lorgmozilla/ avascript/ScriptalL;", 14);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JOptionPane: type must be one of JOptionPane.ERROR_MESSAGE, JOptionPane.INFORMATION_MESSAGE, JOptionPane.WARNING_MESSAGE, JOptionPane.QUESTION_MESSAGE or JOptionPane.PLAIN_MESSAGE
         //
         verifyException("javax.swing.JOptionPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MessageDialogWrapper messageDialogWrapper0 = new MessageDialogWrapper();
  }
}
