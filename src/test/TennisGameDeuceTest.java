import org.junit.Before;
import org.junit.Test;

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
        game.winPoint(game.playerOne);
        // player one should now have the advantage
        assertTrue(game.playerOne.getAdvantage());
        assertFalse(game.playerTwo.getAdvantage());
    }

    @Test
    public void PlayerWhoHasAdvantageWinsPointAndWinsGameTest(){
        game.winPoint(game.playerOne);
        // player one has the advantage
        game.winPoint(game.playerOne);
        // player one should now win the game
        assertTrue(game.playerOne.isWinGame());
        assertFalse(game.playerTwo.isWinGame());
    }

    @Test
    public void PlayerWhoHasAdvantageLoosesPointScoreIsDeuceTest(){
        game.winPoint(game.playerTwo);
        // player two has the advantage
        game.winPoint(game.playerOne);
        // player two lost the point, the game should be DEUCE
        assertTrue(game.isDeuce());
        assertFalse(game.playerOne.getAdvantage());
    }

}
