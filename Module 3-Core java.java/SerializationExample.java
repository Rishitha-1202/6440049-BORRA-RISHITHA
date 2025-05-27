import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Student s = new Student(1, "Alice");

        // Serialize
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            out.writeObject(s);
            System.out.println("Student object saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student s2 = (Student) in.readObject();
            System.out.println("Deserialized Student: " + s2.id + ", " + s2.name);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
