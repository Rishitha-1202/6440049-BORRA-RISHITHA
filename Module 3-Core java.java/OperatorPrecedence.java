public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;  // multiplication has higher precedence
        System.out.println("Result of 10 + 5 * 2 = " + result);
        System.out.println("Explanation: Multiplication (5*2=10) is done first, then addition (10 + 10).");

        int result2 = (10 + 5) * 2;
        System.out.println("Result of (10 + 5) * 2 = " + result2);
        System.out.println("Explanation: Parentheses change precedence. Addition first, then multiplication.");
    }
}
