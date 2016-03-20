package qu10_Bridge;

public abstract class Car {

	Product product;
	String carType;
	
    public Car(Product product, String carType) {
        this.product = product;
        this.carType = carType;
    	//throw new UnsupportedOperationException();
    }

    public abstract void assemble();

    public abstract void produceProduct();

    public void printDetails() {
        System.out.println("Car: " + this.carType + ", Product:" + this.product.productName());
    	
    	//throw new UnsupportedOperationException();
    }
}