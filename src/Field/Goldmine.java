package Field;

import Game.Game;
import Player.Player;

public class Goldmine extends GameSpace {

	public Goldmine(Game game){
		super(game.getString("GOLDMINENAME"), game.getString("GOLDMINEDESC"), game);
	}

	public void onLand(Player player){
		super.onLand(player, "GOLDMINEONLAND");
		player.addMoney(650);
	}
	
}