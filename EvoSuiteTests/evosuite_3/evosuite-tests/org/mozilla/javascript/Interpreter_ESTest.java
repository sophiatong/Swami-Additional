/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 17:53:29 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.InterpretedFunction;
import org.mozilla.javascript.InterpreterData;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.typedarrays.NativeInt8Array;
import org.mozilla.javascript.typedarrays.NativeUint16Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      contextFactory0.makeContext();
      Object[] objectArray0 = new Object[9];
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      InterpretedFunction.createFunction(context0, importerTopLevel0, (InterpreterData) null, (Object) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(400, (String) null, (String) null, false);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData((-1313), "", "", true);
      InterpreterData interpreterData1 = new InterpreterData(interpreterData0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-48);
      interpreterData1.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Context.getCurrentContext();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(140);
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(3);
      NativeWith nativeWith0 = new NativeWith(nativeUint16Array0, nativeInt8Array0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EcmaError ecmaError0 = null;
      try {
        ecmaError0 = new EcmaError("19=serbRdP3o", "19=serbRdP3o", "19=serbRdP3o", 57, "19=serbRdP3o", 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData((-1313), "", "", true);
      InterpreterData interpreterData1 = new InterpreterData(interpreterData0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-45);
      interpreterData1.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData((-1313), "", "", true);
      InterpreterData interpreterData1 = new InterpreterData(interpreterData0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-9);
      interpreterData1.itsICode = byteArray0;
  }
}
