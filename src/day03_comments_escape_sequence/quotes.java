package day03_comments_escape_sequence;

public class quotes {
    public static void main(String[] args) {

        /*
        Q. How can you out/run/execute this:

        I like "Java" Programming
         */
        System.out.println("I like \"java\" programming");
        System.out.println("this is a double quote"); //"this is a double quote
        /*
        Q. How about if i want to print the following
        The car has on\off button

         */
        System.out.println(" the car has on\\off button");
        //the first backward slash is for syntax
        //the second backward slash is for next print out


        /*
        Q. how about if i want to print out a double backward slash
        the car has on\\off button
         */

        System.out.println("The car has on\\\\off button");

        System.out.println("the password can be true/false");
        //for the foward slash we dont need any escape sequence




    }
}