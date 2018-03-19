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
        switch (score){
            case 0: setScore(15);
            break;
            case 15: setScore(30);
            break;
            case 30: setScore(40);
            break;
        }
    }
}
