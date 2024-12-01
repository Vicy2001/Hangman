package at.ac.fhcampuswien;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the word to guess: ");
        String wordToGuess = scanner.nextLine().toLowerCase();

        int wordLength = wordToGuess.length();
        char[] progress = new char[wordLength];

        Arrays.fill(progress, '_');

        int lives = 6;

        System.out.println("#######################");
        System.out.println("#######################");
        System.out.println("Welcome to Hangman, " + name);
        System.out.println("#######################");
        System.out.println("#######################");

        while (lives > 0) {
            System.out.print("Current progress: ");
            for (char c : progress) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Enter a letter: ");
            char guess = scanner.nextLine().toLowerCase().charAt(0);

            if (wordToGuess.contains(String.valueOf(guess))) {
                System.out.println("Correct!");

                for (int i = 0; i < wordLength; i++) {
                    if (wordToGuess.charAt(i) == guess) {
                        progress[i] = guess;
                    }
                }
            } else {
                lives--;
                System.out.println("Wrong! Lives remaining: " + lives);
            }


            if (String.valueOf(progress).equals(wordToGuess)) {
                System.out.println("You guessed the word: " + wordToGuess);
                break;
            }
        }

        if (lives == 0) {
            System.out.println("Game over! The word was: " + wordToGuess);
        }

        scanner.close();
    }
}