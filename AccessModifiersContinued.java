class C1{
    public int x =5;
    protected int y = 45;
    int z = 6;
    private int a = 78;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
class C2 extends C1{
    public void meth2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        // System.out.println(a); 
    }
}

public class AccessModifiersContinued {
    public static void main (String[] args){
        C1 c = new C1();
        // c.meth1();
        C2 d = new C2();
        d.meth2();
        // System.out.println(c.a); // We can not use private variable in same package.
    }
}
