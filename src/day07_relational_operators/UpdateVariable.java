package day07_relational_operators;

public class UpdateVariable {

    public static void main(String[] args) {
        int a = 10;
        a = 11; //re-assigned a new value to a
        a++; // re-assigning incrementing value by 1 (a = a+1;) {post increment}
        ++a; // re-assigning value  incrementing  by 1 {pre increment}
        a = a + 1; //re-assigning a new value increased by 1 {regular adding}

        //add 10
        a = a + 10; // re-assigned a new value which increased by 10 (regular adding)
        a += 10; // re-assigned a new value which increased by 10 (SHORTHAND operator)

        System.out.println(a);

        int b = 2;
        b *= 6;
        System.out.println(b); // 12 (b multiplied by 6)

        int c = 10;
        c %= 3;
        System.out.println(c);


    }
}
