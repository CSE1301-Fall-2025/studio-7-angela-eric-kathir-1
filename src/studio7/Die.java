import static java.lang.Math.random;
public class Die {
    public static int randomDiceValue(int numberOfSides){
            double randomValue = (Math.random() * numberOfSides) + 1;
            int random = (int)randomValue;
            return random;
        }
    public static void main(String args[]){
        System.out.println(randomDiceValue(20));
    }
}
