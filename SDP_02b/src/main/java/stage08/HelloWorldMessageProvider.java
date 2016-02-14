 package stage08;

/**
 * Class to Decouple the MESSAGE LOGIC from the RENDER LOGIC (i.e. the output). 
 * It just contains a getter for retrieving the class.
 * @author snewnham
 *
 */

public class HelloWorldMessageProvider implements MessageProvider {

	// HERE WE ARE INJECTING VIA THE CONSTRUCTOR!!!!
	private String msg;
	
	public HelloWorldMessageProvider(String msg){
		this.msg = msg;
	}
	
	public String getMessage(){    
		return "Hello World - USING THE SPRING FACTORY + DEPENDENCY INJECTION with XML!! AND here is someting  extra injected via xml: \n" + this.msg;
	}

	
}
