class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        this.id = 01;
        this.name = "YourNameHere";
    }
    public String getName(){ return name;}
    public void setName(String n){this.name = n;}
    public int getId(){ return id;}
    public void setId(int n){ this.id = n;}

}

public class Constructors {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee();
        System.out.println(harry.getName());
        System.out.println(harry.getId());
    }
}
