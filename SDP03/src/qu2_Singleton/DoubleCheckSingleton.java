package qu2_Singleton;

public class DoubleCheckSingleton {
	
	// Field
	// -----
	private static volatile DoubleCheckSingleton uniqueInstance = null;  // volatile = well behaved threads
	
	
	// Private Constructor
	// -------------------
	private DoubleCheckSingleton(){
	
	}
	
	// static getInstance()
	// --------------------
	public static DoubleCheckSingleton getInstance(){
		
		if(uniqueInstance == null){        // CHECK 1: At THE DOOR
			synchronized(DoubleCheckSingleton.class){    // Synchronized Block
				if(uniqueInstance == null){   // CHECK 2: DOUBLE CHECK IF STILL NULL 
					return uniqueInstance = new DoubleCheckSingleton();
				}
			} // End Synchronized Block
		}
		return uniqueInstance;
	}

}
