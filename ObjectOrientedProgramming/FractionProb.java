package ObjectOrientedProgramming;

class Fraction {
    int num;
    int den;

    Fraction(int num, int den) {
        this.num = num;
        this.den = den;
        simplify();

    }

    void print() {
        System.out.println(num + "/" + den);
    }

    void add(Fraction f) {
        int temp = this.den;
        this.den = f.den * this.den;
        this.num = temp * f.num + this.num * f.den;
        simplify();
    }

    void simplify() {
        int hcf = 1;
        int x = Math.min(num, den);
        int y = Math.max(den, num);
        Boolean b = true;
        while (b) {
            if (y % x != 0) {
                int temp = x;
                x = y % x;
                y = temp;
            } else {
                hcf = x;
                b = false;
            }
        }
        //System.out.println(hcf);
        this.num = this.num/hcf;
        this.den = this.den/hcf;

    }
}

public class FractionProb {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(11, 3);
        Fraction f2 = new Fraction(1, 6);
        f1.add(f2);
        f1.print();

    }
}
