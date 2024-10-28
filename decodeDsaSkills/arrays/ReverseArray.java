package decodeDsaSkills.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 85, 9, 74, 35, 84, 545, 78};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();


        // using two pointers concept
//        int i=0;
//        int j= arr.length-1;
//        while(i<=j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }

        // normal method used for the same
        for (int p = 0; p < arr.length / 2; p++) {   // half_length is used for swapping
            int q = arr.length - 1 - p;
            int temp = arr[p];
            arr[p] = arr[q];
            arr[q] = temp;


        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }


    }
}
