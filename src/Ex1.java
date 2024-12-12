/**
 * This class represents a simple solution for Ex1.
 * As defined here: https://docs.google.com/document/d/1AJ9wtnL1qdEs4DAKqBlO1bXCM6r6GJ_J/r/edit/edit
 * In this assignment, we will design a number formatting converter and calculator.
 * In general, we will use Strings as numbers over basis of binary till Hexa.
 * [2-16], 10-16 are represented by A,B,..G.
 * The general representation of the numbers is as a String with the following format:
 * <number><b><base> e.g., “135bA” (i.e., “135”, as 10 is the default base), “100111b2”, “12345b6”,”012b5”, “123bG”, “EFbG”.
 * The following are NOT in the format (not a valid number):
 * “b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, "", null,
 * You should implement the following static functions:
 */

public class Ex1 {


    /**
     * Convert the given number (num) to a decimal representation (as int).
     * If the given number is not in a valid format returns -1.
     *
     * @param num a String representing a number in basis [2,16]
     * @return
     */

    // This functions takes a given number in the format <number><b><base> and converts it to its decimal representation (as int),
    // with the exception of a regular number made up of only digits, which is automatically recognized as decimal.
    // In the case where the number is not in the write format, the code returns the value -1.
    public static int number2Int(String num) {
        int ans = -1;
        if (num == null || !isNumber(num)) {
            return ans;
        }

        try {
            if (!num.contains("b")) { // if num doesn't contain b,
                ans = Integer.parseInt(num, 10); // Decimal value

            } else {
                // Split into number and base sections
                String[] parts = num.split("b", 2);
                String numberSection = parts[0];
                String baseSection = parts[1];

                // Determine the base
                int base = -1;
                if (baseSection.length() == 1 && baseSection.matches("[A,B,C,D,E,F,G]")) { // Checks if base part contains only a single character and that it is a letter from A-G
                    base = baseSection.charAt(0) - 'A' + 10; // Convert A-G to numeric base
                } else { // In the case where the base is a number
                    base = Integer.parseInt(baseSection); // Parse base as integer
                }

                if (base < 2 || base > 16) {
                    return -1;
                }
                // Convert the number part to its decimal value
                ans = Integer.parseInt(numberSection, base);
            }
        } catch (Exception e) {
            ans = -1;
        }

        return ans; // Return the converted value
    }


    /**
     * This static function checks if the given String (g) is in a valid "number" format.
     *
     * @param a a String representing a number
     * @return true iff the given String is in a number format
     */
    // This is a boolean function that verifies if a number fits within the format <number<b><base>, where the base has to be from 2 to 16.
    // A-G represent 10-16.
    // If the number is invalid for the given base, the boolean returns false.
    public static boolean isNumber(String a) {
        boolean ans = true; // Default return value = true
        if (a == null || a.isEmpty()) { //
            ans = false;
            return ans;
        }

        if (!a.contains("b")) {
            ans = a.matches("[0-9]+");
            return ans;
        }

        // split input by 'b' to
        String[] parts = a.split("b");

        // If there is more than one b, the input is invalid
        if (parts.length != 2) {
            ans = false;
            return ans;
        }

        String numberPart = parts[0];
        String basePart = parts[1];

        int base = -1;
        try {
            if (basePart.length() == 1 && basePart.matches("[A-G]")) {

                base = basePart.charAt(0) - 'A' + 10;
            } else {

                base = Integer.parseInt(basePart);
            }

            if (base < 2 || base > 16) {
                ans = false;
                return ans;
            }
        } catch (NumberFormatException e) {
            ans = false;
            return ans;
        }

        if (numberPart.isEmpty()) {
            ans = false;
            return ans;
        }


        for (char ch : numberPart.toCharArray()) {
            if (Character.isDigit(ch)) {
                if (Character.getNumericValue(ch) >= base) {
                    ans = false;
                    return ans;
                }
            } else if (ch >= 'A' && ch <= 'G') {
                if (base < 10 || ch - 'A' + 10 >= base) {
                    ans = false;
                    return ans;
                }
            } else {
                ans = false;
                return ans;
            }
        }

        return ans;
    }


    /**
     * Calculate the number representation (in basis base)
     * of the given natural number (represented as an integer).
     * If num<0 or base is not in [2,16] the function should return "" (the empty String).
     *
     * @param num  the natural number (include 0).
     * @param base the basis [2,16]
     * @return a String representing a number (in base) equals to num, or an empty String (in case of wrong input).
     */

    // This function receives a base from 10 to 16, and converts a given natural number to that base.
    // if the number is invalid or the base is not in the correct range, the function returns "".
    public static String int2Number(int num, int base) {
        if (num < 0 || base < 2 || base > 16) {
            return "";
        }
        return Integer.toString(num, base).toUpperCase();
    }


    /**
     * Checks if the two numbers have the same value.
     *
     * @param n1 first number
     * @param n2 second number
     * @return true iff the two numbers have the same values.
     */

    // This function checks if two numbers have the same value.
    public static boolean equals(String n1, String n2) {
        return number2Int(n1) == number2Int(n2);
    }


    /**
     * This static function search for the array index with the largest number (in value).
     * In case there are more than one maximum - returns the first index.
     * Note: you can assume that the array is not null and is not empty, yet it may contain null or none-valid numbers (with value -1).
     *
     * @param arr an array of numbers
     * @return the index in the array in with the largest number (in value).
     */

// This function finds the index of the largest number within an array of numbers.

    public static int maxIndex(String[] arr) {
        if (arr == null || arr.length == 0) {
            return -1; // If the array is null or empty, return -1
        }

        int maxIndex = -1; // To track the index of the maximum valid number
        int maxValue = number2Int(arr[0]); // Initialize the maximum value to the smallest possible value

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != null) { // Ensure the current element is not null
                int value = number2Int(arr[i]); // Convert the string to its decimal value using your method
                if (value != -1 && value > maxValue) { // Only consider valid numbers (value != -1)
                    maxValue = value; // Update the max value
                    maxIndex = i; // Update the max index
                }
            }
        }
        return maxIndex; // Return the index of the maximum valid number
    }
}


