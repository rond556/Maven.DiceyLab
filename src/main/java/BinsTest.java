import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void createBin() {
        TreeMap<Integer, Integer> bin = new TreeMap<Integer, Integer>();
        for(int i = 2; i <= 2 * 6; i++){
            bin.put(i,0);

        }
        Map expected = bin;
        Map actual = Bins.createBin(2);
        assertSame(expected, actual);
    }
}