/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 00:05:05 GMT 2018
 */

package org.mozilla.javascript.commonjs.module;

import org.junit.Test;
import static org.junit.Assert.*;
import java.net.URI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;
import org.mozilla.javascript.commonjs.module.ModuleScope;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ModuleScope_ESTest extends ModuleScope_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      URI uRI0 = MockURI.aHttpURI;
      ModuleScope moduleScope0 = new ModuleScope(nativeArrayBuffer0, uRI0, uRI0);
      URI uRI1 = moduleScope0.getUri();
      assertNull(uRI1.getRawUserInfo());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      URI uRI0 = MockURI.aHttpURI;
      ModuleScope moduleScope0 = new ModuleScope(nativeArrayBuffer0, uRI0, uRI0);
      URI uRI1 = moduleScope0.getBase();
      assertFalse(uRI1.isOpaque());
  }
}
