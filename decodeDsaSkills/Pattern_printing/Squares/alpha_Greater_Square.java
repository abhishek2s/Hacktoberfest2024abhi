package decodeDsaSkills.Pattern_printing.Squares;

import java.util.Scanner;

public class alpha_Greater_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char) (i+64)+" ");
            }
            System.out.println(" ");
        }
    }
}
