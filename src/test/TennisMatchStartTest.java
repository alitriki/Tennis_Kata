import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TennisMatchStartTest {

    private TennisMatch game;

    @Before
    public void createTennisNewGame(){
        game = new TennisMatch();
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
    public void PlayerWithSetScoreFiveWinsGameAndSet_OtherPlayerHasSetScoreOfZeroTest(){
        for(int i=0; i<=5; i++){
            game.winGame(game.playerOne);
        }
        /*Player one reaches set score of 6 & player two has set score of 0
        Player one should win the set*/
        assertTrue(game.playerOne.isWinSet());
    }

    @Test
    public void PlayerWithSetScoreFiveWinsGameAndSet_OtherPlayerHasSetScoreOfFourTest(){
        for(int i=0; i<=3; i++){
            game.winGame(game.playerOne);
            game.winGame(game.playerTwo);
        }
        game.winGame(game.playerOne);
        game.winGame(game.playerOne);
        /*Player one reaches set score of 6 & player two has set score of 4
        Player one should win the set*/
        assertTrue(game.playerOne.isWinSet());
    }

    @Test
    public void PlayerReachesSetScoreSix_OtherPlayerHasSetScoreOfFive_SetNotOverYetTest(){
        for(int i=0; i<=4; i++){
            game.winGame(game.playerOne);
            game.winGame(game.playerTwo);
        }
        game.winGame(game.playerOne);
        /*Player one reaches set score of 6 & player two has set score of 5
        The set should not be over yet, an other game must be played*/
        assertFalse(game.playerOne.isWinSet());
        assertFalse(game.playerTwo.isWinSet());
    }

    @Test
    public void PlayerWinsSetWithScoreOfSevenToFiveTest(){
        for(int i=0; i<=4; i++){
            game.winGame(game.playerOne);
            game.winGame(game.playerTwo);
        }
        game.winGame(game.playerOne);
        game.winGame(game.playerOne);
        /*Player one reaches set score of 7 & player two has set score of 5
        Player one should win the set*/
        assertTrue(game.playerOne.isWinSet());
        assertFalse(game.playerTwo.isWinSet());
    }

    @Test
    public void PlayerWinsSetWithScoreOfSevenToSixTest(){
        for(int i=0; i<=5; i++){
            game.winGame(game.playerOne);
            game.winGame(game.playerTwo);
        }
        game.winGame(game.playerOne);
        /*Player one reaches set score of 7 & player two has set score of 6
        Player one should win the set*/
        assertTrue(game.playerOne.isWinSet());
        assertFalse(game.playerTwo.isWinSet());
    }

    @Test
    public void PlayerWinsMatchTest(){
        for(int i=0; i<=5; i++){
            game.winGame(game.playerOne);
        }
        /*Player one reaches set score of 6 he should win the match*/
        assertTrue(game.playerOne.isWinMatch());
        assertFalse(game.playerTwo.isWinMatch());
    }
}
