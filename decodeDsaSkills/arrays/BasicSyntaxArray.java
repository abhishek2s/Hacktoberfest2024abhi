package decodeDsaSkills.arrays;

import java.util.Scanner;

public class BasicSyntaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
// taking input through for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
// output of Array using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }


}
