/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 16:40:01 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.Symbol;
import org.mozilla.javascript.ast.WhileLoop;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Symbol_ESTest extends Symbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Symbol symbol0 = new Symbol(88, "Invalid declType: ");
      WhileLoop whileLoop0 = new WhileLoop();
      symbol0.setNode(whileLoop0);
      String string0 = symbol0.toString();
      assertEquals("Symbol (LP) name=Invalid declType:  line=-1", string0);
      assertEquals(88, symbol0.getDeclType());
      assertEquals((-1), symbol0.getIndex());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Symbol symbol0 = new Symbol(155, "return");
      symbol0.setIndex(2);
      assertEquals(2, symbol0.getIndex());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Symbol symbol0 = new Symbol(155, "return");
      // Undeclared exception!
      try { 
        symbol0.setDeclType(20);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid declType: 20
         //
         verifyException("org.mozilla.javascript.ast.Symbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Symbol symbol0 = new Symbol(88, "Invalid declType: ");
      symbol0.setContainingTable((Scope) null);
      assertEquals((-1), symbol0.getIndex());
      assertEquals(88, symbol0.getDeclType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Symbol symbol0 = new Symbol(155, "return");
      symbol0.getNode();
      assertEquals(155, symbol0.getDeclType());
      assertEquals((-1), symbol0.getIndex());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Symbol symbol0 = new Symbol();
      symbol0.getName();
      assertEquals((-1), symbol0.getIndex());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Symbol symbol0 = new Symbol(88, "Invalid declType: ");
      int int0 = symbol0.getIndex();
      assertEquals((-1), int0);
      assertEquals(88, symbol0.getDeclType());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Symbol symbol0 = new Symbol(88, "Invalid declType: ");
      symbol0.getContainingTable();
      assertEquals(88, symbol0.getDeclType());
      assertEquals((-1), symbol0.getIndex());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Symbol symbol0 = new Symbol();
      int int0 = symbol0.getDeclType();
      assertEquals(0, int0);
      assertEquals((-1), symbol0.getIndex());
  }
}
