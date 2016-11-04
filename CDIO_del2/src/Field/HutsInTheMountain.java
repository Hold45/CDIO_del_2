package Field;

import Game.Game;
import Player.Player;

public class HutsInTheMountain extends GameSpace {

	public HutsInTheMountain(Game game){
		super(game.getString("HUTSINTHEMOUNTAINNAME"), game.getString("HUTSINTHEMOUNTAINDESC"), game);
	}

	public void onLand(Player player){
		super.onLand(player, "HUTSINTHEMOUNTAINONLAND");
		player.addMoney(60);
	}
	
}