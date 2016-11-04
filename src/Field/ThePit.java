package Field;

import Game.Game;
import Player.Player;

public class ThePit extends GameSpace {

	public ThePit(Game game){
		super(game.getString("THEPITNAME"), game.getString("THEPITDESC"), game);
	}

	public void onLand(Player player){
		super.onLand(player, "THEPITONLAND");
		player.takeMoney(50);
	}
	
}