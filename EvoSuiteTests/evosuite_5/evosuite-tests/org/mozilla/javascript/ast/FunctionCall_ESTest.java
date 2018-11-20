/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 16:40:34 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.ArrayComprehensionLoop;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.FunctionCall;
import org.mozilla.javascript.ast.NewExpression;
import org.mozilla.javascript.ast.ObjectLiteral;
import org.mozilla.javascript.ast.XmlLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FunctionCall_ESTest extends FunctionCall_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall();
      XmlLiteral xmlLiteral0 = new XmlLiteral((-990), 1);
      functionCall0.addArgument(xmlLiteral0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(20);
      functionCall0.setTarget(objectLiteral0);
      String string0 = functionCall0.debugPrint();
      assertEquals("-1\tCALL -1 1\n20\t  OBJECTLIT 21 1\n-990\t  XML -989 1\n", string0);
      assertEquals((-1), functionCall0.getLp());
      assertEquals((-1), functionCall0.getRp());
      assertEquals(38, functionCall0.getType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall(0, 262);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      functionCall0.setTarget(objectLiteral0);
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop(11);
      functionCall0.addArgument(arrayComprehensionLoop0);
      StringBuilder stringBuilder0 = new StringBuilder("");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        functionCall0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ArrayComprehensionLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      functionCall0.setTarget(objectLiteral0);
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop();
      functionCall0.addArgument(arrayComprehensionLoop0);
      // Undeclared exception!
      try { 
        functionCall0.toSource(4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ArrayComprehensionLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      functionCall0.setTarget(objectLiteral0);
      String string0 = functionCall0.toSource(4);
      assertEquals((-1), functionCall0.getRp());
      assertEquals((-1), functionCall0.getLp());
      assertEquals("        {}()", string0);
      assertEquals("38", functionCall0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall(0, 262);
      functionCall0.setRp(18);
      assertEquals(18, functionCall0.getRp());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall(0);
      assertEquals((-1), functionCall0.getRp());
      
      functionCall0.setParens((-1), 0);
      assertEquals(0, functionCall0.getRp());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall(0, 262);
      functionCall0.setLp(1183);
      assertEquals(1183, functionCall0.getLp());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression();
      LinkedList<AstNode> linkedList0 = new LinkedList<AstNode>();
      linkedList0.addFirst(newExpression0);
      newExpression0.setArguments(linkedList0);
      newExpression0.setArguments(linkedList0);
      assertEquals(0, newExpression0.getPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression();
      newExpression0.setArguments((List<AstNode>) null);
      assertEquals((-1), newExpression0.getLp());
      assertEquals((-1), newExpression0.getRp());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall(89, (-206));
      functionCall0.getTarget();
      assertEquals((-1), functionCall0.getRp());
      assertEquals((-1), functionCall0.getLp());
      assertEquals(38, functionCall0.getType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall(0, 262);
      int int0 = functionCall0.getRp();
      assertEquals((-1), int0);
      assertEquals(38, functionCall0.getType());
      assertEquals((-1), functionCall0.getLp());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall(0, 262);
      int int0 = functionCall0.getLp();
      assertEquals((-1), int0);
      assertEquals((-1), functionCall0.getRp());
      assertEquals(38, functionCall0.getType());
  }
}
