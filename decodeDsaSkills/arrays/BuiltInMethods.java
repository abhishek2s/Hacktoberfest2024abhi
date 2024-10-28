package decodeDsaSkills.arrays;

import java.util.Arrays;

public class BuiltInMethods {
    public static void main(String[] args) {
        int[] arr = {10, 25, 02, 55, 45};
        // for each loop is also used to present the array rather than for loop

        for (int ele : arr) {
            System.out.print(ele + " ");

        }
// Arrays.sort used to sort the array in assending order
        Arrays.sort(arr);
        System.out.println();
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}
