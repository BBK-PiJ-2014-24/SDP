package tests;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import sml.AddInstruction;
import sml.BnzInstruction;
import sml.Instruction;
import sml.Labels;
import sml.LinInstruction;
import sml.Machine;
import sml.MulInstruction;
import sml.Registers;
import sml.SubInstruction;

/**
 * Tests for bnz Instruction
 * @author snewnham
 *
 */
public class TestInstruction_Bnz {

	Machine m;
	Labels labels;
	Instruction in1, in2, in3, in4, in5, in6;
	ArrayList<Instruction> instructionList;
	int a,b,x,y,z;
	int regA, regB, regX, regY, regZ;
	Registers testRegs;
	

	
	
	@Before
	public void setUp(){
		m = new Machine();
		
		labels = new Labels();  // Create own labels
		labels.addLabel("L1");
		labels.addLabel("L2");
		labels.addLabel("L3");
		labels.addLabel("L4");
		labels.addLabel("L5");
		labels.addLabel("L6");
		m.setLabels(labels);
		System.out.println("Labels: " + m.getLabels().toString());
		
		regA = 0; a = 3; 
		regB = 1; b = 1; 
		regX = 2; x = 100;
	
	
		instructionList = new ArrayList<>();  // Create own Program without the translator
		in1 = new LinInstruction("L1", regA, a); // Count register for a loop
		in2 = new LinInstruction("L2", regB, b); // Decrement register in loop
		in3 = new LinInstruction("L3", regX, x); // Start Value in Loops
		
		in4 = new AddInstruction("L4", regX, regX, regB); // Add operation in the Loop
		in5 = new SubInstruction("L5", regA, regA, regB); // Decrement Counter in loop
	
		in6 = new BnzInstruction("L6", regA, "L4"); // Check for end of loop
		
		instructionList.add(in1);
		instructionList.add(in2);
		instructionList.add(in3);
		instructionList.add(in4);
		instructionList.add(in5);
		instructionList.add(in6);
		m.setProg(instructionList);
		System.out.println("Prog: " + m.getProg().toString());

		
		testRegs = new Registers(); // set up mock register for test comparison
				
	}
	
	/**
	 * Test to see if BNZ Can do a loop program 
	 * for(int i = 3; i>=0; i--){x+=1}
	 */
	@Test
	public void test1() {
		
		System.out.println("\nTest 1");
		int a = 0;
		int b = 1;
		int x = 103;
	
		
		testRegs.setRegister(regA, a); //  populate mock register
		testRegs.setRegister(regB, b);
		testRegs.setRegister(regX, x);

		m.execute(); //Run machine
		
		System.out.println(m.getRegisters().toString());
		
		Assert.assertTrue("Check Registers for Bnz: ", testRegs.equals(m.getRegisters()));
	}
	
	/**
	 * Test for adding two negative numbers
	 */

	
	
	
	
	
	
}
