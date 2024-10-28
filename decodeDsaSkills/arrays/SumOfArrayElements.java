package decodeDsaSkills.arrays;

import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr =new int[4];
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();

        }
        int sum=0;

        for(int i=0; i< arr.length;i++){
            sum+= arr[i];



        }

        System.out.println(sum);

    }
}
