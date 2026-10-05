class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int a){
        id = a;
    }
    public int getId(){
        return id;
    }

}

public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        // harry.id = 02;
        // harry.name = "Code With Harry"; ---> Throws an error due to private access modifiers.
        // ***Private Access Modifiers can be accessed through methods. for example: - 

        harry.setId(02);
        System.out.print(harry.getId()+" ");
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());



    }
}
