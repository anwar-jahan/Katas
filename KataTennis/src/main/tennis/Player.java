package main.tennis;

public class Player {
	private String name;
	private int score;
	
	public Player(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public void playerScoreIncrement(){
		score++;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + "]";
	}
	
	
	
	
}
