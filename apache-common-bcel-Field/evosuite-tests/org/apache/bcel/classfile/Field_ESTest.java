/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 10 15:50:22 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.bcel.classfile.Attribute;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.Field;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.BCELComparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class Field_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[16];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPool constantPool1 = constantPool0.copy();
      Field field0 = new Field(0, 1440, 24, attributeArray0, constantPool1);
      Field field1 = field0.copy(constantPool0);
      assertFalse(field1.isPublic());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Field.setComparator((BCELComparator) null);
      BCELComparator bCELComparator0 = Field.getComparator();
      assertNull(bCELComparator0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[3];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Field field0 = new Field(0, 0, 0, attributeArray0, constantPool0);
      Field field1 = field0.copy(constantPool0);
      assertFalse(field1.isPublic());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[3];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Field field0 = new Field((-1), 1440, 0, attributeArray0, constantPool0);
      Field field1 = field0.copy(constantPool0);
      assertTrue(field1.isStrictfp());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Field field0 = new Field(88, (-96), (-1), attributeArray0, (ConstantPool) null);
      // Undeclared exception!
      try { 
        field0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.FieldOrMethod", e);
      }
  }

/* manually deleted, becuase of, wrong assertion (fail test)
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Field field0 = new Field((-96), (-96), 3650, (Attribute[]) null, (ConstantPool) null);
      // Undeclared exception!
      try { 
        field0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.FieldOrMethod", e);
      }
  }
*/
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BCELComparator bCELComparator0 = JavaClass.getComparator();
      Field.setComparator(bCELComparator0);
      Constant[] constantArray0 = new Constant[3];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Field field0 = new Field(206, 206, 206, (Attribute[]) null, constantPool0);
      // Undeclared exception!
      try { 
        field0.hashCode();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.Field cannot be cast to org.apache.bcel.classfile.JavaClass
         //
         verifyException("org.apache.bcel.classfile.JavaClass$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      Field field0 = new Field(0, (-1784), (-4939), (Attribute[]) null, constantPool0);
      // Undeclared exception!
      try { 
        field0.getType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Constant[] constantArray0 = new Constant[3];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Field field0 = new Field(206, 206, 206, (Attribute[]) null, constantPool0);
      // Undeclared exception!
      try { 
        field0.getConstantValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Field", e);
      }
  }

/* manually deleted, becuase of, wrong assertion (fail test)
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Field field0 = new Field(0, 0, 154, attributeArray0, (ConstantPool) null);
      // Undeclared exception!
      try { 
        field0.equals((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.FieldOrMethod", e);
      }
  }
*/

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Field field0 = new Field(2721, 2721, 2721, (Attribute[]) null, constantPool0);
      // Undeclared exception!
      try { 
        field0.copy(constantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Field field0 = null;
      try {
        field0 = new Field((Field) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Field field0 = null;
      try {
        field0 = new Field((DataInput) null, constantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 3309, 3309);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 3309);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      Field field0 = null;
      try {
        field0 = new Field(dataInputStream0, (ConstantPool) null);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[3];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Field field0 = new Field(0, 1440, 0, attributeArray0, constantPool0);
      // Undeclared exception!
      try { 
        field0.toString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constant pool at index 0 is null.
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Field field0 = new Field(2157, (-85), (-85), attributeArray0, (ConstantPool) null);
      Field field1 = field0.copy((ConstantPool) null);
      assertNotSame(field1, field0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Constant[] constantArray0 = new Constant[3];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Field field0 = new Field(206, 206, 206, (Attribute[]) null, constantPool0);
      Field field1 = new Field(field0);
      assertEquals(206, field1.getSignatureIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BCELComparator bCELComparator0 = Field.getComparator();
      assertNotNull(bCELComparator0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      Field field0 = null;
      try {
        field0 = new Field(dataInputStream0, constantPool0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

/* manually deleted, becuase of, wrong assertion (fail test)
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Constant[] constantArray0 = new Constant[3];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Field field0 = new Field(206, 206, 206, (Attribute[]) null, constantPool0);
      // Undeclared exception!
      try { 
        field0.equals(field0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 206. Constant pool size is: 3
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
*/

/* manually deleted, becuase of, wrong assertion (fail test)
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Constant[] constantArray0 = new Constant[3];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Field field0 = new Field(206, 206, 206, (Attribute[]) null, constantPool0);
      // Undeclared exception!
      try { 
        field0.hashCode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 206. Constant pool size is: 3
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
*/

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Constant[] constantArray0 = new Constant[3];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Field field0 = new Field(206, 206, 206, (Attribute[]) null, constantPool0);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      field0.accept(emptyVisitor0);
      assertFalse(field0.isSynchronized());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[4];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Field field0 = new Field(1726, 1726, 1726, attributeArray0, constantPool0);
      // Undeclared exception!
      try { 
        field0.getType();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 1726. Constant pool size is: 1
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BCELComparator bCELComparator0 = Constant.getComparator();
      Field.setComparator(bCELComparator0);
      Attribute[] attributeArray0 = new Attribute[0];
      Field field0 = new Field(2157, (-85), (-85), attributeArray0, (ConstantPool) null);
      // Undeclared exception!
      try { 
        field0.equals(field0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.Field cannot be cast to org.apache.bcel.classfile.Constant
         //
         verifyException("org.apache.bcel.classfile.Constant$1", e);
      }
  }
}