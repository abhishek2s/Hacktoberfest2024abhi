package decodeDsaSkills.arrays;

import java.util.Arrays;

public class SortTheArrayOf0sAnd1s {
    public static void main(String[] args) {

        int [] arr={0,0,0,1,1,1};
        int NoOfZeroes=0;
        int NoOfOnes=0;

//method 1
//        Arrays.sort(arr);





//        method 2  two pass solution
//        for(int i=0;i< arr.length;i++){
//            if(arr[i]==0){
//                NoOfZeroes+=1;
//
//            }
//        }
//        NoOfOnes= arr.length-NoOfZeroes;
//
//        for (int i=0;i<NoOfZeroes;i++){
//            arr[i]=0;
//
//        }
//
//        for (int i=NoOfZeroes;i< arr.length;i++){
//            arr[i]=1;
//
//        }






//method 3 one pass solution
        int n= arr.length;
         int i=0 , j=n-1;


        while(i<j){
            if (arr[i]==0){
                i++;

            }
           else if (arr[j]==1){
                j--;

            }

//            if(i>j){   //kyu ki agr ye if nhi lagaya to ek baar swap or ho jayega lkin array sort ho chuka hai
//                break;
//            }
           else if (arr[i]==1 && arr[j]==0 ){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;


            }

        }





        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();


    }
}
