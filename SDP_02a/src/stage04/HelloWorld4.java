package stage04;

/**
 * Decoupled MSG and RENDER LOGIC
 * As well as
 * DECOUPLED from IMPLEMENTATION with INTERFACES
 * @author snewnham
 *
 */

public class HelloWorld4 {

	public static void main(String[] args) {
		
		MessageProvider mp = new HelloWorldMessageProvider();  // Still Dependency
		MessageRenderer mr = new StandardOutMessageRenderer(); 
		
		mr.setMessageProvider(mp);
		mr.render();
		

	}

}
