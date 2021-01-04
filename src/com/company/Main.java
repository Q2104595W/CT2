package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        var now = LocalDateTime.now();
        var monthNumber = now.getMonthValue();

// determine condition based upon month number (auto complete clause with command+shift+return)
        switch (monthNumber) {
            case 1:
                System.out.println("This month is January");
                break;
            case 2:
                System.out.println("This month is February");
                break;
            case 3:
                System.out.println("This month is March");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It's the 4th quarter");
                break;
            default:
                System.out.println("You chose another month");
        }

    }
}
/*
The if and else keywords give you complete flexibility in writing conditional code, but you can sometimes write that
code more efficiently using the switch statement. A switch statement examines a single expression and then compares it
to multiple possible values. You control the flow of execution based on when the values match.  In my starting code, I'm
 getting the current month as a numeric value, from the current system, and I'll add a switch keyword. When I select
 switch and let it auto complete, IntelliJ IDEA adds a pair of parenthesis. Add an expression inside the pair of
 parenthesis that you want to evaluate. This can be a primitive value such as number, or can be a string.
 I'll evaluate the current month number. Now I'm going to press a keyboard shortcut that only works in IntelliJ IDEA,
 on Mac it's command shift return, and on windows it's control shift enter, and that auto completes the current clause.
 With a switch keyword, it adds a code block. Now for each value I want to match, I add a case statement. First I'll
 look at case one, that would be for January, and if that value matches the month number, I'll say the month is January.
  At the end of each case statement, you typically add the break keyword. That means, I'm done with this switch
  statement, jump to the end. I'll select these three lines of code, and I'll duplicate them a couple of times, and this
   will be for case two, and this one will be for case three, and I'll change the month names. At the end of the switch
   statement, optional, you can add the default case, and that's just the keyword default, and our output, you chose
   another month, and then I'll run this code. I'm running this code in the month of October, and so none of my cases
   match, and I get the default case. If you want to match that first expression to more than one possible value,
   you can do it with multiple cases without the break keyword. So I'll add a case nine, a case 10, and a case 11.
   Without the break statement, I keep on going through the cases, and now I can say it's the fourth quarter, and I'll
   get to that code for any of those three values. Then once again I'll add the break statement so I don't continue
   executing the default case. I'll run that code, and there's the result. I'm evaluating a primitive value here, the
   month number, but again, you can use strings as well. That was added in Java seven. So you can start with an
   expression in the switch statement that's a string, and then match it to other strings. This switch statement can
   make you conditional logic much more elegant than a bunch of ifs, if else's, and else's. There are big changes coming
    for switch statements. Java 12 and 13 added the ability to treat a switch clause, as an expression that returns a
    Boolean value, and in version 13, there's a new yield keyword, that offers even greater flexibility, but I'm not
    showing you those changes quite yet, because in Java 12 and 13, they're still in preview, so they don't even work
     unless you make a change to your project and how it uses the SDK, but you can find information about these changes
      at this webpage. All about how switch expressions will be designed to work in the future.
 */