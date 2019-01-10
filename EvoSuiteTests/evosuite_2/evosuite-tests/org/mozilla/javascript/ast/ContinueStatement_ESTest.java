/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 17:34:49 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.ContinueStatement;
import org.mozilla.javascript.ast.ForInLoop;
import org.mozilla.javascript.ast.Name;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ContinueStatement_ESTest extends ContinueStatement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Name name0 = new Name(0);
      ContinueStatement continueStatement0 = new ContinueStatement(1207, 82, name0);
      String string0 = continueStatement0.debugPrint();
      assertEquals("1207\tCONTINUE 1207 82\n0\t  NAME -1207 1 null\n", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Name name0 = new Name(0);
      ContinueStatement continueStatement0 = new ContinueStatement(1207, 82, name0);
      String string0 = continueStatement0.toSource(13);
      assertEquals((-1207), name0.getPosition());
      assertEquals("                          continue <null>;\n", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Name name0 = new Name(0);
      ContinueStatement continueStatement0 = new ContinueStatement(1207, 82, name0);
      continueStatement0.getTarget();
      assertEquals((-1207), name0.getPosition());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ContinueStatement continueStatement0 = new ContinueStatement((Name) null);
      assertEquals("122", continueStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ContinueStatement continueStatement0 = new ContinueStatement((-1626), (Name) null);
      assertEquals((-1626), continueStatement0.getPosition());
      assertEquals((-1), continueStatement0.getLength());
      assertEquals("122", continueStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ContinueStatement continueStatement0 = new ContinueStatement();
      ForInLoop forInLoop0 = new ForInLoop();
      continueStatement0.setTarget(forInLoop0);
      assertEquals("122", continueStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Name name0 = new Name(0);
      ContinueStatement continueStatement0 = new ContinueStatement(1207, 82, name0);
      continueStatement0.getLabel();
      assertEquals(1, name0.depth());
      assertEquals((-1207), name0.getPosition());
  }
}
