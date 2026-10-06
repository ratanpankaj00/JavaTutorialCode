package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class AnagramChecker {
    public static boolean ifAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        else{
            char [] arr1 = s1.toCharArray();
            char [] arr2 = s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for(int i = 0; i<arr1.length; i++){
               if(arr1[i] != arr2[i]) return false;
            }
            
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(ifAnagram("listen", "silent"));
        System.out.println(ifAnagram("nagaram", "anagram"));
        System.out.println(ifAnagram("care", "race"));
        System.out.println(ifAnagram("malyalam", "maalyaam"));
        System.out.println(ifAnagram("seven", "eightynine"));
        
    }
}
