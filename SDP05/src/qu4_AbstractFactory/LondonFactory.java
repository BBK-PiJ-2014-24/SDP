package qu4_AbstractFactory;

public class LondonFactory implements AbstractParserFactory {


	@Override
	public XMLParser getParserInstance(String parserType) {
		System.out.println("London parsing " + parserType + " XML...");
		if(parserType.equals("LondonError"))
			return new NYCErrorXMLParser();
		else if(parserType.equals("LondonFeedback"))
			return new NYCFeedbackXML();
		else if(parserType.equals("LondonOrder"))
			return new NYCOrderXMLParser();
		else if(parserType.equals("LondonRespone"))
			return new NYCResponseXMLParser();
		else
			return null;
	}


}
