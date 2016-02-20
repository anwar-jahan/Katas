package main.tennis;

public class KataTennisGame {

	Player playerOne;
	Player playerTwo;

	public KataTennisGame(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public String getScoreResults() {

		int scoreDifferenc = higerScorePlayer().getScore()
				- lowestScorePlayer().getScore();

		if (higerScorePlayer().getScore() >= 4 && scoreDifferenc >= 2) {
			return higerScorePlayer().getName() + " : Won";
		} else if (playerTwo.getScore() == playerOne.getScore()
				&& higerScorePlayer().getScore() >= 3) {
			return "Deuce";
		} else if (higerScorePlayer().getScore() >= 4 && scoreDifferenc == 1) {
			return "Advantage :" + higerScorePlayer().getName();
			
		} else {
			return playerOne.getName() + " Score:"
					+ scoreTransfer(playerOne.getScore()) + ", "
					+ playerTwo.getName() + " Score:"
					+ scoreTransfer(playerTwo.getScore());
		}
	}

	public Player higerScorePlayer() {
		return (playerOne.getScore() > playerTwo.getScore()) ? playerOne
				: playerTwo;
	}

	public Player lowestScorePlayer() {
		return (playerOne.getScore() > playerTwo.getScore()) ? playerTwo
				: playerOne;
	}

	public String scoreTransfer(int score) {
		switch (score) {
		case 0:
			return "Love";
		case 1:
			return "Fifteen";
		case 2:
			return "Thirty";
		case 3:
			return "Forty";

		default:
			return "Unknown";
		}

	}
}
