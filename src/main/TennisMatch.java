public class TennisMatch {

    public Player playerOne;
    public Player playerTwo;
    private boolean deuce;
    private boolean tieBreak;

    TennisMatch(){
        playerOne = new Player();
        playerTwo = new Player();
        deuce = false;
        tieBreak = false;
    }

    public void winPoint(Player player) {
        // get the other player so we can use his score later
        Player otherPlayer = getOtherPlayer(player);

        if(isTieBreak()){
            //if Tie-Break rule is activated the score system changes
            player.setTieBreakScore(player.getTieBreakScore()+1);

            if(player.getTieBreakScore()>6){
                int tieBreakScoreDifference = player.getTieBreakScore() - otherPlayer.getTieBreakScore();
                if(tieBreakScoreDifference >= 2 ){
                    winMatch(player);
                }
            }
        }else{
            // win point has different behavior in regard to current score
            switch (player.getGameScore()){
                case 0:
                    player.setGameScore(15);
                    break;
                case 15:
                    player.setGameScore(30);
                    break;
                case 30:
                    player.setGameScore(40);
                    // if the other player's score is forty then by winning a point the game becomes DEUCE
                    if(otherPlayer.getGameScore() == 40)
                        setDeuce(true);
                    break;
                case 40:
                    // if the other player has the advantage than by winning the point the game is DEUCE
                    if(otherPlayer.getAdvantage()){
                        setDeuce(true);
                        otherPlayer.setAdvantage(false);
                    }
                    // if the game is DEUCE then by winning a point the player has the ADVANTAGE
                    else if(isDeuce()){
                        player.setAdvantage(true);
                        setDeuce(false);
                    }
                    // if the player has the ADVANTAGE or if the other player's score is under 40 then by scoring he wins the game
                    else{
                        winGame(player);
                        player.setAdvantage(false);
                    }
                    break;
            }
        }
    }

    private void winGame(Player player) {
        Player otherPlayer = getOtherPlayer(player);
        player.setWinGame(true);
        // reset scores to zero
        player.setGameScore(0);
        otherPlayer.setGameScore(0);
        // change set scores

        // by winning the game the player's set score increments
        player.setSetScore(player.getSetScore()+1);
        switch (player.getSetScore()){
            case 6:
                // if the player's score is 6 then
                // if the other player's score is under 5 he wins the set
                if(otherPlayer.getSetScore() <= 4){
                    winMatch(player);
                }else if(otherPlayer.getSetScore() == 6){
                    setTieBreak(true);
                }

                break;
            case 7:
                // if the player's score is 7 then he wins the set
                winMatch(player);
                break;
        }

    }

    private void winMatch(Player player) {
        player.setWinSet(true);
        player.setWinMatch(true);
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

    public boolean isTieBreak() {
        return tieBreak;
    }

    private void setTieBreak(boolean tieBreak) {
        this.tieBreak = tieBreak;
    }

}
