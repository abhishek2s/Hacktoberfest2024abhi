package decodeDsaSkills.arrays;

import java.util.Scanner;

public class MaxElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int capacity = sc.nextInt();
        System.out.println("enter the array");
        int[] numbers = new int[capacity];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            // we can also use math.max class for finding the max. no. from the array
//            max=Math.max(max,numbers[i]);


            if (numbers[i] > max) {
                max = numbers[i];

            }
        }
        for (int i = 0; i < numbers.length; i++) {
            // We can use the math.min class for finding the mini. no. from the array
//            min=Math.min(min,numbers[i]);

            if (numbers[i] < min) {
                min = numbers[i];

            }
        }
        System.out.println("maximum value:" + " " + max);
        System.out.println("minimum value:" + " " + min);


        //for second largest element in the array
        int smx=Integer.MIN_VALUE;
        for (int i=0;i< numbers.length;i++){
            if (numbers[i]!=max){
                smx=Math.max(smx,numbers[i]);
            }
        }
        System.out.println("smx"+ smx);
    }
}
