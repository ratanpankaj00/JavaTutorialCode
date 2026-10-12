package CyclicSort;
import java.util.List;
import java.util.ArrayList;
public class DuplicateElementsInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 7, 7, 7 };
        showDuplicates(arr);
        System.out.println(showDuplicates(arr));
    }

    private static List<Integer> showDuplicates(int[] arr) {
        int i = 0;
        List<Integer> duplicates = new ArrayList<>();
        while(i<arr.length){
            if(arr[i] == i+1) i++;
            else if(arr[i] == arr[arr[i] -1]) {
                if(!duplicates.contains(arr[i]))duplicates.add(arr[i]);
                i++;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
            }
        }return duplicates;
    }
}
