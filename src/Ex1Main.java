import java.util.Scanner;

public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = "", num2 = "", quit = "quit";
        while (!num1.equals(quit) && !num2.equals(quit)) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.next();
            if (!num1.equals("quit")) {
            }
        }
        System.out.println("quitting now...");
    }
}