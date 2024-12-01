package at.ac.fhcampuswien;

public class Hangman {
    String wordToGuess;
    String currentProgress;
    Player player;

    public Hangman (String wordToGuess, Player player) {
        this.wordToGuess = wordToGuess;
        this.currentProgress = "_".repeat(wordToGuess.length());
        this.player = player;
    }
    public char guessLetter(char letter) {
        return letter;
    }
    public String getCurrentProgress() {
        return currentProgress;
    }

    public boolean isGameWon() {
        return currentProgress.equals(wordToGuess);
    }

    public boolean isGameOver() {
        return player.getLives() <= 0;
    }

}
