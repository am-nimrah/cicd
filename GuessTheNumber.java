import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        // Initialize variables
        int guessCount = 0;
        boolean isGuessed = false;

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Start the game loop
        while (!isGuessed) {
            guessCount++;

            // Prompt the user for a guess
            System.out.print("Guess the number (1-100): ");
            int userGuess = scanner.nextInt();

            // Check the guess
            if (userGuess == secretNumber) {
                isGuessed = true;
            } else if (userGuess < secretNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }

        // Game over message
        scanner.close();
        System.out.println("Congratulations! You guessed the number in " + guessCount + " tries.");
    }
}
