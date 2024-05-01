package day15_string;

public class EmptyOrBlank {
    public static void main(String[] args) {
        String str = "new example";
        System.out.println(str.isEmpty());

        str = " ";
        System.out.println(str.isEmpty());

        str = "";
        System.out.println(str.isEmpty());

        System.out.println(str.length());

        if (str.length() == 0) {
            System.out.println("no characters");

            System.out.println(str.isBlank()); //possible update normally it checks for empty spaces

            str = "Hello World!";
            System.out.println(str.isBlank());


            str = " ";
            System.out.println(str.isBlank());
        }
    }
}
