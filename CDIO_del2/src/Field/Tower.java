package Field;

import GUI.DiceGui;
import Player.Player;

public class Tower extends GameSpace {

	public Tower(){
		super(DiceGui.getString("TOWERNAME"), DiceGui.getString("TOWERDESC"));
	}

	public void onLand(Player player){
		super.onLand(player, "TOWERONLAND");
		player.addMoney(250);
	}
	
}