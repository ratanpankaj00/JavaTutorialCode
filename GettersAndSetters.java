class MyMainEmployee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int n) {
        id = n;
    }

}

public class GettersAndSetters {
    public static void main(String[] args) {
        MyMainEmployee aman = new MyMainEmployee();
        aman.setName("Aman Gupta");
        aman.setId(216);

        MyMainEmployee deepak = new MyMainEmployee();
        deepak.setName("Deepak Sukla");
        deepak.setId(125);

        System.out.println(aman.getId());
    }
}
