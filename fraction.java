package OOPs;

public class fraction {

    private int num;
    private int den;

    public void setNumerator(int n) {
        this.num = n;
        simplify();
    }

    public void setDenominator(int d) {
        if (d == 0) {
            return;

        }
        this.den = d;
        simplify();

    }

    public int getNumerator() {
        return num;
    }

    public int getDenominator() {
        return den;
    }

    public fraction(int num, int den) {
        this.num = num;
        if (den == 0) {
            //
        }
        this.den = den;
        simplify();
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(num, den);
        for (int i = 2; i <= smaller; i++) {
            if (num % i == 0 && den % i == 0) {
                gcd = i;
            }
        }
        num = num / gcd;
        den = den / gcd;
    }

    public void print() {
        if (den == 1) {
            System.out.println(num);
        } else {
            System.out.println(num + "/" + den);
        }
    }

    public void add(fraction f2) {
        this.num = this.num * f2.den + this.den * f2.num;
        this.den = this.den * f2.den;
        simplify();
    }

    public void multiply(fraction f2) {
        this.num = this.num * f2.num;
        this.den = this.den * f2.den;
        simplify();
    }

    public static fraction add(fraction f1, fraction f3) {
        int newNum = f1.num * f3.den + f3.num * f1.den;
        int newDen = f1.den * f3.den;
        fraction f = new fraction(newNum, newDen);
        return f;

    }
}
