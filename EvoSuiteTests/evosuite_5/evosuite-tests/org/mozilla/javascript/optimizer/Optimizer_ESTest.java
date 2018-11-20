/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 05:18:10 GMT 2018
 */

package org.mozilla.javascript.optimizer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.ElementGet;
import org.mozilla.javascript.ast.FunctionCall;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.LabeledStatement;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.VariableInitializer;
import org.mozilla.javascript.optimizer.OptFunctionNode;
import org.mozilla.javascript.optimizer.Optimizer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Optimizer_ESTest extends Optimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Optimizer optimizer0 = new Optimizer();
      FunctionNode functionNode0 = new FunctionNode();
      AstRoot astRoot0 = new AstRoot();
      Name name0 = new Name(1);
      FunctionCall functionCall0 = new FunctionCall(8);
      functionCall0.addChildToBack(astRoot0);
      name0.addChildToBack(functionCall0);
      astRoot0.addFunction(functionNode0);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      functionNode0.flattenSymbolTable(true);
      functionNode0.addChild(name0);
      optimizer0.optimize(astRoot0);
      assertEquals(2, Node.POST_FLAG);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Optimizer optimizer0 = new Optimizer();
      AstRoot astRoot0 = new AstRoot();
      Name name0 = new Name(27);
      VariableInitializer variableInitializer0 = new VariableInitializer(1, 10);
      name0.addChild(variableInitializer0);
      ElementGet elementGet0 = new ElementGet(27, 6);
      elementGet0.addChild(astRoot0);
      variableInitializer0.addChildToBack(elementGet0);
      FunctionNode functionNode0 = new FunctionNode(5, name0);
      astRoot0.addFunction(functionNode0);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      functionNode0.flattenSymbolTable(true);
      functionNode0.addChild(name0);
      // Undeclared exception!
      try { 
        optimizer0.optimize(astRoot0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Optimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Optimizer optimizer0 = new Optimizer();
      AstRoot astRoot0 = new AstRoot();
      Name name0 = new Name(2);
      VariableInitializer variableInitializer0 = new VariableInitializer(5, 10);
      name0.addChild(variableInitializer0);
      name0.setType(14);
      FunctionNode functionNode0 = new FunctionNode(19);
      astRoot0.addFunction(functionNode0);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      name0.addChildToBack(astRoot0);
      functionNode0.flattenSymbolTable(true);
      functionNode0.addChild(name0);
      optimizer0.optimize(astRoot0);
      assertEquals(27, Node.ARROW_FUNCTION_PROP);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Optimizer optimizer0 = new Optimizer();
      AstRoot astRoot0 = new AstRoot();
      Name name0 = new Name();
      VariableInitializer variableInitializer0 = new VariableInitializer(21);
      variableInitializer0.setType(40);
      name0.addChild(variableInitializer0);
      FunctionNode functionNode0 = new FunctionNode(2, name0);
      astRoot0.addFunction(functionNode0);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      functionNode0.flattenSymbolTable(false);
      functionNode0.addChild(name0);
      optimizer0.optimize(astRoot0);
      assertEquals((-1), astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Optimizer optimizer0 = new Optimizer();
      AstRoot astRoot0 = new AstRoot();
      Name name0 = new Name();
      VariableInitializer variableInitializer0 = new VariableInitializer(4, 10);
      variableInitializer0.setType(10);
      Node node0 = Node.newString("");
      LabeledStatement labeledStatement0 = new LabeledStatement(2);
      variableInitializer0.addChild(labeledStatement0);
      name0.addChild(variableInitializer0);
      FunctionNode functionNode0 = new FunctionNode(15);
      variableInitializer0.addChildToBack(node0);
      astRoot0.addFunction(functionNode0);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      labeledStatement0.addChildrenToBack(astRoot0);
      functionNode0.flattenSymbolTable(false);
      functionNode0.addChild(name0);
      optimizer0.optimize(astRoot0);
      assertEquals(2, Node.SPECIALCALL_WITH);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Optimizer optimizer0 = new Optimizer();
      AstRoot astRoot0 = new AstRoot();
      Name name0 = new Name();
      VariableInitializer variableInitializer0 = new VariableInitializer(16);
      name0.addChild(variableInitializer0);
      FunctionNode functionNode0 = new FunctionNode(5, name0);
      name0.setType(21);
      astRoot0.addFunction(functionNode0);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      name0.addChildToBack(astRoot0);
      functionNode0.flattenSymbolTable(true);
      functionNode0.addChild(name0);
      optimizer0.optimize(astRoot0);
      assertEquals(2, Node.RIGHT);
  }
}
