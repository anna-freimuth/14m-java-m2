package HW04modul2;

public class Fraction {
    private int numerator;
    private int denominator;

    Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction sum(Fraction fraction) {
        Fraction result = sum(fraction, this);
        this.denominator = result.denominator;
        this.numerator = result.numerator;
        return this;

    }

    public static Fraction sum(Fraction a, Fraction b) {
        int cDenominator = FractionMath.LeastCommonMultiple(a.denominator, b.denominator);
        int cNumerator = a.numerator * (cDenominator / a.denominator)
                + b.numerator * (cDenominator / b.denominator);

        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }


    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

}

class FractionMath {
    static int LeastCommonMultiple(int a, int b) {
        return a * b / GreatestCommonDivisor(a, b);
    }

    static int  GreatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GreatestCommonDivisor(b, a % b);
    }
}
