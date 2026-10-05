interface Bicycle {
    final int a = 45;

    void applyBrake(int decrement);

    void speedUp(int increament);
}

interface HornBicycle {
    void blowhornk3g();

    void blowhornmhn();
}

class AvonCycle implements Bicycle, HornBicycle {
    void BlowHorn() {
        System.out.println("Pii Pii ...");
    }

    public void applyBrake(int decrement) {
        System.out.println("Applying brake");
    }

    public void speedUp(int decrement) {
        System.out.println("Speeding Up");
    }

    public void blowhornk3g() {
        System.out.println("Kabhi Khushi Kabhi Gum...");
    }

    public void blowhornmhn() {
        System.out.println("Mai hoon n ...");
    }
}

public class interfaces {
    public static void main(String[] args) {
        AvonCycle rtn = new AvonCycle();
        rtn.BlowHorn();
        rtn.blowhornk3g();
        System.out.println(rtn.a);
    }
}
