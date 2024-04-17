package day09_a_scanner;

import java.util.Scanner;

public class FirstScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Please, enter a number: ");
        int userNumber = input.nextInt(); /// Return input as int --> therefore, i can assign into int variable
        System.out.println( "You entered: " + userNumber);


    }
}
