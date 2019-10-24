import java.util.Map;
import java.util.TreeMap;

public class Simulation {


    static Map diceRollSimulator(Integer numberOfDice, Integer numberOfRolls) {
        int roll1;
        int roll2;
        //declare and instantiate the number of rolls
        int sumOfRolls;
        //count the number of rolls
        int rollCounter = numberOfDice; //for later when we start going beyond two dice. For now, it equals 2
        TreeMap<Integer, Integer> bin = Bins.createBin(numberOfDice);
            for (int i = 0; i <= numberOfRolls; i++) {
                roll1 = Dice.rollDice();
                roll2 = Dice.rollDice();
                sumOfRolls = roll1 + roll2;
            bin.put(sumOfRolls, bin.get(sumOfRolls) + 1);
            sumOfRolls = 0;
        }
        return bin;
    }
}
