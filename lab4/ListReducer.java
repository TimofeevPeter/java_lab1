import java.util.ArrayList;
import java.util.List;

public class ListReducer {

    public static <T> T reduce(
            List<T> source,
            T identity,
            Combiner<T> combiner
    ) {
        T result = identity;

        for (T item : source) {
            result = combiner.combine(result, item);
        }

        return result;
    }
}
