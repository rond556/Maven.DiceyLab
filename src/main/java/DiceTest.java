import org.junit.Test;
import java.util.Map;
import java.util.TreeMap;
import static org.junit.Assert.*;


public class DiceTest {


    @Test
    public void rollDiceTest() {
        Dice dice = new Dice();
        int expected = dice.rollDice();
        assert(expected >= 1 && expected <= 6);
    }

}