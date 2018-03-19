import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    public void PlayerWithScoreZeroWinsGameTest(){
        game.winGame(game.playerOne);
        int newSetScore = game.playerOne.getSetScore();
        assertEquals(1,newSetScore);
    }

}
