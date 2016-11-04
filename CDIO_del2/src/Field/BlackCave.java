package Field;
import Game.Game;
import Player.Player;

public class BlackCave extends GameSpace {

	public BlackCave(Game game){
		super(game.getString("BLACKCAVENAME"), game.getString("BLACKCAVEDESC"), game);
	}

	public void onLand(Player player){
		super.onLand(player, "BLACKCAVEONLAND");
		player.takeMoney(70);
	}
	
}