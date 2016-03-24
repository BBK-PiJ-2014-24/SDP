package qu4_AbstractFactory;

public class LondonOrderXMLParser implements OrderXMLParser{

	@Override
	public String parse() {
		return "London Order XML Message";
	}

}
