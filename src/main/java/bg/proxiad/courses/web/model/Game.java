package bg.proxiad.courses.web.model;

public class Game {
	private int leftPlayerIndex;
	private int servingPlayerIndex;
	private int[] score;

	public int getLeftPlayerIndex() {
		return leftPlayerIndex;
	}

	public void setLeftPlayerIndex(int leftPlayerIndex) {
		this.leftPlayerIndex = leftPlayerIndex;
	}

	public int getServingPlayerIndex() {
		return servingPlayerIndex;
	}

	public void setServingPlayerIndex(int servingPlayerIndex) {
		this.servingPlayerIndex = servingPlayerIndex;
	}

	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}

	public int getRightPlayerIndex() {
		return leftPlayerIndex == 0 ? 1 : 0;
	}
}
