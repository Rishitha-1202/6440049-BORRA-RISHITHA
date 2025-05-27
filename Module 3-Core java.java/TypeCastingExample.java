public class TypeCastingExample {
    public static void main(String[] args) {
        double doubleVal = 9.78;
        int intVal = (int) doubleVal;  // double to int
        System.out.println("Double value: " + doubleVal);
        System.out.println("After casting to int: " + intVal);

        int intNum = 42;
        double doubleNum = intNum;  // int to double (implicit)
        System.out.println("Int value: " + intNum);
        System.out.println("After casting to double: " + doubleNum);
    }
}
