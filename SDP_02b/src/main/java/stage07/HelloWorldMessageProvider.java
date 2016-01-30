 package stage07;

/**
 * Class to Decouple the MESSAGE LOGIC from the RENDER LOGIC (i.e. the output). 
 * It just contains a getter for retrieving the class.
 * @author snewnham
 *
 */

public class HelloWorldMessageProvider implements MessageProvider {

	public String getMessage(){    
		return "Hello World - USING THE SPRING FACTORY + DEPENDENCY INJECTION!!";
	}
	
	
}
