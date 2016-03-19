package qu1_Factory;


// This is an interface for the Factory Methods
// --------------------------------------------
public interface Creator {

    static Product getProduct() {     /// STATIC (& DEFAULT METHODS CAN BE USED IN JAVA8 INTERFACES!!!)
        return getProduct("");
    }

    static Product getProduct(String s) {
        return new ConcreteProduct(s);
    }
}
