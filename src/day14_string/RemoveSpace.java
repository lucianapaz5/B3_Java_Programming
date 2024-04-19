package day14_string;

public class RemoveSpace {
    public static void main(String[] args) {

        String str = "    Thursday    ";
        System.out.println(str);
        System.out.println(str.length()); //

        String str2 = "    java is fun    ";
        System.out.println(str.length());
        str2 = str2.trim();
        System.out.println(str2.length());

        String str3 = "    loopcamp has SDET program    ";
        System.out.println(str3.length());
        System.out.println(str3.startsWith("    loopcamp"));

        System.out.println(str3.trim());
        System.out.println(str3.length());

        str3 = str3.trim();
        System.out.println(str3.length());


    }
}
