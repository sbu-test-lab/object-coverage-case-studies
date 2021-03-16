/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 10 16:12:41 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.bcel.classfile.Attribute;
import org.apache.bcel.classfile.Code;
import org.apache.bcel.classfile.CodeException;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.ModuleMainClass;
import org.apache.bcel.util.ClassLoaderRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

public class Code_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Code code0 = new Code((-741), (-741), (-741), (-741), (byte[]) null, (CodeException[]) null, attributeArray0, (ConstantPool) null);
      code0.setMaxLocals((-35));
      assertEquals((-35), code0.getMaxLocals());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      CodeException[] codeExceptionArray0 = new CodeException[1];
      Attribute[] attributeArray0 = new Attribute[1];
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      ModuleMainClass moduleMainClass0 = new ModuleMainClass((-5), (-1510), 2, constantPool0);
      attributeArray0[0] = (Attribute) moduleMainClass0;
      Code code0 = new Code((-456), 0, (-889), 9, byteArray0, codeExceptionArray0, attributeArray0, constantPool0);
      int int0 = code0.getMaxLocals();
      assertEquals(9, int0);
      assertEquals((-1483), code0.getLength());
      assertEquals((-889), code0.getMaxStack());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      CodeException[] codeExceptionArray0 = new CodeException[1];
      Attribute[] attributeArray0 = new Attribute[1];
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      ModuleMainClass moduleMainClass0 = new ModuleMainClass((-5), (-1510), 2, constantPool0);
      attributeArray0[0] = (Attribute) moduleMainClass0;
      Code code0 = new Code((-456), 0, (-889), 9, byteArray0, codeExceptionArray0, attributeArray0, constantPool0);
      code0.getExceptionTable();
      assertEquals((-1483), code0.getLength());
      assertEquals((-889), code0.getMaxStack());
      assertEquals(9, code0.getMaxLocals());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Code code0 = new Code((-741), (-741), (-741), (-741), (byte[]) null, (CodeException[]) null, attributeArray0, (ConstantPool) null);
      Attribute[] attributeArray1 = new Attribute[2];
      // Undeclared exception!
      try { 
        code0.setAttributes(attributeArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Code", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Code code0 = new Code((-741), (-741), (-741), (-741), (byte[]) null, (CodeException[]) null, attributeArray0, (ConstantPool) null);
      // Undeclared exception!
      try { 
        code0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Code code0 = null;
      try {
        code0 = new Code((Code) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Code", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Code code0 = null;
      try {
        code0 = new Code(0, 0, (DataInput) null, (ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      Code code0 = null;
      try {
        code0 = new Code(0, 796, dataInputStream0, constantPool0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      Code code0 = null;
      try {
        code0 = new Code((-1238), 8, dataInputStream0, (ConstantPool) null);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[5];
      Code code0 = null;
      try {
        code0 = new Code((-741), (-741), (-741), (-741), (byte[]) null, (CodeException[]) null, attributeArray0, (ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Code", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Code code0 = new Code((-741), (-741), (-741), (-741), (byte[]) null, (CodeException[]) null, attributeArray0, (ConstantPool) null);
      String string0 = code0.toString(true);
      assertEquals("Code(maxStack = -741, maxLocals = -741, code_length = 0)\n", string0);
      assertEquals(12, code0.getLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Code code0 = new Code((-741), (-741), (-741), (-741), (byte[]) null, (CodeException[]) null, attributeArray0, (ConstantPool) null);
      int int0 = code0.getMaxStack();
      assertEquals((-741), int0);
      assertEquals(12, code0.getLength());
      assertEquals((-741), code0.getMaxLocals());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Code code0 = new Code((-741), (-741), (-741), (-741), (byte[]) null, (CodeException[]) null, attributeArray0, (ConstantPool) null);
      Attribute[] attributeArray1 = code0.getAttributes();
      assertEquals((-741), code0.getMaxLocals());
      assertSame(attributeArray1, attributeArray0);
      assertEquals((-741), code0.getMaxStack());
      assertEquals(12, code0.getLength());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Code code0 = new Code((-741), (-741), (-741), (-741), (byte[]) null, (CodeException[]) null, attributeArray0, (ConstantPool) null);
      int int0 = code0.getMaxLocals();
      assertEquals((-741), code0.getMaxStack());
      assertEquals(12, code0.getLength());
      assertEquals((-741), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Code code0 = new Code((-741), (-741), (-741), (-741), (byte[]) null, (CodeException[]) null, attributeArray0, (ConstantPool) null);
      Code code1 = (Code)code0.copy((ConstantPool) null);
      assertEquals((-741), code1.getMaxStack());
      assertNotSame(code1, code0);
      assertEquals((-741), code1.getMaxLocals());
      assertEquals(12, code1.getLength());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Code code0 = new Code((-741), (-741), (-741), (-741), (byte[]) null, (CodeException[]) null, attributeArray0, (ConstantPool) null);
      CodeException[] codeExceptionArray0 = code0.getExceptionTable();
      code0.setExceptionTable(codeExceptionArray0);
      assertEquals((-741), code0.getMaxStack());
      assertEquals((-741), code0.getMaxLocals());
      assertEquals(12, code0.getLength());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Code code0 = new Code((-741), (-741), (-741), (-741), (byte[]) null, (CodeException[]) null, attributeArray0, (ConstantPool) null);
      code0.setExceptionTable((CodeException[]) null);
      assertEquals((-741), code0.getMaxStack());
      assertEquals(12, code0.getLength());
      assertEquals((-741), code0.getMaxLocals());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      CodeException[] codeExceptionArray0 = new CodeException[1];
      Attribute[] attributeArray0 = new Attribute[1];
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      ModuleMainClass moduleMainClass0 = new ModuleMainClass(0, (-1510), 2, constantPool0);
      attributeArray0[0] = (Attribute) moduleMainClass0;
      Code code0 = new Code((-463), 0, (-889), 9, byteArray0, codeExceptionArray0, attributeArray0, constantPool0);
      code0.setCode(byteArray0);
      assertEquals((-889), code0.getMaxStack());
      assertEquals((-1483), code0.getLength());
      assertEquals(9, code0.getMaxLocals());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Code code0 = new Code((-741), (-741), (-741), (-741), (byte[]) null, (CodeException[]) null, attributeArray0, (ConstantPool) null);
      code0.setCode((byte[]) null);
      assertEquals(12, code0.getLength());
      assertEquals((-741), code0.getMaxStack());
      assertEquals((-741), code0.getMaxLocals());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Code code0 = new Code((-741), (-741), (-741), (-741), (byte[]) null, (CodeException[]) null, attributeArray0, (ConstantPool) null);
      code0.setAttributes(attributeArray0);
      assertEquals((-741), code0.getMaxLocals());
      assertEquals((-741), code0.getMaxStack());
      assertEquals(12, code0.getLength());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Code code0 = new Code((-741), (-741), (-741), (-741), (byte[]) null, (CodeException[]) null, attributeArray0, (ConstantPool) null);
      code0.getLocalVariableTable();
      assertEquals((-741), code0.getMaxLocals());
      assertEquals(12, code0.getLength());
      assertEquals((-741), code0.getMaxStack());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Code code0 = new Code((-741), (-741), (-741), (-741), (byte[]) null, (CodeException[]) null, attributeArray0, (ConstantPool) null);
      code0.getLineNumberTable();
      assertEquals(12, code0.getLength());
      assertEquals((-741), code0.getMaxLocals());
      assertEquals((-741), code0.getMaxStack());
  }


/* manulay deleted becuse of assertion error in linux/centos
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      byte[] byteArray0 = javaClass0.getBytes();
      assertEquals(18912, byteArray0.length);
  }
*/

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Code code0 = new Code((-741), (-741), (-741), (-741), (byte[]) null, (CodeException[]) null, attributeArray0, (ConstantPool) null);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      code0.accept(emptyVisitor0);
      assertEquals((-741), code0.getMaxStack());
      assertEquals((-741), code0.getMaxLocals());
      assertEquals(12, code0.getLength());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Code code0 = new Code((-741), (-741), (-741), (-741), (byte[]) null, (CodeException[]) null, attributeArray0, (ConstantPool) null);
      code0.setMaxStack(1795);
      assertEquals(1795, code0.getMaxStack());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[0];
      Code code0 = new Code((-741), (-741), (-741), (-741), (byte[]) null, (CodeException[]) null, attributeArray0, (ConstantPool) null);
      String string0 = code0.toString();
      assertEquals("Code(maxStack = -741, maxLocals = -741, code_length = 0)\n", string0);
      assertEquals(12, code0.getLength());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      CodeException[] codeExceptionArray0 = new CodeException[1];
      Attribute[] attributeArray0 = new Attribute[1];
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      ModuleMainClass moduleMainClass0 = new ModuleMainClass(0, (-1510), 2, constantPool0);
      attributeArray0[0] = (Attribute) moduleMainClass0;
      Code code0 = new Code((-463), 0, (-889), 9, byteArray0, codeExceptionArray0, attributeArray0, constantPool0);
      Code code1 = new Code(code0);
      assertEquals(9, code0.getMaxLocals());
      assertEquals((-1483), code1.getLength());
      assertEquals((-889), code0.getMaxStack());
  }
}