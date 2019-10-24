import java.util.TreeMap;

public class Bins {


    public static TreeMap<Integer, Integer> createBin(Integer numberOfDice){
        TreeMap<Integer, Integer> bin = new TreeMap<Integer, Integer>();
        for(int i = numberOfDice; i <= numberOfDice * 6; i++){
            bin.put(i,0);
        }
        return bin;
    }
}
