package Field;

import GUI.DiceGui;
import Player.Player;

public class WalledCity extends GameSpace {

	public WalledCity(){
		super(DiceGui.getString("WALLEDCITYNAME"), DiceGui.getString("WALLEDCITYDESC"));
	}

	public void onLand(Player player){
		super.onLand(player, "WALLEDCITYONLAND");
		player.addMoney(180);
	}
	
}