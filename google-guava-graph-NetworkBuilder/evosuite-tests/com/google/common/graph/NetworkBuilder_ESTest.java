/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 04 15:02:14 GMT 2021
 */

package com.google.common.graph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.ImmutableNetwork;
import com.google.common.graph.Network;
import com.google.common.graph.NetworkBuilder;
import com.google.common.graph.StandardMutableNetwork;
import com.google.common.graph.StandardNetwork;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class NetworkBuilder_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NetworkBuilder<Object, Object> networkBuilder0 = NetworkBuilder.undirected();
      StandardNetwork<Comparable<Pattern>, Comparable<Object>> standardNetwork0 = new StandardNetwork<Comparable<Pattern>, Comparable<Object>>(networkBuilder0);
      NetworkBuilder<Comparable<Pattern>, Comparable<Object>> networkBuilder1 = NetworkBuilder.from((Network<Comparable<Pattern>, Comparable<Object>>) standardNetwork0);
      networkBuilder1.allowsParallelEdges(true);
      assertFalse(standardNetwork0.allowsParallelEdges());
      assertFalse(standardNetwork0.isDirected());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NetworkBuilder<Object, Object> networkBuilder0 = NetworkBuilder.undirected();
      StandardMutableNetwork<Comparable<Object>, Object> standardMutableNetwork0 = new StandardMutableNetwork<Comparable<Object>, Object>(networkBuilder0);
      ImmutableNetwork<Comparable<Object>, Object> immutableNetwork0 = ImmutableNetwork.copyOf((Network<Comparable<Object>, Object>) standardMutableNetwork0);
      NetworkBuilder<Comparable<Object>, Object> networkBuilder1 = NetworkBuilder.from((Network<Comparable<Object>, Object>) immutableNetwork0);
      NetworkBuilder<Comparable<Object>, Object> networkBuilder2 = networkBuilder1.allowsSelfLoops(true);
      networkBuilder2.allowsParallelEdges(false);
      assertFalse(standardMutableNetwork0.allowsParallelEdges());
      assertFalse(standardMutableNetwork0.isDirected());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NetworkBuilder<Object, Object> networkBuilder0 = NetworkBuilder.undirected();
      StandardMutableNetwork<Object, Pattern> standardMutableNetwork0 = new StandardMutableNetwork<Object, Pattern>(networkBuilder0);
      NetworkBuilder<Object, Pattern> networkBuilder1 = NetworkBuilder.from((Network<Object, Pattern>) standardMutableNetwork0);
      networkBuilder1.expectedNodeCount(911);
      assertFalse(standardMutableNetwork0.isDirected());
      assertFalse(standardMutableNetwork0.allowsParallelEdges());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NetworkBuilder<Object, Object> networkBuilder0 = NetworkBuilder.undirected();
      StandardMutableNetwork<Object, ElementOrder<String>> standardMutableNetwork0 = new StandardMutableNetwork<Object, ElementOrder<String>>(networkBuilder0);
      ImmutableNetwork<Object, ElementOrder<String>> immutableNetwork0 = ImmutableNetwork.copyOf((Network<Object, ElementOrder<String>>) standardMutableNetwork0);
      NetworkBuilder<Object, ElementOrder<String>> networkBuilder1 = NetworkBuilder.from((Network<Object, ElementOrder<String>>) immutableNetwork0);
      // Undeclared exception!
      try { 
        networkBuilder1.nodeOrder((ElementOrder<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NetworkBuilder<Object, Object> networkBuilder0 = NetworkBuilder.undirected();
      StandardMutableNetwork<Object, Pattern> standardMutableNetwork0 = new StandardMutableNetwork<Object, Pattern>(networkBuilder0);
      NetworkBuilder<Object, Pattern> networkBuilder1 = NetworkBuilder.from((Network<Object, Pattern>) standardMutableNetwork0);
      NetworkBuilder<Object, Pattern> networkBuilder2 = networkBuilder1.allowsSelfLoops(false);
      networkBuilder2.expectedEdgeCount = null;
      // Undeclared exception!
      try { 
        networkBuilder2.immutable();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.graph.StandardNetwork", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        NetworkBuilder.from((Network<String, Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.graph.NetworkBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NetworkBuilder<Object, Object> networkBuilder0 = NetworkBuilder.undirected();
      StandardMutableNetwork<String, String> standardMutableNetwork0 = new StandardMutableNetwork<String, String>(networkBuilder0);
      ImmutableNetwork<String, String> immutableNetwork0 = ImmutableNetwork.copyOf((Network<String, String>) standardMutableNetwork0);
      NetworkBuilder<String, String> networkBuilder1 = NetworkBuilder.from((Network<String, String>) immutableNetwork0);
      // Undeclared exception!
      try { 
        networkBuilder1.expectedEdgeCount((-713));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not true that java.lang.Integer@0000000025 is non-negative.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NetworkBuilder<Object, Object> networkBuilder0 = NetworkBuilder.directed();
      StandardMutableNetwork<String, String> standardMutableNetwork0 = new StandardMutableNetwork<String, String>(networkBuilder0);
      NetworkBuilder<String, String> networkBuilder1 = NetworkBuilder.from((Network<String, String>) standardMutableNetwork0);
      networkBuilder1.build();
      assertFalse(standardMutableNetwork0.allowsParallelEdges());
      assertTrue(standardMutableNetwork0.isDirected());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NetworkBuilder<Object, Object> networkBuilder0 = NetworkBuilder.undirected();
      StandardMutableNetwork<Object, Pattern> standardMutableNetwork0 = new StandardMutableNetwork<Object, Pattern>(networkBuilder0);
      NetworkBuilder<Object, Pattern> networkBuilder1 = NetworkBuilder.from((Network<Object, Pattern>) standardMutableNetwork0);
      networkBuilder1.expectedEdgeCount(0);
      assertFalse(standardMutableNetwork0.allowsParallelEdges());
      assertFalse(standardMutableNetwork0.isDirected());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NetworkBuilder<Object, Object> networkBuilder0 = NetworkBuilder.undirected();
      StandardMutableNetwork<Object, Pattern> standardMutableNetwork0 = new StandardMutableNetwork<Object, Pattern>(networkBuilder0);
      NetworkBuilder<Object, Pattern> networkBuilder1 = NetworkBuilder.from((Network<Object, Pattern>) standardMutableNetwork0);
      networkBuilder1.immutable();
      assertFalse(standardMutableNetwork0.isDirected());
      assertFalse(standardMutableNetwork0.allowsParallelEdges());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NetworkBuilder<Object, Object> networkBuilder0 = NetworkBuilder.directed();
      // Undeclared exception!
      try { 
        networkBuilder0.expectedNodeCount((-677));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not true that java.lang.Integer@0000000005 is non-negative.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}
