package Strings;

public class PrintAllSubstrings {
    public static void PrintAllSubstrings(String n){
        for (int i = 0; i<n.length(); i++){
            for (int j = i; j<=n.length(); j++){
                System.out.print(n.substring(i,j) + " ");
            }System.out.println();
            }
    }
    public static void main(String[] args) {
        PrintAllSubstrings("Ratan");
    }
}
