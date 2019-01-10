/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 06:00:47 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.DefaultErrorReporter;
import org.mozilla.javascript.ErrorReporter;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.ast.ArrayLiteral;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.ContinueStatement;
import org.mozilla.javascript.ast.ErrorCollector;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.ObjectLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      Parser.PerFunctionVariables parser_PerFunctionVariables0 = parser0.new PerFunctionVariables((FunctionNode) null);
      parser_PerFunctionVariables0.restore();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse(";uE\"&]0COT", ";uE\"&]0COT", (-2375));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2375
         //
         verifyException("org.mozilla.javascript.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      // Undeclared exception!
      try { 
        parser0.simpleAssignment(arrayLiteral0, arrayLiteral0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parser parser0 = new Parser();
      Name name0 = new Name();
      parser0.simpleAssignment(name0, name0);
      assertEquals("49", name0.toString());
      assertEquals(49, name0.getType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      parser0.setRequiresActivation();
      assertFalse(parser0.inUseStrictDirective());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.setIsGenerator();
      assertEquals(65536, Parser.ARGC_LIMIT);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.setDefaultUseStrictDirective(false);
      assertFalse(parser0.inUseStrictDirective());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parser parser0 = new Parser();
      FunctionNode functionNode0 = new FunctionNode();
      Parser.PerFunctionVariables parser_PerFunctionVariables0 = parser0.new PerFunctionVariables(functionNode0);
      // Undeclared exception!
      try { 
        parser0.createDestructuringAssignment(20, functionNode0, functionNode0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid assignment left-hand side.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parser parser0 = new Parser();
      FunctionNode functionNode0 = new FunctionNode(2021, (Name) null);
      FunctionNode functionNode1 = (FunctionNode)parser0.removeParens(functionNode0);
      assertEquals((-1), functionNode1.getLp());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("r^Akq5v*JD_G{GH^,.'");
      stringReader0.close();
      try { 
        parser0.parse((Reader) stringReader0, "org.mozilla.javascript.Parser$PerFunctionVariables", (-32));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("msg.no.brace.switch", "=viU%{B'=Pa", 89);
      assertEquals(19, astRoot0.getLength());
      assertEquals(89, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      StringReader stringReader0 = new StringReader("/b>PjDS");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "org.mozilla.javascript.Parser$PerFunctionVariables", (-32));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      StringReader stringReader0 = new StringReader("/");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider", 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unterminated regular expression literal (org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider#1)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      // Undeclared exception!
      try { 
        parser0.parse("snD<S/hfa7M<)f", "duG>tM9:N9wn~h]oJ", 125);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      compilerEnvirons0.setXmlAvailable(false);
      Parser parser0 = new Parser(compilerEnvirons0);
      StringReader stringReader0 = new StringReader("K");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "vLtH]:H$0R[Ty", (-786));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.lookupMessage("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property 
         //
         verifyException("org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Parser parser0 = new Parser();
      FunctionNode functionNode0 = new FunctionNode();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(266, 110);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = parser0.destructuringObject(objectLiteral0, 0, "", functionNode0, linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(65536, 148);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      ContinueStatement continueStatement0 = new ContinueStatement(1);
      arrayLiteral0.addElement(continueStatement0);
      Locale locale0 = Locale.ROOT;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0, locale_FilteringMode0);
      // Undeclared exception!
      try { 
        parser0.destructuringArray(arrayLiteral0, (-32), "eval", arrayLiteral0, list0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(65536, 148);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = Locale.ROOT;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0, locale_FilteringMode0);
      boolean boolean0 = parser0.destructuringArray(arrayLiteral0, (-32), "eval", arrayLiteral0, list0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.defineSymbol((-2865), (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.defineSymbol(2435, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      Node node0 = parser0.createNumber(103);
      AstRoot astRoot0 = parser0.parse("w]WvQhY,)", "(Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/RegExpProxy;", 8);
      Node node1 = parser0.createDestructuringAssignment(22, astRoot0, node0);
      assertEquals(8, node1.getLineno());
      assertEquals(9, astRoot0.getLength());
      assertFalse(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("w]WvQhY,)", "(Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/RegExpProxy;", 8);
      // Undeclared exception!
      try { 
        parser0.defineSymbol(103, "w]WvQhY,)", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: ts.cursor=9, ts.tokenBeg=8, currentToken=0
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Parser parser0 = new Parser();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      parser0.checkMutableReference(arrayLiteral0);
      assertEquals(2, Node.ATTRIBUTE_FLAG);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.nestingOfFunction = 202;
      Node node0 = parser0.createName("");
      assertEquals(39, node0.getType());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Context context0 = Context.enter();
      boolean boolean0 = context0.stringIsCompilableUnit("kElo:grG&ZeByGykO");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.parse("K_=", "kM", 33);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected end of file (kM#33)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      boolean boolean0 = context0.stringIsCompilableUnit("kElo:gsrG&ZeByGy(O");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      AstRoot astRoot0 = parser0.parse("w", "this node type has no body", 700);
      assertEquals(0, astRoot0.getAbsolutePosition());
      assertEquals(1, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.addWarning("DoY5pY+{}tILC 2", "l`JQn<:.(y");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property DoY5pY+{}tILC 2
         //
         verifyException("org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.addWarning("msg.dup.parms", (-619), 2);
      assertEquals(65536, Parser.ARGC_LIMIT);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.addWarning("msg.dup.parms", (-619), 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      parser0.addStrictWarning("GmJa", "GmJa");
      assertFalse(parser0.inUseStrictDirective());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("w]WvQhY,)", "(Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/RegExpProxy;", 8);
      // Undeclared exception!
      try { 
        parser0.addStrictWarning("", "b`+q<m");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property 
         //
         verifyException("org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse("w]WQh-)", "ibKa", 8);
      // Undeclared exception!
      try { 
        parser0.addWarning("DoY5pY+{}tILC 2", "l`JQn<:.(y");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property DoY5pY+{}tILC 2
         //
         verifyException("org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.addError("7", "7");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      StringReader stringReader0 = new StringReader("2H|!8}%");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "org.mozilla.javascript.Parser$PerFunctionVariables", (-4));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      StringReader stringReader0 = new StringReader("r^Akq5v*JD_G{GH^,.'");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "org.mozilla.javascript.Parser$PerFunctionVariables", (-32));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }
}
