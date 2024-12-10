import java.util.Scanner;

public class Ex1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt user for the first number
            System.out.print("Enter a string as number#1 (or \"quit\" to end the program): ");
            String num1 = scanner.nextLine();
            if (num1.equalsIgnoreCase("quit")) break;

            // In the case where the input is in an invalid format
            if (!Ex1.isNumber(num1)) {
                System.out.println("ERR: num1 is in the wrong format! (" + num1 + ")");
                continue;
            }

            int num1Value = Ex1.number2Int(num1);
            System.out.println("num1 = " + num1 + " is number: true, value: " + num1Value);

            // Prompt user for the second number
            System.out.print("Enter a string as number#2 (or \"quit\" to end the program): ");
            String num2 = scanner.nextLine();
            if (num2.equalsIgnoreCase("quit")) break;

            // Validate the second number
            if (!Ex1.isNumber(num2)) {
                System.out.println("ERR: num2 is in the wrong format! (" + num2 + ")");
                continue;
            }

            int num2Value = Ex1.number2Int(num2);
            System.out.println("num2 = " + num2 + " is number: true, value: " + num2Value);

            // Prompt for the base
            System.out.print("Enter a base for output: (a number [2,16]): ");
            int base;
            try {
                base = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ERR: wrong base, should be [2,16], got invalid input");
                continue;
            }

            if (base < 2 || base > 16) {
                System.out.println("ERR: wrong base, should be [2,16], got " + base);
                continue;
            }

            // Perform calculations
            int additionResult = num1Value + num2Value;
            int multiplicationResult = num1Value * num2Value;

            String additionBaseResult = Ex1.int2Number(additionResult, base);
            String multiplicationBaseResult = Ex1.int2Number(multiplicationResult, base);

            System.out.println(num1 + " + " + num2 + " = " + additionBaseResult + " (base " + base + ")");
            System.out.println(num1 + " * " + num2 + " = " + multiplicationBaseResult + " (base " + base + ")");

            // Determine the max value
            String[] candidates = {num1, num2, additionBaseResult, multiplicationBaseResult};
            int maxIndex = Ex1.maxIndex(candidates);

            System.out.println("Max number over [num1, num2, addition, multiplication]: " + candidates[maxIndex]);
        }

        scanner.close();
    }
}