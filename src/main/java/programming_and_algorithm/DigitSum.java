package programming_and_algorithm;

public class DigitSum {

    // This function takes a string of numbers and adds them all up
    // For example: "123" becomes 1 + 2 + 3 = 6
    // It uses recursion which means it calls itself until the string is less than 10
    public static int sumOfDigits(String s) {
        // If the string is empty, return 0 (this is our base case)
        if (s.isEmpty()) return 0;
        // Get the first number from the string and add it to the sum of the rest of the string
        // Character.getNumericValue converts the char to a number
        // substring(1) gets all characters except the first one
        return Character.getNumericValue(s.charAt(0)) + sumOfDigits(s.substring(1));
    }

    // This function finds the digital root of a number
    // Digital root is when you keep adding digits until you get a single number
    // Example: 123 -> 1+2+3 = 6 -> 6 is the digital root
    public static int digitalRoot(int n) {
        // If number is less than 10, it's already a single digit, so return it
        if (n < 10) return n;
        // Convert number to string, sum its digits, then find digital root of that sum
        return digitalRoot(sumOfDigits(Integer.toString(n)));
    }

    public static void main(String[] args) {
        // This is our test number - it's a really big number!
        String input = "1234445123444512344451234445123444512344451234445";

        // First we add up all the digits
        int sum = sumOfDigits(input); //  A
        // Then we find the digital root of that sum
        int root = digitalRoot(sum);  //  B

        // Print the results
        System.out.println("Sum: " + sum);     // manually  161
        System.out.println("Digital Root: " + root); // manually  8
    }
}
