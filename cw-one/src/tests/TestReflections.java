package tests;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sml.AddInstruction;
import sml.Instruction;
import sml.Machine;
import sml.Registers;

public class TestReflections {
	
	Machine m;
	String label;
	int x,y,z,r, s1, s2;
	int regX, regY, regZ;
	Registers testRegs;
	
	
	@Before
	public void setUp(){
		regX = 1;
		regY = 2;
		regZ = 3;
	
		label = "add";
		r = 2;
		s1 = 3;
		s2 = 4;
		System.setProperty("file", "KeithSampleProgram.txt");
		System.out.println(System.getProperty("file"));
		System.getProperty("file");

		testRegs = new Registers(); // set up mock register for test comparison
	}
		
	@Test
	public void test() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Class<?> theAddClass = AddInstruction.class;
        Constructor<?> addConstruct = theAddClass.getConstructor(String.class, int.class, int.class, int.class);
	 	Instruction reflectAddInstr = (AddInstruction) addConstruct.newInstance(label, r, s1, s2);
	 	
	 	Assert.assertEquals(reflectAddInstr.getClass(), AddInstruction.class);
	}
	

}
