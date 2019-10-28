import java.util.Map;
import java.util.TreeMap;

public class Simulation {


    Map diceRollSimulator(Integer numberOfDice, Integer numberOfRolls) {
        Dice dice = new Dice();
        TreeMap<Integer, Integer> bin = Bins.createBin(numberOfDice);
        for (int i = 1; i <= numberOfRolls; i++) {
            int roll = 0;
            for (int j = 1; j <= numberOfDice; j++) {
                roll += dice.rollDice();
            }
            bin.put(roll, bin.get(roll) + 1);
        }
        return bin;
    }
}

