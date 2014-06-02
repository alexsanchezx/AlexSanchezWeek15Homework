import java.util.Random;

public class Dice {
    static Random random = new Random();//instantiates object random from Random Class
    public Dice(){//Constructor for class Dice

 }

public static int Throw(){ // Int method that returns a  number between 1-6 like a dice
  return random.nextInt(6)+1;//using the nextInt Method
 }
}