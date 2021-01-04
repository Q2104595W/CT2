package com.company;

import java.util.Scanner;
/*
Most programming languages support the ability to create reusable code: Code blocks that you can call from multiple
places in an application. These are sometimes called functions, or subroutines. In Java, they're called methods, and
they're always declared as members of a class. The main method is one example, every method requires a signature,
including the method's name, the type of data it returns, and declarations of any parameters the method receives. The
main method has a required signature in console applications, the name has to be main, all lower case. It has to return
void, which means, "nothing," and it has to be static, which means that it can be called from the main class, without
having to create an instance of the class. It also has to receive a parameter, that's an array of strings. Notated like
this. The name of the parameter doesn't matter, it can be anything. But the type is required. You can create your own
methods and add them to any class. Methods can either be static or non-static. A static method is available to be called
directly from the class itself. That is, you don't have to have an instance of the class. But if you take the keyword
static out, then you must have an instance of the class. In a console application, when you create your own new
methods, you'll typically make them static, so they're easy to call from the current context. Now, in IntelliJ IDEA,
I'm going to use a little tool that let's you take a little bit of redundant code, and extract it as a custom method.
This application has two versions of some code, that displays a prompt, and then gets some data input from the user.
 */
public class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        double d1 = getInput(sc, "Enter a numeric value 1: ");

        double d2 = getInput(sc, "Enter a numeric value 2: ");

        double result = d1 / d2;

        System.out.println("The answer is " + result);
    }

    private static double getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextDouble();
    }

}

