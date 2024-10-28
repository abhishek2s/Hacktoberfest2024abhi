package decodeDsaSkills.Sorting;

import java.util.Arrays;

public class BulitInSort {
    public static void main(String[] args) {
        int arr[]={1,89,2,8,678,94,8,59,};
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(arr);  //built in sorting
        for (int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
