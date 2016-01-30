package stage03;

/**
 * Class to Decouple the MESSAGE LOGIC from the RENDER LOGIC (i.e. the output). 
 * It just contains a getter for retrieving the class.
 * @author snewnham
 *
 */

public class HelloWorldMessageProvider {

	public String getMessage(){    
		return "Hello World - Decoupled Message and Render";
	}
	
	
}
