package qu5_Decorator;

public class Spinach extends PizzaDecorator {
    
	double price = 7.92;
	
	public Spinach(Pizza pizza) {
		this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return "Spinach " + this.price;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + this.price;
    }
}
