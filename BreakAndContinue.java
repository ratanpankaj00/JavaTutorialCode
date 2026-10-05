public class BreakAndContinue {
    public static void main(String[] args) {
        int i=0;
        // for(i=0;i!=5;i++){
        //     if (i==3){
        //         System.out.println("Exiting the loop.");
        //         continue;
        //     }
        //     System.out.println("Java is Great.");
        //     System.out.println(i);
        // }


        while(i<=50){
            i=++i;
            if (i==5) {
                System.out.println("Ending the line.");
                continue;
            }
            System.out.println("("+i+")Java is Great.");
        }
    }
}
