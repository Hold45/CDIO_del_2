package Field;

import Game.Game;
import Player.Player;

public class PalaceGates extends GameSpace {

	public PalaceGates(Game game){
		super(game.getString("PALACEGATESNAME"), game.getString("PALACEGATESDESC"), game);
	}

	public void onLand(Player player){
		super.onLand(player, "PALACEGATESONLAND");
		player.addMoney(100);
	}
	
}