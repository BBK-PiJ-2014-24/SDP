package stage09;


/** 
 * An Interface to Implement the Message Renderer
 * @author snewnham
 * NOTE THAT THE REFERENCE VARIABLES HAVE BEEN CHANGED TO THE INTERFACE SIGNATURE
 */

public interface MessageRenderer {
	
	public void setMessageProvider(MessageProvider theMsg); // setter
	public MessageProvider getMessageProvider(); // getter
	public void render(); //render
	

}
