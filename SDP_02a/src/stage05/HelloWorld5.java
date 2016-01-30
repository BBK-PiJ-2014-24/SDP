package stage05;
/**
 * Get Provider and Renderer Messages from the Factory, which use props file 
 * dependency injection.
 * @author snewnham
 *
 */

public class HelloWorld5 {

	public static void main(String[] args) {
		
		 //Class thePclass = HelloWorldMessageProvider.class;
		 //System.out.println("CLASS NAME " + thePclass.getName());
		
		
		// Get Provider and Renderer Messages from the Factory  
		MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
		MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();

		mr.setMessageProvider(mp);
		mr.render();
	}
}
