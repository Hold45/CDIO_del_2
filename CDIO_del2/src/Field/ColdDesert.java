package Field;

import GUI.DiceGui;
import Player.Player;

public class ColdDesert extends GameSpace {

	public ColdDesert(){
		super(DiceGui.getString("COLDDESERTNAME"), DiceGui.getString("COLDDESERTDESC"));
	}

	public void onLand(Player player){
		super.onLand(player, "COLDDESERTONLAND");
		player.takeMoney(20);
	}
	
}