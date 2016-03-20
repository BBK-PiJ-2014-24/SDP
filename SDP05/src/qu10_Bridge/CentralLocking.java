package qu10_Bridge;

public class CentralLocking implements Product {

	String productName;
	
    public CentralLocking(String productName) {
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
    	System.out.println("Producing Central Locking System");
    	//throw new UnsupportedOperationException();
    }
}
