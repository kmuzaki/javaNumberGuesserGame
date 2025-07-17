import java.util.*;
import java.lang.Math;

public class App {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String hint;
        int chances = 5;
        int attempts = 0;
        int num = random.nextInt(101);
        int numInput;
        boolean gameFlag = false;

        System.out.println("I'm thinking of number between 1 and 100");
        System.out.println("You have 5 chances");
        while (gameFlag == false) {
            numInput = input.nextInt();
            if (numInput == num) {
                attempts = attempts + 1;
                System.out.print("Correct! You guessed the correct number in ");
                System.out.print(attempts);
                System.out.println(" attempts.");
                gameFlag = true;
            } else {
                chances = chances - 1;
                if (chances == 0) {
                    System.out.print("Game ended! The answer is ");
                    System.out.println(num);
                    gameFlag = true;
                } else {
                    if (num > numInput) {
                        hint = "greater than";
                    } else {
                        hint = "less than";
                    }
                    System.out.print("Wrong answer! Try Again. You have ");
                    System.out.print(chances);
                    System.out.println(" chance(s) left.");
                    System.out.print("The number is ");
                    System.out.print(hint);
                    System.out.print(" ");
                    System.out.println(numInput);
                    attempts = attempts + 1;
                }
            }
        }
        System.out.println("Game Ended.");
    }
}
