package decodeDsaSkills.arrays;

import java.util.Scanner;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array:");
        int capacity= sc.nextInt();
        System.out.println("enter the array:");
        int[] numbers=new int[capacity];
        for (int i=0; i< numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            max=Math.max(max,numbers[i]);

        }

        for (int i=0; i< numbers.length;i++){

            if(numbers[i]>secMax&&numbers[i]!=max){
                secMax=numbers[i];
            }

            // use this math library for the max. and min. value  in array
//            if (max!=numbers[i]){
//                secMax=Math.max(secMax,numbers[i]);
//            }

        }
        System.out.println(secMax);



    }
}
