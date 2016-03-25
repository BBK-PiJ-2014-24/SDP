package qu2_Strategy;

public class TestStrategyPattern {
    public static void main(String[] args) {
        
    	// Caps Text Formatter
    	TextFormatter formatter = new CapTextFormatter(); 
        TextEditor editor = new TextEditor(formatter); // pass to Text Editor
        editor.publishText("Testing text in caps formatter");
        
        // LowerCase Text Formatter
        formatter = new LowerTextFormatter();
        editor = new TextEditor(formatter);
        editor.publishText("Testing text in lower formatter");
    }
}