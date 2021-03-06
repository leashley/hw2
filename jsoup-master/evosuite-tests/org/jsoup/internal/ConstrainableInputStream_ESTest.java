/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 12 01:13:14 GMT 2020
 */

package org.jsoup.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.jsoup.internal.ConstrainableInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstrainableInputStream_ESTest extends ConstrainableInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)7);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(byteArrayInputStream0, 32768, (byte)0);
      ByteBuffer byteBuffer0 = constrainableInputStream0.readToByteBuffer(2265);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=5 cap=5]", byteBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap((InputStream) null, 643, 643);
      // Undeclared exception!
      try { 
        constrainableInputStream0.readToByteBuffer((-3890));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxSize must be 0 (unlimited) or larger
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 2456, 2456);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(byteArrayInputStream0, 2456, 2456);
      ByteBuffer byteBuffer0 = constrainableInputStream0.readToByteBuffer(3527);
      assertEquals(0, byteBuffer0.limit());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(pushbackInputStream0, 1535, 1535);
      constrainableInputStream0.timeout(1L, 1535);
      try { 
        constrainableInputStream0.readToByteBuffer(0);
        fail("Expecting exception: SocketTimeoutException");
      
      } catch(SocketTimeoutException e) {
         //
         // Read timeout
         //
         verifyException("org.jsoup.internal.ConstrainableInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap((InputStream) null, 32768, 0);
      try { 
        constrainableInputStream0.readToByteBuffer(32768);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(byteArrayInputStream0, 1348, 1348);
      // Undeclared exception!
      try { 
        constrainableInputStream0.read(byteArray0, 1348, (-2219));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap((InputStream) null, 32768, 0);
      ConstrainableInputStream constrainableInputStream1 = ConstrainableInputStream.wrap(constrainableInputStream0, 32768, 32768);
      assertSame(constrainableInputStream0, constrainableInputStream1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(138);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        ConstrainableInputStream.wrap(bufferedInputStream0, 138, (-1156));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap((InputStream) null, 2070, 2070);
      try { 
        constrainableInputStream0.reset();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Resetting to invalid mark
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(byteArrayInputStream0, 1348, 1348);
      ConstrainableInputStream constrainableInputStream1 = constrainableInputStream0.timeout(1348, 1348);
      System.setCurrentTimeMillis(1348);
      // Undeclared exception!
      try { 
        constrainableInputStream1.read(byteArray0, 1348, (-2219));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }
}
