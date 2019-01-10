/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 18:31:41 GMT 2018
 */

package org.mozilla.javascript.regexp;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.regexp.SubString;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SubString_ESTest extends SubString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SubString subString0 = new SubString("", 1, 1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SubString subString0 = new SubString("");
      String string0 = subString0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SubString subString0 = new SubString();
      assertEquals("", subString0.toString());
  }
}
