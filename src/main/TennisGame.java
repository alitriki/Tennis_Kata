public class TennisGame {
    public Player playerOne;
    public Player playerTwo;
    private boolean deuce;
    TennisGame(){
        playerOne = new Player();
        playerTwo = new Player();
        deuce = false;
    }

    public void winPoint(Player player) {
        switch (player.getScore()){
            case 0:
                player.setScore(15);
                break;
            case 15:
                player.setScore(30);
                break;
            case 30:
                player.setScore(40);
                // if the other player's score is forty then by winning a point the game becomes DEUCE
                Player otherPlayer = getOtherPlayer(player);
                if(otherPlayer.getScore() == 40)
                    setDeuce(true);
                break;
            case 40:
                // if the game is DEUCE then by winning a point the player has the ADVANTAGE
                if(isDeuce()){
                    player.setAdvantage(true);
                    setDeuce(false);
                }
                // if the player has the ADVANTAGE or if the other player's score is under 40 then by scoring he wins the game
                else
                    winGame(player);
                break;
        }
    }

    private void winGame(Player player) {
        player.setWinGame(true);
    }

    public boolean isDeuce() {
        return deuce;
    }

    private void setDeuce(boolean deuce) {
        this.deuce = deuce;
    }

    public Player getOtherPlayer(Player player) {
        if(player.hashCode()== playerOne.hashCode())
            return playerTwo;
        return playerOne;
    }
}
