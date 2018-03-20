import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TennisMatchTieBreakTest {

    private TennisMatch game;

    @Before
    public void createTennisNewGame(){
        game = new TennisMatch();
        for(int i=0; i<=5; i++){
            game.winGame(game.playerOne);
            game.winGame(game.playerTwo);
        }
        // the two players reach set score of 6

    }

    @Test
    public void TwoPlayersReachSetScoreOfSixTieBreakRuleActivatedTest(){
        // Tie-Break rule should be activated
        assertTrue(game.isTieBreak());
        assertFalse(game.playerTwo.isWinMatch());
    }

    @Test
    public void MatchStartsWithTieBreakScoreOfZeroForEachPlayerTest(){
        int value1 = game.playerOne.getTieBreakScore();
        int value2 = game.playerTwo.getTieBreakScore();
        assertEquals(0,value1);
        assertEquals(0,value2);
    }

    @Test
    public void PlayerWithTieBreakScoreZeroWinsPointTest(){
        game.winPoint(game.playerOne);
        int newTieBreakScore = game.playerOne.getTieBreakScore();
        assertEquals(1,newTieBreakScore);
    }

    @Test
    public void PlayerWithTieBreakScoreOneWinsPointTest(){
        game.winPoint(game.playerOne);
        game.winPoint(game.playerOne);
        int newTieBreakScore = game.playerOne.getTieBreakScore();
        assertEquals(2,newTieBreakScore);
    }

    @Test
    public void PlayerWinsMatchWithTieBreakScoreOfSevenToZeroTest(){
        for(int i=0; i<7; i++){
            game.winPoint(game.playerOne);
        }
        assertTrue(game.playerOne.isWinMatch());
    }

    @Test
    public void PlayerWinsMatchWithTieBreakScoreOfSevenToFiveTest(){
        for(int i=0; i<5; i++){
            game.winPoint(game.playerOne);
            game.winPoint(game.playerTwo);
        }
        game.winPoint(game.playerOne);
        game.winPoint(game.playerOne);
        assertTrue(game.playerOne.isWinMatch());
    }

    @Test
    public void PlayerWinsDoesNotMatchWithTieBreakScoreOfSevenToSixTest(){
        for(int i=0; i<6; i++){
            game.winPoint(game.playerOne);
            game.winPoint(game.playerTwo);
        }
        game.winPoint(game.playerOne);
        assertFalse(game.playerOne.isWinMatch());
    }

}
