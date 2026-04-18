package tdd;

public class Game {
	int lancer = 1;
	int score = 0;

	public void roll(int nbQuilles) {
		score += nbQuilles;
		lancer++;
	}

	public int score() {
		return score;
	}

}
