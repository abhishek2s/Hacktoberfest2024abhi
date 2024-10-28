package decodeDsaSkills.arrays;

import java.util.Scanner;

public class TwoSumImportant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number:");
        int num=sc.nextInt();
        System.out.println("enter the size of array");
        int length=sc.nextInt();
        System.out.println("enter the array:");
        int[] arr=new int[length];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]+arr[j]==num){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }




    }
}
