import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This JUnit class represents a very partial test class for Ex1.
 * Make sure you complete all the needed JUnits
 */

public class Ex1Test {
    @Test
    void Number2IntTest() {
        String s2 = "1011b2";
        int v = Ex1.number2Int(s2);
        assertEquals(v, 11);

        String s10 = "1011bA";
        v = Ex1.number2Int(s10);
        s2 = Ex1.int2Number(v, 2);

        int v2 = Ex1.number2Int(s2);
        assertEquals(v, v2);
        assertTrue(Ex1.equals(s10, s2));
    }

    @Test
    void isBasisNumberTest() {
        String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};
        for (int i = 0; i < good.length; i = i + 1) {
            boolean ok = Ex1.isNumber(good[i]);
            assertTrue(ok);
        }
        String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
        for (int i = 0; i < not_good.length; i = i + 1) {
            boolean not_ok = Ex1.isNumber(not_good[i]);
            assertFalse(not_ok);
        }
    }


    @Test
    void int2NumberTest() {

        // Test converting decimal to base 10 (shouldn't change):
        int numA = 123;
        int baseA = 10;
        String resultA = Ex1.int2Number(numA, baseA);
        assertEquals("123", resultA); // 123 in decimal is 123 in base 10

        // Test converting decimal to hexadecimal (base 16):
        int numB = 255;
        int baseB = 16;
        String resultB = Ex1.int2Number(numB, baseB);
        assertEquals("FF", resultB); //255 in decimal is FF in hexadecimal

        // Test case with an invalid base (should return an empty string)
        int num5 = 25;
        int base5 = 1; // invalid base, less than 2
        String result5 = Ex1.int2Number(num5, base5);
        assertEquals("", result5); // Should return empty string due to invalid base
    }


    @Test
    void maxIndexTest() {
        // Test case 1: Normal case where the numbers are different and the max index is clear
        String[] arr1 = {"1011b2", "11b10", "EFbG", "239b10"};
        int result1 = Ex1.maxIndex(arr1);
        assertEquals(3, result1); // "239b10" (decimal 239) should be the largest
    }

    @Test
    void equalsTest() {

        assertTrue(Ex1.equals("1011b2", "11b10")); // Binary and decimal equivalent
        assertTrue(Ex1.equals("EFbG", "239b10")); // Base 16 and decimal equivalent
        assertTrue(Ex1.equals("0b2", "0b10"));   // Zero in any base

    }
}
