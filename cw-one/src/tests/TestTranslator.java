package tests;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sml.Instruction;
import sml.Labels;
import sml.Machine;
import sml.Translator;

/**
 * Test the Translator Output
 */

public class TestTranslator {

	Machine m;
	Translator t;
	String fileName = "TranslatorTestFile1.txt";
	Labels lab;
	ArrayList<Instruction> prog;
	Instruction ins1;
	
	@Before
	public void setUp(){
		m = new Machine();
		t = new Translator(fileName);	
		t.readAndTranslate(m.getLabels(), m.getProg());
		
	}
	
	
	/**
	 * Test that Translator translates right operator.
	 */
	@Test
	public void test1(){
		String outputL1 = "L1: add 1 + 2 to 3";  // Test Add Output
		System.out.println("Here is the program; it has " + m.getProg().size() + " instructions.");
        Assert.assertEquals("Test Correct Translator Output: ", outputL1, m.toString());
		
		System.out.println(m);
	//	ins1 = t.getInstruction("L1");
	//	ins1.toString();
		
	}
	
	
}
