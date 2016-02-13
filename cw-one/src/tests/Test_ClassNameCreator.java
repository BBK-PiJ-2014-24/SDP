package tests;

/**
 * Quick test for classNameCreator() method in Translator
 * @author snewnham
 *
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sml.Translator;

public class Test_ClassNameCreator {

	String label;
    String ans;
	Translator t;
	String fileName = "TranslatorTestFile1.txt";
	
	@Before
	public void setUp(){
		label = "add";
		t = new Translator(fileName);
	}
	
	@Test
	public void test1(){
		
		String className = t.classNameCreator(label);
		ans = "AddInstruction.class";
		System.out.println("className = " + className);
		Assert.assertEquals("Test Correct Class Name is Corrected: ", ans, className);
	}
	
}
