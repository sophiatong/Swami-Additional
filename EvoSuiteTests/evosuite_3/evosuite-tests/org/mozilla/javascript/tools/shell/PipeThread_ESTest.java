/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 19:10:33 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.shell.PipeThread;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PipeThread_ESTest extends PipeThread_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      File file0 = MockFile.createTempFile("YIl9,wAV~]NW{vG ", "5c");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      PipeThread pipeThread0 = new PipeThread(true, mockFileInputStream0, mockPrintStream0);
      pipeThread0.run();
      assertFalse(pipeThread0.isInterrupted());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipeThread pipeThread0 = new PipeThread(false, pipedInputStream0, pipedOutputStream0);
      // Undeclared exception!
      try { 
        pipeThread0.run();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Wrapped java.io.IOException: Pipe not connected
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }
}
