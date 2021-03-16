/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 08 16:46:54 GMT 2021
 */

package org.ta4j.core.indicators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.ta4j.core.BaseBarSeries;
import org.ta4j.core.Indicator;
import org.ta4j.core.indicators.MACDIndicator;
import org.ta4j.core.indicators.StochasticOscillatorKIndicator;
import org.ta4j.core.indicators.helpers.HighPriceIndicator;
import org.ta4j.core.indicators.helpers.LowPriceIndicator;
import org.ta4j.core.num.Num;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MACDIndicator_ESTest extends MACDIndicator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MACDIndicator mACDIndicator0 = null;
      try {
        mACDIndicator0 = new MACDIndicator((Indicator<Num>) null, (-503), 3613);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ta4j.core.indicators.CachedIndicator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MACDIndicator mACDIndicator0 = null;
      try {
        mACDIndicator0 = new MACDIndicator((Indicator<Num>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ta4j.core.indicators.CachedIndicator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BaseBarSeries baseBarSeries0 = new BaseBarSeries();
      LowPriceIndicator lowPriceIndicator0 = new LowPriceIndicator(baseBarSeries0);
      MACDIndicator mACDIndicator0 = null;
      try {
        mACDIndicator0 = new MACDIndicator(lowPriceIndicator0, 9, 9);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BaseBarSeries baseBarSeries0 = new BaseBarSeries();
      StochasticOscillatorKIndicator stochasticOscillatorKIndicator0 = new StochasticOscillatorKIndicator(baseBarSeries0, (-1030));
      MACDIndicator mACDIndicator0 = null;
      try {
        mACDIndicator0 = new MACDIndicator(stochasticOscillatorKIndicator0, (-478), (-1030));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Long term period count must be greater than short term period count
         //
         verifyException("org.ta4j.core.indicators.MACDIndicator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BaseBarSeries baseBarSeries0 = new BaseBarSeries();
      HighPriceIndicator highPriceIndicator0 = new HighPriceIndicator(baseBarSeries0);
      MACDIndicator mACDIndicator0 = null;
      try {
        mACDIndicator0 = new MACDIndicator(highPriceIndicator0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }
}