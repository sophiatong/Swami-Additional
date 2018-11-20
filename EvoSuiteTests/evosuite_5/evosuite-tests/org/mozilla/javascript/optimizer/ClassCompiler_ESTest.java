/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 05:12:59 GMT 2018
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
      classCompiler0.setMainMethodClass("");
      assertEquals("", classCompiler0.getMainMethodClass());
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
      Class<String> class0 = String.class;
      classCompiler0.setTargetExtends(class0);
      Object[] objectArray0 = classCompiler0.compileToClassFiles("naErro", "naErro", 1519, "naErro");
      assertEquals(4, objectArray0.length);
      assertEquals("org.mozilla.javascript.optimizer.OptRuntime", classCompiler0.getMainMethodClass());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ClassCompiler classCompiler0 = new ClassCompiler(compilerEnvirons0);
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 10);
      classCompiler0.setTargetImplements(classArray0);
      // Undeclared exception!
      try { 
        classCompiler0.compileToClassFiles("msg.max.lt.min", "msg.max.lt.min", 3066, "msg.max.lt.min");
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
      Object[] objectArray0 = classCompiler0.compileToClassFiles("msg.max.lt.min", "msg.max.lt.min", 3066, "msg.max.lt.min");
      assertEquals("org.mozilla.javascript.optimizer.OptRuntime", classCompiler0.getMainMethodClass());
      assertEquals(2, objectArray0.length);
  }
}
