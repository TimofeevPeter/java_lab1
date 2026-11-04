public class Summa implements Combiner<Integer> {

    @Override
    public Integer combine(Integer left, Integer right) {
        return left + right;
    }
}
