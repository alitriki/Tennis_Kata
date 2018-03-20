public class Player {
    private int score;
    private boolean winGame;
    private boolean advantage;
    private int setScore;
    private boolean winSet;

    Player() {
        score = 0;
        winGame = false;
        advantage = false;
        setScore = 0;
        winSet = false;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isWinGame() {
        return winGame;
    }

    public void setWinGame(boolean winGame) {
        this.winGame = winGame;
    }

    public boolean getAdvantage() {
        return advantage;
    }

    public void setAdvantage(boolean advantage) {
        this.advantage = advantage;
    }

    public int getSetScore() {
        return setScore;
    }

    public void setSetScore(int setScore) {
        this.setScore = setScore;
    }

    public boolean isWinSet() {
        return winSet;
    }

    public void setWinSet(boolean winSet) {
        this.winSet = winSet;
    }
}
