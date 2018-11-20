/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 01:54:38 GMT 2018
 */

package org.mozilla.javascript.commonjs.module;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URI;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.commonjs.module.Require;
import org.mozilla.javascript.commonjs.module.provider.DefaultUrlConnectionExpiryCalculator;
import org.mozilla.javascript.commonjs.module.provider.MultiModuleScriptProvider;
import org.mozilla.javascript.commonjs.module.provider.SoftCachingModuleScriptProvider;
import org.mozilla.javascript.commonjs.module.provider.UrlConnectionSecurityDomainProvider;
import org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.typedarrays.NativeUint32Array;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Require_ESTest extends Require_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context context0 = Context.enter();
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray(9);
      LinkedHashSet<SoftCachingModuleScriptProvider> linkedHashSet0 = new LinkedHashSet<SoftCachingModuleScriptProvider>();
      MultiModuleScriptProvider multiModuleScriptProvider0 = new MultiModuleScriptProvider(linkedHashSet0);
      Require require0 = new Require(context0, nativeUint8ClampedArray0, multiModuleScriptProvider0, (Script) null, (Script) null, false);
      // Undeclared exception!
      try { 
        require0.requireMain(context0, "error reporter");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constructor for \"Error\" not found.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Context context0 = Context.enter();
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      LinkedHashSet<SoftCachingModuleScriptProvider> linkedHashSet0 = new LinkedHashSet<SoftCachingModuleScriptProvider>();
      MultiModuleScriptProvider multiModuleScriptProvider0 = new MultiModuleScriptProvider(linkedHashSet0);
      Require require0 = new Require(context0, nativeUint8ClampedArray0, multiModuleScriptProvider0, (Script) null, (Script) null, true);
      require0.requireMain(context0, "ArrayBuffer");
      // Undeclared exception!
      try { 
        require0.requireMain((Context) null, "org.mozilla.javascript.commonjs.module.Require");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Main module already set to ArrayBuffer
         //
         verifyException("org.mozilla.javascript.commonjs.module.Require", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Context context0 = Context.enter();
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      LinkedHashSet<SoftCachingModuleScriptProvider> linkedHashSet0 = new LinkedHashSet<SoftCachingModuleScriptProvider>();
      MultiModuleScriptProvider multiModuleScriptProvider0 = new MultiModuleScriptProvider(linkedHashSet0);
      Require require0 = new Require(context0, nativeUint8ClampedArray0, multiModuleScriptProvider0, (Script) null, (Script) null, true);
      require0.requireMain(context0, "ArrayBuffer");
      Scriptable scriptable0 = require0.requireMain((Context) null, "ArrayBuffer");
      assertNull(scriptable0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array((NativeArrayBuffer) null, (-1), 4);
      DefaultUrlConnectionExpiryCalculator defaultUrlConnectionExpiryCalculator0 = new DefaultUrlConnectionExpiryCalculator();
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider((Iterable<URI>) null, (Iterable<URI>) null, defaultUrlConnectionExpiryCalculator0, (UrlConnectionSecurityDomainProvider) null);
      SoftCachingModuleScriptProvider softCachingModuleScriptProvider0 = new SoftCachingModuleScriptProvider(urlModuleSourceProvider0);
      Require require0 = new Require(context0, nativeUint16Array0, softCachingModuleScriptProvider0, (Script) null, (Script) null, false);
      int int0 = require0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array();
      Stack<SoftCachingModuleScriptProvider> stack0 = new Stack<SoftCachingModuleScriptProvider>();
      MultiModuleScriptProvider multiModuleScriptProvider0 = new MultiModuleScriptProvider(stack0);
      Require require0 = new Require(context0, nativeUint32Array0, multiModuleScriptProvider0, (Script) null, (Script) null, true);
      String string0 = require0.getFunctionName();
      assertEquals("require", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Context context0 = Context.enter();
      NativeObject nativeObject0 = new NativeObject();
      PriorityQueue<URI> priorityQueue0 = new PriorityQueue<URI>(17, (Comparator<? super URI>) null);
      DefaultUrlConnectionExpiryCalculator defaultUrlConnectionExpiryCalculator0 = new DefaultUrlConnectionExpiryCalculator(180);
      UrlConnectionSecurityDomainProvider urlConnectionSecurityDomainProvider0 = mock(UrlConnectionSecurityDomainProvider.class, new ViolatedAssumptionAnswer());
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(priorityQueue0, priorityQueue0, defaultUrlConnectionExpiryCalculator0, urlConnectionSecurityDomainProvider0);
      SoftCachingModuleScriptProvider softCachingModuleScriptProvider0 = new SoftCachingModuleScriptProvider(urlModuleSourceProvider0);
      Require require0 = new Require(context0, nativeObject0, softCachingModuleScriptProvider0, (Script) null, (Script) null, true);
      // Undeclared exception!
      try { 
        require0.construct(context0, nativeObject0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constructor for \"Error\" not found.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Context context0 = Context.enter();
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      LinkedHashSet<SoftCachingModuleScriptProvider> linkedHashSet0 = new LinkedHashSet<SoftCachingModuleScriptProvider>();
      MultiModuleScriptProvider multiModuleScriptProvider0 = new MultiModuleScriptProvider(linkedHashSet0);
      Require require0 = new Require(context0, nativeUint8ClampedArray0, multiModuleScriptProvider0, (Script) null, (Script) null, true);
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      require0.install(nativeArrayBuffer0);
      assertFalse(require0.isSealed());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Stack<URI> stack0 = new Stack<URI>();
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(stack0, stack0);
      SoftCachingModuleScriptProvider softCachingModuleScriptProvider0 = new SoftCachingModuleScriptProvider(urlModuleSourceProvider0);
      Require require0 = new Require(context0, importerTopLevel0, softCachingModuleScriptProvider0, (Script) null, (Script) null, false);
      // Undeclared exception!
      try { 
        require0.call(context0, importerTopLevel0, importerTopLevel0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.mozilla.javascript.NativeError@0000000001
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }
}
