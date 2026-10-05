abstract class Parent{//Abstract is used to put a initial standard.
    public Parent(){
        System.out.println("Mai Parent ka Constructor hoon.");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}
public class Abstract {
    public static void main(String[] args) {
        // Parent p = new Parent();// This is Abstract. Can not be instantiated as Object. 
        child c = new child();
        System.out.println(c);
        
    }
}
