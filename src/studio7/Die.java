import static java.lang.Math.random;
public class Die {
    public static double randomDiceValue(int numberOfSides){
            double randomValue = (Math.random() * numberOfSides) + 1;
            return randomValue;
        }
    public static void main(String args[]){
        System.out.println(randomDiceValue(3));
    }
}
