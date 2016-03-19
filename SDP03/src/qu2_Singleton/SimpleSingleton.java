package qu2_Singleton;
/**
 * This is a Simple Lazy Singleton
 * @author snewnham
 *
 */
public class SimpleSingleton {
	
	// Field
	// -----
	private static SimpleSingleton uniqueInstance;   // static field to hold one object
	
	// PRIVATE Constructor
	// -----------
	private SimpleSingleton(){
		
	}
	
	// STATIC METHOD
	// -------------
	
	public static SimpleSingleton getInstance(){
		if(uniqueInstance == null){ 
			uniqueInstance = new SimpleSingleton(); // Create New Object
		}
		return uniqueInstance;          // Return Instantiated Object 
	}
	
	

}
