package programming_and_algorithm;


import java.util.Scanner;

public class TimeInWords {

    // Array to store numbers in words from 1 to 29
    static final String[] numberWords = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three",
            "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs for hour and minute
        System.out.println("input the hour");
        int h = scanner.nextInt();
        System.out.println("input the minute(s)");
        int m = scanner.nextInt();

        // Validate input to ensure they fall within constraints
        if (h < 1 || h > 12 || m < 0 || m > 59) {
            System.out.println("Invalid input. Hour must be 1-12 and minutes 0-59.");
            return;
        }

        // Print time in words using the function
        System.out.println(getTimeInWords(h, m));
    }

    public static String getTimeInWords(int h, int m) {
        if (m == 0) {
            return numberWords[h] + " o’clock";
        } else if (m == 15) {
            return "quarter past " + numberWords[h];
        } else if (m == 30) {
            return "half past " + numberWords[h];
        } else if (m == 45) {
            return "quarter to " + numberWords[(h % 12) + 1];
        } else if (m < 30) {
            String minuteWord = m == 1 ? "minute" : "minutes";
            return numberWords[m] + " " + minuteWord + " past " + numberWords[h];
        } else {
            int remaining = 60 - m;
            String minuteWord = remaining == 1 ? "minute" : "minutes";
            return numberWords[remaining] + " " + minuteWord + " to " + numberWords[(h % 12) + 1];
        }
    }
}
