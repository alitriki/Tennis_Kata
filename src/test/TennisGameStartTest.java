import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TennisGameStartTest {
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
        game.winPoint(game.playerOne);
        int newScore = game.playerOne.getScore();
        assertEquals(15,newScore);
    }

    @Test
    public void PlayerWithScoreFifteenWinsPointTest(){
        game.winPoint(game.playerOne);
        game.winPoint(game.playerOne);
        int newScore = game.playerOne.getScore();
        assertEquals(30,newScore);
    }

    @Test
    public void PlayerWithScoreThirtyWinsPointTest(){
        game.winPoint(game.playerOne);
        game.winPoint(game.playerOne);
        game.winPoint(game.playerOne);
        int newScore = game.playerOne.getScore();
        assertEquals(40,newScore);
    }

    @Test
    public void PlayerWithScoreFortyWinsPointTest(){
        game.winPoint(game.playerOne);
        game.winPoint(game.playerOne);
        game.winPoint(game.playerOne);
        game.winPoint(game.playerOne);
        assertTrue(game.playerOne.isWinGame());
    }

    @Test
    public void getOtherPlayerTest(){
        Player otherPlayer = game.getOtherPlayer(game.playerOne);
        assertEquals(game.playerTwo, otherPlayer);
        otherPlayer = game.getOtherPlayer(game.playerTwo);
        assertEquals(game.playerOne, otherPlayer);
    }
}
