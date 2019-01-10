/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 23:52:26 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.Spliterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.HashSlotMap;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeUint8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class HashSlotMap_ESTest extends HashSlotMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashSlotMap hashSlotMap0 = new HashSlotMap();
      int int0 = hashSlotMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashSlotMap hashSlotMap0 = new HashSlotMap();
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.MODIFY_CONST;
      hashSlotMap0.get(nativeUint8Array0, 13, scriptableObject_SlotAccess0);
      // Undeclared exception!
      try { 
        hashSlotMap0.remove(nativeUint8Array0, 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashSlotMap hashSlotMap0 = new HashSlotMap();
      Spliterator<ScriptableObject.Slot> spliterator0 = hashSlotMap0.spliterator();
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER;
      hashSlotMap0.get(spliterator0, 701, scriptableObject_SlotAccess0);
      hashSlotMap0.remove(spliterator0, 701);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashSlotMap hashSlotMap0 = new HashSlotMap();
      ScriptableObject.Slot scriptableObject_Slot0 = hashSlotMap0.query((Object) null, (-141));
      assertNull(scriptableObject_Slot0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashSlotMap hashSlotMap0 = new HashSlotMap();
      boolean boolean0 = hashSlotMap0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashSlotMap hashSlotMap0 = new HashSlotMap();
      Iterator<ScriptableObject.Slot> iterator0 = hashSlotMap0.iterator();
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.CONVERT_ACCESSOR_TO_DATA;
      ScriptableObject.Slot scriptableObject_Slot0 = hashSlotMap0.get(iterator0, 20, scriptableObject_SlotAccess0);
      assertNull(scriptableObject_Slot0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashSlotMap hashSlotMap0 = new HashSlotMap();
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER;
      ScriptableObject.Slot scriptableObject_Slot0 = hashSlotMap0.get((Object) null, (-3707), scriptableObject_SlotAccess0);
      ScriptableObject.Slot scriptableObject_Slot1 = hashSlotMap0.get((Object) null, (-3707), scriptableObject_SlotAccess0);
      assertSame(scriptableObject_Slot1, scriptableObject_Slot0);
      assertNotNull(scriptableObject_Slot1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashSlotMap hashSlotMap0 = new HashSlotMap();
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(nativeArrayBuffer0, 4, 0);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.MODIFY_CONST;
      ScriptableObject.Slot scriptableObject_Slot0 = hashSlotMap0.get(nativeUint8Array0, 13, scriptableObject_SlotAccess0);
      ScriptableObject.Slot scriptableObject_Slot1 = hashSlotMap0.get(nativeUint8Array0, 0, scriptableObject_SlotAccess0);
      assertSame(scriptableObject_Slot1, scriptableObject_Slot0);
      assertNotNull(scriptableObject_Slot1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashSlotMap hashSlotMap0 = new HashSlotMap();
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.QUERY;
      ScriptableObject.Slot scriptableObject_Slot0 = hashSlotMap0.get("", 20, scriptableObject_SlotAccess0);
      assertNull(scriptableObject_Slot0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashSlotMap hashSlotMap0 = new HashSlotMap();
      Spliterator<ScriptableObject.Slot> spliterator0 = hashSlotMap0.spliterator();
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER;
      Integer integer0 = new Integer((-141));
      hashSlotMap0.get(spliterator0, (-141), scriptableObject_SlotAccess0);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess1 = ScriptableObject.SlotAccess.CONVERT_ACCESSOR_TO_DATA;
      ScriptableObject.Slot scriptableObject_Slot0 = hashSlotMap0.get(spliterator0, (int) integer0, scriptableObject_SlotAccess1);
      assertNotNull(scriptableObject_Slot0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashSlotMap hashSlotMap0 = new HashSlotMap();
      Spliterator<ScriptableObject.Slot> spliterator0 = hashSlotMap0.spliterator();
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.MODIFY_CONST;
      Integer integer0 = new Integer(1037);
      hashSlotMap0.get(spliterator0, 1037, scriptableObject_SlotAccess0);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess1 = ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER;
      ScriptableObject.Slot scriptableObject_Slot0 = hashSlotMap0.get(spliterator0, (int) integer0, scriptableObject_SlotAccess1);
      assertNotNull(scriptableObject_Slot0);
  }
}
