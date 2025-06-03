package programming_and_algorithm;

public class DigitSum {

    // Sum of digits reused
    public static int sumOfDigits(String s) {
        if (s.isEmpty()) return 0;
        return Character.getNumericValue(s.charAt(0)) + sumOfDigits(s.substring(1));
    }

    // the digital root recursively
    public static int digitalRoot(int n) {
        if (n < 10) return n;
        return digitalRoot(sumOfDigits(Integer.toString(n)));
    }

    public static void main(String[] args) {
        String input = "1234445123444512344451234445123444512344451234445";

        int sum = sumOfDigits(input); //  A
        int root = digitalRoot(sum);  //  B

        System.out.println("Sum: " + sum);     // manually  161
        System.out.println("Digital Root: " + root); // manually  8
    }


}
