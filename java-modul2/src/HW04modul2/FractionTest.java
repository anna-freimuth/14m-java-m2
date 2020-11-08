package HW04modul2;

public class FractionTest {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(10);
        System.out.println(fr1);
        Fraction fr2 = new Fraction(3, 5);
        System.out.println(fr2);
        System.out.println(fr2.getDenominator());

        Fraction a = new Fraction(3, 4);
        Fraction b = new Fraction(5, 7);
        Fraction c = Fraction.sum(a, b);
        System.out.println(c);

        System.out.println(a.equals(b));

        System.out.println("--------------");
        Fraction x = new Fraction(5, 8);
        Fraction y = new Fraction(7, 9);

        //Fraction z =  x.sum(y);
        x.sum(y);
        //System.out.println(z);
        System.out.println(x);
    }
}
