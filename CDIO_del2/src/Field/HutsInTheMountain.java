package Field;

import GUI.DiceGui;
import Player.Player;

public class HutsInTheMountain extends GameSpace {

	public HutsInTheMountain(){
		super(DiceGui.getString("HUTSINTHEMOUNTAINNAME"), DiceGui.getString("HUTSINTHEMOUNTAINDESC"));
	}

	public void onLand(Player player){
		super.onLand(player, "HUTSINTHEMOUNTAINONLAND");
		player.addMoney(60);
	}
	
}