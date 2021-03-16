/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 14:48:57 GMT 2021
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
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import org.apache.commons.collections4.map.PassiveExpiringMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

public class PassiveExpiringMap_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      System.setCurrentTimeMillis(9223372036854775443L);
      PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Object, Long> passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0 = new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Object, Long>();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      PassiveExpiringMap<Object, Long> passiveExpiringMap0 = new PassiveExpiringMap<Object, Long>(passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0);
      PassiveExpiringMap<Object, Long> passiveExpiringMap1 = new PassiveExpiringMap<Object, Long>((-3075L), timeUnit0, passiveExpiringMap0);
      Long long0 = new Long(9223372036854775443L);
      Long long1 = passiveExpiringMap1.put(long0, long0);
      assertNull(long1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<AbstractMap.SimpleEntry<String, Long>, Long> passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0 = new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<AbstractMap.SimpleEntry<String, Long>, Long>();
      Long long0 = new Long(195L);
      AbstractMap.SimpleImmutableEntry<String, Long> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Long>("V/h@AkB&8snA", long0);
      AbstractMap.SimpleEntry<String, Long> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Long>(abstractMap_SimpleImmutableEntry0);
      long long1 = passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0.expirationTime(abstractMap_SimpleEntry0, long0);
      assertEquals((-1L), long1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Long, String> passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0 = new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Long, String>(2969L);
      PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Object, Long> passiveExpiringMap_ConstantTimeToLiveExpirationPolicy1 = new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Object, Long>();
      long long0 = passiveExpiringMap_ConstantTimeToLiveExpirationPolicy1.expirationTime(passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0, (Long) null);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<Long, AbstractMap.SimpleEntry<String, String>> hashMap0 = new HashMap<Long, AbstractMap.SimpleEntry<String, String>>();
      PassiveExpiringMap<Long, AbstractMap.SimpleEntry<String, String>> passiveExpiringMap0 = new PassiveExpiringMap<Long, AbstractMap.SimpleEntry<String, String>>(0L, hashMap0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PassiveExpiringMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, String> passiveExpiringMap0 = new PassiveExpiringMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, String>();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<String, Object> passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0 = new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<String, Object>(0L);
      HashMap<Object, PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Long, Integer>> hashMap0 = new HashMap<Object, PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Long, Integer>>(1263);
      PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Long, Integer> passiveExpiringMap_ConstantTimeToLiveExpirationPolicy1 = new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Long, Integer>(986L, timeUnit0);
      hashMap0.put(passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0, passiveExpiringMap_ConstantTimeToLiveExpirationPolicy1);
      PassiveExpiringMap<Object, PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Long, Integer>> passiveExpiringMap0 = new PassiveExpiringMap<Object, PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Long, Integer>>(986L, hashMap0);
      int int0 = passiveExpiringMap0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<AbstractMap.SimpleEntry<Integer, Object>, Object> passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0 = new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<AbstractMap.SimpleEntry<Integer, Object>, Object>();
      PassiveExpiringMap<AbstractMap.SimpleEntry<Integer, Object>, Object> passiveExpiringMap0 = new PassiveExpiringMap<AbstractMap.SimpleEntry<Integer, Object>, Object>(passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0);
      AbstractMap.SimpleEntry<Integer, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, Object>((Integer) null, (Object) null);
      passiveExpiringMap0.putIfAbsent(abstractMap_SimpleEntry0, abstractMap_SimpleEntry0);
      Object object0 = passiveExpiringMap0.put(abstractMap_SimpleEntry0, timeUnit0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PassiveExpiringMap<AbstractMap.SimpleImmutableEntry<String, Long>, AbstractMap.SimpleEntry<Object, String>> passiveExpiringMap0 = new PassiveExpiringMap<AbstractMap.SimpleImmutableEntry<String, Long>, AbstractMap.SimpleEntry<Object, String>>();
      HashMap<AbstractMap.SimpleImmutableEntry<String, Long>, AbstractMap.SimpleEntry<Object, String>> hashMap0 = new HashMap<AbstractMap.SimpleImmutableEntry<String, Long>, AbstractMap.SimpleEntry<Object, String>>();
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>("Z8NA*6Rv8B", "IBExs+]");
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>(abstractMap_SimpleEntry0);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Object, String>(abstractMap_SimpleImmutableEntry0);
      hashMap0.put((AbstractMap.SimpleImmutableEntry<String, Long>) null, abstractMap_SimpleEntry1);
      passiveExpiringMap0.map = (Map<AbstractMap.SimpleImmutableEntry<String, Long>, AbstractMap.SimpleEntry<Object, String>>) hashMap0;
      boolean boolean0 = passiveExpiringMap0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      PassiveExpiringMap<String, Integer> passiveExpiringMap0 = new PassiveExpiringMap<String, Integer>(hashMap0);
      Integer integer0 = new Integer(0);
      Integer integer1 = passiveExpiringMap0.get(integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<HashMap<Object, Long>, String> passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0 = new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<HashMap<Object, Long>, String>((-337L));
      PassiveExpiringMap<Integer, AbstractMap.SimpleEntry<Integer, Integer>> passiveExpiringMap0 = new PassiveExpiringMap<Integer, AbstractMap.SimpleEntry<Integer, Integer>>();
      boolean boolean0 = passiveExpiringMap0.containsKey(passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Long, Object> hashMap0 = new HashMap<Long, Object>();
      PassiveExpiringMap<Long, Object> passiveExpiringMap0 = new PassiveExpiringMap<Long, Object>(hashMap0);
      passiveExpiringMap0.put((Long) null, hashMap0);
      // Undeclared exception!
      try { 
        passiveExpiringMap0.remove((Object) passiveExpiringMap0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      PassiveExpiringMap<Integer, Integer> passiveExpiringMap0 = new PassiveExpiringMap<Integer, Integer>(0L, timeUnit0);
      // Undeclared exception!
      try { 
        passiveExpiringMap0.putAll((Map<? extends Integer, ? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.map.PassiveExpiringMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PassiveExpiringMap<AbstractMap.SimpleImmutableEntry<String, Object>, HashMap<Object, String>> passiveExpiringMap0 = new PassiveExpiringMap<AbstractMap.SimpleImmutableEntry<String, Object>, HashMap<Object, String>>();
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>("Z-Ke)", passiveExpiringMap0);
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      passiveExpiringMap0.putIfAbsent(abstractMap_SimpleImmutableEntry0, hashMap0);
      // Undeclared exception!
      try { 
        passiveExpiringMap0.put(abstractMap_SimpleImmutableEntry0, hashMap0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      PassiveExpiringMap<String, Object> passiveExpiringMap0 = new PassiveExpiringMap<String, Object>(0L, hashMap0);
      hashMap0.put("BvIoU", passiveExpiringMap0);
      PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Integer, AbstractMap.SimpleEntry<Object, Integer>> passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0 = new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Integer, AbstractMap.SimpleEntry<Object, Integer>>();
      PassiveExpiringMap<Integer, AbstractMap.SimpleEntry<Object, Integer>> passiveExpiringMap1 = new PassiveExpiringMap<Integer, AbstractMap.SimpleEntry<Object, Integer>>(passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0);
      // Undeclared exception!
      try { 
        passiveExpiringMap1.get(passiveExpiringMap0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Object, Object> passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0 = new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Object, Object>((-167000L));
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      PassiveExpiringMap<Object, Object> passiveExpiringMap0 = new PassiveExpiringMap<Object, Object>(passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0, hashMap0);
      passiveExpiringMap0.putIfAbsent("", hashMap0);
      PassiveExpiringMap<AbstractMap.SimpleEntry<Integer, Object>, String> passiveExpiringMap1 = new PassiveExpiringMap<AbstractMap.SimpleEntry<Integer, Object>, String>(0L);
      // Undeclared exception!
      try { 
        passiveExpiringMap1.containsKey(hashMap0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<HashMap<Integer, Integer>, Long> passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0 = new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<HashMap<Integer, Integer>, Long>();
      PassiveExpiringMap<HashMap<Integer, Integer>, Long> passiveExpiringMap0 = null;
      try {
        passiveExpiringMap0 = new PassiveExpiringMap<HashMap<Integer, Integer>, Long>(passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0, (Map<HashMap<Integer, Integer>, Long>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // map
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PassiveExpiringMap<Object, Long> passiveExpiringMap0 = null;
      try {
        passiveExpiringMap0 = new PassiveExpiringMap<Object, Long>((PassiveExpiringMap.ExpirationPolicy<Object, Long>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // expiringPolicy
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PassiveExpiringMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> passiveExpiringMap0 = null;
      try {
        passiveExpiringMap0 = new PassiveExpiringMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>((Map<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // map
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      PassiveExpiringMap<String, Integer> passiveExpiringMap0 = null;
      try {
        passiveExpiringMap0 = new PassiveExpiringMap<String, Integer>((-983L), timeUnit0, (Map<String, Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // map
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PassiveExpiringMap<AbstractMap.SimpleImmutableEntry<String, String>, Long> passiveExpiringMap0 = null;
      try {
        passiveExpiringMap0 = new PassiveExpiringMap<AbstractMap.SimpleImmutableEntry<String, String>, Long>((-1L), (Map<AbstractMap.SimpleImmutableEntry<String, String>, Long>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // map
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Long long0 = new Long((-151L));
      PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Integer, String> passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0 = new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Integer, String>();
      PassiveExpiringMap<Integer, String> passiveExpiringMap0 = new PassiveExpiringMap<Integer, String>(passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0);
      Object object0 = passiveExpiringMap0.remove((Object) long0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      Integer integer0 = new Integer(0);
      PassiveExpiringMap<Integer, Object> passiveExpiringMap0 = new PassiveExpiringMap<Integer, Object>(0);
      BiFunction<Object, Object, Object> biFunction0 = (BiFunction<Object, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      passiveExpiringMap0.merge(integer0, timeUnit0, biFunction0);
      Set<Map.Entry<Integer, Object>> set0 = (Set<Map.Entry<Integer, Object>>)passiveExpiringMap0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PassiveExpiringMap<Object, AbstractMap.SimpleImmutableEntry<Integer, String>> passiveExpiringMap0 = new PassiveExpiringMap<Object, AbstractMap.SimpleImmutableEntry<Integer, String>>(1L);
      Integer integer0 = new Integer(0);
      AbstractMap.SimpleImmutableEntry<Integer, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, String>(integer0, (String) null);
      AbstractMap.SimpleImmutableEntry<Integer, String> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<Integer, String>(abstractMap_SimpleImmutableEntry0);
      AbstractMap.SimpleImmutableEntry<Integer, String> abstractMap_SimpleImmutableEntry2 = passiveExpiringMap0.put(integer0, abstractMap_SimpleImmutableEntry1);
      assertNull(abstractMap_SimpleImmutableEntry2);
      
      Set<Object> set0 = passiveExpiringMap0.keySet();
      assertTrue(set0.contains(0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      System.setCurrentTimeMillis(9223372036854775443L);
      PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Object, Long> passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0 = new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Object, Long>();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      PassiveExpiringMap<Object, Long> passiveExpiringMap0 = new PassiveExpiringMap<Object, Long>(passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0);
      PassiveExpiringMap<Object, Long> passiveExpiringMap1 = new PassiveExpiringMap<Object, Long>(1874L, timeUnit0, passiveExpiringMap0);
      Long long0 = new Long(9223372036854775443L);
      Long long1 = passiveExpiringMap1.put(long0, long0);
      assertNull(long1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      Integer integer0 = new Integer(0);
      PassiveExpiringMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, HashMap<Integer, Object>> passiveExpiringMap0 = new PassiveExpiringMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, HashMap<Integer, Object>>((-151L), timeUnit0);
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      AbstractMap.SimpleEntry<Integer, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, String>(integer0, ">%}%:|3uD7O0)0");
      AbstractMap.SimpleImmutableEntry<Integer, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Object>(abstractMap_SimpleEntry0);
      passiveExpiringMap0.put(abstractMap_SimpleImmutableEntry0, hashMap0);
      passiveExpiringMap0.putAll(passiveExpiringMap0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<AbstractMap.SimpleEntry<Object, Object>, Integer> passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0 = new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<AbstractMap.SimpleEntry<Object, Object>, Integer>();
      PassiveExpiringMap<AbstractMap.SimpleEntry<Object, Object>, Integer> passiveExpiringMap0 = new PassiveExpiringMap<AbstractMap.SimpleEntry<Object, Object>, Integer>(passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0);
      int int0 = passiveExpiringMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      Integer integer0 = new Integer(0);
      PassiveExpiringMap<Integer, Object> passiveExpiringMap0 = new PassiveExpiringMap<Integer, Object>(0);
      BiFunction<Object, Object, Object> biFunction0 = (BiFunction<Object, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      passiveExpiringMap0.merge(integer0, timeUnit0, biFunction0);
      BiFunction<Object, Object, Object> biFunction1 = (BiFunction<Object, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      Object object0 = passiveExpiringMap0.merge(integer0, integer0, biFunction1);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      PassiveExpiringMap<AbstractMap.SimpleImmutableEntry<String, Object>, Object> passiveExpiringMap0 = new PassiveExpiringMap<AbstractMap.SimpleImmutableEntry<String, Object>, Object>();
      PassiveExpiringMap<AbstractMap.SimpleEntry<String, Object>, Integer> passiveExpiringMap1 = new PassiveExpiringMap<AbstractMap.SimpleEntry<String, Object>, Integer>(0L, timeUnit0);
      boolean boolean0 = passiveExpiringMap1.containsValue(passiveExpiringMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, String>> passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0 = new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, String>>();
      PassiveExpiringMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, String>> passiveExpiringMap0 = new PassiveExpiringMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, String>>(passiveExpiringMap_ConstantTimeToLiveExpirationPolicy0);
      Collection<AbstractMap.SimpleEntry<Object, String>> collection0 = passiveExpiringMap0.values();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      PassiveExpiringMap<PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<String, Object>, AbstractMap.SimpleEntry<Object, String>> passiveExpiringMap0 = new PassiveExpiringMap<PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<String, Object>, AbstractMap.SimpleEntry<Object, String>>(1408L, timeUnit0);
      passiveExpiringMap0.clear();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PassiveExpiringMap<Long, AbstractMap.SimpleEntry<Integer, Object>> passiveExpiringMap0 = new PassiveExpiringMap<Long, AbstractMap.SimpleEntry<Integer, Object>>(0L);
      boolean boolean0 = passiveExpiringMap0.isEmpty();
      assertTrue(boolean0);
  }
}