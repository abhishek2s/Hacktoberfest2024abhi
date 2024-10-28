package decodeDsaSkills.multiArrays;

import java.util.Scanner;

public class SumOfElements2DArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter  rows of 2d array");
        int n=sc.nextInt();
        System.out.println("enter cols of 2d array");
        int m=sc.nextInt();
        int[][] arr=new int[n][m];

        System.out.println("enter the elements");
        for (int i=0; i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();

            }
        }

//        sum of all the elements and max element in the arrray
        int sum=0;
        int max=Integer.MIN_VALUE;

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                sum+=arr[i][j];
                if (arr[i][j]>max){
                    max=arr[i][j];

                }



            }
        }

        System.out.println(sum);
        System.out.println(max);


    }
}
