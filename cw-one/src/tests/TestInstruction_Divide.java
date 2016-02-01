package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sml.AddInstruction;
import sml.Machine;
import sml.Registers;
import sml.SubInstruction;
/**
 * Tests for Divide Instruction
 * @author snewnham
 *
 */


public class TestInstruction_Divide {


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
	 * Test for dividing two positive numbers
	 */
	@Test
	public void test1() {
		
		System.out.println("\nTest 1");
		x = 10;
		y = 5;
		z = 2;
		
		testRegs.setRegister(regX, x); //  populate mock register
		testRegs.setRegister(regY, y);
		testRegs.setRegister(regZ, z);
		
		m.getRegisters().setRegister(regX, x); // add inputs to registers
		m.getRegisters().setRegister(regY, y);
		
		SubInstruction in1 = new SubInstruction("L1", regZ,regX, regY);  // instanstiate Instruction 
		
		System.out.println(in1.toString());
		in1.execute(m);  // Execute Instruction
		System.out.println(m.getRegisters());
		
		Assert.assertTrue("Check Registers for Adding: ", testRegs.equals(m.getRegisters()));
	}
	
	
	/**
	 * Test for dividing two negative numbers
	 */
	@Test
	public void test2() {
		
		System.out.println("\nTest 1");
		x = -10;
		y = -5;
		z = 2;
		
		testRegs.setRegister(regX, x); //  populate mock register
		testRegs.setRegister(regY, y);
		testRegs.setRegister(regZ, z);
		
		m.getRegisters().setRegister(regX, x); // add inputs to registers
		m.getRegisters().setRegister(regY, y);
		
		SubInstruction in1 = new SubInstruction("L1", regZ,regX, regY);  // instanstiate Instruction 
		
		System.out.println(in1.toString());
		in1.execute(m);  // Execute Instruction
		System.out.println(m.getRegisters());
		
		Assert.assertTrue("Check Registers for Adding: ", testRegs.equals(m.getRegisters()));
	}
	
	
}
