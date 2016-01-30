package stage03;

/**
 * Class to Decouple the RENDER LOGIC from the MSG LOGIC
 * 
 */

public class StandardOutMessageRenderer {
	
	private HelloWorldMessageProvider messageProvider = null;
	
	// setter
	// ------
	public void setMessageProvider(HelloWorldMessageProvider theMsg){
		this.messageProvider = theMsg;
	}
	
	// getter
	// ------
	public HelloWorldMessageProvider getMessageProvider(){
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
