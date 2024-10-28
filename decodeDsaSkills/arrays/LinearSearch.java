package decodeDsaSkills.arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target element in the array:");
        int targetElement = sc.nextInt();
        System.out.println("enter the length of an array");
        int length = sc.nextInt();
        System.out.println("enter the array:");
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }

        //searching of an element in the array
        boolean flag = false;// shows that the element is not present in array

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == targetElement) {
                flag = true;
                break;

            }
            else {
                flag=false;

            }



        }
        if (flag == true) {
            System.out.println("present");
        } else {
            System.out.println("not present");
        }

    }
}

