public class PatternMatchingSwitch {
    public static void checkType(Object obj) {
        String result = switch (obj) {
            case Integer i -> "It's an Integer: " + i;
            case String s -> "It's a String: " + s;
            case Double d -> "It's a Double: " + d;
            case null -> "It's null";
            default -> "Unknown type";
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        checkType(10);
        checkType("Hello");
        checkType(3.14);
        checkType(null);
        checkType(true);
    }
}
