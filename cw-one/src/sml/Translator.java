package sml;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;


/*
 * The translator of a <b>S</b><b>M</b>al<b>L</b> program.
 */
public class Translator {

    private static final String SRC = "src";
    // word + line is the part of the current line that's not yet processed
    // word has no whitespace
    // If word and line are not empty, line begins with whitespace
    private String line = "";
    private Labels labels; // The labels of the program being translated
    private ArrayList<Instruction> program; // The program to be created
    private String fileName; // source file of SML code

    public Translator(String fileName) {
        this.fileName = SRC + "/" + fileName;
    }

    // translate the small program in the file into lab (the labels) and
    // prog (the program)
    // return "no errors were detected"
    public boolean readAndTranslate(Labels lab, ArrayList<Instruction> prog) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {

        try (Scanner sc = new Scanner(new File(fileName))) {
            // Scanner attached to the file chosen by the user
            labels = lab;
            labels.reset();
            program = prog;
            program.clear();

            try {
                line = sc.nextLine();
            } catch (NoSuchElementException ioE) {
                return false;
            }

            // Each iteration processes line and reads the next line into line
            while (line != null) {
                // Store the label in label
                String label = scan();

                if (label.length() > 0) {
                    Instruction ins = getInstruction(label);
                    if (ins != null) {
                        labels.addLabel(label);
                        program.add(ins);
                    }
                }

                try {
                    line = sc.nextLine();
                } catch (NoSuchElementException ioE) {
                    return false;
                }
            }
        } catch (IOException ioE) {
            System.out.println("File: IO error " + ioE.getMessage());
            return false;
        }
        return true;
    }

    // line should consist of an MML instruction, with its label already
    // removed. Translate line into an instruction with label label
    // and return the instruction
    public Instruction getInstructionKeith(String label) {
        int s1; // Possible operands of the instruction
        int s2;
        int r;
        int x;
        String labelParam ="";

        if (line.equals(""))
            return null;

        String ins = scan();
        switch (ins) {
            case "add":
                r = scanInt();
                s1 = scanInt();
                s2 = scanInt();
        	 	return new AddInstruction(label, r, s1, s2);
            case "lin":
                r = scanInt();
                s1 = scanInt();
                return new LinInstruction(label, r, s1);
            case "sub" :
            	r = scanInt();
            	s1 = scanInt();
            	s2 = scanInt();
            	return new SubInstruction(label, r, s1, s2);  
            case "mul" :
            	r = scanInt();
            	s1 = scanInt();
            	s2 = scanInt();
            	return new MulInstruction(label, r, s1, s2); 
            case "div" :
            	r = scanInt();
            	s1 = scanInt();
            	s2 = scanInt();
            	return new DivInstruction(label, r, s1, s2); 
            case "out" :
            	s1 = scanInt();
            	return new OutInstruction(label, s1);
            case "bnz" :
            	s1 = scanInt();
            	labelParam = line.trim();
            	return new BnzInstruction(label, s1, labelParam);
        }

        return null;
    }

    public Instruction getInstruction(String label) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
     
        int numParams;  // number of parameters
        String labelParam ="";
        
        ArrayList<String> progParameterList = new ArrayList<>();
        Constructor<?> rightConstructor = null;
        
        // Collect the parameters in the instruction
        // -----------------------------------------
        if (line.equals("")) // First check if line is null
            return null;

        String ins = scan();  // break off the instruction operator
        
        while(line.length()!=0){    // store the parameters in a list 
        	progParameterList.add(scan());
        }
        
        numParams = progParameterList.size() + 1;  // the number of Prog parameters + label
        
        // Create the Class Name, Collect its Constructors in a Constructor Array
        // ----------------------------------------------------------------------
        
        String className = classNameCreator(ins);
        Class<?> theInstrClass = Class.forName(className); //Convert StringName to class;
        Constructor<?>[] theConstructors = theInstrClass.getConstructors();  // Array of Constructors
        
        // Find Subset of Constructors that have correct number of parameters
        // ------------------------------------------------------------------
		Map<Integer,Class<?>[]> subsetConstrs = new HashMap<>();
        
		int k =0;
		for (Constructor<?> c : theConstructors){                 // Loop through Constructor List
			//System.out.println("Constructor [" + k +"] Parameters");
			Class<?>[] consParams = theConstructors[k].getParameterTypes(); // get the Cons Parameters
				if(consParams.length == numParams){     // Find Constructor with the right number of Paramaetrs
					subsetConstrs.put(k,consParams);   // Collect the Constructor list index and it's parameter list
				}
			k++;
		}
		
		if(subsetConstrs.isEmpty()){
			System.out.println("No Constructor Found for Operator: " + ins);
			return null;
		}
			
		// Match the Constructor to the Correct Parameter Types
		// -----------------------------------------------------
		Integer indexKey = null;  // the index for the correct constructor  		
		for(Integer i : subsetConstrs.keySet()){   // For each constructor in the subset of constructors
			Class<?>[] params = subsetConstrs.get(i);   // get its param list
			ArrayList<String> consStringParamList = new ArrayList<>();	
				for(Class<?> p : params){
					String parameterName = p.getSimpleName(); // convert constructor param List to a String List
					consStringParamList.add(parameterName);
					//System.out.println(parameterName);
				} // end in loop
			boolean test = checkParameterList(consStringParamList, progParameterList);  // check if right patram types
			if(test){
				indexKey = i;  // found the right constructor
				rightConstructor = theConstructors[indexKey]; // Select the right Constructor from Array
				break;
			}
		}// end out loop
        if(indexKey == null){
        	System.out.println("Could Not Find Constructor with correct signature");
        	return null;
        }
        
        // Contruct the instance of 
        // ------------------------
        Object[] o = new Object[numParams];
        o[0] = label;  // add the label parameter
  
        for(int i=1; i<numParams; i++){
        	String s = progParameterList.get(i-1);
        	char c = s.charAt(0);
        	if(Character.isDigit(c))
        		o[i] = Integer.parseInt(s);	
        	else
        		o[i] = s.trim();
        	// build instance of 
        } // end loop
        return (Instruction) rightConstructor.newInstance(o);
    }
    
    /**
     * checkParameterList - checks the parameter types are correct for the constructor 
     * @param constrList - string list of parameters in candidate constructor
     * @param progList - string list of parameters from the program instruction
     * @return true if cons params  == prog params, else false;
     */
    public boolean checkParameterList(List<String> constrList, List<String> progList ){
    	
    	constrList.remove(0); // get rid of the label
    	for(int s=0; s < progList.size(); s++){   // each parameter in the con's parameter list 
    		String consParam = constrList.get(s); 
    		String progParam = progList.get(s);
    		char c = progParam.charAt(0);
    		if(consParam == "int" && !Character.isDigit(c)) // if cons param an int, check the prog param is a digit
    			return false;
    		if(consParam.equals("String") && Character.isDigit(c)) // if cons param a String, check the prog param is a digit
    			return false;
    	}
    	return true;
    }
    
    /*
     * Return the first word of line and remove it from line. If there is no
     * word, return ""
     */
    private String scan() {
        line = line.trim();
        if (line.length() == 0)
            return "";

        int i = 0;
        while (i < line.length() && line.charAt(i) != ' ' && line.charAt(i) != '\t') {
            i = i + 1;
        }
        String word = line.substring(0, i);
        line = line.substring(i);
        return word;
    }

    // Return the first word of line as an integer. If there is
    // any error, return the maximum int
    private int scanInt() {
        String word = scan();
        if (word.length() == 0) {
            return Integer.MAX_VALUE;
        }

        try {
            return Integer.parseInt(word);
        } catch (NumberFormatException e) {
            return Integer.MAX_VALUE;
        }
    }
    
    /**
     * Creates the ClassName from the label
     */
    public String classNameCreator(String instr){
    	String prefix = "sml.";
    	String suffix = "Instruction";
    	String instr1 = instr.substring(0,1);
    	String instr2 = instr.substring(1);
    	instr1 = instr1.toUpperCase();
    	String className = prefix + instr1 + instr2 + suffix;
    	return className;
    }
}