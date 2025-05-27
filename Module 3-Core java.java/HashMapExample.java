import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String input;
        int id;

        System.out.println("Add student entries (type 'done' to stop):");
        while (true) {
            System.out.print("Enter student ID: ");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) break;
            try {
                id = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID. Try again.");
                continue;
            }

            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            studentMap.put(id, name);
        }

        System.out.print("Enter an ID to lookup: ");
        id = sc.nextInt();

        String studentName = studentMap.get(id);
        if (studentName != null) {
            System.out.println("Student name: " + studentName);
        } else {
            System.out.println("No student found with ID " + id);
        }

        sc.close();
    }
}
