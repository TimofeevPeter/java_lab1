public class MakePositive implements Transformer<Integer, Integer> {

    public Integer apply(Integer value) {
        return Math.abs(value);
    }
}
