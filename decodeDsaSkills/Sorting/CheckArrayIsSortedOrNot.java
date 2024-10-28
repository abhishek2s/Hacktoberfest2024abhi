package decodeDsaSkills.Sorting;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int arr[]={1,8,6,9,5,74};
        int n=arr.length;
        boolean flag=true;
        for (int i=0; i<n-1;i++){
            if (arr[i]>arr[i+1]){
                flag=false;
                System.out.println("unsorted");
                break;



            }

        }

        if (flag==true)
            System.out.println("sorted");




    }
}
