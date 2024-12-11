import java.util.Scanner;

public class Ex1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt user for the first number
            System.out.print("Enter a string as number#1 (or \"quit\" to end the program): ");
            String num1 = scanner.nextLine();

            // In the case where the user wants to quit:
            if (num1.equalsIgnoreCase("quit")) {
                System.out.println("quitting now...");
                break;
            }

            // In the case where the input for num1 is in an invalid format, print error:
            if (!Ex1.isNumber(num1)) {
                System.out.println("ERR: num1 is in the wrong format! (" + num1 + ")");
                continue; // Restart loop to ask for new input
            }

            // Convert num1 to decimal value using "number2Int" function:
            int num1DecimalValue = Ex1.number2Int(num1);
            System.out.println("num1 = " + num1 + " is number: true, value: " + num1DecimalValue);

            // Prompt user for the second number
            System.out.print("Enter a string as number#2 (or \"quit\" to end the program): ");
            String num2 = scanner.nextLine();
            if (num2.equalsIgnoreCase("quit")) {
                System.out.println("quitting now...");
                break;
            }

            // In the case where the input for num2 is in an invalid format, print error:
            if (!Ex1.isNumber(num2)) {
                System.out.println("ERR: num2 is in the wrong format! (" + num2 + ")");
                continue; // Restart loop to ask for new input
            }

            // Convert num2 to decimal value using "number2Int" function:
            int num2DecimalValue = Ex1.number2Int(num2);
            System.out.println("num2 = " + num2 + " is number: true, value: " + num2DecimalValue);

            // Prompt user for a base from 2 to 16
            System.out.print("Enter a base for output: (a number [2,16]): ");
            int base;
            base = Integer.parseInt((scanner.nextLine()));
            if (base < 2 || base > 16) {
                System.out.println("ERR: wrong base, should be [2,16], got " + base);
                continue; // Restart loop to ask for new input
            }

            // Perform required calculations:
            int additionResult = num1DecimalValue + num2DecimalValue;
            int multiplicationResult = num1DecimalValue * num2DecimalValue;

            String addition4ChosenBaseResult = Ex1.int2Number(additionResult, base);
            String multiplication4ChosenBaseResult = Ex1.int2Number(multiplicationResult, base);

            // Display results in chosen base:
            System.out.println(num1 + " + " + num2 + " = " + addition4ChosenBaseResult + " (base " + base + ")");
            System.out.println(num1 + " * " + num2 + " = " + multiplication4ChosenBaseResult + " (base " + base + ")");

            // Determine the max value:
            String[] numbers = {num1, num2, addition4ChosenBaseResult, multiplication4ChosenBaseResult};
            int maxIndex = Ex1.maxIndex(numbers);

            System.out.println("Max number over: " + num1 + "," + num2 + "," + addition4ChosenBaseResult + "," + multiplication4ChosenBaseResult +": "  + numbers[maxIndex]);
        }

        scanner.close();
    }
}