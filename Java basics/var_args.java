public class var_args {

    // static int sum(int a, int b){
    //     return a + b;
    // }
    // static int sum(int a, int b, int c){
    //     return a + b + c;
    // }
    // static int sum(int a, int b, int c, int d){
    //     return a + b + c + d;
    // }

    //OR OR OR OR OR OR OR OR OR OR OR OR OR OR OR 


    public static int sum(int ...arr){
        int s = 0;
        for (int element : arr) {
            s = s + element;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to VarArgs Tutorials");
        System.out.println("The sum of 3, 5,7,98,45,and 8 is: " +  sum(3,5,7,98,45,8));
        System.out.println(sum());
    }

}
