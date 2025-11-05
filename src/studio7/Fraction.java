public class Fraction {
    private double numerator;
    private double denominator;

    public Fraction(double top, double bot){
        double numerator = top;
        double denominator = bot;
    }
    public static void main(String args[]){
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 5);
        double endNumerator = f1.numerator * f2.numerator;
        double endDenominator = f1.denominator* f2.denominator;
        
    }
}