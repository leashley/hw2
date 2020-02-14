/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 12 01:52:40 GMT 2020
 */

package org.jsoup;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.jsoup.SerializationException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SerializationException_ESTest extends SerializationException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SerializationException serializationException0 = new SerializationException("GbJBfZp");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SerializationException serializationException0 = new SerializationException();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      SerializationException serializationException0 = new SerializationException(mockThrowable0);
      SerializationException serializationException1 = new SerializationException("[HmjGo(06H=;+P^y", serializationException0);
      assertFalse(serializationException1.equals((Object)serializationException0));
  }
}