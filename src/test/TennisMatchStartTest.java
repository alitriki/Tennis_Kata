import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TennisMatchStartTest {

    private TennisGame game;

    @Before
    public void createTennisNewGame(){
        game = new TennisGame();
    }

    @Test
    public void MatchStartsWithSetScoreOfZeroForEachPlayerTest(){
        int value1 = game.playerOne.getSetScore();
        int value2 = game.playerTwo.getSetScore();
        assertEquals(0,value1);
        assertEquals(0,value2);
    }

    @Test
    public void PlayerWithSetScoreZeroWinsGameTest(){
        game.winGame(game.playerOne);
        int newSetScore = game.playerOne.getSetScore();
        assertEquals(1,newSetScore);
    }

    @Test
    public void PlayerWithSetScoreOneWinsGameTest(){
        game.winGame(game.playerOne);
        game.winGame(game.playerOne);
        int newSetScore = game.playerOne.getSetScore();
        assertEquals(2,newSetScore);
    }

    @Test
    public void PlayerWithSetScoreFiveWinsGameAndSetTest(){
        for(int i=0; i<=5; i++){
            game.winGame(game.playerOne);
        }
        /*Player one reaches set score of 6 & player two has set score of 0
        Player one should win the set*/
        assertTrue(game.playerOne.isWinSet());
    }

}
