package stage06;

/**
 * Class to Decouple the RENDER LOGIC from the MSG LOGIC
 * 
 */

public class StandardOutMessageRenderer implements MessageRenderer {
	
	private MessageProvider messageProvider = null;
	
	// setter
	// ------
	public void setMessageProvider(MessageProvider theMsg){
		this.messageProvider = theMsg;
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
