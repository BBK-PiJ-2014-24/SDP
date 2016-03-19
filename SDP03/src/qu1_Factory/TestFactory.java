package qu1_Factory;

public class TestFactory {

	public static void main(String[] args) {
		
		Product p1 = ConcreteCreator.getProduct("1");
		System.out.println(p1.getThing());
		
		Product pDefault = ConcreteCreator.getProduct();
		System.out.println(pDefault.getThing());
	}

}
