/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 00:07:44 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.JavaAdapter;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.SlotMapContainer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SlotMapContainer_ESTest extends SlotMapContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SlotMapContainer slotMapContainer0 = new SlotMapContainer(2739);
      slotMapContainer0.unlockRead((-166L));
      assertEquals(0, slotMapContainer0.dirtySize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SlotMapContainer slotMapContainer0 = new SlotMapContainer(0);
      int int0 = slotMapContainer0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SlotMapContainer slotMapContainer0 = new SlotMapContainer(0);
      Object object0 = new Object();
      slotMapContainer0.remove(object0, 594);
      assertEquals(0, slotMapContainer0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SlotMapContainer slotMapContainer0 = new SlotMapContainer((-18));
      long long0 = slotMapContainer0.readLock();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SlotMapContainer slotMapContainer0 = new SlotMapContainer(1779);
      Iterator<ScriptableObject.Slot> iterator0 = slotMapContainer0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SlotMapContainer slotMapContainer0 = new SlotMapContainer((-18));
      boolean boolean0 = slotMapContainer0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SlotMapContainer slotMapContainer0 = new SlotMapContainer((-18));
      int int0 = slotMapContainer0.dirtySize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SlotMapContainer slotMapContainer0 = new SlotMapContainer((-18));
      Integer integer0 = new Integer((-18));
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.MODIFY_CONST;
      ScriptableObject.Slot scriptableObject_Slot0 = slotMapContainer0.get(integer0, 0, scriptableObject_SlotAccess0);
      slotMapContainer0.addSlot(scriptableObject_Slot0);
      assertEquals(2, slotMapContainer0.size());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      // Undeclared exception!
      try { 
        JavaAdapter.runScript((Script) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.JavaAdapter$2", e);
      }
  }
}
