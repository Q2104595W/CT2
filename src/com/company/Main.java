package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");
        var monthNumber = scanner.nextInt();

        String message;
        if (monthNumber < 1 || monthNumber > 12) {
            message = "That isn't a valid month!";
        } else if (monthNumber <= 3)  {
            message = "That's in Quarter 1!";
        } else if (monthNumber <=6) {
            message = "That's in Quarter 2!";
        } else {
            message = "That isn't in the first half of the year";
        }
    }
}