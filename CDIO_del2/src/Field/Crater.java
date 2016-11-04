package Field;

import Game.Game;
import Player.Player;

public class Crater extends GameSpace {

	public Crater(Game game){
		super(game.getString("CRATERNAME"), game.getString("CRATERDESC"), game);
	}

	public void onLand(Player player){
		super.onLand(player, "CRATERONLAND");
		player.takeMoney(100);
	}
	
}