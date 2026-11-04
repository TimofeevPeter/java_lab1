public class notPositive implements Condition<int[]> {

    public boolean test(int[] value) {
        if (value == null || value.length <= 0) {
            return true;
        }

        for (int element : value) {
            if (element > 0) {
                return false;
            }
        }
        return true;
    }

}
