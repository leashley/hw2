/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 12 02:06:27 GMT 2020
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.StructuralEvaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StructuralEvaluator_ESTest extends StructuralEvaluator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling((Evaluator) null);
      StructuralEvaluator.Parent structuralEvaluator_Parent0 = new StructuralEvaluator.Parent(structuralEvaluator_PreviousSibling0);
      Tag tag0 = Tag.valueOf(":prev*null");
      Attributes attributes0 = new Attributes();
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "", attributes0);
      boolean boolean0 = structuralEvaluator_Parent0.matches(pseudoTextElement0, pseudoTextElement0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Evaluator.IsLastChild evaluator_IsLastChild0 = new Evaluator.IsLastChild();
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(evaluator_IsLastChild0);
      Document document0 = Document.createShell("M&$enLuS@r[");
      boolean boolean0 = structuralEvaluator_Has0.matches(document0, document0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Evaluator.ContainsText evaluator_ContainsText0 = new Evaluator.ContainsText(":parent%s");
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(evaluator_ContainsText0);
      Document document0 = Document.createShell(":parent%s");
      boolean boolean0 = structuralEvaluator_Has0.matches(document0, document0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Tag tag0 = Tag.valueOf(":prev*null");
      Attributes attributes0 = new Attributes();
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "", attributes0);
      StructuralEvaluator.Root structuralEvaluator_Root0 = new StructuralEvaluator.Root();
      boolean boolean0 = structuralEvaluator_Root0.matches(pseudoTextElement0, pseudoTextElement0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Document document0 = Document.createShell(":parent%s");
      Document document1 = document0.clone();
      StructuralEvaluator.Root structuralEvaluator_Root0 = new StructuralEvaluator.Root();
      structuralEvaluator_Root0.matches(document1, document0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling((Evaluator) null);
      StructuralEvaluator.Not structuralEvaluator_Not0 = new StructuralEvaluator.Not(structuralEvaluator_PreviousSibling0);
      String string0 = structuralEvaluator_Not0.toString();
      assertEquals(":not:prev*null", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling((Evaluator) null);
      StructuralEvaluator.ImmediatePreviousSibling structuralEvaluator_ImmediatePreviousSibling0 = new StructuralEvaluator.ImmediatePreviousSibling(structuralEvaluator_PreviousSibling0);
      String string0 = structuralEvaluator_ImmediatePreviousSibling0.toString();
      assertEquals(":prev:prev*null", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Evaluator.ContainsText evaluator_ContainsText0 = new Evaluator.ContainsText(":parent%s");
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(evaluator_ContainsText0);
      StructuralEvaluator.ImmediatePreviousSibling structuralEvaluator_ImmediatePreviousSibling0 = new StructuralEvaluator.ImmediatePreviousSibling(structuralEvaluator_Has0);
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf(":parent%s", parseSettings0);
      CDataNode cDataNode0 = new CDataNode(":ImmediateParent%s");
      Attributes attributes0 = cDataNode0.attributes();
      FormElement formElement0 = new FormElement(tag0, ":ImmediateParent%s", attributes0);
      boolean boolean0 = structuralEvaluator_ImmediatePreviousSibling0.matches(formElement0, formElement0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StructuralEvaluator.Root structuralEvaluator_Root0 = new StructuralEvaluator.Root();
      StructuralEvaluator.Parent structuralEvaluator_Parent0 = new StructuralEvaluator.Parent(structuralEvaluator_Root0);
      String string0 = structuralEvaluator_Parent0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      StructuralEvaluator.ImmediateParent structuralEvaluator_ImmediateParent0 = new StructuralEvaluator.ImmediateParent((Evaluator) null);
  }
}