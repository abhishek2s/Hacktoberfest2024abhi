package decodeDsaSkills.Pattern_printing.Triangles;

import java.util.Scanner;

public class numberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print(j+1 +" ");
            }
            System.out.println(" ");
        }

    }
}
