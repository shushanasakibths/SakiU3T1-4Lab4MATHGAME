
public class Player {


    private String name;
    private int score;
    private int winStreak;


    public Player(String name) {
        this.name = name;
        score = 0;
    }


    public int getScore() {
        return score;
    }


    int getStreak() {
        return winStreak;
    }


    public String getName() {
        return name;
    }


    public void incrementScore() {
        score++;
    }


    public void reset() {
        score = 0;
    }


    public void resetStreak() {
        winStreak = 0;
    }


    public void winStreak() {
        winStreak++;
    }
}
