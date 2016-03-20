package myReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class ReflectDog {

	public static void main(String[] args) throws  SecurityException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		// The Class Object
		// ----------------
		Class theClass = Dog.class;              // Create the "Class Object" of the class 
		String className = theClass.getName();   // Find the Class Package.Name from the "Class Object"
		System.out.println("Class Name: " + className);
		
		String simpClassName = theClass.getSimpleName();
		System.out.println("Simple Class Name: " + simpClassName);  // Find Class Name (ex package name)
		
		Class superClass = theClass.getSuperclass(); // Getting the SuperClass Class = Object
		System.out.println("The SuperClass Class Name: " + superClass + "\n");  
		
		
		// The Class Modifiers
		// -------------------
		int theModifiers = theClass.getModifiers();			// Find and Test Modifiers of Class
		boolean isPublic = Modifier.isPublic(theModifiers);
		boolean isAbstract = Modifier.isAbstract(theModifiers);
		System.out.println("Class isPublic: " + isPublic);
		System.out.println("Class isAbstract: " + isAbstract + "\n");
		
		
		// The Class Constructors -  should wrap this up in a method called "create()" or something
		// ----------------------
		Constructor[] theConstructors = theClass.getConstructors();  // Array of Constructors
		System.out.println("Number of Constructors: " + theConstructors.length);
		Class[] parameterTypes = theConstructors[0].getParameterTypes(); // Class Array of Constructor's Parameters
																		// [0] = Constructor with most parameters
		System.out.println("Number of Constructor Parameters: " + parameterTypes.length);
		String parameterName1 = parameterTypes[0].getName();
		String parameterName2 = parameterTypes[1].getSimpleName();
		System.out.println("Constructor Parameter: " + parameterName1 + "\t" + parameterName2 + "\n");  
		
		
		// Indirect Instantiation from Class via its Constructor
		// -----------------------------------------------------
		
		Constructor<Dog> c = theClass.getConstructor(int.class);  // Select Specific Constructor by Parameters
		Dog d1  = c.newInstance(6);   // Instantiate FROM REFLECTION. Need to Cast 
		System.out.println("d1 Bark: " + d1.makeBark());  // as Class returns object.
		
		Constructor cc = theClass.getConstructor(int.class, String.class);
		Dog dd = (Dog) cc.newInstance(3, "Brown");
		System.out.println("dd Bark: " + d1.makeBark() + "\n");  // as Class returns object.
		
		
		
		// Fields
		// ------
		
		Field[] field = theClass.getDeclaredFields();  // get Field Names
		String fieldName1 = field[0].getName();
		String fieldName2 = field[1].getName();
		System.out.println("Fields: " + fieldName1 + "\t" + fieldName2);
		
		Class fieldType = field[0].getType();   // get Field Type, by referencing to a Class
		System.out.println("FieldType: " + fieldType.getName());
		
		Field f = theClass.getDeclaredField("age");  // get FieldType for a specific Field "age"
		System.out.println("Get type of field age " + f.getType().getName() + "\n");
		
		//int ageValue = (int) f.get(d1);  // get Field Value for an instantiated Object Dog, d1  
		//System.out.println(ageValue); 
		//f.set(d1, 5);  // CAN ONLY GET/SET if FIELD IS NOT VARIABLE
		
		
		// Methods  - declares Inherited Methods as well
		// --------------------------------------------
		Method[] methods = theClass.getMethods();   // Array of all methods
		int i=1;
		for (Method m :  methods){
			System.out.println(i + " " + m.getName());
			i++;
		}
		System.out.println("\n");
		
		Method m1 =  theClass.getMethod( "makeBark", null);  // Select Method by Name, no parameters
		System.out.println("Method Name: "+ m1.getName());
		Class returnType = m1.getReturnType();
		System.out.println("Method Return Type: " + returnType + "\n");  // Get Return Type
		
		Method m2 = theClass.getMethod("makingBarks", int.class); //Select Method, 1 parameter
		System.out.println("Method Name: "+ m2.getName());
		Class[] parameterType = m2.getParameterTypes();
		System.out.println("Parameter Type: " + parameterType[0].getName());  // Return Parameter Array
		Class returnType2 = m2.getReturnType();
		System.out.println("Method Return Type: " + returnType2 + "\n");  // Get Return Type  - VOID
		
		
		
		m2.invoke(d1,6);   // Invoking a Method on Instantiated Dog Object methodObj(Object, param for methods)
		String s = (String) m1.invoke(d1); // Returning Value on Invoked on DogObject
											// Must be Cast (as returns object)
		System.out.println(s);
		
		// Generics
		// --------
		
		Field fieldGen = theClass.getDeclaredField("dogList");   // Get Field, by Field name as usual.
		Type typeGen = fieldGen.getGenericType();   // Get Generic Type of Field
		System.out.println("Generic Type: " + typeGen + "\n");  
		
	
		// Direct Instantiation with newInstance()
		// ----------------------------------
		
		Object o = theClass.newInstance();   // newIntsance() instantiates an "Object" 
		Dog d3 = (Dog) o;				     // So need to CAST
		
		Dog d4 = (Dog) theClass.newInstance();   
		
		
		
		
		
	}

}
