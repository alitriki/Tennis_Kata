import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
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

}
