package decodeDsaSkills.Pattern_printing.Squares;

import java.util.Scanner;

public class starSquare {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        int m=sc.nextInt();
        int n=sc.nextInt();
        for (int i=0; i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
