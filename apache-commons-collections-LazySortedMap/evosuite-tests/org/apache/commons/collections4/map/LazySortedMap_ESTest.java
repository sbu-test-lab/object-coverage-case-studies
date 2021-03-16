/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 14:10:07 GMT 2021
 */

package org.apache.commons.collections4.map;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.AnyPredicate;
import org.apache.commons.collections4.functors.ChainedClosure;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.ExceptionFactory;
import org.apache.commons.collections4.functors.FactoryTransformer;
import org.apache.commons.collections4.functors.IfTransformer;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.functors.PredicateTransformer;
import org.apache.commons.collections4.functors.StringValueTransformer;
import org.apache.commons.collections4.functors.SwitchTransformer;
import org.apache.commons.collections4.map.LazySortedMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

public class LazySortedMap_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TreeMap<Integer, Integer> treeMap0 = new TreeMap<Integer, Integer>();
      Integer integer0 = new Integer(1721);
      treeMap0.put(integer0, integer0);
      Transformer<Object, Integer> transformer0 = ConstantTransformer.nullTransformer();
      LazySortedMap<Integer, Integer> lazySortedMap0 = new LazySortedMap<Integer, Integer>(treeMap0, transformer0);
      LazySortedMap<Integer, Integer> lazySortedMap1 = LazySortedMap.lazySortedMap((SortedMap<Integer, Integer>) lazySortedMap0, (Transformer<? super Integer, ? extends Integer>) transformer0);
      assertTrue(lazySortedMap1.equals((Object)lazySortedMap0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TreeMap<Integer, String> treeMap0 = new TreeMap<Integer, String>();
      ConstantFactory<String> constantFactory0 = new ConstantFactory<String>((String) null);
      Integer integer0 = new Integer(702);
      treeMap0.put(integer0, (String) null);
      LazySortedMap<Integer, String> lazySortedMap0 = LazySortedMap.lazySortedMap((SortedMap<Integer, String>) treeMap0, (Factory<? extends String>) constantFactory0);
      assertEquals(1, lazySortedMap0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Transformer<Object, String>[] transformerArray0 = (Transformer<Object, String>[]) Array.newInstance(Transformer.class, 2);
      ConstantFactory<String> constantFactory0 = new ConstantFactory<String>("");
      FactoryTransformer<Object, String> factoryTransformer0 = new FactoryTransformer<Object, String>(constantFactory0);
      Class<Integer> class0 = Integer.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      IfTransformer<Object, String> ifTransformer0 = new IfTransformer<Object, String>(instanceofPredicate0, transformerArray0[0], factoryTransformer0);
      TreeMap<Object, String> treeMap0 = new TreeMap<Object, String>();
      LazySortedMap<Object, String> lazySortedMap0 = LazySortedMap.lazySortedMap((SortedMap<Object, String>) treeMap0, (Transformer<? super Object, ? extends String>) ifTransformer0);
      Integer integer0 = new Integer(0);
      SortedMap<Object, String> sortedMap0 = lazySortedMap0.headMap(integer0);
      assertTrue(sortedMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TreeMap<Object, Object> treeMap0 = new TreeMap<Object, Object>();
      Transformer<Object, String>[] transformerArray0 = (Transformer<Object, String>[]) Array.newInstance(Transformer.class, 2);
      ConstantFactory<String> constantFactory0 = new ConstantFactory<String>("");
      FactoryTransformer<Object, String> factoryTransformer0 = new FactoryTransformer<Object, String>(constantFactory0);
      Class<Integer> class0 = Integer.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      IfTransformer<Object, String> ifTransformer0 = new IfTransformer<Object, String>(instanceofPredicate0, transformerArray0[0], factoryTransformer0);
      SwitchTransformer<Object, String> switchTransformer0 = new SwitchTransformer<Object, String>((Predicate<? super Object>[]) null, transformerArray0, ifTransformer0);
      LazySortedMap<Object, Object> lazySortedMap0 = LazySortedMap.lazySortedMap((SortedMap<Object, Object>) treeMap0, (Transformer<? super Object, ?>) switchTransformer0);
      LazySortedMap<Object, Object> lazySortedMap1 = LazySortedMap.lazySortedMap((SortedMap<Object, Object>) lazySortedMap0, (Factory<?>) constantFactory0);
      SortedMap<Object, Object> sortedMap0 = lazySortedMap1.getSortedMap();
      assertEquals(0, sortedMap0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TreeMap<Integer, String> treeMap0 = new TreeMap<Integer, String>();
      ConstantFactory<String> constantFactory0 = new ConstantFactory<String>((String) null);
      LazySortedMap<Integer, String> lazySortedMap0 = new LazySortedMap<Integer, String>(treeMap0, constantFactory0);
      Integer integer0 = new Integer(702);
      treeMap0.put(integer0, (String) null);
      Integer integer1 = lazySortedMap0.firstKey();
      assertEquals(702, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TreeMap<Integer, String> treeMap0 = new TreeMap<Integer, String>();
      Transformer<Object, String> transformer0 = InvokerTransformer.invokerTransformer("");
      LazySortedMap<Integer, String> lazySortedMap0 = LazySortedMap.lazySortedMap((SortedMap<Integer, String>) treeMap0, (Transformer<? super Integer, ? extends String>) transformer0);
      Comparator<? super Integer> comparator0 = lazySortedMap0.comparator();
      assertNull(comparator0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TreeMap<Integer, Object> treeMap0 = new TreeMap<Integer, Object>();
      ConstantFactory<Object> constantFactory0 = new ConstantFactory<Object>("LESS");
      LazySortedMap<Integer, Object> lazySortedMap0 = new LazySortedMap<Integer, Object>(treeMap0, constantFactory0);
      // Undeclared exception!
      try { 
        lazySortedMap0.tailMap((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 4);
      AnyPredicate<Object> anyPredicate0 = new AnyPredicate<Object>(predicateArray0);
      predicateArray0[0] = (Predicate<Object>) anyPredicate0;
      TreeMap<Predicate<Object>, Boolean> treeMap0 = new TreeMap<Predicate<Object>, Boolean>();
      Factory<Boolean> factory0 = ExceptionFactory.exceptionFactory();
      LazySortedMap<Predicate<Object>, Boolean> lazySortedMap0 = new LazySortedMap<Predicate<Object>, Boolean>(treeMap0, factory0);
      // Undeclared exception!
      try { 
        lazySortedMap0.tailMap(predicateArray0[0]);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.collections4.functors.AnyPredicate cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TreeMap<String, String> treeMap0 = new TreeMap<String, String>();
      Transformer<String, String> transformer0 = StringValueTransformer.stringValueTransformer();
      LazySortedMap<String, String> lazySortedMap0 = new LazySortedMap<String, String>(treeMap0, transformer0);
      // Undeclared exception!
      try { 
        lazySortedMap0.subMap((String) null, "@x!.*,O,1");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TreeMap<String, Object> treeMap0 = new TreeMap<String, Object>();
      Factory<Object> factory0 = ConstantFactory.constantFactory((Object) treeMap0);
      LazySortedMap<String, Object> lazySortedMap0 = LazySortedMap.lazySortedMap((SortedMap<String, Object>) treeMap0, (Factory<?>) factory0);
      // Undeclared exception!
      try { 
        lazySortedMap0.subMap("S/V", "=OrnJHcgX}9+P?;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromKey > toKey
         //
         verifyException("java.util.TreeMap$NavigableSubMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TreeMap<Object, Object> treeMap0 = new TreeMap<Object, Object>();
      ConstantFactory<String> constantFactory0 = new ConstantFactory<String>("");
      LazySortedMap<Object, Object> lazySortedMap0 = new LazySortedMap<Object, Object>(treeMap0, constantFactory0);
      // Undeclared exception!
      try { 
        lazySortedMap0.subMap(treeMap0, "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.TreeMap cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Transformer<Object, Object> transformer0 = InvokerTransformer.invokerTransformer("");
      // Undeclared exception!
      try { 
        LazySortedMap.lazySortedMap((SortedMap<Predicate<Object>, Object>) null, (Transformer<? super Predicate<Object>, ?>) transformer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // map
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Factory<Integer> factory0 = ExceptionFactory.exceptionFactory();
      // Undeclared exception!
      try { 
        LazySortedMap.lazySortedMap((SortedMap<Object, Integer>) null, (Factory<? extends Integer>) factory0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // map
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TreeMap<TreeMap<Transformer<Object, String>, Integer>, Object> treeMap0 = new TreeMap<TreeMap<Transformer<Object, String>, Integer>, Object>();
      Factory<Object> factory0 = ConstantFactory.constantFactory((Object) treeMap0);
      LazySortedMap<TreeMap<Transformer<Object, String>, Integer>, Object> lazySortedMap0 = LazySortedMap.lazySortedMap((SortedMap<TreeMap<Transformer<Object, String>, Integer>, Object>) treeMap0, (Factory<?>) factory0);
      lazySortedMap0.map = null;
      TreeMap<Transformer<Object, String>, Integer> treeMap1 = new TreeMap<Transformer<Object, String>, Integer>();
      // Undeclared exception!
      try { 
        lazySortedMap0.headMap(treeMap1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.map.LazySortedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 9);
      InvokerTransformer<Object, String> invokerTransformer0 = new InvokerTransformer<Object, String>("|!Lz", classArray0, classArray0);
      LazySortedMap<String, String> lazySortedMap0 = null;
      try {
        lazySortedMap0 = new LazySortedMap<String, String>((SortedMap<String, String>) null, invokerTransformer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // map
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TreeMap<Integer, Object> treeMap0 = new TreeMap<Integer, Object>();
      LazySortedMap<Integer, Object> lazySortedMap0 = null;
      try {
        lazySortedMap0 = new LazySortedMap<Integer, Object>(treeMap0, (Factory<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // factory
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TreeMap<Integer, Object> treeMap0 = new TreeMap<Integer, Object>();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 6);
      Transformer<Object, String> transformer0 = InvokerTransformer.invokerTransformer("#&YW/[", (Class<?>[]) classArray0, (Object[]) classArray0);
      LazySortedMap<Integer, Object> lazySortedMap0 = LazySortedMap.lazySortedMap((SortedMap<Integer, Object>) treeMap0, (Transformer<? super Integer, ?>) transformer0);
      // Undeclared exception!
      try { 
        lazySortedMap0.firstKey();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TreeMap<Predicate<Object>, String> treeMap0 = new TreeMap<Predicate<Object>, String>();
      Factory<String> factory0 = ConstantFactory.constantFactory("");
      LazySortedMap<Predicate<Object>, String> lazySortedMap0 = new LazySortedMap<Predicate<Object>, String>(treeMap0, factory0);
      // Undeclared exception!
      try { 
        lazySortedMap0.lastKey();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn("").when(comparator0).toString();
      TreeMap<TreeMap<Object, String>, String> treeMap0 = new TreeMap<TreeMap<Object, String>, String>(comparator0);
      ConstantFactory<String> constantFactory0 = new ConstantFactory<String>(">4_Sn");
      LazySortedMap<TreeMap<Object, String>, String> lazySortedMap0 = LazySortedMap.lazySortedMap((SortedMap<TreeMap<Object, String>, String>) treeMap0, (Factory<? extends String>) constantFactory0);
      Comparator<? super TreeMap<Object, String>> comparator1 = lazySortedMap0.comparator();
      assertNotNull(comparator1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TreeMap<Boolean, Object> treeMap0 = new TreeMap<Boolean, Object>();
      Class<Object> class0 = Object.class;
      Predicate<Object> predicate0 = InstanceofPredicate.instanceOfPredicate(class0);
      PredicateTransformer<TreeMap<Object, Object>> predicateTransformer0 = new PredicateTransformer<TreeMap<Object, Object>>(predicate0);
      TreeMap<Object, Object> treeMap1 = new TreeMap<Object, Object>();
      Boolean boolean0 = predicateTransformer0.transform(treeMap1);
      Factory<Boolean> factory0 = ConstantFactory.constantFactory(boolean0);
      LazySortedMap<Boolean, Object> lazySortedMap0 = new LazySortedMap<Boolean, Object>(treeMap0, factory0);
      SortedMap<Boolean, Object> sortedMap0 = lazySortedMap0.tailMap(boolean0);
      assertEquals(0, sortedMap0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TreeMap<String, Integer> treeMap0 = new TreeMap<String, Integer>();
      Integer integer0 = new Integer((-5125));
      Factory<Integer> factory0 = ConstantFactory.constantFactory(integer0);
      LazySortedMap<String, Integer> lazySortedMap0 = new LazySortedMap<String, Integer>(treeMap0, factory0);
      SortedMap<String, Integer> sortedMap0 = lazySortedMap0.subMap("B\"oIksRBD~E+3d;D`x", "B\"oIksRBD~E+3d;D`x");
      assertEquals(0, sortedMap0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Factory<Transformer<Object, String>> factory0 = ExceptionFactory.exceptionFactory();
      TreeMap<Closure<Object>, Transformer<Object, String>> treeMap0 = new TreeMap<Closure<Object>, Transformer<Object, String>>();
      LazySortedMap<Closure<Object>, Transformer<Object, String>> lazySortedMap0 = new LazySortedMap<Closure<Object>, Transformer<Object, String>>(treeMap0, factory0);
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 2);
      ChainedClosure<Object> chainedClosure0 = new ChainedClosure<Object>(closureArray0);
      // Undeclared exception!
      try { 
        lazySortedMap0.headMap(chainedClosure0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.collections4.functors.ChainedClosure cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }
}
