package stage09;

/**
 * Class to Decouple the RENDER LOGIC from the MSG LOGIC
 * 
 */

public class StandardOutMessageRenderer implements MessageRenderer {
	
	private MessageProvider messageProvider = null;
	
	// setter  - THIS IS THE SETTER FOR INJECTION!!!
	// ------
	public void setMessageProvider(MessageProvider theMsg){
		this.messageProvider = theMsg ;  // <= messageProvider is the <property> name =
	}
	
	// getter
	// ------
	public MessageProvider getMessageProvider(){
		return this.messageProvider;
	}
	
	// render()
	// --------
	public void render(){
		if(messageProvider == null)
			throw new RuntimeException("Must Set Message for Output in " + StandardOutMessageRenderer.class.getName());
		
		System.out.println(messageProvider.getMessage());
	}
		
}
