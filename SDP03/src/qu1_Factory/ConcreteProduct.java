package qu1_Factory;

public class ConcreteProduct implements Product {
    private String str;

    // Constructor 1
    // -------------
    public ConcreteProduct() {
        this("");
    }

    // Constructor 2
    // -------------
    public ConcreteProduct(String s) {
        str = s;
    }

    @Override
    public String getThing() {
        return "[" + str + "] " + getClass().getName();
    }
}
