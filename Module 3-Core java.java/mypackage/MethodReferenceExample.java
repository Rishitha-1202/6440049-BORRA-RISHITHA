import java.util.Arrays;

public class MethodReferenceExample {
    public static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        String[] names = {"John", "Alice", "Bob"};
        Arrays.stream(names).forEach(MethodReferenceExample::print);
    }
}
