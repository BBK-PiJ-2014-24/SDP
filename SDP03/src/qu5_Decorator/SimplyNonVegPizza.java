package qu5_Decorator;

public class SimplyNonVegPizza implements Pizza {
    
	double price = 350;
	
	@Override
    public String getDesc() {
        return "Non-Vegetarian Pizza " + this.price;
    }

    @Override
    public double getPrice() {
        return 1.5;
    }
}
