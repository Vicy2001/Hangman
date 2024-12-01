package at.ac.fhcampuswien;

public class Player {
    String name;
    int lives = 10;

    public String getName() {
        return name;
    }

    public int getLives() {
        return lives;
    }

    public void loseLive() {
        lives--;
    }

}
