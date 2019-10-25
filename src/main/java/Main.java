import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many dice do you want to roll?\n");
        int numberOfDice = scanner.nextInt();

        System.out.println("HAHA! Joke's on you! I haven't programmed in that option yet!\n" +
                "You're rolling 2!");
        System.out.println("How many times do you want to roll the dice\nDon't worry. You do have options here!");
        int numberOfRolls = scanner.nextInt();


        Map<Integer, Integer> resultMap = Simulation.diceRollSimulator(2,numberOfRolls);

        for(Integer unpack : resultMap.keySet()){
            System.out.println(unpack + " : " + resultMap.get(unpack) + " : " +
                    String.format("%.2f",(double)resultMap.get(unpack)/numberOfRolls) + " : ");
            for(int i = 0; i <= ((resultMap.get(unpack)/numberOfRolls) * 100) ; i++){
                System.out.println("*");
            }
    }
}
}