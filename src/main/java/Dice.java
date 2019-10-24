import  java.util.Random;

public class Dice {


    static Integer rollDice(){
        Random r = new Random();
        return r.nextInt(6) + 1;
    }




}
