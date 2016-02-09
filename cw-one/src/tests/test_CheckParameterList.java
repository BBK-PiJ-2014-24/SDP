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
	 * Tests constructor list similar to  + - * /
	 */
	@Test
	public void testAdd(){
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
}
