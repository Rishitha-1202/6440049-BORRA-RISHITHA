import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Enter student names (type 'done' to finish):");

        while (true) {
            input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) break;
            names.add(input);
        }

        System.out.println("Names entered:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}

