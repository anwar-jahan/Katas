package main.tennis;

public class KataTennisGame {

	Player playerOne;
	Player playerTwo;

	public KataTennisGame(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public String getScoreResults() {

		if (playerOne.getScore() >= 3 && playerTwo.getScore() >= 3) {
			if((playerTwo.getScore()-playerOne.getScore())>=2){
				return advancePlayer().getName()+" : Win and Score:"+scoreTransfer(advancePlayer().getScore());
			}
			else if(playerTwo.getScore()==playerOne.getScore()){
				return "Deuce";
			}
			else{
				return "Advantage :"+advancePlayer().getName()+" And Score: "+scoreTransfer(advancePlayer().getScore());
			}
		} else {
			return "PlayerName :"+playerOne.getName()+" Score:"+scoreTransfer(playerOne.getScore())+" PlayerName :"+playerTwo.getName()+" Score:"+scoreTransfer(playerTwo.getScore()) ;
		}
	}

	public Player advancePlayer() {
		return (playerOne.getScore() > playerTwo.getScore()) ? playerOne
				: playerTwo;
	}
	
	public String scoreTransfer(int score) throws IllegalArgumentException{
		switch(score){
		case 0: return "Love";
		case 1: return "Fifteen";
		case 2: return "Thirty";
		case 3: return "Forty";
		}
		return "Illegal Score "+score;
		
	}
	public static void main(String[] args){
		Player playerOne=new Player("Anwar", 0);
		Player playerTwo=new Player("Jahan", 0);
		KataTennisGame game=new KataTennisGame(playerOne, playerTwo);
		System.out.println(game.getScoreResults());
	}

}
