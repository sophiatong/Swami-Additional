/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 16:47:03 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ContinueStatement;
import org.mozilla.javascript.ast.FunctionCall;
import org.mozilla.javascript.ast.NewExpression;
import org.mozilla.javascript.ast.NumberLiteral;
import org.mozilla.javascript.ast.XmlPropRef;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FunctionCall_ESTest extends FunctionCall_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall();
      StringBuilder stringBuilder0 = new StringBuilder(27);
      ContinueStatement continueStatement0 = new ContinueStatement(23);
      functionCall0.target = (AstNode) continueStatement0;
      functionCall0.addArgument(continueStatement0);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      functionCall0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tCALL -1 1\n23\t  CONTINUE 24 -1\n23\t  CONTINUE 24 -1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("-1\tCALL -1 1\n23\t  CONTINUE 24 -1\n23\t  CONTINUE 24 -1\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall();
      ContinueStatement continueStatement0 = new ContinueStatement(23);
      functionCall0.target = (AstNode) continueStatement0;
      functionCall0.addArgument(continueStatement0);
      String string0 = functionCall0.toSource();
      assertEquals("continue;\n(continue;\n)", string0);
      assertEquals(38, functionCall0.getType());
      assertEquals((-1), functionCall0.getRp());
      assertEquals((-1), functionCall0.getLp());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression(38);
      NumberLiteral numberLiteral0 = new NumberLiteral(26, ":[xp_^Qg~UsM^");
      newExpression0.setTarget(numberLiteral0);
      assertEquals((-1), newExpression0.getRp());
      assertEquals((-1), newExpression0.getLp());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression(38);
      assertEquals((-1), newExpression0.getRp());
      
      newExpression0.setRp(1);
      assertEquals(1, newExpression0.getRp());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall();
      functionCall0.setParens((-2496), (-2496));
      assertEquals((-2496), functionCall0.getLp());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression(38);
      newExpression0.setLp(23);
      assertEquals(23, newExpression0.getLp());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression();
      newExpression0.setArguments((List<AstNode>) null);
      assertEquals((-1), newExpression0.getLp());
      assertEquals((-1), newExpression0.getRp());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall();
      functionCall0.getTarget();
      assertEquals(38, functionCall0.getType());
      assertEquals((-1), functionCall0.getLp());
      assertEquals((-1), functionCall0.getRp());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall();
      int int0 = functionCall0.getRp();
      assertEquals((-1), int0);
      assertEquals("38", functionCall0.toString());
      assertEquals((-1), functionCall0.getLp());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression(38);
      int int0 = newExpression0.getLp();
      assertEquals((-1), int0);
      assertEquals((-1), newExpression0.getRp());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression(1086, 0);
      assertEquals((-1), newExpression0.getRp());
      assertEquals((-1), newExpression0.getLp());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall();
      LinkedList<AstNode> linkedList0 = new LinkedList<AstNode>();
      XmlPropRef xmlPropRef0 = new XmlPropRef();
      linkedList0.add((AstNode) xmlPropRef0);
      functionCall0.setArguments(linkedList0);
      functionCall0.setArguments(linkedList0);
      assertEquals((-1), functionCall0.getRp());
      assertEquals(38, functionCall0.getType());
      assertEquals((-1), functionCall0.getLp());
  }
}
