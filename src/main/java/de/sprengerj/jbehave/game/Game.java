package de.sprengerj.jbehave.game;

public class Game {

	private int [] scores = new int [21];
	private int current = 0;

	public void roll(int i) {
		scores[current ++] = i;
		
	}

	public int score() {
		int score = 0;
		int roll = 0;
		for (int i = 0; i < 10; i++) {
			if (10 == scores[roll] + scores[roll+1]) {
				score += 10 + scores[roll+2];
			} else {
				score += scores[roll];
			}
		}
		return score;
	}

}
