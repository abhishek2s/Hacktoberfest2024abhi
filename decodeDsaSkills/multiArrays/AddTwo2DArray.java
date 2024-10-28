package decodeDsaSkills.multiArrays;

import java.util.Scanner;

public class AddTwo2DArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter  rows of 2d array");
        int n=sc.nextInt();
        System.out.println("enter cols of 2d array");
        int m=sc.nextInt();
        int[][] arr1=new int[n][m];
        int [][] arr2=new int[n][m];
        int [][] result =new int [n][m];


        System.out.println("enter the elements for array 1");
        for (int i=0; i<n;i++){
            for (int j=0;j<m;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the elements for array 2");
        for (int i=0; i<n;i++){
            for (int j=0;j<m;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                result[i][j]=arr1[i][j]+arr2[i][j];

            }
        }

        for (int[] ele: result){
            for (int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }
}
