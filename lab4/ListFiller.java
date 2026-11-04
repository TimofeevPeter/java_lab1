import java.util.List;

public class ListFiller {
    public static void completionList(List<? super Integer> list) {
        list.clear();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
    }
}
