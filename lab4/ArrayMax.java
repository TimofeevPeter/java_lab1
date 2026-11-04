public class ArrayMax implements Transformer<int[], Integer> {

    public Integer apply(int[] value) {
        if (value == null || value.length ==0) {
            throw new IllegalArgumentException("Массив не должен быть пустым.");
        }

        int max = value[0];
        for (int i = 1; i < value.length; i++) {
            if (value[i] > max) {
                max = value[i];
            }
        }

        return max;
    }
}
