package qu10_Bridge;

public class GearLocking implements Product {

	String productName;
	
    public GearLocking(String productName) {
    	 this.productName = productName;
    	//throw new UnsupportedOperationException();
    }

    @Override
    public String productName() {
    	return this.productName;
    	//throw new UnsupportedOperationException();
    }

    @Override
    public void produce() {
    	System.out.println("Producing Gear Locking System");
    	//throw new UnsupportedOperationException();
    }
    
 
}