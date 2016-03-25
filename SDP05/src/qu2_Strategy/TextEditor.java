package qu2_Strategy;

public class TextEditor {

	// Fields
	// ------
	private TextFormatter textFormatter; 
	
	// Constructor
	// -----------
    public TextEditor(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void publishText(String text) {
        textFormatter.format(text);;
    }
}