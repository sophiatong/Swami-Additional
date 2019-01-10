/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 00:28:02 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ObjArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ObjArray_ESTest extends ObjArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      objArray0.add((Object) "");
      objArray0.add(0, (Object) "");
      objArray0.push("");
      Object[] objectArray0 = new Object[5];
      objArray0.add(0, (Object) objArray0);
      objArray0.toArray(objectArray0, 0);
      assertEquals(4, objArray0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      Object[] objectArray0 = new Object[4];
      objArray0.setSize(3);
      objArray0.add((Object) "w");
      objArray0.add((Object) "w");
      // Undeclared exception!
      try { 
        objArray0.toArray(objectArray0, 273);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 277
         //
         verifyException("org.mozilla.javascript.ObjArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      Object[] objectArray0 = new Object[4];
      objArray0.setSize(5);
      objArray0.push((Object) null);
      // Undeclared exception!
      try { 
        objArray0.toArray(objectArray0, 5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      Object[] objectArray0 = new Object[8];
      objArray0.toArray(objectArray0);
      assertEquals(0, objArray0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      Object[] objectArray0 = objArray0.toArray();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      int int0 = objArray0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      objArray0.setSize(273);
      objArray0.setSize(3);
      assertEquals(3, objArray0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      ObjArray objArray0 = new ObjArray();
      objArray0.add((Object) "");
      objArray0.add(0, object0);
      objArray0.set(1, "");
      assertEquals(2, objArray0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      // Undeclared exception!
      try { 
        objArray0.set(1, "");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 1 \u2209 [0, 0)
         //
         verifyException("org.mozilla.javascript.ObjArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      objArray0.setSize(52);
      objArray0.remove(4);
      assertEquals(51, objArray0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      objArray0.setSize(52);
      objArray0.pop();
      assertEquals(51, objArray0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      objArray0.setSize(4);
      objArray0.add((Object) " \u2209 [0, ");
      objArray0.pop();
      assertEquals(4, objArray0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      objArray0.add((Object) "r");
      objArray0.add(0, (Object) "r");
      objArray0.add(0, (Object) "r");
      objArray0.push("r");
      objArray0.pop();
      assertEquals(3, objArray0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      Object object0 = new Object();
      objArray0.add(object0);
      assertFalse(objArray0.isEmpty());
      
      objArray0.pop();
      assertEquals(0, objArray0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      objArray0.setSize(2);
      objArray0.peek();
      assertEquals(2, objArray0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      // Undeclared exception!
      try { 
        objArray0.peek();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Empty stack
         //
         verifyException("org.mozilla.javascript.ObjArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      Object object0 = new Object();
      objArray0.add(object0);
      objArray0.seal();
      // Undeclared exception!
      try { 
        objArray0.remove(0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Attempt to modify sealed array
         //
         verifyException("org.mozilla.javascript.ObjArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      // Undeclared exception!
      try { 
        objArray0.pop();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Empty stack
         //
         verifyException("org.mozilla.javascript.ObjArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      objArray0.setSize(776);
      int int0 = objArray0.lastIndexOf("Ao8OzcW=;X");
      assertEquals(776, objArray0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      Object object0 = new Object();
      objArray0.add(object0);
      int int0 = objArray0.lastIndexOf(object0);
      assertFalse(objArray0.isEmpty());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      boolean boolean0 = objArray0.isSealed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      boolean boolean0 = objArray0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      objArray0.add((Object) " tOkaR;ccc<Xr5");
      int int0 = objArray0.indexOf(" tOkaR;ccc<Xr5");
      assertFalse(objArray0.isEmpty());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      objArray0.setSize(388);
      int int0 = objArray0.indexOf(" tOkaR;ccc<Xr5");
      assertEquals(388, objArray0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      // Undeclared exception!
      try { 
        objArray0.get(388);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 388 \u2209 [0, 0)
         //
         verifyException("org.mozilla.javascript.ObjArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      objArray0.setSize(5);
      objArray0.push((Object) null);
      objArray0.setSize(357);
      assertEquals(357, objArray0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      objArray0.setSize(4);
      assertEquals(4, objArray0.size());
      
      objArray0.clear();
      assertEquals(0, objArray0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      objArray0.setSize(388);
      objArray0.add((Object) " tOkaR;ccc<Xr5");
      objArray0.get(388);
      assertEquals(389, objArray0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      objArray0.setSize(388);
      objArray0.add(3, (Object) " tOkaR;ccc<Xr5");
      assertEquals(389, objArray0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      objArray0.add((Object) "");
      objArray0.add(0, (Object) "");
      objArray0.push("");
      objArray0.add(0, (Object) objArray0);
      objArray0.add(1, (Object) "");
      objArray0.remove(0);
      objArray0.remove(1);
      objArray0.pop();
      assertFalse(objArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ObjArray objArray0 = new ObjArray();
      objArray0.add((Object) "");
      objArray0.add(0, (Object) "");
      objArray0.add(0, (Object) objArray0);
      objArray0.remove(0);
      objArray0.pop();
      assertFalse(objArray0.isEmpty());
  }
}
