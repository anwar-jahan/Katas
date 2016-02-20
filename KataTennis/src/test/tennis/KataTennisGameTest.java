package test.tennis;

import org.junit.Before;
import org.junit.Test;

import main.tennis.KataTennisGame;
import main.tennis.Player;
import junit.framework.TestCase;

public class KataTennisGameTest extends TestCase {
	Player playerOne;
	Player playerTwo;
	KataTennisGame game;

	@Before
	public void setup() {
		playerOne=new Player("Anwar", 0);
		playerTwo=new Player("Jahan", 0);
		game=new KataTennisGame(playerOne, playerOne);
	}
	
	@Test
	public void loveScoreTest(){
		assertEquals("PlayerName :Anwar Score:Love PlayerName :Jahan Score:Love",game.getScoreResults());
	}

}
