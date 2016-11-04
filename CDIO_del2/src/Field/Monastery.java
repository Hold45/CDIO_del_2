package Field;

import GUI.DiceGui;
import Player.Player;

public class Monastery extends GameSpace {

	public Monastery(){
		super(DiceGui.getString("MONASTERYNAME"), DiceGui.getString("MONASTERYDESC"));
	}

	public void onLand(Player player){
		super.onLand(player, "MONASTERYONLAND");
		player.setMoney(0);
	}
	
}