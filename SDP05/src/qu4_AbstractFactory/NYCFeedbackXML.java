package qu4_AbstractFactory;

public class NYCFeedbackXML implements FeedbackXML {

	@Override
	public String parse() {
		return "NYC Feedback XML Message";
	}

}
