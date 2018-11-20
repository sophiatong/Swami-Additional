/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 05:23:52 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.EmbeddedSlotMap;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.ScriptableObject;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmbeddedSlotMap_ESTest extends EmbeddedSlotMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EmbeddedSlotMap embeddedSlotMap0 = new EmbeddedSlotMap();
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER;
      embeddedSlotMap0.get((Object) null, 1087, scriptableObject_SlotAccess0);
      Consumer<ScriptableObject.Slot> consumer0 = (Consumer<ScriptableObject.Slot>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      embeddedSlotMap0.forEach(consumer0);
      assertFalse(embeddedSlotMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EmbeddedSlotMap embeddedSlotMap0 = new EmbeddedSlotMap();
      ScriptableObject.GetterSlot scriptableObject_GetterSlot0 = new ScriptableObject.GetterSlot(embeddedSlotMap0, 931, 931);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.CONVERT_ACCESSOR_TO_DATA;
      ScriptableObject.Slot scriptableObject_Slot0 = embeddedSlotMap0.get(scriptableObject_GetterSlot0, 931, scriptableObject_SlotAccess0);
      scriptableObject_Slot0.orderedNext = (ScriptableObject.Slot) scriptableObject_GetterSlot0;
      ScriptableObject.SlotAccess scriptableObject_SlotAccess1 = ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER;
      embeddedSlotMap0.get(scriptableObject_Slot0, 931, scriptableObject_SlotAccess1);
      scriptableObject_Slot0.orderedNext = (ScriptableObject.Slot) scriptableObject_GetterSlot0;
      // Undeclared exception!
      try { 
        embeddedSlotMap0.remove(scriptableObject_Slot0, 9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.EmbeddedSlotMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EmbeddedSlotMap embeddedSlotMap0 = new EmbeddedSlotMap();
      ScriptableObject.GetterSlot scriptableObject_GetterSlot0 = new ScriptableObject.GetterSlot(embeddedSlotMap0, 931, 931);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.CONVERT_ACCESSOR_TO_DATA;
      ScriptableObject.Slot scriptableObject_Slot0 = embeddedSlotMap0.get(scriptableObject_GetterSlot0, 931, scriptableObject_SlotAccess0);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess1 = ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER;
      embeddedSlotMap0.get(scriptableObject_Slot0, 931, scriptableObject_SlotAccess1);
      embeddedSlotMap0.get((Object) null, 3, scriptableObject_SlotAccess1);
      embeddedSlotMap0.remove(scriptableObject_Slot0, 9);
      assertFalse(embeddedSlotMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EmbeddedSlotMap embeddedSlotMap0 = new EmbeddedSlotMap();
      ScriptableObject.GetterSlot scriptableObject_GetterSlot0 = new ScriptableObject.GetterSlot(embeddedSlotMap0, 931, 931);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.CONVERT_ACCESSOR_TO_DATA;
      embeddedSlotMap0.get(scriptableObject_GetterSlot0, 931, scriptableObject_SlotAccess0);
      assertEquals(1, embeddedSlotMap0.size());
      
      embeddedSlotMap0.remove(scriptableObject_GetterSlot0, 9);
      assertEquals(0, embeddedSlotMap0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EmbeddedSlotMap embeddedSlotMap0 = new EmbeddedSlotMap();
      ScriptableObject.GetterSlot scriptableObject_GetterSlot0 = new ScriptableObject.GetterSlot(embeddedSlotMap0, 947, 947);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.CONVERT_ACCESSOR_TO_DATA;
      ScriptableObject.Slot scriptableObject_Slot0 = embeddedSlotMap0.get(scriptableObject_GetterSlot0, 5, scriptableObject_SlotAccess0);
      embeddedSlotMap0.spliterator();
      ScriptableObject.SlotAccess scriptableObject_SlotAccess1 = ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER;
      ScriptableObject.Slot scriptableObject_Slot1 = embeddedSlotMap0.get(scriptableObject_Slot0, 5, scriptableObject_SlotAccess1);
      embeddedSlotMap0.addSlot(scriptableObject_GetterSlot0);
      scriptableObject_GetterSlot0.indexOrHash = 5;
      embeddedSlotMap0.get((Object) null, 3, scriptableObject_SlotAccess1);
      embeddedSlotMap0.remove(scriptableObject_Slot1, 5);
      assertEquals(4, embeddedSlotMap0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EmbeddedSlotMap embeddedSlotMap0 = new EmbeddedSlotMap();
      ScriptableObject.GetterSlot scriptableObject_GetterSlot0 = new ScriptableObject.GetterSlot(embeddedSlotMap0, 947, 947);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.CONVERT_ACCESSOR_TO_DATA;
      ScriptableObject.Slot scriptableObject_Slot0 = embeddedSlotMap0.get(scriptableObject_GetterSlot0, 5, scriptableObject_SlotAccess0);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess1 = ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER;
      embeddedSlotMap0.get((Object) null, 3, scriptableObject_SlotAccess1);
      embeddedSlotMap0.query(scriptableObject_Slot0, 947);
      assertFalse(embeddedSlotMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EmbeddedSlotMap embeddedSlotMap0 = new EmbeddedSlotMap();
      boolean boolean0 = embeddedSlotMap0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EmbeddedSlotMap embeddedSlotMap0 = new EmbeddedSlotMap();
      ScriptableObject.GetterSlot scriptableObject_GetterSlot0 = new ScriptableObject.GetterSlot(embeddedSlotMap0, 931, 931);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.CONVERT_ACCESSOR_TO_DATA;
      ScriptableObject.Slot scriptableObject_Slot0 = embeddedSlotMap0.get(scriptableObject_GetterSlot0, 5, scriptableObject_SlotAccess0);
      embeddedSlotMap0.get(scriptableObject_Slot0, (-1596), scriptableObject_SlotAccess0);
      assertEquals(1, embeddedSlotMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EmbeddedSlotMap embeddedSlotMap0 = new EmbeddedSlotMap();
      ScriptableObject.GetterSlot scriptableObject_GetterSlot0 = new ScriptableObject.GetterSlot(embeddedSlotMap0, (-1298), (-1298));
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER;
      embeddedSlotMap0.get(scriptableObject_GetterSlot0, (-1298), scriptableObject_SlotAccess0);
      embeddedSlotMap0.get(scriptableObject_GetterSlot0, (-1298), scriptableObject_SlotAccess0);
      assertFalse(embeddedSlotMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ImporterTopLevel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EmbeddedSlotMap embeddedSlotMap0 = new EmbeddedSlotMap();
      ScriptableObject.GetterSlot scriptableObject_GetterSlot0 = new ScriptableObject.GetterSlot(embeddedSlotMap0, 2671, 2671);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.CONVERT_ACCESSOR_TO_DATA;
      embeddedSlotMap0.get(scriptableObject_GetterSlot0, 2671, scriptableObject_SlotAccess0);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess1 = ScriptableObject.SlotAccess.QUERY;
      embeddedSlotMap0.get(scriptableObject_GetterSlot0, 2671, scriptableObject_SlotAccess1);
      assertFalse(embeddedSlotMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EmbeddedSlotMap embeddedSlotMap0 = new EmbeddedSlotMap();
      Object object0 = new Object();
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.QUERY;
      ScriptableObject.Slot scriptableObject_Slot0 = embeddedSlotMap0.get(object0, (-1), scriptableObject_SlotAccess0);
      assertNull(scriptableObject_Slot0);
      assertTrue(embeddedSlotMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EmbeddedSlotMap embeddedSlotMap0 = new EmbeddedSlotMap();
      ScriptableObject.GetterSlot scriptableObject_GetterSlot0 = new ScriptableObject.GetterSlot(embeddedSlotMap0, 931, 931);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.CONVERT_ACCESSOR_TO_DATA;
      ScriptableObject.Slot scriptableObject_Slot0 = embeddedSlotMap0.get(scriptableObject_GetterSlot0, 931, scriptableObject_SlotAccess0);
      scriptableObject_Slot0.orderedNext = (ScriptableObject.Slot) scriptableObject_GetterSlot0;
      ScriptableObject.SlotAccess scriptableObject_SlotAccess1 = ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER;
      embeddedSlotMap0.get(scriptableObject_Slot0, 931, scriptableObject_SlotAccess1);
      scriptableObject_Slot0.orderedNext = (ScriptableObject.Slot) scriptableObject_GetterSlot0;
      embeddedSlotMap0.get(scriptableObject_Slot0, 13, scriptableObject_SlotAccess0);
      assertFalse(embeddedSlotMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EmbeddedSlotMap embeddedSlotMap0 = new EmbeddedSlotMap();
      ScriptableObject.GetterSlot scriptableObject_GetterSlot0 = new ScriptableObject.GetterSlot(embeddedSlotMap0, 947, 947);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.CONVERT_ACCESSOR_TO_DATA;
      ScriptableObject.Slot scriptableObject_Slot0 = embeddedSlotMap0.get(scriptableObject_GetterSlot0, 5, scriptableObject_SlotAccess0);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess1 = ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER;
      embeddedSlotMap0.get(scriptableObject_Slot0, 5, scriptableObject_SlotAccess1);
      embeddedSlotMap0.get(scriptableObject_Slot0, 5, scriptableObject_SlotAccess0);
      embeddedSlotMap0.get((Object) null, 3, scriptableObject_SlotAccess1);
      embeddedSlotMap0.get(scriptableObject_Slot0, 3, scriptableObject_SlotAccess1);
      assertFalse(embeddedSlotMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EmbeddedSlotMap embeddedSlotMap0 = new EmbeddedSlotMap();
      ScriptableObject.GetterSlot scriptableObject_GetterSlot0 = new ScriptableObject.GetterSlot(embeddedSlotMap0, 947, 947);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.CONVERT_ACCESSOR_TO_DATA;
      ScriptableObject.SlotAccess scriptableObject_SlotAccess1 = ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER;
      embeddedSlotMap0.get(scriptableObject_GetterSlot0, 5, scriptableObject_SlotAccess1);
      embeddedSlotMap0.get(scriptableObject_GetterSlot0, 5, scriptableObject_SlotAccess0);
      assertEquals(1, embeddedSlotMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EmbeddedSlotMap embeddedSlotMap0 = new EmbeddedSlotMap();
      ScriptableObject.GetterSlot scriptableObject_GetterSlot0 = new ScriptableObject.GetterSlot(embeddedSlotMap0, 947, 947);
      embeddedSlotMap0.addSlot(scriptableObject_GetterSlot0);
      assertEquals(1, embeddedSlotMap0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EmbeddedSlotMap embeddedSlotMap0 = new EmbeddedSlotMap();
      Integer integer0 = new Integer(55);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.MODIFY_CONST;
      embeddedSlotMap0.get(integer0, (int) integer0, scriptableObject_SlotAccess0);
      // Undeclared exception!
      try { 
        embeddedSlotMap0.remove(integer0, (int) integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }
}
