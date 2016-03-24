package qu4_AbstractFactory;

public class TestAbstractFactoryPattern {

    public static void main(String[] args) {

        AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("NYCFactory");
        XMLParser parser = parserFactory.getParserInstance("NYCOrder");
        String msg = "";
        msg = parser.parse();
        System.out.println(msg);

        System.out.println("************************************");

        parserFactory = ParserFactoryProducer.getFactory("LondonFactory");
        parser = parserFactory.getParserInstance("LondonFeedback");
        msg = parser.parse();
        System.out.println(msg);
    }

}
