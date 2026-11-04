import jdk.jfr.Period;

import java.lang.annotation.Documented;
import java.util.Arrays;
public class ImmutableValueList<T> {
    private final Object[] values;
    private final Class<T> type;

    public ImmutableValueList(T[] values, Class<T> type) {
        this.type = type;
        if (values == null) {
            this.values = new Object[0];
        } else {
            this.values = Arrays.copyOf(values, values.length);
        }
    }

    @SafeVarargs //Убирает предупреждение, что в массиве типа Object может быть что угодно
    public ImmutableValueList(Class<T> type, T... values) {
        this.type = type;
        this.values = Arrays.copyOf(values, values.length);
    }

    public ImmutableValueList(ImmutableValueList<T> other) {
        this.type = other.type;
        this.values = Arrays.copyOf(other.values, other.values.length);
    }

    public T get(int index) {
        checkIndex(index);
        return type.cast(values[index]);
    }

    public void set(int index, T newValue) {
        checkIndex(index);
        values[index] = newValue;
    }

    public int size() {
        return values.length;
    }

    public boolean isEmpty() {
        return values.length == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= values.length) {
            throw new IndexOutOfBoundsException(
                    "Индекс " + index + " не входит в диапозон массива:" + "[" + 0 + "]"
                            + " до " + "[" + (values.length - 1) + "]"
            );
        }
    }




}
