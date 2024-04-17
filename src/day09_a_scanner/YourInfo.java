package day09_a_scanner;

import java.util.Scanner;

public class YourInfo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        byte age= input.nextByte();

        System.out.println("Enter your favorite number: ");
        long favoriteNum = input.nextLong();

        System.out.println("Enter your favorite book: ");
        String bookName = input.nextLine();

        System.out.println("Information");
        System.out.println("\t" + age);
        System.out.println("\t" + favoriteNum);
        System.out.println("\t" + bookName);



    }
}
