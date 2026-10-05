class base1 {
    base1(){
        System.out.println("I am a constructor.");
    }

    base1(int a){
        System.out.println("I am a overloaded constructor with value of a as: " + a);
    }
    
    
}

class derived1 extends base1{
    derived1(){
        super(0);
        System.out.println("I am a derived class constructor.");
    }
    derived1(int a, int b){
        super(0);
        System.out.println("I am a derived class constructor with value of a and b as "+ a + " & " + b);
    }
    
}

class derived2 extends derived1{
    derived2(){
        super();
        System.out.println("I am a derived of derived class constructor.");
    }
    derived2(int a, int b, int c){
        super(5,6);
        System.out.println("I am a derived of derived class constructor with value of a, b and c as: " + a + ", "+ b + " & " + c);
    }
}

public class ConstructorsInInheritence {
    public static void main(String[] args) {
        derived2 d2= new derived2(12,13,15);
    }
}
