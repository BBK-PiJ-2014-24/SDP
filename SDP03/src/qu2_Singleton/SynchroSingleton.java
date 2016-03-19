package qu2_Singleton;

/**
 * A Thread safe Singleton using Synchronized
 * @author snewnham
 *
 */

// +ve: Thread safe
// -ve: Overhead cost of ordering threads.

public class SynchroSingleton {
	
	// Field
	// -----
	private static SynchroSingleton synchroInstance = null;
	
	
	// Private Constructor
	// -------------------
	private SynchroSingleton(){
		
	}
	
	// SYNCHRONISED STATIC methods
	// ---------------------------
	public static synchronized SynchroSingleton getInstance(){
		if(synchroInstance == null){
			synchroInstance =  new SynchroSingleton();
		}
		return synchroInstance;
	}
	
	
	
	

}
