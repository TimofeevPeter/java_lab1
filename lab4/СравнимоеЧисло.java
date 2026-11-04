public class СравнимоеЧисло implements Сравнимое<Integer> {

    private final int value;

    public СравнимоеЧисло(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int сравнить(Integer other) {
        return this.value - other;
    }

    @Override
    public String toString() {
        return "[" + value + "]";
    }
}
