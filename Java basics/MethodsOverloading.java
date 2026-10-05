
public class MethodsOverloading {
    static void tellJoke(){//If we do not want our method to return anything.
        System.out.println("I invented the word\n'Plagarism'");
    } 

    // MethodOverloading: same name of method but different inputs.

    static void foo(){
        System.out.println("Good morning bro.");

    }
    static void foo(int a ){
        System.out.println("Good morning "+ a + " bro");
    }
    static void foo(int a, int b){
        System.out.println("Good morning "+ a +"+"+ b+ "bro");
    }

    /*Difference between Argument and Parameter
    Argument: If we call foo method by assinging some value then it that value is called argument.
    Parameter: here int a and int b are parameters.
    Mnemonic: Arguments are Actual. 
    */

    //Overloading Over.
     
    static void change(int a){
        a = 98;
    }

    static void change(int [] arr){
        arr[0] = 98;
    }

    public static void main(String[] args) {
        //Case 1: Changing the Integer.
        int x = 45;
        change(x);
        System.out.println("The changed x is: " + x);
        //It will not change. First a copy is made then it is passed from the method. The real integer x will not changes.

        //Case 2: Changing an array.
        int[] arr = {72, 34, 76, 96};
        change(arr);
        System.out.println("The changd array element is: "+arr[0]);
        // It will change. Because whole array will not gets copied but only it's reference will gets copied.
        // so original array will be passed though the method.

        
        //Calling foo() method.
        foo();
        foo(200);
        foo (200,300);

    }
}
