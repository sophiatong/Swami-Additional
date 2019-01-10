/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 21:31:34 GMT 2018
 */

package org.mozilla.javascript.tools.idswitch;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.idswitch.FileBody;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FileBody_ESTest extends FileBody_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileBody fileBody0 = new FileBody();
      StringWriter stringWriter0 = new StringWriter();
      fileBody0.writeInitialData(stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileBody fileBody0 = new FileBody();
      StringWriter stringWriter0 = new StringWriter();
      fileBody0.writeData(stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileBody fileBody0 = new FileBody();
      boolean boolean0 = fileBody0.wasModified();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileBody fileBody0 = new FileBody();
      fileBody0.startLineLoop();
      assertEquals(0, fileBody0.getLineNumber());
      assertEquals(0, fileBody0.getLineBegin());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileBody fileBody0 = new FileBody();
      fileBody0.setReplacement(0, 12, "org.mozilla.javascript.tools.idswitch.FileBody");
      fileBody0.setReplacement(13, 0, "_r04ht");
      boolean boolean0 = fileBody0.setReplacement(0, (-1), "`");
      assertTrue(fileBody0.wasModified());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileBody fileBody0 = new FileBody();
      fileBody0.setReplacement(0, 12, "org.mozilla.javascript.tools.idswitch.FileBody");
      boolean boolean0 = fileBody0.setReplacement((-22), 10, ":}94");
      assertTrue(fileBody0.wasModified());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileBody fileBody0 = new FileBody();
      fileBody0.setReplacement(0, 38, "");
      fileBody0.setReplacement(0, 0, "rUSEG?-;L");
      boolean boolean0 = fileBody0.setReplacement(0, 1, "(");
      assertTrue(fileBody0.wasModified());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileBody fileBody0 = new FileBody();
      StringReader stringReader0 = new StringReader("(");
      fileBody0.readData(stringReader0);
      boolean boolean0 = fileBody0.nextLine();
      assertEquals(1, fileBody0.getLineNumber());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileBody fileBody0 = new FileBody();
      boolean boolean0 = fileBody0.nextLine();
      assertFalse(boolean0);
      assertEquals(0, fileBody0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileBody fileBody0 = new FileBody();
      int int0 = fileBody0.getLineNumber();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileBody fileBody0 = new FileBody();
      int int0 = fileBody0.getLineEnd();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileBody fileBody0 = new FileBody();
      int int0 = fileBody0.getLineBegin();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileBody fileBody0 = new FileBody();
      char[] charArray0 = fileBody0.getBuffer();
      assertEquals(16384, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileBody fileBody0 = new FileBody();
      fileBody0.setReplacement(3424, 3424, "QK>IY>?q0xVV");
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        fileBody0.writeData(stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileBody fileBody0 = new FileBody();
      StringReader stringReader0 = new StringReader("(");
      fileBody0.readData(stringReader0);
      boolean boolean0 = fileBody0.setReplacement(0, 1, "(");
      assertFalse(boolean0);
  }
}
