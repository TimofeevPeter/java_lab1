import java.util.ArrayList;
import java.util.List;

public class ListFilter {

    public static <T> List<T> filter(
            List<T> source,
            Condition<T> condition
    ) {
        List<T> result = new ArrayList<>();

        for (T item : source) {
            if (condition.test(item)) {
                result.add(item);
            }
        }

        return result;
    }

}
