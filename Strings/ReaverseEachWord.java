package Strings;

public class ReaverseEachWord {
    public static StringBuilder reverseEachWord(String s) {
        int i = 0, j = 0;
        StringBuilder ans = new StringBuilder();
        while (i < s.length() && j < s.length() && j >= 0 && i >= 0) {
            j = s.indexOf(" ", i);
            if (j == -1) {
                for (int k = s.length() - 1; k > s.lastIndexOf(" "); k--) {
                    ans.append(s.charAt(k));
                }
                break;
            }

            for (int k = j - 1; k >= i; k--) {
                ans.append(s.charAt(k));
            }
            ans.append(" ");
            i = j + 1;
            j = i;
        }
        // ans.delete(0, 0);
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("My name is Shashi"));
    }
}
