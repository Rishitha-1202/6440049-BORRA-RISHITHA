import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Diana");

        // Sort using lambda expression
        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted names:");
        names.forEach(System.out::println);
    }
}
