/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 14:26:16 GMT 2021
 */

package org.apache.commons.collections4.map;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import org.apache.commons.collections4.map.FixedSizeMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

public class FixedSizeMap_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      FixedSizeMap<String, Object> fixedSizeMap0 = new FixedSizeMap<String, Object>(hashMap0);
      fixedSizeMap0.putAll(fixedSizeMap0);
      assertEquals(0, fixedSizeMap0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      FixedSizeMap<Integer, Integer> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<Integer, Integer>) hashMap0);
      Integer integer0 = new Integer((-3130));
      hashMap0.put(integer0, integer0);
      BiFunction<Integer, Object, Integer> biFunction0 = (BiFunction<Integer, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(anyInt() , any());
      fixedSizeMap0.replaceAll(biFunction0);
      Integer integer1 = fixedSizeMap0.put(integer0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Integer, AbstractMap.SimpleEntry<Integer, Object>> hashMap0 = new HashMap<Integer, AbstractMap.SimpleEntry<Integer, Object>>();
      FixedSizeMap<Integer, AbstractMap.SimpleEntry<Integer, Object>> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<Integer, AbstractMap.SimpleEntry<Integer, Object>>) hashMap0);
      Integer integer0 = new Integer((-1));
      AbstractMap.SimpleEntry<Integer, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, Object>(integer0, fixedSizeMap0);
      hashMap0.put(integer0, abstractMap_SimpleEntry0);
      int int0 = fixedSizeMap0.maxSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<HashMap<String, Object>, String> hashMap0 = new HashMap<HashMap<String, Object>, String>();
      FixedSizeMap<HashMap<String, Object>, String> fixedSizeMap0 = new FixedSizeMap<HashMap<String, Object>, String>(hashMap0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      hashMap1.put("org.apache.commons.collections4.map.FixedSizeMap", fixedSizeMap0);
      hashMap0.put(hashMap1, "");
      HashMap<Object, String> hashMap2 = new HashMap<Object, String>();
      FixedSizeMap<Object, String> fixedSizeMap1 = new FixedSizeMap<Object, String>(hashMap2);
      // Undeclared exception!
      try { 
        fixedSizeMap1.putAll(fixedSizeMap0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, AbstractMap.SimpleEntry<Object, Integer>> hashMap0 = new HashMap<String, AbstractMap.SimpleEntry<Object, Integer>>();
      FixedSizeMap<String, AbstractMap.SimpleEntry<Object, Integer>> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<String, AbstractMap.SimpleEntry<Object, Integer>>) hashMap0);
      // Undeclared exception!
      try { 
        fixedSizeMap0.putAll((Map<? extends String, ? extends AbstractMap.SimpleEntry<Object, Integer>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.map.FixedSizeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        FixedSizeMap.fixedSizeMap((Map<Object, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // map
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedSizeMap<AbstractMap.SimpleImmutableEntry<Object, String>, Object> fixedSizeMap0 = null;
      try {
        fixedSizeMap0 = new FixedSizeMap<AbstractMap.SimpleImmutableEntry<Object, String>, Object>((Map<AbstractMap.SimpleImmutableEntry<Object, String>, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // map
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, AbstractMap.SimpleEntry<Object, Integer>> hashMap0 = new HashMap<String, AbstractMap.SimpleEntry<Object, Integer>>();
      hashMap0.put("`K3<3;0U%9%u8k5", (AbstractMap.SimpleEntry<Object, Integer>) null);
      FixedSizeMap<String, AbstractMap.SimpleEntry<Object, Integer>> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<String, AbstractMap.SimpleEntry<Object, Integer>>) hashMap0);
      fixedSizeMap0.putAll(hashMap0);
      assertTrue(fixedSizeMap0.isFull());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<HashMap<String, Object>, String> hashMap0 = new HashMap<HashMap<String, Object>, String>();
      FixedSizeMap<HashMap<String, Object>, String> fixedSizeMap0 = new FixedSizeMap<HashMap<String, Object>, String>(hashMap0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      hashMap0.put(hashMap1, "");
      HashMap<Object, String> hashMap2 = new HashMap<Object, String>();
      FixedSizeMap<Object, String> fixedSizeMap1 = new FixedSizeMap<Object, String>(hashMap2);
      // Undeclared exception!
      try { 
        fixedSizeMap1.putAll(fixedSizeMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot put new key/value pair - Map is fixed size
         //
         verifyException("org.apache.commons.collections4.map.FixedSizeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      FixedSizeMap<Integer, Integer> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<Integer, Integer>) hashMap0);
      Integer integer0 = new Integer((-3130));
      Integer integer1 = hashMap0.put(integer0, integer0);
      fixedSizeMap0.put(integer0, integer1);
      assertEquals(1, fixedSizeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      FixedSizeMap<Object, Integer> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<Object, Integer>) hashMap0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        fixedSizeMap0.put(fixedSizeMap0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot put new key/value pair - Map is fixed size
         //
         verifyException("org.apache.commons.collections4.map.FixedSizeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<AbstractMap.SimpleEntry<Object, Object>, Integer> hashMap0 = new HashMap<AbstractMap.SimpleEntry<Object, Object>, Integer>();
      FixedSizeMap<AbstractMap.SimpleEntry<Object, Object>, Integer> fixedSizeMap0 = new FixedSizeMap<AbstractMap.SimpleEntry<Object, Object>, Integer>(hashMap0);
      Set<Map.Entry<AbstractMap.SimpleEntry<Object, Object>, Integer>> set0 = (Set<Map.Entry<AbstractMap.SimpleEntry<Object, Object>, Integer>>)fixedSizeMap0.entrySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Object, HashMap<Object, Object>> hashMap0 = new HashMap<Object, HashMap<Object, Object>>();
      FixedSizeMap<Object, HashMap<Object, Object>> fixedSizeMap0 = new FixedSizeMap<Object, HashMap<Object, Object>>(hashMap0);
      boolean boolean0 = fixedSizeMap0.isFull();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<Object, AbstractMap.SimpleEntry<Object, Object>> hashMap0 = new HashMap<Object, AbstractMap.SimpleEntry<Object, Object>>();
      FixedSizeMap<Object, AbstractMap.SimpleEntry<Object, Object>> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<Object, AbstractMap.SimpleEntry<Object, Object>>) hashMap0);
      Set<Object> set0 = fixedSizeMap0.keySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      FixedSizeMap<Object, String> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<Object, String>) hashMap0);
      // Undeclared exception!
      try { 
        fixedSizeMap0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Map is fixed size
         //
         verifyException("org.apache.commons.collections4.map.FixedSizeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      FixedSizeMap<Integer, Integer> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<Integer, Integer>) hashMap0);
      Collection<Integer> collection0 = fixedSizeMap0.values();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      FixedSizeMap<Integer, Object> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<Integer, Object>) hashMap0);
      // Undeclared exception!
      try { 
        fixedSizeMap0.remove((Object) "");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Map is fixed size
         //
         verifyException("org.apache.commons.collections4.map.FixedSizeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      FixedSizeMap<Object, Object> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<Object, Object>) hashMap0);
      int int0 = fixedSizeMap0.maxSize();
      assertEquals(0, int0);
  }
}
