/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 12 03:04:47 GMT 2020
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParseSettings_ESTest extends ParseSettings_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(false, false);
      // Undeclared exception!
      try { 
        parseSettings0.normalizeAttributes((Attributes) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.ParseSettings", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(true, true);
      Attributes attributes0 = new Attributes();
      parseSettings0.normalizeAttributes(attributes0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(false, false);
      String string0 = parseSettings0.normalizeAttribute("#root");
      assertEquals("#root", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(true, true);
      String string0 = parseSettings0.normalizeAttribute("%.[G\"g VO ;");
      assertEquals("%.[G\"g VO ;", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(false, false);
      String string0 = parseSettings0.normalizeTag("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(true, true);
      String string0 = parseSettings0.normalizeTag("*yC[)a|\"Sx");
      assertEquals("*yC[)a|\"Sx", string0);
  }
}
