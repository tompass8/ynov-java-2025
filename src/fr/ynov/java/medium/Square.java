package fr.ynov.java.medium;

import java.util.Scanner;

public class Square {
    public static int calculateSquare(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int number;

        if (args.length > 0) {
            try {
                number = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid argument. Please provide a valid integer.");
                return;
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to square: ");

            try {
                number = scanner.nextInt();
                scanner.close();
            } catch (Exception e) {
                System.out.println("Invalid input. Please provide a valid integer.");
                scanner.close();
                return;
            }
        }

        int result = calculateSquare(number);
        System.out.println("The square of " + number + " is: " + result);
    }
}