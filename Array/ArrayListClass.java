import java.util.ArrayList;
import java.util.Collections;
public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);

        // System.out.println(arr.get(2));//to print the element at index 2
        // arr.set(3, 50);//To change the element at index 3 as 50
        // System.out.println(arr);//To print array.
        // for(int i = 0; i<arr.size(); i++){
        //     System.out.print(arr.get(i) + " ");
        // }

        // 25 21 18 50 10
        arr.add(78); //25 21 18 50 10 78
        arr.add(1,100);//insert element in between.
        // System.out.println(arr);
        arr.remove(arr.size() -1);//Used to remove the element at index specified.
        // System.out.println(arr);
        // arr.clear();// Cleans and removes the whole array.
        // int [] brr = (int[]) arr.clone();//copy the whole array;
        
        
        System.out.println(arr);
        System.out.println(arr.size());


        //Khud se reverse kiya gaya hai.
        int i = 0, j = arr.size()-1;
        while (i<j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;j--;
        }
        System.out.println(arr);


        //java ne reverse kiya hai.
        Collections.reverse(arr);// Swaps the element of array.
        System.out.println(arr);


    }
}
