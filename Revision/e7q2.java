package Revision;

class Pattern{
    public static String Pattern(int pNum){
        while(pNum>0){
            System.out.print("* ");
            pNum--;
        }
        System.out.println("");
        return Pattern(pNum -1);
    }

}
public class e7q2 {
    public static void main(String[] args) {
        Pattern.Pattern(5);
    }
}
