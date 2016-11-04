package Field;

import GUI.DiceGui;
import Player.Player;

public class TheWerewall extends GameSpace {

	public TheWerewall(){
		super(DiceGui.getString("THEWEREWALLNAME"), DiceGui.getString("THEWEREWALLDESC"));
	}

	public void onLand(Player player){
		super.onLand(player, "THEWEREWALLONLAND");
		player.takeMoney(80);
		player.getGame().addExtraTurn(player);
	}
	
}