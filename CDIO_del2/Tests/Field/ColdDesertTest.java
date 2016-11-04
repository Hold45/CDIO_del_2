package Field;

import GUI.DummyGUI;
import Game.Game;
import Player.Player;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ColdDesertTest {
	public GameSpace gameSpace;
	public Player player;
	public Game game;

	@Before
	public void setup() throws Exception{
		this.game = new Game(new DummyGUI());
		this.player = new Player(this.game, "Din mor");
		this.gameSpace = new ColdDesert(this.game);
		this.gameSpace.onLand(this.player);
	}

	@After
	public void after() throws Exception{
		this.game = null;
		this.player = null;
		this.gameSpace = null;
	}

	@Test
	public void testMoneySubtraction() throws Exception {
		assertThat(this.player.getMoney()).isEqualTo(980);
	}

	@Test
	public void testMessage() throws Exception {
		assertThat(this.game.getMessage()).isEqualTo("");
	}
}