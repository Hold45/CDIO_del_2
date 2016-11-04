package Field;

import GUI.DiceGui;
import Player.Player;

public class Crater extends GameSpace {

	public Crater(){
		super(DiceGui.getString("CRATERNAME"), DiceGui.getString("CRATERDESC"));
	}

	public void onLand(Player player){
		super.onLand(player, "CRATERONLAND");
		player.takeMoney(100);
	}
	
}