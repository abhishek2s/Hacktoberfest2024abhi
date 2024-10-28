package decodeDsaSkills.multiArrays;

import java.util.Scanner;

public class WavePrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  rows of 2d array");
        int r = sc.nextInt();
        System.out.println("enter cols of 2d array");
        int c = sc.nextInt();
        int[][] arr1 = new int[r][c];


        System.out.println("enter the elements for array 1");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }


//        wave form printing
        for (int i=0;i<r;i++){
            if(i%2==0){
                for (int j=0;j<c;j++){
                    System.out.print(arr1[i][j]+" ");
                }


            }
            else {
                for (int j=c-1;j>=0;j--){
                    System.out.print(arr1[i][j]+" ");
                }

            }
        }





    }
}
