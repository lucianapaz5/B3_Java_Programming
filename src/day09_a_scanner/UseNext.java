package day09_a_scanner;

import java.util.Scanner;

public class UseNext {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is today");
        String day = input.nextLine();

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Today: " + day);
        System.out.println("First Name: " + firstName);





    }
}
