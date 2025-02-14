package decodeDsaSkills.multiArrays;

import java.util.Scanner;

public class RotateMatrixLeetcode {
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


//transpose of the matrix
        r = arr1.length;
        c = arr1[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < i; j++) {      //pattern printing concept is used to transpose only the half of the matrix

                int temp = arr1[i][j];
                arr1[i][j] = arr1[j][i];
                arr1[j][i] = temp;
            }
        }


//        for reverse each row
        for (int i=0;i<r;i++){
            int a=0;
            int b=r-1;
        while(a<b){
            int temp=arr1[i][a];
            arr1[i][a]=arr1[i][b];
            arr1[i][b]=temp;
            a++;
            b--;
        }

        }




//printing rotate matrix

        for (int i = 0; i < r; i++) {
            for (int j = 0; j<c;j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }





    }
}
