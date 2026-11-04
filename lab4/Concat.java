public class Concat implements Combiner<String> {

    @Override
    public String combine(String left, String right) {
        return left + right;
    }
}
