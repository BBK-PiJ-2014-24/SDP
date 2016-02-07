package tests;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import sml.AddInstruction;
import sml.DivInstruction;
import sml.Machine;
import sml.MulInstruction;
import sml.OutInstruction;
import sml.Registers;
import sml.SubInstruction;

/**
 * Tests for Out Instruction
 * @author snewnham
 *
 */


public class TestInstruction_Out {
	
	Machine m;
	int x,y,z;
	int regX, regY, regZ;
	Registers testRegs;
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	@Before
	public void setUp(){
	
		regX = 1;
		regY = 2;
		regZ = 3;

		m = new Machine();
		m.setRegisters(new Registers());  // normally set by m.execute()
		
		//System.out.println("Register Initialization \n"+ m.getRegisters()); // show empty registers before hand
		
		testRegs = new Registers(); // set up mock register for test comparison
		
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
		
	}
	
	
	
	/**
	 * Test for Correct register Output
	 */

	@Test
	public void test1() {
		
		//System.out.println("\nTest 1");
		x = 12;
		
		
		testRegs.setRegister(regX, x); //  populate mock register

		
		m.getRegisters().setRegister(regX, x); // add inputs to registers

		
		OutInstruction in1 = new OutInstruction("L1", regX);  // instantiate Instruction 
		in1.execute(m);
		
		Assert.assertEquals("Check Register OutPut, for: ", "12\n", outContent.toString() );
	}
	
	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}
	
	
	
	
	
}
