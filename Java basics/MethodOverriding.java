class A {
    public int m1() {
        return 4;
    }

    public void m2() {
        System.out.println("I am in Method 2 of classs A.");
    }
}

class B extends A {
    
    @Override
    public void m2() {
        System.out.println("I am in Method 2 of classs B.");
    }
    public void m3() {
        System.out.println("I am in Method 3 of classs B.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.m2();

        B b = new B();
        b.m2();
    }
}
