import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many dice do you want to roll?");
        int numberOfDice = scanner.nextInt();
        System.out.println("How many times do you want to roll the dice.");
        int numberOfRolls = scanner.nextInt();
        if(numberOfRolls > 4000000){
            System.out.println("WHOA! Easy there, tiger! Let's cap you off at 4 million");
            numberOfRolls = 4000000;
        }


        Map<Integer, Integer> resultMap = Simulation.diceRollSimulator(numberOfDice,numberOfRolls);

        for(Integer rollResults : resultMap.keySet()){
            double decimalResult = (double)resultMap.get(rollResults)/numberOfRolls;
            sb.append(String.format("%" + 3 + "s", (rollResults)) + " :");
            sb.append(String.format("%" + 8 + "s", resultMap.get(rollResults)) + " :");
            sb.append(String.format("%" + 7 + "s", String.format("%.2f", decimalResult) + " : "));
            for(int i = 0; i <= (decimalResult * 100) ; i++){
                sb.append("*");
            }
            System.out.println(sb);
            sb.setLength(0);
    }
}
}