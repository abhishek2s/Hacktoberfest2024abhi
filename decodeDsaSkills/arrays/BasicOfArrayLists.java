package decodeDsaSkills.arrays;

import java.util.ArrayList;

public class BasicOfArrayLists {
    public static void main(String[] args) {


        ArrayList<Integer> arr = new ArrayList<>(2);
        arr.add(0, 10); //initialized
        arr.add(1, 25);
        arr.add(2, 35);
        // print all the elements of arraylist
        System.out.println(arr);
        arr.set(2,56);  //modify
        System.out.println(arr.get(2));  // to get or access the element









        //printing arraylist using for lop
//        for (int i=0;i< arr.size();i++){
//            System.out.println(arr.get(i));
//        }


    }
}
