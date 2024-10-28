package decodeDsaSkills.Pattern_printing.Squares;

import java.util.Scanner;

public class starRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of rows and cols");
        int m= sc.nextInt();
        int n= sc.nextInt();
        for (int i=0;i<m;i++){   //rows k liye means no.of lines
            for (int j=0;j<n;j++){   //cols k liye means no.of * in each line
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
