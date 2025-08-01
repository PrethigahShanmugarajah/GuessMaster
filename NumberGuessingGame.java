import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        int userGuess = 0;
        int numberOfGuesses = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess what it is?");

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfGuesses++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number.");
                System.out.println("It took you " + numberOfGuesses + " guesses.");
            }
        }
        scanner.close();
    }
}
