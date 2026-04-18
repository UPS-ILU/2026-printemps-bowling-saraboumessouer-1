package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	Game game;

	@BeforeEach
	void setUp() throws Exception {
		game = new Game();
	}

	@Test
	void videTest() {
		assertEquals(0, game.score());
	}

	@Test
	void test1() {
		for (int i = 0; i < 20; i++) {
			game.roll(0);
		}
		assertEquals(0, game.score());
	}

	@Test
	void test2() {
		for (int i = 0; i < 20; i++) {
			game.roll(1);
		}
		assertEquals(20, game.score());
	}

	@Test
	void test3() {
		for (int i = 0; i < 10; i++) {
			game.roll(1);
		}
		for (int i = 0; i < 10; i++) {
			game.roll(2);
		}
		assertEquals(30, game.score());
	}

}
