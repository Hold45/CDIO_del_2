package Game;

import GUI.DummyGUI;
import Player.Player;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class GameTest {
	public Player player;
	public Player player2;
	public Game game;

	@Before
	public void setup() throws Exception{
		this.game = new Game(new DummyGUI());
		this.player = new Player(this.game, "Din mor");
		this.player2 = new Player(this.game, "Din far");
		this.game.setPlayers(new Player[]{this.player, this.player2});
	}

	@After
	public void after() throws Exception{
		this.game = null;
		this.player2 = null;
		this.player = null;
	}

	@Test
	public void testGetPlayers() throws Exception {
		assertThat(this.game.getPlayers()).isEqualTo(new Player[]{this.player, this.player2});
	}

	@Test
	public void testStart() throws Exception {
		this.game.start();
		assertThat(this.game.getPlaying()).isFalse();
	}

}