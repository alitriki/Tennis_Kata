public class Player {
    private int score;
    private boolean winGame;

    Player() {
        this.score = 0;
        winGame = false;
    }

    public int getScore() {
        return score;
    }

    private void setScore(int score) {
        this.score = score;
    }

    public boolean isWinGame() {
        return winGame;
    }

    private void setWinGame(boolean winGame) {
        this.winGame = winGame;
    }

    public void winPoint() {
        switch (score){
            case 0: setScore(15);
            break;
            case 15: setScore(30);
            break;
            case 30: setScore(40);
            break;
            case 40: winGame();
            break;
        }
    }

    private void winGame() {
        winGame = true;
    }
}
