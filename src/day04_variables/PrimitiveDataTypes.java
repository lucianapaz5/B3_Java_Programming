package day04_variables;

public class PrimitiveDataTypes {
    /*
    data types:
    primitive-total 8
    integer types: byte, short, int, long
    floating types: float, double
    character: char
    true/false: boolean

    non-primitive
    String: multiple characters


     */
    public static void main(String[] args) {

        byte age= 60;
        System.out.println("age"); // 60 or age
        System.out.println(age);
        System.out.println(60);


        short year; // declared a variable called year.
        year = 2024; //assigned a value, 2024 into variable aka year
        System.out.println(year); //datatype here is : short
        System.out.println(2024); // datatype is: int


        int addressNumber = 244432;
        System.out.println(addressNumber); //datatype here is: int
        System.out.println(244432); //datatype is: int

        long bigNumber;

        bigNumber = 123456789123456789L; // addding l tells compiler is a long number


    }
}
