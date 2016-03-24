package qu4_AbstractFactory;

public class LondonErrorXMLParser implements ErrorXMLParser{

	@Override
	public String parse() {
		return "London Error XML Message";
	}

}
