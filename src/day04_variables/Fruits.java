package day04_variables;

public class Fruits {

    public static void main(String[] args) {

        int apples = 80;
        int grapes = 100;
        int bananas = 150;

        System.out.println("This is how many apples we have: " +70);  //the value 70 is hardcoded
        System.out.println("This is how many apples we have: " +apples); // the value of apple is dynamically used

        System.out.println("Grapes:" +grapes);
        System.out.println("Bananas:" + bananas);

        //REASSIGNMENT
        System.out.println("Sold out some apples");
apples = 30;
        System.out.println("Apples after selling: " + apples);

        int price = 15;
        System.out.println("The price of my 30 apples is $15"); // it is HARDCODED
        System.out.println("the price of my " + apples + " apples is $" + price);


    }
}
