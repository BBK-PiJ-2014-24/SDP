package qu5_Decorator;

public class Ham extends PizzaDecorator {
    
	double price = 1.3;
	
	public Ham(Pizza pizza) {
    	this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return "Ham";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + this.price;
    }
}
