/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 12 02:13:42 GMT 2020
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Collector;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.Evaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Collector_ESTest extends Collector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      Element element0 = new Element("Tag name must not be empty.");
      Element element1 = Collector.findFirst(combiningEvaluator_Or0, element0);
      assertNull(element1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Evaluator.IndexGreaterThan evaluator_IndexGreaterThan0 = new Evaluator.IndexGreaterThan((-677));
      Document document0 = Document.createShell("");
      Element element0 = Collector.findFirst(evaluator_IndexGreaterThan0, document0);
      assertSame(document0, element0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Document document0 = new Document("");
      document0.normalise();
  }
}
