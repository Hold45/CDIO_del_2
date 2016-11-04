package Field;

import Game.Game;
import Player.Player;

public class WalledCity extends GameSpace {

	public WalledCity(Game game){
		super(game.getString("WALLEDCITYNAME"), game.getString("WALLEDCITYDESC"), game);
	}

	public void onLand(Player player){
		super.onLand(player, "WALLEDCITYONLAND");
		player.addMoney(180);
	}
	
}