/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 21:10:00 GMT 2018
 */

package org.mozilla.javascript.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.tools.debugger.Dim;
import org.mozilla.javascript.tools.debugger.GuiCallback;
import org.mozilla.javascript.tools.debugger.ScopeProvider;
import org.mozilla.javascript.tools.debugger.SourceProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Dim_ESTest extends Dim_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      // Undeclared exception!
      try { 
        dim0.objectToString((Object) null);
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      ScopeProvider scopeProvider0 = mock(ScopeProvider.class, new ViolatedAssumptionAnswer());
      dim0.setScopeProvider(scopeProvider0);
      // Undeclared exception!
      try { 
        dim0.evalScript("language version", "language version");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Dim.ContextData dim_ContextData0 = new Dim.ContextData();
      // Undeclared exception!
      try { 
        dim_ContextData0.getFrame(9);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // -10 \u2209 [0, 0)
         //
         verifyException("org.mozilla.javascript.ObjArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Dim.ContextData.get((Context) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.Dim$ContextData", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Dim.ContextData dim_ContextData0 = new Dim.ContextData();
      int int0 = dim_ContextData0.frameCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      // Undeclared exception!
      try { 
        dim0.stringIsCompilableUnit("language version");
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Dim dim0 = new Dim();
      Dim.SourceInfo dim_SourceInfo0 = dim0.sourceInfo("x");
      assertNull(dim_SourceInfo0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Dim dim0 = new Dim();
      SourceProvider sourceProvider0 = mock(SourceProvider.class, new ViolatedAssumptionAnswer());
      dim0.setSourceProvider(sourceProvider0);
      assertEquals(1, Dim.STEP_INTO);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setReturnValue(1098);
      assertEquals(3, Dim.GO);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setGuiCallback((GuiCallback) null);
      assertEquals(5, Dim.EXIT);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreakOnReturn(false);
      assertEquals(2, Dim.STEP_OUT);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreakOnExceptions(false);
      assertEquals(2, Dim.STEP_OUT);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreakOnEnter(false);
      assertEquals(3, Dim.GO);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreak();
      assertEquals(2, Dim.STEP_OUT);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      // Undeclared exception!
      try { 
        dim0.objectToString(contextFactory0);
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.go();
      assertEquals(5, Dim.EXIT);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      // Undeclared exception!
      try { 
        dim0.getObjectProperty(importerTopLevel0, contextFactory0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mozilla.javascript.ContextFactory cannot be cast to java.lang.Integer
         //
         verifyException("org.mozilla.javascript.tools.debugger.Dim", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        dim0.getObjectProperty(nativeObject0, "org.mozilla.javascript.ContextFactory@0000000004");
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      // Undeclared exception!
      try { 
        dim0.getObjectIds(contextFactory0);
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ImporterTopLevel", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Dim dim0 = new Dim();
      Dim.FunctionSource dim_FunctionSource0 = dim0.functionSourceByName("Failed to load source from ");
      assertNull(dim_FunctionSource0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Dim dim0 = new Dim();
      String[] stringArray0 = dim0.functionNames();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Dim dim0 = new Dim();
      String string0 = dim0.eval((String) null);
      assertEquals("undefined", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.dispose();
      assertEquals(1, Dim.STEP_INTO);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      dim0.detach();
      assertEquals(3, Dim.GO);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Dim dim0 = new Dim();
      String string0 = dim0.eval("error reporter");
      assertEquals("undefined", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.contextSwitch(98);
      assertEquals(1, Dim.STEP_INTO);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Dim dim0 = new Dim();
      // Undeclared exception!
      try { 
        dim0.compileScript("language version", "error reporter");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.Dim$DimIProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.clearAllBreakpoints();
      assertEquals(3, Dim.GO);
  }
}
