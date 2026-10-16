package ru.timofeev.list;

import java.util.Arrays;

public class ImmutableValueList {
    private final int[] values;

    public ImmutableValueList(int... values) {
        if (values == null) {
            this.values = new int[0];
        } else {
            this.values = Arrays.copyOf(values, values.length);
        }

    }


    public ImmutableValueList(ImmutableValueList other) {
        this(other.values);
    }

    public int get(int index) {
        checkIndex(index);
        return values[index];
    }


    public void set(int index, int newValue) {
        checkIndex(index);
        values[index] = newValue;

    }

    public void checkIndex(int index) {
        if (index < 0 || index >= values.length) {
            throw new IndexOutOfBoundsException("Индекс" + index + "вне диапазона. Диапазон: от 0 до " + (values.length)
            );
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }

    public boolean isEmpty() {
        return values.length == 0;
    }

    public int size() {
        return values.length;
    }

    public int[] toArray() {
        return values.clone();
    }
}














