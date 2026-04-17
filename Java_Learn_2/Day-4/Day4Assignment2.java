import java.util.*;
public class Day4Assignment2 {
    public static void main(String[]args){
        int position = 0;
        int diceCount = 0;
        Random rand = new Random();
        while (position != 100) {
            int dice = rand.nextInt(6) + 1;
            int option = rand.nextInt(3);
            diceCount++;
            System.out.println("Dice Rolled: " + dice);

            switch (option) {
                case 0:
                    System.out.println("No Play");
                    break;
                case 1:
                    System.out.println("Ladder");
                    position += dice;
                    break;
                case 2:
                    System.out.println("Snake");
                    position -= dice;
                    break;
            }
            if (position < 0) {
                position = 0;
            }
            if (position > 100) {
                position -= dice;
            }
            System.out.println("Current Position: " + position);
        }
        System.out.println("🎉 Reached 100!");
        System.out.println("Total Dice Rolled: " + diceCount);
    }
}
