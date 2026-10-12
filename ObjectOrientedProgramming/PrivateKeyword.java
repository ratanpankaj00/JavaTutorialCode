package ObjectOrientedProgramming;

class Students{
    // ENCAPSULATION

    String name = "NAME_HERE";
    private int rno = 21;
    double cgpa;
    void print(){ // getter
        System.out.println(name + " " + cgpa + " " + rno);
    }
    int getRno(){
        return rno;
    }
    void setRno(int x){ //Setter
        rno = x;
    }

}
public class PrivateKeyword {

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Hemant";
        s1.cgpa = 8.9;
        //s1.rno = 76;
        s1.print();
        s1.setRno(21);
        System.out.println(s1.getRno());

    }
}
