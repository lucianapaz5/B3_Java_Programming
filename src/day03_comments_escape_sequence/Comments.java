package day03_comments_escape_sequence;

import java.sql.SQLOutput;

public class Comments {
    public static void main(String[] args) {

        //#1This is called a SINGLE LINE COMMENT
        //This line below prints Hello Loopcamp to the console

        System.out.println("Hello Loopcamp");
      /*
      this is MULTIPLE line comment
      I want to
      type multiple line
      as a comment
       */
        System.out.println("A");

        /**
         * #3 JAVA DOC COMMENT - > JAVA DOCUMENTATION COMMENT
         * The following code is printing a statement
         * that says "this is a println statement"
         *
         */
        System.out.println("This is a println statement");

        //Todo: Change the weekday when you run this code
        System.out.println("Today is Sunday.");

        /*
        todo:
         */

        /**
         * ToDo:
         */

    }
}
