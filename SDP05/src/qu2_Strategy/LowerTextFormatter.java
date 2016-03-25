package qu2_Strategy;

public class LowerTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println(text.toLowerCase());
    }
}