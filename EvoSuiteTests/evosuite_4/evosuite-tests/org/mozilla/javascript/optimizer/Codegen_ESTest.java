/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 03:39:07 GMT 2018
 */

package org.mozilla.javascript.optimizer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;
import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.WrappedException;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.optimizer.Codegen;
import org.mozilla.javascript.optimizer.OptFunctionNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Codegen_ESTest extends Codegen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      AstRoot astRoot0 = new AstRoot();
      compilerEnvirons0.setOptimizationLevel(2);
      byte[] byteArray0 = codegen0.compileToClassFile(compilerEnvirons0, ">_y^{", astRoot0, ">_y^{", false);
      assertEquals(3298, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      codegen0.setMainMethodClass("");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      Script script0 = context0.compileString("", "", (-17), (Object) null);
      // Undeclared exception!
      try { 
        codegen0.setEvalScriptFlag(script0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Codegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      ClassFileWriter classFileWriter0 = new ClassFileWriter("n", ")", "n");
      classFileWriter0.startMethod("CT C2oc&T#F48e", ")", (short)74);
      codegen0.pushNumberAsObject(classFileWriter0, 0.0);
      assertEquals(3, classFileWriter0.getCurrentCodeOffset());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      classFileWriter0.startMethod("", "", (short)2638);
      codegen0.pushNumberAsObject(classFileWriter0, 1);
      assertEquals(3, classFileWriter0.getCurrentCodeOffset());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      ClassFileWriter classFileWriter0 = new ClassFileWriter("java/lang/Integer", "_c_", "java/lang/Integer");
      // Undeclared exception!
      try { 
        codegen0.pushNumberAsObject(classFileWriter0, -0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "X`w<%!Pd*it|", "");
      // Undeclared exception!
      try { 
        codegen0.pushNumberAsObject(classFileWriter0, 114.90251);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      ClassFileWriter classFileWriter0 = new ClassFileWriter(">_y^{", ">_y^{", ">_y^{");
      // Undeclared exception!
      try { 
        codegen0.pushNumberAsObject(classFileWriter0, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      Context context0 = Context.enter();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        codegen0.getSourcePositionFromStack(context0, intArray0);
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
      MockThrowable mockThrowable0 = new MockThrowable((String) null);
      WrappedException wrappedException0 = new WrappedException(mockThrowable0);
      // Undeclared exception!
      try { 
        codegen0.getPatchedStack(wrappedException0, (String) null);
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
      ScriptNode scriptNode0 = new ScriptNode(1197);
      // Undeclared exception!
      try { 
        codegen0.getCompiledRegexpName(scriptNode0, 0);
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
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "c*xm 1~ANLEMd}pdc", functionNode0, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.BodyCodegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      optFunctionNode0.setDirectTargetIndex(4);
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;I)V", functionNode0, "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;I)V", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad parameter signature: (L(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;I)V;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      Context context0 = Context.enter();
      Name name0 = new Name();
      FunctionNode functionNode0 = new FunctionNode((-1403), name0);
      // Undeclared exception!
      try { 
        codegen0.createFunctionObject(context0, (Scriptable) null, functionNode0, (Object) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mozilla.javascript.ast.FunctionNode cannot be cast to [Ljava.lang.Object;
         //
         verifyException("org.mozilla.javascript.optimizer.Codegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      AstRoot astRoot0 = new AstRoot(145);
      astRoot0.setSourceName("65si?xW`d?");
      // Undeclared exception!
      try { 
        codegen0.compile(compilerEnvirons0, astRoot0, "65si?xW`d?", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ScriptNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      FunctionNode functionNode0 = new FunctionNode(2005);
      Name name0 = new Name(2, "oneObj");
      FunctionNode functionNode1 = new FunctionNode(21, name0);
      functionNode0.addFunction(functionNode1);
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "oneObj", functionNode0, "oneObj", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Codegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      Name name0 = new Name(18, 18);
      FunctionNode functionNode0 = new FunctionNode(18, name0);
      // Undeclared exception!
      try { 
        codegen0.getBodyMethodName(functionNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Codegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
}
