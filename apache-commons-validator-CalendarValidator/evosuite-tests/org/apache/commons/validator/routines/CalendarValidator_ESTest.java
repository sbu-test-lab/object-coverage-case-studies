/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 22 12:27:46 GMT 2021
 */

package org.apache.commons.validator.routines;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.Format;
import java.text.NumberFormat;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.validator.routines.CalendarValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

 
public class CalendarValidator_ESTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      Locale locale0 = Locale.KOREA;
      TimeZone timeZone0 = TimeZone.getDefault();
      Calendar calendar0 = calendarValidator0.validate("", "", locale0, timeZone0);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator(false, 1164);
      Calendar calendar0 = calendarValidator0.validate("", (String) null);
      assertNull(calendar0);
  }
/* manually removed becuase of test fails when running using general junit runner instead of evo-suite-runner
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      Locale locale0 = new Locale("H9fs{n)1j", "org.apache.commons.validator.routines.AbstractCalendarValidator", "&Dg");
      Calendar calendar0 = calendarValidator0.validate("2/14/14", locale0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=2014,MONTH=1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=14,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", calendar0.toString());
  }
*/

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator();
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.US;
      Calendar calendar0 = calendarValidator0.validate("8", "8", locale0, timeZone0);
      assertFalse(calendar0.isLenient());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator();
      Locale locale0 = Locale.GERMANY;
      Calendar calendar0 = calendarValidator0.validate("org.apache.commons.validator.routines.CalendarValidator", "y]/", locale0);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      Calendar calendar0 = calendarValidator0.validate("&", "&");
      assertEquals(1, calendar0.getFirstDayOfWeek());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      mockSimpleDateFormat0.setCalendar((Calendar) null);
      Object object0 = calendarValidator0.processParsedValue((Object) null, mockSimpleDateFormat0);
      assertNull(object0);
  }

/* manually removed becuase of test fails when running using general junit runner instead of evo-suite-runner
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator(true, (-5230));
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      Object object0 = calendarValidator0.processParsedValue(mockSimpleDateFormat0, mockSimpleDateFormat0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", object0.toString());
  }
*/

/* manually removed becuase of test fails when running using general junit runner instead of evo-suite-runner
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator();
      Locale locale0 = Locale.US;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = calendarValidator0.validate("8", "8", locale0);
      int int0 = calendarValidator0.compareYears(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertEquals(1, int0);
  }
*/

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 2, (-719), 1, 1);
      Locale locale0 = Locale.ENGLISH;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
      int int0 = calendarValidator0.compareYears(mockGregorianCalendar0, mockGregorianCalendar1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1374, 1374, 1374);
      int int0 = calendarValidator0.compareWeeks(mockGregorianCalendar0, mockGregorianCalendar1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-553), 524, (-553), 524, 1639, (-553));
      Locale locale0 = Locale.GERMANY;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
      int int0 = calendarValidator0.compareWeeks(mockGregorianCalendar0, mockGregorianCalendar1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator(true, 0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      int int0 = calendarValidator0.compareQuarters((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator();
      Locale locale0 = Locale.GERMANY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(0, 1, 12, 1, 0, 0);
      int int0 = calendarValidator0.compareQuarters((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1, 0);
      assertEquals(1, int0);
  }

/* manually removed becuase of test fails when running using general junit runner instead of evo-suite-runner
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator();
      Locale locale0 = Locale.US;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = calendarValidator0.validate("8", "8", locale0);
      int int0 = calendarValidator0.compareQuarters(calendar0, (Calendar) mockGregorianCalendar0, (-1070));
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertEquals((-1), int0);
  }
*/

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, (-166), 1, 5, 1182, 1);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(5, 1, 1, 0, 1182);
      int int0 = calendarValidator0.compareQuarters((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(12, 0, 1);
      int int0 = calendarValidator0.compareQuarters((Calendar) mockGregorianCalendar0, calendar0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      Calendar calendar0 = MockCalendar.getInstance();
      int int0 = calendarValidator0.compareMonths(calendar0, calendar0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1266), 0, 0);
      int int0 = calendarValidator0.compareMonths(calendar0, mockGregorianCalendar0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator(true, 5);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5, (-2681), 14);
      TimeZone timeZone0 = TimeZone.getTimeZone("kKA\"5=\"");
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(timeZone0);
      int int0 = calendarValidator0.compareMonths(mockGregorianCalendar0, mockGregorianCalendar1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(12, 0, 1);
      int int0 = calendarValidator0.compareDates(calendar0, mockGregorianCalendar0);
      assertEquals(1, int0);
  }

/* manually removed becuase of test fails when running using general junit runner instead of evo-suite-runner
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      Calendar calendar0 = MockCalendar.getInstance();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, ";", 0, 0, (-1924), (-1924), (-460), 0, 0, (-460));
      Calendar calendar1 = calendarValidator0.validate(";", ";", (TimeZone) simpleTimeZone0);
      int int0 = calendarValidator0.compareDates(calendar1, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=;,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=-1924,startTime=-1924,startTimeMode=0,endMode=0,endMonth=-460,endDay=0,endDayOfWeek=0,endTime=-460,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertEquals((-1), int0);
  }
*/

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator(false, 12);
      TimeZone timeZone0 = TimeZone.getTimeZone("dp@0@");
      // Undeclared exception!
      try { 
        calendarValidator0.validate("nE!{jz0.I<-5VF#", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 12
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator(false, 2283);
      Locale locale0 = Locale.KOREA;
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        calendarValidator0.validate("%]scZp<4+[Sw]Z%7", locale0, timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 2283
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator(true, 233);
      Locale locale0 = Locale.ROOT;
      // Undeclared exception!
      try { 
        calendarValidator0.validate(")w)o=Rc#_0,V<#", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 233
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator(false, 11);
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        calendarValidator0.validate(":]AfLtQlc,pKL-F", (String) null, timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 11
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      Locale locale0 = Locale.UK;
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        calendarValidator0.validate("=O", "=O", locale0, timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'O'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator(false, 0);
      // Undeclared exception!
      try { 
        calendarValidator0.validate("org.apache.commons.validator.routines.AbstractCalendarValidator", "org.apache.commons.validator.routines.AbstractCalendarValidator", (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'o'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator();
      // Undeclared exception!
      try { 
        calendarValidator0.validate("psQx", "psQx");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'p'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator(false, 2609);
      // Undeclared exception!
      try { 
        calendarValidator0.validate("org.apache.commons.validator.routines.AbstractFormatValidator");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 2609
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator();
      Calendar calendar0 = MockCalendar.getInstance();
      // Undeclared exception!
      try { 
        calendarValidator0.processParsedValue(calendar0, (Format) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.CalendarValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator(false, 0);
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance();
      // Undeclared exception!
      try { 
        calendarValidator0.processParsedValue((Object) null, numberFormat0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.text.DecimalFormat cannot be cast to java.text.DateFormat
         //
         verifyException("org.apache.commons.validator.routines.CalendarValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator();
      // Undeclared exception!
      try { 
        calendarValidator0.compareYears((Calendar) null, (Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.AbstractCalendarValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator();
      Locale locale0 = Locale.US;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = calendarValidator0.validate(";", ";", locale0);
      calendar0.set(0, 1, 0, (-441), (-1), 8);
      // Undeclared exception!
      try { 
        calendarValidator0.compareYears(mockGregorianCalendar0, calendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator(true, (-5230));
      // Undeclared exception!
      try { 
        calendarValidator0.compareWeeks((Calendar) null, (Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.AbstractCalendarValidator", e);
      }
  }

/* manually removed becuase of test fails when running using general junit runner instead of evo-suite-runner
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      Locale locale0 = Locale.FRANCE;
      Calendar calendar0 = calendarValidator0.validate("2/14/14", locale0, timeZone0);
      // Undeclared exception!
      try { 
        calendarValidator0.compareQuarters(calendar0, (Calendar) mockGregorianCalendar0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }
*/

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator(false, 1164);
      // Undeclared exception!
      try { 
        calendarValidator0.compareQuarters((Calendar) null, (Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.AbstractCalendarValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator();
      Calendar calendar0 = MockCalendar.getInstance();
      calendar0.set(0, 266);
      // Undeclared exception!
      try { 
        calendarValidator0.compareQuarters(calendar0, calendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator();
      Calendar calendar0 = MockCalendar.getInstance();
      calendar0.set(0, (-697));
      // Undeclared exception!
      try { 
        calendarValidator0.compareMonths(calendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      // Undeclared exception!
      try { 
        calendarValidator0.compareDates((Calendar) null, (Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.AbstractCalendarValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        CalendarValidator.adjustToTimeZone((Calendar) null, timeZone0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.CalendarValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator(true, (-1));
      // Undeclared exception!
      try { 
        calendarValidator0.compareQuarters((Calendar) null, (Calendar) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.AbstractCalendarValidator", e);
      }
  }

/* manually removed becuase of test fails when running using general junit runner instead of evo-suite-runner
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "", 0, 0, (-1925), (-1925), (-459), 0, 0, (-459));
      CalendarValidator.adjustToTimeZone(calendar0, simpleTimeZone0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=-1925,startTime=-1925,startTimeMode=0,endMode=0,endMonth=-459,endDay=0,endDayOfWeek=0,endTime=-459,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }
*/

/* manually removed becuase of test fails when running using general junit runner instead of evo-suite-runner
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      CalendarValidator.adjustToTimeZone(calendar0, (TimeZone) null);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=null,firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }
*/


  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator();
      Calendar calendar0 = MockCalendar.getInstance();
      int int0 = calendarValidator0.compareWeeks(calendar0, calendar0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      Calendar calendar0 = calendarValidator0.validate((String) null);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "", 0, 0, (-1925), (-1925), (-459), 0, 0, (-459));
      Calendar calendar0 = calendarValidator0.validate((String) null, (String) null, (TimeZone) simpleTimeZone0);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      int int0 = calendarValidator0.compareYears(mockGregorianCalendar0, mockGregorianCalendar0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      Calendar calendar0 = MockCalendar.getInstance();
      int int0 = calendarValidator0.compareDates(calendar0, calendar0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      Calendar calendar0 = MockCalendar.getInstance();
      // Undeclared exception!
      try { 
        calendarValidator0.compareMonths((Calendar) null, calendar0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.AbstractCalendarValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      Locale locale0 = Locale.CANADA;
      Calendar calendar0 = calendarValidator0.validate((String) null, locale0, (TimeZone) null);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CalendarValidator calendarValidator0 = new CalendarValidator();
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Calendar calendar0 = calendarValidator0.validate("z_ZgbRz", timeZone0);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      Calendar calendar0 = MockCalendar.getInstance();
      int int0 = calendarValidator0.compareQuarters(calendar0, calendar0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CalendarValidator calendarValidator0 = CalendarValidator.getInstance();
      Locale locale0 = Locale.CHINA;
      Calendar calendar0 = calendarValidator0.validate("", locale0);
      assertNull(calendar0);
  }
}
