package decodeDsaSkills.arrays;

public class NextGreatestElement {
    public static void main(String[] args) {
        int [] arr={12,8,60,37,2,49,16,28,21};
        int n= arr.length;


//        optimised code
//        for brute code nested for loop use krna padega

        int []ans=new int[n];  //new array for the answer
        ans[n-1]=-1;

        int currentmax=arr[n-1];
        for (int i=n-2;i>=0;i--){
            ans[i]=currentmax;
            currentmax=Math.max(currentmax,arr[i]);



        }
        for (int ele: ans){
            System.out.print(ele+" ");
        }
    }
}
