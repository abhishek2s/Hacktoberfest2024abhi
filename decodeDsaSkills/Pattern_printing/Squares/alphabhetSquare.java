package decodeDsaSkills.Pattern_printing.Squares;

import java.util.Scanner;

public class alphabhetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        for(int i= 0; i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print((char) (j+65)+ " ");
            }
            System.out.println(" ");
        }
    }
}
