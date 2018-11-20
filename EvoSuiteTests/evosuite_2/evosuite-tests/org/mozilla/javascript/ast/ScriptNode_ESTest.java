/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 19:12:39 GMT 2018
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
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.EmptyExpression;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.RegExpLiteral;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.ast.Symbol;
import org.mozilla.javascript.ast.XmlElemRef;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScriptNode_ESTest extends ScriptNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode();
      StringBuilder stringBuilder0 = new StringBuilder(23);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      EmptyExpression emptyExpression0 = new EmptyExpression((-1717), 2);
      scriptNode0.addChildrenToBack(emptyExpression0);
      scriptNode0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tSCRIPT -1 1\n-1717\tEMPTY -1717 2\n", astNode_DebugPrintVisitor0.toString());
      assertEquals(137, scriptNode0.getType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      LinkedList<Symbol> linkedList0 = new LinkedList<Symbol>();
      functionNode0.setSymbols(linkedList0);
      assertEquals((-1), functionNode0.getEncodedSourceStart());
      assertEquals((-1), functionNode0.getEncodedSourceEnd());
      assertEquals(0, functionNode0.getParamCount());
      assertEquals((-1), functionNode0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Name name0 = new Name((-934), 0);
      FunctionNode functionNode0 = new FunctionNode((-934), name0);
      functionNode0.setSourceName(" if (");
      assertEquals((-1), functionNode0.getEncodedSourceStart());
      assertEquals((-1), functionNode0.getEndLineno());
      assertEquals(0, functionNode0.getParamCount());
      assertEquals((-1), functionNode0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode(0, (Name) null);
      functionNode0.setInStrictMode(false);
      assertEquals((-1), functionNode0.getEncodedSourceEnd());
      assertFalse(functionNode0.isInStrictMode());
      assertEquals((-1), functionNode0.getEndLineno());
      assertEquals(0, functionNode0.getParamCount());
      assertEquals((-1), functionNode0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode(16);
      functionNode0.setEndLineno(16);
      assertEquals(16, functionNode0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      assertEquals((-1), functionNode0.getEncodedSourceStart());
      
      functionNode0.setEncodedSourceStart(1);
      assertEquals(1, functionNode0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode(76);
      scriptNode0.setEncodedSourceEnd((-2924));
      assertEquals((-2924), scriptNode0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      astRoot0.setEncodedSourceBounds(0, 1);
      assertEquals(1, astRoot0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode();
      scriptNode0.setEncodedSource("$");
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals(0, scriptNode0.getParamCount());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals(137, scriptNode0.getType());
      assertEquals((-1), scriptNode0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      XmlElemRef xmlElemRef0 = new XmlElemRef(11, 0);
      functionNode0.setCompilerData(xmlElemRef0);
      RegExpLiteral regExpLiteral0 = new RegExpLiteral(2);
      // Undeclared exception!
      try { 
        functionNode0.setCompilerData(regExpLiteral0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ScriptNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode();
      scriptNode0.setBaseLineno(2);
      assertEquals(2, scriptNode0.getLineno());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode(415);
      scriptNode0.isInStrictMode();
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals(0, scriptNode0.getParamCount());
      assertEquals((-1), scriptNode0.getEndLineno());
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals(137, scriptNode0.getType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode();
      scriptNode0.getSymbols();
      assertEquals((-1), scriptNode0.getEndLineno());
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals("137", scriptNode0.toString());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals(0, scriptNode0.getParamCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode(137);
      scriptNode0.getSourceName();
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals((-1), scriptNode0.getEndLineno());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals("137", scriptNode0.toString());
      assertEquals(0, scriptNode0.getParamCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode(0);
      // Undeclared exception!
      try { 
        scriptNode0.getRegexpString(3120);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ScriptNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode((-1671));
      // Undeclared exception!
      try { 
        functionNode0.getRegexpFlags(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ScriptNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      int int0 = functionNode0.getRegexpCount();
      assertEquals(0, functionNode0.getParamCount());
      assertEquals(0, int0);
      assertEquals((-1), functionNode0.getEncodedSourceStart());
      assertEquals((-1), functionNode0.getEncodedSourceEnd());
      assertEquals((-1), functionNode0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode(137);
      functionNode0.flattenSymbolTable(false);
      // Undeclared exception!
      try { 
        functionNode0.getParamOrVarName(2557);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2557
         //
         verifyException("org.mozilla.javascript.ast.ScriptNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode((-1671));
      int int0 = functionNode0.getParamCount();
      assertEquals((-1), functionNode0.getEndLineno());
      assertEquals((-1), functionNode0.getEncodedSourceStart());
      assertEquals((-1), functionNode0.getEncodedSourceEnd());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode(2487, (Name) null);
      functionNode0.flattenSymbolTable(true);
      functionNode0.getParamAndVarNames();
      assertEquals(0, functionNode0.getParamCount());
      assertEquals((-1), functionNode0.getEncodedSourceEnd());
      assertEquals((-1), functionNode0.getEndLineno());
      assertEquals((-1), functionNode0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.flattenSymbolTable(true);
      functionNode0.getParamAndVarCount();
      assertEquals((-1), functionNode0.getEncodedSourceEnd());
      assertEquals((-1), functionNode0.getEncodedSourceStart());
      assertEquals(0, functionNode0.getParamCount());
      assertEquals((-1), functionNode0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode();
      scriptNode0.flattenSymbolTable(false);
      scriptNode0.getParamAndVarConst();
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals((-1), scriptNode0.getEndLineno());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals(0, scriptNode0.getParamCount());
      assertEquals("137", scriptNode0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode();
      String string0 = scriptNode0.getNextTempName();
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals(0, scriptNode0.getParamCount());
      assertEquals((-1), scriptNode0.getEndLineno());
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals("$0", string0);
      assertEquals("137", scriptNode0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      Name name0 = new Name(27);
      functionNode0.flattenSymbolTable(true);
      name0.setScope(functionNode0);
      int int0 = functionNode0.getIndexForNameNode(name0);
      assertEquals((-1), functionNode0.getEndLineno());
      assertEquals((-1), int0);
      assertEquals((-1), functionNode0.getEncodedSourceStart());
      assertEquals((-1), functionNode0.getEncodedSourceEnd());
      assertEquals(0, functionNode0.getParamCount());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      List<FunctionNode> list0 = astRoot0.getFunctions();
      assertEquals((-1), astRoot0.getEndLineno());
      assertEquals((-1), astRoot0.getEncodedSourceStart());
      assertEquals((-1), astRoot0.getEncodedSourceEnd());
      assertEquals(0, astRoot0.getParamCount());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode();
      // Undeclared exception!
      try { 
        scriptNode0.getFunctionNode((-3230));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ScriptNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode(2163);
      int int0 = functionNode0.addFunction(functionNode0);
      assertEquals(1, functionNode0.getFunctionCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      int int0 = functionNode0.getEndLineno();
      assertEquals((-1), int0);
      assertEquals((-1), functionNode0.getEncodedSourceEnd());
      assertEquals((-1), functionNode0.getEncodedSourceStart());
      assertEquals(0, functionNode0.getParamCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      int int0 = functionNode0.getEncodedSourceStart();
      assertEquals((-1), int0);
      assertEquals((-1), functionNode0.getEndLineno());
      assertEquals((-1), functionNode0.getEncodedSourceEnd());
      assertEquals(0, functionNode0.getParamCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode();
      int int0 = scriptNode0.getEncodedSourceEnd();
      assertEquals("137", scriptNode0.toString());
      assertEquals(0, scriptNode0.getParamCount());
      assertEquals((-1), int0);
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals((-1), scriptNode0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode(754);
      scriptNode0.getEncodedSource();
      assertEquals("137", scriptNode0.toString());
      assertEquals(0, scriptNode0.getParamCount());
      assertEquals((-1), scriptNode0.getEndLineno());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(0);
      astRoot0.getCompilerData();
      assertEquals((-1), astRoot0.getEncodedSourceEnd());
      assertEquals(0, astRoot0.getParamCount());
      assertEquals((-1), astRoot0.getEncodedSourceStart());
      assertEquals((-1), astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode(1330);
      int int0 = scriptNode0.getBaseLineno();
      assertEquals("137", scriptNode0.toString());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals(0, scriptNode0.getParamCount());
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals((-1), int0);
      assertEquals((-1), scriptNode0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      Symbol symbol0 = new Symbol(88, "org/mozilla/javascript/optimizer/OptRuntime");
      functionNode0.addSymbol(symbol0);
      assertEquals(1, functionNode0.getParamCount());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode(173);
      Symbol symbol0 = new Symbol(155, "}-AgpA>^!<eOZRBc");
      scriptNode0.putSymbol(symbol0);
      scriptNode0.flattenSymbolTable(false);
      assertEquals((-1), scriptNode0.getEndLineno());
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      RegExpLiteral regExpLiteral0 = new RegExpLiteral();
      functionNode0.addRegExp(regExpLiteral0);
      assertEquals((-1), functionNode0.getEncodedSourceEnd());
      assertEquals(0, functionNode0.getParamCount());
      assertEquals((-1), functionNode0.getEndLineno());
      assertEquals((-1), functionNode0.getEncodedSourceStart());
  }
}
