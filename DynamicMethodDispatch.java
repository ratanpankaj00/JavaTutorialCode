class Phone{
    public void on(){
        System.out.println("Turning on Phone...");
    }
    public void greet(){
        System.out.println("Good Morning");
    }
}

class SmartPhone extends Phone{
    @Override
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
    public void swagat(){
        System.out.println("Aapka swagat hai");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new Phone(); //Allowed
        SmartPhone smobj = new SmartPhone(); //Allowed
        // obj.name();
        // Here Phone is Reference and SmartPhone is Object
        Phone obj2 = new SmartPhone(); // Yes It is alllowed.(SuperClass is Phone and SubClass is SmartPhone.)
        // SmartPhone smobj = new Phone(); // This is not allowed.(We are making SuperClass as SmartPhone and SubClass as Phone which is wrong.)
        obj2.on();//SmartPhone will be turned on, not phone.(This is called Dynamic method dispatch.)
        // obj2.swagat();//Can not run.
        obj2.greet();
    }
}
