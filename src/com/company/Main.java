package com.company;

public class Main {

    public static void main(String[] args) {
        /*
          JAVA's string class includes many methods that you can use to parse data and find sub strings.
          I'm starting with a string of "Welcome to California". Let's say I wanted to find out how long
          that string is. I could use the length method. I'll use some system output, and then I'll pass
          in "length of string", and I'll append the expression "s1.length", and that's a method.
          So you use the parenthesis at the end. And I get back a numeric value of 22.
         */
        var s1 = "Welcome to California!";
        System.out.println("length of string: " +s1.length());

        /*
          If I wanted to find the location of a particular sub string, I can use the method "index of".
          I'll create a variable called "position", and I'll call it "s1.indexof" and pass in "California".
          And then I'll output that using a concatenated string. And I find out that California starts
          at index 11.
         */

        int position = s1.indexOf("California");
        System.out.println(position);

        /*
           Let's say I wanted to find out what value did start at 11. I can create a variable, I'll call it
           "sub". And I'll call it "s1.substring". Notice that there are two different method signatures for
           sub string. You can either have just the beginning index, and you'll get from that position to
           the end of the string, or you can define a range. I'll use the first version. I'll pass an 11,
           and then I'll output the result which is "California!".
         */

        var sub = s1.substring(11);
        System.out.println(sub);

        /*
        There are other methods that can be useful for manipulating a string in some way. I'll create a
        variable with the value "Welcome" with a whole bunch of space at the end. Next I'll create a
        variable named "len" for length, and I'll get the value of "s2.length", and I'll output that value.
         And I get back the value of 14.
         */

        String s2 = "Welcome!      ";
        var len = s2.length();
        System.out.println(len);

        /*
        Now I'm going to call a method of the string class named "trim". I'll create a new variable.
        I'll call it "trimmed". And I'll call it "s2.trim". This method removes any white space at the
         beginning or the ending of a string where white space is, line feeds, space characters and tabs.
         And I'll output the length of that trimmed string. And I get back the value of eight. As I've
         mentioned previously, the string class has a wide variety of tools that are available for
         manipulating, inspecting and otherwise working with JAVA based strings.
         */

        var trimmed = s2.trim();
        System.out.println(trimmed.length());


    }
}
