package qu2_Strategy;

public class CapTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println(text.toUpperCase());
    }
}