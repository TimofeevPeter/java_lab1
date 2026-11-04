public class СравнимаяСтрока implements Сравнимое<String> {

    private final String text;

    public СравнимаяСтрока(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public int сравнить(String other) {
        return this.text.length() - other.length();
    }

    @Override
    public String toString() {
        return "Строка \"" + text + "\"";
    }
}
