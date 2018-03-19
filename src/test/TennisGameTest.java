import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisGameTest {
    private TennisGame game;

    @Before
    public void createTennisNewGame(){
        game = new TennisGame();
    }

    @Test
    public void gameStartsWithScoreOfZeroForEachPlayerTest(){
        int value1 = game.playerOne.getScore();
        int value2 = game.playerTwo.getScore();
        assertEquals(0,value1);
        assertEquals(0,value2);
    }

    @Test
    public void PlayerWithScoreZeroWinsPointTest(){
        game.playerOne.winPoint();
        int newScore = game.playerOne.getScore();
        assertEquals(15,newScore);
    }

}
