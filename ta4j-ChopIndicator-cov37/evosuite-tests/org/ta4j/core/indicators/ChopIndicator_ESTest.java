/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 06 13:16:18 GMT 2021
 */

package org.ta4j.core.indicators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.ta4j.core.BarSeries;
import org.ta4j.core.BaseBarSeries;
import org.ta4j.core.indicators.ChopIndicator;

 
public class ChopIndicator_ESTest{

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChopIndicator chopIndicator0 = null;
      try {
        chopIndicator0 = new ChopIndicator((BarSeries) null, 4030, 4030);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ta4j.core.indicators.AbstractIndicator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BaseBarSeries baseBarSeries0 = new BaseBarSeries();
      ChopIndicator chopIndicator0 = null;
      try {
        chopIndicator0 = new ChopIndicator(baseBarSeries0, (-1), (-1));
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }
}