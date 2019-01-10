/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 00:05:13 GMT 2018
 */

package org.mozilla.javascript.commonjs.module;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.net.URI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.commonjs.module.ModuleScript;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ModuleScript_ESTest extends ModuleScript_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Script script0 = mock(Script.class, new ViolatedAssumptionAnswer());
      URI uRI0 = MockURI.URI("org.mozilla.javascript.commonjs.module.ModuleScript", "org.mozilla.javascript.commonjs.module.ModuleScript", "org.mozilla.javascript.commonjs.module.ModuleScript");
      ModuleScript moduleScript0 = new ModuleScript(script0, uRI0, uRI0);
      boolean boolean0 = moduleScript0.isSandboxed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Script script0 = mock(Script.class, new ViolatedAssumptionAnswer());
      ModuleScript moduleScript0 = new ModuleScript(script0, (URI) null, (URI) null);
      URI uRI0 = moduleScript0.getUri();
      assertNull(uRI0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Script script0 = mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(script0).toString();
      ModuleScript moduleScript0 = new ModuleScript(script0, (URI) null, (URI) null);
      Script script1 = moduleScript0.getScript();
      assertSame(script1, script0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Script script0 = mock(Script.class, new ViolatedAssumptionAnswer());
      ModuleScript moduleScript0 = new ModuleScript(script0, (URI) null, (URI) null);
      URI uRI0 = moduleScript0.getBase();
      assertNull(uRI0);
  }
}
