package decodeDsaSkills.arrays;

public class MergeSortedArraysLeetcode {
    public static void main(String[] args) {
        int [] array1={11,33,42,71};
        int [] array2={26,54,69,81};
        int m=array1.length;
        int n= array2.length;
        int [] finalArray=new int[m+n];
        int k=0;
        int j=0;
        int i=0;


        while(i<m && j<n){
            if(array1[i]<=array2[j]){
                finalArray[k]=array1[i];
                i++;
                k++;

            }
            else //(array1[i]>array2[j])
                 {
                finalArray[k]=array2[j];
                j++;
                k++;

            }

        }
         if (i==m){  // now take the elements from array2 only
             while (j<n){
                 finalArray[k]=array2[j];
                 j++;
                 k++;

             }

         }
         if (j==n){     //now take the elements from a only
             while(i<m){
                 finalArray[k]=array1[i];
                 i++;
                 k++;

             }
         }



        for(int a=0;a<m+n;a++){
            if(a<m){
                array1[a]=finalArray[a];                               //esme haam finalarray ka content firse array 1and 2 mi daal rhe hai
            }
            else{
                array2[a-m]=finalArray[a];

            }
        }

        for (int ele : array1){
            System.out.print(ele+" ");
        }








    }
}
