package Player;

import GUI.DummyGUI;
import Game.Game;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;


public class PlayerTest {
	public Player player;
	public Game game;

	@Before
	public void setup() throws Exception{
		this.game = new Game(new DummyGUI());
		this.player = new Player(this.game, "Din mor");
	}

	@After
	public void after() throws Exception{
		this.game = null;
		this.player = null;
	}


	@Test
	public void testGetPosition() throws Exception {
		assertThat(this.player.getPosition()).isEqualTo(0);
	}

	@Test
	public void testMove() throws Exception {
		assertThat(this.player.move(5)).isEqualTo(5);
		assertThat(this.player.move(10)).isEqualTo(4);
	}

	@Test
	public void testGetGame() throws Exception {

	}

	@Test
	public void testGetMoney() throws Exception {

	}

	@Test
	public void testAddMoney() throws Exception {

	}

	@Test
	public void testTakeMoney() throws Exception {

	}

	@Test
	public void testSetMoney() throws Exception {

	}

	@Test
	public void testGetName() throws Exception {

	}

	@Test
	public void testTakeTurn() throws Exception {

	}
}