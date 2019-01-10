/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 22:39:51 GMT 2018
 */

package org.mozilla.javascript.commonjs.module.provider;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;
import org.mozilla.javascript.commonjs.module.provider.DefaultUrlConnectionExpiryCalculator;
import org.mozilla.javascript.commonjs.module.provider.ModuleSource;
import org.mozilla.javascript.commonjs.module.provider.UrlConnectionExpiryCalculator;
import org.mozilla.javascript.commonjs.module.provider.UrlConnectionSecurityDomainProvider;
import org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class UrlModuleSourceProvider_ESTest extends UrlModuleSourceProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayDeque<URI> arrayDeque0 = new ArrayDeque<URI>();
      ArrayList<URI> arrayList0 = new ArrayList<URI>();
      DefaultUrlConnectionExpiryCalculator defaultUrlConnectionExpiryCalculator0 = new DefaultUrlConnectionExpiryCalculator();
      UrlConnectionSecurityDomainProvider urlConnectionSecurityDomainProvider0 = mock(UrlConnectionSecurityDomainProvider.class, new ViolatedAssumptionAnswer());
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(arrayList0, arrayDeque0, defaultUrlConnectionExpiryCalculator0, urlConnectionSecurityDomainProvider0);
      ModuleSource moduleSource0 = urlModuleSourceProvider0.loadFromFallbackLocations("", arrayList0);
      assertNull(moduleSource0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<URI> arrayList0 = new ArrayList<URI>();
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(arrayList0, (Iterable<URI>) null, (UrlConnectionExpiryCalculator) null, (UrlConnectionSecurityDomainProvider) null);
      Object object0 = new Object();
      ModuleSource moduleSource0 = urlModuleSourceProvider0.loadFromFallbackLocations(".", object0);
      assertNull(moduleSource0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PriorityQueue<URI> priorityQueue0 = new PriorityQueue<URI>(969);
      HashSet<URI> hashSet0 = new HashSet<URI>();
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(priorityQueue0, hashSet0);
      URI uRI0 = MockURI.aFTPURI;
      // Undeclared exception!
      try { 
        urlModuleSourceProvider0.loadFromUri(uRI0, uRI0, "$\"vC{fKB,'W!");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://foo.bar.js");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      ArrayDeque<URI> arrayDeque0 = new ArrayDeque<URI>();
      ArrayList<URI> arrayList0 = new ArrayList<URI>();
      DefaultUrlConnectionExpiryCalculator defaultUrlConnectionExpiryCalculator0 = new DefaultUrlConnectionExpiryCalculator();
      Object object0 = new Object();
      UrlConnectionSecurityDomainProvider urlConnectionSecurityDomainProvider0 = mock(UrlConnectionSecurityDomainProvider.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(urlConnectionSecurityDomainProvider0).getSecurityDomain(any(java.net.URLConnection.class));
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(arrayList0, arrayDeque0, defaultUrlConnectionExpiryCalculator0, urlConnectionSecurityDomainProvider0);
      URI uRI0 = MockURI.aHttpURI;
      arrayList0.add(uRI0);
      ModuleSource moduleSource0 = urlModuleSourceProvider0.loadFromPrivilegedLocations("", "");
      assertNotNull(moduleSource0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://foo.bar.js");
      ArrayList<URI> arrayList0 = new ArrayList<URI>();
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(arrayList0, (Iterable<URI>) null, (UrlConnectionExpiryCalculator) null, (UrlConnectionSecurityDomainProvider) null);
      boolean boolean0 = urlModuleSourceProvider0.entityNeedsRevalidation(evoSuiteURL0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedHashSet<URI> linkedHashSet0 = new LinkedHashSet<URI>(2817);
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(linkedHashSet0, linkedHashSet0);
      URI uRI0 = MockURI.aHttpURI;
      Integer integer0 = new Integer(2817);
      try { 
        urlModuleSourceProvider0.loadFromActualUri(uRI0, uRI0, integer0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: foo.bar
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }
}
