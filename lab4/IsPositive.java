public class IsPositive implements Condition<Integer> {

    @Override
    public boolean test(Integer value) {
        return value > 0 && value != null;
    }
}
