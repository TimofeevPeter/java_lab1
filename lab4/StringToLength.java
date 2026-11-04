public class StringToLength implements Transformer<String, Integer> {

    public Integer apply(String value) {
        return value.length();
    }

}
