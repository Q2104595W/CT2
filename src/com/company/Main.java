package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// create scanner object and declare a variable to input a month number

        var scanner = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");
        var monthNumber = scanner.nextInt();

// declare string variable; conditional logic will assign

        String message;

/* print message based upon input:
   a month number between 1 and 12
   a month number less than or equal to 3 is 1st quarter
   a month number less than or equal to 6 is 2nd quarter
   a month number greater than 6 but less than 12 is second half of year
 */
        if (monthNumber < 1 || monthNumber > 12) {
            message = "That isn't a valid month!";
        } else if (monthNumber <= 3) {
            message = "That's in Quarter 1!";
        } else if (monthNumber <= 6) {
            message = "That's in Quarter 2!";
        } else {
            message = "That isn't in the first half of the year";
        }
        System.out.println(message);
    }
}