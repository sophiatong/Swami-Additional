/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 02:28:24 GMT 2018
 */

package org.mozilla.javascript.commonjs.module.provider;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.commonjs.module.ModuleScript;
import org.mozilla.javascript.commonjs.module.provider.SoftCachingModuleScriptProvider;
import org.mozilla.javascript.commonjs.module.provider.StrongCachingModuleScriptProvider;
import org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CachingModuleScriptProviderBase_ESTest extends CachingModuleScriptProviderBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(nativeArray0, nativeArray0);
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://foo.bar.js");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "org.mozilla.javascript.commonjs.module.provider.CachingModuleScriptProviderBase");
      Context context0 = Context.getCurrentContext();
      StrongCachingModuleScriptProvider strongCachingModuleScriptProvider0 = new StrongCachingModuleScriptProvider(urlModuleSourceProvider0);
      URI uRI0 = MockURI.aHttpURI;
      try { 
        strongCachingModuleScriptProvider0.getModuleScript(context0, "language version", uRI0, uRI0, nativeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.commonjs.module.provider.CachingModuleScriptProviderBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(nativeArray0, nativeArray0);
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://foo.bar.js");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "org.mozilla.javascript.commonjs.module.provider.CachingModuleScriptProviderBase$CachedModuleScript");
      Context context0 = Context.getCurrentContext();
      URI uRI0 = MockURI.aHttpURI;
      SoftCachingModuleScriptProvider softCachingModuleScriptProvider0 = new SoftCachingModuleScriptProvider(urlModuleSourceProvider0);
      try { 
        softCachingModuleScriptProvider0.getModuleScript(context0, "org.mozilla.javascript.commonjs.module.provider.CachingModuleScriptProviderBase$CachedModuleScript", uRI0, uRI0, nativeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.commonjs.module.provider.CachingModuleScriptProviderBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(nativeArray0, nativeArray0);
      Context context0 = Context.getCurrentContext();
      URI uRI0 = MockURI.aHttpURI;
      SoftCachingModuleScriptProvider softCachingModuleScriptProvider0 = new SoftCachingModuleScriptProvider(urlModuleSourceProvider0);
      ModuleScript moduleScript0 = softCachingModuleScriptProvider0.getModuleScript(context0, "error reporter", (URI) null, uRI0, nativeArray0);
      assertNull(moduleScript0);
  }
}
