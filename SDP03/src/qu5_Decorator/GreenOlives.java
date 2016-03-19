package qu5_Decorator;

public class GreenOlives extends PizzaDecorator {
    
	double price = 5.47;
	
	public GreenOlives(Pizza pizza) {
    	this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return "Green Olives " + this.price;
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + this.price;
    }
}
