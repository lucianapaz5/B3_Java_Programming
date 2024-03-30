package day05_variables;

public class RecapVariables {
    public static void main(String[] args) {

        //declare variables

        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalNumberOfStudentsInClass;

    //assign value
        numberOfCoffeeCups = 2;
        totalPriceOfCoffee = 10.25;
        totalNumberOfStudentsInClass = 100;

        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalNumberOfStudentsInClass);


        System.out.println(numberOfCoffeeCups + "*" +  totalNumberOfStudentsInClass);

        //declare and assign

        double temperature = 30.5;
        int javaDay = 5;
        System.out.println("Today the temperature was " + temperature);
        System.out.println("It is Day " + javaDay + " in Java class");

    }
}
