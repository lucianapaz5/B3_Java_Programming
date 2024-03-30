package day05_variables;

public class CellPhone {

    public static void main(String[] args) {

        String brand = "Apple";
        String model = "Iphone 12 Pro Max";
        String color = "Blue";
        double price = 799.99;
        int storage = 124;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I have an " + model + " from " + brand);
        System.out.println("It came in " +  color + " and it has " + storage + "GB");
        System.out.println("For the sim type " + sim + " with camera: " + hasCamera + ", the total price is $" + price );

        System.out.println();
        String fullMessage = "I have an " + model + " from " + brand + " It came in the color " + color + " and it has " + storage + " GB. \nFor the sim type " + sim + " with camera :" + hasCamera+ " the total price is" + price;

    }
}
