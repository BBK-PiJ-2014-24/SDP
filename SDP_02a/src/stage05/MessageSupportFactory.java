package stage05;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Using a Factory Method that creates the msg provider and renderer objects, 
 * using dependency injection from a props file.
 * @author snewnham
 *
 */

public class MessageSupportFactory {
	
	private static MessageSupportFactory instance = null;
	private Properties props = null;   // File that Holds Config Mapping 
									   // from Interface => Implementation
	private MessageRenderer renderer = null;
	private MessageProvider provider = null;
	
	
	// private Constructor - Uses Dependency Injection
	// -------------------
	private MessageSupportFactory(){
		
		props  = new Properties();
		
		try{
			File beanFile = new File("bean.properties");
			props.load(new FileInputStream(beanFile)); // load the props file
						
			// Find Provider Impl in Props 
			// ---------------------------
			String theProviderClass = props.getProperty("provider.class"); 
			String theRenderClass  = props.getProperty("renderer.class");
			//System.out.println(theProviderClass);
			//System.out.println(theRenderClass);
			
			// Instantiate with reflection
			// ---------------------------
			provider = (MessageProvider) Class.forName(theProviderClass).newInstance();
			renderer = (MessageRenderer) Class.forName(theRenderClass).newInstance();
			
		}
		catch (Exception ex){
			ex.printStackTrace();
		}		
	}
	
	// Below is A STATIC INITIALIZATION BLOCK which
	// is activated as soon as the Factory Method is initialized/loaded.
	// In this case, the factory is up and running so that it can produce
	// the render and provider objects.
	static {
		instance = new MessageSupportFactory();
	}
	
	
	// Static Way To Instantiate 
	// -------------------------
	public static MessageSupportFactory getInstance(){
		return instance;
	}
	
	// getter for getting Renderer from Factory
	// ----------------------------------------
	public MessageRenderer getMessageRenderer(){
		return renderer;
	}
	
	// getter for getting PRovider from Factory
	// ----------------------------------------
	public MessageProvider getMessageProvider(){
		return provider;
	}
	
}
