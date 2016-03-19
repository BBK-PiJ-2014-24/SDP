package qu5_Decorator;

public class Meat extends PizzaDecorator {
    
	double price = 1.2;
	
	public Meat(Pizza pizza) {
		this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return "Meat";
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + this.price;
    }
}
