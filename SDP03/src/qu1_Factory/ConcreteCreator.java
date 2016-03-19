package qu1_Factory;


// Concrete Factory
// ----------------

public class ConcreteCreator implements Creator {
   
	
	// Overrides getProducct() so that it instantiates a Default Product 
	static Product getProduct() {
        return Creator.getProduct("Default Product");
    }
	
    static Product getProduct(String s) {
        return new ConcreteProduct(s);
    }
	

}
