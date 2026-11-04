import java.util.List;

public class ListSize implements Transformer<List<Integer>, Integer> {
    @Override
    public Integer apply(List<Integer> value) {
        return value.size();
    }
}
