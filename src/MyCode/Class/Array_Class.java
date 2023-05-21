package MyCode.Class;

// Array Class = Do manipulation on arrays -- not arraylist
// used in sorted arrays

import java.util.Arrays;

public class Array_Class {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7,8,9,10};
        int i = Arrays.binarySearch(n, 4);
        System.out.println("Index: " + i);

        // Arrays.sort() == sort unsorted ARRAYs
        // Arrays.fill() == fill array with different value

    }
}
