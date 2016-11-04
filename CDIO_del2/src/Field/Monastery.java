package Field;

import Game.Game;
import Player.Player;

public class Monastery extends GameSpace {

	public Monastery(Game game){
		super(game.getString("MONASTERYNAME"), game.getString("MONASTERYDESC"), game);
	}

	public void onLand(Player player){
		super.onLand(player, "MONASTERYONLAND");
		player.setMoney(0);
	}
	
}