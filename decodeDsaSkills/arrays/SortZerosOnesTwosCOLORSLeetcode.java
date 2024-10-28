package decodeDsaSkills.arrays;

public class SortZerosOnesTwosCOLORSLeetcode {
    public static void main(String[] args) {
        int [] nums={1,2,0,1,0,2,1,1,2,0,1,2,0,1,0,1,0,2,0,1,0,2};




//        method 1 two pass solution
//
//        int totalOnes=0;
//        int totalZeros=0;
//        int totalTwo=0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==0){
//                totalZeros++;
//
//            }
//            else if (nums[i]==1){
//                totalOnes++;
//
//            }
//            else totalTwo++;
//
//        }
//        for(int i=0;i<totalZeros;i++){
//            nums[i]=0;
//
//        }
//        for(int i=totalZeros;i<totalZeros+totalOnes;i++){
//            nums[i]=1;
//
//        }
//        for(int i=totalZeros+totalOnes;i<nums.length;i++){
//            nums[i]=2;
//
//        }




//        method 2 Dutch flag algorithm / one pass solution

        int n= nums.length;
        int mid=0;
        int lo=0;
        int hi=n-1;
        while(mid<hi){
            if (nums[mid]==0){
//                swapping
                int temp=nums[mid];
                nums[mid]=nums[lo];
                nums[lo]=temp;
                lo++;
                mid++;

            }
            else if (nums[mid]==1) {
                mid++;
            }

            else{    // (nums[mid]==2)
//                swapping
                int temp=nums[mid];
                nums[mid]=nums[hi];
                nums[hi]=temp;
                hi--;

            }
        }




        for (int ele:nums){
            System.out.print(ele+" ");
        }
    }
}
