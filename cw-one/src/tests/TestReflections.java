package tests;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

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
		//System.setProperty("file", "KeithSampleProgram.txt");
		//System.out.println(System.getProperty("file"));
		//System.getProperty("file");

		testRegs = new Registers(); // set up mock register for test comparison
	}
	
	/**
	 * Test for simple reflection, given class and given constructor 
	 */
	@Test
	public void test1() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Class<?> theAddClass = AddInstruction.class;
        Constructor<?> addConstruct = theAddClass.getConstructor(String.class, int.class, int.class, int.class);
	 	Instruction reflectAddInstr = (AddInstruction) addConstruct.newInstance(label, r, s1, s2);
	 	
	 	Assert.assertEquals(reflectAddInstr.getClass(), AddInstruction.class);
	 	
	 	System.out.println("Test 1");
	 	System.out.println("I am an " +  reflectAddInstr.getClass().getSimpleName() + "class");
	}
	
	/**
	 * Test for simple reflection and Instantiation, given class, BUT NOT Constructor (Have to find it!!)
	 */
	
	@Test
	public void test2() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		System.out.println("\nTest 2");
		Class<?> theAddClass = AddInstruction.class;
		Constructor<?>[] theConstructors = theAddClass.getConstructors();  // Array of Constructors
		System.out.println("Number of Add Constructors: " + theConstructors.length);
		int k =0;
		for (Constructor<?> c : theConstructors){
			System.out.println("Constructor Number " + k + ": With Parameters");
			Class<?>[] parameterTypes = theConstructors[k].getParameterTypes();
				int kk = 0;
				for(Class cl : parameterTypes){
					String parameterName = parameterTypes[kk].getSimpleName();
					System.out.println(parameterName);
					kk++;
				}
			k++;	
		}
		
		// Grab the contructor with three parameters
		Class<?>[] parameterTypes = theConstructors[1].getParameterTypes();
		List<Object> o = new ArrayList<>();
		o.add(label);
		o.add(r);
		o.add(s1);
		o.add(s2);
		
		Object[] oArr = new Object[4];
		oArr[0] = label;
		oArr[1] = r;
		oArr[2] = s1;
		oArr[3] = s2;
	
		System.out.println("size of param list: " +  parameterTypes.length);
	 	Instruction reflectAddInstr1 = (AddInstruction) theConstructors[1].newInstance(o.get(0),o.get(1),o.get(2),o.get(3));
	 	Instruction reflectAddInstr2 = (AddInstruction) theConstructors[1].newInstance(oArr);
	 	Assert.assertEquals(reflectAddInstr2.getClass(), AddInstruction.class);
	}
	
	
	/**
	 * Test for simple reflection of Instruction superClass, given class, BUT NOT Constructor
	 */
	@Test
	public void test3() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		System.out.println("\nTest 3");
		Class<?> theIClass = Instruction.class;
		Constructor<?>[] theConstructors = theIClass.getConstructors();  // Array of Constructors
		System.out.println("Number of Add Constructors: " + theConstructors.length);
		int k =0;
		for (Constructor<?> c : theConstructors){
			System.out.println("Constructor " + k + " Parameters");
			Class<?>[] parameterTypes = theConstructors[k].getParameterTypes();
				int kk = 0;
				for(Class cl : parameterTypes){
					String parameterName = parameterTypes[kk].getSimpleName();
					System.out.println(parameterName);
					kk++;
				}
			k++;	
		}
	 	//Instruction reflectAddInstr = (AddInstruction) addConstruct.newInstance(label, r, s1, s2);
	 	
	 	//Assert.assertEquals(reflectAddInstr.getClass(), AddInstruction.class);
	}
	
}
