package qu5_Decorator;

public class SimplyVegPizza implements Pizza {
    
	double price = 230;
	
	@Override
    public String getDesc() {
        return "Simple Vegetarian Pizza " + this.price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
