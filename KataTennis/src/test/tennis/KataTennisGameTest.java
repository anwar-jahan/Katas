package test.tennis;

import static org.junit.Assert.*;

import org.junit.Test;

import main.tennis.KataTennisGame;
import main.tennis.Player;

public class KataTennisGameTest {
	Player playerOne;
	Player playerTwo;
	KataTennisGame game;

	public KataTennisGameTest() {
		playerOne = new Player("Anwar", 0);
		playerTwo = new Player("Jahan", 0);
		game = new KataTennisGame(playerOne, playerTwo);
	}

	@Test
	public void loveScoreTest() {
		assertEquals("Anwar Score:Love, Jahan Score:Love",
				game.getScoreResults());
	}

	@Test
	public void fifteenScoreTest() {
		game = new KataTennisGame(playerOne, playerTwo);
		scoreChange(1,2);
		assertEquals("Anwar Score:Fifteen, Jahan Score:Thirty", game.getScoreResults());
	}
	@Test
	public void thirtyScoreTest() {
		game = new KataTennisGame(playerOne, playerTwo);
		scoreChange(2,1);
		assertEquals("Anwar Score:Thirty, Jahan Score:Fifteen", game.getScoreResults());
	}
    @Test
	public void fortyScoreTest() {
    	game = new KataTennisGame(playerOne, playerTwo);
		scoreChange(3,1);
		assertEquals("Anwar Score:Forty, Jahan Score:Fifteen", game.getScoreResults());
	}

	@Test
	public void deuceScoreTest() {
		game = new KataTennisGame(playerOne, playerTwo);
		scoreChange(4, 4);
		assertEquals("Deuce", game.getScoreResults());
	}

	@Test
	public void winGame() {
		game = new KataTennisGame(playerOne, playerTwo);
		scoreChange(4, 2);
		assertEquals("Anwar : Won", game.getScoreResults());
	}
	@Test
	public void advatagePlayer(){
		game = new KataTennisGame(playerOne, playerTwo);
		scoreChange(4, 5);
		assertEquals("Advantage :Jahan", game.getScoreResults());
	}

	public void scoreChange(int playerScoreOne, int playerScoreTwo) {

		for (int i = 1; i <= playerScoreOne; i++) {
			playerOne.setScore(i);
		}

		for (int i = 1; i <= playerScoreTwo; i++) {
			playerTwo.setScore(i);
		}

	}

}
