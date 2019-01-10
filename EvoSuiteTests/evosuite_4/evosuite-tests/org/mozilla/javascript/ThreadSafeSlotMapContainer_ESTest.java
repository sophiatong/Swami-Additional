/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 01:42:53 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Spliterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.ThreadSafeSlotMapContainer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ThreadSafeSlotMapContainer_ESTest extends ThreadSafeSlotMapContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ThreadSafeSlotMapContainer threadSafeSlotMapContainer0 = new ThreadSafeSlotMapContainer(481);
      threadSafeSlotMapContainer0.readLock();
      threadSafeSlotMapContainer0.unlockRead(257L);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ThreadSafeSlotMapContainer threadSafeSlotMapContainer0 = new ThreadSafeSlotMapContainer(481);
      int int0 = threadSafeSlotMapContainer0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ThreadSafeSlotMapContainer threadSafeSlotMapContainer0 = new ThreadSafeSlotMapContainer(535);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.MODIFY_CONST;
      ScriptableObject.Slot scriptableObject_Slot0 = threadSafeSlotMapContainer0.get("", 103, scriptableObject_SlotAccess0);
      threadSafeSlotMapContainer0.remove(scriptableObject_Slot0, 103);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ThreadSafeSlotMapContainer threadSafeSlotMapContainer0 = new ThreadSafeSlotMapContainer(481);
      Integer integer0 = new Integer(0);
      ScriptableObject.Slot scriptableObject_Slot0 = threadSafeSlotMapContainer0.query(integer0, 0);
      assertNull(scriptableObject_Slot0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ThreadSafeSlotMapContainer threadSafeSlotMapContainer0 = new ThreadSafeSlotMapContainer(481);
      threadSafeSlotMapContainer0.readLock();
      Spliterator<ScriptableObject.Slot> spliterator0 = threadSafeSlotMapContainer0.spliterator();
      assertNotNull(spliterator0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ThreadSafeSlotMapContainer threadSafeSlotMapContainer0 = new ThreadSafeSlotMapContainer((-1788));
      boolean boolean0 = threadSafeSlotMapContainer0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ThreadSafeSlotMapContainer threadSafeSlotMapContainer0 = new ThreadSafeSlotMapContainer(481);
      threadSafeSlotMapContainer0.readLock();
      int int0 = threadSafeSlotMapContainer0.dirtySize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ThreadSafeSlotMapContainer threadSafeSlotMapContainer0 = new ThreadSafeSlotMapContainer(0);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.MODIFY;
      ScriptableObject.Slot scriptableObject_Slot0 = threadSafeSlotMapContainer0.get("", (-388), scriptableObject_SlotAccess0);
      threadSafeSlotMapContainer0.addSlot(scriptableObject_Slot0);
  }
}
