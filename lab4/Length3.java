public class Length3 implements Condition<String> {

    public boolean test(String value) {
        return value != null && value.length() >= 3;
    }

}
