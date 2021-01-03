package com.company;

import java.util.Scanner;

public class Main {
/**
In a command line application you can get string based input using a class named Scanner. The first step is to create an
 instance of that class. I'll create a variable that I'll name scanner, and I'll instantiate it with new scanner. And
 then I need to pass in a location from which the data is going to come. And I'll pass in the expression, system dot in.
 */
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
/*
  And that will create the import statement that's required at the top of the file. Now I can receive input. Before I
  receive the input I want to tell the user what I'm expecting. So I'm going to use system dot out but this time
  instead of println I'll just use a method named print and that'll output a string but keep the cursor on that same
  line. And I'll display a string of enter a value. Next, I'll get a value using this command. I'll create a variable
  called input and I'll call a method of the scanner object called nextLine. And that means wait until the user creates
  a line feed and then return everything else that they've typed up until that point. Then I'll output the results,
  what the user typed in.
 */
        System.out.print("Enter a value: ");
        var input = scanner.nextLine();
        System.out.println(input);


/*
  The scanner class also has methods that will convert the strings you enter into numbers of various types. I'll make a
  copy of this line of code that outputs a prompt and I'll paste it in a couple of times and I'll change this one to
  enter number one, and this one to enter number two. After the first prompt I'll create a variable called number one
  and I'll get its value from scanner dot next int. Notice there's also next boolean, next byte, next float, and so on.
  Then I'll duplicate that line and move it down. And this will be number two. And now I'll add those values together.
  I'll create a sum variable and add number one and number two. And then I'll output the result with the sum is and
  then the value. And I'll run that code and the first time I'm prompted I'll enter any value and that just gets echoed
  then I'll enter a number and another number and I see the two values are summed together. Now the scanner class will
  validate what you type in to a certain extent but if the user types in something that doesn't match its expectations
  it's just going to crash. I'll run the application one more time. I'll once again enter any string at all, doesn't
  matter. Then watch what happens when I type something that isn't a number. I get an exception. And so the scanner
  class will work for very simple input, but if you want to do anything complex you'll need to learn something about
  error handling
 */

        System.out.print("Enter number 1: ");
        var number1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        var number2 = scanner.nextInt();

        var sum =  number1 + number2;
        System.out.println("The sum is " + sum);

    }
}


