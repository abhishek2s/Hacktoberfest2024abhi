package decodeDsaSkills.arrays;

public class RotateTheArray {



    public static void reverse(int[] nums,int i,int j){
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;

        }
    }
    public static void main(String[] args) {
        int[] nums={40,85,74,65,48,86};
        int n= nums.length;


//        reverse(nums,0,n-k-1);
//        reverse(nums,n-k,n-1);
//        reverse(nums,0,n-1);
//
//        System.out.println(nums);

    }
}

//samj nhi aaya ye topic --> rotate the array

