package decodeDsaSkills.multiArrays;

import java.util.Scanner;

public class BasicPrinting {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no.of rows for 2d array");
        int n=sc.nextInt();
        System.out.println("enter the no.of cols for 2d array");
        int m=sc.nextInt();
       int [][] arr=new int[n][m];  //initializing and giving the length to the array

//        taking input from the user
        System.out.println("enter the input for the 2d array");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }


//output of the 2d array


        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println( );
        }


    }
}
