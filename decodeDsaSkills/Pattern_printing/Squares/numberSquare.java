package decodeDsaSkills.Pattern_printing.Squares;

import java.util.Scanner;

public class numberSquare {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        int m=sc.nextInt();
        int n=sc.nextInt();
        for (int i=1; i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }


}
