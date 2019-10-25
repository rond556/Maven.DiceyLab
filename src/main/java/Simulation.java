import java.util.Map;
import java.util.TreeMap;

public class Simulation {


    static Map diceRollSimulator(Integer numberOfDice, Integer numberOfRolls) {
        TreeMap<Integer, Integer> bin = Bins.createBin(numberOfDice);
        for (int i = 1; i <= numberOfRolls; i++) {
            int roll = 0;
            for (int j = 1; j <= numberOfDice; j++) {
                roll += Dice.rollDice();
            }
            bin.put(roll, bin.get(roll) + 1);
        }
        return bin;
    }
}

