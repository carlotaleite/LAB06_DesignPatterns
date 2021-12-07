public class StringCaseChanger implements StringTransformer{
    public void execute(StringDrink drink) {
        StringBuilder str = new StringBuilder("");
        String text = drink.getText();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLowerCase(c)) {
                str.append(Character.toUpperCase(c));
            }
            else {
                str.append(Character.toLowerCase(c));
            }
        }
    }
}
