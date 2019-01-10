/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 23:21:06 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeGenerator;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.SlotMapContainer;
import org.mozilla.javascript.ThreadSafeSlotMapContainer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SlotMapContainer_ESTest extends SlotMapContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SlotMapContainer slotMapContainer0 = new SlotMapContainer((-1596));
      slotMapContainer0.unlockRead((-1596));
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
      slotMapContainer0.remove(object0, 0);
      assertEquals(0, slotMapContainer0.dirtySize());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SlotMapContainer slotMapContainer0 = new SlotMapContainer(1924);
      long long0 = slotMapContainer0.readLock();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SlotMapContainer slotMapContainer0 = new SlotMapContainer((-75));
      Iterator<ScriptableObject.Slot> iterator0 = slotMapContainer0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SlotMapContainer slotMapContainer0 = new SlotMapContainer(336);
      int int0 = slotMapContainer0.dirtySize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SlotMapContainer slotMapContainer0 = new SlotMapContainer(0);
      ThreadSafeSlotMapContainer threadSafeSlotMapContainer0 = new ThreadSafeSlotMapContainer(0);
      Short short0 = new Short((short) (-535));
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.MODIFY_CONST;
      ScriptableObject.Slot scriptableObject_Slot0 = threadSafeSlotMapContainer0.get(short0, (short) (-535), scriptableObject_SlotAccess0);
      slotMapContainer0.addSlot(scriptableObject_Slot0);
      assertEquals(1, slotMapContainer0.dirtySize());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ThreadSafeSlotMapContainer threadSafeSlotMapContainer0 = new ThreadSafeSlotMapContainer(2872);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(importerTopLevel0, false);
      Object[] objectArray0 = nativeGenerator0.getIds();
      assertEquals(0, objectArray0.length);
  }
}
