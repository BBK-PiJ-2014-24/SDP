package stage03;
/**
 * Decoupling HelloWorld into Render and ProviderClass
 * @author snewnham
 *
 */
public class HelloWorld3 {

	public static void main(String[] args) {
		
		// Instantiate reader and provider objects
		StandardOutMessageRenderer mr = new StandardOutMessageRenderer(); // Dependency
		HelloWorldMessageProvider mp = new HelloWorldMessageProvider(); // Dependency
		
		mr.setMessageProvider(mp);
		mr.render();
	
	}

}


