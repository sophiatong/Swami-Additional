/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 00:31:22 GMT 2018
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BeanProperty_ESTest extends BeanProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeJavaMethod nativeJavaMethod0 = new NativeJavaMethod((MemberBox) null, (String) null);
      BeanProperty beanProperty0 = new BeanProperty((MemberBox) null, (MemberBox) null, nativeJavaMethod0);
  }
}
