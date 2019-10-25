import org.junit.Test;
import java.util.Map;
import java.util.TreeMap;
import static org.junit.Assert.*;

public class SimulationTest {

    @Test
    public void diceRollSimulator() {
        int roll1;
        int roll2;
        //declare and instantiate the number of rolls
        int sumOfRolls;
        //count the number of rolls
        int rollCounter = 2;
        TreeMap<Integer, Integer> bin = Bins.createBin(2);
        for (int i = 0; i <= 10; i++) {
            roll1 = Dice.rollDice();
            roll2 = Dice.rollDice();
            sumOfRolls = roll1 + roll2;
            bin.put(sumOfRolls, bin.get(sumOfRolls) + 1);
        }
        Map expected = bin;
        Map actual = Simulation.diceRollSimulator(2, 10);

        assertSame(expected, actual);
    }
}