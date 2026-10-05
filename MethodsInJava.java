public class MethodsInJava {
    
    //SYNTAX FOR WRITING A METHOD. METHOD IS A LOGIC PRESENT INSIDE A CLASS. METHOD AND FUNCTIONS CAN BE USED INTERCHANGINGLY.
    int logic(int a, int b){
        //Static method can be called without making object inside the main method.
        int z;
        if (a>b) {
            z = a + b;
        }else{
            z = (a+b)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        //!!!THIS CODE IS NOT FOLLOWING DRY PRINCIPLE. IT IS AAM ZINDGI.*****

        int a = 5;
        int b = 7;
        int c;
        if (a>b) {
            c=a+b;
        }else{
            c= (a+b)*5;
        }
        int a1 = 2;
        int b1 = 1;
        int c1;
        if (a1>b1) {
            c1=a1+b1;
        }else{
            c1= (a1+b1)*5;
        }
        System.out.println(c);
        System.out.println(c1);

        // BY USING METHOD WE CAN DO THE SAME THINGS IN TWO LINES ONLY.*****
        //Method invocation using object creation.
        MethodsInJava logicObj = new MethodsInJava(); //IF METHOD IS USED NOT STATIC THEN IT IS CALLED LIKE THIS.
        System.out.println(logicObj.logic(5, 7));
        System.out.println(logicObj.logic(2, 1));

        
    }
}
