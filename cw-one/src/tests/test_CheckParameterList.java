package tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sml.Translator;


public class test_CheckParameterList {

	List<String> constrList;
	List<String> progList;
	String fileName = "TranslatorTestFile1.txt";
	Translator t = new Translator(fileName);
	
	@Before
	public void setUp(){
		constrList = new ArrayList<>();
		progList = new ArrayList<>();
	}
	
	/**
	 * Tests constructor parameter list similar to  + - * /
	 */
	@Test
	public void testAddParams(){
		constrList.add("int");
		constrList.add("int");
		constrList.add("int");
		progList.add("1");
		progList.add("2");
		progList.add("3");
		
		boolean ans1 = t.checkParameterList(constrList, progList);
		Assert.assertTrue(ans1);
		progList.remove(2);
		progList.add("L");
		boolean ans2 = t.checkParameterList(constrList, progList);
		Assert.assertFalse(ans2);
		
	}
	
	/**
	 * Tests constructor paramater list similar to bnz
	 */
	@Test
	public void testBNZParams(){
		constrList.add("int");
		constrList.add("String");;
		progList.add("1");
		progList.add("L");

		boolean ans1 = t.checkParameterList(constrList, progList);
		Assert.assertTrue(ans1);
		
		progList.remove(1);
		progList.add("1");
		boolean ans2 = t.checkParameterList(constrList, progList);
		Assert.assertFalse(ans2);
	
	}	
}
