package decodeDsaSkills.arrays;

public class PreviousGretestElement {
    public static void main(String[] args) {
        int [] arr={12,8,60,37,2,49,16,28,21};
        int n= arr.length;


//        optimised code
//        for brute code nested for loop used

        int [] SortedArr=new int[n];
        SortedArr[0]=-1;
        int currentMax=arr[0];
        for (int i=1;i<n;i++){
            SortedArr[i]=currentMax;
            currentMax=Math.max(currentMax,arr[i]);

        }

        for (int ele: SortedArr){
            System.out.print(ele+" ");
        }

    }
}
