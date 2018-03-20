public class Player {
    private int gameScore;
    private boolean winGame;
    private boolean advantage;
    private int setScore;
    private boolean winSet;
    private boolean winMatch;
    private int tieBreakScore;

    Player() {
        gameScore = 0;
        winGame = false;
        advantage = false;
        setScore = 0;
        winSet = false;
        winMatch = false;
        tieBreakScore = 0;
    }

    public int getGameScore() {
        return gameScore;
    }

    public void setGameScore(int gameScore) {
        this.gameScore = gameScore;
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

    public boolean isWinMatch() {
        return winMatch;
    }

    public void setWinMatch(boolean winMatch) {
        this.winMatch = winMatch;
    }

    public int getTieBreakScore() {
        return tieBreakScore;
    }

    public void setTieBreakScore(int tieBreakScore) {
        this.tieBreakScore = tieBreakScore;
    }
}
