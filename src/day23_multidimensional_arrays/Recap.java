package day23_multidimensional_arrays;

import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {

        int [] arr = {30, 90, 60, 360, 180};
        int [] arr2 = {180, 360, 30, 90, 60};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("Compare before sorting: " + Arrays.equals(arr, arr2));

        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println("Compare before sorting: " + Arrays.equals(arr, arr2));

        //how to join the elements of an array

        String [] words = {"java", "selenium", "api", "db"};
        System.out.println(String.join("### ", words));

        // how to convert string into array
        String str = "Today is Thursday";
        System.out.println(str.split(" "));
        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println(str.toCharArray());
    }
}
