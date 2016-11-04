package Field;

import GUI.DiceGui;
import Player.Player;

public class PalaceGates extends GameSpace {

	public PalaceGates(){
		super(DiceGui.getString("PALACEGATESNAME"), DiceGui.getString("PALACEGATESDESC"));
	}

	public void onLand(Player player){
		super.onLand(player, "PALACEGATESONLAND");
		player.addMoney(100);
	}
	
}