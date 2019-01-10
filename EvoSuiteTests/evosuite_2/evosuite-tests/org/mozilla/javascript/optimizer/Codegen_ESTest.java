/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 07:12:40 GMT 2018
 */

package org.mozilla.javascript.optimizer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.optimizer.Codegen;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Codegen_ESTest extends Codegen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      codegen0.setMainMethodClass("org/mozilla/javascript/optimizer/OptRuntime");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      // Undeclared exception!
      try { 
        codegen0.setEvalScriptFlag((Script) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Codegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      ClassFileWriter classFileWriter0 = new ClassFileWriter("(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V");
      // Undeclared exception!
      try { 
        codegen0.pushNumberAsObject(classFileWriter0, Double.NaN);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      // Undeclared exception!
      try { 
        codegen0.pushNumberAsObject((ClassFileWriter) null, (-1.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Codegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      ClassFileWriter classFileWriter0 = new ClassFileWriter("^l$)_FvA`\"8-;>", "^l$)_FvA`\"8-;>", "^l$)_FvA`\"8-;>");
      classFileWriter0.startMethod("c", "W`6\"?yV?", (short) (-3330));
      codegen0.pushNumberAsObject(classFileWriter0, (short)1);
      assertEquals("^l$)_FvA`\"8-;>", classFileWriter0.getClassName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      ClassFileWriter classFileWriter0 = new ClassFileWriter("org/mozilla/javascript/optimizer/OptRuntime", "anonymous", "org/mozilla/javascript/optimizer/OptRuntime");
      // Undeclared exception!
      try { 
        codegen0.pushNumberAsObject(classFileWriter0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      boolean boolean0 = Codegen.isGenerator(functionNode0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      // Undeclared exception!
      try { 
        codegen0.pushNumberAsObject((ClassFileWriter) null, 37.83077346604406);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Codegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        codegen0.getSourcePositionFromStack((Context) null, intArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Codegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      // Undeclared exception!
      try { 
        codegen0.getScriptStack((RhinoException) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Codegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      Name name0 = new Name((-6712), (-6712), "");
      FunctionNode functionNode0 = new FunctionNode((-6712), name0);
      JavaScriptException javaScriptException0 = new JavaScriptException(functionNode0, "", 2);
      // Undeclared exception!
      try { 
        codegen0.getPatchedStack(javaScriptException0, "RETURN");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Codegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      // Undeclared exception!
      try { 
        codegen0.getDirectCtorName((ScriptNode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Codegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      FunctionNode functionNode0 = new FunctionNode();
      // Undeclared exception!
      try { 
        codegen0.getCompiledRegexpName(functionNode0, 20);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Codegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      Codegen codegen0 = new Codegen();
      // Undeclared exception!
      try { 
        codegen0.getBodyMethodSignature(functionNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Codegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context.getCurrentContext();
      NativeObject nativeObject0 = new NativeObject();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      FunctionNode functionNode0 = new FunctionNode(17);
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "l", functionNode0, "l", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Codegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = Context.getCurrentContext();
      FunctionNode functionNode0 = new FunctionNode(4265);
      // Undeclared exception!
      try { 
        codegen0.createFunctionObject(context0, (Scriptable) null, functionNode0, contextFactory0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mozilla.javascript.ast.FunctionNode cannot be cast to [Ljava.lang.Object;
         //
         verifyException("org.mozilla.javascript.optimizer.Codegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      FunctionNode functionNode0 = new FunctionNode();
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "(Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/RegExpProxy;", functionNode0, "(Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/RegExpProxy;", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ScriptNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      FunctionNode functionNode0 = new FunctionNode();
      String string0 = codegen0.cleanName(functionNode0);
      assertEquals("anonymous", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      Name name0 = new Name();
      FunctionNode functionNode0 = new FunctionNode(3944, name0);
      String string0 = codegen0.cleanName(functionNode0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Codegen.badTree();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad tree in codegen
         //
         verifyException("org.mozilla.javascript.optimizer.Codegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      // Undeclared exception!
      try { 
        Context.reportRuntimeError("IQ~D(*lHXg");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // IQ~D(*lHXg
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }
}
