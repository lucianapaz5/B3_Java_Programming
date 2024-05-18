package day24_methods;

public class Car {

    public static void unlockCar () {
        System.out.println("Unlocking the car");


    }

    public static void openDoor () {
        System.out.println("Opening the door");
    }

    public static void getInTheCar () {
        System.out.println("Sitting in the car");
        System.out.println("Closing the door");


    }

    public static void getReady () {
        System.out.println("Put seatbelt on");
        System.out.println("Check the mirrors");
        System.out.println("Put music on");
        System.out.println("Put navigation");

    }
    public static void startCar () {
        System.out.println("Starting car");
    }

    public static void driveAndGo () {
        System.out.println("Putting gear into the drive mode");
        System.out.println("Press gas to go");

    }

    public static void goInHurry () {
        unlockCar();
        openDoor();
        getInTheCar();
        startCar();
        driveAndGo();
    }


    public static void main(String[] args) {
        unlockCar();
        unlockCar();
        unlockCar();
        openDoor();

        getInTheCar();

        getReady();

        startCar();
        driveAndGo();

        System.out.println("-----");
        goInHurry();
        goInHurry();
    }

}
