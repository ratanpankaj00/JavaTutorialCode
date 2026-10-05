package MultiDimentionalArray;
import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a  = new ArrayList<>();
        a.add(2);
        a.add(4);
        a.add(6);
        a.add(8);
        ArrayList<Integer> b  = new ArrayList<>();
        b.add(2);
        b.add(3);
        b.add(5);
        b.add(7);
        b.add(11);
        ArrayList<Integer> c  = new ArrayList<>();
        c.add(10);
        c.add(12);
        c.add(1);
        
        
        // Declaration of 2D array.
        ArrayList <ArrayList <Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);
        System.out.println(arr);

        //Printing an 2D ArrayList.
        for(ArrayList<Integer> list : arr){
            for(int element : list){
                System.out.print(element + " ");
            }System.out.println();
        }
    }
}
