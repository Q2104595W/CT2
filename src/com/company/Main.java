package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var i1 = getInput(sc, "Enter value 1: ");
        var i2 = getInput(sc, "Enter value 2: ");

        double result = addValues(i1, i2);
        System.out.println("The sum is " + result);
/*
Notice that IntelliJ IDEA dims out the name of this method to indicate that it's not used yet. So, I'll go back to my
main method, and I'll duplicate these two lines, and I'll change this result variable to resultOfFour. And I'll
change the variable there, too, and then I'll pass in i1 and i2 again.
 */
        double resultOfFour = addValues(i1, i2, i1, i2);
        System.out.println("The sum of 4 is " + resultOfFour);

        double resultOfMultiple = addValues(i1, i2, i1, i2, i1, i2);
        System.out.println("The sum of multiple is " + resultOfMultiple);
    }

    /*
    A Java class can implement more than one method of the same name. But each of the methods must have a different
    signature. A method signature is determined by the method's name, and then the number and types of its parameters.
    In this starting application, I have two methods. The getInput method, which receives a Scanner object and a String and
    returns an integer value. And a method that I've added named addValues, it receives two integer values and adds them
    together and returns the result. I'll run the application and show that I can enter a value, and enter another one and
    get back the sum.
     */
    private static int getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }

    private static double addValues(int i1, int i2) {
        return i1 + i2;
    }
/*
Now, I want to add a new version of the addValues method. I'll select these lines of code and duplicate them.
And I'll change this version so it receives four integer variables. I'll name the third one i3 and the fourth one i4.
Then, I'll change the return statement to add all those values together.
 */
    private static double addValues(int i1, int i2, int i3, int i4) {
        return i1 + i2 + i3 + i4;
    }
/*
You can also create methods that receive variable numbers of parameters. I'll make another copy of this method, I'll
put it down here at the bottom. And this time, instead of having more than one argument, I'll just have one and I'll
name it value. And after the data type, I'll put in a dot, dot, dot. And that means, I can receive any number of
integer values. Now, I'm going to change how I add the values together. I'll create a new variable that I'll call
result, I'll set it to zero, then I'll do a for each loop. I'll use the for each template, and I'll say that I'm
creating a variable that I'll name value. I'll come back up here and change my parameter to values as a multiple,
and then I'll say that's where I'm getting the data from. So now, I'm looping through the list of values that are
passed in. Within the loop, I'll incrementally add the value with result plus equals value. And then, at the end of
the loop, I'll return the result. So now, it doesn't matter how many integer values I pass in, I'll be adding them
all together. I'll come back up here and I'll duplicate these two lines of code. I'll change the variable here to
resultOfMultiple. And I'll change the output, too. And then, I'll copy and paste these arguments, so I'm passing in
six values.
 */
    private static double addValues(int... values) {
        int result = 0;
        for (var value : values) {
            {
                result += value;
            }

        }
        return result;
    }
}

