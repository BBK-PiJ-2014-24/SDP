package qu2_Singleton;
/**
 * Eager Singleton
 * @author snewnham
 *
 */

// +ve: Thread safe - avoid race conditions as instance already created before thread can get to it.
// -ve: Not good if singleton is resource intensive


public class SimpleSingleton2 {
	
	// Field  - Instantiate class before 
	// -----
	private static SimpleSingleton2 eagerSimpleton = new SimpleSingleton2();
	
	// private Constructor - Must Specifiy constructor is private. So no one else can instantiate
	// -------------------
	private SimpleSingleton2(){
		
	}
	
	// Static
	// ------
	public static SimpleSingleton2 getInstance(){
		return eagerSimpleton;
	}

}
