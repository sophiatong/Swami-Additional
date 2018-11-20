/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 22:47:46 GMT 2018
 */

package org.mozilla.javascript.commonjs.module.provider;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.commonjs.module.provider.ParsedContentType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParsedContentType_ESTest extends ParsedContentType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParsedContentType parsedContentType0 = new ParsedContentType("Rv6h&<P;8`E,a(A5(VC");
      String string0 = parsedContentType0.getEncoding();
      assertNull(string0);
      assertEquals("Rv6h&<P", parsedContentType0.getContentType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParsedContentType parsedContentType0 = new ParsedContentType("I||>EsOMlqSJUR=t{J~");
      String string0 = parsedContentType0.getContentType();
      assertEquals("I||>EsOMlqSJUR=t{J~", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParsedContentType parsedContentType0 = new ParsedContentType("L;pY<;charset=W\" ");
      assertEquals("L", parsedContentType0.getContentType());
      assertEquals("W", parsedContentType0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ParsedContentType parsedContentType0 = null;
      try {
        parsedContentType0 = new ParsedContentType("XL;pY<;charset=\" ");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
