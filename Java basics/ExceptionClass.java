import java.util.Scanner;

class MyExpception extends Exception {
    @Override
    public String toString() {
        return super.toString() + "I am getString()";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "I am getMessage()";
    }

}

public class ExceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        if (a < 99) {
            try {
                throw new MyExpception();
            // throw new ArithmeticException("This is an exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                // System.out.println("finished");
            }
        }
    }

}
