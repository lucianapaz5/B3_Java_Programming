package day09_a_scanner;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt(); //7

        boolean isEven = num % 2 == 0;
        boolean isOdd = num % 2 != 0;


    }


}
