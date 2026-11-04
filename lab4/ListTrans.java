import java.util.ArrayList;
import java.util.List;

public class ListTrans {

    public static <T, P> List<P> transform(
            List<T> source,
            Transformer<T, P> transformer
    ) {
        List<P> result = new ArrayList<>();

        for (T item : source) {
            P transformed = transformer.apply(item);
            result.add(transformed);
        }

        return result;
    }

}
