package programming_and_algorithm;

import java.util.Scanner;

public class TimeInWords {

    // This array stores all the number words we need
    // It's like a lookup table where index 1 = "one", index 2 = "two", etc.
    // We need up to 29 because minutes can go up to 29 (like "twenty nine minutes past")
    static final String[] numberWords = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three",
            "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"
    };

    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for hour and minute
        // h is hour (1-12) and m is minute (0-59)
        System.out.println("Enter the hour");
        int h = scanner.nextInt();
        System.out.println("Enter the minute");
        int m = scanner.nextInt();

        // Make sure the input is valid
        // Hours must be 1-12 and minutes must be 0-59
        if (h < 1 || h > 12 || m < 0 || m > 59) {
            System.out.println("Invalid input. Hour must be 1-12 and minutes 0-59.");
            return;
        }

        // Print the time in words
        System.out.println(getTimeInWords(h, m));
    }

    public static String getTimeInWords(int h, int m) {
        // Handle special cases first
        if (m == 0) {
            // If it's exactly on the hour, like "three o'clock"
            return numberWords[h] + " o'clock";
        } else if (m == 15) {
            // If it's quarter past, like "quarter past three"
            return "quarter past " + numberWords[h];
        } else if (m == 30) {
            // If it's half past, like "half past three"
            return "half past " + numberWords[h];
        } else if (m == 45) {
            // If it's quarter to, like "quarter to four"
            // Note: we use (h % 12) + 1 to handle the case when h is 12
            return "quarter to " + numberWords[(h % 12) + 1];
        } else if (m < 30) {
            // For minutes less than 30, we say "X minutes past Y"
            // Example: "twenty five minutes past three"
            String minuteWord = m == 1 ? "minute" : "minutes";  // Use singular or plural
            return numberWords[m] + " " + minuteWord + " past " + numberWords[h];
        } else {
            // For minutes more than 30, we say "X minutes to Y"
            // Example: "twenty five minutes to four"
            int remaining = 60 - m;  // Calculate how many minutes until the next hour
            String minuteWord = remaining == 1 ? "minute" : "minutes";  // Use singular or plural
            return numberWords[remaining] + " " + minuteWord + " to " + numberWords[(h % 12) + 1];
        }
    }
}
