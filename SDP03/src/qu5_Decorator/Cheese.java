package qu5_Decorator;

public class Cheese extends PizzaDecorator {
    
	double price = 1.4;
	
	public Cheese(Pizza pizza) {
    	this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return " Cheese" ;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + this. price;
    }
}
