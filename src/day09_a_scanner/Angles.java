package day09_a_scanner;

import java.util.Scanner;

public class Angles {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 angles number: ");
        double angleOne = input.nextDouble();
        double angleTwo = input.nextDouble();
        double angleThree = input.nextDouble();

        double total = angleOne + angleTwo + angleThree;

        boolean isTriangle = total == 100;
        boolean isCircle = total == 360;

        System.out.println("It is a triangle: " + isTriangle);
        System.out.println("It is a circle: " + isCircle);

    }
}
