package decodeDsaSkills.arrays;

import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr={10,56,48,25,35};
        int[] nums=arr; //Shallow copy created means original array mi bhi changes ho jayege
        nums[0]=152;
        System.out.println(arr[0]);  // see changes ho gye arr mi bhi

        int []brr= Arrays.copyOf(arr, arr.length); //deep copy of arr created means original array i change nhi hoga
        brr[2]=568;
        System.out.println(arr[2]);   //changes nhi hue original array m
        System.out.println(brr[2]);



    }
}
