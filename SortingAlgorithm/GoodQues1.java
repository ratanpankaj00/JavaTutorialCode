package SortingAlgorithm;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class GoodQues1 {

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int[] a = { 8,8,6,6,1 };
        int[] b = { 2,1,7,5,3,1};

        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < b.length; j++) {
        //         if (a[i] == b[j]) {
        //             arrList.add(a[i]);
        //             b[j] = Integer.MAX_VALUE; 
        //             break;
        //         }

        //     }
        // }
        // Collections.sort(arrList);
        // System.out.println(arrList);
        // // return arrList;
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j=0;
        arrList.contains(a[0]);
                
        while(i<a.length && j<b.length){
            if(a[i] == b[j]){
                arrList.add(a[i]);
                i++;j++;
            }
            else if(a[i] > b[j]) j++;
            else i++;
        }
        System.out.println(arrList);
   
   
   
   
   
   
    }

}
