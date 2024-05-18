package day23_multidimensional_arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int [] nums = {4, 10, 30, 100, 150};


        System.out.println(Arrays.binarySearch(nums, 4));
        System.out.println(Arrays.binarySearch(nums, 100));
        System.out.println(Arrays.binarySearch(nums, 200)); // would be in position 4 + 1 = 5 since it is not there * -1
        System.out.println(Arrays.binarySearch(nums, 50));


    }
}
