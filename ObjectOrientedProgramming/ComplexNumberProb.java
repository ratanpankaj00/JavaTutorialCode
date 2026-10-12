package ObjectOrientedProgramming;

class ComplexNumber{
    int x;
    int y;
    //constructor;
    //Print;
    //add;
    //Multiply;
    ComplexNumber(int x, int y){
        this.x = x;
        this.y = y;
    }
    void Print(){
        if(y>=0)System.out.println(x+ " + " + y + "i ");
        if(y<0)System.out.println(x+ " - " + (-y) + "i ");
    }
    void add(ComplexNumber z2){
        this.x += z2.x;
        this.y += z2.y;
    }
    void Multiply(ComplexNumber z2){
        int c = this.x;
        this.x = z2.x*this.x - (this.y * z2.y);
        this.y = z2.x*this.y + (c * z2.y);
    }


}

public class ComplexNumberProb {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(4, -5);
        ComplexNumber c2 = new ComplexNumber(3, -9);
        //c1.add(c2);
        //c1.Print();
        c1.Multiply(c2);
        c1.Print();
    }
}
