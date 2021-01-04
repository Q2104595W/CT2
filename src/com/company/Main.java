package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

// create array of strings representing each month
        String[] months =
                {"January", "February", "March",
                        "April", "May", "June",
                        "July", "August", "September",
                        "October", "November", "December"};
/*
create iterative loop You can generate this code by typing fori and pressing enter, return, or tab and that will expand
to the template you need
This kind of loop uses three expressions. Separated with semicolons. The first declares a variable, typically a numeric
value. And when you're looping through a collection of data, it's typically initially set to zero because
Java uses zero based indexing. The next expression is the condition. This is a Boolean value that says how long the
loop will keep on running; I want to keep running as long as the value of I is less than the size of the array. the
third expression is a command typically used to increment
that value that was established at the beginning and when you're looping through an array and you want to get every
item in the array, you'll typically increment by one each time through.
 */
//        for (int i = 0; i < months.length; i++) {
//            System.out.println(months[i]);
//    }

/*
Now within the loop, I can execute as many
  commands as I want to. So I'll reference the array months and then put the variable I inside a pair of brackets.
   And I'll run that code. And the output shows one month per line. So that's how you can loop through just about
   anything and this is the oldest version of looping syntax in Java.
 */
//for each can replace for as a more elegant syntax; highlight "for" and press option+enter to get for each syntax
//        Arrays.stream(months).forEach(System.out::println);

/*
Doing a while loop by declaring a variable called whileCounter
 */
//        var whileCounter = 0;
// keyword "while" followed by command+shift+enter will auto complete statement template
//        while (whileCounter < months.length) {
// output month (in code block)
//            System.out.println(months[whileCounter]);
// the counter has to be incremented
//            whileCounter++;

/*
Doing a "do" loop which is similar to a while; click fn + hold shift+f6 to refactor "whileCounter and replace "while"
with "do" then copy "while (doCounter < months.length)" to the clipboard and create a "do" keyword + code block; paste
"while (doCounter < months.length)" after code block and run the code; same result as other loops
 */
            var doCounter = 0;
            do {
                System.out.println(months[doCounter]);
                doCounter++;
        } while (doCounter < months.length);

    }

}
