import org.junit.jupiter.api.Test;
import programming_and_algorithm.TimeInWords;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeInWordsTest {


        @Test
        void testExactHour() {
            assertEquals("five o’clock", TimeInWords.getTimeInWords(5, 0));
        }

        @Test
        void testOneMinutePast() {
            assertEquals("one minute past five", TimeInWords.getTimeInWords(5, 1));
        }

        @Test
        void testQuarterPast() {
            assertEquals("quarter past five", TimeInWords.getTimeInWords(5, 15));
        }

        @Test
        void testHalfPast() {
            assertEquals("half past five", TimeInWords.getTimeInWords(5, 30));
        }

        @Test
        void testQuarterTo() {
            assertEquals("quarter to six", TimeInWords.getTimeInWords(5, 45));
        }

        @Test
        void testMinutesTo() {
            assertEquals("thirteen minutes to six", TimeInWords.getTimeInWords(5, 47));
        }

        @Test
        void testMinutesPast() {
            assertEquals("twenty eight minutes past five", TimeInWords.getTimeInWords(5, 28));
        }

        @Test
        void testEdgeCases() {
            assertEquals("one minute to twelve", TimeInWords.getTimeInWords(11, 59));
            assertEquals("twenty nine minutes past twelve", TimeInWords.getTimeInWords(12, 29));
        }
    }




