public class StringReplacer implements StringTransformer {
    public void execute(StringDrink drink) {
        StringBuilder str = new StringBuilder(drink.getText());
        String text = drink.getText();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'A') {
                c = 'X';
            }
        }
        drink.setText(str.toString());
    }
}
