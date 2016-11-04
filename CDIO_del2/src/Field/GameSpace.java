package Field;

import Game.Game;
import Player.Player;

public abstract class GameSpace{


	GameSpace(String title, String description, Game game){
		game.getGUI().addField(title,description);

	}
	public void onLand(Player player){
	
	}
	public void onLand(Player player, String string){
		player.getGame().addMessage(player.getGame().getString(string, player));
	}

}

