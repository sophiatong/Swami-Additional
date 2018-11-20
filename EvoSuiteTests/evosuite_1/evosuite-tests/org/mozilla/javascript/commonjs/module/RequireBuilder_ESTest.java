/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 01:16:49 GMT 2018
 */

package org.mozilla.javascript.commonjs.module;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.commonjs.module.Require;
import org.mozilla.javascript.commonjs.module.RequireBuilder;
import org.mozilla.javascript.commonjs.module.provider.SoftCachingModuleScriptProvider;
import org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RequireBuilder_ESTest extends RequireBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RequireBuilder requireBuilder0 = new RequireBuilder();
      RequireBuilder requireBuilder1 = requireBuilder0.setSandboxed(false);
      assertSame(requireBuilder1, requireBuilder0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RequireBuilder requireBuilder0 = new RequireBuilder();
      RequireBuilder requireBuilder1 = requireBuilder0.setPreExec((Script) null);
      assertSame(requireBuilder1, requireBuilder0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RequireBuilder requireBuilder0 = new RequireBuilder();
      RequireBuilder requireBuilder1 = requireBuilder0.setPostExec((Script) null);
      assertSame(requireBuilder0, requireBuilder1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RequireBuilder requireBuilder0 = new RequireBuilder();
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(nativeArray0, nativeArray0);
      SoftCachingModuleScriptProvider softCachingModuleScriptProvider0 = new SoftCachingModuleScriptProvider(urlModuleSourceProvider0);
      RequireBuilder requireBuilder1 = requireBuilder0.setModuleScriptProvider(softCachingModuleScriptProvider0);
      assertSame(requireBuilder0, requireBuilder1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RequireBuilder requireBuilder0 = new RequireBuilder();
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.enter();
      Require require0 = requireBuilder0.createRequire(context0, nativeArray0);
      assertEquals(1, ScriptableObject.READONLY);
  }
}
