import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TennisGameDeuceTest {
    private TennisGame game;

    @Before
    public void createTennisNewGame(){
        game = new TennisGame();
        for(int i=0;i<3;i++){
            game.winPoint(game.playerOne);
            game.winPoint(game.playerTwo);
        }
    }

    @Test
    public void TwoPlayersReachFortyDeuceIsActivatedTest(){
        assertTrue(game.isDeuce());
    }

    @Test
    public void ScoreIsDeucePlayerWhoWinsPointTakesAdvantageTest(){
        assertTrue(game.isDeuce());
        game.winPoint(game.playerOne);
        assertTrue(game.playerOne.getAdvantage());
        assertFalse(game.playerTwo.getAdvantage());
    }

}
