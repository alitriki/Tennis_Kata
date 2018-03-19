public class Player {
    private int score;

    public Player() {
        this.score = 0;
    }

    public int getScore() {
        return score;
    }

    private void setScore(int score) {
        this.score = score;
    }

    public void winPoint() {
        setScore(15);
    }
}
