package Field;

import Game.Game;
import Player.Player;

public class TheWerewall extends GameSpace {

	public TheWerewall(Game game){
		super(game.getString("THEWEREWALLNAME"), game.getString("THEWEREWALLDESC"), game);
	}

	public void onLand(Player player){
		super.onLand(player, "THEWEREWALLONLAND");
		player.takeMoney(80);
		player.getGame().addExtraTurn(player);
	}
	
}