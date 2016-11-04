package Field;
import Game.Game;
import Player.Player;

public class Tower extends GameSpace {

	public Tower(Game game){
		super(game.getString("TOWERNAME"), game.getString("TOWERDESC"), game);
	}

	public void onLand(Player player){
		super.onLand(player, "TOWERONLAND");
		player.addMoney(250);
	}
	
}