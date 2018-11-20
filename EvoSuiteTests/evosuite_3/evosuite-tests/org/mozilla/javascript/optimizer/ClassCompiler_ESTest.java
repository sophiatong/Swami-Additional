/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 03:42:49 GMT 2018
 */

package org.mozilla.javascript.optimizer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.optimizer.ClassCompiler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassCompiler_ESTest extends ClassCompiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ClassCompiler classCompiler0 = new ClassCompiler(compilerEnvirons0);
      classCompiler0.setMainMethodClass("i@4");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ClassCompiler classCompiler0 = new ClassCompiler(compilerEnvirons0);
      String string0 = classCompiler0.getMainMethodClass();
      assertEquals("org.mozilla.javascript.optimizer.OptRuntime", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ClassCompiler classCompiler0 = new ClassCompiler(compilerEnvirons0);
      classCompiler0.getCompilerEnv();
      assertEquals("org.mozilla.javascript.optimizer.OptRuntime", classCompiler0.getMainMethodClass());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ClassCompiler classCompiler0 = new ClassCompiler(compilerEnvirons0);
      Class<Object> class0 = Object.class;
      classCompiler0.setTargetExtends(class0);
      Object[] objectArray0 = classCompiler0.compileToClassFiles("", (String) null, 1000, "S| h!-80[nP");
      assertEquals(4, objectArray0.length);
      assertEquals("org.mozilla.javascript.optimizer.OptRuntime", classCompiler0.getMainMethodClass());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ClassCompiler classCompiler0 = new ClassCompiler(compilerEnvirons0);
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 4);
      classCompiler0.setTargetImplements(classArray0);
      // Undeclared exception!
      try { 
        classCompiler0.compileToClassFiles("xAz={N_Y9)'6[55L", "xAz={N_Y9)'6[55L", 811, "]7");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ClassCompiler classCompiler0 = new ClassCompiler(compilerEnvirons0);
      Object[] objectArray0 = classCompiler0.compileToClassFiles("xAz={N_Y9)'6[55L", "xAz={N_Y9)'6[55L", 811, "]7");
      assertEquals(2, objectArray0.length);
      assertEquals("org.mozilla.javascript.optimizer.OptRuntime", classCompiler0.getMainMethodClass());
  }
}
