package Strings;

import java.util.Arrays;

public class MostFrequentCharacter {
    public static char mostFrequentCharacter_M1(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int charInd = 0;
        int maxfreq = 0;
        int i = 0, k = 0;
        while (i < arr.length) {
            int j = 1;
            for (k = i; k < arr.length - 1; k++) {
                if (arr[k] == arr[k + 1]) {
                    j++;
                } else
                    break;
            }
            if (maxfreq < j) {
                maxfreq = j;
                charInd = i;
            }
            i = k + 1;
        }
        return arr[charInd];

    }

    public static char mostFrequentCharacter_M3(String s) {
        int[] freqarr = new int[26];
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            freqarr[arr[i] - 97] = 1 + freqarr[arr[i] - 97];
        }
        int maxfreq = -1;
        int ind = -1;
        for (int i = 0; i < freqarr.length; i++) {
            if (freqarr[i] > maxfreq) {
                maxfreq = freqarr[i];
                ind = i;
            }
        }
        return (char) (ind + 97);

    }

    public static void main(String[] args) {
        // {a,a,n,r,t}
        System.out.println(mostFrequentCharacter_M1("malayyyysia"));
        System.out.println(mostFrequentCharacter_M1("committtee"));
        System.out.println(mostFrequentCharacter_M1("rangilla"));

    }
}
