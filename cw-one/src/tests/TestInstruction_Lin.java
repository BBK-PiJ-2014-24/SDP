package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import sml.AddInstruction;
import sml.LinInstruction;
import sml.Machine;
import sml.Registers;

/**
 * Tests for Lin Instruction
 * @author snewnham
 *
 */

public class TestInstruction_Lin {

	Machine m;
	int x,y,z;
	int regX, regY, regZ;
	Registers testRegs;
	
	@Before
	public void setUp(){
	
		regX = 1;
		regY = 2;
		regZ = 3;

		m = new Machine();
		m.setRegisters(new Registers());  // normally set by m.execute()
		
		System.out.println("Register Initialization \n"+ m.getRegisters()); // show empty registers before hand
		
		testRegs = new Registers(); // set up mock register for test comparison
				
	}
	
	/**
	 * Test for Lin 
	 */
	@Test
	public void test1() {
		
		System.out.println("\nTest 1");
		x = 5;
		y = 6;
		z = 11;
		
		testRegs.setRegister(regX, x); //  populate mock register
		testRegs.setRegister(regY, y);
		testRegs.setRegister(regZ, z);
		
		m.getRegisters().setRegister(regX, x); // add inputs to registers
		m.getRegisters().setRegister(regY, y); //
		m.getRegisters().setRegister(regZ, z); //
		
		LinInstruction in1 = new LinInstruction("L1",regX, x);  // instanstiate Instruction 
		LinInstruction in2 = new LinInstruction("L1",regX, x);  // instanstiate Instruction
		LinInstruction in3 = new LinInstruction("L1",regX, x);  // instanstiate Instruction
		
		System.out.println(in1.toString());
		in1.execute(m);  // Execute Instruction
		System.out.println(m.getRegisters());
		
		Assert.assertTrue("Check Registers for Adding: ", testRegs.equals(m.getRegisters()));
	}
	
	
	

}
