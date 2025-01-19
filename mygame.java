import java.util.Scanner;
import java.util.Random;

public class mygame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1; // Generate a number between 1 and 100
        int turns = 5;

        System.out.println("----------------------------");
        System.out.println("        NEW GAME");
        System.out.println("----------------------------");
        System.out.println("Pick a number between 1-100! You will get " + turns + " turns");

        while (turns > 0) {
            System.out.print("\nEnter your guess: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("YOU WIN! The SECRET number was " + secretNumber);
                break;
            } else if (guess < secretNumber) {
                System.out.println("Sorry, that is too low");
            } else {
                System.out.println("Sorry, that number is too high");
            }

            turns--;
            if (turns > 0) {
                System.out.println("Turns left: " + turns);
            } else {
                System.out.println("\nGAME OVER! The SECRET number was " + secretNumber);
            }
        }

        scanner.close();
    }
}
