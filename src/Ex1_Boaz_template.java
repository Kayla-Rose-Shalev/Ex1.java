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

import java.util.Scanner;

public class Ex1_Boaz_template {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String n = sc.nextLine();
            System.out.println(isNumber(n));
        }
    }


    public static String numSection(String numberPart) {
        return numberPart.substring(0, numberPart.indexOf('b'));
    }

    public static String baseSection(String basePart) {
        return basePart.substring(basePart.indexOf('b') + 1 , basePart.indexOf(basePart.length()-1));

    public static Integer digitsOnly (int = )



    }
        public static int number2Int(String num) {
            int ans = -1;
            Scanner scan = new Scanner(System.in); // Using scanner, choose an n according to the given conditions:
            System.out.println(" Enter a string as number #1 (or + " + " quit to end the program");
            int n = scan.nextInt();



            return ans;
        }

        public static boolean isNumber(String a) {
            boolean ans = true;
            for (int i = 0; i < a.length(); i++) {
                if (Character.isDigit(a.charAt(i)) == false)
                    return false;
            }
            return ans;
        }

        /**
         * Calculate the number representation (in basis base)
         * of the given natural number (represented as an integer).
         * If num<0 or base is not in [2,16] the function should return "" (the empty String).
         * @param num the natural number (include 0).
         * @param base the basis [2,16]
         * @return a String representing a number (in base) equals to num, or an empty String (in case of wrong input).
         */
        public static String int2Number(int num, int base) {
            String ans = "";
            // add your code here

            ////////////////////
            return ans;
        }

        /**
         * Checks if the two numbers have the same value.
         * @param n1 first number
         * @param n2 second number
         * @return true iff the two numbers have the same values.
         */
        public static boolean equals(String n1, String n2) {
            boolean ans = true;
            // add your code here

            ////////////////////
            return ans;
        }

        /**
         * This static function search for the array index with the largest number (in value).
         * In case there are more than one maximum - returns the first index.
         * Note: you can assume that the array is not null and is not empty, yet it may contain null or none-valid numbers (with value -1).
         * @param arr an array of numbers
         * @return the index in the array in with the largest number (in value).
         *
         */
        public static int maxIndex(String[] arr) {
            int ans = 0;
            // add your code here

            ////////////////////
            return ans;
        }
}
