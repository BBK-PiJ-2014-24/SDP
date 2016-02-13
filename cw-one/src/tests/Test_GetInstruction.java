package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sml.AddInstruction;

import sml.Translator;

public class Test_GetInstruction {
	
	String label;
    String ans;
	Translator t;
	String fileName = "TranslatorTestFile1.txt";
	
	@Before
	public void setUp(){
		label = "add";
		t = new Translator(fileName);
	}
	
	
	/**
	 * Test that the Class can be created from a string 
	 * @throws ClassNotFoundException
	 */
	@Test
	public void test1() throws ClassNotFoundException{
		
		String className = t.classNameCreator(label);
		System.out.println("className = " + className);
        Class<?> theInstrClass =  AddInstruction.class; //Convert StringName to class;
     
        Class<?> myGuess= Class.forName(className); 
        Assert.assertEquals(theInstrClass, myGuess );
        
   
        

	}
	

}
