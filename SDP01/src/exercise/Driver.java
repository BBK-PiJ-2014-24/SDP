package exercise;
/**
 * This is the test of Reflection on two classes - BankAccount and Storage
 * 
 * BankAccount
 * -----------
 * The Class object is tested on BankAccount. It is tested once where the Class Object is NOT
 * PARAMETERISED and next AS PARAMTERIZED.
 * 
 * NON-PARAMETERIZED Class Objects need to be CAST when they are used to instantiate with .newInstance()
 * as they will just instantiate an object.
 * 
 * Storage
 * -------
 * Storage is a GENERIC CLASS - A REFLECTION will return its class ok, BUT IT WILL NOT
 * BE ABLE TO TELL YOU THE ACTUAL PARAMETERIZED TYPE OF THE INSTANTIATED CLASS.
 * 
 * 
 */


public class Driver { 

	public static void main(String[] args){
		Storage<BankAccount>  aStorage = new Storage<>();
		Storage<BankAccount> aStorage1 = new Storage<BankAccount>();
		Storage<String>       sStorage = new Storage<>();

		Class baCls = BankAccount.class;  // Class object  
		Class<BankAccount> baCls1 = BankAccount.class;   // Class Object which is parameterized
		
		try {
			
			// Test baCls - class object
			// ----------
			// Object myAccount =  baCls.newInstance();  // Original
			// aStorage.setValue(myAccount);   myAccount is seen as an object!
			// myAccount.deposit(15); // Deposit
			
			BankAccount myAccount = (BankAccount) baCls.newInstance();  // Need to Cast
			aStorage.setValue(myAccount);
			myAccount.deposit(15);
			
			// Test baClas1 - parametrized class object
			// ----------------------------------------
		
			 BankAccount myAccount1 = baCls1.newInstance();
			 aStorage1.setValue(myAccount1);   
			 myAccount1.deposit(15); // Deposit
			 
			 
			 
			 System.out.println( aStorage.getValue().showBalance() );
			 if( aStorage.getClass() == sStorage.getClass() ) {
			   System.out.println(aStorage.getClass()); // Class - gives the class NOT the 
			   System.out.println(sStorage.getClass());
			   System.out.println(aStorage1.getClass()); //
			   System.out.println( "EQUAL" );   // Storage.class == Storage.class
			   
			 } else {
			   System.out.println( "NOT EQUAL" );
			 }
			
			
		}
		catch ( InstantiationException e ) {}
		catch ( IllegalAccessException e ) {}
	}
}