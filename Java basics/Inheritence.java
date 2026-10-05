class Base {
        public int x;

        public int getx() {
            return x;
        }

        public void setx(int x) {
            System.out.println("I am in base and setting x now.");
            this.x = x;
        }

        public void printMe() {
            System.out.println("I am a Constructor");
        }
    }

    class Derived extends Base{
        public int y;

        public void sety(int y){
            this.y = y;
            System.out.println("I am in Derived now and setting y now.");
        }

        public int gety(){
            return y;
        }
    }
public class Inheritence {
    

    public static void main(String[] args) {
        // Creating an object of base class.
        Base b = new Base();
        b.setx(4);
        System.out.println(b.getx());

        // Creating an object of detrived class.
        Derived d = new Derived();
        d.setx(43);
        System.out.println(d.getx());
        d.sety(5);
        System.out.println(d.gety());

    }
}
