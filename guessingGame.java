import java.util.Scanner;
import java.util.Random;

public class guessingGame {

    // creating a function to start the game.
    public static void start() {
        Scanner keyboardInput = new Scanner(System.in);
        Random random = new Random();

        // declaring variables.
        int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100.
        int numberOfAttempts = 0;
        int guessedNumber;

        System.out.println("\nWelcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!\n");

        // using a do-while loop for guessing the number.
        do {
            System.out.print("Enter your guess: ");
            guessedNumber = keyboardInput.nextInt(); // taking input
            numberOfAttempts++;

            if (guessedNumber < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guessedNumber > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number!");
                System.out.println("Number of attempts = " + numberOfAttempts);
            }
        } while (guessedNumber != randomNumber);

        keyboardInput.close();
    }

    public static void main(String[] args) {
        start();
    }
}
