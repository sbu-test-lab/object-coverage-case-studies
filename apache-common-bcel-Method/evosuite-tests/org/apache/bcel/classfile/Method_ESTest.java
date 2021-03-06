/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 10 16:03:03 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.PipedInputStream;
import org.apache.bcel.classfile.Attribute;
import org.apache.bcel.classfile.Code;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.ExceptionTable;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.LineNumberTable;
import org.apache.bcel.classfile.LocalVariableTable;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.classfile.NestMembers;
import org.apache.bcel.classfile.ParameterAnnotationEntry;
import org.apache.bcel.classfile.Visitor;
import org.apache.bcel.util.BCELComparator;
import org.apache.bcel.util.ClassLoaderRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class Method_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[15];
      Constant[] constantArray0 = new Constant[6];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPool constantPool1 = constantPool0.copy();
      Method method0 = new Method(1, 1319, 255, attributeArray0, constantPool0);
      // Undeclared exception!
      try { 
        method0.copy(constantPool1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[1];
      Constant[] constantArray0 = new Constant[6];
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("!u4");
      constantArray0[1] = (Constant) constantUtf8_0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Method method0 = new Method(1, 1, 1, attributeArray0, constantPool0);
      method0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[1];
      Constant[] constantArray0 = new Constant[6];
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("!u4");
      constantArray0[1] = (Constant) constantUtf8_0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Method method0 = new Method(1, 1, 1, attributeArray0, constantPool0);
      // Undeclared exception!
      try { 
        method0.toString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid method signature: !u4
         //
         verifyException("org.apache.bcel.classfile.Utility", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      assertEquals(49, javaClass0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[1];
      int[] intArray0 = new int[4];
      Constant[] constantArray0 = new Constant[6];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      NestMembers nestMembers0 = new NestMembers(1, 1319, intArray0, constantPool0);
      attributeArray0[0] = (Attribute) nestMembers0;
      Method method0 = new Method(1, 1319, 255, attributeArray0, constantPool0);
      Method method1 = method0.copy(constantPool0);
      assertFalse(method1.isInterface());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Method method0 = new Method();
      // Undeclared exception!
      try { 
        method0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Method", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[1];
      Constant[] constantArray0 = new Constant[6];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Method method0 = new Method(1, 1319, 255, attributeArray0, constantPool0);
      // Undeclared exception!
      try { 
        method0.hashCode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 255. Constant pool size is: 6
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Method method0 = new Method();
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      method0.setConstantPool(constantPool0);
      // Undeclared exception!
      try { 
        method0.getReturnType();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constant pool at index 0 is null.
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Method method0 = new Method();
      // Undeclared exception!
      try { 
        method0.getParameterAnnotationEntries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ParameterAnnotationEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Method method0 = new Method();
      // Undeclared exception!
      try { 
        method0.getLocalVariableTable();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Method", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Method method0 = new Method();
      // Undeclared exception!
      try { 
        method0.getLineNumberTable();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Method", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Method method0 = new Method();
      // Undeclared exception!
      try { 
        method0.getExceptionTable();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Method", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Method method0 = new Method();
      // Undeclared exception!
      try { 
        method0.getCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Method", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[1];
      Constant[] constantArray0 = new Constant[6];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Method method0 = new Method(1, 1319, 255, attributeArray0, constantPool0);
      // Undeclared exception!
      try { 
        method0.getArgumentTypes();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 255. Constant pool size is: 6
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Method method0 = new Method();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        method0.equals(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.bcel.classfile.Method
         //
         verifyException("org.apache.bcel.classfile.Method$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Method method0 = new Method();
      // Undeclared exception!
      try { 
        method0.accept((Visitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Method", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Method method0 = null;
      try {
        method0 = new Method((Method) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Method method0 = null;
      try {
        method0 = new Method((DataInput) null, (ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Method method0 = null;
      try {
        method0 = new Method(dataInputStream0, constantPool0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[15];
      Constant[] constantArray0 = new Constant[6];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Method method0 = new Method(1, 1319, 255, attributeArray0, constantPool0);
      ParameterAnnotationEntry[] parameterAnnotationEntryArray0 = method0.getParameterAnnotationEntries();
      assertEquals(0, parameterAnnotationEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[1];
      Constant[] constantArray0 = new Constant[6];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Method method0 = new Method(1, 1319, 1319, attributeArray0, constantPool0);
      LineNumberTable lineNumberTable0 = method0.getLineNumberTable();
      assertNull(lineNumberTable0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[1];
      Constant[] constantArray0 = new Constant[6];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Method method0 = new Method(1, 1319, 255, attributeArray0, constantPool0);
      LocalVariableTable localVariableTable0 = method0.getLocalVariableTable();
      assertNull(localVariableTable0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[15];
      Constant[] constantArray0 = new Constant[6];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Method method0 = new Method(1, 1319, 255, attributeArray0, constantPool0);
      Code code0 = method0.getCode();
      assertNull(code0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Method method0 = new Method();
      // Undeclared exception!
      try { 
        method0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BCELComparator bCELComparator0 = Method.getComparator();
      Method.setComparator(bCELComparator0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Method method0 = new Method((-20), (-20), (-675), (Attribute[]) null, (ConstantPool) null);
      // Undeclared exception!
      try { 
        method0.equals((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Method method0 = new Method();
      // Undeclared exception!
      try { 
        method0.getReturnType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[1];
      Constant[] constantArray0 = new Constant[6];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Method method0 = new Method(1, 1319, 255, attributeArray0, constantPool0);
      ExceptionTable exceptionTable0 = method0.getExceptionTable();
      assertNull(exceptionTable0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Method method0 = new Method();
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      method0.accept(emptyVisitor0);
      assertEquals(0, method0.getSignatureIndex());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Method method0 = new Method();
      Method method1 = new Method(method0);
      assertEquals(0, method1.getModifiers());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Method method0 = new Method();
      // Undeclared exception!
      try { 
        method0.getArgumentTypes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      Method method0 = null;
      try {
        method0 = new Method(dataInputStream0, (ConstantPool) null);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }
}
