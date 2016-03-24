package qu4_AbstractFactory;

public class NYCFactory implements AbstractParserFactory {


	@Override
	public XMLParser getParserInstance(String parserType) {
		System.out.println("NYC parsing " + parserType + " XML...");
		if(parserType.equals("NYCError"))
			return new NYCErrorXMLParser();
		else if(parserType.equals("NYCFeedback"))
			return new NYCFeedbackXML();
		else if(parserType.equals("NYCOrder"))
			return new NYCOrderXMLParser();
		else if(parserType.equals("NYCRespone"))
			return new NYCResponseXMLParser();
		else
			return null;
	}

}
