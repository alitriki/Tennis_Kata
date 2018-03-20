# TennisKata
Simple tennis kata implemented in **java** using **Test Driven Development** 

In this project I created :  
-A [Player](/src/main/Player.java) class that contains all the different scores  
-A [TennisMatch](/src/main/TennisMatch.java) class that contains all the logic of the point system   
-A [TennisGameStartTest](/src/test/TennisGameStartTest.java) class that tests the different methods of TennisMatch class at the start of each game  
-A [TennisMatchStartTest](/src/test/TennisMatchStartTest.java) class that tests the different methods of TennisMatch Class at the start of each set  
-A [TennisMatchDeuceTest](/src/test/TennisMatchDeuceTest.java) class that tests the different methods of TennisMatch Class if the DEUCE rule is activated  
-A [TennisMatchTieBreakTest](/src/test/TennisMatchTieBreakTest.java) class that tests the different methods of TennisMatch Class if the Tie-Break rule is activated  

**PS :** the Player class is not meant to be used directly as it does not contain the logic of the point system.  
In order to simulate a match, you will need to create an instance of [TennisMatch](/src/main/TennisMatch.java) and use the winPoint([Player](/src/main/Player.java)) method to give points to players. the algorythm will distribute points, games and decide who won the match.  
In order to check the current score of a player, please use methods getGameScore() , getSetScore() and gettieBreakScore() of the class [Player](/src/main/Player.java).  
To check if the player won the game or set use methods isWinGame() and isWinSet() of the class [Player](/src/main/Player.java).  
To check if the DEUCE rule is activated use isDeuce() method of the class [TennisMatch](/src/main/TennisMatch.java).  
To check if the Tie-Break rule is activated use isTieBreak() method of the class [TennisMatch](/src/main/TennisMatch.java).  
