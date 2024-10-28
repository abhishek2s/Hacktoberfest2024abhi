package decodeDsaSkills.multiArrays;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter  rows of 2d array");
        int r=sc.nextInt();
        System.out.println("enter cols of 2d array");
        int c=sc.nextInt();
        int[][] arr1=new int[r][c];
        int [][] transpose =new int [c][r];


        System.out.println("enter the elements for array 1");
        for (int i=0; i<r;i++){
            for (int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }


//transpose of the matrix
         r=arr1.length;
        c=arr1[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                transpose[j][i]=arr1[i][j];


            }
        }
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }


    }
}
