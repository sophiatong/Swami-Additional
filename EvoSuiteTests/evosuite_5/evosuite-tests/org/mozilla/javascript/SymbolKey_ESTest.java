/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 03:29:52 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.NativeSymbol;
import org.mozilla.javascript.SymbolKey;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SymbolKey_ESTest extends SymbolKey_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SymbolKey symbolKey0 = new SymbolKey((String) null);
      String string0 = symbolKey0.ITERATOR.toString();
      assertEquals("Symbol(Symbol.iterator)", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SymbolKey symbolKey0 = SymbolKey.UNSCOPABLES;
      symbolKey0.hashCode();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SymbolKey symbolKey0 = new SymbolKey((String) null);
      String string0 = symbolKey0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SymbolKey symbolKey0 = SymbolKey.IS_REGEXP;
      NativeSymbol nativeSymbol0 = mock(NativeSymbol.class, new ViolatedAssumptionAnswer());
      NativeSymbol nativeSymbol1 = new NativeSymbol(nativeSymbol0);
      boolean boolean0 = symbolKey0.equals(nativeSymbol1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SymbolKey symbolKey0 = SymbolKey.IS_CONCAT_SPREADABLE;
      boolean boolean0 = symbolKey0.equals(symbolKey0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SymbolKey symbolKey0 = new SymbolKey((String) null);
      boolean boolean0 = symbolKey0.equals("Symbol()");
      assertFalse(boolean0);
  }
}
