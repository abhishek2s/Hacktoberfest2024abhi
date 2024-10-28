package decodeDsaSkills.arrays;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //taking input for the array and length of the array
        System.out.println("enter the number of students:");
        int students=sc.nextInt();
        int[] marks=new int[students];
        for (int i =0;i< marks.length;i++){
            marks[i]=sc.nextInt();

        }

        //getting the rollno of the students having marks less than 35

        for (int i=0;i< marks.length;i++){
            if (marks[i]<35){
                System.out.println(i);
            }
        }

    }
}
