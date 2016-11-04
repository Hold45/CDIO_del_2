package Field;
import Game.Game;
import Player.Player;

public class ColdDesert extends GameSpace {

	public ColdDesert(Game game){
		super(game.getString("COLDDESERTNAME"), game.getString("COLDDESERTDESC"), game);
	}

	public void onLand(Player player){
		super.onLand(player, "COLDDESERTONLAND");
		player.takeMoney(20);
	}
	
}