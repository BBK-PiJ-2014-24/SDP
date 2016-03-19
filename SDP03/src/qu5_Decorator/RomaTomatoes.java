package qu5_Decorator;

public class RomaTomatoes extends PizzaDecorator {
    
	double price = 5.20;
	
	public RomaTomatoes(Pizza pizza) {
    	this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return "Roma Tomatoes " + this.price;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + this.price;
    }
}
