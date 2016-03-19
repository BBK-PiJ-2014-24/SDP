package qu5_Decorator;

/**
 * Abstract Class At top of Decorator components
 * @author snewnham
 *
 */
public abstract class PizzaDecorator implements Pizza {
	
	double price;
	Pizza pizza; // This is the component class that we will decorate!!
	
	public String getDesc(){
		return null;
	}

    public double getPrice(){
    	return 0;
    }

}
