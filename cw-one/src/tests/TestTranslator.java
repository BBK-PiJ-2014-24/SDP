package tests;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import org.junit.After;
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
	 * Test that Translator translates right operators for +,-, /.
	 */
	@Test
	public void test1(){
		String outputL1 = "L1: add 1 + 2 to 3";  // Test Add Output
		String outputL2 = "L2: sub 1 - 2 to 3"; // Test Sub Output
		String outputL3 = "L3: mul 1 * 2 to 3"; // Test Mul Output
		String outputL4 = "L4: div 1 / 2 to 3"; // Test Div Output
		String outputL5 = "L5: out 4"; // Test Output
		String output = outputL1 + "\n" + outputL2 + "\n" + outputL3 + 
				 "\n" + outputL4 + "\n" + outputL4 + "\n";
		System.out.println("Here is the program; it has " + m.getProg().size() + " instructions.");
        Assert.assertEquals("Test Correct Translator Output: ", output, m.toString());
		
		System.out.println(m);
	//	ins1 = t.getInstruction("L1");
	//	ins1.toString();
		
	}

	
	
	
}
