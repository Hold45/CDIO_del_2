package Field;

import GUI.DiceGui;
import Player.Player;

public class Goldmine extends GameSpace {

	public Goldmine(){
		super(DiceGui.getString("GOLDMINENAME"), DiceGui.getString("GOLDMINEDESC"));
	}

	public void onLand(Player player){
		super.onLand(player, "GOLDMINEONLAND");
		player.addMoney(650);
	}
	
}