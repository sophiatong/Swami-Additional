/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 03:19:17 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.BeanProperty;
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.NativeJavaMethod;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BeanProperty_ESTest extends BeanProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MemberBox[] memberBoxArray0 = new MemberBox[0];
      NativeJavaMethod nativeJavaMethod0 = new NativeJavaMethod(memberBoxArray0, "Z|UNT&x");
      BeanProperty beanProperty0 = new BeanProperty((MemberBox) null, (MemberBox) null, nativeJavaMethod0);
  }
}
