package day09_a_scanner;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter 3 number and hit enter after each");
        //System.out.println("\tNumber 1: ");
        key.nextInt();
        key.nextInt();
        key.nextInt();

        System.out.println("----------------");

        System.out.println("The sum of the number: " + (key.nextInt() + key.nextInt() + key.nextInt() ));


    }
}
