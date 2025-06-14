import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secretNumber = rand.nextInt(100) + 1; // Random number from 1 to 100
        int guess;
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("❌ You've used all attempts. The number was: " + secretNumber);
        }

        sc.close();
    }
}
