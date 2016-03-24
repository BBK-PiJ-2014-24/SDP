package qu4_AbstractFactory;

public class ParserFactoryProducer {

	public static AbstractParserFactory getFactory(String factoryType){
		if(factoryType.equals("NYCFactory"))
			return new NYCFactory();
		else if(factoryType.equals("LondonFactory"))
			return new LondonFactory();
		else
			return null;
	}
	
}
